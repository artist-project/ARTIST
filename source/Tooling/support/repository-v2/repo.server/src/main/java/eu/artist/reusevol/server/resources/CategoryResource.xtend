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

import eu.artist.reusevol.repo.common.model.RepoCategory
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.GenericResourceTemplate
import eu.artist.reusevol.server.core.service.CategoryService
import eu.artist.reusevol.server.util.IdParam
import javax.inject.Inject
import javax.inject.Provider
import javax.ws.rs.Path

@Path(CategoryResource.BASE)
class CategoryResource extends GenericResourceTemplate<RepoCategory, IdParam, CategoryService> {
	
	public static val BASE = RepositoryService.API_BASE + "/categories"
	
	@Inject
	new(Provider<CategoryService> serviceProvider) {
		super(serviceProvider)
	}
}