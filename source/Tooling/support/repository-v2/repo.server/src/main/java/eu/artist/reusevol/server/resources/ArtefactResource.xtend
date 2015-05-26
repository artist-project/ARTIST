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
import com.sun.jersey.api.NotFoundException
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.GenericResourceTemplate
import eu.artist.reusevol.server.core.service.ArtefactService
import eu.artist.reusevol.server.util.ArtefactIdParam
import eu.artist.reusevol.server.util.DepthParam
import eu.artist.reusevol.server.util.IdParam
import io.dropwizard.auth.Auth
import javax.inject.Inject
import javax.inject.Provider
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Context
import javax.ws.rs.core.UriInfo

@Path(ArtefactResource.BASE)
class ArtefactResource extends GenericResourceTemplate<RepoArtefact, ArtefactIdParam, ArtefactService> {
	
	public static val BASE = RepositoryService.API_BASE + "/artefacts/{project}"
	
	var IdParam projectId
	
    @Context
    UriInfo uriInfo
	
	@Inject
	new(Provider<ArtefactService> service) {
		super(service)
		logger.debug('''Constructor «class.simpleName» called.''')
	}
	
	@PathParam("project")
	def void setProjectId(IdParam projectId) {
		this.projectId = projectId
		service.projectId = projectId.get
		logger.debug('''ProjectId is '«projectId»'.''')
	} 
	
	override get(ArtefactIdParam id, Optional<DepthParam> depth, User user) {
		val result = super.get(id, depth, user)
		
		// Add links to info records
		if (result.present) {
			val artefact = result.get
			
			
			if (artefact.contentInfo != null) {
				val ub = uriInfo.getAbsolutePathBuilder()
				val contentUrl = ub.path("content").build
				artefact.contentInfo.link = contentUrl.toASCIIString;
			}
			if (artefact.imageInfo != null) {
				val ub = uriInfo.getAbsolutePathBuilder()
				val imageUrl = ub.path("image").build
				artefact.imageInfo.link = imageUrl.toASCIIString;
			}
			
			Optional.of(artefact)
		} else {			
			result
		}
	}

	@Path("{id}/content")
	def FileContentResource getFileContentResource(@PathParam("id") ArtefactIdParam id, @Auth(required = false) User user) {
		val artefact = service.get(id, Depth.ALL)
		
		if (artefact.present)
			return new FileContentResource(service, artefact.get)
		else {
			throw new NotFoundException
		}
	}
	
	@Path("{id}/versions")
	def VersionResource getVersionResource(@PathParam("id") ArtefactIdParam id, @Auth(required = false) User user) {
		val artefact = service.get(id, Depth.ALL)
		
		if (artefact.present)
			return new VersionResource(service, artefact.get)
		else {
			throw new NotFoundException
		}
	}

	@Path("{id}/comments")
	def CommentResource getCommentResource(@PathParam("id") ArtefactIdParam id, @Auth(required = false) User user) {
		val artefact = service.get(id, Depth.ENTITY)
		
		if (artefact.present)
			return new CommentResource(service, artefact.get)
		else {
			throw new NotFoundException
		}
	}

	@Path("{id}/rating")
	def RatingResource getRatingResource(@PathParam("id") ArtefactIdParam id, @Auth(required = false) User user) {
		val artefact = service.get(id, Depth.ENTITY)
		
		if (artefact.present)
			return new RatingResource(service, artefact.get)
		else {
			throw new NotFoundException
		}
	}

	@Path("{id}/image")
	def ImageResource getImageResource(@PathParam("id") ArtefactIdParam id, @Auth(required = false) User user) {
		val artefact = service.get(id, Depth.ALL)
		
		if (artefact.present)
			return new ImageResource(service, artefact.get)
		else {
			throw new NotFoundException
		}
	}
}