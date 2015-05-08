/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.server.jcr;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.log4j.Logger;
import org.jcrom.Jcrom;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.server.service.CategoryDAO;

/**
 * Simple CDI based bean which will initialize & return a repository
 * 
 * @author Horia Chiorean (hchiorea@redhat.com) and Oliver Strauß
 */
@Singleton
public class JcrSessionProvider {

	private static final Logger LOGGER = Logger
			.getLogger(JcrSessionProvider.class);

	@Resource(name = "jcr")
	private Repository repository;

	@PostConstruct
	public void initializeRepository() throws Exception {
		LOGGER.info("Got JCR repository from JNDI:" + repository);
		initializeStructure();
	}

	public void initializeStructure() {
		LOGGER.info("Initializing repository structure");
		Session session = null;

		try {
			session = getSession();
			if (!session.nodeExists("/projects")) {
				LOGGER.debug("Creating project root.");
				session.getRootNode().addNode("/projects", "nt:unstructured");
				session.save();
			} else {
				LOGGER.debug("Project root found.");
			}
			if (!session.nodeExists("/categories")) {
				LOGGER.debug("Creating category root.");
				session.getRootNode().addNode("/categories", "nt:unstructured");
				session.save();

				RepoCategory root = new RepoCategory(CategoryName.of(""),
						"Root", "Root category");

				Jcrom jcrom = new Jcrom(true, true);
				jcrom.map(RepoProject.class);
				jcrom.map(RepoPackage.class);
				jcrom.map(RepoArtefact.class);
				jcrom.map(RepoCategory.class);
				CategoryDAO dao = new CategoryDAO(session, jcrom);
				dao.create("/categories", root);

				LOGGER.debug(JcrUtils.printTree(session.getNode("/categories")));
			} else {
				LOGGER.debug("Category root found.");
			}

		} catch (Exception e) {
			LOGGER.error(e);
			throw new IllegalStateException(
					"Repository structure could not be initialized.");
		} finally {
			if (session != null)
				logoutSession(session);
		}
	}

	/**
	 * Producer method which returns a default session to the preconfigured
	 * repository.
	 * 
	 * @return a {@link Session} instance
	 * @throws RepositoryException
	 *             if anything goes wrong
	 */
	@RequestScoped
	@Produces
	public Session getSession() throws RepositoryException {
		LOGGER.debug("Creating new JCR session ...");
		return repository.login();
	}

	/**
	 * Disposer method for {@link SessionProducer#getSession()}
	 * 
	 * @param session
	 *            the {@link Session} created by the producer method
	 */
	public void logoutSession(@Disposes final Session session) {
		LOGGER.debug("Closing JCR session ...");
		session.logout();
	}
}
