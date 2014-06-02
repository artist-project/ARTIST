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

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.Configuration;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.jcrom.util.JcrDataUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.FileContent;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.model.WebContent;
import eu.artist.reusevol.repo.common.rest.ArtefactResource;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.rest.ProjectResource;
import eu.artist.reusevol.repo.common.service.ArtefactService;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.service.ProjectService;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.jcr.JcrSessionProvider;
import eu.artist.reusevol.repo.server.jcr.JcrUtils;
import eu.artist.reusevol.repo.server.jcr.JcromProvider;
import eu.artist.reusevol.repo.server.rest.ArtefactResourceImpl;
import eu.artist.reusevol.repo.server.rest.CategoryResourceImpl;
import eu.artist.reusevol.repo.server.rest.ProjectResourceImpl;
import eu.artist.reusevol.repo.server.rest.RepositoryApplication;
import eu.artist.reusevol.repo.server.security.AuthorizationInterceptor;
import eu.artist.reusevol.repo.server.security.RequestHolder;
import eu.artist.reusevol.repo.server.service.ArtefactDAO;
import eu.artist.reusevol.repo.server.service.ArtefactServiceImpl;
import eu.artist.reusevol.repo.server.service.CategoryDAO;
import eu.artist.reusevol.repo.server.service.CategoryServiceImpl;
import eu.artist.reusevol.repo.server.service.PackageDAO;
import eu.artist.reusevol.repo.server.service.ProjectDAO;
import eu.artist.reusevol.repo.server.service.ProjectServiceImpl;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

@EnableServices(value = "jax-rs", httpDebug = true)
@RunWith(ApplicationComposer.class)
public class LocalClientArtefactTest {
	private static final Logger LOGGER = Logger
			.getLogger(LocalClientArtefactTest.class);

	private static final String BASE = "/projects";
	private static final String BASE_URL = "http://localhost:4204/repo.server/api1";

	private ArtefactManager service;
	private RepoArtefact guiDummy, serverDummy;

	@Inject
	private ProjectServiceImpl projectService;

	@Inject
	private ArtefactService artefactService;

	@Before
	public void prepareEnvironment() throws Exception {
		LOGGER.debug("Setting up database.");
		clearArtefacts();
		setupTestContent();
		RepositoryClient client = new RepositoryClient(new ConnectionInfo(
				BASE_URL, "test", "test"));
		service = client.getArtefactManager();
	}

	@Test
	public void createArtefacts() {
		// Setup

		// Execute
		RepoProject test = projectService.getTree(ProjectName.PUBLIC).get();
		RepoPackage gui = test.getPackage("eu.artist.uc.dews.gui");
		RepoPackage server = test.getPackage("eu.artist.uc.dews.server");
		RepoArtefact guiArtefact = gui.getArtefact("gwt_uml_profile");
		RepoArtefact serverArtefact = server.getArtefact("data-model");

		// Check
		assertNotNull(test);
		assertNotNull(gui);
		assertNotNull(server);
		assertNotNull(guiArtefact);
		assertNotNull(serverArtefact);
		assertNotNull(guiDummy);
		assertNotNull(serverDummy);
		assertEquals(guiDummy.getId(), guiArtefact.getId());
		assertEquals(serverDummy.getId(), serverArtefact.getId());
		LOGGER.debug(JcrUtils.printTree(getSession(), "/projects"));
	}

	@Test
	public void createArtefacts2() {
		// Setup
		RepoArtefact dummy = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.server", "data-model2"))
				.label("Data Model")
				.description("DEWS data model")
				.namespaceURI("http://www.omg.org/er/1.0.0")
				.tags("database", "domain", "dews")
				.content(
						FileContent.of(JcrDataUtils.fromInputStream(
								"log4j.properties",
								this.getClass().getResourceAsStream(
										"/log4j.properties"), "text/plain")))
				.categories("model.er.entity", "domain.layer.database").build();

		// Execute
		service.create(ProjectName.PUBLIC, dummy);
		Optional<RepoArtefact> dummy2 = service.get(ProjectName.PUBLIC,
				dummy.getArtefactId());

		// Check
		assertTrue(dummy2.isPresent());
		assertNotNull(dummy2.get().getContent());
		assertNotNull(dummy2.get().getContent().getContent());
		LOGGER.debug(JcrUtils.printTree(getSession(), "/projects"));
	}

	@Test(expected = EntityCreationException.class)
	public void createExistingArtefacts() {
		// Setup
		RepoArtefact update = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.gui", "gwt_uml_profile"))
				.label("Some profile").description("Some description")
				.tags("model").build();

		// Execute
		service.create(ProjectName.PUBLIC, update);
	}

