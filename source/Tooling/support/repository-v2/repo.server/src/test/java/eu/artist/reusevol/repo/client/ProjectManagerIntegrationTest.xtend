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

import com.google.common.base.Splitter
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.common.model.Group
import eu.artist.reusevol.repo.common.model.RepoPackage
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.repo.common.util.Id
import eu.artist.reusevol.server.RepositoryConfiguration
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.service.ProjectService
import io.dropwizard.testing.junit.DropwizardAppRule
import org.junit.Before
import org.junit.BeforeClass
import org.junit.ClassRule
import org.junit.Test

import static org.fest.assertions.api.Assertions.*
import eu.artist.reusevol.server.core.security.RepoUsers

class ProjectManagerIntegrationTest {
	
	static var ProjectService dbService 
	static var ProjectManager clientService 
	static var RepoProject publicProject 
	static var User testUser
	
	static val RepositoryClientConfig config = new RepositoryClientConfig => [
		baseRepositoryUri = "http://localhost:8080/api"
		username = "demo"
		password = "demo123"
		logMessagesForDebugging = true
		wso2Config.useAnonymousUserForTesting = true
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
//		val testUser = new User(null, "tester", "Tester", "test@test.com", newArrayList(new Group("prj_public"), new Group("guest")))
//		CurrentUserHolder.currentUser.set(testUser)
		
		dbService = (RULE.application as RepositoryService).projectService
		clientService = new RepositoryClient(config).projectManager
		clientService.manualAccessToken = "readonly,prj_public"
		publicProject = new RepoProject("public", "Public")
 		testUser = new User(null, "tester", "Test user", null, Splitter.on(",").split(clientService.manualAccessToken).map[ new Group(it) ].toList)		
	}
	
	@Before
	def void prepareDb() {
		dbService.doAsUser(RepoUsers.ADMIN_USER) [
			dbService.findAll(Depth.ENTITY).forEach[
				dbService.delete(Id.of(id))
			]
		]
		dbService.doAsUser(testUser) [
			dbService.create(publicProject)		
		]
	}

	@Test
	public def void createNewProject() {
		val created = clientService.create(new RepoProject("dews", "DEWS", "Dews Project"))
		
		assertThat(created).isNotNull
		assertThat(created.id).isEqualTo("dews")
		assertThat(created.label).isEqualTo("DEWS")
		assertThat(created.description).isEqualTo("Dews Project")
		
		dbService.doAsUser(testUser) [
			val retrieved = dbService.get(created, Depth.ALL)
			
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("dews")
			assertThat(retrieved.get.label).isEqualTo("DEWS")
			assertThat(retrieved.get.description).isEqualTo("Dews Project")
		]
	}
	
	@Test
	public def void creatingExistingProjectChangesNothing() {
		val created = clientService.create(new RepoProject("public", "Test", "Test"))

		// Creation of existing project does not cause an update
		assertThat(created).isNotNull
		assertThat(created.id).isEqualTo("public")
		assertThat(created.label).isEqualTo("Public")
		assertThat(created.description).isNull

		dbService.doAsUser(testUser) [
			val retrieved = dbService.get(created, Depth.ENTITY)
	
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("public")
			assertThat(retrieved.get.label).isEqualTo("Public")
			assertThat(retrieved.get.description).isNull			
		]
	}
	
