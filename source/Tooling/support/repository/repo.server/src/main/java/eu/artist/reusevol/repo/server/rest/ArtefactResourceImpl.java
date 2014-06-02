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
package eu.artist.reusevol.repo.server.rest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;
import org.apache.log4j.Logger;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.FileContent;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoContent;
import eu.artist.reusevol.repo.common.model.WebContent;
import eu.artist.reusevol.repo.common.rest.ArtefactResource;
import eu.artist.reusevol.repo.common.service.ArtefactService;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;

@Path(ArtefactResource.REST_PREFIX)
public class ArtefactResourceImpl implements ArtefactResource {

	public static final String CAUSE_KEY = "error-cause";

	@Context
	private UriInfo uriInfo;

	@Inject
	private ArtefactService artefactService;

	private static final Logger LOGGER = Logger
			.getLogger(ArtefactResourceImpl.class);

	@Override
	public Response create(String projectName, MultipartBody body) {
		ProjectName project = ProjectName.of(projectName);

		LOGGER.debug("R: Creating artefact.");

		if (body == null)
			return Response.status(Status.BAD_REQUEST).build();

		Optional<RepoArtefact> art = extractRecord(body);
		Optional<FileContent> file = extractFileContent(body);

		LOGGER.debug("  Record present: " + art.isPresent());
		LOGGER.debug("  Content present: " + file.isPresent());

		if (!art.isPresent()) {
			return Response
					.status(Status.NOT_FOUND)
					.header(ArtefactResource.CAUSE_KEY,
							"Artefact not found in attachment.").build();
		}
		RepoArtefact artefact = art.get();

		try {
			if (artefact.getContent() instanceof FileContent) {
				LOGGER.debug("  Content is file");
				if (file.isPresent()) {
					artefact.setContent(file.get());
				}
			}

			RepoArtefact result = artefactService.create(project, artefact);

			URI location = uriInfo.getAbsolutePathBuilder()
					.path(result.getName()).build();
			return Response.status(Status.CREATED).contentLocation(location)
					.entity(result).build();
		} catch (EntityCreationException ex) {
			// Artefact existed already
			return Response.status(Status.NOT_MODIFIED)
					.header(ArtefactResource.CAUSE_KEY, ex.getMessage())
					.build();
		}
	}

	@Override
	public MultipartBody get(String projectName, String packageName,
			String artefactName, String mode) {

		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);
		List<Attachment> attachments = Lists.newArrayList();

		LOGGER.debug("R: Getting artefact " + artefactId + " from project "
				+ projectId);

		Optional<RepoArtefact> result = artefactService.get(projectId,
				artefactId);

		LOGGER.debug("  Artefact found: " + result.isPresent());

