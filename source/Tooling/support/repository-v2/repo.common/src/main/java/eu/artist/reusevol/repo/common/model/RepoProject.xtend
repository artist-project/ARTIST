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
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import eu.artist.reusevol.repo.common.util.Id
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
import eu.artist.reusevol.repo.common.util.Visitor

@XmlRootElement(name = "project")
@XmlAccessorType(XmlAccessType.NONE)
@JsonPropertyOrder("id", "label", "description", "packages")
@JcrNode(classNameProperty = "classname", nodeType = "ar:project")
@Accessors @ToString @EqualsHashCode
class RepoProject extends BaseEntity {
	
	@JcrProperty
	@JsonProperty
	@XmlAttribute
	var String label
	
	@JcrProperty
	@JsonProperty
	@XmlElement
	var String description
	
	@JcrChildNode
	@JsonProperty("packages")
	@XmlElementWrapper(name = "packages")
	@XmlElement(name = "package")
	var List<RepoPackage> packages
	
	new() {
		this(null, null, null)
	}

	new(String projectName) {
		this(projectName, null, null)
	}

	new(String projectName, String label) {
		this(projectName, label, null)
	}

	new(String projectName, String label, String description) {
		super(projectName)
		this.label = label
		this.description = description
		this.packages = newArrayList()
	}
	
	new(RepoProject other) {
		super(other.id)
		this.label = other.label
		this.description = other.description
		this.packages = newArrayList(other.packages)
	}
	
	@Pattern(regexp=Id.ACCEPT_PATTERN)
	override getId() {
		super.getId()
	}
	
	override accept(Visitor visitor) {
		visitor.visit(this)
		packages.forEach[ visitor.visit(this) ]
	}
	
	override accept((BaseEntity)=>Void function) {
		function.apply(this)
		packages.forEach[ function.apply(this) ]
	}
	
}