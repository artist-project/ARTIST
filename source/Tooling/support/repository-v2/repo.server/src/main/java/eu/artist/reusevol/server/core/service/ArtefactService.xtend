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
import com.google.common.base.Optional
import com.google.common.base.Preconditions
import com.google.common.base.Splitter
import com.google.common.base.Strings
import eu.artist.reusevol.repo.common.access.Permission
import eu.artist.reusevol.repo.common.model.Comment
import eu.artist.reusevol.repo.common.model.Comment.CommentType
import eu.artist.reusevol.repo.common.model.ContentInfo
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.model.Rating
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.RepoPackage
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.model.UserInfo
import eu.artist.reusevol.repo.common.model.VersionInfo
import eu.artist.reusevol.repo.common.service.ArtefactSearchable
import eu.artist.reusevol.repo.common.service.Commentable
import eu.artist.reusevol.repo.common.service.ContentHandler
import eu.artist.reusevol.repo.common.service.ImageHandler
import eu.artist.reusevol.repo.common.service.Rateable
import eu.artist.reusevol.repo.common.service.VersionHandler
import eu.artist.reusevol.repo.common.user.CurrentUserHolder
import eu.artist.reusevol.repo.common.util.ArtefactId
import eu.artist.reusevol.repo.common.util.Depth
import eu.artist.reusevol.repo.common.util.beans.BeanCopyUtil
import eu.artist.reusevol.server.core.GenericDaoTemplate
import eu.artist.reusevol.server.core.GenericServiceTemplate
import eu.artist.reusevol.server.core.dao.ArtefactDao
import eu.artist.reusevol.server.core.dao.CommentDao
import eu.artist.reusevol.server.core.dao.PackageDao
import eu.artist.reusevol.server.core.dao.ProjectDao
import eu.artist.reusevol.server.core.dao.RatingDao
import eu.artist.reusevol.server.core.dao.UserDao
import eu.artist.reusevol.server.core.dao.VersionedArtefactDao
import eu.artist.reusevol.server.core.model.VersionedArtefact
import eu.artist.reusevol.server.core.security.RepoUsers
import eu.artist.reusevol.server.core.security.privileges.PermissionUtils
import java.io.InputStream
import java.util.Date
import java.util.List
import javax.inject.Inject
import javax.inject.Provider
import javax.jcr.RepositoryException
import javax.jcr.security.Privilege
import javax.jcr.version.Version
import javax.jcr.version.VersionHistory
import javax.ws.rs.WebApplicationException
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.apache.cxf.jaxrs.ext.search.SearchParseException
import org.jcrom.JcrDataProviderImpl
import org.jcrom.JcrMappingException
import org.jcrom.util.JcrDataUtils
import org.jcrom.util.NodeFilter
import org.jcrom.util.PathUtils

