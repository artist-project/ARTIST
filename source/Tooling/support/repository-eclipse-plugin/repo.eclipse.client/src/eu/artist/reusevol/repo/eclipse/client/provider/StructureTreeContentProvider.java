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
package eu.artist.reusevol.repo.eclipse.client.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;
import eu.artist.reusevol.repo.eclipse.client.model.RepoServer;

/**
 * RepoProjectContentProvider :Content provider for the treeviewer of repository
 * Currently fetching mockmodel as data for the treeviewer
 * 
 * **/

public class StructureTreeContentProvider implements ITreeContentProvider {

	private LocalRepositoryModel model = LocalRepositoryModel.getInstance();

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null)
			this.model = (LocalRepositoryModel) newInput;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return model.getServers().values().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof RepoServer) {
			RepoServer server = (RepoServer) parentElement;
			return server.getProjects().toArray();
		} else if (parentElement instanceof RepoProject) {
			RepoProject repository = (RepoProject) parentElement;
			return repository.getPackages().toArray();
		} else if (parentElement instanceof RepoPackage) {
			RepoPackage packages = (RepoPackage) parentElement;
			return packages.getArtefacts().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof RepoServer) {
			return !((RepoServer) element).getProjects().isEmpty();
		} else if (element instanceof RepoProject) {
			return !((RepoProject) element).getPackages().isEmpty();
		} else if (element instanceof RepoPackage) {
			return !((RepoPackage) element).getArtefacts().isEmpty();
		}
		return false;
	}
}
