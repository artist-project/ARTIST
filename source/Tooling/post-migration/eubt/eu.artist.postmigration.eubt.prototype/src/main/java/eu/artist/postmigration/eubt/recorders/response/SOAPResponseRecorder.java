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
public class SOAPResponseRecorder implements ResponseRecorder {

	private final LinkedList<Response> responses = new LinkedList<Response>();

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.response.ResponseRecorder#addResponse(eu.artist.postmigration.eubt.responses.Response)
	 */
	@Override
	public void addResponse(final Response response) {
		responses.add(response);
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.response.ResponseRecorder#getResponse(long)
	 */
	@Override
	public Response getResponse(final long responseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.response.ResponseRecorder#getNumberOfResponses()
	 */
	@Override
	public long getNumberOfResponses() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.recorders.response.ResponseRecorder#getListOfResponses()
	 */
	@Override
	public LinkedList<Response> getListOfResponses() {
		return responses;
	}

}
