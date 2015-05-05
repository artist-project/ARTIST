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
package eu.artist.reusevol.repo.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ResponseReader;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.ContentDisposition;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import eu.artist.reusevol.repo.common.exceptions.EntityCreationException;
import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.FileContent;
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoContent;
import eu.artist.reusevol.repo.common.rest.ArtefactResource;
import eu.artist.reusevol.repo.common.service.ArtefactService;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;

public class ArtefactManager implements ArtefactService {

	private final RepositoryClient client;

	/**
	 * @param client
	 */
	public ArtefactManager(RepositoryClient client) {
		this.client = client;
	}

	@Override
	public RepoArtefact create(ProjectName projectName, RepoArtefact artefact) {
		String projectId = projectName.getName();

		ArtefactResource proxy = initProxy();

		Response response = proxy.create(projectId,
				artefactToMultipart(artefact));

		if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			RepoArtefact entity = (RepoArtefact) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_MODIFIED
				.getStatusCode()) {
			throw new EntityCreationException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));
		} else if (response.getStatus() == Response.Status.BAD_REQUEST
				.getStatusCode()) {
			throw new EntityCreationException("Message body was null.");
		}

		return null;
	}

	@Override
	public Optional<RepoArtefact> get(ProjectName projectId,
			ArtefactId artefactId) {

		return getWithMode(projectId, artefactId, ArtefactResource.MODE_FULL);
	}

	private Optional<RepoArtefact> getWithMode(ProjectName projectId,
			ArtefactId artefactId, String mode) {
		String projectName = projectId.getName();
		String packageName = artefactId.getPackagePart().getName();
		String artefactName = artefactId.getArtefactPart().getName();

		ArtefactResource proxy = initMultipartProxy();

		MultipartBody body = proxy.get(projectName, packageName, artefactName,
				mode);

		if (body == null) {
			return Optional.absent();
		}

		Optional<RepoArtefact> art = extractRecord(body);
		Optional<FileContent> file = extractFileContent(body);

		if (!art.isPresent()) {
			return Optional.absent();
		}
		RepoArtefact artefact = art.get();

		if (file.isPresent() && (artefact.getContent() instanceof FileContent)) {
			artefact.setContent(file.get());
		}

		return Optional.fromNullable(artefact);
	}

	@Override
	public RepoArtefact update(ProjectName projectId, RepoArtefact artefact) {
		String projectName = projectId.getName();
		String packageName = artefact.getArtefactId().getPackagePart()
				.getName();
		String artefactName = artefact.getName();

		ArtefactResource proxy = initProxy();

		Response response = proxy.update(projectName, packageName,
				artefactName, artefactToMultipart(artefact));

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			RepoArtefact entity = (RepoArtefact) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));

		} else if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			throw new IllegalStateException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));
		}

		return null;
	}

	@Override
	public RepoArtefact updateProperties(ProjectName projectId,
			RepoArtefact artefact) {
		String projectName = projectId.getName();
		String packageName = artefact.getArtefactId().getPackagePart()
				.getName();
		String artefactName = artefact.getName();

		ArtefactResource proxy = initProxy();

		Attachment record = new Attachment("record", MediaType.APPLICATION_XML,
				artefact);
		List<Attachment> attachments = Lists.newArrayList(record);

		Response response = proxy.update(projectName, packageName,
				artefactName, new MultipartBody(attachments));

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			RepoArtefact entity = (RepoArtefact) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));

		} else if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			throw new IllegalStateException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));
		}

		return null;
	}

	@Override
	public void delete(ProjectName projectId, ArtefactId artefactId) {
		String projectName = projectId.getName();
		String packageName = artefactId.getPackagePart().getName();
		String artefactName = artefactId.getArtefactPart().getName();

		ArtefactResource proxy = initProxy();

		Response response = proxy
				.delete(projectName, packageName, artefactName);

		if (response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
			throw new NoSuchEntityException((String) response.getMetadata()
					.get(ArtefactResource.CAUSE_KEY).get(0));
		}
	}

	@Override
	public List<RepoArtefact> findAllInProject(ProjectName projectName) {
		ArtefactResource proxy = initSearchProxy("project",
				projectName.getName(), null);

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
	}

	@Override
	public List<RepoArtefact> findAllInPackage(ProjectName projectName,
			PackageName packageName) {
		ArtefactResource proxy = initSearchProxy("package",
				packageName.getName(), projectName.getName());

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
	}

	@Override
	public List<RepoArtefact> findByCategory(ProjectName projectName,
			CategoryName categoryName) {
		ArtefactResource proxy = initSearchProxy("category",
				categoryName.getName(), projectName.getName());

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
	}

	@Override
	public List<RepoArtefact> findByCategory(CategoryName categoryName) {
		ArtefactResource proxy = initSearchProxy("category",
				categoryName.getName(), null);

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
	}

	@Override
	public List<RepoArtefact> findByTag(ProjectName projectName, String tag) {
		ArtefactResource proxy = initSearchProxy("tag", tag,
				projectName.getName());

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
	}

	@Override
	public List<RepoArtefact> findByTag(String tag) {
		ArtefactResource proxy = initSearchProxy("tag", tag, null);

		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoArtefact> list = (List<RepoArtefact>) httpClient
				.getCollection(RepoArtefact.class);
		return list;
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
			return Optional.absent();
		}

		return Optional.fromNullable(file);
	}

	private MultipartBody artefactToMultipart(RepoArtefact artefact) {
		Attachment record = new Attachment("record", MediaType.APPLICATION_XML,
				artefact);
		List<Attachment> attachments = Lists.newArrayList(record);
		RepoContent content = artefact.getContent();
		if ((content != null) && (content instanceof FileContent)) {
			FileContent f = (FileContent) artefact.getContent();
			ContentDisposition cd = new ContentDisposition(
					"attachment;filename=" + f.getFileName() + ";mime-type="
							+ f.getMimeType());
			Attachment file = new Attachment("file-content", f.getContent(), cd);
			attachments.add(file);
		}
		return new MultipartBody(attachments);
	}

	private ArtefactResource initSearchProxy(String type, String name,
			String project) {
		String relativeUrlPath = ArtefactResource.REST_PREFIX + "/search/"
				+ type + "/" + name;
		if (!Strings.isNullOrEmpty(project)) {
			relativeUrlPath = relativeUrlPath + "&project=" + project;
		}
		Class<?> readerType = RepoArtefact.class;

		// This is needed for CXF 2.6.*
		// (see http://cxf.apache.org/docs/jax-rs-client-api.html under
		// "Limitation")
		ResponseReader reader = new ResponseReader();
		reader.setEntityClass(readerType);
		return JAXRSClientFactory.create(client.getConnectionInfo()
				.getBaseURI() + relativeUrlPath, ArtefactResource.class,
				Collections.singletonList(reader));
	}

	private ArtefactResource initProxy() {
		String relativeUrlPath = ArtefactResource.REST_PREFIX;
		Class<?> readerType = RepoArtefact.class;

		// This is needed for CXF 2.6.*
		// (see http://cxf.apache.org/docs/jax-rs-client-api.html under
		// "Limitation")
		ResponseReader reader = new ResponseReader();
		reader.setEntityClass(readerType);

		ArtefactResource proxy = JAXRSClientFactory.create(client
				.getConnectionInfo().getBaseURI() + relativeUrlPath,
				ArtefactResource.class, Collections.singletonList(reader));

		// ClientConfiguration config = WebClient.getConfig(proxy);
		// config.getOutInterceptors().add(new LoggingOutInterceptor());
		// config.getInInterceptors().add(new LoggingInInterceptor());

		return proxy;
	}

	private ArtefactResource initMultipartProxy() {
		String relativeUrlPath = ArtefactResource.REST_PREFIX;
		Class<?> readerType = MultipartBody.class;

		// This is needed for CXF 2.6.*
		// (see http://cxf.apache.org/docs/jax-rs-client-api.html under
		// "Limitation")
		ResponseReader reader = new ResponseReader();
		reader.setEntityClass(readerType);

		ArtefactResource proxy = JAXRSClientFactory.create(client
				.getConnectionInfo().getBaseURI() + relativeUrlPath,
				ArtefactResource.class, Collections.singletonList(reader));

		ClientConfiguration config = WebClient.getConfig(proxy);
		config.getOutInterceptors().add(new LoggingOutInterceptor());
		config.getInInterceptors().add(new LoggingInInterceptor());

		return proxy;
	}
}
