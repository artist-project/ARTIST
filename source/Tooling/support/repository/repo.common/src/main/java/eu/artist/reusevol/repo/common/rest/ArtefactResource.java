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

import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;

public interface ArtefactResource {
	public static final String REST_PREFIX = "/art";
	public static final String CAUSE_KEY = "error-cause";

	public static final String MODE_METADATA = "metadata";
	public static final String MODE_CONTENT = "content";
	public static final String MODE_FULL = "full";

	/**
	 * Creates a new artefact that does not exist in the database. The record
	 * has to be provided in an mandatory attachment with id "record". If an
	 * optional content attachment with id "file-content" is added, it will also
	 * be stored.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param body
	 *            the multipart message containing the RepoArtefact record and
	 *            optionally the content to be stored
	 * @return On success status 201 Created, the new artefact record in the
	 *         body and a location header pointing to the resource or else 304
	 *         Not Modified if the artefact already existed
	 * 
	 */
	@POST
	@Path("{project}")
	@Consumes({ "multipart/mixed", MediaType.MULTIPART_FORM_DATA })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response create(@PathParam("project") String projectName,
			MultipartBody body);

	/**
	 * Gets an existing artefact. Depending on the mode, the artefact record,
	 * the artefact content of both are retrieved.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param packageName
	 *            the name of the package
	 * @param artefactName
	 *            the name of the artefact
	 * @param mode
	 *            "metadata": only record (default), "content": only content or
	 *            "full": both
	 * @return On success status 200 Ok, the requested artefact and optional
	 *         content in the body or else null if the artefact was not found
	 */
	@GET
	@Path("{project}/{package}/{artefact}")
	@Produces({ MediaType.MULTIPART_FORM_DATA, "multipart/mixed" })
	public MultipartBody get(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName,
			@QueryParam("mode") @DefaultValue(MODE_METADATA) String mode);

	/**
	 * Updates an artefact.
	 * 
	 * @param artefactName
	 *            the name of the artefact
	 * @param artefact
	 *            the RepoArtefact to upload
	 * @return On success status 200 Ok or else 404 Not Found if the artefact
	 *         was not found or 304 Not Modified if the artefact has not been
	 *         retrieved before
	 */
	@PUT
	@Path("{project}/{package}/{artefact}")
	@Consumes({ MediaType.MULTIPART_FORM_DATA, "multipart/mixed" })
	public Response update(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName,
			MultipartBody artefactAndContent);

	/**
	 * Deletes the given artefact.
	 * 
	 * @param artefactName
	 *            the name of the artefact
	 * @return On success status 200 Ok or else 404 Not Found if the artefact
	 *         was not found
	 */
	@DELETE
	@Path("{project}/{package}/{artefact}")
	public Response delete(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName);

	/**
	 * Gets the content of the given artefact.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param packageName
	 *            the name of the package
	 * @param artefactName
	 *            the name of the artefact
	 * @return 200 OK on success and the content in the body. The header
	 *         contains the following information: "filename"=the name of the
	 *         transmitted file, "mime-type"=the mime-type of the file,
	 *         "encoding"=the character encoding of the file and
	 *         "last-modified"=date of last modification. 500 Internal Server
	 *         Error if the type of artefact content is unknown. 204 No Content
	 *         if the content is empty or missing. 404 Not found if the artefact
	 *         was not found.
	 */
	@GET
	@Path("{project}/{package}/{artefact}/content")
	@Produces({ MediaType.MULTIPART_FORM_DATA, "multipart/mixed" })
	public Response getContent(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName);

	/**
	 * Updates the given artefacts content with the file uploaded as multipart
	 * file attachment. The filename must be given in the content disposition
	 * header under the key "name".
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param packageName
	 *            the name of the package
	 * @param artefactName
	 *            the name of the artefact
	 * @param f_attachment
	 *            the file attachment
	 * @return 200 OK on success and the updates artefact in the body. 404 Not
	 *         Found if the artefact was not found. 500 Internal Server Error if
	 *         an IO error occured.
	 */
	@POST
	@Path("{project}/{package}/{artefact}/content")
	@Consumes({ MediaType.MULTIPART_FORM_DATA, "multipart/mixed",
			MediaType.APPLICATION_OCTET_STREAM, MediaType.TEXT_PLAIN })
	public Response updateContent(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName,
			@Multipart("repoFile") MultipartBody f_attachment);

	/**
	 * Deletes the content of an artefact.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @param packageName
	 *            the name of the package
	 * @param artefactName
	 *            the name of the artefact
	 * @return 200 OK on success and the updates artefact in the body. 404 Not
	 *         Found if the artefact was not found.
	 */
	@DELETE
	@Path("{project}/{package}/{artefact}/content")
	public Response deleteContent(@PathParam("project") String projectName,
			@PathParam("package") String packageName,
			@PathParam("artefact") String artefactName);

	/**
	 * List all artefact in the given package. If the optional query parameter
	 * "project" is given the results will be restriced to this project.
	 * 
	 * @param packageName
	 *            the name of the package from the URI
	 * @param projectName
	 *            the name of the project (optional query parameter)
	 * @return the list of projects found
	 */
	@GET
	@Path("search/package/{package}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findAllInPackage(@PathParam("package") String packageName,
			@QueryParam("project") String projectName);

	/**
	 * List all artefact in the given project.
	 * 
	 * @param projectName
	 *            the name of the project
	 * @return the list of projects found
	 */
	@GET
	@Path("search/project/{project}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findAllInProject(@PathParam("project") String projectName);

	/**
	 * List all artefact in the given category. If the optional query parameter
	 * "project" is given the results will be restriced to this project.
	 * 
	 * @param categoryName
	 *            the name of the category from the URI
	 * @param projectName
	 *            the name of the project (optional query parameter)
	 * @return the list of projects found
	 */
	@GET
	@Path("search/category/{category}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findByCategory(@PathParam("category") String categoryName,
			@QueryParam("project") String projectName);

	/**
	 * List all artefact in the given tag. If the optional query parameter
	 * "project" is given the results will be restriced to this project.
	 * 
	 * @param tagName
	 *            the tag
	 * @param projectName
	 *            the name of the project (optional query parameter)
	 * @return the list of projects found
	 */
	@GET
	@Path("search/tag/{tag}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response findByTag(@PathParam("tag") String tagName,
			@QueryParam("project") String projectName);

}
