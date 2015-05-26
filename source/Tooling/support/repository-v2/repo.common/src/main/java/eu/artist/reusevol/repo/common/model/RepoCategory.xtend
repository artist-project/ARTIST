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

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.base.Splitter
import eu.artist.reusevol.repo.common.util.Id
import eu.artist.reusevol.repo.common.util.Visitor
import java.util.List
import javax.validation.constraints.Pattern
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlElementWrapper
import javax.xml.bind.annotation.XmlRootElement
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrChildNode
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrProperty

@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname", nodeType = "ar:category", mixinTypes = "mix:referenceable" )
@Accessors @ToString @EqualsHashCode
class RepoCategory extends BaseEntity {
	
	@JcrProperty
	@JsonProperty
	@XmlAttribute
	var String label
	
	@JcrProperty
	@JsonProperty
	@XmlElement
	var String description
	
	@JcrChildNode
	@JsonProperty("sub-categories")
	@XmlElementWrapper(name = "sub-categories")
	@XmlElement(name = "category")
	var List<RepoCategory> categories

	new() {
		this(null, null, null)
	}

	new(String categoryId) {
		this(categoryId, null, null)
	}

	new(String categoryId, String label) {
		this(categoryId, label, null)
	}

	new(String categoryId, String label, String description) {
		super(categoryId)
		this.label = label
		this.description = description
		this.categories = newArrayList()
	}
	
	new(RepoCategory other) {
		super(other.id)
		this.label = other.label
		this.description = other.description
		this.categories = newArrayList(other.categories)
	}
	
	@Pattern(regexp=Id.ACCEPT_PATTERN)
	override getId() {
		super.getId()
	}
	
	override protected getNameFromId(String id) {
		if (id != null)
			Splitter.on(".").omitEmptyStrings.split(id).last
		else
			null
	}

	override accept(Visitor visitor) {
		visitor.visit(this)
		categories.forEach[ visitor.visit(this) ]
	}
	
	override accept((BaseEntity)=>Void function) {
		function.apply(this)
		categories.forEach[ function.apply(this) ]
	}		
	
}