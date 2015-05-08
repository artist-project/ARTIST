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

import org.apache.log4j.Logger;
import org.jcrom.util.NodeFilter;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.service.ProjectService;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

public class ProjectServiceImpl implements ProjectService {

	private static final Logger LOGGER = Logger
			.getLogger(ProjectServiceImpl.class);

	@Inject
	private ProjectDAO dao;

	public ProjectDAO getDAO() {
		return dao;
	}

	@Override
	public RepoProject create(ProjectName projectId, String name,
			String description) {
		LOGGER.debug(String.format("S: Creating project %s", projectId));

		Optional<RepoProject> existing = get(projectId);

		if (!existing.isPresent()) {
			RepoProject project = new RepoProject(projectId, name, description);
			return dao.create(JcrPathUtil.PROJECT_BASE_PATH, project);
		} else {
			return update(projectId, name, description);
		}
	}

	@Override
	public Optional<RepoProject> getShallow(ProjectName projectId) {
		return getProjectWithFilter(projectId, new NodeFilter(
				NodeFilter.INCLUDE_ALL, 0));
	}

	@Override
	public Optional<RepoProject> get(ProjectName projectId) {
		return getProjectWithFilter(projectId, new NodeFilter(
				NodeFilter.INCLUDE_ALL, 1));
	}

	@Override
	public Optional<RepoProject> getTree(ProjectName projectId) {
		return getProjectWithFilter(projectId, new NodeFilter(
				NodeFilter.INCLUDE_ALL, NodeFilter.DEPTH_INFINITE));
	}

	private Optional<RepoProject> getProjectWithFilter(ProjectName projectId,
			NodeFilter filter) {
		LOGGER.debug(String.format("S: Getting project from '%s'", projectId));

		RepoProject result = dao.get(JcrPathUtil.getProjectPath(projectId),
				filter);
		return Optional.fromNullable(result);
	}

	@Override
	public RepoProject update(ProjectName projectId, String label,
			String description) {
		LOGGER.debug(String.format("S: Updating project '%s'.", projectId));

		Optional<RepoProject> existing = get(projectId);

		if (existing.isPresent()) {
			RepoProject updated = existing.get();
			updated.setLabel(label);
			updated.setDescription(description);
			return dao.update(updated, new NodeFilter(0));
		} else {
			throw new NoSuchEntityException(String.format(
					"The project '%s' does not exist.", projectId));
		}
	}

	@Override
	public void delete(RepoProject project) {
		LOGGER.debug(String.format("S: Deleting empty project '%s'.", project));

		Optional<RepoProject> existing = get(project.getProjectName());

		if (existing.isPresent()) {
			RepoProject toDelete = existing.get();
			if (toDelete.getPackages().size() == 0) {
				dao.remove(JcrPathUtil.getProjectPath(toDelete));
			} else {
				throw new IllegalStateException(
						String.format(
								"Project '%s' can not be delete, "
										+ "because it still contains packages. "
										+ "Please delete them first or use forceDelete.",
								project.getId()));
			}
		} else {
			throw new NoSuchEntityException(String.format(
					"The project '%s' does not exist.", project.getId()));
		}
	}

	@Override
	public void forceDelete(RepoProject project) {
		LOGGER.debug(String.format(
				"S: Deleting project '%s' and all its content", project));

		Optional<RepoProject> existing = get(project.getProjectName());

		if (existing.isPresent()) {
			dao.remove(JcrPathUtil.getProjectPath(existing.get()));
		} else {
			throw new NoSuchEntityException(String.format(
					"The project '%s' does not exist.", project.getId()));
		}
	}

	@Override
	public List<RepoProject> findAllProjects() {
		LOGGER.debug("S: Find all projects");

		return dao.findAll(JcrPathUtil.PROJECT_BASE_PATH, new NodeFilter(1));
	}

	public ProjectDAO getDao() {
		return dao;
	}
}
