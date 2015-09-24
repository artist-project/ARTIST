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
 
package eu.artist.reusevol.server.core.service

import com.google.common.base.Joiner
import com.google.common.base.Preconditions
import com.google.common.base.Splitter
import eu.artist.reusevol.repo.common.model.RepoCategory
import eu.artist.reusevol.server.core.GenericServiceTemplate
import eu.artist.reusevol.server.core.dao.CategoryDao
import javax.inject.Inject
import javax.inject.Provider

class CategoryService extends GenericServiceTemplate<RepoCategory> {

	private static val SPACER = "/categories/"

	@Inject
	new(Provider<CategoryDao> dao) {
		super(dao)
	}

	override RepoCategory create(RepoCategory entity) {
		Preconditions.checkNotNull(entity)

		entity.jcrPath = entity.id.toJcrParentPath

		createParentEntities(entity.id)
		logger.debug("Creating entity {}", entity)
		val result = dao.create(entity)
		
		entity.jcrPath = null
		
		result
	}
	
	private def void createParentEntities(String id) {
		val segments = Splitter.on(".").omitEmptyStrings.split(id)
		var jcrParentPath = basePath + "/" 
		var String eid = null
		
		for(String segment : segments.take(segments.size - 1)) {
			val jcrPath = jcrParentPath + segment
			eid = Joiner.on(".").skipNulls.join(eid, segment)
			
			if (!dao.exists(jcrPath)) {
				val entity = new RepoCategory(eid, segment, null)
				entity.jcrName = segment
				entity.jcrPath = jcrParentPath
				logger.debug("Creating intermediate category {}", entity)
				dao.create(entity)
			}
			
			jcrParentPath = jcrPath + SPACER
			dao.createPathNodes(jcrParentPath)
		}
	}

	public override toJcrPath(String id) {
		val segments = Splitter.on(".").omitEmptyStrings.split(id)
		basePath + "/" + Joiner.on(SPACER).join(segments)
	}

	protected override toJcrParentPath(String id) {
		val segments = Splitter.on("/").omitEmptyStrings.split(id.toJcrPath)
		"/" + Joiner.on("/").join(segments.take(segments.size - 1))
	}

	protected override toJcrName(String id) {
		Splitter.on(".").omitEmptyStrings.split(id).last
	}

}
