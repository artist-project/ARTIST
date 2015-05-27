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
 
package eu.artist.reusevol.server.core.model

import com.fasterxml.jackson.annotation.JsonIgnore
import eu.artist.reusevol.repo.common.model.RepoArtefact
import eu.artist.reusevol.repo.common.util.beans.BeanCopyUtil
import java.util.Date
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import org.jcrom.annotations.JcrNode
import org.jcrom.annotations.JcrProperty
import org.jcrom.annotations.JcrVersionCreated
import org.jcrom.annotations.JcrVersionName

@XmlRootElement(name = "artefact")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname", nodeType = "ar:artefact", mixinTypes = #["mix:versionable"])
@Accessors @ToString @EqualsHashCode
class VersionedArtefact extends RepoArtefact {
	
	@JcrVersionName
	@JsonIgnore
	var String version

	@JcrVersionCreated
	@JsonIgnore
	var Date versionCreated

	@JcrProperty
	@JsonIgnore
	var String commitMessage

	@JcrProperty
	@JsonIgnore
	var String commiter
	
	public new() {
		super()
	}
	
	public new(RepoArtefact other) {
		this()
		BeanCopyUtil.copyProperties(other, this)
	}

	def RepoArtefact copyToArtefact() {
		val target = new RepoArtefact
		BeanCopyUtil.copyProperties(this, target)
		// Reset the id and name from artefactId, because it's "jcr:frozenNode" when
		// retrieved from a version.
		target.setId(id)
		return target
	}
}