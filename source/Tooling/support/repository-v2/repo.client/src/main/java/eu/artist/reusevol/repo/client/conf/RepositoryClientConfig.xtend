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
 
package eu.artist.reusevol.repo.client.conf

import eu.artist.reusevol.repo.config.Wso2Configuration
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class RepositoryClientConfig {
	var String baseRepositoryUri = "http://localhost:8080"
	
	var boolean logMessagesForDebugging = false
	
	var String username
	
	var String password

	var Wso2Configuration wso2Config = new Wso2Configuration
}