/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.ArtefactUploadDialog;
import eu.artist.reusevol.repo.eclipse.client.dialogs.UploadTargetSelectionDialog;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;
import eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ArtefactUploadHandler extends AbstractHandler {
	LocalRepositoryModel model;

	public ArtefactUploadHandler() {
		this.model = LocalRepositoryModel.getInstance();
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		RepoProjectView view = getRepoProjectView(event);

		try {
			// Let user select the target package and determine the project
			RepoPackage selectedPackage = getUserSelectedPackage(view);
			RepoProject selectedProject = model
					.getProjectfromSelectedPackage(selectedPackage);

			// Get the selected file from PackageExplorer
			IFile selectedFile = getSelectedFileFromPackageExplorer();

			// Create the artefact to upload from user input
			RepoArtefact artefactToUpload = createArtefactFromUserInput(
					selectedProject, selectedPackage, selectedFile, model);

			// Perform upload
			uploadArtefact(selectedProject, artefactToUpload, selectedFile);

			// Update internal model
			//selectedPackage.getArtefacts().add(artefactToUpload);
			//model.updateCategoriesForNewArtefact(artefactToUpload);

			// Update the view
			view.getViewer().refresh();
		} catch (RepoClientException ex) {
			System.out.println(ex.getMessage());
		}

		return null;
	}

	private RepoProjectView getRepoProjectView(ExecutionEvent event)
			throws ExecutionException {
		RepoProjectView view = null;
		try {
			view = (RepoProjectView) HandlerUtil
					.getActiveWorkbenchWindow(event)
					.getActivePage()
					.showView(
							"eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return view;
	}

	private RepoPackage getUserSelectedPackage(RepoProjectView repoBrowserView)
			throws RepoClientException {
		// TODO try to preselect the current file
		UploadTargetSelectionDialog selectionDialog = createPackageSelectionDialog(repoBrowserView);
		int pressedButtonId = selectionDialog.open();

		if (pressedButtonId == Window.CANCEL)
			throw new RepoClientException("Upload canceled.");

		// From here on we can assume that "Add Artefact" was selected and the
		// result is of type RepoPackage. Check it to be sure.
		if (pressedButtonId != Window.OK) {
			throw new RepoClientException("Unexpected return code: "
					+ pressedButtonId);
		}

		Object[] results = selectionDialog.getResult();
		if ((results == null) || (results.length != 1)
				|| !(results[0] instanceof RepoPackage)) {
			throw new RepoClientException("Unexpected result: " + results);
		}

		return ((RepoPackage) results[0]);
	}

	private UploadTargetSelectionDialog createPackageSelectionDialog(
			RepoProjectView repoBrowserView) {
		UploadTargetSelectionDialog selectionDialog = new UploadTargetSelectionDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				new TreeLabelProvider(), repoBrowserView
						.getrepoContentProvider(), repoBrowserView.viewer);
		selectionDialog.setTitle("Upload artefact");
		selectionDialog.setMessage("Select the target package:");
		selectionDialog.setInput(repoBrowserView.viewer.getInput());
		selectionDialog.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer view, Object parentElement,
					Object element) {
				return (element instanceof RepoServer)
						|| (element instanceof RepoProject)
						|| (element instanceof RepoPackage);
			}
		});

		return selectionDialog;
	}

	private IFile getSelectedFileFromPackageExplorer()
			throws RepoClientException {
		ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getSelectionService();
		IStructuredSelection selection = (IStructuredSelection) service.getSelection(
						"org.eclipse.jdt.ui.PackageExplorer");
		
		Object selectedObject = selection.getFirstElement();		
		if (selectedObject == null)
			throw new RepoClientException("Selected object is null.");
		
		IResource resource = (IResource)Platform.getAdapterManager().getAdapter(selectedObject, IResource.class);

		if (!(resource instanceof IFile)) 
			throw new RepoClientException("Selected object is not a file.");
		IFile file = (IFile) resource;
		
		return file;
	}

	private RepoArtefact createArtefactFromUserInput(
			RepoProject selectedProject, RepoPackage selectedPackage,
			IFile selectedFile, LocalRepositoryModel model)
			throws RepoClientException {

		// fetching artifactID from file name which is filename from IFILE
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		ArtefactUploadDialog uploadDialog = new ArtefactUploadDialog(shell,
				selectedPackage.getName(), selectedProject.getName(),
				selectedFile.getName());

		if (uploadDialog.open() == Window.CANCEL)
			throw new RepoClientException("Upload canceled.");

		// Prepare artefact
		ArtefactId artefactId = ArtefactId.of(selectedPackage.getName(),
				uploadDialog.getArtefactName());
		String artefactLabel = uploadDialog.getArtefactLabel();
		String artefactDescription = uploadDialog.getArtefactDescription();

		RepoArtefact artefactToUpload = new RepoArtefact(artefactId.get(), artefactLabel, artefactDescription);

		List<RepoCategory> repoCategoryList = uploadDialog.getCategoryList();
		if (!repoCategoryList.isEmpty()) {
			List<String> categoryIds = new ArrayList<String>();
			for (RepoCategory cat : repoCategoryList) {
				categoryIds.add(cat.getId());
			}
			artefactToUpload.setCategories(categoryIds);
		}
		return artefactToUpload;
	}

	private void uploadArtefact(RepoProject selectedProject,
			RepoArtefact artefactToUpload, IFile selectedFile)
			throws RepoClientException {

		RepositoryClientApi api = RepositoryClientApi.getInstance(); 

		if (!api.exists(artefactToUpload)) {
			try {
				api.createArtefact(selectedProject, artefactToUpload);
				api.setArtefactContent(artefactToUpload, selectedFile);
			} catch(Exception ex) {
				throw new RepoClientException("Error uploading artefact_" + artefactToUpload, ex);
			}
		} else {
			String message = "The artefact is already present: Do you want to update it?";
			String title = "Yes to update or No to cancel";

			int reply = JOptionPane.showConfirmDialog(null, message, title,
					JOptionPane.YES_NO_OPTION);
			if (reply == JOptionPane.YES_OPTION) {
				try {
					api.updateArtefact(artefactToUpload);
					api.setArtefactContent(artefactToUpload, selectedFile);
				} catch(Exception ex) {
					throw new RepoClientException("Error uploading artefact_" + artefactToUpload, ex);
				}
			} else if (reply == JOptionPane.NO_OPTION) {
				throw new RepoClientException("Upload canceled.");
			}
		}
	}
}
