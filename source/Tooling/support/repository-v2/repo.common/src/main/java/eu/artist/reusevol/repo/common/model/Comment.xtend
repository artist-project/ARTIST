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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Date
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrProperty
import org.jcrom.annotations.JcrReference
import org.jcrom.util.PathUtils
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.validator.constraints.NotBlank

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@JcrNode(classNameProperty = "classname", nodeType = "ar:comment")
@Accessors @ToString @EqualsHashCode
class Comment extends BaseEntity {

	@NotBlank
	@JcrProperty
	@JsonProperty
	var String title
	
	@JcrProperty
	@JsonProperty
	var String text
	
	@JcrReference(byPath = true)
	@JsonProperty
	var User author

	@JcrProperty
	@JsonProperty
	var Date date

	@JcrProperty
	@JsonProperty
	var CommentType type

	@JcrProperty
	var String artefactJcrPath
	
	new() {
		this(CommentType.COMMENT, null, null, null)
	}

	new(String title, String text) {
		this(CommentType.COMMENT, null, title, text)
	}

	new(CommentType type, String title, String text) {
		this(type, null, title, text)
	}

	new(CommentType type, User author, String title, String text) {
		super(title)
		setTitle(title)
		this.type = type
		this.text = text
		this.author = author
		this.date = new Date
		this.artefactJcrPath = null;
	}	

	@JsonIgnore
	override getName() {
		id
	}
	
	@JsonIgnore
	override getId() {
		super.id
	}
	
	def setTitle(String title) {
		this.id = if (title != null) PathUtils.createValidName(title) else null
		this.title = title
	}
	
	@JsonIgnore
	override getJcrName() {
		id
	}
	
	static enum CommentType {
		COMMENT, CREATION, UPDATE, VERSION, RATING, DOWNLOAD
	}
}