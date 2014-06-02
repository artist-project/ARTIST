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
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.rest.ProjectResource;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.server.jcr.JcrSessionProvider;
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
public class LocalClientCategoryTest {
	private static final String BASE_URL = "http://localhost:4204/repo.server/api1";
	private static final String BASE = JcrPathUtil.CATEGORY_BASE_PATH
			+ "/root/children";

	private static final Logger LOGGER = Logger
			.getLogger(LocalClientCategoryTest.class);

	private CategoryManager service;

	@Inject
	private CategoryService categoryService;

	@Before
	public void prepareEnvironment() {
		LOGGER.debug("Setting up database.");
		clearCategories();
		setupTestContent();
		RepositoryClient client = new RepositoryClient(new ConnectionInfo(
				BASE_URL, "test", "test"));
		service = client.getCategoryManager();
	}

	@Test
	public void testCreateNonExistingWithParentCategory()
			throws RepositoryException {
		// Exec
		CategoryName path = CategoryName.of("testing");
		service.create(path, "Testing", "Testing");

		// Check
		Session session = getSession();
		assertTrue(session.nodeExists(BASE + "/testing"));
		RepoCategory testing = categoryService.getShallow(path).get();
		assertEquals("Testing", testing.getLabel());
		assertEquals("Testing", testing.getDescription());
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
		RepoCategory cat = categoryService.get(CategoryName.of("modelling"))
				.get();
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
		RepoCategory cat = categoryService
				.get(CategoryName.of("modelling.uml")).get();
		assertEquals(0, cat.getCategories().size());
		assertFalse(getSession().nodeExists(
				BASE + "/modelling/children/uml/children/profile"));
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
		Session session = getSession();
		assertTrue(session.nodeExists(BASE + "/modelling"));
		assertFalse(session.nodeExists(BASE + "/modelling/children/uml"));
		assertFalse(session.nodeExists(BASE
				+ "/modelling/children/uml/children/profile"));
	}

	@Test(expected = NoSuchEntityException.class)
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
		assertEquals(null, uml.getParent());
	}

	@Test
	public void testUpdateExistingCategory() throws RepositoryException {
		// Setup
		RepoCategory uml = service.get(CategoryName.of("modelling.uml")).get();
		assertEquals("UML", uml.getLabel());
		assertEquals("UML related artefacts", uml.getDescription());

		// Exec
		uml.setLabel("UML-Models");
		uml.setDescription("UML-Models");
		service.update(uml);

		// Check
		RepoCategory cat = service.get(CategoryName.of("modelling.uml")).get();
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
		assertEquals(null, profile.getParent());
	}

	@Test(expected = NoSuchEntityException.class)
	public void testUpdateNonExistingCategory() throws RepositoryException {
		// Setup
		RepoCategory xmi = new RepoCategory(CategoryName.of("xml.xmi"), "XMI",
				"XMI");

		// Exec
		service.update(xmi);
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
			ProjectDAO.class, JcromProvider.class, JcrSessionProvider.class,
			RepositoryApplication.class, AuthorizationInterceptor.class }, cdiInterceptors = { AuthorizationInterceptor.class })
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

	private void clearCategories() {
		Session session = getSession();
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

	private Session getSession() {
		CategoryServiceImpl impl = (CategoryServiceImpl) categoryService;
		return impl.getDao().getSession();
	}

	private void setupTestContent() {
		categoryService.create(CategoryName.of("modelling"), "Modelling",
				"Modelling artefacts");
		categoryService.create(CategoryName.of("modelling.uml"), "UML",
				"UML related artefacts");
		categoryService.create(CategoryName.of("modelling.uml.profile"),
				"UML Profile", "UML profiles");
	}
}
