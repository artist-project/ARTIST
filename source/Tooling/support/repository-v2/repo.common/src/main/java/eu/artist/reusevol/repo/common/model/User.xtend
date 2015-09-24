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
 
package eu.artist.reusevol.repo.common.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import java.security.Principal
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrChildNode
import org.jcrom.annotations.JcrName
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrPath
import org.jcrom.annotations.JcrProperty

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@JcrNode(classNameProperty = "classname", nodeType = "ar:user")
class User implements Principal, JcrStorable {
	
	@JsonIgnore
	@JcrPath
	var String jcrPath
	
	@JsonProperty 
	@JcrName 
	var String username
	
	@JsonIgnore 
	@JcrProperty
	var String scimId
	
	@JsonProperty 
	@JcrProperty
	var String realname
	
	@JsonProperty 
	@JcrProperty
	var String email
	
	@JsonIgnore 
	@JcrChildNode
	var List<Group> groups
	
	new() {
		this(null, null, null, null, newArrayList())
	}
	
	new(
		String scimId, 
		String username, 
		String realname,
		String email,
		List<Group> groups
	) {
		this.scimId = scimId
		this.username = username
		this.realname = realname
		this.email = email
		this.groups = groups
	}
	
	@JsonIgnore	
	def getProjects() {
		if (groups != null) return newArrayList()
		groups.filter[ name.startsWith("prj_") ].map[ name.substring(4) ]
	}

	@JsonIgnore	
	override getName() {
		username
	}
	
	override setJcrName(String name) {
		username = name
	}
	
	@JsonIgnore	
	override getJcrName() {
		username
	}
	
	override setId(String id) {
		username = id
	}
	
	@JsonIgnore	
	override getId() {
		username
	}
	
}