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
package eu.artist.reusevol.server.core;

import io.dropwizard.auth.Auth;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.model.Identifiable;
import eu.artist.reusevol.repo.common.model.JcrStorable;
import eu.artist.reusevol.repo.common.model.PermissionEntry;
import eu.artist.reusevol.repo.common.model.User;
import eu.artist.reusevol.server.core.security.annotations.ReadOperation;
import eu.artist.reusevol.server.core.security.annotations.WriteOperation;
import eu.artist.reusevol.server.util.DepthParam;

public interface GenericResource<T extends JcrStorable, I extends Identifiable> {
	/**
	 * Creates a new entity. The entity id is specified via the resource URI.
	 * 
	 * @param projectId
	 *            the id of the project
	 * @param name
	 *            the human readable label of the project
	 * @param description
	 *            the human readable description of the project
	 * @return In case of success Status 201 Created and the location of the
	 *         project in the location header is returned. The created entity is
	 *         provided in the body.
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@WriteOperation
	public Response create(@Valid T entity, @Auth User user);

	/**
	 * Gets the project specified by the resource URI from the database. The
	 * "mode" query parameter determines the depth of the retrieved object tree.
	 * 
	 * @param projectId
	 *            the id of the project
	 * @param mode
	 *            "shallow" retrieves only the project data, "full" retrieves
	 *            the project and its associated packages, "tree" retrieves the
	 *            complete meta-data of the project including packages and
	 *            artefacts.
	 * @return In case of success: Status 200 OK and the requested RepoProject
	 *         instance in the response body. 400 Bad Request if an unknown mode
	 *         was provided. 404 Not Found if the project was not found.
	 */
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@ReadOperation
	public Optional<T> get(@PathParam("id") I id,
			@QueryParam("depth") Optional<DepthParam> depth,
			@Auth(required = false) User user);

	/**
	 * Updates a project record. Only the provided properties are updated.
	 * 
	 * @param projectId
	 *            the id of the project
	 * @param name
	 *            the human readable label of the project
	 * @param description
	 *            the human readable description of the project
	 * @return 200 OK on success and the requested RepoProject instance in the
	 *         response body. 404 Not Found if the project was not found.
	 */
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@WriteOperation
	public Optional<T> update(@PathParam("id") I id, @Valid T entity,
			@QueryParam("depth") Optional<DepthParam> depth, @Auth User user);

	/**
	 * Deletes a project. If the query parameter "force" is not set to "true"
	 * projects will not be deleted, if they contain packages.
	 * 
	 * @param projectId
	 *            the id of the project
	 * @param force
	 *            the query parameter. "true" will delete the project and its
	 *            contents. All other values will only delete empty projects.
	 * @return 200 OK on success. 412 Precondition Failed when force is not
	 *         "true" and the project is not empty. 404 Not Found if the project
	 *         was not found.
	 */
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@WriteOperation
	public Optional<T> delete(@PathParam("id") I id, @Auth User user);

	/**
	 * Gets a list of all projects.
	 * 
	 * @param mode
	 *            "shallow" retrieves only the project data (default), "full"
	 *            retrieves the project and its associated packages, "tree"
	 *            retrieves the complete meta-data of the project including
	 *            packages and artefacts.
	 * @return a list of all projects
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@ReadOperation
	public List<T> list(@QueryParam("query") Optional<String> fiqlQuery,
			@QueryParam("depth") Optional<DepthParam> depth,
			@Auth(required = false) User user);

	@GET
	@Path("{id}/permissions")
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@ReadOperation
	public List<PermissionEntry> getPermissions(@PathParam("id") I id, @Auth User user);

	@PUT
	@Path("{id}/permissions")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Timed
	@WriteOperation
	public Response setPermissions(@PathParam("id") I id, @Auth User user, List<PermissionEntry> permissions);
}
