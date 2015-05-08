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

import org.apache.commons.lang3.NotImplementedException;

import eu.artist.postmigration.eubt.executiontrace.SOAPTrace;
import eu.artist.postmigration.eubt.executiontrace.Trace;
import eu.artist.postmigration.eubt.recorders.request.RequestRecorder;
import eu.artist.postmigration.eubt.recorders.response.ResponseRecorder;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public class SOAPTraceExtractor implements TraceExtractor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.artist.postmigration.eubt.trace.extractor.TraceExtractor#extractTrace
	 * (eu.artist.postmigration.eubt.recorders.request.RequestRecorder)
	 */
	@Override
	public Trace extractTrace(final RequestRecorder requestRecorder) {
		throw new NotImplementedException("This function is not (yet) implemented.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.artist.postmigration.eubt.trace.extractor.TraceExtractor#extractTrace
	 * (eu.artist.postmigration.eubt.recorders.response.ResponseRecorder)
	 */
	@Override
	public Trace extractTrace(final ResponseRecorder responseRecorder) {
		final SOAPTrace soapTrace = new SOAPTrace(responseRecorder.getListOfResponses());
		return soapTrace;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.artist.postmigration.eubt.trace.extractor.TraceExtractor#extractTrace
	 * (eu.artist.postmigration.eubt.requests.Request)
	 */
	@Override
	public Trace extractTrace(final Request request) {
		throw new NotImplementedException("This function is not (yet) implemented.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * eu.artist.postmigration.eubt.trace.extractor.TraceExtractor#extractTrace
	 * (eu.artist.postmigration.eubt.responses.Response)
	 */
	@Override
	public Trace extractTrace(final Response response) {
		throw new NotImplementedException("This function is not (yet) implemented.");
	}

	/**
	 * TODO Implement the above methods: In case of SOAP the request/response is
	 * the Trace itself.
	 */

}
