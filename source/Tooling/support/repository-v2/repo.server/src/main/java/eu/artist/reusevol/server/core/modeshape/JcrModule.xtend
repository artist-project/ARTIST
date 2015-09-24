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
 
package eu.artist.reusevol.server.core.modeshape

import com.google.inject.AbstractModule
import com.google.inject.Provides
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.server.RepositoryConfiguration
import javax.inject.Singleton
import javax.jcr.Repository
import javax.jcr.Session
import org.jcrom.Jcrom
import org.modeshape.jcr.ModeShapeEngine
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class JcrModule extends AbstractModule {

	private static final Logger logger = LoggerFactory.getLogger(JcrModule)

	var Repository repository

	public static def getNewSession(Repository repository) {
		val currentSession = SessionHolder.currentSession.get
		if ((currentSession != null) && currentSession.isLive) {
			logger.debug('''Existing session («currentSession») for user '«currentSession.userID»' reused.''')
			return currentSession			
		} else {
			SessionHolder.currentSession.remove
		}
		
		val currentUser = CurrentUserHolder.currentUser.get
		logger.debug('''Session created for user «currentUser?.username» with groups «currentUser?.groups?.map[name]»''')
		val session = repository.login(new UserCredentials(currentUser))
		
		// Store the session in ThreadLocal
		SessionHolder.currentSession.set(session)
		
		session
	}

	protected override configure() {
		bind(ModeShapeEngine).in(Singleton)
	}

	@Provides
	def Repository providesRepository(RepositoryConfiguration configuration, ModeShapeEngine engine) {
		if (repository == null) {
			repository = getRepository(configuration, engine)
		}
		repository
	}

	@Provides
	def Session providesSession(Repository repository) {
		getNewSession(repository)
	}
	
	@Provides
	def Jcrom providesJcrom(Repository session) {
		// logger.debug("JCROM created");
		val jcrom = new Jcrom(false, true)
		jcrom.mapPackage("eu.artist.reusevol.repo.common.model", true)
		jcrom.mapPackage("eu.artist.reusevol.server.core.model", true)
		return jcrom
	}

	private def getRepository(RepositoryConfiguration configuration, ModeShapeEngine engine) {
		try {
			engine.getRepository(configuration.repositoryName)
		} catch (Exception ex) {
			logger.error("'{}' repository not found: {}", configuration.repositoryName, ex.toString)
			engine.repositories.forEach [ repo, state |
				logger.info("  Repository {} in state {}", repo, state)
			]
			null
		}
	}
}
