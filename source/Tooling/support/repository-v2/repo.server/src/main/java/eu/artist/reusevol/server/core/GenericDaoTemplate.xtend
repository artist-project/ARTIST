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

import com.google.common.base.Splitter
import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.modeshape.UserCredentials
import eu.artist.reusevol.server.core.security.RepoUsers
import java.util.List
import javax.jcr.Session
import javax.jcr.security.AccessControlManager
import org.eclipse.xtend.lib.annotations.Accessors
import org.jcrom.Jcrom
import org.jcrom.dao.AbstractJcrDAO
import org.jcrom.util.NodeFilter
import org.slf4j.LoggerFactory

class GenericDaoTemplate<T extends JcrStorable> extends AbstractJcrDAO<T> {
	
	private static val logger = LoggerFactory.getLogger(GenericDaoTemplate)
	
	protected static def convertPrivStringsToObj(AccessControlManager acm, List<String> privileges) {
		privileges.map[ acm.privilegeFromName(it) ]
	}
	
	@Accessors
	val Class<T> typeToken
	
	@Accessors
	val String nodeType
	
	@Accessors
	var String basePath 

	@Accessors
	var Session session 

	new(Session session, Jcrom jcrom, Class<T> typeToken, String nodeType, String basePath) {
		super(jcrom)
		this.typeToken = typeToken
		this.nodeType = nodeType
		this.basePath = basePath
		this.session = session
	}
	
	def setBasePath(String base) {
		this.basePath = base
	}
	
	def getSession(boolean asAdmin) {
		if (asAdmin) session.impersonate(new UserCredentials(RepoUsers.ADMIN_USER)) else session
	}
	
	override create(T entity) {
		val result = super.create(entity)
		
		if (result.jcrPath != null) {
			setupPermissions(result)
		}
		
		result
	}
	
	def void setupPermissions(T path) {		
	}
	
	def createPathNodes(String path) {
		if (session.nodeExists(path)) return
		
		val segments = Splitter.on("/").omitEmptyStrings.split(path)
		var node = session.rootNode
		
		for(String child : segments) {
			if(!node.hasNode(child)) {
				node.addNode(child)
			}
			node = node.getNode(child) 
		}
		
		session.save
	}

	override findBySql(String sql, NodeFilter nodeFilter) {
		super.findBySql(sql, nodeFilter)
	}

	override getSession() {
		this.session
	}
	
	def void doAsUser(User user, (GenericDaoTemplate<T>) => void function) {
		val oldSession = session
		session = session.impersonate(new UserCredentials(user))
		function.apply(this)
		session = oldSession
	}
	
	def close() {
		logger.debug("Closing JCR session.")
		session.logout
	}
}
