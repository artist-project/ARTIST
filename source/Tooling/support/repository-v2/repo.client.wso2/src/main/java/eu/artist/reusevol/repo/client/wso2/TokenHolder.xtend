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

import com.google.common.base.Preconditions
import eu.artist.reusevol.repo.client.wso2.dto.AccessTokenResponse
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString
import org.joda.time.DateTime

@Accessors @ToString
class TokenHolder {
	
	val AccessTokenResponse accessToken
	val DateTime expirationTime
	
	new(AccessTokenResponse accessToken) {
		Preconditions.checkNotNull(accessToken)
		Preconditions.checkNotNull(accessToken.expiresIn)
		
		this.accessToken = accessToken
		this.expirationTime = try {
			val tokenLifeTimeinSeconds = Integer.parseInt(accessToken.expiresIn)
			DateTime.now.plusSeconds(tokenLifeTimeinSeconds.intValue)
		} catch(NumberFormatException ex) {
			new DateTime
		}
	}
	
	def boolean isExpired() {
		expirationTime.isBeforeNow
	}
	
	def getToken() {
		accessToken.accessToken
	}

	def getRefreshToken() {
		accessToken.refreshToken
	}
	
}