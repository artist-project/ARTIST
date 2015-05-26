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
 
package eu.artist.reusevol.repo.client

import com.google.common.base.Joiner
import com.google.common.base.Optional
import com.google.common.base.Preconditions
import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.GenericType
import com.sun.jersey.api.client.UniformInterfaceException
import com.sun.jersey.core.util.MultivaluedMapImpl
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.client.util.GenericServiceClientTemplate
import eu.artist.reusevol.repo.common.model.Comment
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.Rating
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.model.VersionInfo
import eu.artist.reusevol.repo.common.service.ArtefactSearchable
import eu.artist.reusevol.repo.common.service.Commentable
import eu.artist.reusevol.repo.common.service.ContentHandler
import eu.artist.reusevol.repo.common.service.ImageHandler
import eu.artist.reusevol.repo.common.service.Rateable
import eu.artist.reusevol.repo.common.service.VersionHandler
import eu.artist.reusevol.repo.common.util.ArtefactId
import eu.artist.reusevol.repo.common.util.Depth
import io.dropwizard.auth.AuthenticationException
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.List
import javax.ws.rs.core.Response.Status
import eu.artist.reusevol.repo.common.access.Permission

class ArtefactManager extends GenericServiceClientTemplate<RepoArtefact> 
	implements ContentHandler, VersionHandler, Commentable, Rateable, 
	ImageHandler, ArtefactSearchable {

	new(Client client, RepositoryClientConfig config, String projectId) {
		super(client, config, "/artefacts/" + projectId, RepoArtefact)
	}

	def delete(String sid) {
		delete(ArtefactId.of(sid))
	}

	def exists(String sid) {
		exists(ArtefactId.of(sid))
	}

	def get(String sid, Depth depth) {
		get(ArtefactId.of(sid), depth)
	}
	
	def get(String sid) {
		get(ArtefactId.of(sid), Depth.ENTITY)
	}
	
	def move(String sourceId, String targetId) {
		move(ArtefactId.of(sourceId), ArtefactId.of(targetId))
	}

	override getContent(Identifiable id) {
		Preconditions.checkNotNull(id)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "content"), [ it ]).get(InputStream)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		}
	}
	
	def getContent(String id) {
		getContent(ArtefactId.of(id))
	}

	override setContent(Identifiable id, InputStream content, String filename, String mimetype, String encoding) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(content)
		
		val params = new MultivaluedMapImpl
		if (filename != null) params.add("filename", filename)
		if (mimetype != null) params.add("mimetype", mimetype)
		if (encoding != null) params.add("encoding", encoding)
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "content"), [ 
				it.queryParams(params)				
			]).post(InputStream, content)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		} finally {
			if (content != null) {
				content.close
			}
		}
	}

	def setContent(String id, InputStream content, String filename, String mimetype, String encoding) {
		setContent(ArtefactId.of(id), content, filename, mimetype, encoding)		
	}

	def void setContent(Identifiable id, File file, String mimetype, String encoding) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(file)

		setContent(id, new FileInputStream(file), file.name, mimetype, encoding)
	}
	
	def void setContent(String id, File file, String mimetype, String encoding) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(file)

		setContent(id, new FileInputStream(file), file.name, mimetype, encoding)
	}
	
	override clearContent(Identifiable id) {
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "content"), [ it ]).delete()
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} 
		}
	}
	
	def clearContent(String id) {
		clearContent(ArtefactId.of(id))
	}

	override listVersions(Identifiable id) {
		Preconditions.checkNotNull(id)
		val returnType = new ParameterizedType() {
	        override Type[] getActualTypeArguments() { return #[VersionInfo] }
	        override Type getRawType() { return List }
	        override Type getOwnerType() { return List }
	    }
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "versions"), [ 
				it
			]).get(new GenericType<List<VersionInfo>>(returnType) { })
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException(ex.message)
			}
		}
	}
	
	def listVersions(String id) {
		listVersions(ArtefactId.of(id))
	}
	
	override createVersion(Identifiable id, String msg) {
		Preconditions.checkNotNull(id)

		try {
			val result = getSynchronousResource(Joiner.on("/").join(resource, id.id, "versions"), [ 
				queryParam("msg", msg)
			]).post(VersionInfo)
			Optional.of(result)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException(ex.message)
			}
		}
	}
	
	def createVersion(String id, String msg) {
		createVersion(ArtefactId.of(id), msg)
	}

	def void addComment(String id, String title, String text) {
		addComment(ArtefactId.of(id), new Comment(title, text))
	}
	
	override void addComment(Identifiable id, Comment comment) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(comment)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "comments"), [ 
				it
			]).post(Comment, comment)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		}
	}

	def getComments(String artefactId) {
		getComments(ArtefactId.of(artefactId))
	}
	
	override getComments(Identifiable artefactId) {
		Preconditions.checkNotNull(artefactId)
		val returnType = new ParameterizedType() {
	        override Type[] getActualTypeArguments() { return #[Comment] }
	        override Type getRawType() { return List }
	        override Type getOwnerType() { return List }
	    }
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, artefactId.id, "comments"), [ 
				it
			]).get(new GenericType<List<Comment>>(returnType) { })
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException(ex.message)
			}
		}
	}

	override void setRating(Identifiable id, Rating rating) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(rating)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "rating"), [ 
				it
			]).post(Rating, rating)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		}
	}

	
	override Rating getRating(Identifiable id) {
		Preconditions.checkNotNull(id)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "rating"), [ 
				it
			]).get(Rating)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		}
	}
	
	override getImage(Identifiable id) {
		Preconditions.checkNotNull(id)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "image"), [ it ]).get(InputStream)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		}
	}
	
	def getImage(String id) {
		getImage(ArtefactId.of(id))
	}
	
	override clearImage(Identifiable id) {
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "image"), [ it ]).delete()
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} 
		}
	}

	def clearImage(String id) {
		clearImage(ArtefactId.of(id))
	}

	override setImage(Identifiable id, InputStream content, String filename, String mimetype) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(content)
		
		val params = new MultivaluedMapImpl
		if (filename != null) params.add("filename", filename)
		if (mimetype != null) params.add("mimetype", mimetype)
		
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id, "image"), [ 
				it.queryParams(params)				
			]).post(InputStream, content)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IOException(ex.message)
			}
		} finally {
			if (content != null) {
				content.close
			}
		}
	}
	
	def void setImage(String id, InputStream content, String filename, String mimetype) {
		setImage(ArtefactId.of(id), content, filename, mimetype)		
	}

	def void setImage(Identifiable id, File file, String mimetype) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(file)

		setImage(id, new FileInputStream(file), file.name, mimetype)
	}
	
	def void setImage(String id, File file, String mimetype) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(file)

		setImage(id, new FileInputStream(file), file.name, mimetype)
	}
	
	override findInAllProjects(Depth depth) {
		try {
			getSynchronousResource("/search", [
				queryParam("depth", depth.asString)
			]).get(
				new GenericType<List<RepoArtefact>>(parameterizedGenericType) {})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException("Error in FIQL expression: " + ex.response.getEntity(String))
			}
		}
	}
	
	override findByFiqlInAllProjects(String fiqlQuery, Depth depth) {
		try {
			getSynchronousResource("/search", [
				queryParam("depth", depth.asString).queryParam("query", fiqlQuery)
			]).get(
				new GenericType<List<RepoArtefact>>(parameterizedGenericType) {})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException("Error in FIQL expression: " + ex.response.getEntity(String))
			}
		}
	}
	
	override findInAllProjects(Permission permission, Depth depth) {
		try {
			getSynchronousResource("/search", [
				queryParam("depth", depth.asString).queryParam("permission", permission.toString)
			]).get(
				new GenericType<List<RepoArtefact>>(parameterizedGenericType) {})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException("Error in FIQL expression: " + ex.response.getEntity(String))
			}
		}
	}
	
	override findByFiqlInAllProjects(String fiqlQuery, Permission permission, Depth depth) {
		try {
			getSynchronousResource("/search", [
				queryParam("depth", depth.asString).queryParam("query", fiqlQuery).queryParam("permission", permission.toString)
			]).get(
				new GenericType<List<RepoArtefact>>(parameterizedGenericType) {})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException("Error in FIQL expression: " + ex.response.getEntity(String))
			}
		}
	}
	
}
