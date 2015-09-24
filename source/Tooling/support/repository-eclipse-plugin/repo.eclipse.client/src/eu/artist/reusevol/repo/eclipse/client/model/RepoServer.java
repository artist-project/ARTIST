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

import java.util.ArrayList;
import java.util.List;

import eu.artist.reusevol.repo.client.RepositoryClient;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.Depth;

public class RepoServer {
	private final String name;
	private final List<RepoProject> projects;
	private final List<RepoCategory> categories;
	private final RepositoryClient client;

	/**
	 * @param name
	 */
	public RepoServer(String name, RepositoryClient client) {
		this.name = name;
		this.client = client;
		this.projects = new ArrayList<RepoProject>();
		this.categories = new ArrayList<RepoCategory>();
	}

	public void retrieveData() {
		loadProjects();
		loadCategories();
	}

	private void loadCategories() {
		categories.clear();

		try {
			categories.addAll(client.getCategoryManager().findAll(Depth.ALL));
		} catch (Exception ex) {
			System.out.println("Repository '"
					+ name
					+ "' is not reachable... Ignoring it.");
		}
	}

	private void loadProjects() {
		projects.clear();

		try {
			projects.addAll(client.getProjectManager().findAll(Depth.ENTITY));
			for(RepoProject p : projects) {
				for(RepoPackage pkg : p.getPackages()) {
					pkg.getArtefacts().clear();
				}
			}
			// Reload artefacts via find all to get all information added in the post process step
			List<RepoArtefact> artefacts = client.getArtefactManager(null).findInAllProjects(Depth.ALL);
			for(RepoArtefact a : artefacts) {
				for(RepoProject p : projects) {
					if (!a.getProject().equals(p.getId())) continue;
					for(RepoPackage pkg : p.getPackages()) {
						if (!a.getPackageId().equals(pkg.getId())) continue;
						pkg.getArtefacts().add(a);
					}
				}
			}
		} catch (Exception ex) {
			System.out.println("Repository '"
					+ name
					+ "' is not reachable... Ignoring it.");
		}
	}

	public interface CategoryVisitor {
		public boolean visit(RepoCategory category);
	}

	public void visitCategories(CategoryVisitor visitor) {
		recursiveVisitCategories(getCategories(), visitor);
	}

	private boolean recursiveVisitCategories(List<RepoCategory> list,
			CategoryVisitor visitor) {
		for (RepoCategory category : list) {
			boolean continueVisit = visitor.visit(category);
			if (!continueVisit)
				return false;

			continueVisit = recursiveVisitCategories(category.getCategories(),
					visitor);
			if (!continueVisit)
				return false;
		}
		return true;
	}

	public boolean containsCategory(RepoCategory category) {
		ContainsCategoryVisitor visitor = new ContainsCategoryVisitor(category);
		visitCategories(visitor);
		return visitor.isFound();
	}

	public RepoCategory getParentCategory(RepoCategory toFind) {
		CategoryParentVisitor visitor = new CategoryParentVisitor(toFind);
		visitCategories(visitor);
		return visitor.getParent();
	}

	private class ContainsCategoryVisitor implements CategoryVisitor {
		private RepoCategory toFind;
		private boolean found;

		public ContainsCategoryVisitor(RepoCategory toFind) {
			this.toFind = toFind;
			this.found = false;
		}

		@Override
		public boolean visit(RepoCategory category) {
			if (category.getId().equals(toFind.getId())) {
				found = true;
				return false;
			}
			return true;
		}

		/**
		 * @return the parent
		 */
		public boolean isFound() {
			return found;
		}
	}

	private class CategoryParentVisitor implements CategoryVisitor {
		private RepoCategory toFind;
		private RepoCategory parent;

		public CategoryParentVisitor(RepoCategory toFind) {
			this.toFind = toFind;
			this.parent = null;
		}

		@Override
		public boolean visit(RepoCategory category) {
			if (category.getCategories().contains(toFind)) {
				parent = category;
				return false;
			}
			return true;
		}

		/**
		 * @return the parent
		 */
		public RepoCategory getParent() {
			return parent;
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the projects
	 */
	public List<RepoProject> getProjects() {
		return projects;
	}

	/**
	 * @return the categories
	 */
	public List<RepoCategory> getCategories() {
		return categories;
	}

	/**
	 * @return the client
	 */
	public RepositoryClient getClient() {
		return client;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RepoServer [name=").append(name).append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categories == null) ? 0 : categories.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((projects == null) ? 0 : projects.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RepoServer))
			return false;
		RepoServer other = (RepoServer) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projects == null) {
			if (other.projects != null)
				return false;
		} else if (!projects.equals(other.projects))
			return false;
		return true;
	}

}
