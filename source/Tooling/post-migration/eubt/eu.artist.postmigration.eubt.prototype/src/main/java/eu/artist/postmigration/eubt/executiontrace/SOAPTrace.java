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
package eu.artist.postmigration.eubt.executiontrace;

import java.util.LinkedList;

import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public class SOAPTrace implements Trace {

	private final LinkedList<Response> responses;

	public SOAPTrace(final LinkedList<Response> responses) {
		this.responses = responses;
	}// constructor

	public LinkedList<Response> getResponses() {
		return responses;
	}// getReponses

}
