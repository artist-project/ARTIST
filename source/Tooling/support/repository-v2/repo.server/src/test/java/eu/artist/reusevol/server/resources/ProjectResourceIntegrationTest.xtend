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

import com.sun.jersey.api.client.Client
import eu.artist.reusevol.repo.common.model.RepoProject
import eu.artist.reusevol.server.RepositoryConfiguration
import eu.artist.reusevol.server.RepositoryService
import io.dropwizard.testing.junit.DropwizardAppRule
import java.util.List
import org.junit.ClassRule
import org.junit.Test

import static org.fest.assertions.api.Assertions.*

class ProjectResourceIntegrationTest {
	
    @ClassRule
    public static val RULE =
            new DropwizardAppRule<RepositoryConfiguration>(RepositoryService, "repository.yml")

    @Test
    def void getProjects() {
        val client = new Client()

        val List<RepoProject> result = client.resource('''http://localhost:«RULE.localPort»/projects''')
                .get(List)

		println(result)
        assertThat(result).isNotEmpty
    }
}