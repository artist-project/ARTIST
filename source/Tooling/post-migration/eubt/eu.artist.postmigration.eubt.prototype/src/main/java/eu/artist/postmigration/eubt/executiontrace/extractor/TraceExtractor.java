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
package eu.artist.postmigration.eubt.executiontrace.extractor;

import eu.artist.postmigration.eubt.executiontrace.Trace;
import eu.artist.postmigration.eubt.recorders.request.RequestRecorder;
import eu.artist.postmigration.eubt.recorders.response.ResponseRecorder;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public interface TraceExtractor {

	/**
	 * Extract trace out of recorder
	 * 
	 * @param requestRecorder request recorder to extract the trace from
	 * @return trace corresponding to the recorder's content
	 */
	public Trace extractTrace(RequestRecorder requestRecorder);

	/**
	 * Extract trace out of recorder
	 * 
	 * @param requestRecorder response recorder to extract the trace from
	 * @return trace corresponding to the recorder's content
	 */
	public Trace extractTrace(ResponseRecorder responseRecorder);

	/**
	 * Extract trace from a single request
	 * 
	 * @param request request to extract the trace from
	 * @return trace corresponding to the request's content
	 */
	public Trace extractTrace(Request request);

	/**
	 * Extract trace from a single response
	 * 
	 * @param request request to extract the trace from
	 * @return trace corresponding to the request's content
	 */
	public Trace extractTrace(Response response);

}
