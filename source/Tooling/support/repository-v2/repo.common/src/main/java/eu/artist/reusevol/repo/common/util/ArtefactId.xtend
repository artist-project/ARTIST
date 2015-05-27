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
 
package eu.artist.reusevol.repo.common.util

import com.google.common.base.Joiner
import com.google.common.base.Preconditions
import com.google.common.base.Splitter
import eu.artist.reusevol.repo.common.model.Identifiable
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString

@Accessors @ToString @EqualsHashCode
class ArtefactId extends ValidatedId<String> implements Identifiable {
	
	public static final val SEPARATOR = ":"
	
	var String packageName
	var String artefactName
	var VersionId versionId
	
	public static def of(String input) {
		new ArtefactId(input)
	}

	public static def of(String packageName, String artefactName) {
		Preconditions.checkNotNull(packageName)
		Preconditions.checkNotNull(artefactName)

		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(packageName, artefactName))
	}
	
	public static def of(String packageName, String artefactName, VersionId versionId) {
		Preconditions.checkNotNull(packageName)
		Preconditions.checkNotNull(artefactName)
		Preconditions.checkNotNull(versionId)
		
		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(packageName, artefactName, versionId.get))
	}
	
	public static def of(String packageName, String artefactName, String version) {
		Preconditions.checkNotNull(packageName)
		Preconditions.checkNotNull(artefactName)
		Preconditions.checkNotNull(version)
		
		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(packageName, artefactName, version))
	}
	
	public static def of(ArtefactId id, String version) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(id.packageName)
		Preconditions.checkNotNull(id.artefactName)
		Preconditions.checkNotNull(version)
		
		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(id.packageName, id.artefactName, version))
	}
	
	public static def of(Identifiable id, VersionId versionId) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(versionId)
		
		val aid = ArtefactId.of(id.id) 
		
		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(aid.packageName, aid.artefactName, versionId.get))
	}
	
	public static def of(Identifiable id, String version) {
		Preconditions.checkNotNull(id)
		Preconditions.checkNotNull(version)
		
		val aid = ArtefactId.of(id.id) 
		
		new ArtefactId(Joiner.on(SEPARATOR).skipNulls.join(aid.packageName, aid.artefactName, version))
	}
	
	public new(String input) {
		super(input)
	}

/*
	override String errorMessage(String input, Exception e) {
		'''"«input»" is not a valid artefact id.'''
	}
 */
	override String parse(String input) throws Exception {
		val segments = Splitter.on(SEPARATOR).omitEmptyStrings.split(input)
		
		Preconditions.checkArgument(segments.size == 2 || segments.size == 3, 
			"Wrong number of name segments (%s). Artefact ids consist of a package name, an artefact name and an optional version.", 
			segments.size)
		
		packageName = new Id(segments.get(0)).get
		artefactName = new Id(segments.get(1)).get
		versionId = if (segments.size == 3) new VersionId(segments.get(2)) else VersionId.HEAD

		return input
	}
	
	def ArtefactId increaseVersion() {
		val nextVersion = versionId.nextVersionId.get
		ArtefactId.of(this, nextVersion)
	}
	
	def getVersionName() {
		versionId.get
	}	
	
	// From Identifiable
	override getId() {
		get
	}	
}
