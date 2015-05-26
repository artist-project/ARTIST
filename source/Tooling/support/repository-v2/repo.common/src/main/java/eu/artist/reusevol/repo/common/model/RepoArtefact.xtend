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
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import eu.artist.reusevol.repo.common.util.ArtefactId
import eu.artist.reusevol.repo.common.util.beans.BeanCopyUtil
import java.util.Date
import java.util.List
import javax.xml.bind.annotation.XmlAttribute
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.JcrFile
import org.jcrom.annotations.JcrChildNode
import org.jcrom.annotations.JcrFileNode
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrProperty
import org.jcrom.annotations.JcrReference

@JcrNode(classNameProperty="classname", nodeType="ar:artefact")
@JsonPropertyOrder("id", "label", "description", "tags", "categories", "project", "packageId", 
	"publisher", "published-on", "modifier", "last-modified", "content-info", "image-info", "version-info")
@Accessors @ToString @EqualsHashCode
class RepoArtefact extends BaseEntity {

	@JcrProperty
	@JsonProperty
	var String packageId

	@JcrProperty
	@JsonProperty
	var String label

	@JcrProperty
	@JsonProperty
	var String description

	@JcrProperty
	@JsonProperty("tags")
	var List<String> tags

	@JcrProperty
	@JsonProperty("categories")
	var List<String> categories

	@JcrFileNode
	@JsonIgnore
	var JcrFile content

	@JcrFileNode
	@JsonIgnore
	var JcrFile image

	@JsonProperty("version-info")
	var VersionInfo versionInfo
	
	@JsonProperty("content-info")
	var ContentInfo contentInfo

	@JsonProperty("image-info")
	var ContentInfo imageInfo

	@JsonProperty("rating")
	var Rating rating

	@JsonProperty("publisher")
	@JcrChildNode
	var UserInfo publisher

	@JsonProperty("published-on")
	@JcrProperty
	var Date publishedOn

	@JsonProperty("modifier")
	@JcrChildNode
	var UserInfo modifier

	@JsonProperty("last-modified")
	@JcrProperty
	var Date lastModified

	@JsonProperty("type")
	@JcrReference(byPath=true)
	var RepoCategory type

	@JsonProperty("project")
	@JcrProperty
	var String project

	@JsonProperty("average-rating")
	@JcrProperty
	var Double averageRating

	new() {
		this(null, null, null)
	}

	new(String artefactId) {
		this(artefactId, null, null)
	}

	new(String artefactId, String label) {
		this(artefactId, label, null)
	}

	new(String artefactId, String label, String description) {
		super(artefactId)
		this.label = label
		this.description = description
		this.tags = newArrayList()
		this.categories = newArrayList()
		if (artefactId != null) {
			this.setId(artefactId)
		} else {
			this.packageId = null
		}
		this.content = null
		this.image = null

		this.versionInfo = null
		this.contentInfo = null
		
		this.publisher = null
		this.publishedOn = null
		this.modifier = null
		this.lastModified = null
		this.averageRating = 0.0
	}

	new(RepoArtefact other) {
		this()
		BeanCopyUtil.copyProperties(other, this)
	}

	@JsonProperty
	@XmlAttribute
	override setId(String id) {
		if (id != null) {
			val aid = ArtefactId.of(id)
			super.setId(aid.id)
			this.packageId = aid.packageName
		} else {
			super.setId(null)
			this.packageId = null
		}
	}

	override protected getNameFromId(String id) {
		if (id != null) {
			val aid = ArtefactId.of(id)
			aid.artefactName
		} else {
			null
		}
	}
	
}
