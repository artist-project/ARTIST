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
 
package eu.artist.reusevol.repo.common.wso2

import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup
import eu.artist.reusevol.repo.client.wso2.dto.ScimName
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser
import eu.artist.reusevol.repo.config.Wso2Configuration
import org.junit.Assert
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class Wso2ClientTest {
	
	static var Wso2Client client
	static var ScimUser testUser1 = new ScimUser => [
		name = new ScimName => [
			givenName = "A"
			familyName = "A"
		]
		username = "user_a"
		password = "user_a"
		emails = newArrayList("a.a@a.com")
	]
	static var ScimUser testUser2 = new ScimUser => [
		name = new ScimName => [
			givenName = "B"
			familyName = "B"
		]
		username = "user_b"
		password = "user_b"
		emails = newArrayList("b.b@b.com")
	]
	static var ScimGroup testGroup1 = new ScimGroup => [
		name = "group1"
	]
	static var ScimGroup testGroup2 = new ScimGroup => [
		name = "group2"
	]
	
	@BeforeClass
	static def void setup() {
		val config = new Wso2Configuration => [
			adminUsername = "strauss@artist-repo.eu"
			adminPassword = "4r3e2w1q"
		]
		client = new Wso2Client(config)
	}
	
	@Before
	def void cleanUp() {
		val user1 = client.getUserByUsername(testUser1.username)
		if (user1.present) {
			client.deleteUser(user1.get)
		}
		val user2 = client.getUserByUsername(testUser2.username)
		if (user2.present) {
			client.deleteUser(user2.get)
		}
		val group1 = client.getGroupByName(testGroup1.name)
		if (group1.present) {
			client.deleteGroup(group1.get)
		}
		val group2 = client.getGroupByName(testGroup2.name)
		if (group2.present) {
			client.deleteGroup(group2.get)
		}
	}
	
	@Test
	def void createUser() {
		val result1 = client.getUserByUsername(testUser1.username)		
		Assert.assertFalse(result1.present)
		
		val created = client.createUser(testUser1)
		
		val result2 = client.getUserByUsername(testUser1.username)		
		Assert.assertTrue(result2.present)
		
		Assert.assertEquals(created, result2)
	} 

	@Test
	def void getUserByName() {
		val result1 = client.getUserByUsername(testUser1.username)		
		Assert.assertFalse(result1.present)
		
		val created = client.createUser(testUser1)
		val retrieved = client.getUserByUsername(testUser1.username)
		
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(created.get, retrieved.get)
	}

	@Test
	def void getUserById() {
		val result1 = client.getUserByUsername(testUser1.username)		
		Assert.assertFalse(result1.present)
		
		val created = client.createUser(testUser1)
		val retrieved = client.getUserById(created.get.scimId)
		
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(created.get, retrieved.get)
	}

	@Test
	def void listUsers() {
		val before = client.listUsers		
		Assert.assertEquals(0, before.size)
		
		val created1 = client.createUser(testUser1)
		
		val after1 = client.listUsers		
		Assert.assertEquals(1, after1.size)
		Assert.assertEquals(created1.get, after1.get(0))

		val created2 = client.createUser(testUser2)
		
		val after2 = client.listUsers		
		Assert.assertEquals(2, after2.size)
		Assert.assertEquals(created1.get, after2.get(0))
		Assert.assertEquals(created2.get, after2.get(1))
	}

	@Test
	def void updateUser() {
		val created = client.createUser(testUser1)
		Assert.assertTrue(created.present)
		
		val created2 = created.get => [
			emails = newArrayList("test.test@test.com")
			name = new ScimName => [
				givenName = "Tester"
				familyName = "Test"
			]
		]
		val updated = client.updateUser(created2)
		Assert.assertTrue(updated.present)
		
		val retrieved = client.getUserByUsername(updated.get.username)
				
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(retrieved.get.username, created2.username)
		Assert.assertEquals(retrieved.get.username, testUser1.username)
		Assert.assertEquals(retrieved.get.emails, created2.emails)
		Assert.assertEquals(retrieved.get.name.givenName, created2.name.givenName)
		Assert.assertEquals(retrieved.get.name.familyName, created2.name.familyName)
	}


	@Test
	def void createGroup() {
		val result1 = client.getGroupByName(testGroup1.name)		
		Assert.assertFalse(result1.present)
		
		val created = client.createGroup(testGroup1)
		
		val result2 = client.getGroupByName(testGroup1.name)		
		Assert.assertTrue(result2.present)
		
		Assert.assertEquals(created, result2)
	} 

	@Test
	def void getGroupByName() {
		val result1 = client.getGroupByName(testGroup1.name)		
		Assert.assertFalse(result1.present)
		
		val created = client.createGroup(testGroup1)
		println("Created: " + created)
		val retrieved = client.getGroupByName(testGroup1.name)
		println("By name: " + retrieved)
		
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(created.get, retrieved.get)
	}

	@Test
	def void getGroupById() {
		val result1 = client.getGroupByName(testGroup1.name)		
		Assert.assertFalse(result1.present)
		
		val created = client.createGroup(testGroup1)
		val retrieved = client.getGroupById(created.get.scimId)
		
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(created.get, retrieved.get)
	}

	@Test
	def void listGroups() {
		val before = client.listGroups	
		// Admin group is always present	
		Assert.assertEquals(0, before.size)
		
		val created1 = client.createGroup(testGroup1)
		
		val after1 = client.listGroups		
		Assert.assertEquals(1, after1.size)
		Assert.assertEquals(created1.get, after1.get(0))

		val created2 = client.createGroup(testGroup2)
		
		val after2 = client.listGroups		
		Assert.assertEquals(2, after2.size)
		Assert.assertEquals(created1.get, after2.get(0))
		Assert.assertEquals(created2.get, after2.get(1))
	}

	@Test
	def void updateGroup() {
		val created = client.createGroup(testGroup1)
		Assert.assertTrue(created.present)
		
		val created2 = created.get => [
			name = testGroup2.name
		]
		val updated = client.updateGroup(created2)
		Assert.assertTrue(updated.present)
		
		val retrieved = client.getGroupByName(updated.get.name)
				
		Assert.assertTrue(retrieved.present)
		Assert.assertEquals(created2.name, retrieved.get.name)
		Assert.assertEquals(testGroup2.name, retrieved.get.name)
	}

	@Test
	def void addUserToGroup() {
		val group1 = client.createGroup(testGroup1)
		Assert.assertTrue(group1.present)
		
		val user1 = client.createUser(testUser1)
		Assert.assertTrue(user1.present)
		
		client.addUserToGroup(user1.get, group1.get)
		val result1 = client.getGroupById(group1.get.scimId)
		Assert.assertTrue(result1.present)

		Assert.assertEquals(1, result1.get.users.size)
		Assert.assertEquals(user1.get.scimId, result1.get.users.head.id)
		Assert.assertEquals(user1.get.username, result1.get.users.head.name)
		
		client.removeUserFromGroup(user1.get, group1.get)
		val result2 = client.getGroupById(group1.get.scimId)
		Assert.assertEquals(0, result2.get.users.size)
	}

}