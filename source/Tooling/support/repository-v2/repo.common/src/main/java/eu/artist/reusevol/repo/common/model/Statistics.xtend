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
import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
@Accessors @ToString @EqualsHashCode
class Statistics {
	@JsonProperty
	var int artefactsCount
	@JsonProperty
	var int ratingsCount
	@JsonProperty
	var int downloadCount
	@JsonProperty
	var int commentCount
	
	@JsonProperty
	var int artefactsLastMonth
	@JsonProperty
	var int ratingsLastMonth
	@JsonProperty
	var int downloadLastMonth
	@JsonProperty
	var int commentLastMonth
	
	@JsonProperty
	var List<Integer> ratingDistribtion
	
	@JsonProperty
	var List<Pair<String, Integer>> topTags

	@JsonProperty
	var List<Pair<String, Integer>> topCategories
}