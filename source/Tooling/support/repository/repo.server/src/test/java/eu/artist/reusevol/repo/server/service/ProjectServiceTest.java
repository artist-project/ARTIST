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
package eu.artist.reusevol.repo.server.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.jcr.JcrUtils;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

@RunWith(JUnit4.class)
public class ProjectServiceTest extends BaseServiceTest {
	private final String ID = "test_project";
	private final String NAME = "Test project";
	private final String DESC = "This is a test project.";

	private final String ID2 = "test_project_2";
	private final String NAME2 = "Another test project";
	private final String DESC2 = "This is a second test project.";

	@Inject
	private ProjectServiceImpl service;

	@Inject
	private Session session;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void setupEnvironment() {
		clearProjects();
		setupDb();
	}

	@Test
	public void testCreateNewProject() throws RepositoryException {
		// Check
		assertTrue("Project root should have been created",
				session.nodeExists(JcrPathUtil.PROJECT_BASE_PATH));
		assertTrue("The project node should have been created",
				session.nodeExists(JcrPathUtil.PROJECT_BASE_PATH + ID));

		Node projectNode = session.getNode(JcrPathUtil.PROJECT_BASE_PATH + ID);
		tools.printSubgraph(projectNode);
		assertEquals(ID, projectNode.getName());
		assertEquals(NAME, projectNode.getProperty("label").getString());
		assertEquals(DESC, projectNode.getProperty("description").getString());
	}

	@Test
	public void testCreateExistingProject() throws RepositoryException {
		// Setup
		ProjectName id = ProjectName.of(ID);
		RepoProject project = service.get(id).get();
		assertEquals(ID, project.getId());
		assertEquals(NAME, project.getLabel());
		assertEquals(DESC, project.getDescription());

		// Exec
		service.create(id, NAME2, DESC2);

		// Check
		project = service.get(id).get();
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
		LOGGER.debug(JcrUtils.printTree(session, JcrPathUtil.PROJECT_BASE_PATH));
		Node projectNode = session.getNode(JcrPathUtil.PROJECT_BASE_PATH + ID);
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
		ProjectName id = ProjectName.of(ID);
		RepoProject project = service.get(id).get();

		// Exec
		service.delete(project);

		// Check
		Optional<RepoProject> deleted = service.get(id);
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

	/*
	 * @Test public void testAddPackage() throws RepositoryException {
	 * LOGGER.info("testAddPackage()");
	 * 
	 * RepoProject expected = new RepoProject("Package Test", "Sometext.");
	 * RepoPackage pkg = new RepoPackage("eu.artist", "Test package");
	 * expected.addPackage(pkg); service.createProject(expected);
	 * 
	 * assertTrue( "Subpackage node should exist.",
	 * session.nodeExists(expected.getPath() + "/packages/" + pkg.getName()));
	 * 
	 * tools.printSubgraph(session.getNode(expected.getPath())); //
	 * tools.printSubgraph(session.getNode(expected.getPath() + "/packages/" //
	 * + pkg.getName())); }
	 * 
	 * @Test public void testDeletePackage() throws RepositoryException {
	 * LOGGER.info("testDeletePackage()");
	 * 
	 * RepoProject expected = new RepoProject("Package Delete Test",
	 * "Sometext."); RepoPackage pkg = new RepoPackage("eu.artist",
	 * "Test package"); expected.addPackage(pkg);
	 * service.createProject(expected);
	 * 
	 * assertTrue( "Subpackage node should exist.",
	 * session.nodeExists(expected.getPath() + "/packages/" + pkg.getName()));
	 * 
	 * expected.getPackages().remove(pkg.getName());
	 * service.updateProject(expected);
	 * 
	 * assertFalse( "Subpackage node should have been removed.",
	 * session.nodeExists(expected.getPath() + "/packages/" + pkg.getName()));
	 * 
	 * tools.printSubgraph(session.getNode(expected.getPath())); //
	 * tools.printSubgraph(session.getNode(expected.getPath() + "/packages/" //
	 * + pkg.getName())); }
	 */

	private void clearProjects() {
		try {
			Node root = session.getNode(JcrPathUtil.PROJECT_BASE_PATH);
			for (NodeIterator it = root.getNodes(); it.hasNext();) {
				Node child = it.nextNode();
				child.remove();
			}
			session.save();
		} catch (PathNotFoundException e) {
			e.printStackTrace();
		} catch (RepositoryException e) {
			e.printStackTrace();
		}
	}

	private void setupDb() {
		service.create(ProjectName.of(ID), NAME, DESC);
	}
}
