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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;

import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;

public class DeleteProjectAction extends Action {

	private TreeViewer viewer;

	public DeleteProjectAction(TreeViewer viewer) {
		super("Delete Project");
		this.viewer = viewer;
		setToolTipText("Delete Project");
	}

	@Override
	public void run() {
		Object selection = getSelectedElement();
		if (!(selection instanceof RepoProject))
			return;
		RepoProject toDelete = (RepoProject) selection;

		if (toDelete.getPackages().isEmpty()) {
			deleteProject(toDelete);
		} else {
			if (userConfirmsToDeleteProject()) {
				forceDelete(toDelete);
			}
		}
	}

	private Object getSelectedElement() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}

	private boolean userConfirmsToDeleteProject() {
		return MessageDialog
				.openConfirm(
						viewer.getControl().getShell(),
						"Confirm deletion of non-empty project",
						"The selected project is not empty. Do you want to delete it together with all of its contents?");
	}

	private void deleteProject(RepoProject toDelete) {
		System.out.println("Deletion of empty project: " + toDelete);
		try {
			RepositoryClientApi.getInstance().deleteProject(toDelete);
			viewer.remove(toDelete);
		} catch (Exception ex) {
			System.out.println("Error deleting project '" + toDelete.getId()
					+ "': " + ex.getMessage());
		}
	}

	private void forceDelete(RepoProject toDelete) {
		System.out.println("Force deletion of non-empty project: " + toDelete);
		try {
			RepositoryClientApi.getInstance().forceDeleteProject(toDelete);
			viewer.remove(toDelete);
		} catch (Exception ex) {
			System.out.println("Error deleting project '" + toDelete.getId()
					+ "': " + ex.getMessage());
		}
	}
}
