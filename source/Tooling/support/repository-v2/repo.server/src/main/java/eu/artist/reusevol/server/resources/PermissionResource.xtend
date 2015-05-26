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
 
package eu.artist.reusevol.server.resources

import com.sun.jersey.api.NotFoundException
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.service.GenericService
import eu.artist.reusevol.repo.common.util.Depth
import java.util.List
import javax.ws.rs.core.Response
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class PermissionResource<T extends JcrStorable, I extends Identifiable> {

	// 	private static val logger = LoggerFactory.getLogger(PermissionResource)

	val GenericService<T> service
	val I id
	
	new(GenericService<T> service, I id) {
		this.service = service
		this.id = id
	}

	def List<PermissionEntry> getPermissions() {
		val entity = service.get(id, Depth.ENTITY)
		if (entity.present) {
			service.getPermissions(entity.get)
		} else {
			throw new NotFoundException
		}
	}
	
	def Response setPermissions(List<PermissionEntry> permissions) {
		val entity = service.get(id, Depth.ENTITY)
		if (entity.present) {
			service.setPermissions(entity.get, permissions)
			Response.ok.build
		} else {
			throw new NotFoundException
		}
	}
}