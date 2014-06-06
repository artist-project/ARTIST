/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.actions;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;
import eu.artist.premigration.tft.tft.model.query.ComponentModelQuery;
import eu.artist.premigration.tft.tft.report.ReportGenerator;
import eu.artist.premigration.tft.tft.views.InventoryView;

/**
 * Action delegate class keeping track of selected UML and DI files and passing them to Inventory View to be processed 
 * 
 * @author Burak Karaboga
 *
 */
public class ShowInInventoryViewDelegate implements IObjectActionDelegate {

	private IWorkbenchWindow window;
	private IFile selectedFile;

	public ShowInInventoryViewDelegate() {
	}

	/**
	 * Opens the Inventory View
	 */
	@Override
	public void run(IAction action) {

		try {
			if (MigrationGoalsContainer.INSTANCE.getMigrationGoals() == null){
				JOptionPane.showMessageDialog( null, "Please load the Migration Goals before opening the Inventory View","Warning",JOptionPane.OK_CANCEL_OPTION);
			}
			else {
				//Load the model for the selected file and open the inventory view. 
				ComponentModelQuery.INSTANCE.loadModel(selectedFile);
				if (window.getActivePage().findView(InventoryView.ID) != null) {
					window.getActivePage().hideView(window.getActivePage().findView(InventoryView.ID));
				}
				window.getActivePage().showView(InventoryView.ID);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
			//TODO: HANDLE THIS
		}
	}

	/**
	 * Finds and returns the uml model of a Papyrus diagram file
	 * 
	 * @param diFile
	 * @return An {@link IFile} instance of the uml model
	 */
	private IFile getUMLModelOfDI(IFile diFile){
		String path = diFile.getProject().getName().concat("/").concat(diFile.getProjectRelativePath().toString());
		path = path.substring(0, path.lastIndexOf('.')).concat(".uml");
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot().getFile(new Path(path));
	}

	/**
	 *	Sets the selectedFile variable upon file selection 
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object obj = ssel.getFirstElement();
			if (obj != null) {
				IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);
				if (file == null) {
					if (obj instanceof IAdaptable) {
						file = (IFile) ((IAdaptable) obj).getAdapter(IFile.class);
					}
				}
				if (file != null) {
					String fileExtension = file.getFileExtension();
					//If file is of type Papyrus diagram, call getUMLModelOfDI method to set the selectedFile variable
					if ("di".equals(fileExtension)) {
						selectedFile = getUMLModelOfDI(file);
					}
					else {
						selectedFile = file;
					}
				}
				//If the file is null, it might be of type PapyrusFile, then the uml file is found by passing mainFile to the getUMLModelOfDI method
				else {
					IPapyrusFile papyrusFile = (IPapyrusFile) Platform.getAdapterManager().getAdapter(obj, IPapyrusFile.class);
					if (papyrusFile != null) {
						selectedFile = getUMLModelOfDI(papyrusFile.getMainFile());
					}
				}
				
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(selectedFile.getProject().getName());
				ReportGenerator.INSTANCE.setProject(project);
			}
		}
	}


	/**
	 * Sets the window field when the view is initialized
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		window = targetPart.getSite().getWorkbenchWindow();
	}

}
