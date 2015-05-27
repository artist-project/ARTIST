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
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.ProjectViewSelectionDialog;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.provider.StructureTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

public class AddArtefactToTagAction extends Action {

	private TreeViewer viewer;
    private LocalRepositoryModel model ;
	public AddArtefactToTagAction(TreeViewer viewer) {
		super("Add Artefacts");
		this.viewer = viewer;
		this.model = LocalRepositoryModel.getInstance();
		setToolTipText("Add Artefacts");
	}

	@Override
	public void run() {

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		
		ProjectViewSelectionDialog selectionDialogs = new ProjectViewSelectionDialog(
				shell, new TreeLabelProvider(),
				new StructureTreeContentProvider());

		selectionDialogs.open();
		Object[] artefactsList = selectionDialogs.getResult();
		Object selectedtag = getSelectedTag(); 
		
		if ((artefactsList != null) && (artefactsList.length > 0)) {
			for (Object artefact : artefactsList) {
				if (artefact instanceof RepoArtefact) {
					
					 
						updateTagMap((String) selectedtag,(RepoArtefact)artefact);
						List<String> tempTags =  ((RepoArtefact) artefact).getTags();
						if(!tempTags.contains(selectedtag))
						{ 
						 ((RepoArtefact) artefact).getTags().add((String) selectedtag);
					      updateArtefact((RepoArtefact)artefact); // update on server side
						}
					
					
				}
			}
		}
	
		
	}

	private void updateTagMap(String tag, RepoArtefact artefact) {
		
		model.addArtefactToTagMap(tag, artefact);	
		System.out.print("");
	}
	
	private Object getSelectedTag() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}
	
	private void updateArtefact(RepoArtefact toUpdate) {
		System.out.println("Add Category: " + toUpdate);
		try {
			RepositoryClientApi.getInstance().updateArtefact(toUpdate);;
			//viewer.remove(toUpdate);
			
			viewer.refresh();
		} catch (Exception ex) {
			System.out.println("Error Add Category '" + toUpdate.getId()
					+ "': " + ex.getMessage());
		}
	}
	
}
