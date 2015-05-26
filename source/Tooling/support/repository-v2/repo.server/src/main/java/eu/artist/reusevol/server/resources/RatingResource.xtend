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
import eu.artist.reusevol.repo.common.model.Rating
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.security.annotations.WriteOperation
import eu.artist.reusevol.server.core.service.ArtefactService
import io.dropwizard.auth.Auth
import javax.validation.Valid
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory

@Accessors
class RatingResource {
	private static val logger = LoggerFactory.getLogger(RatingResource) 
	
	val ArtefactService service
	val RepoArtefact artefact
	
	@GET
	@Timed
	@ReadOperation
	@Produces(MediaType.APPLICATION_JSON)
	def Rating getRating(@Auth(required = false) User user) {
		logger.debug("Get rating for {}", artefact?.id)

		try {
			service.getRating(artefact)
		} catch(Exception ex) {
			logger.debug("Error getting rating.", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
		}
	}
	
	@POST
	@Timed
	@WriteOperation
	def Response setRating(@Valid Rating rating, @Auth User user) {
		logger.debug("Create rating for {} with value {}", artefact?.id, rating.rating)
		try {
			service.setRating(artefact, rating)
			Response.ok.build
		} catch(Exception ex) {
			logger.debug("Error creating rating.", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
		}
	}

		
}