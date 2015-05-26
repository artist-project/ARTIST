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
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrName
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrPath
import org.jcrom.annotations.JcrProperty
import java.util.Date

@Accessors @ToString @EqualsHashCode
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@JcrNode(classNameProperty = "classname", nodeType = "ar:rating")
class Rating implements JcrStorable {
	public static val MIN = 0
	public static val MAX = 5
	
	@JsonIgnore
	@JcrPath
	var String jcrPath

	@JsonIgnore
	@JcrName
	var String username
	
	@JsonProperty
	@JcrProperty
	@Min(MIN)
	@Max(MAX)
	var int rating
	
	@JsonProperty
	@JcrProperty
	var Date date
	
	@JsonProperty
	var float averageRating
	
	@JsonProperty
	var long sampleSize
	
	new(String username, int rating) {
		this.username = username
		this.rating = rating
		this.sampleSize = 0
		this.averageRating = 0.0f
		this.date = new Date
	}

	new() {
		this(null, 0)
	}
	
	override setJcrName(String name) {
		this.username = name
	}
	
	@JsonIgnore
	override getJcrName() {
		username
	}
	
	override setId(String id) {
		this.username = id
	}
	
	@JsonIgnore
	override getId() {
		username
	}
	
}