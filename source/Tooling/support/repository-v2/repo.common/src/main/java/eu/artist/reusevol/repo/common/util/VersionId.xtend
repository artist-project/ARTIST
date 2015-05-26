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

import org.eclipse.xtend.lib.annotations.AccessorType
import org.eclipse.xtend.lib.annotations.Accessors

import static extension org.eclipse.xtend.lib.annotations.AccessorType.*

class VersionId extends ValidatedId<String> {
	private static val HEAD_MARKER = "HEAD"
	private static val NEWEST_MARKER = "NEWEST"

	public static val FIRST = VersionId.of(0)
	public static val HEAD = VersionId.of(HEAD_MARKER)
	public static val NEWEST = VersionId.of(NEWEST_MARKER)

	@Accessors(AccessorType.PUBLIC_GETTER)
	var long version

	public static def of(long id) {
		new VersionId(new Long(id).toString)
	} 
	
	public static def of(String id) {
		new VersionId(id)
	} 
	
	public new(String input) {
		super(input)
	}
	
	override parse(String input) throws Exception {
		switch(input.toUpperCase) {
			case "HEAD": return input
			case "NEWEST": return input
			default: {
				try {
					val id = Long.parseLong(input)
					if (id < 0) 
						throw new IllegalArgumentException('''Illegal version id '«input»'. Version ids must be posititve or zero.''')
					version = id
					input
				} catch(NumberFormatException ex) {
					throw new IllegalArgumentException('''Illegal characters version id '«input»'. A version id can consist of 'HEAD', 'NEWEST', or the string representation of a positive integer.''')
				}
			} 
		}
	}
	
	def nextVersionId() {
		VersionId.of(version + 1)
	}
}