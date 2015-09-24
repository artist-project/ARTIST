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

import com.google.common.base.Joiner
import eu.artist.reusevol.repo.common.model.RepoPackage
import eu.artist.reusevol.server.core.GenericServiceTemplate
import eu.artist.reusevol.server.core.dao.PackageDao
import eu.artist.reusevol.server.core.dao.ProjectDao
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.xtend.lib.annotations.Accessors

class PackageService extends GenericServiceTemplate<RepoPackage> {
	
	@Accessors
	var String projectId
	
	@Inject
	new(Provider<PackageDao> dao) {
		super(dao)
	}

	def void setProjectId(String projectId) {
		this.projectId = projectId
		basePath = Joiner.on("/").join(ProjectDao.BASE, projectId, "packages")
	}
	
}