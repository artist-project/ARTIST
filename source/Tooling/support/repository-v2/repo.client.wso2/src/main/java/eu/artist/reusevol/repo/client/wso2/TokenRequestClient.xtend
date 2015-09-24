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
 
package eu.artist.reusevol.repo.client.wso2

import com.google.common.base.Optional
import com.sun.jersey.api.client.UniformInterfaceException
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.config.Wso2Configuration

class TokenRequestClient {
	
	var TokenHolder token
	val Wso2Client client
	val Wso2Configuration config
	val String username
	val String password
	
	new(Wso2Configuration config, String username, String password) {
		this.config = config
		this.client = new Wso2Client(config)
		this.token = null
		this.username = username
		this.password = password
	}
	
	def Optional<String> getToken() {
		if (token != null) {
			if (!token.isExpired) {
				return Optional.of(token.token)
			} else {
				refreshTokenHolder
				if ((token != null) && (!token.isExpired)) {
					return Optional.of(token.token)
				}
			}
		} else {
			refreshTokenHolder
			if ((token != null) && (!token.isExpired)) {
				return Optional.of(token.token)
			}
		}
		Optional.absent
	}
	
	private def refreshTokenHolder() {
		this.token = try {
			val result = client.requestToken(username, password)
			new TokenHolder(result)
		} catch(UniformInterfaceException ex) {
			null
		}
	}
}