class ArtefactService extends GenericServiceTemplate<RepoArtefact> implements 
	ContentHandler, VersionHandler, Commentable, Rateable, ImageHandler, ArtefactSearchable {

	private static val VERSION_ROOT_NODE = "versioned"
	public static val COMMENT_ROOT_NODE = "comments"
	public static val RATING_ROOT_NODE = "ratings"

	val Provider<PackageDao> packageProvider
	val Provider<VersionedArtefactDao> versionProvider
	val Provider<CommentDao> commentProvider
	val Provider<RatingDao> ratingProvider
	
	val CategoryService categoryService
	
	var GenericDaoTemplate<RepoPackage> packageInstance
	var GenericDaoTemplate<VersionedArtefact> versionInstance
	var GenericDaoTemplate<Comment> commentInstance
	var GenericDaoTemplate<Rating> ratingInstance

	var String projectId
	
	@Inject
	new(
		Provider<ArtefactDao> dao, 
		Provider<PackageDao> packageProvider, 
		Provider<VersionedArtefactDao> versionProvider,
		Provider<CommentDao> commentProvider,
		Provider<RatingDao> ratingProvider,
		CategoryService categoryService
	) {
		super(dao)
		this.packageProvider = packageProvider
		this.versionProvider = versionProvider
		this.commentProvider = commentProvider
		this.ratingProvider = ratingProvider
		this.categoryService = categoryService
		this.packageInstance = null
		this.versionInstance = null
		this.commentInstance = null
		this.ratingInstance = null
	}

	def void setProjectId(String projectId) {
		this.projectId = projectId
	}
	
	override getDao() {
		val d = super.getDao()
		(d as ArtefactDao).projectId = projectId
		d
	}

	def getPackages() {
		if (packageInstance == null) {
			packageInstance = packageProvider.get	
		}
		packageInstance
	}

	def getVersions() {
		if (versionInstance == null) versionInstance = versionProvider.get
		versionInstance
	}
	
	def getCommentDao() {
		if (commentInstance == null) commentInstance = commentProvider.get
		commentInstance
	}
	
	def getRatingDao() {
		if (ratingInstance == null) ratingInstance = ratingProvider.get
		ratingInstance
	}
	
	override protected postProcess(RepoArtefact entity) {
		if (entity.content != null) {
			val content = entity.content
			val contentLength = if (content.dataProvider != null) content.dataProvider.contentLength else 0
			entity.contentInfo = new ContentInfo(content.name, content.mimeType, content.encoding, content.lastModified.time, contentLength)
		}

		if (entity.image != null) {
			val image = entity.image
			val imageLength = if (image.dataProvider != null) image.dataProvider.contentLength else 0
			entity.imageInfo = new ContentInfo(image.name, image.mimeType, null, image.lastModified.time, imageLength)
		}
		
		if (entity instanceof VersionedArtefact) {
			entity.versionInfo = if (entity.version != null) {
				new VersionInfo(entity.id, entity.version.substring(2), entity.commitMessage, entity.commiter, entity.versionCreated)
			} else {
				new VersionInfo(entity.id, "HEAD", null, null, null)
			}
		}
		
		if (entity.publisher != null) {
			entity.publisher.jcrPath = null
		}
		
		if (entity.modifier != null) {
			entity.modifier.jcrPath = null
		}
		
		if (dao.exists(entity.id.toJcrRatingParentPath)) {
			entity.rating = getRating(entity)
		}
		
		entity
	}

	override RepoArtefact create(RepoArtefact entity) {
		logger.debug("Creating aretefact '{}'", entity?.id)
		Preconditions.checkNotNull(entity)
		Preconditions.checkNotNull(entity.id)

		createPackage(entity.id)

		// Update metadata
		val currentUser = loggedInUser
		entity.publisher = if (currentUser.present) new UserInfo(currentUser.get.username, currentUser.get.realname) else null
		entity.publishedOn = new Date()
		entity.modifier = entity.publisher
		entity.lastModified = entity.publishedOn
		entity.project = (dao as ArtefactDao).projectId

		// Set the path of the type entry to make storage as by-path-reference possible
		if (entity.type != null) {
			entity.type.jcrPath = categoryService.toJcrPath(entity.type.id)
		}
		
		val result = super.create(entity)
	
		// Set default permissions	
		if (currentUser.present) {
			val jcrPath = result.id.toJcrPath
			val permissions = PermissionUtils.getInheritedPermissions(dao.session, jcrPath)
			
			val userPermission = new PermissionEntry(currentUser.get.username, Permission.MANAGE)
			val groupPermission = new PermissionEntry("prj_" + entity.project, Permission.VIEW)
			val adminPermission = new PermissionEntry(RepoUsers.ADMIN_USER.username, Permission.MANAGE)
			permissions.addAll(#[groupPermission, userPermission, adminPermission])
			
			if (result.project.equals("public")) {
				permissions.add(new PermissionEntry(RepoUsers.ANONYMOUS_USER.username, Permission.VIEW))
			}
			
	    	setPermissions(jcrPath, permissions)
		}
		
		createCommentRootNode(entity)
		createRatingRootNode(entity)
		
		// Add creation comment
		if (currentUser.present) {
			addComment(result, new Comment(CommentType.CREATION, currentUser.get, "Artefact created", null))
		}
			
		result
	}

	override update(RepoArtefact entity, Depth depth) {
		Preconditions.checkNotNull(entity)
		
		val currentUser = loggedInUser
		entity.modifier = if (currentUser.present) new UserInfo(currentUser.get.username, currentUser.get.realname) else null
		entity.lastModified = new Date()
		entity.project = (dao as ArtefactDao).projectId
		
		val result = super.update(entity, depth)

		// Add update comment
		if (currentUser.present) {
			addComment(entity, new Comment(CommentType.UPDATE, currentUser.get, "Artefact updated", null))
		}
		
		result
	}

	override get(Identifiable id, Depth depth) {
		logger.debug("Getting artefact '{}' with depth {}", id?.id, depth)
		
		val aid = new ArtefactId(id.id)

		switch (aid.versionName) {
			case "HEAD":
				super.get(id, depth)
			case "NEWEST": {
				val version = getNewestVersionNumber(id);
				if (version == -1) {
					// If there was no version yet, return HEAD
					super.get(id, depth)
				} else {
					getVersionedArtefact(id, version, depth)
				}
			}
			default: {
				getVersionedArtefact(id, new Long(aid.versionName), depth)
			}
		}
	}

	override delete(Identifiable id) {
		logger.debug("Deleting aretefact '{}'", id?.id)

		// Remove versioning information
		val versionedPath = id.id.toJcrVersionPath
		if (versions.exists(versionedPath)) {
			try {
				val history = versions.session.workspace.versionManager.getVersionHistory(versionedPath)
				deleteVersionHistory(history)
			} catch (RepositoryException e) {
				logger.info("Error deleting version history of artefact {}", id)
			}
			versions.remove(versionedPath)
		}

		val result = super.delete(id)

		deleteEmptyPackage(id)

		result
	}

	override findAll(Depth depth) {
		Preconditions.checkNotNull(depth)

		logger.debug("Getting all entities from {}", basePath)
		val result = dao.findBySql('''SELECT * FROM [ar:artefact] WHERE [classname] = 'eu.artist.reusevol.repo.common.model.RepoArtefact' AND ISDESCENDANTNODE(['«basePath»'])''',
			depth.get)
			
		result.map[ postProcess(it) ]
	}

	// Content handling

	override getContent(Identifiable id) {
		logger.debug("Getting content for artefact {}", id.id)
		
		val artefact = get(id, Depth.CHILDREN)

		// Add download comment
		val currentUser = loggedInUser
		if (currentUser.present) {
			addComment(id, new Comment(CommentType.DOWNLOAD, currentUser.get, "Artefact downloaded", null))
		}
		
		if (artefact.present) {
			artefact.get.content?.dataProvider?.inputStream
		}
	}
	
	override setContent(Identifiable id, InputStream content, String filename, String mimetype, String encoding) {
		logger.debug("Setting content for artefact {}", id.id)
		
		val artefact = get(id, Depth.CHILDREN)

		if (artefact.present) {
			val file = if (Strings.isNullOrEmpty(mimetype)) {
				JcrDataUtils.fromInputStream(filename, content)
			} else {
				JcrDataUtils.fromInputStream(filename, content, mimetype)
			}
			file.encoding = encoding
			
			val entity = artefact.get	
			entity.content = file
			update(entity, Depth.CHILDREN)
		}		
	}

	override clearContent(Identifiable id) {
		val artefact = get(id, Depth.CHILDREN)

		if (artefact.present) {
			val entity = artefact.get	
			entity.content = null
			update(entity, Depth.CHILDREN)
		}
	}
	
	// Versioning

	override List<VersionInfo> listVersions(Identifiable artefactId) {
		Preconditions.checkNotNull(artefactId)

		val path = artefactId.id.toJcrVersionPath
		if (versions.exists(path)) {
			versions.getVersionList(path).map[
				postProcess(it).versionInfo 
			]
		} else {
			newArrayList()
		}
	}

	override Optional<VersionInfo> createVersion(Identifiable artefactId, String message) {
		Preconditions.checkNotNull(artefactId)

		val artefact = get(artefactId, Depth.ALL)

		if (artefact.isPresent()) {
			val original = artefact.get()
			val versionedPath = artefactId.id.toJcrVersionPath

			var result = if (versions.exists(versionedPath)) {
					updateVersionedArtefact(original, versionedPath, message);
				} else {
					createVersionedArtefact(original, message);
				}

			// Add update comment
			val currentUser = loggedInUser
			if (currentUser.present) {
				addComment(artefactId, new Comment(CommentType.VERSION, currentUser.get, 
					"Version " + result.versionInfo.version + " created", null))
			}
				
			Optional.of(result.versionInfo)
		} else {
			Optional.absent
		}
	}

	private def RepoArtefact createVersionedArtefact(RepoArtefact original, String message) {
		val aid = ArtefactId.of(original.id, "0")

		val working = new VersionedArtefact(original) => [
			jcrPath = original.id.toJcrVersionParentPath
			jcrName = original.jcrName
			id = aid.get
			commitMessage = message
			commiter = dao.session.userID
			// This is necessary to copy the artefact content via the stream from the data provider
			if (original.content != null)
				content.dataProvider = new JcrDataProviderImpl(original.content.dataProvider.inputStream)
			if (original.image != null)
				image.dataProvider = new JcrDataProviderImpl(original.image.dataProvider.inputStream)
		]

		createVersioningRootNode(original)
		
		versions.create(working)
		
		postProcess(versions.get(working.jcrPath))
	}

	private def RepoArtefact updateVersionedArtefact(RepoArtefact original, String versionedPath, String message) {

		val working = versions.get(versionedPath)

		BeanCopyUtil.copyProperties(original, working)
		working => [
			jcrPath = versionedPath
			jcrName = original.jcrName
			commitMessage = message
			commiter = dao.session.userID
			// This is necessary to copy the artefact content via the stream from the data provider
			if (original.content != null)
				content.dataProvider = new JcrDataProviderImpl(original.content.dataProvider.inputStream)
			if (original.image != null)
				image.dataProvider = new JcrDataProviderImpl(original.image.dataProvider.inputStream)
		]
		val aid = ArtefactId.of(original.id, working.version.substring(2))
		working.id = aid.increaseVersion.get

		versions.update(working, Depth.ALL.get)
		
		postProcess(versions.get(working.jcrPath))
	}

	private def void createPackage(String id) {
		val packagePath = toJcrPackagePath(id)

		if (!packages.exists(packagePath)) {
			val packageId = getPackageId(id)
			val entity = new RepoPackage(packageId, packageId)

			entity.jcrName = packageId
			entity.jcrPath = toJcrPackageParentPath(id)

			logger.debug("Creating intermediate package {}", entity)
			packages.create(entity)
		}
	}

	private def deleteVersionHistory(VersionHistory versionHistory) throws RepositoryException {

		versionHistory.allVersions.forEach [
			val currentVersion = it as Version
			val versionName = currentVersion.name
			if (!versionName.equals("jcr:rootVersion") && currentVersion.references.size == 0) {
				versionHistory.removeVersion(versionName)
				logger.debug("Removing version: {}", versionName)
			}
		]
	}

	private def deleteEmptyPackage(Identifiable artefactId) {
		val packagePath = artefactId.id.toJcrPackagePath
		val pkg = packages.get(packagePath, Depth.CHILDREN.get)
		if ((pkg != null) && pkg.artefacts.empty) {
			packages.remove(packagePath)
		}
	}

	private def long getNewestVersionNumber(Identifiable id) {
		val path = id.id.toJcrVersionPath

		if (!versions.exists(path))
			return -1;

		val numberOfVersions = versions.getVersionSize(path)
		return numberOfVersions - 1
	}

	private def String convertToJctVersionName(long version) {
		return "1." + (new Long(version)).toString
	}

	private def Optional<RepoArtefact> getVersionedArtefact(Identifiable artefactId, long version, Depth depth) {
		val versionedPath = artefactId.id.toJcrVersionPath
		
		try {
			val result = versions.getVersion(versionedPath, convertToJctVersionName(version), depth.get)
			Optional.of(postProcess(result))			
		} catch(JcrMappingException ex) {
			Optional.absent
		}
	}

	override void addComment(Identifiable artefactId, Comment comment) {
		Preconditions.checkNotNull(comment)
		
		val currentUser = loggedInUser
		if (!currentUser.present) {
			logger.warn("Unauthorized user tries to post a comment. Ignoring it.")
			return
		}
		
		val user = currentUser.get 
		
		logger.debug("Creating comment '{}' for user {}", comment.title, user.username)
		
		comment.jcrPath = artefactId.id.toJcrCommentParentPath
		comment.artefactJcrPath = artefactId.id.toJcrPath
		comment.author = user
		commentDao.create(comment)
	}
	
	override List<Comment> getComments(Identifiable artefactId) {
		commentDao.findAll(artefactId.id.toJcrCommentParentPath, new NodeFilter(Depth.ALL.depth)).sortWith[ a, b | 
			switch(a) {
				case a.date.before(b.date): -1
				case a.date.equals(b.date): 0
				case a.date.after((b.date)): 1
				default: 0
			}
		]
	}

	override void setRating(Identifiable id, Rating rating) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(rating)
		
		val currentUser = loggedInUser
		if (!currentUser.present) {
			logger.warn("Unauthorized user tries to post a rating. Ignoring it.")
			return
		}
		val user = currentUser.get 
		
		logger.debug("Rating '{}' created for user {}", rating.rating, user.username)
		
		val parentPath = id.id.toJcrRatingParentPath
		val path = id.id.toJcrRatingPath(user.username)

		rating.username = user.username
		rating.date = new Date		
		if (ratingDao.exists(path)) {
			rating.jcrPath = path
			ratingDao.update(rating)
		} else {
			rating.jcrPath = parentPath
			ratingDao.create(rating)
		}
		
		// Update avg-rating in artefact
		val artefact = get(id, Depth.ENTITY).get
		val r = getAvgRating(id, rating)
		artefact.averageRating = new Double(r.averageRating)
		update(artefact, Depth.ENTITY)

		// Add download comment
		if (currentUser.present) {
			addComment(id, new Comment(CommentType.RATING, currentUser.get, "Artefact rated", null))
		}
	}
	
	override Rating getRating(Identifiable id) {
		Preconditions.checkNotNull(id)
		
		val currentUser = loggedInUser
		
		val result = if (currentUser.present) {
			val user = currentUser.get
			val rating = ratingDao.get(id.id.toJcrRatingPath(user.username))
			if (rating != null) {
				rating
			} else {
				new Rating(user.username, 0)
			}
		} else {
			new Rating(null, 0)
		}
		
		// Cannot get avg rating from artefact here because of loop with postProcess
		// => Need to recompute
		getAvgRating(id, result)
	}
	
	def Rating getAvgRating(Identifiable id, Rating r) {
		Preconditions.checkNotNull(id)
		
		val ratings = ratingDao.findAll(id.id.toJcrRatingParentPath, new NodeFilter(Depth.ENTITY.depth))
		val sum = ratings.map[ rating ].reduce[ a, b | a + b ]
		
		r.averageRating = if (ratings.empty) {
			0
		} else {
			sum / ratings.size
		}
		r.sampleSize = ratings.size
		
		r
	}

	private def Optional<User> getLoggedInUser() {
		val currentUser = CurrentUserHolder.currentUser.get
		if (currentUser == null) {
			Optional.absent
		} else {
			currentUser.jcrName = PathUtils.createValidName(currentUser.username) 
			currentUser.jcrPath = Joiner.on("/").join(UserDao.BASE, currentUser.jcrName)
			Optional.of(currentUser) 
		}
	}
	
	private def void createVersioningRootNode(Identifiable artefact) {
		val path = artefact.id.toJcrVersionParentPath
		versions.createPathNodes(path)
	}
	
	private def void createCommentRootNode(Identifiable artefact) {
		val path = artefact.id.toJcrCommentParentPath
		commentDao.createPathNodes(path)
	}
	
	private def void createRatingRootNode(Identifiable artefact) {
		val path = artefact.id.toJcrRatingParentPath
		ratingDao.createPathNodes(path)
	}
	
	protected def toJcrPackageParentPath(String id) {
		Joiner.on("/").join(basePath, "packages")
	}

	protected def toJcrPackagePath(String id) {
		Joiner.on("/").join(toJcrPackageParentPath(id), getPackageId(id))
	}

	protected override toJcrParentPath(String id) {
		Joiner.on("/").join(toJcrPackagePath(id), "artefacts")
	}

	protected override toJcrPath(String id) {
		Joiner.on("/").join(toJcrParentPath(id), getArtefactId(id))
	}

	protected def toJcrVersionParentPath(String id) {
		Joiner.on("/").join(toJcrPath(id), VERSION_ROOT_NODE)
	}

	protected def toJcrVersionPath(String id) {
		Joiner.on("/").join(toJcrVersionParentPath(id), getArtefactId(id))
	}

	protected def toJcrCommentParentPath(String id) {
		Joiner.on("/").join(toJcrPath(id), COMMENT_ROOT_NODE)
	}

	protected def toJcrCommentPath(String id, String title) {
		val commentId = PathUtils.createValidName(title)
		Joiner.on("/").join(toJcrCommentParentPath(id), commentId)
	}

	protected def toJcrRatingParentPath(String id) {
		Joiner.on("/").join(toJcrPath(id), RATING_ROOT_NODE)
	}

	protected def toJcrRatingPath(String id, String username) {
		val ratingId = PathUtils.createValidName(username)
		Joiner.on("/").join(toJcrRatingParentPath(id), ratingId)
	}

	protected override toJcrName(String id) {
		Splitter.on(":").split(id).get(1)
	}

	private def getArtefactId(String id) {
		Splitter.on(":").split(id).get(1)
	}

	private def getPackageId(String id) {
		Splitter.on(":").split(id).get(0)
	}
	
	// Image handling
	override getImage(Identifiable id) {
		logger.debug("Getting image for artefact {}", id.id)
		
		val artefact = get(id, Depth.CHILDREN)
		
		if (artefact.present) {
			artefact.get.image?.dataProvider?.inputStream
		}
	}
	
	override setImage(Identifiable id, InputStream content, String filename, String mimetype) {
		logger.debug("Setting image for artefact {}", id.id)
		
		val artefact = get(id, Depth.CHILDREN)

		if (artefact.present) {
			val file = if (Strings.isNullOrEmpty(mimetype)) {
				JcrDataUtils.fromInputStream(filename, content)
			} else {
				JcrDataUtils.fromInputStream(filename, content, mimetype)
			}
			
			val entity = artefact.get
			entity.image = file
			update(entity, Depth.CHILDREN)
		}	
	}
	
	override clearImage(Identifiable id) {
		val artefact = get(id, Depth.CHILDREN)

		if (artefact.present) {
			val entity = artefact.get	
			entity.content = null
			update(entity, Depth.CHILDREN)
		}
	}
	
	override findByFiqlInAllProjects(String fiqlQuery, Depth depth) {
		Preconditions.checkNotNull(fiqlQuery)
		Preconditions.checkNotNull(depth)

        try {
            val String queryString = constructJCRSQL2QueryString(fiqlQuery, ProjectDao.BASE);
            
			logger.debug("Getting all entities that match the query {}", queryString)		
			dao.findBySql(queryString, depth.get).map[ postProcess(it) ]		
        } catch (SearchParseException e) {
            logger.info("Error parsing FIQL query '" + fiqlQuery + "'.", e);
            throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(e.message).build)
        }
	}
	
	override findInAllProjects(Depth depth) {
				Preconditions.checkNotNull(depth)
		logger.debug("Getting all entities from {}", ProjectDao.BASE)
		val result = dao.findBySql('''SELECT * FROM [ar:artefact] WHERE [classname] = 'eu.artist.reusevol.repo.common.model.RepoArtefact' AND ISDESCENDANTNODE(['«ProjectDao.BASE»'])''',
			depth.get)
			
		result.map[ postProcess(it) ]
	}
	
	override findInAllProjects(Permission permission, Depth depth) {
		logger.debug("Getting all entities with permission {} from {}", permission, ProjectDao.BASE)
		
		val requiredPrivilege = switch(permission) {
			case Permission.NONE: Privilege.JCR_READ // This should never happen since ths case is filtered out in SearchResource
			case Permission.VIEW: Privilege.JCR_READ
			case Permission.MODIFY: Privilege.JCR_WRITE
			case Permission.MANAGE: Privilege.JCR_MODIFY_ACCESS_CONTROL
		}
		
		val acm = dao.session.accessControlManager
		val result = findInAllProjects(depth).filter[ 
			val hasAccess = acm.hasPrivileges(jcrPath, PermissionUtils.convertPrivStringsToObj(dao.session, #[requiredPrivilege]))
			logger.debug("Principal {} permitted on {}: {}", dao.session.userID, it.id, hasAccess)
			hasAccess
		].toList
		
		result
	}
	
	override findByFiqlInAllProjects(String fiqlQuery, Permission permission, Depth depth) {
		logger.debug("Getting all entities with permission {} from {}", permission, ProjectDao.BASE)
		
		val requiredPrivilege = switch(permission) {
			case Permission.NONE: Privilege.JCR_READ // This should never happen since ths case is filtered out in SearchResource
			case Permission.VIEW: Privilege.JCR_READ
			case Permission.MODIFY: Privilege.JCR_WRITE
			case Permission.MANAGE: Privilege.JCR_MODIFY_ACCESS_CONTROL
		}
		
		val acm = dao.session.accessControlManager
		val result = findByFiqlInAllProjects(fiqlQuery, depth).filter[ 
			val hasAccess = acm.hasPrivileges(jcrPath, PermissionUtils.convertPrivStringsToObj(dao.session, #[requiredPrivilege]))
			logger.debug("Principal {} permitted on {}: {}", dao.session.userID, it.id, hasAccess)
			hasAccess
		].toList
		
		result
	}
	
}
