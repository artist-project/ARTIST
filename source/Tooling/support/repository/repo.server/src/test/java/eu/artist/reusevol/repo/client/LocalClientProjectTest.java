/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Properties;

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.log4j.Logger;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.Configuration;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.rest.ProjectResource;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.service.ProjectService;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.jcr.JcrSessionProvider;
import eu.artist.reusevol.repo.server.jcr.JcrUtils;
import eu.artist.reusevol.repo.server.jcr.JcromProvider;
import eu.artist.reusevol.repo.server.rest.CategoryResourceImpl;
import eu.artist.reusevol.repo.server.rest.ProjectResourceImpl;
import eu.artist.reusevol.repo.server.rest.RepositoryApplication;
import eu.artist.reusevol.repo.server.security.AuthorizationInterceptor;
import eu.artist.reusevol.repo.server.security.RequestHolder;
import eu.artist.reusevol.repo.server.service.CategoryDAO;
import eu.artist.reusevol.repo.server.service.CategoryServiceImpl;
import eu.artist.reusevol.repo.server.service.ProjectDAO;
import eu.artist.reusevol.repo.server.service.ProjectServiceImpl;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

@EnableServices(value = "jax-rs", httpDebug = true)
@RunWith(ApplicationComposer.class)
public class LocalClientProjectTest {
	private static final String BASE_URL = "http://localhost:4204/repo.server/api1";
	private static final String BASE_PATH = JcrPathUtil.PROJECT_BASE_PATH;

	private final String ID = "test_project";
	private final String NAME = "Test project";
	private final String DESC = "This is a test project.";

	private final String ID2 = "test_project_2";
	private final String NAME2 = "Another test project";
	private final String DESC2 = "This is a second test project.";

	private static final Logger LOGGER = Logger
			.getLogger(LocalClientProjectTest.class);

	private ProjectManager service;

	@Inject
	private ProjectService projectService;

	@Before
	public void prepareEnvironment() {
		LOGGER.debug("Setting up database.");
		clearProjects();
		setupDb();
		RepositoryClient client = new RepositoryClient(new ConnectionInfo(
				BASE_URL, "test", "test"));
		service = client.getProjectManager();
	}

	@Test
	public void testCreateNewProject() throws RepositoryException {
		// Check
		assertTrue("Project root should have been created", getSession()
				.nodeExists(BASE_PATH));
		assertTrue("The project node should have been created", getSession()
				.nodeExists(BASE_PATH + ID));

		Node projectNode = getSession().getNode(BASE_PATH + ID);
		assertEquals(ID, projectNode.getName());
		assertEquals(NAME, projectNode.getProperty("label").getString());
		assertEquals(DESC, projectNode.getProperty("description").getString());
	}

	@Test
	public void testCreateExistingProject() throws RepositoryException {
		// Setup
		ProjectName name = ProjectName.of(ID);
		RepoProject project = service.get(name).get();
		assertEquals(ID, project.getId());
		assertEquals(NAME, project.getLabel());
		assertEquals(DESC, project.getDescription());

		// Exec
		service.create(name, NAME2, DESC2);

		// Check
		project = service.get(name).get();
		assertEquals(ID, project.getId());
		assertEquals(NAME2, project.getLabel());
		assertEquals(DESC2, project.getDescription());
	}

	@Test
	public void testGetExistingProject() {
		// Exec
		RepoProject project = service.get(ProjectName.of(ID)).get();

		// Check
		assertEquals(ID, project.getId());
		assertEquals(NAME, project.getLabel());
		assertEquals(DESC, project.getDescription());
	}

	// TODO: getShallow
	// TODO: getTree

	@Test
	public void testGetNonExistingProject() {
		// Exec
		Optional<RepoProject> project = service.get(ProjectName.of(ID2));

		// Check
		assertFalse(project.isPresent());
	}

