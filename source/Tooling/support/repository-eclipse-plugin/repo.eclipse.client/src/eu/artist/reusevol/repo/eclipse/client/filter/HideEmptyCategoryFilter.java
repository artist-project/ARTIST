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
package eu.artist.reusevol.repo.eclipse.client.filter;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.model.LocalRepositoryModel;

public class HideEmptyCategoryFilter extends ViewerFilter {

	/*
	 * @see ViewerFilter#select(Viewer, Object, Object)
	 */
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		
		LocalRepositoryModel model = LocalRepositoryModel.getInstance();
		int count = 0;
		
		if(element instanceof RepoCategory){
    	RepoCategory repocat = (RepoCategory) element;
    	Set<RepoArtefact> artifactsListforCat = new HashSet<RepoArtefact>();
    	 
    	 /// all artifacts from subcategories.
         model.getallArtefactsForSubCategories(repocat,artifactsListforCat);
         
         // artifacts from itself
         artifactsListforCat.addAll(model.getArtefactsForCategory(repocat.getId()));
         
         // total count of artifacts from subcategories and tself.
         count = artifactsListforCat.size();
		}
		
		if(element instanceof RepoCategory)
    	return element instanceof RepoCategory && count > 0;
    	
    	return true;	
		
	}

}
