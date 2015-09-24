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
 
package eu.artist.reusevol.server.core.dao

import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.Group
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.server.core.GenericDaoTemplate
import eu.artist.reusevol.server.core.security.RepoGroups
import eu.artist.reusevol.server.core.security.privileges.PermissionUtils
import javax.jcr.Session
import org.jcrom.Jcrom

class ProjectDao extends GenericDaoTemplate<RepoProject> {
	
	public static val BASE = "/projects" 
	
	new(Session session, Jcrom jcrom) {
		super(session, jcrom, RepoProject, "ar:project", BASE)
	}
	
	override setupPermissions(RepoProject entity) {
		val projectGroup = new Group(RepoGroups.GROUP_PREFIX + entity.id)
		val user = CurrentUserHolder.currentUser.get
		
		if (user != null) {
			PermissionUtils.setPermission(session, entity.jcrPath, user, 	Permission.MANAGE)
		}
		PermissionUtils.setPermission(session, entity.jcrPath, projectGroup, Permission.VIEW)
	}
	
}