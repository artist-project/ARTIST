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
 
package eu.artist.reusevol.server.util

import eu.artist.reusevol.repo.common.model.Identifiable
import eu.artist.reusevol.repo.common.util.Id
import io.dropwizard.jersey.params.AbstractParam

class IdParam extends AbstractParam<String> implements Identifiable  {
	
	public new(String input) {
		super(input)
	}

	override String parse(String input) throws Exception {
		Id.of(input).get
	}
	
	override getId() {
		get
	}
	
}
	