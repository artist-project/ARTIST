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
package eu.artist.postmigration.eubt.recorders.request;

import java.util.List;

import eu.artist.postmigration.eubt.requests.Request;

/**
 * @author pneubaue
 * 
 */
public interface RequestRecorder {

	/**
	 * Add a request to the recorder
	 * 
	 * @param request request to be added to the recorder
	 */
	public void addRequest(Request request);

	/**
	 * Get a specific request from the recorder
	 * 
	 * @param requestNumber request # in recorder
	 */
	public Request getRequest(long requestNumber);

	/**
	 * Get the number of request hold by the recorder
	 * 
	 * @return number of requests hold by the recorder
	 */
	public long getNumberOfRequests();

	/**
	 * Get the list of requests stored by the recorder
	 * 
	 * @return list of requests stored by the recorder
	 */
	public List<Request> getListOfRequest();

}
