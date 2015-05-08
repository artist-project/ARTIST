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
package eu.artist.postmigration.eubt.recorders.response;

import java.util.LinkedList;

import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public interface ResponseRecorder {

	/**
	 * Add a response to the list of responses
	 * 
	 * @param response response to be added to the recorder
	 */
	public void addResponse(Response response);

	/**
	 * Get a specific response from the recorder
	 * 
	 * @param responseNumber response # to retrieve from the recorder
	 * @return a specific response from the recorder
	 */
	public Response getResponse(long responseNumber);

	/**
	 * Get the number of responses hold by the recorder
	 * 
	 * @return number of responses hold by the recorder
	 */
	public long getNumberOfResponses();

	/**
	 * Get the list of responses stored by the recorder
	 * 
	 * @return list of responses stored by the recorder
	 */
	public LinkedList<Response> getListOfResponses();

}
