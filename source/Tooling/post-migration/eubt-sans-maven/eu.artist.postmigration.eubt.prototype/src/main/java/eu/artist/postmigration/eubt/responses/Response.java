/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.responses;

import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;

/**
 * @author pneubaue
 * 
 */
public interface Response {

	/**
	 * Get the type of response
	 * 
	 * @return {@link APPLICATION_TYPE}
	 */
	public APPLICATION_TYPE getType();

	/**
	 * Get the data associated with the response
	 * 
	 * @return data associated with the response
	 */
	public Object getData();

}
