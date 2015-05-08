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

import java.util.Collections;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ResponseReader;
import org.apache.cxf.jaxrs.client.WebClient;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.rest.ProjectResource;
import eu.artist.reusevol.repo.common.service.ProjectService;
import eu.artist.reusevol.repo.common.util.ProjectName;

public class ProjectManager implements ProjectService {

	private final RepositoryClient client;

	/**
	 * @param client
	 */
	public ProjectManager(RepositoryClient client) {
		this.client = client;
	}

	@Override
	public RepoProject create(ProjectName projectId, String name,
			String description) {
		ProjectResource proxy = initProxy("/projects", RepoProject.class);
		Response response = proxy
				.create(projectId.getName(), name, description);

		if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			RepoProject entity = (RepoProject) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException("Project not found.");
		}

		return null;
	}

	@Override
	public Optional<RepoProject> getShallow(ProjectName projectId) {
		return getProjectWithMode(projectId, "shallow");
	}

	@Override
	public Optional<RepoProject> get(ProjectName projectId) {
		return getProjectWithMode(projectId, "full");
	}

	@Override
	public Optional<RepoProject> getTree(ProjectName projectId) {
		return getProjectWithMode(projectId, "tree");
	}

	private Optional<RepoProject> getProjectWithMode(ProjectName projectId,
			String mode) {
		ProjectResource proxy = initProxy("/projects", RepoProject.class);
		Response response = proxy.read(projectId.getName(), mode);

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			RepoProject entity = (RepoProject) response.getEntity();
			return Optional.fromNullable(entity);
		} else if (response.getStatus() == Response.Status.BAD_REQUEST
				.getStatusCode()) {
			throw new IllegalArgumentException("Unknown mode.");
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			return Optional.absent();
		}

		return Optional.absent();
	}

	@Override
	public RepoProject update(ProjectName projectId, String name,
			String description) {
		ProjectResource proxy = initProxy("/projects", RepoProject.class);
		Response response = proxy
				.update(projectId.getName(), name, description);

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			RepoProject entity = (RepoProject) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException("Project not found.");
		}

		return null;
	}

	@Override
	public void delete(RepoProject project) {
		deleteWithMode(project, "false");
	}

	@Override
	public void forceDelete(RepoProject project) {
		deleteWithMode(project, "true");
	}

	private void deleteWithMode(RepoProject project, String forceDelete) {
		ProjectResource proxy = initProxy("/projects", RepoProject.class);
		Response response = proxy.delete(project.getId(), forceDelete);

		if (response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
			throw new NoSuchEntityException("Project not found.");
		} else if (response.getStatus() == Response.Status.PRECONDITION_FAILED
				.getStatusCode()) {
			throw new IllegalStateException(
					"Can not delete project which contains packages or assigned Artefacts.");
		}
	}

	@Override
	public List<RepoProject> findAllProjects() {
		ProjectResource proxy = initProxy("/projects", RepoProject.class);
		WebClient httpClient = WebClient.fromClient(WebClient.client(proxy));
		@SuppressWarnings("unchecked")
		List<RepoProject> list = (List<RepoProject>) httpClient
				.getCollection(RepoProject.class);
		return list;
	}

	private ProjectResource initProxy(String relativeUrlPath,
			Class<?> readerType) {
		// This is needed for CXF 2.6.*
		// (see http://cxf.apache.org/docs/jax-rs-client-api.html under
		// "Limitation")
		ResponseReader reader = new ResponseReader();
		reader.setEntityClass(readerType);

		ProjectResource proxy = JAXRSClientFactory.create(client
				.getConnectionInfo().getBaseURI() + relativeUrlPath,
				ProjectResource.class, Collections.singletonList(reader));

		ClientConfiguration config = WebClient.getConfig(proxy);
		config.getOutInterceptors().add(new LoggingOutInterceptor());
		config.getInInterceptors().add(new LoggingInInterceptor());

		return proxy;
	}
}
