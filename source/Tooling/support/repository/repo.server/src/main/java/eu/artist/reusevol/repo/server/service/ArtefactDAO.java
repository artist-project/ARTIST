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

import java.util.List;

import javax.inject.Inject;
import javax.jcr.Session;

import org.apache.log4j.Logger;
import org.jcrom.Jcrom;
import org.jcrom.dao.AbstractJcrDAO;
import org.jcrom.util.NodeFilter;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

public class ArtefactDAO extends AbstractJcrDAO<RepoArtefact> {

	private static final Logger LOGGER = Logger.getLogger(ArtefactDAO.class);

	@Inject
	public ArtefactDAO(Session session, Jcrom jcrom) {
		super(RepoArtefact.class, session, jcrom);
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @return the jcrom instance
	 */
	public Jcrom getJcrom() {
		return jcrom;
	}

	public List<RepoArtefact> findAllInProject(ProjectName projectName) {
		String projectPath = JcrPathUtil.getProjectPath(projectName);
		return findByProperty(projectPath, "classname",
				RepoArtefact.class.getName());
	}

	public List<RepoArtefact> findAllInPackage(ProjectName projectName,
			PackageName packageName) {
		String packagePath = JcrPathUtil.getPackagePath(projectName,
				packageName);
		return findByProperty(packagePath, "classname",
				RepoArtefact.class.getName());
	}

	public List<RepoArtefact> findByCategory(ProjectName projectName,
			CategoryName categoryName) {
		return findByMultivaluedProperty(
				JcrPathUtil.getProjectPath(projectName), "categories",
				categoryName.getName());
	}

	public List<RepoArtefact> findByCategory(CategoryName categoryName) {
		return findByMultivaluedProperty(JcrPathUtil.PROJECT_BASE_PATH,
				"categories", categoryName.getName());
	}

	public List<RepoArtefact> findByTag(ProjectName projectName, String tag) {
		return findByMultivaluedProperty(
				JcrPathUtil.getProjectPath(projectName), "tags", tag);
	}

	public List<RepoArtefact> findByTag(String tag) {
		return findByMultivaluedProperty(JcrPathUtil.PROJECT_BASE_PATH, "tags",
				tag);
	}

	public List<RepoArtefact> findByNamespace(ProjectName projectName,
			String namespace) {
		return findByProperty(JcrPathUtil.getProjectPath(projectName),
				"namespace", namespace);
	}

	public List<RepoArtefact> findByNamespace(String namespace) {
		return findByProperty(JcrPathUtil.PROJECT_BASE_PATH, "namespace",
				namespace);
	}

	private List<RepoArtefact> findByMultivaluedProperty(String basePath,
			String property, String value) {
		String query = "/jcr:root" + removeTrailingSlash(basePath)
				+ "//*[jcr:contains(@" + property + ", '" + value + "')]";

		LOGGER.debug("  XPath query: " + query);
		List<RepoArtefact> result = super.findByXPath(query, new NodeFilter(
				NodeFilter.DEPTH_INFINITE));
		LOGGER.debug("  Found: " + result.size());

		return result;
	}

	private List<RepoArtefact> findByProperty(String basePath, String property,
			String value) {
		String query = "/jcr:root" + removeTrailingSlash(basePath)
				+ "//*[jcr:like(@" + property + ", '" + value + "')]";

		LOGGER.debug("  XPath query: " + query);
		List<RepoArtefact> result = super.findByXPath(query, new NodeFilter(
				NodeFilter.DEPTH_INFINITE));
		LOGGER.debug("  Found: " + result.size());

		return result;
	}

	private String removeTrailingSlash(String path) {
		if (path.endsWith("/")) {
			return path.substring(0, path.length() - 1);
		} else {
			return path;
		}
	}
}
