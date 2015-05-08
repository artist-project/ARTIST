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

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;

public interface ArtefactService {
	/**
	 * Creates an a artefact record and adds the content and throws and
	 * exception if the record already exists.
	 * 
	 * @param projectName
	 *            the name of the project that the artefact should be stored in
	 * @param artefact
	 *            the new artefact record to be stored
	 * @throws NullPointerException
	 *             if one of the arguments is null
	 * @throws EntityCreationException
	 *             if the artefact does already exist
	 * @return the created artefact record
	 */
	public RepoArtefact create(ProjectName projectName, RepoArtefact artefact);

	/**
	 * Gets an artefact including all metadata.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param artefactId
	 *            the id of the artefact
	 * @return an Optional object containing the result of the query
	 */
	public Optional<RepoArtefact> get(ProjectName project, ArtefactId artefact);

	/**
	 * Updates the an artefact previously retrieved from the repository includig
	 * meta-data and relations.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param artefact
	 *            the artefact previously retrieved
	 * @throws NullPointerException
	 *             if one of the arguments is null
	 * @throws NoSuchEntityException
	 *             if the artefact does not exist
	 * @return the updated artefact
	 */
	public RepoArtefact update(ProjectName project, RepoArtefact artefact);

	/**
	 * Updates the properties of an artefact previously retrieved from the
	 * repository. It does not change the content, meta-data or relations.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param artefact
	 *            the artefact previously retrieved
	 * @throws NullPointerException
	 *             if one of the arguments is null
	 * @throws NoSuchEntityException
	 *             if the artefact does not exist
	 * @return the updated artefact
	 */
	public RepoArtefact updateProperties(ProjectName project,
			RepoArtefact artefact);

	/**
	 * Deletes an artefact including all metadata and content. Does nothing if
	 * the artefact does not exist.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param artefactId
	 *            the id of the artefact
	 * @throws NullPointerException
	 *             if one of the arguments is null
	 */
	public void delete(ProjectName projectName, ArtefactId artefactId);

	/**
	 * Returns all artefacts in the given project.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findAllInProject(ProjectName projectName);

	/**
	 * Returns all artefacts in the given package in a given project.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param packageName
	 *            the name of the package
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findAllInPackage(ProjectName projectName,
			PackageName packageName);

	/**
	 * Returns all artefacts in the given category in a given project.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param categoryName
	 *            the name of the category
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findByCategory(ProjectName projectName,
			CategoryName categoryName);

	/**
	 * Returns all artefacts in the given category.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findByCategory(CategoryName categoryName);

	/**
	 * Returns all artefacts with the given tag in a given project.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param tag
	 *            the tag
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findByTag(ProjectName projectName, String tag);

	/**
	 * Returns all artefacts with the given tag.
	 * 
	 * @param tag
	 *            the tag
	 * @return the list of artefacts found
	 */
	public List<RepoArtefact> findByTag(String tag);

	// public void copy(ArtefactId source, ArtefactId target);

	// public void move(ArtefactId target, ArtefactId target);
}
