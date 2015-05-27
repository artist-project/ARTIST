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
 
package eu.artist.reusevol.server.health

import com.codahale.metrics.health.HealthCheck
import javax.inject.Inject
import javax.jcr.Session
import javax.inject.Provider

class ModeshapeHealthCheck extends HealthCheck {
	 
	val Provider<Session> sessionProvider
	
	@Inject
	new(Provider<Session> sessionProvider) {
		this.sessionProvider = sessionProvider
	}
	
	override protected check() throws Exception {
		val session = sessionProvider.get
		
		val result = if ((session != null) && (session.live)) {
			HealthCheck.Result.healthy
		} else {
			HealthCheck.Result.unhealthy("JCR Session is not live")
		}
		session.logout
		
		result
	}	
}