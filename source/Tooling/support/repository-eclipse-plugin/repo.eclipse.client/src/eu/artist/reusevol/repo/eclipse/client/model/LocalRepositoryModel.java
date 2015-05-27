/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.model;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import eu.artist.reusevol.repo.client.ArtefactManager;
import eu.artist.reusevol.repo.client.CategoryManager;
import eu.artist.reusevol.repo.client.ProjectManager;
import eu.artist.reusevol.repo.client.RepositoryClient;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.Id;
import eu.artist.reusevol.repo.eclipse.client.Activator;
import eu.artist.reusevol.repo.eclipse.client.preference.RepositoryConfigurationEntry;
import eu.artist.reusevol.repo.eclipse.client.preference.RepositoryConfigurationManager;

public class LocalRepositoryModel {
	private static LocalRepositoryModel instance = null;

	private Map<String, RepoServer> servers;
	private List<RepoCategory> categories;
	private Map<String, List<RepoArtefact>> categoryToArtefactMap;

	private List<String> tags;
	private Map<String, List<RepoArtefact>> tagsToArtefactMap;

	public LocalRepositoryModel() {
		categories = new ArrayList<RepoCategory>();
		tags = new ArrayList<String>();
		categoryToArtefactMap = new HashMap<String, List<RepoArtefact>>();
		tagsToArtefactMap = new HashMap<String, List<RepoArtefact>>();
		servers = populateServerMap();
		// createdummyRepo();
		retriveData();
	}

	public void createdummyRepo() {
		// Get the manager components
		for (RepoServer server : getServers().values()) {
			ProjectManager projects = server.getClient().getProjectManager();
			CategoryManager categories = server.getClient()
					.getCategoryManager();

			Id useCaseProject = Id.of("useCase.dews");
			RepoProject dews = projects.create(new RepoProject(useCaseProject
					.get(), "DEWS", "DEWS use case"));

			ArtefactManager artefacts = server.getClient().getArtefactManager(
					dews.getId());

			categories.create(new RepoCategory("mda", "MDA artefacts",
					"MDA artefacts"));
			categories.create(new RepoCategory("mda.models", "MDA models",
					"MDA models"));
			RepoCategory umlCat = categories.create(
					new RepoCategory("mda.models.uml", "UML models",
					"UML models"));
			categories.create(new RepoCategory("mda.models.emf", "EMF models",
					"EMF models"));

			// Create the artefact
			ArtefactId profileId = ArtefactId.of("eu.artist.uc.dews",
					"pricing_profile");
			RepoArtefact pricingProfile = new RepoArtefact(profileId.get(), "PricingProfile", "The pricing profile");
			pricingProfile.getTags().add("dews");
			pricingProfile.getCategories().add(umlCat.getId());
			artefacts.create(pricingProfile);
			artefacts.setContent(pricingProfile, new ByteArrayInputStream("This is a test.".getBytes()), "test.txt", "application/uml+xml", "UTF-8");
		}
	}

	private Map<String, RepoServer> populateServerMap() {
		Map<String, RepoServer> result = new HashMap<String, RepoServer>();
		RepositoryConfigurationManager repositoryConfigurationManager = Activator
				.getDefault().getRepositoryManager();

		for (RepositoryConfigurationEntry repositoryConfig : repositoryConfigurationManager
				.getRepositoryConfigurations()) {
			String connectionName = repositoryConfig.getId();
			RepositoryConfigurationEntry fetchRepoInstance = repositoryConfigurationManager
					.getRepositoryConfiguration(connectionName);
			RepositoryClient client = fetchRepoInstance.getRepositoryClient();

			if (client != null) {
				RepoServer server = new RepoServer(connectionName, client);
				result.put(connectionName, server);
				System.out.println("Client '" + connectionName + "': "
						+ client.getConfig().getBaseRepositoryUri());
			}
		}

		return result;
	}

	/**
	 * @return the servers
	 */
	public Map<String, RepoServer> getServers() {
		return servers;
	}

	public void retriveData() {
		for (RepoServer server : servers.values()) {
			server.retrieveData();
		}
		populateGlobalCategoryTree();
		populateCategoryToArtefactMap();
		populateTagMap();
		populateTagsList();
	}

	private void populateGlobalCategoryTree() {
		categories.clear();
		for (RepoServer server : servers.values()) {
			mergeOneCatagoryLevel(server.getCategories(), categories);
		}

	}

	private void mergeOneCatagoryLevel(List<RepoCategory> serverCategories,
			List<RepoCategory> localCategories) {
		for (RepoCategory serverCategory : serverCategories) {
			int index = localCategories.indexOf(serverCategory);
			if (index >= 0) {
				// The server category already exists locally
				// Try to merge the sub-categories
				mergeOneCatagoryLevel(serverCategory.getCategories(),
						localCategories.get(index).getCategories());
			} else {
				// The server category does not exist locally
				// Store it
				localCategories.add(serverCategory);
			}
		}
	}

	private void populateCategoryToArtefactMap() {
		categoryToArtefactMap.clear();
		for (RepoServer server : servers.values()) {
			for (RepoProject project : server.getProjects()) {
				for (RepoPackage pkg : project.getPackages()) {
					for (RepoArtefact artefact : pkg.getArtefacts()) {
						for (String category : artefact.getCategories()) {
							addArtefactToCategory(category, artefact);
						}
					}
				}
			}
		}
	}

	// extracts tags from artefacts and populate tagmap.
	private void populateTagMap() {

		tagsToArtefactMap.clear();
		for (RepoServer server : servers.values()) {
			for (RepoProject project : server.getProjects()) {
				for (RepoPackage pkg : project.getPackages()) {
					for (RepoArtefact artefact : pkg.getArtefacts()) {
						for (String tag : artefact.getTags()) {

							addArtefactToTagMap(tag, artefact);
						}
					}
				}
			}
		}
	}

