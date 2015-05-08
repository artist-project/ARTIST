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
package eu.artist.reusevol.repo.client;

public class RepositoryClient {
	private final ConnectionInfo connectionInfo;
	private final ArtefactManager artefactManager;
	private final CategoryManager categoryManager;
	private final ProjectManager projectManager;

	/**
	 * @param connectionInfo
	 */
	public RepositoryClient(ConnectionInfo connectionInfo) {
		this.connectionInfo = connectionInfo;
		this.artefactManager = new ArtefactManager(this);
		this.categoryManager = new CategoryManager(this);
		this.projectManager = new ProjectManager(this);
	}

	/**
	 * @return the connectionInfo
	 */
	public ConnectionInfo getConnectionInfo() {
		return connectionInfo;
	}

	/**
	 * @return the artefactManager
	 */
	public ArtefactManager getArtefactManager() {
		return artefactManager;
	}

	/**
	 * @return the categoryManager
	 */
	public CategoryManager getCategoryManager() {
		return categoryManager;
	}

	/**
	 * @return the projectManager
	 */
	public ProjectManager getProjectManager() {
		return projectManager;
	}
}
