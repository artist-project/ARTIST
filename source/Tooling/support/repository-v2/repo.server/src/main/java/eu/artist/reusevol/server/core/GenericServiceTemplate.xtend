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
import com.google.common.base.Preconditions
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.service.GenericService
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.core.modeshape.UserCredentials
import eu.artist.reusevol.server.core.security.privileges.PermissionUtils
import eu.artist.reusevol.server.util.search.JcrSql2Visitor
import java.util.List
import javax.inject.Inject
import javax.inject.Provider
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.apache.cxf.jaxrs.ext.search.SearchParseException
import org.apache.cxf.jaxrs.ext.search.fiql.FiqlParser
import org.jcrom.util.PathUtils
import org.slf4j.LoggerFactory
import eu.artist.reusevol.server.core.modeshape.JcrModule

class GenericServiceTemplate<T extends JcrStorable> implements GenericService<T> {

	protected val logger = LoggerFactory.getLogger(class.name)

	protected var Provider<? extends GenericDaoTemplate<T>> daoProvider
	protected var GenericDaoTemplate<T> daoInstance
	
	@Inject
	new(Provider<? extends GenericDaoTemplate<T>> daoProvider) {
		this.daoProvider = daoProvider
		this.daoInstance = null
	}
	
	def setBasePath(String basePath) {
		dao.basePath = basePath
	}
	
	def getBasePath() {
		dao.basePath
	}
	
	def getDao() {
		if (daoInstance == null) {
			daoInstance = daoProvider.get 
		}
		daoInstance
	}
	
	def void doAsUser(User user, (GenericServiceTemplate<T>) => void function) {
		val oldSession = if (dao.session.live) {
			dao.session
		} else {
			JcrModule.getNewSession(dao.session.repository)
		}
		dao.session = oldSession.impersonate(new UserCredentials(user))
		function.apply(this)
		dao.session = oldSession
	}

	override T create(T entity) {
		Preconditions.checkNotNull(entity)
		
		val result = if (!dao.exists(entity.id.toJcrPath)) {
			logger.debug("Creating entity {}", entity.id)
			dao.create(entity.id.toJcrParentPath, entity)
		} else {
			logger.debug("Entity {} already exists. Returning existing entity.", entity.id)
			dao.get(entity.id.toJcrPath)
		}

		// Better would be to make a defensive copy
		entity.jcrPath = null
		
		postProcess(result)
	}

	override Optional<T> update(T entity, Depth depth) {
		Preconditions.checkNotNull(entity)
		
		entity.jcrPath = entity.id.toJcrPath

		val result = if (dao.exists(entity.jcrPath)) {
			logger.debug("Updating entity {}", entity.id)
			Optional.of(postProcess(dao.update(entity, depth.get)))
		} else {
			logger.debug("Creating entity {}", entity.id)
			entity.jcrPath = entity.id.toJcrParentPath
			Optional.of(postProcess(dao.create(entity)))
		}

		// Better would be to make a defensive copy
		entity.jcrPath = null
		
		result
	}

	override Optional<T> get(Identifiable id, Depth depth) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(depth)
		
		val path = id.id.toJcrPath
		
		val result = if (dao.exists(path)) {
			logger.debug("Getting entity from {}", path)
			Optional.of(postProcess(dao.get(path, depth.get)))
		} else {
			logger.debug("Found no entity to get at {}", path)
			Optional.absent
		}
		
		result
	}

	override List<T> findAll(Depth depth) {
		Preconditions.checkNotNull(depth)
		
		logger.debug("Getting all entities from {}", basePath)

		// remove the access controll list from the result 
		val result = dao.findAll(basePath, depth.get).filter[ !it.jcrName.equals("mode:acl") ].map[ postProcess(it) ]
		result.toList
	}

	override List<T> findByFiql(String fiqlQuery, Depth depth) {
		Preconditions.checkNotNull(fiqlQuery)
		Preconditions.checkNotNull(depth)

        try {
            val String queryString = constructJCRSQL2QueryString(fiqlQuery, basePath);
            
			logger.debug("Getting all entities that match the query {}", queryString)		
			dao.findBySql(queryString, depth.get).map[ postProcess(it) ]		
        } catch (SearchParseException e) {
            logger.info("Error parsing FIQL query '" + fiqlQuery + "'.", e);
            throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(e.message).build)
        }
	}
	
    protected def String constructJCRSQL2QueryString(String fiqlQuery, String anchorPath)
            throws SearchParseException {
            	
        val query = new FiqlParser<T>(dao.typeToken).parse(fiqlQuery)
        val visitor = new JcrSql2Visitor<T>(dao.nodeType, dao.typeToken.name, anchorPath)
        visitor.visit(query);
        val queryString = visitor.query
        
        return queryString
    }

	override Optional<T> delete(Identifiable id) {		
		Preconditions.checkNotNull(id)
		
		val path = id.id.toJcrPath
		if (dao.exists(path)) {
			logger.debug("Removing entity from {}", path)
			val result = dao.get(path, Depth.ENTITY.get)
			dao.remove(path)
			Optional.of(postProcess(result))
		} else {
			logger.debug("Found no entity to delete at {}", path)
			Optional.absent
		}
	}

	override exists(Identifiable id) {
		Preconditions.checkNotNull(id)
		
		val path = id.id.toJcrPath
		
		logger.debug("Check entity at {}", path)
		dao.exists(path)
	}

	override move(Identifiable sourceId, Identifiable targetId) {
		if (exists(sourceId) && !exists(targetId)) {
			val entity = get(sourceId, Depth.ENTITY)
			if (entity.present) {
				val toMove = entity.get
				toMove.setId(targetId.id)
				dao.move(toMove, targetId.id.toJcrParentPath)
			}
		}
	}

	override close() {
		dao.close
	}
	
	protected def T postProcess(T entity) {
		entity
	}
	
	protected def toJcrPath(String id) {
		val jcrName = PathUtils.createValidName(id)
		'''«basePath»/«jcrName»'''.toString
	}

	protected def toJcrParentPath(String id) {
		basePath
	}

	protected def toJcrName(String id) {
		PathUtils.createValidName(id)
	}
	
	override setPermissions(T entity, List<PermissionEntry> permissions) {
		PermissionUtils.setPermissions(dao.session, entity.id.toJcrPath, permissions)
	}
	
	def setPermissions(String jcrPath, List<PermissionEntry> permissions) {
		PermissionUtils.setPermissions(dao.session, jcrPath, permissions)
	}
	
	override getPermissions(T entity) {
		val ace = PermissionUtils.getAggregatedACE(dao.session, entity.id.toJcrPath)
		val permissions = ace.map[
			val privNames = privileges.map[name].toSet
			new PermissionEntry(principal.name, PermissionUtils.getPermissionFromPrivileges(privNames))
		]
		permissions
	}
}
