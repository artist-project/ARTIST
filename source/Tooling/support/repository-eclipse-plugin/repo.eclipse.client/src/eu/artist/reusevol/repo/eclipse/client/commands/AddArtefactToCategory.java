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
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.ProjectViewSelectionDialog;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.provider.StructureTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

public class AddArtefactToCategory extends Action {

	private TreeViewer viewer;
    private LocalRepositoryModel model ;
	public AddArtefactToCategory(TreeViewer viewer) {
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
		Object selectedcategory = getSelectedCategory(); 
		
		if ((artefactsList != null) && (artefactsList.length > 0)) {
			for (Object art : artefactsList) {
				if (art instanceof RepoArtefact) {
					
					if (selectedcategory instanceof RepoCategory)
						{  
							
							List<String> tempCats =  ((RepoArtefact) art).getCategories();
							if(!tempCats.contains(((RepoCategory) selectedcategory).getId()))
							{ 
							  updateArtefactstoCategoryMap((RepoCategory)selectedcategory,(RepoArtefact)art);
						      ((RepoArtefact) art).getCategories().add(((RepoCategory) selectedcategory).getId());
						      updateArtefact((RepoArtefact)art); // update on server side
							}
						}
					
				}
			}
		}
	
		
	}

	private void updateArtefactstoCategoryMap(RepoCategory cat, RepoArtefact artefact) {
		model.addArtefactToCategory(cat.getId(),artefact);		
	}

	
	private Object getSelectedCategory() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}
	
	private void updateArtefact(RepoArtefact toUpdate) {
		System.out.println("Add Category: " + toUpdate);
		try {
			RepositoryClientApi.getInstance().updateArtefact(toUpdate);;	
			viewer.refresh();
		} catch (Exception ex) {
			System.out.println("Error Add Category '" + toUpdate.getId()
					+ "': " + ex.getMessage());
		}
	}
	
}
