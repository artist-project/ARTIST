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
 
package eu.artist.reusevol.mp.resources

import eu.artist.reusevol.mp.MarketplaceBundle
import eu.artist.reusevol.mp.security.SessionUser
import eu.artist.reusevol.mp.views.DetailsView
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.common.model.User
import io.dropwizard.jersey.sessions.Session
import javax.inject.Inject
import javax.servlet.http.HttpSession
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo

@Path(MarketplaceBundle.WEB_BASE + "{project}/{id}/details.html" )
@Produces(MediaType.TEXT_HTML)
class DetailsResource extends BaseResource {
	
	@Context
	UriInfo uriInfo
	
	@Inject
	new(Wso2Client client) {
		super(client)
	}

	@GET
	def DetailsView showDetailsView(
		@PathParam("project") String projectId, 
		@PathParam("id") String artefactId, 
		@Session HttpSession session, 
		@SessionUser(required=false) User user
	) {
		
		
		new DetailsView(projectId, artefactId, user) => [
			title = "Artefact details"
			pageHeading = "Artefact details"
			pageDescription = ""
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}
}