	@Test
	public def void createEntityWithInvalidId() {
		try {
			clientService.create(new RepoProject("!!§§"))
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(Exception ex) {
			assertThat(ex).isInstanceOf(IllegalArgumentException).hasMessageStartingWith("Invalid entity")
		}
	}
	
	@Test
	public def void updateEntityWithInvalidId() {
		try {
			clientService.update(new RepoProject("!!§§"), Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(Exception ex) {
			assertThat(ex).isInstanceOf(IllegalArgumentException).hasMessageStartingWith("Invalid entity")
		}
	}
	
	@Test
	public def void retrieveProject() {
		val retrieved = clientService.get(Id.of("public"), Depth.ENTITY)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("public")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
	}
	
	@Test
	public def void retrieveNonExistingProject() {
		val retrieved = clientService.get(new Id("dews3"), Depth.ENTITY)
		
		assertThat(retrieved.present).isFalse
	}
	
	@Test
	public def void existsProject() {
		val id = new Id("dews4")
		
		assertThat(clientService.exists(id)).isFalse
		dbService.doAsUser(testUser) [
			dbService.create(new RepoProject(id.id, "DEWS", "Dews Project"))			
		]
		assertThat(clientService.exists(id)).isTrue
	}
	
	@Test
	public def void deleteExistingProject() {
		val id = new Id("public")
		
		dbService.doAsUser(testUser) [
			assertThat(dbService.exists(id)).isTrue
			
			val deleted = clientService.delete(id)
			
			assertThat(deleted.present).isTrue
			assertThat(deleted.get.id).isEqualTo("public")
			assertThat(deleted.get.label).isEqualTo("Public")
			assertThat(deleted.get.description).isNull
	
			assertThat(dbService.exists(id)).isFalse			
		]
	}
	
	@Test
	public def void deleteNonExistingProject() {
		val id = new Id("dews")
		
		dbService.doAsUser(testUser) [
			assertThat(dbService.exists(id)).isFalse
			
			val deleted = clientService.delete(id)
			
			assertThat(deleted.present).isFalse
			assertThat(dbService.exists(id)).isFalse			
		]
	}
	
	@Test
	public def void updateOfDirectProperties() {
		val id = new Id("public")
		
		dbService.doAsUser(testUser) [
			val original = dbService.get(id, Depth.ENTITY)
			
			assertThat(original.present).isTrue
			assertThat(original.get.id).isEqualTo("public")
			assertThat(original.get.label).isEqualTo("Public")
			
			val updated = new RepoProject(original.get)
			updated.label = "Updated"
			clientService.update(updated, Depth.ALL)
			
			val retrieved = clientService.get(id, Depth.ALL)
			
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("public")
			assertThat(retrieved.get.label).isEqualTo("Updated")
			assertThat(retrieved.get.description).isNull			
		]
	}

	@Test
	public def void updateOfChildProperties() {
		val id = new Id("public")
		
		dbService.doAsUser(testUser) [
			val original = dbService.get(id, Depth.ENTITY).get
			
			val pkg = new RepoPackage("test")
			original.packages.add(pkg)
			val retrieved = clientService.update(original, Depth.CHILDREN)
			
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.packages).hasSize(1)
			assertThat(retrieved.get.packages).containsOnly(pkg)
			
			val retrieved2 = clientService.get(id, Depth.ALL)
			
			assertThat(retrieved2.present).isTrue
			assertThat(retrieved2.get.packages).hasSize(1)
			assertThat(retrieved2.get.packages).containsOnly(pkg)			
		]
	}
	
	
	// Update
	@Test
	public def void findAllProjects() {
		val result1 = clientService.findAll(Depth.ENTITY)
		
		assertThat(result1.size).isEqualTo(1)
		assertThat(result1).containsOnly(publicProject)
		
		val dewsProject = new RepoProject("dews")
		dbService.doAsUser(testUser) [
			dbService.create(dewsProject)
			val result2 = clientService.findAll(Depth.ENTITY)
			
			assertThat(result2.size).isEqualTo(2)
			assertThat(result2).containsOnly(publicProject, dewsProject)
			
			dbService.delete(publicProject)
			dbService.delete(dewsProject)
			val result3 = clientService.findAll(Depth.ENTITY)
			
			assertThat(result3.size).isEqualTo(0)			
		]
	}
	
	@Test
	public def void findProjectsbyValidFIQL() {
		val dewsProject = new RepoProject("dews", "Public")
		dbService.doAsUser(testUser) [
			dbService.create(dewsProject)
			
			val result1 = clientService.findByFiql("id==public", Depth.ENTITY)
			
			assertThat(result1.size).isEqualTo(1)
			assertThat(result1).containsOnly(publicProject)
			
			val result2 = clientService.findByFiql("label==Public", Depth.ENTITY)
			
			assertThat(result2.size).isEqualTo(2)
			assertThat(result2).containsOnly(publicProject, dewsProject)
	
			// AND		
			val result3 = clientService.findByFiql("label==dews;id==dews", Depth.ENTITY)
			
			assertThat(result3.size).isEqualTo(0)
	
			// OR
			val result4 = clientService.findByFiql("id==public,id==dews", Depth.ENTITY)
			
			assertThat(result4.size).isEqualTo(2)
			assertThat(result4).containsOnly(publicProject, dewsProject)			
		]
	}
	
	@Test
	public def void findProjectsWithEmptyQuery() {
		// This should fall back to findAll
		val result1 = clientService.findByFiql("", Depth.ENTITY)
		
		assertThat(result1).hasSize(1)
		assertThat(result1).containsOnly(publicProject)
	}
	
	@Test
	public def void findProjectsWithInValidQuery() {
		try {
			clientService.findByFiql("id#dews", Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(IllegalArgumentException ex) {
			assertThat(ex.message).startsWith("Error in FIQL expression:")
		}
	}
	
	@Test
	public def void findProjectsWithInValidPropertyReference() {
		try {
			clientService.findByFiql("test==test", Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(IllegalArgumentException ex) {
			assertThat(ex.message).startsWith("Error in FIQL expression:")
		}
	}
	
	@Test
	public def void moveNonExistentEntity() {
		val source = Id.of("dews")

		// Move should fail silently		
		clientService.move(source, publicProject)

		val retrieved = clientService.get(publicProject, Depth.ALL)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("public")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
		
		assertThat(clientService.exists(source)).isFalse
	}
	
	@Test
	public def void moveExistentEntityToNonExistentTarget() {
		val target = Id.of("dews")

		// Move should fail silently		
		clientService.move(publicProject, target)

		val retrieved = clientService.get(target, Depth.ALL)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("dews")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
		
		assertThat(clientService.exists(publicProject)).isFalse
	}
	
}
