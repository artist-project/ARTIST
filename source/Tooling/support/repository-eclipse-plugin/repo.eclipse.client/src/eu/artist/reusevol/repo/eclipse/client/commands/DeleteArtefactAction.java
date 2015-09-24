/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/


package eu.artist.reusevol.repo.eclipse.client.commands;



import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.ui.PlatformUI;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;

public class DeleteArtefactAction extends Action {

	//private TreeViewer viewer;
	private StructuredViewer viewer;

	public DeleteArtefactAction(StructuredViewer viewer) {

		super("Delete");
		this.viewer = viewer;
		setToolTipText("Delete");
	}

	@Override
	public void run() {
		Object selections[] = getSelectedElements();
		
		
		if ((selections != null) && (selections.length > 0)) {
			
			if (!(selections[0] instanceof RepoArtefact) && !(selections[0] instanceof TableModel))
				return;
			
			if( ( (selections.length == 1) && userConfirmsToDeleteArtefact()) 
					|| userConfirmsToDeleteAllArtefacts())
			{	
				
				  for (Object selection : selections) {
					if (selection instanceof RepoArtefact) {
						 deleteArtefact((RepoArtefact) selection);
					} else if (selection instanceof TableModel) {
						deleteArtefact( ((TableModel)selection).getArtefact());
					}
					
				  }  // end of loop	
				     
			}
		
		}
	}

	private Object[] getSelectedElements() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).toArray();
	}
	
	private void deleteArtefact(RepoArtefact toDelete) {
		System.out.println("Deletion of artefact: " + toDelete);
		try {
			RepositoryClientApi.getInstance().deleteArtefact(toDelete);
		//	viewer.remove(toDelete);
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().
			findView("eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView");
			
			viewer.refresh();
		} catch (Exception ex) {
			System.out.println("Error deleting artefact '" + toDelete.getId()
					+ "': " + ex.getMessage());
		}
	}
	
	private boolean userConfirmsToDeleteArtefact() {
		return MessageDialog
				.openConfirm(
						viewer.getControl().getShell(),
						"Confirm deletion of selected artifact",
						"Artefact will be deleted from server.Do you want to continue ?");
	}
  
	private boolean userConfirmsToDeleteAllArtefacts() {
		return MessageDialog
				.openConfirm(
						viewer.getControl().getShell(),
						"Confirm deletion of all selected artifacts",
						"Artefacts will be deleted from server.Do you want to continue ?");
	}
}
