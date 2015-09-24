/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
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

import java.util.Collection;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

public class DeleteCategoryAction extends Action {

	private TreeViewer viewer;

	public DeleteCategoryAction(TreeViewer viewer) {
		super("Delete Category");
		this.viewer = viewer;
		setToolTipText("Delete Category");
	}

	@Override
	public void run() {
		Object selection = getSelectedElement();
		if (!(selection instanceof RepoCategory))
			return;
		RepoCategory toDelete = (RepoCategory) selection;

		RepoServer serverToUse = determineServerToUse(toDelete);
		if (serverToUse == null)
			return;

		if (toDelete.getCategories().isEmpty()) {
			deleteCategory(serverToUse, toDelete);
			viewer.remove(toDelete);
		} else {
			if (userConfirmsToDeleteCategory()) {
				forceDeleteCategory(serverToUse, toDelete);
				viewer.remove(toDelete);
			}
		}
	}

	private RepoServer determineServerToUse(RepoCategory toDelete) {
		Collection<RepoServer> serversWithCategory = LocalRepositoryModel.getInstance()
				.getServersWithCategory(toDelete);

		if (serversWithCategory.size() == 1)
			return serversWithCategory.iterator().next();

		ElementListSelectionDialog serverSelectionDialog = new ElementListSelectionDialog(
				viewer.getControl().getShell(), new LabelProvider() {
					@Override
					public String getText(Object obj) {
						return ((RepoServer) obj).getName();
					}
				});
		serverSelectionDialog.setTitle("Select Server");
		serverSelectionDialog
				.setMessage("The category to delete exists on multiple servers. Please select the server on which the category should be deleted.");
		serverSelectionDialog.setElements(serversWithCategory.toArray());
		serverSelectionDialog.setMultipleSelection(false);

		// user pressed cancel
		if (serverSelectionDialog.open() != Window.OK) {
			return null;
		}

		Object[] result = serverSelectionDialog.getResult();

		if (result.length != 1)
			return null;

		return ((RepoServer) result[0]);
	}

	private Object getSelectedElement() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}

	private boolean userConfirmsToDeleteCategory() {
		return MessageDialog
				.openConfirm(
						viewer.getControl().getShell(),
						"Confirm deletion of the category and its sub-categories.",
						"The selected category has sub-categories. Do you want to delete the selected category all its sub-categories?");
	}

	private void deleteCategory(RepoServer server, RepoCategory toDelete) {
		try {
			RepositoryClientApi.getInstance().deleteCategory(server, toDelete);
			viewer.remove(toDelete);
		} catch (Exception ex) {
			System.out.println("Error deleting category '" + toDelete.getId()
					+ "': " + ex.getMessage());
		}
	}

	private void forceDeleteCategory(RepoServer server, RepoCategory toDelete) {
		try {
			RepositoryClientApi.getInstance().forceDeleteCategory(server,
					toDelete);
			viewer.remove(toDelete);
		} catch (Exception ex) {
			System.out.println("Error deleting category '" + toDelete.getId()
					+ "': " + ex.getMessage());
		}
	}
}
