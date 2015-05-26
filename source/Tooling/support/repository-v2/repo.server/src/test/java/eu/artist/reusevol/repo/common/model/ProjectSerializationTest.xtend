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
import io.dropwizard.jackson.Jackson
import org.junit.BeforeClass
import org.junit.Test

import static io.dropwizard.testing.FixtureHelpers.*
import static org.fest.assertions.api.Assertions.*

class ProjectSerializationTest {

	private static val ObjectMapper MAPPER = Jackson.newObjectMapper()

	@BeforeClass
	static def void setup() {
	}

	@Test
	def void serializesProjectToJSON() throws Exception {
		val project = new RepoProject("DEWS", "DEWS", "DEWS Project")

		assertThat(MAPPER.writeValueAsString(project)).isEqualTo(fixture("fixtures/project.json"))
	}

	@Test
	def void deserializesProjectFromJSON() throws Exception {
		val project = new RepoProject("DEWS", "DEWS", "DEWS Project")

		assertThat(MAPPER.readValue(fixture("fixtures/project.json"), RepoProject)).isEqualTo(project)
	}

	@Test
	def void serializesProjectWithPackageToJSON() throws Exception {
		val project = new RepoProject("DEWS", "DEWS", "DEWS Project")
		val pkg1 = new RepoPackage("eu.artist")
		val pkg2 = new RepoPackage("eu.artist.dews")
		project.packages.add(pkg1)
		project.packages.add(pkg2)

		assertThat(MAPPER.writeValueAsString(project)).isEqualTo(fixture("fixtures/project_with_package.json"))
	}

	@Test
	def void deserializesProjectWithPackageFromJSON() throws Exception {
		val project = new RepoProject("DEWS", "DEWS", "DEWS Project")
		val pkg1 = new RepoPackage("eu.artist")
		val pkg2 = new RepoPackage("eu.artist.dews")
		project.packages.add(pkg1)
		project.packages.add(pkg2)

		assertThat(MAPPER.readValue(fixture("fixtures/project_with_package.json"), RepoProject)).isEqualTo(project)
	}
}
