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

import java.io.FileInputStream
import java.security.KeyStore
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import javax.net.ssl.TrustManager
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager
import java.io.File

/**
 * Taken from
 * http://java.sun.com/javase/6/docs/technotes/guides/security/jsse
 * /JSSERefGuide.html
 * 
 */
public class CustomTrustManager implements X509TrustManager {

	private static val FILE_PREFIX = "file:"
	private static val CLASSPATH_PREFIX = "classpath:"

	/*
	 * The default PKIX X509TrustManager. We'll delegate decisions to it,
	 * and fall back to the logic in this class if the default
	 * X509TrustManager doesn't trust it.
	 */
	var X509TrustManager pkixTrustManager;

	new(String trustStorePath, char[] password) throws Exception {

		// create a "default" JSSE X509TrustManager.
		val KeyStore ks = KeyStore.getInstance("JKS");

		switch(trustStorePath) {
			case trustStorePath.startsWith(FILE_PREFIX): {
				val path = trustStorePath.substring(FILE_PREFIX.length)
				val file = new File(path)
				if (!file.exists || !file.canRead) {
					throw new IllegalArgumentException('''trustStorePath '«path»' does not exist in the file system or cannot be read.''')
				}
				ks.load(new FileInputStream(file), password)
			}
			case trustStorePath.startsWith(CLASSPATH_PREFIX): {
				val path = trustStorePath.substring(CLASSPATH_PREFIX.length)
				val stream = this.class.getResourceAsStream(path)
				if (stream == null) {
					throw new IllegalArgumentException('''trustStorePath '«path»' does not exist on the classpath or cannot be read.''')
				}
				ks.load(stream, password)
			}
			default: {
				throw new IllegalArgumentException('''trustStorePath must start with '«FILE_PREFIX»' or '«CLASSPATH_PREFIX»'.''')
			}
		}

		val TrustManagerFactory tmf = TrustManagerFactory.getInstance("PKIX");
		tmf.init(ks);

		val TrustManager[] tms = tmf.getTrustManagers();

		/*
			 * Iterate over the returned trustmanagers, look for an instance of
			 * X509TrustManager. If found, use that as our "default" trust
			 * manager.
			 */
		for (tm : tms) {
			if (tm instanceof X509TrustManager) {
				pkixTrustManager = tm
				return
			}
		}

		/*
			 * Find some other way to initialize, or else we have to fail the
			 * constructor.
			 */
		throw new Exception("Couldn't initialize");
	}

	/*
		 * Delegate to the default trust manager.
		 */
	override void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		try {
			pkixTrustManager.checkClientTrusted(chain, authType);
		} catch (CertificateException excep) {
			// do any special handling here, or rethrow exception.
		}
	}

	/*
		 * Delegate to the default trust manager.
		 */
	override void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		try {
			pkixTrustManager.checkServerTrusted(chain, authType);
		} catch (CertificateException excep) {
			/*
				 * Possibly pop up a dialog box asking whether to trust the cert
				 * chain.
				 */
		}
	}

	/*
		 * Merely pass this through.
		 */
	override X509Certificate[] getAcceptedIssuers() {
		return pkixTrustManager.acceptedIssuers
	}
}
