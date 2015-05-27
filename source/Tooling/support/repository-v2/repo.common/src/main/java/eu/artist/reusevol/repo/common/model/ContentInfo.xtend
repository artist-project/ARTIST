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

import java.util.Date
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

@Accessors @ToString @EqualsHashCode
class ContentInfo {
	val String filename
	val String mimeType
	val String encoding
	val Date lastModified
	val long size
	
	var String link
	
	@JsonCreator
	new(@JsonProperty("filename") String filename, 
		@JsonProperty("mime-type") String mimeType, 
		@JsonProperty("encoding") String encoding, 
		@JsonProperty("last-modified") Date lastModified,
		@JsonProperty("size") long size
	) {
		this.filename = filename
		this.mimeType = mimeType
		this.encoding = encoding
		this.lastModified = lastModified
		this.size = size
		this.link = null
	}
}