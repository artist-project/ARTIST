/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
 
package eu.artist.reusevol.server.resources

import com.codahale.metrics.annotation.Timed
import com.google.common.base.Optional
import com.sun.jersey.core.header.FormDataContentDisposition
import com.sun.jersey.multipart.FormDataParam
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.server.core.security.annotations.ReadOperation
import eu.artist.reusevol.server.core.security.annotations.WriteOperation
import eu.artist.reusevol.server.core.service.ArtefactService
import io.dropwizard.auth.Auth
import java.io.InputStream
import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.QueryParam
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.eclipse.xtend.lib.annotations.Accessors
import org.slf4j.LoggerFactory

@Accessors
public class ImageResource {
	
	private static val logger = LoggerFactory.getLogger(ImageResource)

	val ArtefactService service
	val RepoArtefact artefact

	@GET
	@Timed
	@ReadOperation
	public def Response getContent(@Auth(required = false) User user) {
		val content = artefact.image

		if (content?.dataProvider == null) {
			Response.status(Response.Status.NO_CONTENT).build
		} else {
			val input = service.getImage(artefact)
			Response.ok.entity(input).type(content?.mimeType).build
		}
	}

	@DELETE
	@Timed
	@WriteOperation
	public def Response clearContent(@Auth User user) {
		try {
			service.clearContent(artefact)
			Response.ok.build
		} catch(Exception ex) {
			logger.debug("Error during image removal", ex)
			Response.status(Status.INTERNAL_SERVER_ERROR).entity(ex.message).build
		}
	}

	@POST
	@Timed
	@WriteOperation
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public def Response formUpload(
		@FormDataParam("file") InputStream fileInputStream,
		@FormDataParam("file") FormDataContentDisposition contentDispositionHeader,
		@QueryParam("mimetype") Optional<String> mimeType,
		@Auth User user) {

		val mime = mimeType.or(contentDispositionHeader?.type)
		
		logger.debug("Form based upload of file {} with mime-type {}", contentDispositionHeader?.fileName, mime)

		try {
			service.setImage(artefact, fileInputStream, contentDispositionHeader.fileName, mime)
		} catch(Exception ex) {
			logger.debug("Error during image upload", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).entity(ex.message).build)
		}
		
		Response.ok.build
	}

	@POST
	@Timed
	@WriteOperation
	public def Response directUpload(
		@QueryParam("filename") Optional<String> filename,
		@QueryParam("mimetype") Optional<String> mimeType,
		@QueryParam("encoding") Optional<String> encoding,
		@Auth User user,
		InputStream input
	) {
	
		val name = filename.or("image.jpg")
		
		logger.debug("Direct upload of file {} with mime-type {}", name, mimeType.orNull)
	
		try {	
			val defaultType = com.google.common.net.MediaType.JPEG.toString
			service.setImage(artefact, input, name, mimeType.or(defaultType))
		} catch(Exception ex) {
			logger.debug("Error during image upload", ex)
			throw new WebApplicationException(Response.status(Status.INTERNAL_SERVER_ERROR).entity(ex.message).build)
		}
		
		Response.ok.build
	}
}
