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
 
package eu.artist.reusevol.server.resources

import com.google.common.base.Optional
import eu.artist.reusevol.repo.common.model.Group
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.core.service.ProjectService
import eu.artist.reusevol.server.util.IdParam
import org.junit.Test

import static org.fest.assertions.api.Assertions.assertThat
import static org.mockito.Matchers.*
import static org.mockito.Mockito.*

class TestProjectResource {

	@Test
	def void testGetProject() {
		val project = new RepoProject("blah")
		val id = new IdParam(project.id)
		val user = new User(null, "test", "Tester Test", "test@test.com", newArrayList(new Group("test")))
		
		val service = mock(ProjectService)
		when(service.get(eq(id), eq(new Depth("entity")))).thenReturn(Optional.of(project))
		
		val resource = new ProjectResource(service, null)
		val result = resource.get(new IdParam(project.id), Optional.absent, user) 
		
		assertThat(result.present).isEqualTo(true)
		assertThat(result.get).isEqualTo(project)
		
		verify(service).get(id, new Depth("entity"))
	}
}
