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

import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.VersionInfo
import eu.artist.reusevol.server.core.service.ArtefactService
import java.util.List
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory
import io.dropwizard.auth.Auth
import eu.artist.reusevol.repo.common.model.User
import com.codahale.metrics.annotation.Timed
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.security.annotations.WriteOperation

@Accessors
class VersionResource {
	private static val logger = LoggerFactory.getLogger(VersionResource) 
	
	val ArtefactService service
	val RepoArtefact head
	
	@GET
	@Timed
	@ReadOperation
	@Produces(MediaType.APPLICATION_JSON)
	def List<VersionInfo> listVersions(@Auth(required = false) User user) {
		logger.debug("List versions for {}", head?.id)
		service.listVersions(head)
	}
	
	@POST
	@Timed
	@WriteOperation
	@Produces(MediaType.APPLICATION_JSON)
	def createVersion(@QueryParam("msg") String commitMessage, @Auth User user) {
		logger.debug("Create version for {}: {}", head?.id, commitMessage)
		service.createVersion(head, commitMessage)
	}
}