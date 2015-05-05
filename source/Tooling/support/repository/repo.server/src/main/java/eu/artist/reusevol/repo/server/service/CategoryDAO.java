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
package eu.artist.reusevol.repo.server.service;

import javax.inject.Inject;
import javax.jcr.Session;

import org.jcrom.Jcrom;
import org.jcrom.dao.AbstractJcrDAO;

import eu.artist.reusevol.repo.common.model.RepoCategory;

public class CategoryDAO extends AbstractJcrDAO<RepoCategory> {

	private final Session session;
	private final Jcrom jcrom;

	@Inject
	public CategoryDAO(Session session, Jcrom jcrom) {
		super(RepoCategory.class, session, jcrom);
		this.session = session;
		this.jcrom = jcrom;
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @return the jcrom instance
	 */
	public Jcrom getJcrom() {
		return jcrom;
	}
}
