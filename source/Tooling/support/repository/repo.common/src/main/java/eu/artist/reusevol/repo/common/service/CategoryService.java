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
package eu.artist.reusevol.repo.common.service;

import java.util.List;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.util.CategoryName;

public interface CategoryService {

	/**
	 * Gets only the category without the artefact or sub-category lists.
	 * 
	 * @param categoryPath
	 *            the logical category path
	 * @return a category instance with the basic information
	 */
	public Optional<RepoCategory> getShallow(CategoryName categoryPath);

	/**
	 * Gets only the category with one level of sub-categories and with
	 * artefacts.
	 * 
	 * @param categoryPath
	 *            the logical category path
	 * @return a category instance with the basic information and populated
	 *         artefact
	 */
	public Optional<RepoCategory> get(CategoryName categoryPath);

	/**
	 * Gets the whole category with artefacts and the complete sub-category
	 * tree.
	 * 
	 * @param categoryPath
	 *            the logical category path
	 * @return a category instance with complete category subtree
	 */
	public Optional<RepoCategory> getTree(CategoryName categoryPath);

	/**
	 * Lists the artefacts associated with a category.
	 * 
	 * @param categoryPath
	 *            the logical category path
	 * @return the list of artefacts associated with this category
	 */
	public List<RepoArtefact> getArtefactsIn(CategoryName categoryPath);

	/**
	 * Creates a new category. The parent category has to exists, otherwise a
	 * NoSuchEntityException is thrown. If the category already exists, the
	 * properties of the existing category are updated.
	 * 
	 * @param categoryPath
	 *            the logical path of the category
	 * @param name
	 *            the display name of the category
	 * @param description
	 *            the description of the category
	 * @return the category just created
	 * @throws NoSuchEntityException
	 *             if the parent category does not exist
	 */
	public RepoCategory create(CategoryName categoryPath, String name,
			String description);

	/**
	 * Updates the properties of a category that was previously retrieved from
	 * the database. Sub-categories and artefacts are not affected.
	 * 
	 * @param updatedCategory
	 *            the updated category. The instance has to be previously
	 *            retrieved from the database.
	 * @throws NoSuchEntityException
	 *             if the category does not exist
	 */
	public void update(RepoCategory updatedCategory);

	/**
	 * Deletes an category that has no sub-categories or associated artefacts.
	 * If is still has sub-categories or associated artefacts an
	 * IllegalStateException exception is thrown. Throws a NoSuchEntityException
	 * if the category does not exist.
	 * 
	 * @param categoryToDelete
	 *            the category to be deleted. The instance has to be previously
	 *            retrieved from the database.
	 * @throws IllegalStateException
	 *             if the category does have sub-categories or assigned
	 *             artefacts
	 * @throws NoSuchEntityException
	 *             if the category does not exist
	 */
	public void delete(RepoCategory categoryToDelete);

	/**
	 * Deletes a category including all sub-categories and artefact
	 * associations.
	 * 
	 * @param categoryToDelete
	 *            the category to be deleted. The instance has to be previously
	 *            retrieved from the database.
	 */
	public void forceDelete(RepoCategory categoryToDelete);

	/**
	 * Adds an artefact to this category.
	 * 
	 * @param category
	 *            the category previously retrieved from the database
	 * @param artefact
	 *            the artefact previously retrieved from the database
	 */
	public void associateArtefact(RepoCategory category, RepoArtefact artefact);

	/**
	 * Removes an artefact from this category.
	 * 
	 * @param category
	 *            the category previously retrieved from the database
	 * @param artefact
	 *            the artefact previously retrieved from the database
	 */
	public void disAssociateArtefact(RepoCategory category,
			RepoArtefact artefact);
}
