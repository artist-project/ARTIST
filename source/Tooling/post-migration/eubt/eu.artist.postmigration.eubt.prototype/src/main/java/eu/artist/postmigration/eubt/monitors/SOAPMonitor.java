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
package eu.artist.postmigration.eubt.monitors;

import java.util.List;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.applications.SOAPApplication;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.executiontrace.IndependentTrace;
import eu.artist.postmigration.eubt.executiontrace.Trace;
import eu.artist.postmigration.eubt.executiontrace.abstractor.SOAPTraceAbstractor;
import eu.artist.postmigration.eubt.executiontrace.extractor.SOAPTraceExtractor;
import eu.artist.postmigration.eubt.executiontrace.extractor.TraceExtractor;
import eu.artist.postmigration.eubt.mappers.SOAPUserRequestMapper;
import eu.artist.postmigration.eubt.mappers.UserRequestMapper;
import eu.artist.postmigration.eubt.oracles.ASSERTION_LEVEL;
import eu.artist.postmigration.eubt.oracles.SOAPTestOracle;
import eu.artist.postmigration.eubt.recorders.request.RequestRecorder;
import eu.artist.postmigration.eubt.recorders.request.SOAPRequestRecorder;
import eu.artist.postmigration.eubt.recorders.response.ResponseRecorder;
import eu.artist.postmigration.eubt.recorders.response.SOAPResponseRecorder;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.responses.Response;
import eu.artist.postmigration.eubt.users.ApplicationUser;
import eu.artist.postmigration.eubt.users.SOAPApplicationUser;

/**
 * @author pneubaue
 * 
 */
public class SOAPMonitor implements Monitor {

	// applications
	private SOAPApplication modernizedApplication;
	private SOAPApplication originalApplication;
	// request recorders
	private RequestRecorder modernizedRequestRecorder;
	private RequestRecorder originalRequestRecorder;
	// request mapper
	private UserRequestMapper userRequestMapper;
	// response recorders
	private ResponseRecorder modernizedResponseRecorder;
	private ResponseRecorder originalResponseRecorder;
	// users
	private ApplicationUser modernizedApplicationUser;
	private ApplicationUser originalApplicationUser;
	// trace extractors
	private TraceExtractor modernizedTraceExtractor;
	private TraceExtractor originalTraceExtractor;
	// trace abstractors
	private SOAPTraceAbstractor modernizedTraceAbstractor;
	private SOAPTraceAbstractor originalTraceAbstractor;
	// request migration trace model location
	private String requestMigrationTraceModelLocation;
	// request migration trace model location
	private String responseMigrationTraceModelLocation;

	@SuppressWarnings("unused")
	private SOAPMonitor() {
		// avoid default constructor init
	}

	public SOAPMonitor(final SOAPApplication modernizedApplication, final SOAPApplication originalApplication) {
		this.modernizedApplication = modernizedApplication;
		this.originalApplication = originalApplication;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.monitors.Monitor#setup(eu.artist.postmigration.eubt.applications.Application, eu.artist.postmigration.eubt.applications.Application)
	 */
	@Override
	public void setup(final String... migrationTraceModelsLocation) throws EUBTException {
		// check application availablity
		modernizedApplication.isAvailable();
		originalApplication.isAvailable();
		// initialize
		modernizedRequestRecorder = new SOAPRequestRecorder();
		originalRequestRecorder = new SOAPRequestRecorder();
		modernizedResponseRecorder = new SOAPResponseRecorder();
		originalResponseRecorder = new SOAPResponseRecorder();
		userRequestMapper = new SOAPUserRequestMapper();
		modernizedApplicationUser = new SOAPApplicationUser(modernizedApplication);
		originalApplicationUser = new SOAPApplicationUser(originalApplication);
		modernizedTraceExtractor = new SOAPTraceExtractor();
		originalTraceExtractor = new SOAPTraceExtractor();
		modernizedTraceAbstractor = new SOAPTraceAbstractor();
		modernizedTraceAbstractor.setSchemaLocation(modernizedApplication.getServiceSchemaLocation());
		originalTraceAbstractor = new SOAPTraceAbstractor();
		originalTraceAbstractor.setSchemaLocation(originalApplication.getServiceSchemaLocation());
		this.requestMigrationTraceModelLocation = migrationTraceModelsLocation[0];
		this.responseMigrationTraceModelLocation = migrationTraceModelsLocation[1];
	}// setup

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.monitors.Monitor#executeRequest(eu.artist.postmigration.eubt.requests.Request)
	 */
	@Override
	public void executeRequest(final Request modernizedRequest) throws EUBTException {
		// map modernized request to original request 
		final List<Request> originalRequests = userRequestMapper.mapRequest(modernizedRequest, requestMigrationTraceModelLocation);
		// add requests to recorders
		modernizedRequestRecorder.addRequest(modernizedRequest);
		for (final Request originalRequest : originalRequests) {
			originalRequestRecorder.addRequest(originalRequest);
		}
		// execute and record modernized request
		final Response modernizedResponse = modernizedApplicationUser.fireRequest(modernizedRequest);
		modernizedResponseRecorder.addResponse(modernizedResponse);
		// execute and record original request(s)
		for (final Request originalRequest : originalRequests) {
			final Response originalResponse = originalApplicationUser.fireRequest(originalRequest);
			originalResponseRecorder.addResponse(originalResponse);
		}
	}// executeRequest

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.monitors.Monitor#evaluateLastResponse()
	 */
	@Override
	public boolean evaluateResponses(ASSERTION_LEVEL assertionLevel) {
		// extract trace from their recorders
		final Trace modernizedResponseTrace = modernizedTraceExtractor.extractTrace(modernizedResponseRecorder);
		final Trace originalResponseTrace = originalTraceExtractor.extractTrace(originalResponseRecorder);
		// abstract traces into independent form
		final IndependentTrace independentModernizedResponse = modernizedTraceAbstractor.abstractTrace(modernizedResponseTrace,
				responseMigrationTraceModelLocation);
		final IndependentTrace independentOriginalResponse = originalTraceAbstractor.abstractTrace(originalResponseTrace, responseMigrationTraceModelLocation);
		// check trace validity according to its schema
		try {
			modernizedTraceAbstractor.isValidTrace();
			originalTraceAbstractor.isValidTrace();
		} catch (final EUBTException e) {
			Debug.out(this, "Failed during trace evaluation. " + e.getMessage());
		}
		// compare traces using the oracle		
		final SOAPTestOracle soapTestOracle = new SOAPTestOracle();
		return soapTestOracle.isEqual(independentModernizedResponse, independentOriginalResponse, assertionLevel);
	}// evaluateLastResponse

}
