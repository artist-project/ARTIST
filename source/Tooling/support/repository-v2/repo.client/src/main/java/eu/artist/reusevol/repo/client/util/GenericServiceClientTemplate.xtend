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
 
package eu.artist.reusevol.repo.client.util

import com.google.common.base.Joiner
import com.google.common.base.Optional
import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.GenericType
import com.sun.jersey.api.client.UniformInterfaceException
import eu.artist.reusevol.repo.client.conf.RepositoryClientConfig
import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.model.JcrStorable
import eu.artist.reusevol.repo.common.model.PermissionEntry
import eu.artist.reusevol.repo.common.service.GenericService
import eu.artist.reusevol.repo.common.util.Depth
import io.dropwizard.auth.AuthenticationException
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.util.List
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class GenericServiceClientTemplate<T extends JcrStorable> extends BaseClient implements GenericService<T> {

	val String resource
	val Class<T> typeToken
	val ParameterizedType parameterizedGenericType
	val ParameterizedType parameterizedPermissionType

	new(Client client, RepositoryClientConfig config, String resource, Class<T> dataClass) {
		super(client, config)
		this.resource = resource
		this.typeToken = dataClass
		this.parameterizedGenericType = new ParameterizedType() {
			override Type[] getActualTypeArguments() { return #[typeToken] }
			override Type getRawType() { return List }
			override Type getOwnerType() { return List }
		};
		this.parameterizedPermissionType = new ParameterizedType() {
			override Type[] getActualTypeArguments() { return #[PermissionEntry] }
			override Type getRawType() { return List }
			override Type getOwnerType() { return List }
		};
	}

	override create(T entity) {
		try {
			getSynchronousResource(resource, [it]).post(typeToken, entity)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException('''Invalid entity '«entity.id»'. «ex.message»''')
			}
		}
	}

	override delete(Identifiable id) {
		try {
			val result = getSynchronousResource(Joiner.on("/").join(resource, id.id), [it]).delete(typeToken)
			Optional.of(result)
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				Optional.absent
			}
		}
	}

	override exists(Identifiable id) {
		try {
			getSynchronousResource(Joiner.on("/").join(resource, id.id), [it]).get(typeToken) != null
			true
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				false
			}
		}
	}

	override findAll(Depth depth) {
		try {
			getSynchronousResource(resource, [queryParam("depth", depth.asString)]).get(
				new GenericType<List<T>>(parameterizedGenericType) {
				})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				newArrayList()
			}
		}
	}

	def findAll() {
		findAll(Depth.ENTITY)
	}

	override List<T> findByFiql(String query, Depth depth) {
		try {
			getSynchronousResource(resource, [queryParam("depth", depth.asString).queryParam("query", query)]).get(
				new GenericType<List<T>>(parameterizedGenericType) {})
		} catch (UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException("Error in FIQL expression: " + ex.response.getEntity(String))
			}
		}
	}

	def List<T> findByFiql(String query) {
		findByFiql(query, Depth.ENTITY)
	}
		
	
	override get(Identifiable id, Depth depth) {
		try {
			val result = getSynchronousResource(Joiner.on("/").join(resource, id.id), [ queryParam("depth", depth.asString) ]).get(typeToken)
			Optional.of(result)
		} catch(UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				Optional.absent
			}
		}
	}
	
	def get(Identifiable id) {
		get(id, Depth.ENTITY)
	}
	
	override move(Identifiable sourceId, Identifiable targetId) {
		val entity = get(sourceId, Depth.ENTITY)
		if (entity.isPresent) {
			val toMove = entity.get
			toMove.id = targetId.id
			
			try {
				getSynchronousResource(Joiner.on("/").join(resource, sourceId.id), [ it ]).put(typeToken, toMove)
			} catch(UniformInterfaceException ex) {
				if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
					throw new AuthenticationException(ex.response.getEntity(String))
				}
			}
		}
	}
	
	override update(T entity, Depth depth) {
		try {
			val result = getSynchronousResource(Joiner.on("/").join(resource, entity.id), [ queryParam("depth", depth.asString) ]).put(typeToken, entity)
			Optional.of(result)
		} catch(UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw new IllegalArgumentException('''Invalid entity '«entity.id»'. «ex.message»''')
			}
		}
	}
	
	def update(T entity) {
		update(entity, Depth.ENTITY)
	}
	
	override close() {
		// Do nothing since this is only relevant on the server side
	}
	
	override getPermissions(T entity) {
		try {
			getSynchronousResource(Joiner.on("/").join(resource, entity.id, "permissions"), [ it ]).get(
				new GenericType<List<PermissionEntry>>(parameterizedPermissionType) {}
			)
		} catch(UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw ex
			}
		} catch(Exception ex) {
			throw ex
		}
	}
	
	override setPermissions(T entity, List<PermissionEntry> permissions) {
		try {
			//val result = 
			getSynchronousResource(Joiner.on("/").join(resource, entity.id, "permissions"), [ it ]).put(Response, permissions)
	
//			println(result)		
//			if (result.status != Status.OK) {
				// TODO: handle error
//			}
		} catch(UniformInterfaceException ex) {
			if (ex.response.status == Status.UNAUTHORIZED.statusCode) {
				throw new AuthenticationException(ex.response.getEntity(String))
			} else {
				throw ex
			}
		} catch(Exception ex) {
			throw ex
		}
	}
	
}
