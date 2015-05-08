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
package eu.artist.reusevol.repo.common.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface ProjectResource {
	/**
	 * Creates a new project. The project id is specified via the resource URI,
	 * the other parameters are provided as query parameters.
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
	@Path("{projectId}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response create(@PathParam("projectId") String projectId,
			@QueryParam("name") String name,
			@QueryParam("description") @DefaultValue("") String description);

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
	@Path("{projectId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response read(@PathParam("projectId") String projectId,
			@QueryParam("mode") @DefaultValue("shallow") String mode);

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
	@Path("{projectId}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response update(@PathParam("projectId") String projectId,
			@QueryParam("name") String name,
			@QueryParam("description") String description);

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
	@Path("{projectId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response delete(@PathParam("projectId") String projectId,
			@QueryParam("force") @DefaultValue("false") String force);

	/**
	 * Gets a list of all projects.
	 * 
	 * @return a list of all projects
	 */
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response list();
}
