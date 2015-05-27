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
package eu.artist.reusevol.repo.eclipse.client.provider;


import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;

/**
 * RepoProjectContentProvider :Content provider for the treeviewer of repository
 * Currently fetching mockmodel as data for the treeviewer
 * 
 * **/

public class TagTreeContentProvider implements ITreeContentProvider {

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
		return model.getTags().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		return false;
	}

}
