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
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import eu.artist.reusevol.repo.common.access.Permission
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString

@Accessors @ToString @EqualsHashCode
@JsonPropertyOrder( #[ "principal" , "permission" ] )
class PermissionEntry {
	
	@JsonProperty("principal")
	val String principalName
	
	@JsonProperty("permission")
	val Permission permission
	
	@JsonCreator
	new(
		@JsonProperty("principal") String principalName,
		@JsonProperty("permission") Permission permission
	) {
		this.principalName = principalName
		this.permission = permission
	}
}
