/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;

import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.ProjectCreationDialog;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

public class CreateProjectAction extends Action {

	private TreeViewer viewer;

	public CreateProjectAction(TreeViewer viewer) {
		super("Create Project");
		setToolTipText("Create Project");
		this.viewer = viewer;
	}

	@Override
	public void run() {
		Object selection = getSelectedElement();
		if (!(selection instanceof RepoServer))
			return;

		ProjectCreationDialog dialog = new ProjectCreationDialog(viewer
				.getControl().getShell());

		if (dialog.open() == Window.CANCEL)
			return;

		try {
			RepositoryClientApi.getInstance()
					.createProject((RepoServer) selection, dialog.getName(),
							dialog.getLabel(), dialog.getDescription());
			viewer.refresh();
		} catch (RepoClientException ex) {
			System.out.println("Error while creating project: "
					+ ex.getMessage());
		}
	}

	private Object getSelectedElement() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}

}
