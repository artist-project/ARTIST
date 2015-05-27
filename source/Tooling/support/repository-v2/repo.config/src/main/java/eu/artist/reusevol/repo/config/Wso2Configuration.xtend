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
 
package eu.artist.reusevol.repo.config

import com.fasterxml.jackson.annotation.JsonProperty
import org.eclipse.xtend.lib.annotations.Accessors
import org.hibernate.validator.constraints.NotEmpty
import eu.artist.reusevol.repo.config.SSLConfiguration
import javax.validation.constraints.NotNull
import org.hibernate.validator.constraints.URL

/**
 * Configuration of the WSO2 IS client that can access the following functionality
 * of the WSO2 Identity Server:
 * <ul>
 * <li>Request a OAuth2 token using the 'password' grant type</li>
 * <li>Validate a OAuth2 token</li>
 * <li>Manage users and groups/roles via the SCIM webservice interface of the WSO2 IS</li>
 * </ul>
 */
@Accessors
class Wso2Configuration {
	
	/**
	 * Since the communication with WSO2 IS is running over HTTPS, a SSL configuration
	 * has to be provided. 
	 */
	@JsonProperty
	@NotNull
	var SSLConfiguration ssl = new SSLConfiguration
	
	/**
	 * The base url that the WSO2 IS instance is running under.
	 */
	@JsonProperty
	@NotEmpty
	@URL
	var String wso2BaseUrl = "https://artist-demo.iao.fraunhofer.de"

	/**
	 * The OAuth2 client id provided by the registered ARTIST Repository Service in WSO2. You can get this value via
	 * the WSO2 Web console.  
	 */
	@JsonProperty
	@NotEmpty
	var String oAuthClientId = null

	/**
	 * The OAuth2 client secret provided by the registered ARTIST Repository Service in WSO2. You can get this value via
	 * the WSO2 Web console.  
	 */
	@JsonProperty
	@NotEmpty
	var String oAuthClientSecret = null

	/**
	 * The name of the tenant in in WSO2 that holds the repository users. 
	 * Match this with your WSO2 configuration. This is used only for user/group management.
	 */
	@JsonProperty
	@NotEmpty
	var String tenant = "repo.artist.eu"

	/**
	 * The username of the admin account of the tenant in in WSO2 that holds the repository users. 
	 * Match this with your WSO2 configuration. This is used only for user/group management.
	 */
	@JsonProperty
	@NotEmpty
	var String adminUsername = null

	/**
	 * The password of the admin account of the tenant in in WSO2 that holds the repository users. 
	 * Match this with your WSO2 configuration. This is used only for user/group management.
	 */
	@JsonProperty
	@NotEmpty
	var String adminPassword = null

	/**
	 * Flag to disable authentication in the ARTIST Repository. If enabled, the WSO2 IS is not contacted
	 * to validate the user token, but an anonymous user is logged in with group specified in the 
	 * Authorization header.
	 */
	@JsonProperty
	var boolean useAnonymousUserForTesting = false

	/**
	 * Flag to enable the logging of all message exchanges between the ARTIST Repository and WSO2 IS
	 * for debugging purposes. Don't use this in production.
	 */
	@JsonProperty
	var boolean logMessagesForDebugging = false
	
	/**
	 * The name of the user store in WSO2 that holds the repository users. 
	 * This can usually be left untouched and is used only for user/group management. 
	 */
	@JsonProperty
	@NotEmpty
	var String userStore = "PRIMARY"

	new() {}

	/**
	 * Gets the URL of the token validation endpoint.
	 */
	def String getTokenValidationUrl() {
		wso2BaseUrl + "/services/OAuth2TokenValidationService"
	} 

	/**
	 * Gets the URL of the token request endpoint.
	 */
	def String getTokenRequestUrl() {
		wso2BaseUrl + "/oauth2/token"
	} 

	/**
	 * Gets the URL of the SCIM user management endpoint.
	 */
	def String getScimUserUrl() {
		wso2BaseUrl + "/wso2/scim/Users"
	} 
	
	/**
	 * Gets the URL of the SCIM group management endpoint.
	 */
	def String getScimGroupUrl() {
		wso2BaseUrl + "/wso2/scim/Groups"
	} 

}
