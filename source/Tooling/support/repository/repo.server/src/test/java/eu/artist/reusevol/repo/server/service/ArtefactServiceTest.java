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

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.inject.Inject;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.PathNotFoundException;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.ws.rs.core.MediaType;

import org.jcrom.util.JcrDataUtils;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.FileContent;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.model.WebContent;
import eu.artist.reusevol.repo.common.service.ProjectService;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.jcr.JcrUtils;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

public class ArtefactServiceTest extends BaseServiceTest {
	private static final String BASE = "/projects";

	private RepoArtefact guiDummy, serverDummy;

	@Inject
	private Session session;

	@Inject
	private ArtefactServiceImpl service;

	@Inject
	private ProjectService projectService;

	@Before
	public void setupEnvironment() {
		clearArtefacts();
		setupTestContent();
	}

	@Test
	public void createArtefacts() {
		// Setup
		new RepoArtefact.Builder(ArtefactId.of("eu.artist.uc.dews.server",
				"data-model2"))
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
		RepoProject test = projectService.getTree(ProjectName.PUBLIC).get();
		RepoPackage gui = test.getPackage("eu.artist.uc.dews.gui");
		RepoPackage server = test.getPackage("eu.artist.uc.dews.server");
		RepoArtefact guiArtefact = gui.getArtefact("gwt_uml_profile");
		RepoArtefact serverArtefact = server.getArtefact("data-model");

		// Check
		LOGGER.debug(test);
		assertNotNull(test);
		assertNotNull(gui);
		assertNotNull(server);
		assertNotNull(guiArtefact);
		assertNotNull(serverArtefact);
		assertNotNull(guiDummy);
		assertNotNull(serverDummy);
		assertEquals("eu.artist.uc.dews.gui!gwt_uml_profile!HEAD",
				guiArtefact.getId());
		assertEquals("eu.artist.uc.dews.server!data-model!HEAD",
				serverArtefact.getId());
		LOGGER.debug(JcrUtils.printTree(service.getSession(), "/projects"));
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
		RepoArtefact artefact = service.get(ProjectName.PUBLIC,
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
		Optional<RepoArtefact> result = service.get(ProjectName.PUBLIC,
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
		assertFalse(service.getDao().exists(path));
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
		assertFalse(service.getDao().exists(path));
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

	// TODO: Fix this
	/*
	 * @Test public void updateProperties() throws Exception { final String text
	 * = "Updated description"; final String origFilename = "log4j.properties";
	 * final String newFilename = "modeshape-config.json";
	 * 
	 * // Setup RepoArtefact artefact = service.get(ProjectName.PUBLIC,
	 * serverDummy.getArtefactId()).get();
	 * 
	 * // Exec artefact.setDescription(text); FileContent file = new
	 * FileContent(); file.setFileName(newFilename);
	 * file.setMimeType(MediaType.APPLICATION_JSON);
	 * file.setContent(this.getClass().getResourceAsStream("/" + newFilename));
	 * artefact.setContent(file); service.update(ProjectName.PUBLIC, artefact);
	 * 
	 * // Check RepoArtefact updated = service.get(ProjectName.PUBLIC,
	 * serverDummy.getArtefactId()).get(); String expected =
	 * readStream(this.getClass().getResourceAsStream( "/" + origFilename));
	 * String actual = readStream(updated.getContent().getContent());
	 * assertEquals(expected, actual); assertEquals(text,
	 * updated.getDescription()); }
	 */

	@Test
	public void findAllInProject() {
		// Exec
		List<RepoArtefact> result = service
				.findAllInProject(ProjectName.PUBLIC);
		LOGGER.debug("findAllInProject: " + result);
		assertEquals(2, result.size());
		assertEquals(true, result.contains(serverDummy));
		assertEquals(true, result.contains(guiDummy));
	}

	// TODO: Fix this

	@Test
	public void findAllInPackage() {
		// Exec
		List<RepoArtefact> result = service.findAllInPackage(
				ProjectName.PUBLIC, serverDummy.getArtefactId()
						.getPackagePart());
		LOGGER.debug("findAllInPackage: " + result);
		assertEquals(1, result.size());
		assertEquals(true, result.contains(serverDummy));
	}

	@Test
	public void findByCategory() {
		// Exec
		List<RepoArtefact> result = service.findByCategory(ProjectName.PUBLIC,
				CategoryName.of("model.uml.profile"));
		LOGGER.debug("findByCategory: " + result);
		assertEquals(1, result.size());
		assertEquals(true, result.contains(guiDummy));
	}

	@Test
	public void findByTag() {
		// Exec
		List<RepoArtefact> result = service.findByTag(ProjectName.PUBLIC,
				"model");
		LOGGER.debug("findByTag: " + result);
		assertEquals(1, result.size());
		assertEquals(true, result.contains(guiDummy));
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

	private Session getSession() {
		return session;
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
		service.create(pub.getProjectName(), guiDummy);

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
		service.create(pub.getProjectName(), serverDummy);
	}
}
