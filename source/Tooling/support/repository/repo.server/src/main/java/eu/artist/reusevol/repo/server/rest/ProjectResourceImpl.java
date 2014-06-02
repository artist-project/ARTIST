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

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.rest.ProjectResource;
import eu.artist.reusevol.repo.common.util.ProjectName;
import eu.artist.reusevol.repo.server.service.ProjectServiceImpl;

@Path("/projects")
public class ProjectResourceImpl implements ProjectResource {

	@Inject
	private ProjectServiceImpl service;

	@Context
	private UriInfo ctx;

	private static final Logger LOGGER = Logger
			.getLogger(ProjectResourceImpl.class);

	@Override
	public Response create(String projectId, String name, String description) {
		LOGGER.debug("R: Creating project: " + projectId);

		Preconditions.checkNotNull(projectId);

		RepoProject result = service.create(ProjectName.of(projectId), name,
				description);

		URI location = ctx.getBaseUriBuilder().path(result.getId()).build();
		return Response.status(Status.CREATED).contentLocation(location)
				.entity(result).build();
	}

	@Override
	public Response read(String projectId, String mode) {
		LOGGER.debug("Reading project: " + projectId);

		Preconditions.checkNotNull(projectId);
		Preconditions.checkArgument(mode.equalsIgnoreCase("shallow")
				|| mode.equalsIgnoreCase("full")
				|| mode.equalsIgnoreCase("tree"));

		Optional<RepoProject> project = null;
		if (mode.equalsIgnoreCase("shallow")) {
			project = service.getShallow(ProjectName.of(projectId));
		} else if (mode.equalsIgnoreCase("full")) {
			project = service.get(ProjectName.of(projectId));
		} else if (mode.equalsIgnoreCase("tree")) {
			project = service.getTree(ProjectName.of(projectId));
		} else {
			return Response.status(Status.BAD_REQUEST).build();
		}

		if (project.isPresent()) {
			return Response.ok(project.get()).build();
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@Override
	public Response update(String projectId, String name, String description) {
		LOGGER.debug("Updating project: " + projectId);

		Preconditions.checkNotNull(projectId);

		try {
			RepoProject result = service.update(ProjectName.of(projectId),
					name, description);
			return Response.ok(result).build();
		} catch (NoSuchEntityException ex) {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@Override
	public Response delete(String projectId, String force) {
		LOGGER.debug("Deleting project: " + projectId);

		Preconditions.checkNotNull(projectId);

		Optional<RepoProject> project = service.getShallow(ProjectName
				.of(projectId));

		if (project.isPresent()) {
			try {
				if (force.equalsIgnoreCase("force")) {
					service.forceDelete(project.get());
				} else {
					service.delete(project.get());
				}
				return Response.ok().build();
			} catch (IllegalStateException ex) {
				return Response.status(Status.PRECONDITION_FAILED).build();
			} catch (NoSuchEntityException ex) {
				return Response.status(Status.NOT_FOUND).build();
			}
		} else {
			return Response.status(Status.NOT_FOUND).build();
		}
	}

	@Override
	public Response list() {
		LOGGER.debug("List projects");

		List<RepoProject> list = service.findAllProjects();
		final GenericEntity<List<RepoProject>> entity = new GenericEntity<List<RepoProject>>(
				list) {
		};
		return Response.ok(entity).build();
	}
}
