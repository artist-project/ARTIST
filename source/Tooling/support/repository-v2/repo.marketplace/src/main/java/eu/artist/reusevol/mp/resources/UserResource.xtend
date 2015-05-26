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

import com.google.common.base.Optional
import com.google.common.base.Splitter
import com.sun.jersey.api.client.UniformInterfaceException
import com.sun.jersey.api.core.HttpContext
import eu.artist.reusevol.mp.MarketplaceBundle
import eu.artist.reusevol.mp.security.SessionUser
import eu.artist.reusevol.mp.util.SessionKeys
import eu.artist.reusevol.mp.views.BaseView
import eu.artist.reusevol.mp.views.LoginView
import eu.artist.reusevol.mp.views.ProfileView
import eu.artist.reusevol.mp.views.RegistrationView
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser
import eu.artist.reusevol.repo.client.wso2.exceptions.ScimException
import eu.artist.reusevol.repo.common.model.User
import io.dropwizard.jersey.sessions.Session
import java.net.URI
import javax.inject.Inject
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.UriBuilder
import org.slf4j.LoggerFactory
import eu.artist.reusevol.repo.client.wso2.TokenHolder

@Path(MarketplaceBundle.WEB_BASE + "/user")
@Produces(MediaType.TEXT_HTML)
class UserResource {

	private static val logger = LoggerFactory.getLogger(UserResource)

	val Wso2Client client

	@Inject
	new(Wso2Client client) {
		this.client = client
	}

	@GET
	@Path("login.html")
	def LoginView showLoginView() {
		new LoginView
	}

	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	def LoginView performLogin(
		@Context HttpContext context,
		@Context HttpServletRequest request
	) {
		val view = new LoginView(context.request.formParameters)
		view.validate

		logger.debug("Trying to log in user '{}'", view.username)
		
		val accessToken = loginUser(view.username, view.password) 
		if (!accessToken.present) {
		    view.errors.add("Login failed")
		}
		
		logger.debug("Logged in user '{}'", view.username)

		val user = getUserInfo(view.username)
		if (!user.present) {
		    view.errors.add("Login failed")
		}

		if (!view.errors.empty) {
		    return view
		}

		storeUserInSession(request, user, view.password, accessToken)

		val referer = Optional.fromNullable(request.getHeader("Referer"))
		logger.debug("Referer: " + referer)
		val uri = if (referer.present && !referer.get.endsWith(BaseView.LOGIN_ACTION) && !referer.get.endsWith(BaseView.LOGIN_PAGE)) {
				new URI(referer.get)
			} else {
				UriBuilder.fromPath(BaseView.HOME).build
			}

		redirectTo(uri)
		null
	}

	@GET
	@Path("logout")
	def Response performLogout(@Session HttpSession session) {
	    val user = session.getAttribute(SessionKeys.CURRENT_USER) as User
		logger.debug("Logging out user '{}'", user?.username)
		
	    session.setAttribute(SessionKeys.CURRENT_USER, null)
	    session.setAttribute(SessionKeys.ACCESS_TOKEN, null)
	    session.setAttribute(SessionKeys.PASSWORD, null)
		session?.invalidate

		Response.seeOther(new URI(BaseView.HOME)).build
	}

	@GET
	@Path("profile.html")
	def ProfileView showProfileView(@SessionUser User user) {
		new ProfileView(user)
	}

	@GET
	@Path("register.html")
	def RegistrationView showRegistrationView() {
		new RegistrationView
	}

	@POST
	@Path("register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	def RegistrationView performRegistration(@Context HttpContext context, @Context HttpServletRequest request) {

		val view = new RegistrationView(context.request.formParameters)
		view.validate

		if (view.errors.empty) {
		    val name = splitRealname(view.realname)
		    val user = new ScimUser(view.username, view.password, name.key, name.value)
		    try {
				client.createUser(user)
				logger.debug("Successfully created user '{}' in WSO2 via SCIM", view.username)
		    } catch(ScimException ex) {
		        logger.debug("User {} already exists", view.username)
		        view.errors.add('''A user with the username '«view.username»' already exists.''')
		        return view
		    }
		    try {
				client.addUserToGroup(user, new ScimGroup("prj_public"))
				logger.debug("Successfully added user '{}' to the 'prj_public' group", view.username)
		    } catch(ScimException ex) {
		        logger.warn("User {} could not be added to the 'prj_public group': {}", view.username, ex.message)
		    }
			val sessionUser = getUserInfo(view.username)
			val accessToken = loginUser(view.username, view.password) 
			if (sessionUser.present) {
			    storeUserInSession(request, sessionUser, view.password, accessToken)
		    }
		    
			redirectTo(new URI(BaseView.HOME))
		}
		view
	}
	
	private def Pair<String,String> splitRealname(String realname) {
	    val nameComponents = Splitter.on(" ").split(realname)
	    switch(nameComponents) {
	        case nameComponents.size == 1: new Pair<String,String>(nameComponents.get(0), null)
	        case nameComponents.size == 2: new Pair<String,String>(nameComponents.get(0), nameComponents.get(1))
	        case nameComponents.size > 2: new Pair<String,String>(nameComponents.get(0), nameComponents.tail.join(" "))
	    }
	}

	def void storeUserInSession(HttpServletRequest request, Optional<User> user, String password, Optional<TokenHolder> tokenHolder) {
		val session = request.getSession(true)
		if (user.present) {
			logger.debug("Logging in user '{}'", user.get.username)
			session.setAttribute(SessionKeys.CURRENT_USER, user.get)
		}
		if (tokenHolder.present) {
			logger.debug("Storing access token")
			session.setAttribute(SessionKeys.ACCESS_TOKEN, tokenHolder.get)
		}
		session.setAttribute(SessionKeys.PASSWORD, password)
	}

	def Optional<TokenHolder> loginUser(String username, String password) {
		try {
			val tokenResponse = client.requestToken(username, password)
			val validationResponse = client.validate(tokenResponse.accessToken)
			if (validationResponse.valid) {
				Optional.of(new TokenHolder(tokenResponse))
			} else {
				Optional.absent
			}
		} catch (UniformInterfaceException ex) {
			logger.debug("Failed login: {}", ex.message)
			Optional.absent
		} catch (Exception ex) {
			logger.debug("Failed login: {}", ex)
			Optional.absent
		}
	}

	def Optional<User> getUserInfo(String username) {
		try {
			val user = client.getUserByUsername(username)
			if(user.present) Optional.of(user.get.toUser) else Optional.absent
		} catch (Exception ex) {

			// Note: The WSO2Admin user is not accessible via SCIM 
			logger.debug("Error getting user from SCIM: {}", ex.message)
			Optional.absent
		}
	}

	protected def void redirectTo(URI target) {
		throw new WebApplicationException(Response.seeOther(target).build)
	}

}
