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
 
package eu.artist.reusevol.repo.client.util

import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.wso2.TokenRequestClient

class TokenClientFactory {
	
	private static var TokenRequestClient instance = null
	
	public static def getInstance(RepositoryClientConfig config) {
		if (instance == null) {
			instance = new TokenRequestClient(config.wso2Config, config.username, config.password)
		}
		instance
	}
	
}