	public void addArtefactToTagMap(String tag, RepoArtefact artefact) {

		if (!tagsToArtefactMap.containsKey(tag))
			tagsToArtefactMap.put(tag, new ArrayList<RepoArtefact>());

		if (!tagsToArtefactMap.get(tag).contains(artefact))
			tagsToArtefactMap.get(tag).add(artefact);
	}

	public void removeArtefactToTagMap(String tag, RepoArtefact artefact) {

		if (!tagsToArtefactMap.containsKey(tag))
			return;

		if (tagsToArtefactMap.get(tag).contains(artefact))
			tagsToArtefactMap.get(tag).remove(artefact);
	}

	private void populateTagsList() {
		tags.clear();
		for (String key : tagsToArtefactMap.keySet()) {
			tags.add(key);
		}
	}

	public Map<String, List<RepoArtefact>> getTagMap() {

		return tagsToArtefactMap;
	}

	public List<String> getTags() {

		return tags;
	}

	public void addArtefactToCategory(String categoryId, RepoArtefact artefact) {
		if (categoryToArtefactMap.get(categoryId) == null)
			categoryToArtefactMap
					.put(categoryId, new ArrayList<RepoArtefact>());

		if (!categoryToArtefactMap.get(categoryId).contains(artefact))
			categoryToArtefactMap.get(categoryId).add(artefact);
	}

	public void removeArtefactfromCategory(String categoryId,
			RepoArtefact artefact) {

		if (!categoryToArtefactMap.containsKey(categoryId))
			return;

		if (categoryToArtefactMap.get(categoryId).contains(artefact))
			categoryToArtefactMap.get(categoryId).remove(artefact);
	}

	public List<RepoArtefact> getArtefactsForCategory(String category) {
		if (categoryToArtefactMap.containsKey(category)) {
			return categoryToArtefactMap.get(category);
		} else {
			return new ArrayList<RepoArtefact>();
		}
	}

	public List<RepoArtefact> getArtefactsForTag(String tag) {
		if (tagsToArtefactMap.containsKey(tag)) {
			return tagsToArtefactMap.get(tag);
		} else {
			return new ArrayList<RepoArtefact>();
		}
	}

	// get total artifacts associated with sub categories as well
	public void getallArtefactsForSubCategories(RepoCategory category,
			Set<RepoArtefact> artifactsListforCat) {

		for (RepoCategory subCat : category.getCategories()) {
			List<RepoArtefact> found = getArtefactsForCategory(subCat.getId());
			artifactsListforCat.addAll(found);
			getallArtefactsForSubCategories(subCat, artifactsListforCat);
		}

	}

	public List<RepoCategory> getRepoCategories() {
		return categories;
	}

	public Map<String, List<RepoArtefact>> getcategoryToArtefactMap() {
		return categoryToArtefactMap;
	}

	public static LocalRepositoryModel getInstance() {
		if (instance == null) {
			instance = new LocalRepositoryModel();
		}
		return instance;
	}

	public RepoProject getProjectfromSelectedPackage(RepoPackage toFind) {
		for (RepoServer server : servers.values()) {
			for (RepoProject project : server.getProjects()) {
				for (RepoPackage pkg : project.getPackages()) {
					if (pkg.equals(toFind)) {
						return project;
					}
				}
			}
		}
		return null;
	}

	public void updateCategoriesForNewArtefact(RepoArtefact artefact) {
		for (String categoryId : artefact.getCategories()) {
			addArtefactToCategory(categoryId, artefact);
		}
	}

	public RepoPackage getPackagefromSelectedArtifact(RepoArtefact toFind) {
		for (RepoServer server : servers.values()) {
			for (RepoProject project : server.getProjects()) {
				for (RepoPackage pkg : project.getPackages()) {
					for (RepoArtefact current : pkg.getArtefacts()) {
						if (current.equals(toFind)) {
							return pkg;
						}
					}
				}
			}
		}
		return null;
	}

	public RepoProject getProjectfromSelectedArtifact(RepoArtefact toFind) {
		for (RepoServer server : servers.values()) {
			for (RepoProject project : server.getProjects()) {
				for (RepoPackage pkg : project.getPackages()) {
					for (RepoArtefact current : pkg.getArtefacts()) {
						if (current.equals(toFind)) {
							return project;
						}
					}
				}
			}
		}
		return null;
	}

	public RepoServer getServerForElement(Object toFind) {
		for (RepoServer server : servers.values()) {
			for (RepoProject prj : server.getProjects()) {
				if (findRecursive(prj, toFind)) {
					return server;
				}
			}
		}
		return null;
	}

	private boolean findRecursive(RepoProject current, Object toFind) {
		if (current == toFind)
			return true;

		for (RepoPackage pkg : current.getPackages()) {
			if (findRecursive(pkg, toFind)) {
				return true;
			}
		}
		return false;
	}

	private boolean findRecursive(RepoPackage current, Object toFind) {
		if (current == toFind)
			return true;

		for (RepoArtefact art : current.getArtefacts()) {
			if (findRecursive(art, toFind)) {
				return true;
			}
		}
		return false;
	}

	private boolean findRecursive(RepoArtefact current, Object toFind) {
		return current == toFind;
	}

	public Collection<RepoServer> getServersWithCategory(
			RepoCategory selectedCategory) {
		List<RepoServer> result = new ArrayList<RepoServer>();

		for (RepoServer server : getServers().values()) {
			if (server.containsCategory(selectedCategory)) {
				result.add(server);
			}
		}

		return result;
	}

}
