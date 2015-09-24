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

import java.util.Collection;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;

import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.dialogs.CategoryCreationDialog;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

public class CreateCategoryAction extends Action {

	private TreeViewer viewer;

	public CreateCategoryAction(TreeViewer viewer) {
		super("Create Category");
		setToolTipText("Create Category");
		this.viewer = viewer;
	}

	@Override
	public void run() {
		// Problem is, that we don't know in what server the category should be
		// created (especially for new first level categories).
		// That means that we have to ask the user and present him with a
		// selection of possible servers.

		LocalRepositoryModel model = LocalRepositoryModel.getInstance();
		Object selection = getSelectedElement();

		Collection<RepoServer> servers;
		if (selection == null) {
			// Canvas was selected => root level category => all servers
			// possible.
			servers = model.getServers().values();
		} else {

			if (!(selection instanceof RepoCategory))
				return;
			RepoCategory selectedCategory = (RepoCategory) selection;
			servers = model.getServersWithCategory(selectedCategory);
		}

		CategoryCreationDialog dialog = new CategoryCreationDialog(viewer
				.getControl().getShell(), servers);

		if (dialog.open() == Window.CANCEL)
			return;

		try {
			RepoServer selectedServer = getServerByName(servers,
					dialog.getServerName());
			RepositoryClientApi.getInstance()
					.createCategory(selectedServer, (RepoCategory) selection,
							dialog.getName(), dialog.getLabel(),
							dialog.getDescription());
			viewer.refresh();
		} catch (RepoClientException ex) {
			System.out.println("Error while creating project: "
					+ ex.getMessage());
		}
	}

	private RepoServer getServerByName(Collection<RepoServer> servers,
			String serverName) {
		for (RepoServer server : servers) {
			if (server.getName().equals(serverName))
				return server;
		}
		return null;
	}

	private Object getSelectedElement() {
		ISelection selection = viewer.getSelection();
		return ((IStructuredSelection) selection).getFirstElement();
	}

}
