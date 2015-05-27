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

/**
 * Configuration of the key- and truststores used for SSL connections of the REST client. 
 */
@Accessors
class SSLConfiguration {

	/**
	 * Enable a dummy trustore that trusts all sever certificates. This is convenient for
	 * testing but should not be used in production.
	 */
	@JsonProperty
	var boolean trustAllCertificates = false

	/**
	 * The path to the trust store that contains the server certificate relative to the directory
	 * that the server has been started in. Paths must start with "classpath:" followed by an 
	 * absolute path or "file:".
	 */
	@JsonProperty
	@NotEmpty
	var String trustStorePath = "classpath:/etc/security/client-truststore.jks"

	/**
	 * The password of the truststore.
	 */
	@JsonProperty
	@NotEmpty
	var String trustStorePassword = "wso2carbon"

	/**
	 * The path to the key store that contains the server certificate relative to the directory
	 * that the server has been started in. Paths must start with "classpath:" followed by an 
	 * absolute path or "file:".
	 */
	@JsonProperty
	@NotEmpty
	var String keyStorePath = "classpath:/etc/security/client-truststore.jks"

	/**
	 * The password of the keystore.
	 */
	@JsonProperty
	@NotEmpty
	var String keyStorePassword = "wso2carbon"
}
