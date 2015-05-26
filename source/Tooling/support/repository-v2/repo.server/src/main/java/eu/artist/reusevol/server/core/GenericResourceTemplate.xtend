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
 
package eu.artist.reusevol.server.core

import com.google.common.base.Optional
import com.sun.jersey.api.NotFoundException
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.service.GenericService
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.util.DepthParam
import java.net.URI
import java.util.List
import javax.annotation.PreDestroy
import javax.inject.Inject
import javax.inject.Provider
import javax.jcr.AccessDeniedException
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Context
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import javax.ws.rs.core.UriInfo
import org.eclipse.xtend.lib.annotations.AccessorType
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory

import static extension org.eclipse.xtend.lib.annotations.AccessorType.*
import eu.artist.reusevol.server.core.modeshape.SessionHolder

class GenericResourceTemplate<T extends JcrStorable, I extends Identifiable, D extends GenericService<T>> implements GenericResource<T, I> {

	protected static val DEFAULT_DEPTH = Depth.CHILDREN
	
	protected val logger = LoggerFactory.getLogger(class.name)

	@Accessors(AccessorType.PUBLIC_GETTER)
	private val Provider<D> serviceProvider
	private var D serviceInstance
	
	@Accessors
	@Context
	private var UriInfo uriInfo
	
	@Inject
	new(Provider<D> serviceProvider) {
		this.serviceProvider = serviceProvider
	}
	
	new(D serviceInstance) {
		this.serviceProvider = new Provider<D>() {
			override get() {
				serviceInstance
			}
		}
	}

	protected def D getService() {
		if (serviceInstance == null) serviceInstance = serviceProvider.get
		serviceInstance
	}
	
	override Response create(T entity, User user) {
		if (service.exists(entity)) {
			Response.status(Response.Status.OK).entity(service.get(entity, DEFAULT_DEPTH).get).build
		} else {
			val result = service.create(entity)
			Response.created(new URI('''«uriInfo.absolutePath»/«result.id»''')).entity(result).build
		}
	}
	
	override delete(I id, User user) {
		service.delete(id)
	}
	
	override Optional<T> get(I id, Optional<DepthParam> depth, User user) {
		service.get(id, getActualDepth(depth))
	}

	override list(Optional<String> fiqlQuery, Optional<DepthParam> depth, User user) {
		if (fiqlQuery.present && (!fiqlQuery.get.empty)) {
			service.findByFiql(fiqlQuery.get, getActualDepth(depth))
		} else {
			service.findAll(getActualDepth(depth))
		}
	}
	
	override Optional<T> update(I id, T entity, Optional<DepthParam> depth, User user) {
		if (service.exists(id)) {
			if (id.id.equals(entity.id)) {
				service.update(entity, getActualDepth(depth))
			} else {
				service.move(id, entity)
				service.update(entity, getActualDepth(depth))
			}
		} else {
			Optional.fromNullable(service.create(entity))
		}
	}

	override List<PermissionEntry> getPermissions(I id, User user) {
		val entity = service.get(id, Depth.ENTITY)
		if (entity.present) {
			try {
				service.getPermissions(entity.get)			
			} catch(AccessDeniedException ex) {
				logger.debug('''User «user.username»(«user.groups.map[name]») is not allowed to view permissions of «entity.get.class.simpleName»(«entity.get.id»).''')
				throw new WebApplicationException(Response.status(Status.UNAUTHORIZED).build)
			} catch(Exception ex) {
				logger.debug("Error in getPermissions: ", ex)
				throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
			}
		} else {
			throw new NotFoundException
		}
	}
	
	override setPermissions(I id, User user, List<PermissionEntry> permissions) {
		val entity = service.get(id, Depth.ENTITY)
		if (entity.present) {
			try {
				service.setPermissions(entity.get, permissions)
				Response.ok.build
			} catch(AccessDeniedException ex) {
				logger.debug('''User «user.username»(«user.groups.map[name]») is not allowed to set permissions of «entity.get.class.simpleName»(«entity.get.id»).''')
				throw new WebApplicationException(Response.status(Status.UNAUTHORIZED).build)
			} catch(Exception ex) {
				logger.debug("Error in setPermissions: ", ex)
				throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).build)
			}
		} else {
			throw new NotFoundException
		}
	}
	
    @PreDestroy
    def destroy() {
        logger.info('''Destroying resource «class.simpleName».''')
        service.close
        CurrentUserHolder.currentUser.remove
        SessionHolder.currentSession.remove
    }
    
    private def Depth getActualDepth(Optional<DepthParam> depth) {
    	if (depth.present) depth.get.get else DEFAULT_DEPTH
    }
				
}