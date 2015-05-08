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
import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.rest.CategoryResource;
import eu.artist.reusevol.repo.common.service.CategoryService;
import eu.artist.reusevol.repo.common.util.CategoryName;

// TODO: Proper error handling
public class CategoryManager implements CategoryService {

	private final RepositoryClient client;

	/**
	 * @param client
	 */
	public CategoryManager(RepositoryClient client) {
		this.client = client;
	}

	@Override
	public Optional<RepoCategory> getShallow(CategoryName categoryPath) {
		return getCategoryWithMode(categoryPath, "shallow");
	}

	@Override
	public Optional<RepoCategory> get(CategoryName categoryPath) {
		return getCategoryWithMode(categoryPath, "full");
	}

	@Override
	public Optional<RepoCategory> getTree(CategoryName categoryPath) {
		return getCategoryWithMode(categoryPath, "tree");
	}

	private Optional<RepoCategory> getCategoryWithMode(
			CategoryName categoryPath, String mode) {
		CategoryResource proxy = initProxy("/categories", RepoCategory.class);
		Response response = proxy.get(categoryPath.asUri(), mode);

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			RepoCategory entity = (RepoCategory) response.getEntity();
			return Optional.fromNullable(entity);
		} else if (response.getStatus() == Response.Status.BAD_REQUEST
				.getStatusCode()) {
			throw new IllegalArgumentException("Unknown mode.");
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException("Category not found.");
		}

		return Optional.absent();
	}

	@Override
	public List<RepoArtefact> getArtefactsIn(CategoryName categoryPath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RepoCategory create(CategoryName categoryPath, String name,
			String description) {
		CategoryResource proxy = initProxy("/categories", RepoCategory.class);
		Response response = proxy.create(categoryPath.asUri(), name,
				description);

		if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
			RepoCategory entity = (RepoCategory) response.getEntity();
			return entity;
		} else if (response.getStatus() == Response.Status.NOT_FOUND
				.getStatusCode()) {
			throw new NoSuchEntityException("Category not found.");
		}

		return null;
	}

	@Override
	public void update(RepoCategory updatedCategory) {
		CategoryResource proxy = initProxy("/categories", RepoCategory.class);
		CategoryName path = CategoryName.of(updatedCategory.getId());
		Response response = proxy.update(path.asUri(),
				updatedCategory.getLabel(), updatedCategory.getDescription());

		if (response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
			throw new NoSuchEntityException("Category not found.");
		}
	}

	@Override
	public void delete(RepoCategory categoryToDelete) {
		deleteWithMode(categoryToDelete, "false");
	}

	@Override
	public void forceDelete(RepoCategory categoryToDelete) {
		deleteWithMode(categoryToDelete, "true");
	}

	private void deleteWithMode(RepoCategory categoryToDelete,
			String forceDelete) {
		CategoryResource proxy = initProxy("/categories", RepoCategory.class);
		CategoryName path = CategoryName.of(categoryToDelete.getId());
		Response response = proxy.delete(path.asUri(), forceDelete);

		if (response.getStatus() == Response.Status.NOT_FOUND.getStatusCode()) {
			throw new NoSuchEntityException("Category not found.");
		} else if (response.getStatus() == Response.Status.PRECONDITION_FAILED
				.getStatusCode()) {
			throw new IllegalStateException(
					"Can not delete Category which has sub-categories or assigned Artefacts.");
		}
	}

	@Override
	public void associateArtefact(RepoCategory category, RepoArtefact artefact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disAssociateArtefact(RepoCategory category,
			RepoArtefact artefact) {
		// TODO Auto-generated method stub

	}

	private CategoryResource initProxy(String relativeUrlPath,
			Class<?> readerType) {
		// This is needed for CXF 2.6.*
		// (see http://cxf.apache.org/docs/jax-rs-client-api.html under
		// "Limitation")
		ResponseReader reader = new ResponseReader();
		reader.setEntityClass(readerType);

		CategoryResource proxy = JAXRSClientFactory.create(client
				.getConnectionInfo().getBaseURI() + relativeUrlPath,
				CategoryResource.class, Collections.singletonList(reader));

		ClientConfiguration config = WebClient.getConfig(proxy);
		config.getOutInterceptors().add(new LoggingOutInterceptor());
		config.getInInterceptors().add(new LoggingInInterceptor());

		return proxy;
	}
}
