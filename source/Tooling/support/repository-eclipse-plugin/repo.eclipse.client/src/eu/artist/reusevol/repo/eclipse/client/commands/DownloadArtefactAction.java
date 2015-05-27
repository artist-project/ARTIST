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
package eu.artist.reusevol.repo.eclipse.client.commands;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import eu.artist.reusevol.repo.common.model.ContentInfo;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;

public class DownloadArtefactAction extends Action {

	private StructuredViewer viewer;

	public DownloadArtefactAction(StructuredViewer viewer) {
		this.viewer = viewer;
		setText("Download");
		setToolTipText("Download Artefact");
	}

	@Override
	public void run() {

		ElementTreeSelectionDialog dialog = setupSelectionDialog();

		// Cancel pressed
		if (dialog.open() != Window.OK)
			return;

		Object[] results = dialog.getResult();
		if ((results == null) || (results.length != 1)
				|| !(results[0] instanceof IResource))
			return;

		try {
			IResource targetResource = ((IResource) results[0]);
			IPath targetFolderPath = getFolderPath(targetResource);
			RepoArtefact toDownload = getSelectedArtefactFromTreeView();

//			RepoArtefact downloaded = RepositoryClientApi.getInstance()
//					.getArtefact(toDownload);

			IFile targetFile = getTargetFile(targetFolderPath, toDownload);

			if (!targetFile.exists()) {
				downloadArtefactToFile(toDownload, targetFile);
			} else {
				if (userConfirmsToOverwriteFile()) {
					downloadArtefactToFile(toDownload, targetFile);
				}
			}
		} catch (RepoClientException e) {
			e.printStackTrace();
		}
	}

	private IFile getTargetFile(IPath targetFolderPath, RepoArtefact downloaded)
			throws RepoClientException {
		String artefactFileName = getArtefactFileName(downloaded);
		IPath targetFilePath = targetFolderPath.append(artefactFileName);
		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(targetFilePath);
		return targetFile;
	}

	private String getArtefactFileName(RepoArtefact artefact)
			throws RepoClientException {
		
		System.out.println("Artefact to download: " + artefact.toString());
		
		ContentInfo contentInfo = artefact.getContentInfo();
		
		String artefactFileName = null;
		if (contentInfo != null) {
			artefactFileName = contentInfo.getFilename();
		}

		if (artefactFileName == null) {
			artefactFileName = artefact.getName();
		}

		if (artefactFileName == null) {
			throw new RepoClientException("Content of artefact " + artefact
					+ " not a file or null.");
		}

		return artefactFileName;
	}

	private IPath getFolderPath(IResource targetResource) {
		IPath targetFolderPath = targetResource.getFullPath();
		if (targetResource instanceof IFile) {
			targetFolderPath = targetFolderPath.removeLastSegments(1);
		}
		return targetFolderPath;
	}

	private void downloadArtefactToFile(RepoArtefact artefact,
			IFile localTargetFile) throws RepoClientException {

		InputStream source = null;
		try {
			source = RepositoryClientApi.getInstance().getArtefactContent(artefact);
			if (localTargetFile.exists()) {
				localTargetFile.setContents(source, false, true, null);
			} else {
				localTargetFile.create(source, IResource.NONE, null);
			}
		} catch (CoreException e) {
			throw new RepoClientException(
					"Exception while downloading artefact " + artefact
							+ " to file " + localTargetFile, e);
		} finally {
			if (source != null) {
				try {
					source.close();
				} catch (IOException e) {
					throw new RepoClientException(
							"Exception while downloading artefact " + artefact
									+ " to file " + localTargetFile, e);
				}
			}
		}
	}

	private RepoArtefact getSelectedArtefactFromTreeView()
			throws RepoClientException {
		ISelection selection = viewer.getSelection();
		Object selectedObject = ((IStructuredSelection) selection)
				.getFirstElement();

		if (selectedObject instanceof RepoArtefact) {
			// Selection from the tree view.
			return ((RepoArtefact) selectedObject);
		} else if (selectedObject instanceof TableModel) {
			return ((TableModel) selectedObject).getArtefact();
		}
		throw new RepoClientException("Unknown element type: "
				+ selectedObject.getClass().getName());
	}

	private ElementTreeSelectionDialog setupSelectionDialog() {
		// TODO: Dialog should only show folders and no files
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				new WorkbenchLabelProvider(),
				new BaseWorkbenchContentProvider());
		dialog.setTitle("Destination Selection");
		dialog.setMessage("Select the destination foder:");
		dialog.setAllowMultiple(false);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		return dialog;
	}

	private boolean userConfirmsToOverwriteFile() {
		return MessageDialog
				.openConfirm(viewer.getControl().getShell(),
						"Confirm to overwrite existing local file.",
						"The selected file already exists. Do you want to overwrite its contents?");
	}

}
