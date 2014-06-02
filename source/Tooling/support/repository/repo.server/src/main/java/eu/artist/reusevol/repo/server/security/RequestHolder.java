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
package eu.artist.reusevol.repo.server.security;

import javax.enterprise.inject.Produces;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Helper class that stores the HttpServletRequest in ThreadLocal and makes it accessible via CDI.
 * 
 * (See http://rmannibucau.wordpress.com/2012/10/23/arquillian-warp-and-tomee/)  
 */
@WebFilter(urlPatterns = "/*")
public class RequestHolder implements Filter {
    public static final ThreadLocal<HttpServletRequest> REQUESTS = new ThreadLocal<HttpServletRequest>();

    @Produces
    public HttpServletRequest getRequest()
    {
    	return REQUESTS.get();
    }
    
    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        // no-op
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        REQUESTS.set((HttpServletRequest) request);
        try {
            chain.doFilter(request,response);
        } finally {
            REQUESTS.remove();
        }
    }

    @Override
    public void destroy() {
        // no-op
    }
}
