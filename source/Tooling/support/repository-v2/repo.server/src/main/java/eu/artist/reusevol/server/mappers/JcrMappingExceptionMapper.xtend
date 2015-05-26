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
 
package eu.artist.reusevol.server.mappers

import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import javax.jcr.AccessDeniedException
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import javax.ws.rs.ext.ExceptionMapper
import javax.ws.rs.ext.Provider
import org.jcrom.JcrMappingException
import org.slf4j.LoggerFactory

@Provider
class JcrMappingExceptionMapper implements ExceptionMapper<JcrMappingException> {
	
	static val logger = LoggerFactory.getLogger(JcrMappingExceptionMapper)
	
	override toResponse(JcrMappingException exception) {
		val cause = exception.cause
		switch(cause) {
			AccessDeniedException case cause: {
				val user = CurrentUserHolder.currentUser.get
				logger.info("Access denied to user {}: {}", user?.username, cause.message)
				
				Response.status(Status.UNAUTHORIZED).build
			}
			default: {
				logger.debug("JcrMappingexception: {}", cause)
				Response.status(Status.INTERNAL_SERVER_ERROR).build
			}
		}
	}	
}