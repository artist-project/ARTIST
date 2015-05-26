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

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.CategorySelectionDialog;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;
import eu.artist.reusevol.repo.eclipse.client.provider.CategoryTreeContentProvider;
import eu.artist.reusevol.repo.eclipse.client.provider.TreeLabelProvider;

public class AddCategorytoArtefactAction extends Action {

	private StructuredViewer viewer;

	public AddCategorytoArtefactAction(StructuredViewer viewer) {
		super("Add Category");
		this.viewer = viewer;
		setToolTipText("Add Category");
	}

	@Override
	public void run() {

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();

		CategorySelectionDialog selectionDialog = new CategorySelectionDialog(
				shell, new TreeLabelProvider(),
				new CategoryTreeContentProvider());
		
		selectionDialog.open();
		Object[] categoryList = selectionDialog.getResult();
		Object selectedAretafects[] = getSelectedArtefacts();

		RepoArtefact artefact = null;
		if ((categoryList != null) && (categoryList.length > 0)) {
			for (Object cat : categoryList) {
				if (cat instanceof RepoCategory) {
					for (Object artefactTemp : selectedAretafects) {

						if (artefactTemp instanceof RepoArtefact) {
							artefact = (RepoArtefact) artefactTemp;

						} else if (artefactTemp instanceof TableModel) {
							artefact = ((TableModel) artefactTemp)
									.getArtefact();

						} else {
							try {
								throw new RepoClientException(
										"Unknown element type: "
												+ artefactTemp.getClass()
														.getName());
							} catch (RepoClientException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return;
						}

						updateArtefactstoCategoryMap((RepoCategory) cat,
								(RepoArtefact) artefact);
						List<String> tempCats = ((RepoArtefact) artefact)
								.getCategories();
						if (!tempCats.contains(((RepoCategory) cat).getId())) {
							((RepoArtefact) artefact).getCategories().add(
									((RepoCategory) cat).getId());
							updateArtefact((RepoArtefact) artefact); // update
																		// on
																		// server
																		// side
						}

					}
				}
			}
		}

	}

	private void updateArtefactstoCategoryMap(RepoCategory cat,
			RepoArtefact artefact) {
		LocalRepositoryModel.getInstance().addArtefactToCategory(cat.getId(),
				artefact);
	}

	private Object[] getSelectedArtefacts() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).toArray();
	}

	private void updateArtefact(RepoArtefact toUpdate) {
		System.out.println("Add Category: " + toUpdate);
		try {
			RepositoryClientApi.getInstance().updateArtefact(toUpdate);
			// viewer.remove(toUpdate);

			viewer.refresh();
		} catch (Exception ex) {
			System.out.println("Error Add Category '" + toUpdate.getId()
					+ "': " + ex.getMessage());
		}
	}

}
