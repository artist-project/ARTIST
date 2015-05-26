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
 
package eu.artist.reusevol.server.core.security

import com.google.common.base.Optional
import com.google.common.base.Splitter
import com.sun.jersey.api.core.HttpContext
import com.sun.jersey.api.model.Parameter
import com.sun.jersey.core.spi.component.ComponentContext
import com.sun.jersey.core.spi.component.ComponentScope
import com.sun.jersey.server.impl.inject.AbstractHttpContextInjectable
import com.sun.jersey.spi.inject.Injectable
import com.sun.jersey.spi.inject.InjectableProvider
import io.dropwizard.auth.Auth
import io.dropwizard.auth.AuthenticationException
import io.dropwizard.auth.Authenticator
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import org.slf4j.LoggerFactory

import static eu.artist.reusevol.server.core.security.Wso2SecurityProvider.*
import eu.artist.reusevol.repo.common.model.User
import com.google.common.cache.CacheLoader.InvalidCacheLoadException
import eu.artist.reusevol.repo.common.model.Group
import eu.artist.reusevol.repo.common.user.CurrentUserHolder

/**
* An example security provider that will look at each request when received by an endpoint using the auth attribute
* and check that it has a header value containing a token and will authenticate the token to get the Principle (User)
* for the request (otherwise throw an AuthenticationException). That Principle is the authenticated User associated
* with the request and the resource method handling the request can use it to check authorisation to perform actions.
*
* @param <T> The Principle class (User) to be returned when a request is authenticated
*/
class Wso2SecurityProvider implements InjectableProvider<Auth, Parameter> {
	
	// private static val logger = LoggerFactory.getLogger(Wso2SecurityProvider)
	
	public static val AUTH_TYPE = "Bearer"
	public static val AUTH_PRINCIPAL_KEY = "eu.artist.repo.principal"
	val Authenticator<String, User> authenticator
	val boolean testingWithAnonymousUser
	
	public new(Authenticator<String, User> authenticator, boolean testingWithAnonymousUser) {
		this.authenticator = authenticator
		this.testingWithAnonymousUser = testingWithAnonymousUser
	}

	private static class Wso2SecurityInjectable extends AbstractHttpContextInjectable<User> {
		
		private static val logger = LoggerFactory.getLogger(Wso2SecurityInjectable)

		val Authenticator<String, User> authenticator
		val boolean required
		val boolean testingWithAnonymousUser
		
		private new(Authenticator<String, User> authenticator, boolean required, boolean testingWithAnonymousUser) {
			this.authenticator = authenticator
			this.required = required
			this.testingWithAnonymousUser = testingWithAnonymousUser
		}

		override User getValue(HttpContext c) {

			// This is where the credentials are extracted from the request
			val header = c.getRequest().getHeaderValue(HttpHeaders.AUTHORIZATION)
			try {
				if (header != null) {
					val elements = Splitter.on(" ").split(header)
					if (elements.size == 2) {
						val type = elements.get(0)
						if (type.equalsIgnoreCase(AUTH_TYPE)) {
							val token = elements.get(1)
							
							val Optional<User> result = if (!testingWithAnonymousUser) {
								// use actual authorization via WSO2															
								try {
									authenticator.authenticate(token)
								} catch(IllegalArgumentException ex) {
									logger.warn("Error authenticating user: ", ex)
									Optional.absent
								} catch(InvalidCacheLoadException ex) {
									// This may e.g. happen, when the WSO2Admin user tries to log in, since it is not accessible via the SCIM service
									logger.debug("User for ScimId {} could not be retrieved from authentication cache: {}", token, ex.message)
									Optional.absent
								}	
							} else {
								val groups = Splitter.on(",").split(token)
								val user = new User(null, "tester", "Test user", null, groups.map[ new Group(it) ].toList)
								logger.warn('''Authenticating user «user.username» for testing with groups «user.groups.map[name]»''')
								Optional.of(user)
							}
							
							if (result.isPresent()) {
								// Store the principal in ThreadLocal
								CurrentUserHolder.currentUser.set(result.get)
								return result.get()
							}
						}
					}
				}
			} catch (AuthenticationException e) {
                logger.warn("Error authenticating credentials", e);
                throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
			}
			if (required) {
                throw new WebApplicationException(Response.status(Response.Status.UNAUTHORIZED)
                                                          .entity("Credentials are required to access this resource.")
                                                          .type(MediaType.TEXT_PLAIN_TYPE)
                                                          .build());
			}
			return null
		}
	}

	override ComponentScope getScope() {
		return ComponentScope.PerRequest
	}

	override Injectable<User> getInjectable(ComponentContext ic, Auth auth, Parameter parameter) {
		return new Wso2SecurityInjectable(authenticator, auth.required(), testingWithAnonymousUser)
	}
}
