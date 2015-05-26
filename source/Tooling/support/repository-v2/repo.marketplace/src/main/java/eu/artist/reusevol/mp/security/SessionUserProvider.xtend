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
 
package eu.artist.reusevol.mp.security

import com.sun.jersey.core.spi.component.ComponentContext
import com.sun.jersey.core.spi.component.ComponentScope
import com.sun.jersey.spi.inject.Injectable
import com.sun.jersey.spi.inject.InjectableProvider
import eu.artist.reusevol.mp.util.SessionKeys
import eu.artist.reusevol.repo.common.model.User
import java.lang.reflect.Type
import javax.servlet.http.HttpServletRequest
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Context
import javax.ws.rs.core.Response.Status
import javax.ws.rs.ext.Provider
import org.eclipse.xtend.lib.annotations.Accessors

@Provider
public class SessionUserProvider implements InjectableProvider<SessionUser, Type> {

	val HttpServletRequest request

	new(@Context HttpServletRequest request) {
		this.request = request
	}

	override Injectable<User> getInjectable(ComponentContext cc, SessionUser a, Type c) {
		if (c.equals(User)) {
			return new SessionUserInjectable(request, a.required)
		}
		return null
	}

	override ComponentScope getScope() {
		return ComponentScope.PerRequest
	}

	@Accessors
	static class SessionUserInjectable implements Injectable<User>  {
		val HttpServletRequest request
		val boolean required

		override User getValue() {
			val user = request.getSession(false)?.getAttribute(SessionKeys.CURRENT_USER) as User			
			
			if (user != null) return user

			if (required) {
				throw new WebApplicationException(Status.UNAUTHORIZED)
			} else {
				null				
			}
		}
	}
}