		if (result.isPresent()) {
			RepoArtefact artefact = result.get();

			if (mode.equalsIgnoreCase(MODE_METADATA)
					|| mode.equalsIgnoreCase(MODE_FULL)) {
				Attachment record = new Attachment("record",
						MediaType.APPLICATION_XML, artefact);
				attachments.add(record);
			}
			if (mode.equalsIgnoreCase(MODE_CONTENT)
					|| mode.equalsIgnoreCase(MODE_FULL)) {
				if (artefact.getContent() instanceof FileContent) {
					FileContent f = (FileContent) artefact.getContent();
					ContentDisposition cd = new ContentDisposition(
							"attachment;filename=" + f.getFileName()
									+ ";mime-type=" + f.getMimeType());
					Attachment file = new Attachment("file-content",
							f.getContent(), cd);
					attachments.add(file);
				}
			}
			return new MultipartBody(attachments);
		}
		return null;
	}

	@Override
	public Response update(String projectName, String packageName,
			String artefactName, MultipartBody artefactAndContent) {

		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Updating artefact " + artefactId + " in project "
				+ projectId);

		Optional<RepoArtefact> art = extractRecord(artefactAndContent);
		Optional<FileContent> file = extractFileContent(artefactAndContent);

		if (!art.isPresent()) {
			return Response
					.status(Status.NOT_FOUND)
					.header(ArtefactResource.CAUSE_KEY,
							"Artefact not found in attachment.").build();
		}
		RepoArtefact artefact = art.get();

		try {
			if (file.isPresent()) {
				artefact.setContent(file.get());
			} else {
				// TODO: Change this!!!
				// removeFileContentData(artefact);
			}
			RepoArtefact result = artefactService.update(projectId, artefact);
			return Response.ok(result).build();
		} catch (NoSuchEntityException ex) {
			return Response.status(Status.NOT_FOUND)
					.header(ArtefactResource.CAUSE_KEY, ex.getMessage())
					.build();
		} catch (IllegalStateException ex) {
			return Response.status(Status.NOT_MODIFIED)
					.header(ArtefactResource.CAUSE_KEY, ex.getMessage())
					.build();
		}
	}

	private Response updateWithoutContent(String projectName,
			String packageName, String artefactName, RepoArtefact artefact) {
		Attachment record = new Attachment("record", MediaType.APPLICATION_XML,
				artefact);
		return update(projectName, packageName, artefactName,
				new MultipartBody(record));
	}

	private Optional<RepoArtefact> extractRecord(MultipartBody body) {
		return Optional.fromNullable(body.getAttachmentObject("record",
				RepoArtefact.class));
	}

	private Optional<FileContent> extractFileContent(MultipartBody body) {
		Attachment att = body.getAttachment("file-content");

		if (att == null)
			return Optional.absent();

		ContentDisposition cd = att.getContentDisposition();
		String filename = cd.getParameter("filename");
		String contentType = cd.getParameter("mime-type");
		FileContent file = null;
		try {
			InputStream content = att.getDataHandler().getInputStream();
			file = new FileContent();
			file.setFileName(filename);
			file.setMimeType(contentType);
			file.setContent(content);
		} catch (IOException ex) {
			LOGGER.debug("Error reading file attachment: " + ex.getMessage());
			return Optional.absent();
		}

		return Optional.fromNullable(file);
	}

	private void removeFileContentData(RepoArtefact artefact) {
		if (artefact.getContent() instanceof FileContent) {
			InputStream stream = new ByteArrayInputStream("".getBytes());
			FileContent file = (FileContent) artefact.getContent();
			file.setContent(stream);
		}
	}

	@Override
	public Response delete(String projectName, String packageName,
			String artefactName) {
		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Deleting artefact " + artefactId + " in project "
				+ projectId);

		try {
			artefactService.delete(projectId, artefactId);
			return Response.ok().build();
		} catch (NoSuchEntityException ex) {
			return Response.status(Status.NOT_FOUND)
					.header(ArtefactResource.CAUSE_KEY, ex.getMessage())
					.build();
		}
	}

	@Override
	public Response getContent(String projectName, String packageName,
			String artefactName) {
		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Downloading content of artefact " + artefactId
				+ " in project " + projectId);

		Optional<RepoArtefact> artefact = artefactService.get(projectId,
				artefactId);
		if (artefact.isPresent()) {
			RepoContent content = artefact.get().getContent();
			if (content != null) {
				if (content instanceof FileContent) {
					FileContent file = (FileContent) content;
					return Response.ok(file.getContent())
							.header("type", "file-content")
							.header("filename", file.getFileName())
							.header("mime-type", file.getMimeType())
							.header("encoding", file.getEncoding())
							.lastModified(file.getLastModified().getTime())
							.build();
				} else if (content instanceof WebContent) {
					WebContent web = (WebContent) content;
					URI uri;
					try {
						uri = new URI(web.getUrl());
					} catch (URISyntaxException e) {
						uri = null;
					}
					return Response.ok(web.getContent())
							.header("type", "web-content").contentLocation(uri)
							.build();
				} else {
					return Response.status(Status.INTERNAL_SERVER_ERROR)
							.build();
				}
			} else {
				return Response.status(Status.NO_CONTENT).build();
			}
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}

	}

	@Override
	public Response updateContent(String projectName, String packageName,
			String artefactName, final MultipartBody multipart) {
		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Updating content of artefact " + artefactId
				+ " in project " + projectId);

		try {
			Attachment att = multipart.getRootAttachment();
			String filename = att.getContentDisposition().getParameter("name");
			String contentType = att.getContentType().toString();
			InputStream content = att.getDataHandler().getInputStream();

			LOGGER.debug("  Found file " + filename);

			FileContent file = new FileContent();
			file.setFileName(filename);
			file.setMimeType(contentType);
			file.setContent(content);

			Optional<RepoArtefact> artefact = artefactService.get(projectId,
					artefactId);
			if (artefact.isPresent()) {
				RepoArtefact result = artefact.get();
				result.setContent(file);
				return updateWithoutContent(projectName, packageName,
						artefactName, result);
			} else {
				return Response.status(Status.NOT_FOUND).build();
			}
		} catch (IOException e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.header(ArtefactResource.CAUSE_KEY, e.getMessage()).build();
		}

	}

	@Override
	public Response deleteContent(String projectName, String packageName,
			String artefactName) {
		ArtefactId artefactId = ArtefactId.of(packageName, artefactName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Deleting content of artefact " + artefactId
				+ " in project " + projectId);

		Optional<RepoArtefact> artefact = artefactService.get(projectId,
				artefactId);
		if (artefact.isPresent()) {
			RepoArtefact result = artefact.get();
			result.setContent(null);
			return updateWithoutContent(projectName, packageName, artefactName,
					result);
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@Override
	public Response findAllInPackage(String packageName, String projectName) {
		PackageName packageId = PackageName.of(packageName);
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Listing artefacts for package " + packageId
				+ " in project " + projectId);

		List<RepoArtefact> list = artefactService.findAllInPackage(projectId,
				packageId);
		final GenericEntity<List<RepoArtefact>> entity = new GenericEntity<List<RepoArtefact>>(
				list) {
		};

		return Response.ok(entity).build();
	}

	@Override
	public Response findAllInProject(String projectName) {
		ProjectName projectId = ProjectName.of(projectName);

		LOGGER.debug("R: Listing artefacts in project " + projectId);

		List<RepoArtefact> list = artefactService.findAllInProject(projectId);
		final GenericEntity<List<RepoArtefact>> entity = new GenericEntity<List<RepoArtefact>>(
				list) {
		};

		return Response.ok(entity).build();
	}

	@Override
	public Response findByCategory(String categoryName, String projectName) {
		CategoryName categoryId = CategoryName.of(categoryName);
		List<RepoArtefact> list;

		if (!Strings.isNullOrEmpty(projectName)) {
			ProjectName projectId = ProjectName.of(projectName);
			list = artefactService.findByCategory(projectId, categoryId);
		} else {
			list = artefactService.findByCategory(categoryId);
		}

		final GenericEntity<List<RepoArtefact>> entity = new GenericEntity<List<RepoArtefact>>(
				list) {
		};

		return Response.ok(entity).build();
	}

	@Override
	public Response findByTag(String tagName, String projectName) {
		List<RepoArtefact> list;

		if (!Strings.isNullOrEmpty(projectName)) {
			ProjectName projectId = ProjectName.of(projectName);
			list = artefactService.findByTag(projectId, tagName);
		} else {
			list = artefactService.findByTag(tagName);
		}

		final GenericEntity<List<RepoArtefact>> entity = new GenericEntity<List<RepoArtefact>>(
				list) {
		};

		return Response.ok(entity).build();
	}
}
