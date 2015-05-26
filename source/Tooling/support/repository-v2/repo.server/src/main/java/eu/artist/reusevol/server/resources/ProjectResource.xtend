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
 
package eu.artist.reusevol.server.resources

import com.google.common.base.Optional
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup
import eu.artist.reusevol.repo.client.wso2.dto.ScimIdAndName
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.GenericResourceTemplate
import eu.artist.reusevol.server.core.security.RepoGroups
import eu.artist.reusevol.server.core.service.ProjectService
import eu.artist.reusevol.server.util.DepthParam
import eu.artist.reusevol.server.util.IdParam
import javax.inject.Inject
import javax.inject.Provider
import javax.ws.rs.Path
import javax.ws.rs.core.Response.Status

@Path(ProjectResource.BASE)
class ProjectResource extends GenericResourceTemplate<RepoProject, IdParam, ProjectService> {

	public static val BASE = RepositoryService.API_BASE + "/projects"
	
	val Wso2Client client
	
	@Inject
	new(Provider<ProjectService> service, Wso2Client client) {
		super(service)
		this.client = client
	}

	new(ProjectService service, Wso2Client client) {
		super(service)
		this.client = client
	}

	override create(RepoProject entity, User user) {
		val response = super.create(entity, user)
		
		if ((response.status == Status.CREATED) && (client != null)) {
			val scimGroupForProject = new ScimGroup(RepoGroups.GROUP_PREFIX + entity.id, 
				newArrayList(new ScimIdAndName(user.scimId, user.username))
			)
			try {
				logger.debug("Creating group '{}' via SCIM.", scimGroupForProject.name)
				client.createGroup(scimGroupForProject)
			} catch(Exception ex) {
				logger.warn("Creation of group '{}' via SCIM failed. Please create the group manually.", scimGroupForProject.name)
			}
		}
		
		response
	}
	
	override get(IdParam id, Optional<DepthParam> depth, User user) {
		super.get(id, depth, user)
	}
	
	override update(IdParam id, RepoProject entity, Optional<DepthParam> depth, User user) {
		super.update(id, entity, depth, user)
	}
	
	override delete(IdParam id, User user) {
		val result = super.delete(id, user)
		
		if (result.present && (client != null)) {
			val groupName = RepoGroups.GROUP_PREFIX + id.get
			try {
				logger.debug("Deleting group '{}' via SCIM.", groupName)
				client.deleteGroup(new ScimGroup(groupName))
			} catch(Exception ex) {
				logger.warn("Deletion of group '{}' via SCIM failed. Please delete the group manually.", groupName)
			}
		}
		
		result
	}
	
	override list(Optional<String> fiqlQuery, Optional<DepthParam> depth, User user) {
		super.list(fiqlQuery, depth, user)
	}
}
