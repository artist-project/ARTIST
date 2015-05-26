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
 
package eu.artist.reusevol.server

import com.google.inject.AbstractModule
import com.google.inject.Provides
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.RepoCategory
import eu.artist.reusevol.repo.common.model.RepoPackage
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.server.core.GenericDaoTemplate
import eu.artist.reusevol.server.core.dao.ArtefactDao
import eu.artist.reusevol.server.core.dao.CategoryDao
import eu.artist.reusevol.server.core.dao.PackageDao
import eu.artist.reusevol.server.core.dao.ProjectDao
import eu.artist.reusevol.server.core.dao.VersionedArtefactDao
import eu.artist.reusevol.server.core.model.VersionedArtefact
import eu.artist.reusevol.server.core.service.ProjectService
import javax.jcr.Session
import org.jcrom.Jcrom

class RepositoryTestModule extends AbstractModule {

	// private static final Logger logger = LoggerFactory.getLogger(RepositoryModule)

	public override configure() {
		bind(ProjectService)
	}
	
	@Provides
	def GenericDaoTemplate<RepoCategory> provideCategoryDAO(Session session, Jcrom jcrom) {
		new CategoryDao(session, jcrom)
	}
	
	@Provides
	def GenericDaoTemplate<RepoProject> provideProjectDAO(Session session, Jcrom jcrom) {
		new ProjectDao(session, jcrom)
	}
	
	@Provides
	def GenericDaoTemplate<RepoPackage> providePackageDAO(Session session, Jcrom jcrom) {
		new PackageDao(session, jcrom)
	}
	
	@Provides
	def GenericDaoTemplate<RepoArtefact> provideArtefactDAO(Session session, Jcrom jcrom) {
		new ArtefactDao(session, jcrom)
	}
	
	@Provides
	def GenericDaoTemplate<VersionedArtefact> provideVersionedArtefactDAO(Session session, Jcrom jcrom) {
		new VersionedArtefactDao(session, jcrom)
	}
	
}
