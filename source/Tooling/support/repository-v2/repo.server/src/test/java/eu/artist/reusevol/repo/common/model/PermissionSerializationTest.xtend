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
 
package eu.artist.reusevol.repo.common.model

import com.fasterxml.jackson.databind.ObjectMapper
import eu.artist.reusevol.repo.common.access.Permission
import io.dropwizard.jackson.Jackson
import org.junit.BeforeClass
import org.junit.Test

import static io.dropwizard.testing.FixtureHelpers.*
import static org.fest.assertions.api.Assertions.*

class PermissionSerializationTest {

	private static val ObjectMapper MAPPER = Jackson.newObjectMapper()

	@BeforeClass
	static def void setup() {
	}

	@Test
	def void serializesToJSON() throws Exception {
		val perm = newArrayList(
			new PermissionEntry("guest", Permission.VIEW), 
			new PermissionEntry("admin", Permission.MANAGE)
		)

		assertThat(MAPPER.writeValueAsString(perm)).isEqualTo(fixture("fixtures/permissions.json"))
	}
	
	@Test
	def void deserializesFromJSON() throws Exception {
		val perm = newArrayList(
			new PermissionEntry("guest", Permission.VIEW), 
			new PermissionEntry("admin", Permission.MANAGE)
		)

		assertThat(MAPPER.readValue(fixture("fixtures/permissions.json"), typeof(PermissionEntry[]))).isEqualTo(perm)
	}

}
