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
 
package eu.artist.reusevol.repo.client.ssl;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

/**
 * DO NOT USE IN PRODUCTION!!!!
 * 
 * This class will simply trust everything that comes along.
 * 
 * Taken from http://stackoverflow.com/questions/19723415/java-overriding-function-to-disable-ssl-certificate-check
 * 
 * @author frank
 * 
 */
public class TrustAllX509TrustManager implements X509TrustManager {
	
	public X509Certificate[] getAcceptedIssuers() {
		return new X509Certificate[0];
	}

	public void checkClientTrusted(java.security.cert.X509Certificate[] certs,
			String authType) {
	}

	public void checkServerTrusted(java.security.cert.X509Certificate[] certs,
			String authType) {
	}

}
