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
 
package eu.artist.reusevol.server.core.security

import com.google.inject.AbstractModule
import com.google.inject.matcher.Matchers
import com.sun.jersey.api.NotFoundException
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.server.resources.ProjectResource
import org.aopalliance.intercept.MethodInterceptor
import org.aopalliance.intercept.MethodInvocation

class SecurityModule extends AbstractModule {

	val AuthorizationPoint authorizer

	new() {
		this.authorizer = new AuthorizationPoint
	}

	override void configure() {
		bind(ProjectResource)
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Secure), new AuthorizationInterceptor(authorizer))
	}

	static class AuthorizationInterceptor implements MethodInterceptor {
		// private static val logger = LoggerFactory.getLogger(AuthorizationInterceptor)

		val AuthorizationPoint authorizer
		
		new(AuthorizationPoint authorizer) {
			this.authorizer = authorizer
		}

		override Object invoke(MethodInvocation invocation) throws Throwable {
			val user = CurrentUserHolder.currentUser.get
			
			if (authorizer.authorize(user, invocation) == AuthorizationPoint.AuthorizationResult.DENY) {
				throw new NotFoundException
			}
			return invocation.proceed()
		}
	}
}
