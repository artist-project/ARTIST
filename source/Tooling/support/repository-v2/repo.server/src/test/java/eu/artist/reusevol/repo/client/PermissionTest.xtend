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
 
package eu.artist.reusevol.repo.client

import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.common.model.RepoCategory
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.RepositoryConfiguration
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.security.RepoUsers
import eu.artist.reusevol.server.core.service.CategoryService
import io.dropwizard.testing.junit.DropwizardAppRule
import org.junit.Before
import org.junit.BeforeClass
import org.junit.ClassRule

import static org.fest.assertions.api.Assertions.*
import org.junit.Test
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.access.Permission

class PermissionTest {

	static var CategoryService dbService 
	static var CategoryManager clientService 
	static var RepoCategory testEntity 

	static val RepositoryClientConfig config = new RepositoryClientConfig => [
		baseRepositoryUri = "http://localhost:8080/api"
		wso2Config.useAnonymousUserForTesting = true
		username = "demo"
		password = "demo123"
		logMessagesForDebugging = true
		wso2Config.tenant = "test.artist-demo.eu"
		wso2Config.OAuthClientId = "j0gffE9u_TqiHbf7s3ZG9YEBIi8a"
		wso2Config.OAuthClientSecret = "VbB_Jo_t3pIsyHPuXobSJGn5pNoa"
		wso2Config.adminUsername = "admin@test.artist-demo.eu"
		wso2Config.adminPassword = "admin123"
	]
	
	@ClassRule
	public static val DropwizardAppRule<RepositoryConfiguration> RULE = new DropwizardAppRule<RepositoryConfiguration>(
		RepositoryService, "src/test/resources/repository_test.yml")
		
	@BeforeClass
	static def void setup() {
		dbService = (RULE.application as RepositoryService).categoryService
		clientService = new RepositoryClient(config).categoryManager
		clientService.manualAccessToken = "readwrite"
		testEntity = new RepoCategory("public", "Public")
	}
	
	@Before
	def void prepareDb() {
		dbService.doAsUser(RepoUsers.ADMIN_USER) [
			for(entity : findAll(Depth.ENTITY)) {
				delete(entity)
			}
			create(testEntity)
		]
	}

	@Test
	public def void createNewEntity() {
		dbService.doAsUser(RepoUsers.ADMIN_USER) [
			val entity = dbService.get(testEntity, Depth.ENTITY)
			assertThat(entity.present).isTrue
			val perm = dbService.getPermissions(entity.get)
			println(perm)
			
			clientService.manualAccessToken = "admin"
			clientService.setPermissions(entity.get, newArrayList(
				new PermissionEntry("readwrite", Permission.VIEW)
			))		
			val perm2 = clientService.getPermissions(entity.get)
			assertThat(perm2).contains(new PermissionEntry("readwrite", Permission.VIEW))			
		]
	}
	
}