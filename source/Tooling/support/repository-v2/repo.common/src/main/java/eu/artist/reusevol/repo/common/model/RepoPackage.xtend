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

@XmlRootElement(name = "package")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname", nodeType = "ar:package")
@Accessors @ToString @EqualsHashCode
class RepoPackage extends BaseEntity {
	
	@JcrProperty
	@JsonProperty
	@XmlAttribute
	var String label
	
	@JcrProperty
	@JsonProperty
	@XmlElement
	var String description
	
	@JcrChildNode
	@JsonProperty("artefacts")
	@XmlElementWrapper(name = "artefacts")
	@XmlElement(name = "artefact")
	var List<RepoArtefact> artefacts
	
	new() {
		this(null, null, null)
	}

	new(String packageId) {
		this(packageId, null, null)
	}

	new(String packageId, String label) {
		this(packageId, label, null)
	}

	new(String packageId, String label, String description) {
		super(packageId)
		this.label = label
		this.description = description
		this.artefacts = newArrayList()
	}
	
	new(RepoPackage other) {
		super(other.id)
		this.label = other.label
		this.description = other.description
		this.artefacts = newArrayList(other.artefacts)
	}
	
	@Pattern(regexp=Id.ACCEPT_PATTERN)
	override getId() {
		super.getId()
	}

	override accept(Visitor visitor) {
		visitor.visit(this)
		artefacts.forEach[ visitor.visit(this) ]
	}
	
	override accept((BaseEntity)=>Void function) {
		function.apply(this)
		artefacts.forEach[ function.apply(this) ]
	}	
}