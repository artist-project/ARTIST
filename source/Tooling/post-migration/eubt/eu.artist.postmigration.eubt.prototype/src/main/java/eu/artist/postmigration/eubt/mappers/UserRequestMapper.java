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
package eu.artist.postmigration.eubt.mappers;

import java.util.List;

import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.requests.Request;

/**
 * @author pneubaue
 * 
 */
public interface UserRequestMapper {

	/**
	 * Map a given request to another kind of request(s)
	 * 
	 * @param request the request to be mapped to the other kind of request
	 * @param migrationTraceModelLocation file path to the migration trace model
	 * @throws EUBTException e.g., in case the migration trace model could not
	 *             be located
	 * @return mapped request(s) corresponding to the given request
	 */
	public List<Request> mapRequest(Request request, String migrationTraceModelLocation) throws EUBTException;

}
