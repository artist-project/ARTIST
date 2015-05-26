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
import eu.artist.reusevol.mp.views.BaseView
import eu.artist.reusevol.mp.views.CategoryBrowserView
import eu.artist.reusevol.mp.views.HomeView
import eu.artist.reusevol.mp.views.MyArtefactsView
import eu.artist.reusevol.mp.views.ProjectBrowserView
import eu.artist.reusevol.mp.views.TableBrowserView
import eu.artist.reusevol.repo.common.model.User
import io.dropwizard.jersey.sessions.Session
import javax.servlet.http.HttpSession
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo
import javax.inject.Inject
import eu.artist.reusevol.repo.client.wso2.Wso2Client

@Path(MarketplaceBundle.WEB_BASE)
@Produces(MediaType.TEXT_HTML)
class HomeResource extends BaseResource {
	
	@Context
	var UriInfo uriInfo

	@Inject
	new(Wso2Client client) {
		super(client)
	}

	@GET
	@Path("index.html")
	def BaseView showIndexView(@Session HttpSession session, @SessionUser(required=false) User user) {
		new BaseView("index.ftl") => [
			title = "Introduction"
			pageHeading = "Marketplace Intro"
			pageDescription = "Information about the ARTIST Marketplace"
		]
	}

	@GET
	@Path("home.html")
	def HomeView showHomeView(@Session HttpSession session, @SessionUser(required=false) User user) {
		new HomeView(user) => [
			title = "Home"
			pageHeading = "Marketplace Overview"
			pageDescription = "Stats and information about the ARTIST Marketplace"
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}

	@GET
	@Path("package-browser.html")
	def ProjectBrowserView showProjectView(@Session HttpSession session, @SessionUser(required=false) User user) {
		new ProjectBrowserView(user) => [
			title = "Explore by Project and Package"
			pageHeading = "Explore by Project and Package"
			pageDescription = "Select a project and package"
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}

	@GET
	@Path("category-browser.html")
	def CategoryBrowserView showCategoryView(@Session HttpSession session, @SessionUser(required=false) User user) {
		new CategoryBrowserView(user) => [
			title = "Explore by Category"
			pageHeading = "Explore by Category"
			pageDescription = "Select a category and artefact"
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}

	@GET
	@Path("table-browser.html")
	def TableBrowserView showTableView(@Session HttpSession session, @SessionUser(required=false) User user) {
		new TableBrowserView(user) => [
			title = "Table of artefacts"
			pageHeading = "Table of artefacts"
			pageDescription = "Select a an artefact from the table to see details"
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}

	@GET
	@Path("my-artefacts.html")
	def MyArtefactsView showMyArtefactsView(@Session HttpSession session, @SessionUser User user) {
		new MyArtefactsView(user) => [
			title = "Manage Artefacts"
			pageHeading = "Manage Artefacts"
			pageDescription = "Create, edit and delete your artefacts"
			accessToken = getToken(session).orNull
			setUriInfo(uriInfo)
		// breadCrumps.add(new WebLink("Home", BaseView.HOME))
		]
	}
}