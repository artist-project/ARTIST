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

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

public class RemoveTagfromArtefact extends Action {

	private StructuredViewer viewer;
    private LocalRepositoryModel model ;
	public RemoveTagfromArtefact(StructuredViewer viewer) {
		super("Remove Tag");
		this.viewer = viewer;
		this.model = LocalRepositoryModel.getInstance();
		setToolTipText("Remove Tag");
	}

	@Override
	public void run() {

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		Object[] selectedAretafect = getSelectedArtefacts(); 
		ElementListSelectionDialog selectionDialogs = 
				  new ElementListSelectionDialog(shell, new TreeLabelProvider());
		RepoArtefact artefact =  null;
		if (selectedAretafect[0] instanceof RepoArtefact)
		{    
			artefact = (RepoArtefact)selectedAretafect[0] ;
		
		}else if(selectedAretafect[0] instanceof TableModel)
		{
			artefact = ((TableModel)selectedAretafect[0]).getArtefact() ;
			
		}
		else
		{
			try {
				throw new RepoClientException("Unknown element type: "
						+ selectedAretafect[0].getClass().getName());
			} catch (RepoClientException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 return;
		 
		}
		
		selectionDialogs.setElements((artefact).getTags().toArray());
		selectionDialogs.setTitle("Remove selected tags");
		selectionDialogs.open();
		Object[] tagList = selectionDialogs.getResult();
		
		if ((tagList != null) && (tagList.length > 0)) {
			for (Object tag : tagList) {
				if (tag instanceof String) {
		
							updateTagMap((String) tag,(RepoArtefact)artefact);
							List<String> tempTags =  ((RepoArtefact) artefact).getTags();
							if(tempTags.contains(tag))
							{ 
							 ((RepoArtefact) artefact).getTags().remove((String) tag);
						      updateArtefact((RepoArtefact)artefact); // update on server side
							}
							
				}
			}
		}
	
		
	}

	private void updateTagMap(String tag, RepoArtefact artefact) {
	
		model.removeArtefactToTagMap(tag,artefact);	
		System.out.print("");
	}

	
	private Object[] getSelectedArtefacts() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).toArray();
	}
	
	
	
	private void updateArtefact(RepoArtefact toUpdate) {
		System.out.println("Remove Tag: " + toUpdate);
		try {
			RepositoryClientApi.getInstance().updateArtefact(toUpdate);;
			//viewer.remove(toUpdate);
			
			//viewer.refresh();
		} catch (Exception ex) {
			System.out.println("Error Remove Tag '" + toUpdate.getId()
					+ "': " + ex.getMessage());
		}
	}
	
}
