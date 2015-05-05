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

import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.oracles.ASSERTION_LEVEL;
import eu.artist.postmigration.eubt.requests.Request;

/**
 * @author pneubaue
 * 
 */
public interface Monitor {

	/**
	 * Setup and initialize:
	 * - modernized and original application
	 * - (user request discoverer, p.23 in WD11.2)
	 * - request and response recorder
	 * - users
	 * - request mapper
	 * - trace extractor and abstractor
	 * - test oracle
	 * - migration trace model(s) location
	 * 
	 * Goal: setup, initialize and coordinate between components
	 * and communicate with test developer (who defines modernized requests).
	 * 
	 * @exception e.g. if an application is not available or couldn't be
	 *            initialized
	 */
	public void setup(String... migrationTraceModelsLocation) throws EUBTException;

	/**
	 * Execute request on both modernized and original application.
	 * Mapping the modernized request to a corresponding original request is done
	 * internally.
	 * 
	 * @param modernizedRequest modernized request to be executed
	 * @exception if request could not be successfully executed
	 */
	public void executeRequest(Request modernizedRequest) throws EUBTException;

	/**
	 * Evaluates if the modernized request and its corresponding original
	 * request(s)
	 * produced the same response
	 * 
	 * @param assertionLevel the level on which the results are asserted
	 * @return true if both responses are equal, false otherwise
	 */
	public boolean evaluateResponses(ASSERTION_LEVEL assertionLevel);

}
