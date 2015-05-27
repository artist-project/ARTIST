/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.exceptions;

public class RepoClientException extends Exception {

	private static final long serialVersionUID = -4167768917309801390L;

	public RepoClientException() {
		super();
	}

	public RepoClientException(String message) {
		super(message);
	}

	public RepoClientException(Throwable throwable) {
		super(throwable);
	}

	public RepoClientException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
