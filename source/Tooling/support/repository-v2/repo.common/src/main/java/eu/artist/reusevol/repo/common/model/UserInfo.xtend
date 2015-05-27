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
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrPath
import org.jcrom.annotations.JcrProperty
import org.jcrom.annotations.JcrName

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@JcrNode(classNameProperty = "classname", nodeType = "ar:userinfo")
class UserInfo {
	
	@JsonIgnore
	@JcrPath
	var String jcrPath
	
	@JsonProperty
	@JcrName
	var String username
	
	@JsonProperty
	@JcrProperty
	var String realname
	
	new() {
		this.username = null
		this.realname = null 
	}
	
	new(String username, String realname) {
		this.username = username
		this.realname = realname
	}
}