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

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;

import com.google.common.base.Optional;

import eu.artist.reusevol.repo.common.exceptions.NoSuchEntityException;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.util.CategoryName;

@Path("categories")
public class CategoryResourceImpl implements CategoryResource {

	private static final Logger LOGGER = Logger
			.getLogger(CategoryResource.class);

	@Inject
	private CategoryService categoryService;

	@Context
	private UriInfo uriInfo;

	@Override
	public Response get(String categoryPath, String mode) {
		LOGGER.debug(String.format("R: Getting category at %s with mode=%s.",
				categoryPath, mode));
		CategoryName path = CategoryName.ofUri(categoryPath);

		Optional<RepoCategory> result = null;
		if (mode.equalsIgnoreCase("shallow")) {
			result = categoryService.getShallow(path);
		} else if (mode.equalsIgnoreCase("full")) {
			result = categoryService.get(path);
		} else if (mode.equalsIgnoreCase("tree")) {
			result = categoryService.getTree(path);
		} else {
			return Response.status(Response.Status.BAD_REQUEST)
					.entity("Mode '" + mode + "' is not supported.").build();
		}

		if (result.isPresent()) {
			return Response.ok(result.get()).build();
		} else {
			return Response.status(Status.NOT_FOUND)
					.entity("Category not found.").build();
		}
	}

	@Override
	public Response create(String categoryPath, String name, String description) {
		LOGGER.debug(String.format(
				"R: Creating category at %s with name=%s and description=%s.",
				categoryPath, name, description));
		CategoryName path = CategoryName.ofUri(categoryPath);

		try {
			RepoCategory result = categoryService.create(path, name,
					description);
			return Response
					.created(
							uriInfo.getAbsolutePathBuilder()
									.build(path.asUri())).entity(result)
					.build();
		} catch (NoSuchEntityException ex) {
			return Response.status(Status.NOT_FOUND).entity(ex.getMessage())
					.build();
		}
	}

	@Override
	public Response update(String categoryPath, String label, String description) {
		LOGGER.debug(String.format(
				"R: Updating category at %s with name=%s and description=%s.",
				categoryPath, label, description));
		CategoryName path = CategoryName.ofUri(categoryPath);

		Optional<RepoCategory> orig = categoryService.getShallow(path);
		if (orig.isPresent()) {
			RepoCategory result = orig.get();

			if (result.getLabel().equals(label)
					&& result.getDescription().equals(description)) {
				return Response.notModified().build();
			}

			result.setLabel(label);
			result.setDescription(description);

			try {
				categoryService.update(result);
				return Response.ok(result).build();
			} catch (NoSuchEntityException ex) {
				return Response.status(Status.NOT_FOUND)
						.entity(ex.getMessage()).build();
			}
		} else {
			return Response.status(Status.NOT_FOUND)
					.entity("Category not found.").build();
		}
	}

	@Override
	public Response delete(String categoryPath, String mode) {
		LOGGER.debug(String.format("R: Deleting category at %s with mode=%s.",
				categoryPath, mode));
		CategoryName path = CategoryName.ofUri(categoryPath);

		Optional<RepoCategory> categoryToDelete = categoryService.get(path);

		if (!categoryToDelete.isPresent()) {
			return Response.status(Status.NOT_FOUND).build();
		}

		try {
			if (mode.equalsIgnoreCase("true")) {
				categoryService.forceDelete(categoryToDelete.get());
			} else {
				categoryService.delete(categoryToDelete.get());
			}

			return Response.ok().build();
		} catch (NoSuchEntityException ex) {
			return Response.status(Status.NOT_FOUND).entity(ex.getMessage())
					.build();
		} catch (IllegalStateException ex) {
			return Response.status(Status.PRECONDITION_FAILED)
					.entity(ex.getMessage()).build();
		}

	}
}
