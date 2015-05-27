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

import com.google.common.collect.HashMultiset
import com.google.common.collect.Multiset
import eu.artist.reusevol.repo.common.model.Statistics
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.server.RepositoryService
import eu.artist.reusevol.server.core.dao.ArtefactDao
import eu.artist.reusevol.server.core.dao.CommentDao
import eu.artist.reusevol.server.core.dao.RatingDao
import javax.inject.Inject
import javax.jcr.query.Query
import javax.jcr.query.QueryResult
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path(RepositoryService.API_BASE + "/stats")
@Produces(MediaType.APPLICATION_JSON)
class StatisticsResource {

//	private static val logger = LoggerFactory.getLogger(StatisticsResource)
	
	val ArtefactDao artefactDao
	val CommentDao commentDao
	val RatingDao ratingDao
	
	@Inject
	new(ArtefactDao artefactDao, CommentDao commentDao, RatingDao ratingDao) {
		this.artefactDao = artefactDao
		this.commentDao = commentDao
		this.ratingDao = ratingDao
	}
	
	@GET
	def Statistics getStats() {
		val stats = new Statistics
		
		val artefacts = artefactDao.findBySql("SELECT [label], [tags], [categories] FROM [ar:artefact] WHERE [classname]='eu.artist.reusevol.repo.common.model.RepoArtefact'", Depth.CHILDREN.get)
		val comments = commentDao.findBySql("SELECT * FROM [ar:comment]", Depth.ENTITY.get)
		val ratings = ratingDao.findBySql("SELECT * FROM [ar:rating]", Depth.ENTITY.get)
		
		stats.artefactsCount = artefacts.size
		stats.commentCount = comments.filter[ type == "COMMENT" ].size
		stats.downloadCount = comments.filter[ type == "DOWNLOAD" ].size
		stats.ratingsCount = executeQuery("SELECT [jcr:path] FROM [ar:rating]").rows.toList.size

		val Multiset<Integer> ratingsHistogram = HashMultiset.create(ratings.map[ it.rating ])
		stats.ratingDistribtion = newArrayList(0, 0, 0, 0, 0, 0)
		ratingsHistogram.entrySet.forEach[ stats.ratingDistribtion.set(element, count) ]
				
		val Multiset<String> tagsHistogram = HashMultiset.create(artefacts.map[ tags ].flatten)
		stats.topTags = newArrayList()
		tagsHistogram.entrySet.toList.sortWith[ a,b | b.count <=> a.count ].take(6).forEach[ stats.topTags.add(new Pair<String,Integer>(element, count))]
		
		val Multiset<String> categoryHistogram = HashMultiset.create(artefacts.map[ categories ].flatten)
		stats.topCategories = newArrayList()
		categoryHistogram.entrySet.toList.sortWith[ a,b | b.count <=> a.count ].take(6).forEach[ stats.topCategories.add(new Pair<String,Integer>(element, count))]

		return stats	
	}
	
	def QueryResult executeQuery(String expression) {
		val queryManager = artefactDao.session.workspace.queryManager
 		val query = queryManager.createQuery(expression, Query.JCR_SQL2)
		query.execute()
	}


}