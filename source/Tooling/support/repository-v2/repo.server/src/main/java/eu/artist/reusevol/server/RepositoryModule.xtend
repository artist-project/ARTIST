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
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.server.core.dao.ArtefactDao
import eu.artist.reusevol.server.core.dao.CategoryDao
import eu.artist.reusevol.server.core.dao.CommentDao
import eu.artist.reusevol.server.core.dao.PackageDao
import eu.artist.reusevol.server.core.dao.ProjectDao
import eu.artist.reusevol.server.core.dao.RatingDao
import eu.artist.reusevol.server.core.dao.UserDao
import eu.artist.reusevol.server.core.dao.VersionedArtefactDao
import eu.artist.reusevol.server.core.security.AuthorizationPoint
import javax.inject.Singleton
import javax.jcr.Session
import org.jcrom.Jcrom

class RepositoryModule extends AbstractModule {

	// private static final Logger logger = LoggerFactory.getLogger(RepositoryModule)

	public override configure() {
		bind(AuthorizationPoint).in(Singleton)
	}
	
	@Provides
	def Wso2Client provideWso2Client(RepositoryConfiguration configuration) {
		new Wso2Client(configuration.wso2)
	}
	
	@Provides
	def CategoryDao provideCategoryDAO(Session session, Jcrom jcrom) {
		new CategoryDao(session, jcrom)
	}
	
	@Provides
	def ProjectDao provideProjectDAO(Session session, Jcrom jcrom) {
		new ProjectDao(session, jcrom)
	}
	
	@Provides
	def PackageDao providePackageDAO(Session session, Jcrom jcrom) {
		new PackageDao(session, jcrom)
	}
	
	@Provides
	def ArtefactDao provideArtefactDAO(Session session, Jcrom jcrom) {
		new ArtefactDao(session, jcrom)
	}
	
	@Provides
	def VersionedArtefactDao provideVersionedArtefactDAO(Session session, Jcrom jcrom) {
		new VersionedArtefactDao(session, jcrom)
	}
	
	@Provides
	def UserDao provideUserDAO(Session session, Jcrom jcrom) {
		new UserDao(session, jcrom)
	}
	
	@Provides
	def CommentDao provideCommentDAO(Session session, Jcrom jcrom) {
		new CommentDao(session, jcrom)
	}
	
	@Provides
	def RatingDao provideRatingDAO(Session session, Jcrom jcrom) {
		new RatingDao(session, jcrom)
	}
	
}
