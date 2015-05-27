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

import eu.artist.reusevol.repo.common.model.User

class RepoUsers {
	public static val ADMIN_USER = new User(null, "admin", "Admin", null, #[ RepoGroups.ADMIN_GROUP ]) 
	public static val ANONYMOUS_USER = new User(null, "anonymous", "Anonymous", null, #[ RepoGroups.ANONYMOUS_GROUP, RepoGroups.PUBLIC_GROUP ]) 
}