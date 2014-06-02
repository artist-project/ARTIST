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
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.log4j.Logger;
import org.jcrom.util.NodeFilter;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.server.util.JcrPathUtil;

/**
 * {@inheritDoc}
 */
public class CategoryServiceImpl implements CategoryService {

	private static final Logger LOGGER = Logger
			.getLogger(CategoryServiceImpl.class);

	@Inject
	private CategoryDAO dao;

	@Inject
	private Session jcrSession;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<RepoCategory> getShallow(CategoryName categoryPath) {
		LOGGER.debug(String.format("S: Getting category for %s.",
				categoryPath.getName()));
		return Optional.fromNullable(getCategoryWithFilter(categoryPath,
				new NodeFilter("-children", 0)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<RepoCategory> get(CategoryName categoryPath) {
		LOGGER.debug(String.format("S: Getting category for %s.",
				categoryPath.getName()));
		return Optional.fromNullable(getCategoryWithFilter(categoryPath,
				new NodeFilter(NodeFilter.INCLUDE_ALL, 1)));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<RepoCategory> getTree(CategoryName categoryPath) {
		LOGGER.debug(String.format("S: Getting category for %s.",
				categoryPath.getName()));
		return Optional.fromNullable(getCategoryWithFilter(categoryPath,
				new NodeFilter(NodeFilter.INCLUDE_ALL,
						NodeFilter.DEPTH_INFINITE)));
	}

	/**
	 * {@inheritDoc}
	 */
	private RepoCategory getCategoryWithFilter(CategoryName categoryName,
			NodeFilter filter) {
		String nodePath = JcrPathUtil.getCategoryPath(categoryName);

		LOGGER.debug(String.format("S: Getting category '%s' from %s.",
				categoryName.getName(), nodePath));
		return dao.get(nodePath, filter);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<RepoArtefact> getArtefactsIn(CategoryName categoryPath) {
		// TODO Add implementation
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RepoCategory create(CategoryName categoryPath, String name,
			String description) {
		LOGGER.debug(String.format("S: Creating category '%s' as %s.", name,
				categoryPath.getName()));
		CategoryName parentPath = categoryPath.getParent();
		Optional<RepoCategory> parent = get(parentPath);

		if (parent.isPresent()) {
			Optional<RepoCategory> existingCat = containsCategory(parent.get()
					.getCategories(), categoryPath.getName());
			if (existingCat.isPresent()) {
				RepoCategory updatedCategory = existingCat.get();
				updatedCategory.setLabel(name);
				updatedCategory.setDescription(description);
				update(updatedCategory);
				return updatedCategory;
			} else {
				RepoCategory category = new RepoCategory(categoryPath, name,
						description);
				parent.get().addCategory(category);
				fullUpdate(parent.get());
				return category;
			}
		} else {
			throw new NoSuchEntityException(
					String.format(
							"Creating category '%s' failed because parent category '%s' does not exist. Please create it first.",
							categoryPath.getName(), parentPath.getName()));
		}
	}

	private Optional<RepoCategory> containsCategory(
			List<RepoCategory> categories, String categoryPath) {
		for (RepoCategory cat : categories) {
			if (cat.getId().equalsIgnoreCase(categoryPath)) {
				return Optional.of(cat);
			}
		}
		return Optional.absent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void update(RepoCategory updatedCategory) {
		updateWithFilter(updatedCategory, new NodeFilter(0));
	}

	public void fullUpdate(RepoCategory updatedCategory) {
		updateWithFilter(updatedCategory, new NodeFilter(
				NodeFilter.INCLUDE_ALL, NodeFilter.DEPTH_INFINITE));
	}

	private void updateWithFilter(RepoCategory updatedCategory,
			NodeFilter filter) {
		LOGGER.debug(String.format("S: Updating category '%s'.",
				updatedCategory));
		if (categoryExists(CategoryName.of(updatedCategory.getId()))) {
			dao.update(updatedCategory, filter);
		} else {
			throw new NoSuchEntityException(String.format(
					"Category '%s' at %s does not exist.",
					updatedCategory.getLabel(), updatedCategory.getId()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete(RepoCategory categoryToDelete) {
		LOGGER.debug(String.format("S: Deleting category '%s' as %s.",
				categoryToDelete.getLabel(), categoryToDelete.getId()));

		Optional<RepoCategory> category = get(CategoryName.of(categoryToDelete
				.getId()));
		if (category.isPresent()) {
			if (category.get().getCategories().size() == 0) {
				forceDelete(categoryToDelete);
			} else {
				throw new IllegalStateException(
						String.format(
								"Category '%s' could not be deleted, since it is not empty. "
										+ "If you want to delete it anyway, use forceDelete.",
								categoryToDelete.getId()));
			}
		} else {
			throw new NoSuchEntityException(String.format(
					"Category '%s' at %s does not exist.",
					categoryToDelete.getLabel(), categoryToDelete.getId()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void forceDelete(RepoCategory categoryToDelete) {
		LOGGER.debug(String.format("S: Deleting category '%s' as %s.",
				categoryToDelete.getLabel(), categoryToDelete.getId()));

		CategoryName parentPath = CategoryName.of(categoryToDelete.getId())
				.getParent();
		Optional<RepoCategory> parent = get(parentPath);

		if (parent.isPresent()) {
			parent.get().removeCategory(categoryToDelete);
			fullUpdate(parent.get());
		}
	}

	@Override
	public void associateArtefact(RepoCategory category, RepoArtefact artefact) {
		// TODO Add implementation
		throw new UnsupportedOperationException();
	}

	@Override
	public void disAssociateArtefact(RepoCategory category,
			RepoArtefact artefact) {
		// TODO Add implementation
		throw new UnsupportedOperationException();
	}

	private boolean categoryExists(CategoryName path) {
		Session session = getSession();
		try {
			return session.nodeExists(JcrPathUtil.getCategoryPath(path));
		} catch (RepositoryException e) {
			return false;
		}
	}

	/**
	 * @return the dao
	 */
	public CategoryDAO getDao() {
		return dao;
	}

	/**
	 * @return the JCR session
	 */
	public Session getSession() {
		return jcrSession;
	}
}
