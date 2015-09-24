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

import eu.artist.reusevol.repo.common.util.Depth
import io.dropwizard.jersey.params.AbstractParam

class DepthParam extends AbstractParam<Depth> {

	public new(String input) {
		super(input)
	}

	public override errorMessage(String input, Exception e) {
		e.message
	}

	public override parse(String input) throws Exception {
		new Depth(input)
	}	
}
