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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.model.FileContent;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoContent;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.model.WebContent;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.ProjectName;

public class Demo {

	private static final String BASE = "http://localhost:8081/repo.server/api1";

	public static void main(String[] args) throws FileNotFoundException {
		Demo demo = new Demo();
		demo.run();
	}

	private void run() throws FileNotFoundException {
		// Create connection info with credentials (not necessary at the moment)
		ConnectionInfo info = new ConnectionInfo(BASE, "user", "password");

		// Get the web service client
		RepositoryClient client = new RepositoryClient(info);

		// Get the manager components
		ArtefactManager artefacts = client.getArtefactManager();
		CategoryManager categories = client.getCategoryManager();
		ProjectManager projects = client.getProjectManager();

		// Create custom project
		out("Creating project 'useCase.dews'");

		ProjectName useCaseProject = ProjectName.of("useCase.dews");
		projects.create(useCaseProject, "DEWS", "DEWS use case");

		out("");
		out("List projects in repository");

		List<RepoProject> initialProjects = projects.findAllProjects();
		for (RepoProject project : initialProjects) {
			out(" - " + project);
		}

		// Create categories
		out("");
		out("Creating categories");

		out("Creating category 'mda'");

		CategoryName mdaName = CategoryName.of("mda");
		categories.create(mdaName, "MDA artefacts", "MDA artefacts");

		out("Creating category 'mda.models'");

		categories.create(CategoryName.of("mda.models"), "MDA models",
				"MDA models");

		out("Creating category 'mda.models.uml'");

		RepoCategory umlCat = categories.create(
				CategoryName.of("mda.models.uml"), "UML models", "UML models");

		out("");
		out("List categories in repository");

		Optional<RepoCategory> mda = categories.getTree(mdaName);
		if (mda.isPresent()) {
			RepoCategory cat = mda.get();
			printCategory(cat, "");
		}

		// Create and upload an artefact
		// Prepare the file content
		out("");
		out("Create and upload an artefact");

		File umlFile = new File("./demo_input/ConceptualOverview.uml");
		FileContent attachment = FileContent.of(umlFile, "application/xml+uml");

		// Create the artefact
		ArtefactId profileId = ArtefactId.of("eu.artist.uc.dews",
				"pricing_profile");
		RepoArtefact pricingProfile = new RepoArtefact.Builder(profileId)
				.label("PricingProfile").description("The pricing profile")
				.tags("dews").categories(umlCat.getId()).content(attachment)
				.build();
		artefacts.delete(useCaseProject, pricingProfile.getArtefactId());
		artefacts.create(useCaseProject, pricingProfile);
		pricingProfile.setContent(FileContent
				.of(umlFile, "application/xml+uml"));
		printArtefact(pricingProfile);

		// Get artefact from server
		out("");
		out("Get artefact from server");

		Optional<RepoArtefact> retrieved = artefacts.get(useCaseProject,
				profileId);
		if (retrieved.isPresent()) {
			printArtefact(retrieved.get());
		}

		out("");
		out("Create additional artefacts");

		RepoArtefact model1 = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews", "model_1")).label("Model 1")
				.description("Some model").tags("dews", "gui")
				.categories(umlCat.getId()).build();
		artefacts.delete(useCaseProject, model1.getArtefactId());
		printArtefact(artefacts.create(useCaseProject, model1));

		out("");
		RepoArtefact model2 = new RepoArtefact.Builder(ArtefactId.of(
				"eu.artist.uc.dews.gwt", "model_2")).label("Model 2")
				.description("Some other model").tags("dews", "gui", "gwt")
				.categories("layer.gui").build();
		artefacts.delete(useCaseProject, model2.getArtefactId());
		printArtefact(artefacts.create(useCaseProject, model2));

		out("");
		out("Find artefacts tagged with 'gui'");
		for (RepoArtefact a : artefacts.findByTag("gui")) {
			printArtefact(a);
		}

		out("");
		out("Find artefacts in category '" + umlCat.getId() + "'");
		for (RepoArtefact a : artefacts
				.findByCategory(umlCat.getCategoryName())) {
			printArtefact(a);
		}
	}

	private void printCategory(RepoCategory cat, String indent) {
		out(indent + " - " + cat.getLabel());
		for (RepoCategory c : cat.getCategories()) {
			printCategory(c, indent + "  ");
		}
	}

	private void printArtefact(RepoArtefact artefact) {
		out("");
		out("Artefact " + artefact.getLabel() + " (" + artefact.getId() + ")");
		out("  - description: " + artefact.getDescription());
		out("  - categories : " + artefact.getCategories());
		out("  - tags       : " + artefact.getTags());
		RepoContent content = artefact.getContent();
		if (content != null) {
			if (content instanceof WebContent) {
				WebContent wc = (WebContent) content;
				out("  - content     : WebContent");
				out("    - URL: " + wc.getUrl());
			} else if (content instanceof FileContent) {
				FileContent fc = (FileContent) content;
				out("  - content    : FileContent");
				out("    - filename : " + fc.getFileName());
				out("    - mime-type: " + fc.getMimeType());
				out("    - encoding : " + fc.getEncoding());
				if ((fc != null) && (fc.getContent() != null)) {
					out(">>>");
					out(readStream(fc.getContent()));
					out("<<<");
				}
			} else {
				out("  - content    : Empty");
			}
		}
	}

	private void out(String s) {
		System.out.println(s);
	}

	private String readStream(InputStream in) {
		BufferedReader myInput = new BufferedReader(new InputStreamReader(in));
		StringBuilder sb = new StringBuilder();
		String line;
		try {
			while ((line = myInput.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
}
