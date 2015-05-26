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
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import eu.artist.reusevol.repo.common.util.Id
import eu.artist.reusevol.repo.common.util.Visitable
import eu.artist.reusevol.repo.common.util.Visitor
import javax.validation.constraints.Pattern
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute
import javax.xml.bind.annotation.XmlRootElement
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.hibernate.validator.constraints.NotEmpty
import org.jcrom.annotations.JcrName
import org.jcrom.annotations.JcrPath
import org.jcrom.annotations.JcrProperty

@XmlRootElement(name = "entity")
@XmlAccessorType(XmlAccessType.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Accessors @ToString @EqualsHashCode
class BaseEntity implements JcrStorable, Visitable {
	
	@JsonIgnore
	@JcrName
	@Pattern(regexp=Id.ACCEPT_PATTERN)
	var String jcrName
	
	@JsonIgnore
	@JcrPath
	var String jcrPath
	
	@NotEmpty
	@JcrProperty
	var String id
	
	new() {
		this.jcrName = null
		this.jcrPath = null
		this.id = null
	}

	new(String id) {
		this()
		this.id = id
		this.jcrName = getNameFromId(id)
	}
	
	@JsonIgnore
	def String getName() {
		getNameFromId(id)
	}
	
	@JsonProperty
	@XmlAttribute
	override String getId() {
		this.id
	}
	
	@JsonProperty
	@XmlAttribute
	override void setId(String id) {
		this.id = id
		this.jcrName = getNameFromId(id)
	}
	
	protected def String getNameFromId(String id) {
		id
	}
	
	override accept(Visitor visitor) {
		visitor.visit(this)
	}
	
	override accept((BaseEntity)=>Void function) {
		function.apply(this)
	}
	
}