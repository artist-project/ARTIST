/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.users;

import eu.artist.postmigration.eubt.applications.Application;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public interface ApplicationUser {

	/**
	 * Get the application this user is assigned to
	 * 
	 * @return application this user is assigned to
	 */
	public Application getApplication();

	/**
	 * Fire a request and return a response
	 * 
	 * @param request the request to be fired
	 * @exception Exception exception cause by e.g. service not available
	 * @return response yielded by firing the given request
	 */
	public Response fireRequest(Request request) throws EUBTException;

}