	@Test
	public void createContent() throws Exception {
		// Setup
		RepoArtefact artefact = artefactService.get(ProjectName.PUBLIC,
				guiDummy.getArtefactId()).get();

		// Execute
		InputStream in = this.getClass().getResourceAsStream(
				"/modeshape-config.json");
		String expected = readStream(in);
		in.close();
		artefact.setContent(FileContent.of(JcrDataUtils.fromInputStream(
				"log4j.properties",
				this.getClass().getResourceAsStream("/modeshape-config.json"),
				"text/plain")));
		RepoArtefact artefact2 = service.update(ProjectName.PUBLIC, artefact);

		// Check
		Optional<RepoArtefact> result = artefactService.get(ProjectName.PUBLIC,
				artefact2.getArtefactId());

		assertTrue(result.isPresent());
		assertNotNull(result.get().getContent());
		assertNotNull(result.get().getContent().getContent());

		in = result.get().getContent().getContent();
		String actual = readStream(in);
		in.close();
		assertEquals(expected, actual);
	}

	@Test
	public void deleteExistingArtefact() {
		// Setup
		// Execute
		ArtefactId id = ArtefactId.of("eu.artist.uc.dews.server", "data-model");
		service.delete(ProjectName.PUBLIC, id);

		// Check
		String path = JcrPathUtil.getArtefactPath(ProjectName.PUBLIC, id);
		assertFalse(getDao().exists(path));
	}

	@Test
	public void deleteNonExistingArtefact() {
		// Setup
		// Execute
		ArtefactId id = ArtefactId.of("eu.artist.uc.dews.server",
				"no-data-model");
		service.delete(ProjectName.PUBLIC, id);

		// Check
		String path = JcrPathUtil.getArtefactPath(ProjectName.PUBLIC, id);
		assertFalse(getDao().exists(path));
	}

	@Test(expected = NoSuchEntityException.class)
	public void updateNonExistingArtefact() throws Exception {
		RepoArtefact dummy = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.gui", "non-existing-artefact"))
				.label("Pricing UML profile")
				.description("Pricing UML profile")
				.namespaceURI("http://www.omg.org/uml/4.0.0/profile/dews")
				.tags("model", "gui", "dews")
				.content(WebContent.of("http://www.spiegel.de"))
				.categories("model.uml.profile", "domain.layer.gui").build();
		service.update(ProjectName.PUBLIC, dummy);
	}

	@Test
	public void updateExistingArtefactRecordAndContent() throws Exception {
		final String text = "Updated description";
		final String filename = "modeshape-config.json";

		// Setup
		RepoArtefact artefact = service.get(ProjectName.PUBLIC,
				serverDummy.getArtefactId()).get();

		// Exec
		artefact.setDescription(text);
		FileContent file = new FileContent();
		file.setFileName(filename);
		file.setMimeType(MediaType.APPLICATION_JSON);
		file.setContent(this.getClass().getResourceAsStream("/" + filename));
		artefact.setContent(file);
		service.update(ProjectName.PUBLIC, artefact);

		// Check
		RepoArtefact updated = service.get(ProjectName.PUBLIC,
				serverDummy.getArtefactId()).get();
		String expected = readStream(this.getClass().getResourceAsStream(
				"/" + filename));
		String actual = readStream(updated.getContent().getContent());
		assertEquals(expected, actual);
		assertEquals(text, updated.getDescription());
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
			ProjectResourceImpl.class, ProjectService.class,
			ProjectServiceImpl.class, ProjectDAO.class, ArtefactResource.class,
			ArtefactResourceImpl.class, ArtefactService.class,
			ArtefactServiceImpl.class, ArtefactDAO.class, PackageDAO.class,
			JcromProvider.class, JcrSessionProvider.class,
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

	private Session getSession() {
		ProjectServiceImpl impl = (ProjectServiceImpl) projectService;
		return impl.getDao().getSession();
	}

	private ProjectDAO getDao() {
		ProjectServiceImpl impl = (ProjectServiceImpl) projectService;
		return impl.getDao();
	}

	private void setupTestContent() {
		RepoProject pub = projectService.create(ProjectName.PUBLIC, "Public",
				"Public repository");

		guiDummy = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.gui", "gwt_uml_profile"))
				.label("Pricing UML profile")
				.description("Pricing UML profile")
				.namespaceURI("http://www.omg.org/uml/4.0.0/profile/dews")
				.tags("model", "gui", "dews")
				.content(WebContent.of("http://www.spiegel.de"))
				.categories("model.uml.profile", "domain.layer.gui").build();
		artefactService.create(pub.getProjectName(), guiDummy);

		serverDummy = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.server", "data-model"))
				.label("Data Model")
				.description("DEWS data model")
				.namespaceURI("http://www.omg.org/er/1.0.0")
				.tags("database", "domain", "dews")
				.content(
						FileContent.of(JcrDataUtils.fromInputStream(
								"log4j.properties",
								this.getClass().getResourceAsStream(
										"/log4j.properties"), "text/plain")))
				.categories("model.er.entity", "domain.layer.database").build();
		artefactService.create(pub.getProjectName(), serverDummy);
	}

	private void clearArtefacts() {
		try {
			Node root = getSession().getNode(BASE);
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

	private String readStream(InputStream in) throws IOException {
		BufferedReader myInput = new BufferedReader(new InputStreamReader(in));
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = myInput.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}
}
