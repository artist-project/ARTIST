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
 
package eu.artist.reusevol.repo.client

import com.sun.jersey.api.client.Client
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.util.GenericServiceClientTemplate
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.util.Id
import eu.artist.reusevol.repo.common.util.Depth

class ProjectManager extends GenericServiceClientTemplate<RepoProject> {
	
	new(Client client, RepositoryClientConfig config) {
		super(client, config, "/projects", RepoProject)
	}
	
	def create(String id, String label, String description) {
		val entity = new RepoProject(id, label, description)
		create(entity)
	}

	def delete(String sid) {
		delete(Id.of(sid))
	}

	def exists(String sid) {
		exists(Id.of(sid))
	}

	def get(String sid, Depth depth) {
		get(Id.of(sid), depth)
	}
	
	def get(String sid) {
		get(Id.of(sid), Depth.ENTITY)
	}
	
	def move(String sourceId, String targetId) {
		move(Id.of(sourceId), Id.of(targetId))
	}
	
}