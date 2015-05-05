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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import eu.artist.premigration.tft.tft.views.MigrationGoalsView;

/**
 * Action delegate class keeping track of selected XML files and passing them to the Migration Goals View to be processed
 * 
 * @author Burak Karaboga
 *
 */
public class ShowInMigrationGoalsViewDelegate implements IObjectActionDelegate {

	
	private IWorkbenchWindow window;
	private IFile selectedFile;

	public ShowInMigrationGoalsViewDelegate() {
	}

	/**
	 * Load the model for the selected file and open the Migration Goals View. 
	 */
	@Override
	public void run(IAction action) {
		
		try {
			MigrationGoalsView.xmlFile = selectedFile;
			
			//Refresh the view with the new selected file if the view is already loaded with another file
			if (window.getActivePage().findView(MigrationGoalsView.ID) != null) {
				window.getActivePage().hideView(window.getActivePage().findView(MigrationGoalsView.ID));
			}
			window.getActivePage().showView(MigrationGoalsView.ID);
			
		} catch (PartInitException e) {
			e.printStackTrace();
			//TODO: HANDLE THIS
		}
	}

	/**
	 * Sets the selectedFile variable upon file selection
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
		        	selectedFile = file;
		        }
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
