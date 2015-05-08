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
import org.jcrom.util.NodeFilter;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.service.ArtefactService;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

public class ArtefactServiceImpl implements ArtefactService {

	private static final Logger LOGGER = Logger
			.getLogger(ArtefactServiceImpl.class);

	@Inject
	private ArtefactDAO dao;

	@Inject
	private PackageDAO packageDao;

	public Session getSession() {
		return dao.getSession();
	}

	public ArtefactDAO getDao() {
		return dao;
	}

	@Override
	public RepoArtefact create(ProjectName projectName, RepoArtefact artefact) {
		LOGGER.debug("S: Create artefact " + artefact.getId());

		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefact);

		// Check if project exists, error otherwise
		String projectPath = JcrPathUtil.getProjectPath(projectName);
		if (!dao.exists(projectPath)) {
			throw new NoSuchEntityException("Project '" + projectName
					+ "' does not exist.");
		}

		// Check if package exists, create otherwise
		String packagePath = JcrPathUtil.getPackagePath(projectName,
				artefact.getArtefactId());
		if (!dao.exists(packagePath)) {
			RepoPackage pkg = new RepoPackage(artefact.getArtefactId()
					.getPackagePart());
			// pkg.setJcrPath(packagePath);
			pkg = packageDao.create(projectPath
					+ JcrPathUtil.PACKAGE_COLLECTION_NODE_NAME, pkg);
		}

		// Check if artefact exists, throw exception otherwise
		String artefactPath = JcrPathUtil.getArtefactPath(projectName,
				artefact.getArtefactId());
		// "/projects"));
		if (!dao.exists(artefactPath)) {
			artefact = dao.create(packagePath
					+ JcrPathUtil.ARTEFACT_COLLECTION_NODE_NAME, artefact);
		} else {
			throw new EntityCreationException(
					String.format(
							"Artefact '%s' already exists. Please use update if you want to modify it.",
							artefact.getId()));
		}

		return artefact;
	}

	@Override
	public Optional<RepoArtefact> get(ProjectName projectName,
			ArtefactId artefactId) {
		LOGGER.debug("S: Get artefact " + artefactId.toString());

		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefactId);

		String artefactPath = JcrPathUtil.getArtefactPath(projectName,
				artefactId);
		RepoArtefact result = dao.get(artefactPath);
		return Optional.fromNullable(result);
	}

	@Override
	public RepoArtefact updateProperties(ProjectName projectName,
			RepoArtefact artefact) {
		LOGGER.debug("S: Update artefact properties for "
				+ artefact.getArtefactId().toString());

		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefact);

		Optional<RepoArtefact> toUpdate = get(projectName,
				artefact.getArtefactId());
		if (toUpdate.isPresent()) {
			if (Strings.isNullOrEmpty(artefact.getName())) {
				artefact.setName(toUpdate.get().getName());
			}
			if (Strings.isNullOrEmpty(artefact.getJcrPath())) {
				artefact.setJcrPath(toUpdate.get().getJcrPath());
			}
			return dao.update(toUpdate.get(), new NodeFilter("-content", 0));
		} else {
			throw new NoSuchEntityException("Artefact '"
					+ artefact.getArtefactId().toString() + "' not found.");
		}
	}

	@Override
	public RepoArtefact update(ProjectName projectName, RepoArtefact artefact) {
		LOGGER.debug("S: Update artefact for "
				+ artefact.getArtefactId().toString());
		LOGGER.debug("  Artefact: " + artefact);

		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefact);

		Optional<RepoArtefact> toUpdate = get(projectName,
				artefact.getArtefactId());
		if (toUpdate.isPresent()) {
			if (Strings.isNullOrEmpty(artefact.getName())) {
				artefact.setName(toUpdate.get().getName());
			}
			if (Strings.isNullOrEmpty(artefact.getJcrPath())) {
				artefact.setJcrPath(toUpdate.get().getJcrPath());
			}
			return dao.update(artefact, new NodeFilter(
					NodeFilter.DEPTH_INFINITE));
		} else {
			throw new NoSuchEntityException("Artefact '"
					+ artefact.getArtefactId().toString() + "' not found.");
		}
	}

	@Override
	public void delete(ProjectName projectName, ArtefactId artefactId) {
		LOGGER.debug("S: Delete artefact " + artefactId.toString());

		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefactId);

		String artefactPath = JcrPathUtil.getArtefactPath(projectName,
				artefactId);
		if (dao.exists(artefactPath)) {
			dao.remove(artefactPath);
			deleteEmptyPackage(projectName, artefactId);
		}
	}

	private void deleteEmptyPackage(ProjectName projectName,
			ArtefactId artefactId) {
		String packagePath = JcrPathUtil
				.getPackagePath(projectName, artefactId);
		RepoPackage pkg = packageDao.get(packagePath, new NodeFilter(1));
		if (pkg.getArtefacts().size() == 0) {
			packageDao.remove(packagePath);
		}
	}

	@Override
	public List<RepoArtefact> findAllInProject(ProjectName projectName) {
		LOGGER.debug("S: findAllInProject " + projectName);
		return dao.findAllInProject(projectName);
	}

	@Override
	public List<RepoArtefact> findAllInPackage(ProjectName projectName,
			PackageName packageName) {
		LOGGER.debug("S: findAllInPackage " + projectName + "/" + packageName);
		return dao.findAllInPackage(projectName, packageName);
	}

	@Override
	public List<RepoArtefact> findByCategory(ProjectName projectName,
			CategoryName categoryName) {
		LOGGER.debug("S: findByCategory " + projectName + " [" + categoryName
				+ "]");
		return dao.findByCategory(projectName, categoryName);
	}

	@Override
	public List<RepoArtefact> findByCategory(CategoryName categoryName) {
		LOGGER.debug("S: findByCategory [" + categoryName + "]");
		return dao.findByCategory(categoryName);
	}

	@Override
	public List<RepoArtefact> findByTag(ProjectName projectName, String tag) {
		LOGGER.debug("S: findByTag " + projectName + " [" + tag + "]");
		return dao.findByTag(projectName, tag);
	}

	@Override
	public List<RepoArtefact> findByTag(String tag) {
		LOGGER.debug("S: findByTag [" + tag + "]");
		return dao.findByTag(tag);
	}
}
