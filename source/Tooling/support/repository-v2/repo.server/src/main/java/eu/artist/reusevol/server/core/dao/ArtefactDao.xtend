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

import com.google.common.base.Preconditions
import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.server.core.GenericDaoTemplate
import eu.artist.reusevol.server.core.security.privileges.PermissionUtils
import javax.jcr.Session
import org.eclipse.xtend.lib.annotations.Accessors
import org.jcrom.Jcrom

class ArtefactDao extends GenericDaoTemplate<RepoArtefact> {

	static val PUBLIC_PROJECT = "public"
	
	@Accessors
	var String projectId
	
	new(Session session, Jcrom jcrom) {
		super(session, jcrom, RepoArtefact, "ar:artefact", ProjectDao.BASE + "/" + PUBLIC_PROJECT)
	}
	
	def void setProjectId(String projectId) {
		Preconditions.checkNotNull(projectId)

		this.projectId = projectId
		basePath = '''«ProjectDao.BASE»/«projectId»'''
	}	
	
	override void setupPermissions(RepoArtefact entity) {
		val user = CurrentUserHolder.currentUser.get
		
		if (user != null) {
			PermissionUtils.setPermission(session, entity.jcrPath, user, Permission.MANAGE)
		}
	}

}