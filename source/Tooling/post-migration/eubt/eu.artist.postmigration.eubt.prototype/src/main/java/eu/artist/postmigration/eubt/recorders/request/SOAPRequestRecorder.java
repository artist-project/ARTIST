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

import java.util.LinkedList;
import java.util.List;

import eu.artist.postmigration.eubt.requests.Request;

/**
 * @author pneubaue
 * 
 */
public class SOAPRequestRecorder implements RequestRecorder {

	private final LinkedList<Request> requests = new LinkedList<Request>();

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.request.RequestRecorder#addRequest(eu.artist.postmigration.eubt.requests.Request)
	 */
	@Override
	public void addRequest(final Request request) {
		// TODO Auto-generated method stub
		requests.add(request);
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.request.RequestRecorder#getRequest(long)
	 */
	@Override
	public Request getRequest(final long requestNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.request.RequestRecorder#getNumberOfRequests()
	 */
	@Override
	public long getNumberOfRequests() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.request.RequestRecorder#getListOfRequest()
	 */
	@Override
	public List<Request> getListOfRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}
