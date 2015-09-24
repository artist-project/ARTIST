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
 
package eu.artist.reusevol.server.core.service

import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.server.core.GenericServiceTemplate
import eu.artist.reusevol.server.core.dao.ProjectDao
import javax.inject.Inject
import javax.inject.Provider

class ProjectService extends GenericServiceTemplate<RepoProject> {
	
	@Inject
	new(Provider<ProjectDao> dao) {
		super(dao)
	}
	
}