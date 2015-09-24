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
import com.google.common.base.Strings
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.core.service.UserService
import io.dropwizard.auth.AuthenticationException
import io.dropwizard.auth.Authenticator
import javax.inject.Inject
import org.slf4j.LoggerFactory

class Wso2OAuthAuthenticator implements Authenticator<String, User> {
	
	private static val logger = LoggerFactory.getLogger(Wso2OAuthAuthenticator)
	
	val Wso2Client client
	val UserService userService
	
	@Inject
	new(Wso2Client client, UserService userService) {
		this.client = client
		this.userService = userService
	}
	
	override authenticate(String credentials) throws AuthenticationException {
		logger.debug('''Authenticating «credentials».''')
		
		if (Strings.isNullOrEmpty(credentials)) return Optional.absent	
		
		val validationResult = client.validate(credentials)
		
		if (validationResult.valid) {
			val username = validationResult.authorizedUser.extractUsername
			
			val scimUser = try {
				client.getUserByUsername(username)
			} catch(Exception ex) {
				// Note: The WSO2Admin user is not accessible via SCIM 
				logger.debug("Error getting user from SCIM", ex)
				Optional.absent
			}

			logger.debug('''SCIM user «scimUser»''')
			
			if (!scimUser.present) return null
			
			val user = scimUser.get.toUser
			CurrentUserHolder.currentUser.set(user)

			logger.debug('''Authenticated user «user.username»''')
			
			userService.doAsUser(RepoUsers.ADMIN_USER) [
				if (exists(user)) {
					update(user, Depth.ENTITY)
				} else {
					create(user)
				}
			]
			
			Optional.of(user)
		} else {
			return Optional.absent
		}
	}
	
	def extractUsername(String fullname) {
		Splitter.on("@").split(fullname).get(0)
	}
	
}