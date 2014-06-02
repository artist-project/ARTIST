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
package eu.artist.reusevol.repo.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ExceptionMapper;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;

@Provider
public class CouldNotCreateExceptionHandler implements ExceptionMapper<EntityCreationException> {

	@Override
	public Response toResponse(EntityCreationException ex) {
		
		String msg = ex.getMessage();
		StringBuilder response = new StringBuilder("<response>");
		response.append("<status>failed</status>");
		response.append("<message>"+msg+"</message>");
		response.append("</response>");
		
		return Response.serverError().entity(response.toString()).build();	}
}
