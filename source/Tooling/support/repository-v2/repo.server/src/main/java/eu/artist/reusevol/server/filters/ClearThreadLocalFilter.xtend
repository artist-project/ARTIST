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
 
package eu.artist.reusevol.server.filters

import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.server.core.modeshape.SessionHolder
import java.io.IOException
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.ws.rs.ext.Provider
import javax.ws.rs.ext.WriterInterceptor
import org.slf4j.LoggerFactory

@Provider
class ClearThreadLocalFilter implements Filter {
	
	private static val logger = LoggerFactory.getLogger(WriterInterceptor)
	
	override init(FilterConfig filterConfig) throws ServletException {
		logger.debug("INIT")
	}
	
	override doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response)
		println("Clearing ThreadLocal")
		
		CurrentUserHolder.currentUser.remove
		
		val session = SessionHolder.currentSession.get
		session?.logout
		SessionHolder.currentSession.remove
	}
	
	override destroy() {
		logger.debug("DESTROY")
	}
	
}