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
 
package eu.artist.reusevol.server.core.modeshape

import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.security.RepoUsers
import java.util.Map
import javax.jcr.Credentials
import org.modeshape.jcr.ExecutionContext
import org.modeshape.jcr.ModeShapeRoles
import org.modeshape.jcr.security.AuthenticationProvider
import org.modeshape.jcr.security.SecurityContext

/**
 * An implementation of {@link AuthenticationProvider} that to a supplied user instance
 * for all authentication and <i>role-based</i> authorization.
 */
class InternalUserAuthProvider implements AuthenticationProvider {

    override ExecutionContext authenticate(Credentials credentials,
                                          String repositoryName,
                                          String workspaceName,
                                          ExecutionContext repositoryContext,
                                          Map<String, Object> sessionAttributes ) {
        if (credentials instanceof UserCredentials) {
            val user = credentials.user
            if (user != null) {
            	// Authenticated user
                return repositoryContext.with(new UserSecurityContext(user))
            } else {
            	// Anonymous user or user with failed authenticating
                return repositoryContext.with(new UserSecurityContext(RepoUsers.ANONYMOUS_USER))
            }
        }
        return null
    }

    protected static class UserSecurityContext implements SecurityContext {
        var User user

        protected new(User user) {
            this.user = user
        }

        public override boolean isAnonymous() {
            return false
        }

        public final override String getUserName() {
            return user?.username
        }

        public final override boolean hasRole( String roleName ) {
        	if (user == null) {
        		return false        		
    		}
        	
        	if (user.equals(RepoUsers.ANONYMOUS_USER)) {
            	// Anonymous user or user with failed authentication
            	
            	// Allow only read access
	        	if (roleName.equals(ModeShapeRoles.READONLY)) return true
        	} else {
            	// Authenticated user

            	// Allow read and write access
	        	if (roleName.equals(ModeShapeRoles.READONLY)) return true
	        	if (roleName.equals(ModeShapeRoles.READWRITE)) return true
        	}
            val hasGroup = !user.groups.filter[ it.name.equals(roleName) ].empty
            hasGroup
        }

        public override void logout() {
            user = null 
        }
    }
}