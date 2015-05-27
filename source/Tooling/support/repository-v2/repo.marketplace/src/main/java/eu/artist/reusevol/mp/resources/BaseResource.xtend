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
import com.sun.jersey.api.client.UniformInterfaceException
import eu.artist.reusevol.mp.util.SessionKeys
import eu.artist.reusevol.repo.client.wso2.TokenHolder
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.common.model.User
import javax.servlet.http.HttpSession
import org.slf4j.LoggerFactory

class BaseResource {
	
	private static val logger = LoggerFactory.getLogger(BaseResource)
	
	val Wso2Client client
	
	new(Wso2Client client) {
		this.client = client
	}
	
	protected def Optional<String> getToken(HttpSession session) {
		val tokenHolder = session.getAttribute(SessionKeys.ACCESS_TOKEN) as TokenHolder
		if (tokenHolder == null) return Optional.absent
		
		if (!tokenHolder.expired) {
			Optional.fromNullable(tokenHolder.token)
		} else {
			val user = session.getAttribute(SessionKeys.CURRENT_USER) as User
			if (user == null) return Optional.absent
			val password = session.getAttribute(SessionKeys.PASSWORD) as String
			if (password == null) return Optional.absent
			
			val token = loginUser(user.username, password)
			if (!token.present) Optional.absent
			
			session.setAttribute(SessionKeys.ACCESS_TOKEN, token.get)
			Optional.fromNullable(token.get.token)
		}
	}
	
	def Optional<TokenHolder> loginUser(String username, String password) {
		try {
			val tokenResponse = client.requestToken(username, password)
			if (tokenResponse == null) return Optional.absent
			Optional.fromNullable(new TokenHolder(tokenResponse))
		} catch (UniformInterfaceException ex) {
			logger.debug("Failed login: {}", ex.message)
			Optional.absent
		} catch (Exception ex) {
			logger.debug("Failed login: {}", ex)
			Optional.absent
		}
	}
}