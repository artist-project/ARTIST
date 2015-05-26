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

import eu.artist.reusevol.repo.common.model.Identifiable
import java.util.regex.Pattern

class Id extends ValidatedId<String> implements Identifiable {
	
	public static val ACCEPT_PATTERN = "[0-9a-zA-Z_\\-\\.]+"
	
	public static def of(String input) {
		new Id(input)
	}
	
	public new(String input) {
		super(input)
	}

	override String parse(String input) throws Exception {
		val accept = Pattern.matches(ACCEPT_PATTERN, input)
		if (!accept)
			throw new IllegalArgumentException(errorMessage(input))
		return input
	}
	
	private def String errorMessage(String input) {
		'''"«input»" is not a valid id. Valid ids adhere to the regex pattern «ACCEPT_PATTERN».'''
	}

	override getId() {
		get
	}	
}