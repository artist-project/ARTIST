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
import eu.artist.reusevol.repo.common.model.Comment
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.security.annotations.WriteOperation
import eu.artist.reusevol.server.core.service.ArtefactService
import io.dropwizard.auth.Auth
import java.util.List
import javax.validation.Valid
import javax.ws.rs.Consumes
import javax.ws.rs.FormParam
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory
import eu.artist.reusevol.repo.common.model.Comment.CommentType

@Accessors
class CommentResource {
	private static val logger = LoggerFactory.getLogger(CommentResource) 
	
	val ArtefactService service
	val RepoArtefact artefact
	
	@GET
	@Timed
	@ReadOperation
	@Produces(MediaType.APPLICATION_JSON)
	def List<Comment> listComments(@Auth(required = false) User user) {
		logger.debug("List comments for {}", artefact?.id)
		service.getComments(artefact)
	}
	
	@POST
	@Timed
	@WriteOperation
	def Response createComment(@Valid Comment comment, @Auth User user) {
		logger.debug("Create comment for {} with title {}", artefact?.id, comment?.id)
		try {
			service.addComment(artefact, comment)
			Response.ok.build
		} catch(Exception ex) {
			logger.debug("Error creating comment.", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
		}
	}

	@POST
	@Timed
	@WriteOperation
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	def Response createCommentFromForm(@FormParam("title") String title, @FormParam("text") String text, @Auth User user) {
		logger.debug("Create comment for {} with title {}", artefact?.id, title)
		try {
			service.addComment(artefact, new Comment(CommentType.COMMENT, user, title, text))
			Response.ok.build
		} catch(Exception ex) {
			logger.debug("Error creating comment.", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
		}
	}
}