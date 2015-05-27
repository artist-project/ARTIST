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

import com.google.common.base.Optional
import com.google.common.base.Strings
import com.sun.jersey.api.client.AsyncWebResource
import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.WebResource
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.wso2.TokenHolder
import eu.artist.reusevol.repo.client.wso2.TokenRequestClient
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response.Status
import org.eclipse.xtend.lib.annotations.Accessors

abstract class BaseClient {
	// Inspired by http://stackoverflow.com/questions/26621838/dropwizard-jersey-api-clients

	private static val AUTHORIZATION_HEADER = "Authorization"
	private static val TOKEN_PREFIX = "Bearer "

	val Client client
	val RepositoryClientConfig config
	var TokenHolder tokenHolder
	val TokenRequestClient tokenClient
	
	@Accessors
	var String manualAccessToken

	protected new(Client client, RepositoryClientConfig config) {
		this.client = client
		this.config = config
		this.tokenHolder = null
	    this.tokenClient = TokenClientFactory.getInstance(config)
	    this.manualAccessToken = null
	}

	protected def getSynchronousResource(String resourceUri, (WebResource) => WebResource settings) {
		val accessToken = if (Strings.isNullOrEmpty(manualAccessToken)) tokenClient.token else Optional.of(manualAccessToken)
		val resource = settings.apply(client.resource(config.baseRepositoryUri).path(resourceUri)).type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
		if (accessToken.present) {
			resource.header(AUTHORIZATION_HEADER, TOKEN_PREFIX + accessToken.get)
		} else {
			resource
		}
	}

	protected def getAsynchronousResource(String resourceUri, (AsyncWebResource) => AsyncWebResource settings) {
		val accessToken = if (Strings.isNullOrEmpty(manualAccessToken)) tokenClient.token else Optional.of(manualAccessToken)
		val resource = settings.apply(client.asyncResource(config.baseRepositoryUri).path(resourceUri)).type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
		if (accessToken.present) {
			resource.header(AUTHORIZATION_HEADER, TOKEN_PREFIX + accessToken.get)
		} else {
			resource
		}
	}

	protected def void isAlive() {
		client.resource(config.baseRepositoryUri).path("/projects").head().status == Status.OK
	}

	protected def void isWso2Alive() {
		client.resource(config.wso2Config.tokenRequestUrl).head().status == 405
	}

}
