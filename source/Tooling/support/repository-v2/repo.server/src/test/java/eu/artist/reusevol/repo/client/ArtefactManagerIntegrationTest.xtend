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
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.repo.common.util.ArtefactId
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.RepositoryConfiguration
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.modeshape.SessionHolder
import eu.artist.reusevol.server.core.security.RepoUsers
import eu.artist.reusevol.server.core.service.ArtefactService
import eu.artist.reusevol.server.core.service.ProjectService
import io.dropwizard.testing.junit.DropwizardAppRule
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.charset.StandardCharsets
import javax.ws.rs.core.MediaType
import org.junit.Before
import org.junit.BeforeClass
import org.junit.ClassRule
import org.junit.Test

import static io.dropwizard.testing.FixtureHelpers.*
import static org.fest.assertions.api.Assertions.*

class ArtefactManagerIntegrationTest {
	
	static var ArtefactService dbService 
	static var ProjectService projectService 
	static var ArtefactManager clientService 
	static var RepoArtefact testEntity 
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
		dbService = (RULE.application as RepositoryService).artefactService
		projectService = (RULE.application as RepositoryService).projectService
		clientService = new RepositoryClient(config).getArtefactManager("public")
		clientService.manualAccessToken = "readwrite,prj_public"
		testEntity = new RepoArtefact(ArtefactId.of("public", "test").id, "Public")
 		testUser = new User(null, "tester", "Test user", null, Splitter.on(",").split(clientService.manualAccessToken).map[ new Group(it) ].toList)
 		CurrentUserHolder.currentUser.set(testUser)		
 		SessionHolder.currentSession.remove		
//		testEntity.modifier = new UserInfo("tester", "Tester")
//		testEntity.lastModified = new Date
//		testEntity.publisher = testEntity.modifier
//		testEntity.publishedOn = testEntity.lastModified
	}
	
	@Before
	def void prepareDb() {
		projectService.doAsUser(testUser) [
			val project = projectService.create(new RepoProject("public"))
			dbService.projectId = project.id
		]
		dbService.doAsUser(RepoUsers.ADMIN_USER) [
			dbService.findAll(Depth.ENTITY).forEach[
				dbService.delete(it)
			]
		]
		dbService.doAsUser(testUser) [
			dbService.create(testEntity)			
		]
	}

	@Test
	public def void createNewEntity() {
		val created = clientService.create(new RepoArtefact("public:dews", "DEWS"))
		
		assertThat(created).isNotNull
		assertThat(created.id).isEqualTo("public:dews")
		assertThat(created.label).isEqualTo("DEWS")
		assertThat(created.description).isNull
		
		dbService.doAsUser(testUser) [
			val retrieved = dbService.get(created, Depth.ALL)
			
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("public:dews")
			assertThat(retrieved.get.label).isEqualTo("DEWS")
			assertThat(retrieved.get.description).isNull			
		]
	}
	
	@Test
	public def void creatingExistingEntityChangesNothing() {
		val created = clientService.create(new RepoArtefact("public:test", "Test"))

		// Creation of existing project does not cause an update
		assertThat(created).isNotNull
		assertThat(created.id).isEqualTo("public:test")
		assertThat(created.label).isEqualTo("Public")
		assertThat(created.description).isNull

		dbService.doAsUser(testUser) [
			val retrieved = dbService.get(created, Depth.ENTITY)
	
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("public:test")
			assertThat(retrieved.get.label).isEqualTo("Public")
			assertThat(retrieved.get.description).isNull			
		]
	}
	
	@Test
	public def void retrieveEntity() {
		val retrieved = clientService.get(ArtefactId.of("public:test"), Depth.ENTITY)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("public:test")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
	}
	
	@Test
	public def void retrieveNonExistingEntity() {
		val retrieved = clientService.get(new ArtefactId("public:dews3"), Depth.ENTITY)
		
		assertThat(retrieved.present).isFalse
	}
	
	@Test
	public def void createEntityWithInvalidId() {
		try {
			clientService.create(new RepoArtefact("public:!!§§"))
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(Exception ex) {
			assertThat(ex).isInstanceOf(IllegalArgumentException)
			assertThat((ex as IllegalArgumentException).message).startsWith("\"!!§§\" is not a valid id.")
		}
	}
	
	@Test
	public def void updateEntityWithInvalidId() {
		try {
			clientService.update(new RepoArtefact("public:!!§§"), Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(Exception ex) {
			assertThat(ex).isInstanceOf(IllegalArgumentException)
			assertThat((ex as IllegalArgumentException).message).startsWith("\"!!§§\" is not a valid id.")
		}
	}
	
	@Test
	public def void existsProject() {
		val id = ArtefactId.of("public", "dews4")
		
		assertThat(clientService.exists(id)).isFalse
		dbService.doAsUser(testUser) [
			dbService.create(new RepoArtefact(id.id, "DEWS"))			
		]
		assertThat(clientService.exists(id)).isTrue
	}
	
	@Test
	public def void deleteExistingEntity() {
		dbService.doAsUser(testUser) [
			assertThat(dbService.exists(testEntity)).isTrue
			
			val deleted = clientService.delete(testEntity)
			
			assertThat(deleted.present).isTrue
			assertThat(deleted.get.id).isEqualTo("public:test")
			assertThat(deleted.get.label).isEqualTo("Public")
			assertThat(deleted.get.description).isNull
	
			assertThat(dbService.exists(testEntity)).isFalse			
		]
	}
	
	@Test
	public def void deleteExistingVersionedEntity() {
		dbService.doAsUser(testUser) [
			assertThat(dbService.exists(testEntity)).isTrue
			dbService.createVersion(testEntity, "Test")
			
			val deleted = clientService.delete(testEntity)
			
			assertThat(deleted.present).isTrue
			assertThat(deleted.get.id).isEqualTo("public:test")
			assertThat(deleted.get.label).isEqualTo("Public")
			assertThat(deleted.get.description).isNull
	
			assertThat(dbService.exists(testEntity)).isFalse			
		]
	}
	
	@Test
	public def void deleteNonExistingEntity() {
		dbService.doAsUser(testUser) [
			val id = ArtefactId.of("public:dews")
			
			assertThat(dbService.exists(id)).isFalse
			
			val deleted = clientService.delete(id)
			
			assertThat(deleted.present).isFalse
			assertThat(dbService.exists(id)).isFalse			
		]
	}
	
	@Test
	public def void updateOfDirectProperties() {
		val id = ArtefactId.of("public:test")
		
		dbService.doAsUser(testUser) [
			val original = dbService.get(id, Depth.ENTITY)
			
			assertThat(original.present).isTrue
			assertThat(original.get.id).isEqualTo("public:test")
			assertThat(original.get.label).isEqualTo("Public")
			
			val updated = new RepoArtefact(original.get)
			updated.label = "Updated"
			clientService.update(updated, Depth.ALL)
			
			val retrieved = clientService.get(id, Depth.ALL)
			
			assertThat(retrieved.present).isTrue
			assertThat(retrieved.get.id).isEqualTo("public:test")
			assertThat(retrieved.get.label).isEqualTo("Updated")
			assertThat(retrieved.get.description).isNull			
		]
	}

/*
	@Test
	public def void updateOfChildProperties() {
		val id = new IdParam("public")
		
		val original = dbService.get(id, Depth.ENTITY).get
		
		val test = new RepoArtefact("test")
		original.categories.add(test)
		val retrieved = clientService.update(original, Depth.CHILDREN)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.categories).hasSize(1)
		assertThat(retrieved.get.categories).containsOnly(test)
		
		val retrieved2 = clientService.get(id, Depth.ALL)
		
		assertThat(retrieved2.present).isTrue
		assertThat(retrieved2.get.categories).hasSize(1)
		assertThat(retrieved2.get.categories).containsOnly(test)
	}
 */	
	
	// Update
	@Test
	public def void findAllEntities() {
		val result1 = clientService.findAll(Depth.ENTITY).map[ 
			it.rating = null
			it
		]
		
		assertThat(result1.size).isEqualTo(1)
		assertThat(result1).containsOnly(testEntity)
		
		val dewsProject = new RepoArtefact("public:dews")
		
		dbService.doAsUser(testUser) [
			dbService.create(dewsProject)
			val result2 = clientService.findAll(Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result2.size).isEqualTo(2)
			assertThat(result2).containsOnly(testEntity, dewsProject)
			
			dbService.delete(testEntity)
			dbService.delete(dewsProject)
			val result3 = clientService.findAll(Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result3.size).isEqualTo(0)			
		]
	}
	
	@Test
	public def void findByValidFIQL() {
		val dewsProject = new RepoArtefact("public:dews", "Public")
		
		dbService.doAsUser(testUser) [
			dbService.create(dewsProject)
			
			val result1 = clientService.findByFiql("id==public:test", Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result1.size).isEqualTo(1)
			assertThat(result1).containsOnly(testEntity)
			
			val result2 = clientService.findByFiql("label==Public", Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result2.size).isEqualTo(2)
			assertThat(result2).containsOnly(testEntity, dewsProject)
	
			// AND		
			val result3 = clientService.findByFiql("label==dews;id==public:dews", Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result3.size).isEqualTo(0)
	
			// OR
			val result4 = clientService.findByFiql("id==public:test,id==public:dews", Depth.ENTITY).map[ 
				it.rating = null
				it
			]
			
			assertThat(result4.size).isEqualTo(2)
			assertThat(result4).containsOnly(testEntity, dewsProject)			
		]
	}
	
	@Test
	public def void findWithEmptyQuery() {
		// This should fall back to findAll
		val result1 = clientService.findByFiql("", Depth.ENTITY).map[ 
			it.rating = null
			it
		]
		
		assertThat(result1).hasSize(1)
		assertThat(result1).containsOnly(testEntity)
	}
	
	@Test
	public def void findWithInValidQuery() {
		try {
			clientService.findByFiql("id#dews", Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(IllegalArgumentException ex) {
			assertThat(ex.message).startsWith("Error in FIQL expression:")
		}
	}
	
	@Test
	public def void findWithInValidPropertyReference() {
		try {
			clientService.findByFiql("test==test", Depth.ENTITY)
			failBecauseExceptionWasNotThrown(IllegalArgumentException)
		} catch(IllegalArgumentException ex) {
			assertThat(ex.message).startsWith("Error in FIQL expression:")
		}
	}
	
	@Test
	public def void moveNonExistentEntity() {
		val source = ArtefactId.of("public:dews")

		// Move should fail silently		
		clientService.move(source, testEntity)

		val retrieved = clientService.get(testEntity, Depth.ALL)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("public:test")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
		
		assertThat(clientService.exists(source)).isFalse
	}
	
	@Test
	public def void moveExistentEntityToNonExistentTarget() {
		val target = ArtefactId.of("public:dews")

		// Move should fail silently		
		clientService.move(testEntity, target)

		val retrieved = clientService.get(target, Depth.ALL)
		
		assertThat(retrieved.present).isTrue
		assertThat(retrieved.get.id).isEqualTo("public:dews")
		assertThat(retrieved.get.label).isEqualTo("Public")
		assertThat(retrieved.get.description).isNull
		
		assertThat(clientService.exists(testEntity)).isFalse
	}
	
	// content
	
	@Test
	public def void uploadContent() {
		val content = fixture("fixtures/project.json")
		
		clientService.setContent(testEntity, streamFrom(content), "project.json", MediaType.APPLICATION_JSON, "UTF-8")
		
		dbService.doAsUser(testUser) [
			assertThat(dbService.getContent(testEntity)).hasContentEqualTo(streamFrom(content))
			
			val entity = dbService.get(testEntity, Depth.CHILDREN).get
			
			assertThat(entity.contentInfo.encoding).isEqualTo("UTF-8")
			assertThat(entity.contentInfo.mimeType).isEqualTo(MediaType.APPLICATION_JSON)
			assertThat(entity.contentInfo.filename).isEqualTo("project.json")			
		]
	}
	
	@Test
	public def void downloadContent() {
		val content = fixture("fixtures/project.json")
		
		dbService.doAsUser(testUser) [
			dbService.setContent(testEntity, streamFrom(content), "project.json", MediaType.APPLICATION_JSON, StandardCharsets.UTF_8.toString)
			
			assertThat(clientService.getContent(testEntity)).hasContentEqualTo(streamFrom(content))
	
			val entity = clientService.get(testEntity, Depth.CHILDREN).get
			
			assertThat(entity.contentInfo.encoding).isEqualTo("UTF-8")
			assertThat(entity.contentInfo.mimeType).isEqualTo(MediaType.APPLICATION_JSON)
			assertThat(entity.contentInfo.filename).isEqualTo("project.json")			
		]
	}
	
	@Test
	public def void updateContent() {
		val content1 = fixture("fixtures/project.json")
		val content2 = fixture("fixtures/project.xml")
		
		dbService.doAsUser(testUser) [
			dbService.setContent(testEntity, streamFrom(content1), "project.json", MediaType.APPLICATION_JSON, "UTF-8")
			assertThat(dbService.getContent(testEntity)).hasContentEqualTo(streamFrom(content1))
			
			clientService.setContent(testEntity, streamFrom(content2), "project.xml", MediaType.APPLICATION_XML, "UTF-8")
			
			val entity = dbService.get(testEntity, Depth.CHILDREN).get
			
			assertThat(dbService.getContent(entity)).hasContentEqualTo(streamFrom(content2))
			assertThat(entity.contentInfo.encoding).isEqualTo("UTF-8")
			assertThat(entity.contentInfo.mimeType).isEqualTo(MediaType.APPLICATION_XML)
			assertThat(entity.contentInfo.filename).isEqualTo("project.xml")			
		]
	}

	@Test
	public def void deleteContent() {
		val content1 = fixture("fixtures/project.json")
		
		dbService.doAsUser(testUser) [
			dbService.setContent(testEntity, streamFrom(content1), "project.json", MediaType.APPLICATION_JSON, "UTF-8")
			assertThat(dbService.getContent(testEntity)).hasContentEqualTo(streamFrom(content1))
			
			clientService.clearContent(testEntity)
			
			val entity = dbService.get(testEntity, Depth.CHILDREN).get
			
			assertThat(dbService.getContent(entity)).isNull
			assertThat(entity.contentInfo).isNull			
		]
	}
	
	@Test
	public def void versioningTests() {
		val content1 = fixture("fixtures/project.json")
		val content2 = fixture("fixtures/project.xml")
		
		dbService.doAsUser(testUser) [
			dbService.setContent(testEntity, streamFrom(content1), "project.json", MediaType.APPLICATION_JSON, "UTF-8")
			assertThat(dbService.getContent(testEntity)).hasContentEqualTo(streamFrom(content1))
			
			// First version
			val result1 = clientService.createVersion(testEntity, "First version")
			
			assertThat(result1.present).isTrue
			assertThat(result1.get.artefactId).isEqualTo(testEntity.id + ":0")
			assertThat(result1.get.version).isEqualTo("0")
			assertThat(result1.get.commitMessage).isEqualTo("First version")
	
			// Second version
			dbService.setContent(testEntity, streamFrom(content2), "project.xml", MediaType.APPLICATION_XML, "UTF-8")
			assertThat(dbService.getContent(testEntity)).hasContentEqualTo(streamFrom(content2))
			
			val result2 = clientService.createVersion(testEntity, "Second version")
			
			assertThat(result2.present).isTrue
			assertThat(result2.get.artefactId).isEqualTo(testEntity.id + ":1")
			assertThat(result2.get.version).isEqualTo("1")
			assertThat(result2.get.commitMessage).isEqualTo("Second version")
			
			// List versions
			val history = clientService.listVersions(testEntity)
			
			assertThat(history).isNotNull
			assertThat(history).hasSize(2)
			assertThat(history).containsExactly(result1.get, result2.get)
			
			// Get first version
			val v0 = clientService.get(ArtefactId.of(result1.get.artefactId), Depth.ALL)
			
			assertThat(v0.present).isTrue
			assertThat(v0.get.versionInfo.artefactId).isEqualTo(testEntity.id + ":0")
			assertThat(v0.get.versionInfo.version).isEqualTo("0")
			assertThat(v0.get.versionInfo.commitMessage).isEqualTo("First version")
			assertThat(clientService.getContent(v0.get)).hasContentEqualTo(streamFrom(content1))
	
			// Get second version
			val v1 = clientService.get(ArtefactId.of(result2.get.artefactId), Depth.ALL)
			
			assertThat(v1.present).isTrue
			assertThat(v1.get.versionInfo.artefactId).isEqualTo(testEntity.id + ":1")
			assertThat(v1.get.versionInfo.version).isEqualTo("1")
			assertThat(v1.get.versionInfo.commitMessage).isEqualTo("Second version")
			assertThat(clientService.getContent(v1.get)).hasContentEqualTo(streamFrom(content2))			
		]
	}
	
	private static def InputStream streamFrom(String string) {
		new ByteArrayInputStream(string.getBytes())
	}
	
}
