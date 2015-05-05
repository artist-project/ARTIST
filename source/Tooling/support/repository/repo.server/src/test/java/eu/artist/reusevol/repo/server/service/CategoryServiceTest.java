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

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

@RunWith(JUnit4.class)
public class CategoryServiceTest extends BaseServiceTest {
	private static final String BASE = JcrPathUtil.CATEGORY_BASE_PATH
			+ "/root/children";

	@Inject
	private CategoryService service;

	@Inject
	private Session session;

	@Before
	public void prepareDatabase() {
		clearCategories();
		setupTestContent();
	}

	@Test
	public void testCreateNonExistingWithParentCategory()
			throws RepositoryException {
		// Check
		assertTrue(session.nodeExists(BASE + "/modelling"));
		assertTrue(session.nodeExists(BASE + "/modelling/children/uml"));
		assertTrue(session.nodeExists(BASE
				+ "/modelling/children/uml/children/profile"));
	}

	@Test(expected = NoSuchEntityException.class)
	public void testCreateNonExistingWithoutParentCategory()
			throws RepositoryException {
		// Exec
		service.create(CategoryName.of("xml.xmi"), "XMI", "XMI");
	}

	@Test
	public void testCreateExistingCategory() throws RepositoryException {
		// Exec
		service.create(CategoryName.of("modelling"), "Test", "Test");

		// Check
		RepoCategory cat = service.get(CategoryName.of("modelling")).get();
		assertEquals("Test", cat.getLabel());
		assertEquals("Test", cat.getDescription());
		assertEquals(1, cat.getCategories().size());
		assertEquals("modelling", cat.getId());
		assertEquals(null, cat.getParent());
	}

	@Test(expected = NoSuchEntityException.class)
	public void testDeleteNonExistentCategory() throws RepositoryException {
		// Setup
		RepoCategory xmi = new RepoCategory(CategoryName.of("xml.xmi"), "XMI",
				"XMI");
		// Exec
		service.delete(xmi);
	}

	@Test
	public void testDeleteExistentEmptyCategory() throws RepositoryException {
		// Setup
		RepoCategory profile = service.get(
				CategoryName.of("modelling.uml.profile")).get();
		// Exec
		service.delete(profile);

		// Check
		RepoCategory cat = service.get(CategoryName.of("modelling.uml")).get();
		assertEquals(0, cat.getCategories().size());
		assertFalse(session.nodeExists(BASE
				+ "/modelling/children/uml/children/profile"));
	}

	@Test(expected = IllegalStateException.class)
	public void testDeleteExistentNonEmptyCategory() throws RepositoryException {
		// Setup
		RepoCategory uml = service.get(CategoryName.of("modelling.uml")).get();

		// Exec
		service.delete(uml);
	}

	@Test
	public void testForceDeleteCategory() throws RepositoryException {
		// Setup
		RepoCategory uml = service.get(CategoryName.of("modelling.uml")).get();

		// Exec
		service.forceDelete(uml);

		// Check
		assertTrue(session.nodeExists(BASE + "/modelling"));
		assertFalse(session.nodeExists(BASE + "/modelling/children/uml"));
		assertFalse(session.nodeExists(BASE
				+ "/modelling/children/uml/children/profile"));
	}

	@Test
	public void testGetNonExistentCategory() throws RepositoryException {
		// Exec
		Optional<RepoCategory> cat = service.get(CategoryName
				.of("non_existent"));

		// Check
		assertFalse(cat.isPresent());
	}

	@Test
	public void testGetPureCategory() throws RepositoryException {
		// Exec
		RepoCategory cat = service.getShallow(CategoryName.of("modelling"))
				.get();

		// Check
		assertEquals("Modelling", cat.getLabel());
		assertEquals("Modelling artefacts", cat.getDescription());
		assertEquals(0, cat.getCategories().size());
		assertEquals("modelling", cat.getId());
		assertEquals(null, cat.getParent());
	}

	@Test
	public void testGetCategory() throws RepositoryException {
		// Exec
		RepoCategory cat = service.get(CategoryName.of("modelling")).get();

		// Check
		assertEquals("Modelling", cat.getLabel());
		assertEquals("Modelling artefacts", cat.getDescription());
		assertEquals(1, cat.getCategories().size());
		assertEquals("modelling", cat.getId());
		assertEquals(null, cat.getParent());
		RepoCategory uml = cat.getCategories().get(0);
		assertEquals(0, uml.getCategories().size());
	}

	@Test
	public void testGetCategoryTree() throws RepositoryException {
		// Exec
		RepoCategory cat = service.getTree(CategoryName.of("modelling")).get();

		// Check
		assertEquals("Modelling", cat.getLabel());
		assertEquals("Modelling artefacts", cat.getDescription());
		assertEquals(1, cat.getCategories().size());
		assertEquals("modelling", cat.getId());
		assertEquals(null, cat.getParent());

		RepoCategory uml = cat.getCategories().get(0);
		assertEquals("UML", uml.getLabel());
		assertEquals("UML related artefacts", uml.getDescription());
		assertEquals(1, uml.getCategories().size());
		assertEquals("modelling.uml", uml.getId());
		assertEquals(cat, uml.getParent());
	}

	@Test
	public void testUpdateExistingCategory() throws RepositoryException {
		// Setup
		RepoCategory uml = service.get(CategoryName.of("modelling.uml")).get();
		assertEquals("UML", uml.getLabel());
		assertEquals("UML related artefacts", uml.getDescription());
		LOGGER.debug("Category before: " + uml.toString());

		// Exec
		uml.setLabel("UML-Models");
		uml.setDescription("UML-Models");
		service.update(uml);

		// Check
		RepoCategory cat = service.get(CategoryName.of("modelling.uml")).get();
		LOGGER.debug("Category after: " + cat.toString());
		assertEquals("UML-Models", cat.getLabel());
		assertEquals("UML-Models", cat.getDescription());
		assertEquals(1, cat.getCategories().size());
		assertEquals("modelling.uml", cat.getId());
		assertEquals(null, cat.getParent());

		RepoCategory profile = cat.getCategories().get(0);
		assertEquals("UML Profile", profile.getLabel());
		assertEquals("UML profiles", profile.getDescription());
		assertEquals(0, profile.getCategories().size());
		assertEquals("modelling.uml.profile", profile.getId());
		assertEquals(cat, profile.getParent());
	}

	@Test(expected = NoSuchEntityException.class)
	public void testUpdateNonExistingCategory() throws RepositoryException {
		// Setup
		RepoCategory xmi = new RepoCategory(CategoryName.of("xml.xmi"), "XMI",
				"XMI");

		// Exec
		service.update(xmi);
	}

	private void clearCategories() {
		try {
			Node catRoot = session.getNode(BASE);
			for (NodeIterator it = catRoot.getNodes(); it.hasNext();) {
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

	private void setupTestContent() {
		service.create(CategoryName.of("modelling"), "Modelling",
				"Modelling artefacts");
		service.create(CategoryName.of("modelling.uml"), "UML",
				"UML related artefacts");
		service.create(CategoryName.of("modelling.uml.profile"), "UML Profile",
				"UML profiles");
	}
}
