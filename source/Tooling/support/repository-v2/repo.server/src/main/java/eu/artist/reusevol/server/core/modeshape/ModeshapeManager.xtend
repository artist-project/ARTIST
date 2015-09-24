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

import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.server.RepositoryConfiguration
import eu.artist.reusevol.server.core.dao.CategoryDao
import eu.artist.reusevol.server.core.dao.ProjectDao
import eu.artist.reusevol.server.core.dao.UserDao
import eu.artist.reusevol.server.core.security.RepoGroups
import eu.artist.reusevol.server.core.security.RepoUsers
import eu.artist.reusevol.server.core.security.privileges.PermissionUtils
import io.dropwizard.lifecycle.Managed
import javax.inject.Inject
import javax.jcr.Session
import org.modeshape.jcr.ModeShapeEngine
import org.modeshape.jcr.api.JcrTools
import org.slf4j.LoggerFactory
import org.modeshape.jcr.security.SimplePrincipal
import org.modeshape.jcr.ModeShapeRoles

class ModeshapeManager implements Managed {
	
    val logger = LoggerFactory.getLogger(ModeshapeManager)
    
    val ModeShapeEngine engine
    val RepositoryConfiguration config

    @Inject
    new(ModeShapeEngine engine, RepositoryConfiguration config) {
        this.engine = engine
        this.config = config
    }

    override start() throws Exception {
        logger.info("Starting ModeShape engine.")
        engine.start
        val config = org.modeshape.jcr.RepositoryConfiguration.read(config.repositoryConfigPath)
        val repository = engine.deploy(config)
        
        val session = repository.login(new UserCredentials(RepoUsers.ADMIN_USER))
        
        initStructure(session)
        
		session.logout
    }
    
    private def void initStructure(Session session) {
        logger.info("Initializing structure.")
        
    	val jcr = new JcrTools(true)

    	// Init user root
    	val internalNode = jcr.findOrCreateNode(session, "/internal", "nt:unstructured")
    	PermissionUtils.setPermission(session, internalNode.path, RepoUsers.ADMIN_USER, Permission.MANAGE)
    	PermissionUtils.setPermission(session, internalNode.path, SimplePrincipal.newInstance(ModeShapeRoles.READONLY), Permission.VIEW)
    	jcr.findOrCreateNode(session, UserDao.BASE, "nt:unstructured")
    	// jcr.printSubgraph(internalNode)
    	
    	// Init project root
    	jcr.findOrCreateNode(session, ProjectDao.BASE, "nt:unstructured")
    	//jcr.printSubgraph(projectNode)
    	
    	// Init category root
    	val categoryNode = jcr.findOrCreateNode(session, CategoryDao.BASE, "nt:unstructured")
    	categoryNode.addMixin("mode:accessControllable")
    	PermissionUtils.setPermission(session, categoryNode.path, RepoUsers.ADMIN_USER, Permission.MANAGE)
    	PermissionUtils.setPermission(session, categoryNode.path, RepoGroups.READWRITE_GROUP, Permission.MODIFY)
    	PermissionUtils.setPermission(session, categoryNode.path, RepoGroups.READONLY_GROUP, Permission.VIEW)
    }    

    override stop() throws Exception {
        val forceShutdown = true
        val future = engine.shutdown(forceShutdown)

        if (future.get()) { // optional, but blocks until engine is completely shutdown or interrupted
            logger.info("Shut down ModeShape.");
        } else {
            logger.info("At least one repository is in use, so shutdown aborted.");
        }
    }
}
