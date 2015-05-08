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
package eu.artist.postmigration.eubt.requests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.axiom.om.OMXMLBuilderFactory;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPModelBuilder;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;
import eu.artist.postmigration.eubt.exceptions.EUBTException;

/**
 * @author pneubaue
 * 
 */
public class SOAPRequest implements Request {

	public static final String ENCODING = "UTF-8";
	private APPLICATION_TYPE type;
	private SOAPEnvelope soapEnvelope;
	private String soapRequestFilePath;
	private String action;

	@SuppressWarnings("unused")
	private SOAPRequest() {
		// avoid default constructor init
	}

	public SOAPRequest(final APPLICATION_TYPE type) {
		this.type = type;
	}

	/**
	 * Reads SOAP request from file.
	 * TODO This is temporary until the RequestRecorder is able to function as a
	 * proxy dispatching requests
	 * 
	 * @param type
	 * @param soapEnvelopeFilePath file containing a soap envelope
	 */
	public SOAPRequest(final APPLICATION_TYPE type, final String soapEnvelopeFilePath, final String action) throws EUBTException {
		this.type = type;
		this.soapRequestFilePath = soapEnvelopeFilePath;
		this.action = action;

		try {
			// XML file -> SOAPEnvelope
			final FileInputStream inputStream = new FileInputStream(soapEnvelopeFilePath);
			final SOAPModelBuilder builder = OMXMLBuilderFactory.createSOAPModelBuilder(inputStream, ENCODING);
			soapEnvelope = builder.getSOAPEnvelope();
		} catch (final IOException e) {
			throw new EUBTException("Could not access SOAP request file at " + soapEnvelopeFilePath + ". Exception: " + e);
		}
		Debug.out(this, "Successfully created SOAP request from file at " + soapEnvelopeFilePath);
	}// constructor

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.requests.Request#getType()
	 */
	@Override
	public APPLICATION_TYPE getType() {
		return type;
	}// getType

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.requests.Request#getData()
	 */
	@Override
	public Object getData() {
		return getSOAPEnvelope();
	}

	public SOAPEnvelope getSOAPEnvelope() {
		return this.soapEnvelope;
	}

	public String getAction() {
		return action;
	}

	public String getSoapRequestFilePath() {
		return soapRequestFilePath;
	}
}
