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

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Date
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString

@Accessors @ToString @EqualsHashCode
class VersionInfo {
	val String version
	val String artefactId
	val String committer
	val String commitMessage
	val Date versionCreated

	@JsonCreator
	public new(@JsonProperty("id") String artefactId, 
		@JsonProperty("version") String version, 
		@JsonProperty("commit-message") String commitMessage, 
		@JsonProperty("commiter") String committer, 
		@JsonProperty("version-created") Date versionCreated
	) {
		this.artefactId = artefactId
		this.version = version
		this.commitMessage = commitMessage
		this.committer = committer
		this.versionCreated = versionCreated
	}
}