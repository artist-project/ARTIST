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
 
package eu.artist.reusevol.repo.client.wso2.dto

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import com.fasterxml.jackson.annotation.JsonProperty

@Accessors @ToString @EqualsHashCode
class AccessTokenResponse {
	@JsonProperty("token_type")
	var String tokenType
	
	@JsonProperty("expires_in")
	var String expiresIn

	@JsonProperty("refresh_token")
	var String refreshToken

	@JsonProperty("access_token")
	var String accessToken
}