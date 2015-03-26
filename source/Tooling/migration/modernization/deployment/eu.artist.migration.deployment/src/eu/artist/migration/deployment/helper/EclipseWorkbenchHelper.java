/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
package eu.artist.migration.deployment.helper;

import java.io.File;
import java.net.URI;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

public class EclipseWorkbenchHelper {

	/**
	 * Helper method to obtain the selected input class model from the event triggered by the workbench
	 * @param event Event triggered by the action managed by this handler.
	 * @return The selected class model.
	 */
	static public IFile getSelectedFile(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IFile result = null;
		IWorkbenchPage activePage = window.getActivePage();
		ISelection selection = activePage.getSelection();
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				if (selection instanceof ITreeSelection) {
					TreeSelection treeSelection = (TreeSelection) selection;
					TreePath[] treePaths = treeSelection.getPaths();
					if (treePaths.length == 0)
						return null;
					Object lastSegmentObj = treePaths[0].getLastSegment();
					if (lastSegmentObj instanceof IAdaptable) {
						IFile file = (IFile) ((IAdaptable) lastSegmentObj)
								.getAdapter(IFile.class);
						if (file != null) {
							result = file;
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Helper method to obtain the project that owns the selected input class model from the event triggered by the workbench
	 * @param event Event triggered by the action managed by this handler.
	 * @return The project that owns the selected class model.
	 */
	static public IProject getTargetProject(ExecutionEvent event) {
		IProject result = null;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage activePage = window.getActivePage();
		ISelection selection = activePage.getSelection();
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				if (selection instanceof ITreeSelection) {
					TreeSelection treeSelection = (TreeSelection) selection;
					TreePath[] treePaths = treeSelection.getPaths();
					Object firstSegmentObj = treePaths[0].getFirstSegment();
					if (firstSegmentObj instanceof IAdaptable) {
						result = (IProject) ((IAdaptable) firstSegmentObj)
								.getAdapter(IProject.class);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Helper method that request to open a given model in default associated editors 
	 * @param file Model to be opened.
	 */
	static public void openFileInEditor (URI file){
		File fileToOpen = new File (file);
		if (fileToOpen.exists() && fileToOpen.isFile()) {
		    IFileStore fileStore = EFS.getLocalFileSystem().getStore(file);
		    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		 
		    try {
		        IDE.openEditorOnFileStore( page, fileStore );
		    } catch ( PartInitException e ) {
		        e.printStackTrace();
		    }
		} else {
		    //File does not exist: ignore request to open it in Editor
		}
		
	}

	/**
	 * Helper method that request to open generated models in default associated editors 
	 * @param files List of generated models to be opened.
	 */
	static public void openFilesInEditor(final List<URI> files) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				for (URI file: files)
					EclipseWorkbenchHelper.openFileInEditor(file);
			}
		});
	}
	
	/**
	 * Helper method that request to refresh the project where generated models have been placed
	 * @param targetProject The project to refresh.
	 * @throws CoreException
	 */
	static public void refreshTargetProject(IProject targetProject)
			throws CoreException {
		targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	/**
	 * This methods shows a dialog informing the user of the result of the M2MT process.
	 * @param status Status of the generation
	 * @param targetProject Project where generated models have been placed within.
	 */
	static public void showDialog(final Shell shell, final String title, final String message, 
			final String errorMsg, final IStatus status, final IProject targetProject) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (status.isOK())
					MessageDialog.openInformation(
						shell, title, message + targetProject.getName());
				else
					MessageDialog.openError(
						shell, title, errorMsg);
			}
		});
	}
	
	/**
	 * This methods shows a dialog informing the user of the result of the M2MT process.
	 * @param status Status of the generation
	 * 
	 */
	static public void showDialog(final Shell shell, final String title, final String message, 
			final String errorMsg, final IStatus status) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (status.isOK())
					MessageDialog.openInformation(
						shell, title, message);
				else
					MessageDialog.openError(
						shell, title, errorMsg);
			}
		});
	}
	
	static public IProject getWorkspaceProjectByName (String name){
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		
		return workspaceRoot.getProject(name);
	}
	
	static public IWorkspaceRoot getWorkspaceRoot (){
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot();
	}
}
