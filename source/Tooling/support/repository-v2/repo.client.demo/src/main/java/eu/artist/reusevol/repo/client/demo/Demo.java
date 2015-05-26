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
 
package eu.artist.reusevol.repo.client.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.client.ArtefactManager;
import eu.artist.reusevol.repo.client.CategoryManager;
import eu.artist.reusevol.repo.client.ProjectManager;
import eu.artist.reusevol.repo.client.RepositoryClient;
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig;
import eu.artist.reusevol.repo.client.wso2.Wso2Client;
import eu.artist.reusevol.repo.client.wso2.dto.ScimGroup;
import eu.artist.reusevol.repo.client.wso2.dto.ScimUser;
import eu.artist.reusevol.repo.client.wso2.exceptions.ScimException;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.model.VersionInfo;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.Depth;
import eu.artist.reusevol.repo.common.util.VersionId;

public class Demo {
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.run();
	}
	
	private RepositoryClientConfig getConfig() {
		return remoteConfig();
	}
	
	private RepositoryClientConfig localConfig() {
		RepositoryClientConfig config = new RepositoryClientConfig();
		config.setUsername("demos");
		config.setPassword("demo123");
		config.setLogMessagesForDebugging(false);
		config.setBaseRepositoryUri("http://localhost:8080/api");
		
		config.getWso2Config().setWso2BaseUrl("https://localhost:9443");
		config.getWso2Config().setLogMessagesForDebugging(false);
		config.getWso2Config().setTenant("artist-repo.eu");
		config.getWso2Config().setOAuthClientId("cNh44TFOIpGkEhWzx8YT8KBVtk0a");
		config.getWso2Config().setOAuthClientSecret("OrqunXZw0MmYaBpYWWOV24UHalsa");
		config.getWso2Config().setAdminUsername("strauss@artist-repo.eu");
		config.getWso2Config().setAdminPassword("admin");
		
		return config;
	}
	
	private RepositoryClientConfig remoteConfig() {
		RepositoryClientConfig config = new RepositoryClientConfig();
		config.setUsername("demo");
		config.setPassword("demo123");
		config.setLogMessagesForDebugging(false);
		config.setBaseRepositoryUri("http://localhost:8080/api");

		config.getWso2Config().setLogMessagesForDebugging(false);

		config.getWso2Config().setWso2BaseUrl("https://artist-demo.iao.fraunhofer.de");
		config.getWso2Config().setTenant("test.artist-demo.eu");
		config.getWso2Config().setOAuthClientId("j0gffE9u_TqiHbf7s3ZG9YEBIi8a");
		config.getWso2Config().setOAuthClientSecret("VbB_Jo_t3pIsyHPuXobSJGn5pNoa");
		config.getWso2Config().setAdminUsername("useradmin@test.artist-demo.eu");
		config.getWso2Config().setAdminPassword("useradmin");
		
		return config;
	}
	
	public void run() {
		// Initialize the client
		RepositoryClientConfig config = getConfig();
		RepositoryClient client = new RepositoryClient(config);

		// Get the manager components
		CategoryManager categories = client.getCategoryManager();
		ProjectManager projects = client.getProjectManager();
		Wso2Client users = client.getUserManager();
		// Artefact manager instances are tied to one project, here "public"
		ArtefactManager artefacts = client.getArtefactManager("useCase.dews");

		// --------------------------------------------------------------------------

		// Ensure that our demo user exists and has the correct groups
		String groupName = "prj_useCase.dews";
		/*
		Optional<ScimGroup> projectGroup = users.getGroupByName(groupName);
		if (!projectGroup.isPresent()) {
			ScimGroup group = new ScimGroup(groupName);
			try {
				projectGroup = users.createGroup(group);				
			} catch(ScimException ex) {
				ex.printStackTrace();
			}
		}
		*/
		Optional<ScimGroup> projectGroup = users.getGroupByName(groupName);
		if (!projectGroup.isPresent()) {
			try {
				projectGroup = users.createGroup(new ScimGroup(groupName));
			} catch(ScimException ex) {
				ex.printStackTrace();
				projectGroup = Optional.absent();
			}
		}
		Optional<ScimUser> demoUser = users.getUserByUsername(config.getUsername());
		if (!demoUser.isPresent()) {
			try {
				ScimUser u = new ScimUser(config.getUsername(), config.getPassword(), "Demo", "Demo");
				demoUser = users.createUser(u);				
			} catch(ScimException ex) {
				ex.printStackTrace();
				demoUser = Optional.absent();
			}
		}
		if (demoUser.isPresent() && projectGroup.isPresent()) {
			users.addUserToGroup(demoUser.get(), projectGroup.get());
		}
		
		// --------------------------------------------------------------------------

		// Create custom project
		out("Creating project 'useCase.dews'");

		projects.create("useCase.dews", "DEWS", "DEWS use case");

		out("");
		out("List projects in repository");

		List<RepoProject> initialProjects = projects.findAll();
		for (RepoProject project : initialProjects) {
			out(" - " + project);
		}
		
		// --------------------------------------------------------------------------

		// Create categories
		out("");
		out("Creating categories");

		out("Creating category 'mda'");
		RepoCategory mdaCat = categories.create("mda", "MDA artefacts", "MDA artefacts");

		out("Creating category 'mda.models'");
		categories.create("mda.models", "MDA models", "MDA models");

		out("Creating category 'mda.models.uml'");
		RepoCategory umlCat = categories.create("mda.models.uml", "UML models", "UML models");
		categories.create("mda.models.emf", "EMF models", "EMF models");

		out("");
		out("Get category with sub-categories");
		// You can use string ids like "mda.models", Id objects like Id.of("mda.models")
		// or existing entities in calls the expect an id.
		Optional<RepoCategory> mda = categories.get(mdaCat, Depth.ALL);
		if (mda.isPresent()) {
			out(mda.get().toString());
		}

		out("");
		out("Get category without sub-categories");
		Optional<RepoCategory> uml = categories.get(umlCat.getId(), Depth.ENTITY);
		if (uml.isPresent()) {
			out(uml.get().toString());
		}

		// --------------------------------------------------------------------------
		
		out("");
		out("Create and upload an artefact");

		// Step 1: create the artefact record
		RepoArtefact pricingProfile = new RepoArtefact("eu.artist.uc.dews:pricing_profile", "PricingProfile", "The pricing profile");
		pricingProfile.getTags().add("dews");
		pricingProfile.getCategories().add(umlCat.getId());
		pricingProfile.setType(umlCat);
		RepoArtefact entity = artefacts.create(pricingProfile);
		
		// Step 2: upload the content
		File umlFile = new File("./pom.xml");
		artefacts.setContent(entity, umlFile, MediaType.APPLICATION_XML, null);
		artefacts.setImage(entity, umlFile, MediaType.APPLICATION_OCTET_STREAM);
		
		// Step 3: check, if everything is there
		Optional<RepoArtefact> newArtefact = artefacts.get(entity);
		
		if (newArtefact.isPresent()) {
			RepoArtefact a = newArtefact.get();
			out(a.toString());
			out("Content:");
			out(artefacts.getContent(a));
		} else {
			out("Artefact not found.");
		}

		// Step 4: create a version
		out("Create version.");
		Optional<VersionInfo> version1 = artefacts.createVersion(entity, "First version");
		if (version1.isPresent()) {
			out(version1.get().toString());
		}
		
		// Step 5: list versions
		out("List versions.");
		List<VersionInfo> versions = artefacts.listVersions(entity);
		out(versions.toString());

		// Step 6: get last version
		out("Get last version.");
		ArtefactId newestId = ArtefactId.of(entity, VersionId.NEWEST);
		Optional<RepoArtefact> newest = artefacts.get(newestId);
		if (newest.isPresent()) {
			out(newest.get().toString());
			out(artefacts.getContent(newestId));
		}
		
		out("Get first version.");
		ArtefactId firstId = ArtefactId.of(entity, "0");
		Optional<RepoArtefact> first = artefacts.get(firstId);
		if (first.isPresent()) {
			out(first.get().toString());
			out(artefacts.getContent(firstId));
		}
		

	}
	
	private void out(String s) {
		System.out.println(s);
	}

	private void out(InputStream in) {
		BufferedReader myInput = new BufferedReader(new InputStreamReader(in));
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = myInput.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		out(sb.toString());
	}	
}
