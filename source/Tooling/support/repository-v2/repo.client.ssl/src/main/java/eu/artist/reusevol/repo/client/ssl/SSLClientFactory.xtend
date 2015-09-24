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
 
package eu.artist.reusevol.repo.client.ssl

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider
import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.config.DefaultClientConfig
import com.sun.jersey.client.urlconnection.HTTPSProperties
import eu.artist.reusevol.repo.config.SSLConfiguration
import java.security.GeneralSecurityException
import java.security.SecureRandom
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.KeyManager
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession
import javax.net.ssl.TrustManager

class SSLClientFactory {
	public static def Client getSSLClient(SSLConfiguration config) {
		val configuration = if (config.trustAllCertificates) {
			new DefaultClientConfig() => [
				properties.put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
					new HTTPSProperties(getHostnameVerifier(config), getAllowAllSSLContext(config)))
			]
		} else {
			new DefaultClientConfig => [
				properties.put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES,
					new HTTPSProperties(getHostnameVerifier(config), getSSLContext(config)))
			]
		}
		configuration.classes.add( JacksonJsonProvider )
		Client.create(configuration)
	}


	private static def HostnameVerifier getHostnameVerifier(SSLConfiguration config) {
		return new HostnameVerifier() {
			override boolean verify(String hostname, SSLSession sslSession) {
				return true
			}
		}
	}

	private static def SSLContext getSSLContext(SSLConfiguration config) {

		var TrustManager[] mytm = null;
		var KeyManager[] mykm = null;

		try {
			mytm = #[new CustomTrustManager(config.trustStorePath, config.trustStorePassword.toCharArray())]
			mykm = #[new CustomKeyManager(config.keyStorePath, config.keyStorePassword.toCharArray())]
		} catch (Exception ex) {
			ex.printStackTrace
		}

		var SSLContext ctx = null;
		try {
			ctx = SSLContext.getInstance("SSL")
			ctx.init(mykm, mytm, null);
		} catch (GeneralSecurityException ex) {
			ex.printStackTrace
		}

		return ctx
	}
		
	private static def SSLContext getAllowAllSSLContext(SSLConfiguration config) {
		
		var SSLContext ctx = null
		try {
			ctx = SSLContext.getInstance("SSL")
			ctx.init(null, #[ new TrustAllX509TrustManager() ], new SecureRandom())
		} catch (GeneralSecurityException ex) {
			ex.printStackTrace
		}

		return ctx
	}
		
}