	@Test
	public void testUpdateExistingProject() throws RepositoryException {
		// Setup
		ProjectName name = ProjectName.of(ID);
		RepoProject original = service.get(name).get();
		assertEquals(ID, original.getId());
		assertEquals(NAME, original.getLabel());
		assertEquals(DESC, original.getDescription());

		// Exec
		service.update(name, NAME2, DESC2);

		// Check
		Node projectNode = getSession().getNode(BASE_PATH + ID);
		assertEquals(NAME2, projectNode.getProperty("label").getString());
		assertEquals(DESC2, projectNode.getProperty("description").getString());
	}

	@Test(expected = NoSuchEntityException.class)
	public void testUpdateNonExistingProject() throws RepositoryException {
		// Exec
		service.update(ProjectName.of(ID2), NAME2, DESC2);
	}

	@Test
	public void testDeleteExistingShallowProject() throws RepositoryException {
		// Setup
		ProjectName name = ProjectName.of(ID);
		RepoProject project = service.get(name).get();

		// Exec
		service.delete(project);

		// Check
		Optional<RepoProject> deleted = service.get(name);
		assertFalse(deleted.isPresent());
	}

	// TODO: forceDelete

	@Test(expected = NoSuchEntityException.class)
	public void testDeleteNonExistingProject() throws RepositoryException {
		// Setup
		RepoProject project = service.get(ProjectName.of(ID)).get();

		// Exec
		project.setId(ID2);
		service.delete(project);
	}

	@Test
	public void testGetAllProjects() throws RepositoryException {
		// Setup
		service.delete(service.getShallow(ProjectName.of(ID)).get());

		// Exec
		List<RepoProject> result = service.findAllProjects();

		// Check
		assertEquals(0, result.size());

		// Exec
		RepoProject first = service.create(ProjectName.of(ID), NAME, DESC);
		RepoProject second = service.create(ProjectName.of(ID2), NAME2, DESC2);
		result = service.findAllProjects();

		// Check
		assertEquals(2, result.size());
		assertTrue(result.contains(first));
		assertTrue(result.contains(second));
	}

	@Configuration
	public Properties configuration() {
		Properties p = new Properties();
		p.put("jcr",
				"new://Resource?class-name=eu.artist.reusevol.repo.server.tomee.JcrServerResourceAdapter&factory-name=getRepository");
		p.put("jcr.repositoryURL", "file:///modeshape-config.json");
		return p;
	}

	@Module
	@Classes(value = { CategoryResource.class, CategoryResourceImpl.class,
			CategoryService.class, CategoryServiceImpl.class,
			CategoryDAO.class, ProjectResource.class,
			ProjectResourceImpl.class, ProjectServiceImpl.class,
			ProjectService.class, ProjectDAO.class, JcromProvider.class,
			JcrSessionProvider.class, RepositoryApplication.class,
			AuthorizationInterceptor.class }, cdiInterceptors = { AuthorizationInterceptor.class })
	public WebApp app() {
		WebApp app = new WebApp();
		app.contextRoot("repo.server");
		app.addServlet("REST Application",
				RepositoryApplication.class.getName()).addInitParam(
				"REST Application", "javax.ws.rs.Application",
				RepositoryApplication.class.getName());
		app.addFilter("requestholder", RequestHolder.class.getName(), "/*");
		return app;
	}

	private Session getSession() {
		ProjectServiceImpl impl = (ProjectServiceImpl) projectService;
		return impl.getDao().getSession();
	}

	private void clearProjects() {
		try {
			Node root = getSession().getNode(BASE_PATH);
			for (NodeIterator it = root.getNodes(); it.hasNext();) {
				Node child = it.nextNode();
				child.remove();
			}
			getSession().save();
		} catch (PathNotFoundException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}

	private void setupDb() {
		projectService.create(ProjectName.of(ID), NAME, DESC);
		LOGGER.debug(JcrUtils.printTree(getSession(), "/projects"));
	}
}
