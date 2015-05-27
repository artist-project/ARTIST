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
import java.net.Socket
import java.security.KeyStore
import java.security.Principal
import java.security.PrivateKey
import java.security.cert.X509Certificate
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.X509KeyManager
import java.io.File

/**
	 * Inspired from
	 * http://java.sun.com/javase/6/docs/technotes/guides/security/
	 * jsse/JSSERefGuide.html
	 * 
	 */
class CustomKeyManager implements X509KeyManager {

	private static val FILE_PREFIX = "file:"
	private static val CLASSPATH_PREFIX = "classpath:"

	/*
		 * The default PKIX X509KeyManager. We'll delegate decisions to it, and
		 * fall back to the logic in this class if the default X509KeyManager
		 * doesn't trust it.
		 */
	var X509KeyManager pkixKeyManager

	new(String keyStorePath, char[] password) throws Exception {		

		// create a "default" JSSE X509KeyManager.
		val ks = KeyStore.getInstance("JKS")
		
		switch(keyStorePath) {
			case keyStorePath.startsWith(FILE_PREFIX): {
				val path = keyStorePath.substring(FILE_PREFIX.length)
				val file = new File(path)
				if (!file.exists || !file.canRead) {
					throw new IllegalArgumentException('''keyStorePath '«path»' does not exist in the file system or cannot be read.''')
				}
				ks.load(new FileInputStream(file), password)
			}
			case keyStorePath.startsWith(CLASSPATH_PREFIX): {
				val path = keyStorePath.substring(CLASSPATH_PREFIX.length)
				val stream = this.class.getResourceAsStream(path)
				if (stream == null) {
					throw new IllegalArgumentException('''keyStorePath '«path»' does not exist on the classpath or cannot be read.''')
				}
				ks.load(stream, password)
			}
			default: {
				throw new IllegalArgumentException('''trustStorePath must start with '«FILE_PREFIX»' or '«CLASSPATH_PREFIX»'.''')
			}
		}

		val kmf = KeyManagerFactory.getInstance("SunX509", "SunJSSE")
		kmf.init(ks, password)

		val kms = kmf.getKeyManagers()

		/*
			 * Iterate over the returned keymanagers, look for an instance of
			 * X509KeyManager. If found, use that as our "default" key manager.
			 */
		for (km : kms) {
			if (km instanceof X509KeyManager) {
				pkixKeyManager = km
				return
			}
		}

		/*
			 * Find some other way to initialize, or else we have to fail the
			 * constructor.
			 */
		throw new Exception("Couldn't initialize");
	}

	override PrivateKey getPrivateKey(String arg0) {
		return pkixKeyManager.getPrivateKey(arg0);
	}

	override X509Certificate[] getCertificateChain(String arg0) {
		return pkixKeyManager.getCertificateChain(arg0);
	}

	override String[] getClientAliases(String arg0, Principal[] arg1) {
		return pkixKeyManager.getClientAliases(arg0, arg1);
	}

	override String chooseClientAlias(String[] arg0, Principal[] arg1, Socket arg2) {
		return pkixKeyManager.chooseClientAlias(arg0, arg1, arg2);
	}

	override String[] getServerAliases(String arg0, Principal[] arg1) {
		return pkixKeyManager.getServerAliases(arg0, arg1);
	}

	override String chooseServerAlias(String arg0, Principal[] arg1, Socket arg2) {
		return pkixKeyManager.chooseServerAlias(arg0, arg1, arg2);
	}
}
