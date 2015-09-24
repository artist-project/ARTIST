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

import com.codahale.metrics.annotation.Timed
import com.google.common.base.Optional
import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.service.ArtefactService
import eu.artist.reusevol.server.util.DepthParam
import io.dropwizard.auth.Auth
import java.util.List
import javax.inject.Inject
import javax.inject.Provider
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import javax.ws.rs.core.UriInfo
import org.slf4j.LoggerFactory

@Path(SearchResource.BASE)
class SearchResource {
	
	private static val logger = LoggerFactory.getLogger(SearchResource)

	public static val BASE = RepositoryService.API_BASE + "/search"

	val Provider<ArtefactService> serviceProvider

	@Context
	var UriInfo uriInfo

	@Inject
	new(Provider<ArtefactService> service) {
		this.serviceProvider = service
	}

	private def ArtefactService getService() {
		val service = serviceProvider.get
		// This is a hack to avoid a NPE. For the general searches, a projectId is not needed but required by the code.
		service.projectId = "public"
		service
	}

	/**
	 * Gets a list of all artefacts in all projects, optionally filtered by a FIQL query.
	 * 
	 * @param depth
	 *            "ENTITY" retrieves only the entity data (default), "CHILDREN"
	 *            retrieves the entity and its children, "ALL"
	 *            retrieves the complete meta-data of the entity and all sub-entities.
	 * @param permission
	 * 			  Filters the result based on the specified permission
	 * @return a list of artefacts
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@ReadOperation
	def List<RepoArtefact> find(
		@QueryParam("query") Optional<String> fiqlQuery,
		@QueryParam("depth") Optional<DepthParam> depth, 
		@QueryParam("permission") Optional<Permission> permission, 
		@Auth(required=false) User user) {
			
		val actualDepth = if (depth.present) depth.get.get else Depth.CHILDREN
		val actualPermission = permission.or(Permission.MANAGE)
		
		val result = try {
			if (permission.present) {
				if (fiqlQuery.present && !fiqlQuery.get.empty) {
					service.findByFiqlInAllProjects(fiqlQuery.get, actualPermission, actualDepth)
				} else {
					service.findInAllProjects(actualPermission, actualDepth)
				}
			} else {
				if (fiqlQuery.present && !fiqlQuery.get.empty) {
					service.findByFiqlInAllProjects(fiqlQuery.get, actualDepth)
				} else {
					service.findInAllProjects(actualDepth)
				}
			}
		} catch(Exception ex) {
			logger.debug("Error", ex)
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(ex.message).build)
		} 
		
		result.map[
			if (contentInfo != null)
				contentInfo.link = uriInfo.baseUriBuilder.path("artefacts").path(project).path(id).path("content").build.toASCIIString
			if (imageInfo != null)
				imageInfo.link = uriInfo.baseUriBuilder.path("artefacts").path(project).path(id).path("image").build.toASCIIString
			it
		]
	}
}