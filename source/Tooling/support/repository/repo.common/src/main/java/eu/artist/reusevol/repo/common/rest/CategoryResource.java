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

public interface CategoryResource {

	/**
	 * Gets categories from the server. There are three allowed modes:
	 * "shallow", "full" (default) and "tree".
	 * 
	 * @param categoryPath
	 *            the path fragment specifying the category, e.g.
	 *            modelling/uml/profile
	 * @param mode
	 *            the depth of the resulting category: "shallow"=only
	 *            properties, "full"=properties and one level of dependent
	 *            objects (default) and "tree"=the whole subtree of objects
	 * @return Status 200 OK and result in body, Status 400 BAD_REQUEST for
	 *         unknown modes and Status 404 NOT_FOUND for unknown categories
	 */
	@GET
	@Path("{path:.*}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response get(@PathParam("path") String categoryPath,
			@DefaultValue("full") @QueryParam("mode") String mode);

	/**
	 * Create a category. The parent category of the new category has to exist.
	 * 
	 * @param categoryPath
	 *            the path fragment specifying the category, e.g.
	 *            modelling/uml/profile
	 * @param name
	 *            the display name of the new category
	 * @param description
	 *            the description of the new category
	 * @return Status 201 CREATED with the location URL in the header and the
	 *         new category in the body, Status 404 NOT_FOUND if the parent
	 *         category did not exist.
	 */
	@POST
	@Path("{path:.*}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response create(@PathParam("path") String categoryPath,
			@QueryParam("name") String name,
			@QueryParam("description") String description);

	/**
	 * Updates the name and description fields of a category.
	 * 
	 * @param categoryPath
	 *            the path fragment specifying the category, e.g.
	 *            modelling/uml/profile
	 * @param name
	 *            the display name of the new category
	 * @param description
	 *            the description of the new category
	 * @return Status 200 OK and result in body, Status 404 NOT_FOUND for
	 *         unknown category
	 */
	@PUT
	@Path("{path:.*}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response update(@PathParam("path") String categoryPath,
			@QueryParam("name") String name,
			@QueryParam("description") String description);

	/**
	 * Deletes a category.
	 * 
	 * @param categoryPath
	 *            the path fragment specifying the category, e.g.
	 *            modelling/uml/profile
	 * @param forceDelete
	 *            "true"=deletes the category (and its sub-category tree),
	 *            everything else=deletes the category only, if it has no
	 *            sub-categories
	 * @return Status 200 OK, Status 404 NOT_FOUND if the category does not
	 *         exist or Status 412 PRECONDITION_FAILED if the preconditions are
	 *         not met
	 */
	@DELETE
	@Path("{path:.*}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response delete(@PathParam("path") String categoryPath,
			@DefaultValue("false") @QueryParam("force") String forceDelete);
}
