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
 
package eu.artist.reusevol.server

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.cache.CacheBuilderSpec
import eu.artist.reusevol.repo.config.Wso2Configuration
import io.dropwizard.Configuration
import org.eclipse.xtend.lib.annotations.Accessors
import org.hibernate.validator.constraints.NotEmpty

/**
 * Configuration options of the ARTIST Repository. 
 */
@Accessors
class RepositoryConfiguration extends Configuration {
	
	/**
	 * Path to the configuration file of the Modeshape JCR database relative to the directory
	 * the server is run in.
	 */
    @NotEmpty @JsonProperty
    var String repositoryConfigPath = "etc/modeshape/artist.json"
    
	/**
	 * Name of the JCR repository that host the ARTIST Repository data. The has to be consistent with
	 * the repository configured in the Modeshape configuration file. 
	 */
    @NotEmpty @JsonProperty
    var String repositoryName = "artist"

	/**
	 * Boolean flag to determine, if the HTTP(S) message exchange should be logged. This is useful
	 * for debugging. Deactivate in production.
	 */
    @JsonProperty
    var boolean logMessages = false
    
    /**
     * The maximal size and retainment time of the cache for authenticated users. The format is that
     * of the ChacheBuilder of the Google Guava library. 
     */
    @JsonProperty
    var CacheBuilderSpec authenticationCachePolicy = CacheBuilderSpec.parse("maximumSize=10000, expireAfterAccess=10m")
    
    /**
     * Configuration of the client that links the ARTIST Repository to the OAuth2 authentication and user management
     * provided by the WSO2 Identity Server. See the documentation of this file for reference. 
     */
    @JsonProperty
    var Wso2Configuration wso2
    
	new() {}
}
