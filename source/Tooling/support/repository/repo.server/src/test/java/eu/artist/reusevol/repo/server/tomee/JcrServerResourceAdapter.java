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
package eu.artist.reusevol.repo.server.tomee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;

import org.modeshape.jcr.api.RepositoriesContainer;

public class JcrServerResourceAdapter {
	private String repositoryURL;
	private RepositoriesContainer container;

	public JcrServerResourceAdapter() {
		repositoryURL = null;
		container = getRepositoriesContainer();
	}

	public void setRepositoryURL(String url) {
		repositoryURL = url;
	}

	public RepositoriesContainer getRepositoriesContainer() {
		Iterator<RepositoriesContainer> it = ServiceLoader.load(
				RepositoriesContainer.class).iterator();
		if (!it.hasNext()) {
			throw new IllegalArgumentException(
					"No repositories container located in the classpath. Make sure modeshape-jcr.jar is present");
		}
		return it.next();
	}

	public Repository getRepository() {
		if (repositoryURL == null)
			throw new IllegalArgumentException(
					"No URL for the repository config file has been supplied");
			
		Map<String, String> params = new HashMap<String, String>();
		params.put(RepositoriesContainer.URL, repositoryURL);
		System.out.println(params);
		try {
			return container.getRepository(null, params);
		} catch (RepositoryException e) {
			throw new RuntimeException(e);
		}
	}
}
