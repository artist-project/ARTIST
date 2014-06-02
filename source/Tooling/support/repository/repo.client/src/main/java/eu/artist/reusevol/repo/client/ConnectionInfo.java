/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.client;

/**
 * This class stores the information needed to establish a connection to the
 * repository service.
 * 
 * @author strauss
 * 
 */
public class ConnectionInfo {
	private final String baseURI;
	private final String username;
	private final String password;

	/**
	 * Create a ConnectionInfo instance.
	 * 
	 * @param baseURI
	 * @param username
	 * @param password
	 */
	public ConnectionInfo(String baseURI, String username, String password) {
		this.baseURI = baseURI;
		this.username = username;
		this.password = password;
	}

	/**
	 * Gets the repository service base URI.
	 * 
	 * @return the baseURI
	 */
	public String getBaseURI() {
		return baseURI;
	}

	/**
	 * Gets the username.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
}
