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
 
package eu.artist.reusevol.repo.client.wso2.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.base.Optional
import java.lang.reflect.ParameterizedType
import java.net.URL
import java.util.Date
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import eu.artist.reusevol.repo.common.model.User
import eu.artist.reusevol.repo.common.model.Group
import com.google.common.base.Splitter

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimList<T> {
	public static val USER_TYPE = new ParameterizedType() {
		override getActualTypeArguments() { #[ScimUser] }
		override getRawType() { ScimList }
		override getOwnerType() { ScimList }
	}
	
	public static val GROUP_TYPE = new ParameterizedType() {
		override getActualTypeArguments() { #[ScimGroup] }
		override getRawType() { ScimList }
		override getOwnerType() { ScimList }
	}

	@JsonProperty("schemas")
	var List<String> schemas

	@JsonProperty("totalResults")
	var Long resultCount

	@JsonProperty("Resources")
	var List<T> resources
}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimEntity {
	
	new() {
		this.scimId = null
		this.meta = null
	}
	
	@JsonProperty("id")
	var String scimId

	@JsonProperty("meta")
	var ScimMeta meta
}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimUser extends ScimEntity {
	
	public static def of(User user) {
		val nameSegments = Splitter.on(" ").split(user.realname)
		val fn = if (nameSegments.size > 0) nameSegments.get(0) else null
		val ln = if (nameSegments.size > 1) nameSegments.get(1) else null
		new ScimUser(user.username, null, fn, ln)
	}
	
	new(String username, String password, String firstName, String lastname) {
		super()
		this.username = username
		this.password = password
		this.name = new ScimName(firstName, lastname)
	}

	new(String username, String password) {
		this(username, password, null, null)
	}

	new(String username) {
		this(username, null, null, null)
	}

	new() {
		this(null, null, null, null)
	}

	@JsonProperty("userName")
	var String username

	@JsonProperty("password")
	var String password

	@JsonProperty("groups")
	var List<ScimIdAndName> groups

	@JsonProperty("name")
	var ScimName name

	@JsonProperty("emails")
	var List<String> emails

	def User toUser() {
		new User(
			scimId, 
			username, 
			name?.givenName + " " + name?.familyName, 
			emails?.head, 
			groups.map[ new Group(it.name) ]
		)		
	}
}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonInclude(Include.NON_NULL)
class ScimGroup extends ScimEntity {

	new(String name, List<ScimIdAndName> members) {
		super()
		this.name = name
		this.users = members
	}

	new(String name) {
		this(name, null)
	}

	new() {
		this(null, null)
	}

	@JsonProperty("displayName")
	var String name

	@JsonProperty("members")
	var List<ScimIdAndName> users

}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimName {
	
	new(String firstname, String lastname) {
		this.givenName = firstname
		this.familyName = lastname
	}
	
	new() {
		this(null, null)
	}

	@JsonProperty("familyName")
	var String familyName

	@JsonProperty("givenName")
	var String givenName

}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimMeta {

	@JsonProperty("lastModified")
	var Date lastModified

	@JsonProperty("created")
	var Date created

	@JsonProperty("location")
	var URL location

}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimIdAndName {
	
	new(String id, String name) {
		this.id = id
		this.name = name
	}
	
	new(String name) {
		this(null, name)
	}
	
	new() {
		this(null, null)
	}

	@JsonProperty("value")
	var String id

	@JsonProperty("display")
	var String name

}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimEMail {
	
	new(String email) {
		this.email = email
		this.type = null
		this.primary = true
	}
	
	new() {
		this(null)
	}

	@JsonProperty("value")
	var String email

	@JsonProperty("type")
	var Optional<String> type

	@JsonProperty("primary")
	var boolean primary
}

@Accessors @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimError {

	@JsonProperty("Errors")
	var List<ScimErrorMessage> errors
	
	override toString() {
		'''Error «errors.head.code»: «errors.head.message»'''
	}
}

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
class ScimErrorMessage {
	
	new(Integer code, String message) {
		this.code = code
		this.message = message
	}

	new() {
		this(null,null)
	}
	
	@JsonProperty("code")
	var Integer code

	@JsonProperty("description")
	var String message
}

