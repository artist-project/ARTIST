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
 
package eu.artist.reusevol.repo.client

import com.sun.jersey.api.client.Client
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import javax.validation.Validation
import org.slf4j.LoggerFactory
import com.sun.jersey.api.client.filter.LoggingFilter

class RepositoryClient {
	
	private static val logger = LoggerFactory.getLogger(RepositoryClient)
	
	val Client client
	val Wso2Client wso2Client
	val RepositoryClientConfig config
	
	val String manualAccessToken
	
	new(RepositoryClientConfig config, String manualAccessToken) {
		this.config = validateConfig(config)

		this.client = Client.create
		if (config.logMessagesForDebugging) {
			client.addFilter(new LoggingFilter(System.out))
		}
				
		this.wso2Client = new Wso2Client(config.wso2Config)
		
		this.manualAccessToken = manualAccessToken
	}

	new(RepositoryClientConfig config) {
		this(config, null)
	}

	private def validateConfig(RepositoryClientConfig config) {
		val factory = Validation.buildDefaultValidatorFactory()
		val validator = factory.validator
		val violations = validator.validate(config)
		if (!violations.empty) {
			violations.forEach[
				logger.error("Error in configuration: {} {}", it.propertyPath, it.message)
			]
			throw new IllegalArgumentException(violations.size + " error(s) in configuration.")
		}
		config
	} 
	
	def getProjectManager() {
		val pm = new ProjectManager(client, config)
		pm.manualAccessToken = manualAccessToken
		pm
	}
	
	def getCategoryManager() {
		new CategoryManager(client, config)
	}

	def getArtefactManager(String project) {
		new ArtefactManager(client, config, project)
	}

	def getUserManager() {
		this.wso2Client
	}
	
	def getConfig() {
		config
	}
}