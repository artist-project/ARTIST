/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
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

import eu.artist.reusevol.repo.common.access.AccessControllable;
import eu.artist.reusevol.repo.common.model.Identifiable;
import eu.artist.reusevol.repo.common.model.JcrStorable;
import eu.artist.reusevol.repo.common.util.Depth;

/**
 * Manages projects. A project is a collection of artefacts. Artefacts are
 * contained in packages. It is uniquely identified by a String id that may
 * contain alpha-numeric characters and "-", "_".
 * 
 * @author strauss
 * 
 */
public interface GenericService<T extends JcrStorable> extends AccessControllable<T> {

	public boolean exists(Identifiable id);

	/**
	 * Create a new Project. A project is a collection of artefacts. If the
	 * project with the given id already exists the given properties are updated
	 * in the existing project.
	 * 
	 * @param id
	 *            the id of the project used to access this project
	 * @param name
	 *            the display name
	 * @param description
	 *            the longer description of this project
	 * @return the newly created project
	 */
	public T create(T entity);

	/**
	 * Gets only the project with its properties and no related objects like
	 * packages.
	 * 
	 * @param id
	 *            the id of the project used to access this project
	 * @return the project with its properties and no related objects like
	 *         packages
	 */
	public Optional<T> get(Identifiable id, Depth depth);

	/**
	 * Updates the properties of an existing project specified by the given id.
	 * Leaves packages untouched.
	 * 
	 * @param id
	 *            the id of the project used to access this project
	 * @param name
	 *            the display name
	 * @param description
	 *            the longer description of this project
	 * @return the updated project
	 * @throws NoSuchEntityException
	 *             if the project does not exist
	 */
	public Optional<T> update(T entity, Depth depth);

	/**
	 * Delete a project previously retrieved from the database if it has no
	 * dependent packages.
	 * 
	 * @param project
	 *            the project previously retrieved from the database
	 * @throws NoSuchEntityException
	 *             if the project does not exist
	 * @throws IllegalStateException
	 *             if the project contains packages or artefacts
	 */
	public Optional<T> delete(Identifiable id);

	public void move(Identifiable source, Identifiable targetId);

	/**
	 * Get all accessible projects.
	 * 
	 * @param depth
	 *            the depth of the retrieved information (0=only projects,
	 *            1=include also packages, 2=include also artefacts).
	 * @return List of all accessible projects
	 */
	public List<T> findAll(Depth depth);

	/**
	 * Get all accessible projects.
	 * 
	 * @param depth
	 *            the depth of the retrieved information (0=only projects,
	 *            1=include also packages, 2=include also artefacts).
	 * @return List of all accessible projects
	 */
	public List<T> findByFiql(String query, Depth depth);

	public void close();
}
