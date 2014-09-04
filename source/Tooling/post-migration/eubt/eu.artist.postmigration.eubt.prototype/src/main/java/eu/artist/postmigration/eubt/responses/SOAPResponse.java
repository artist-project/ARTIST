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
package eu.artist.postmigration.eubt.responses;

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
public class SOAPResponse implements Response {

	public static final String ENCODING = "UTF-8";
	private APPLICATION_TYPE type;
	private SOAPEnvelope soapEnvelope;
	@SuppressWarnings("unused")
	private String soapResponseFilePath;
	@SuppressWarnings("unused")
	private String action;

	@SuppressWarnings("unused")
	private SOAPResponse() {
		// avoid default constructor access
	}

	public SOAPResponse(final APPLICATION_TYPE type) {
		this.type = type;
	}

	public SOAPResponse(final APPLICATION_TYPE type, final SOAPEnvelope soapEnvelope) {
		this.type = type;
		this.soapEnvelope = soapEnvelope;
	}
	
	public SOAPResponse(final APPLICATION_TYPE type, final String soapEnvelopeFilePath, String action) throws EUBTException {
		this.type = type;
		this.soapResponseFilePath = soapEnvelopeFilePath;
		this.action = action;
		
		try {
			// XML file -> SOAPEnvelope
			final FileInputStream inputStream = new FileInputStream(soapEnvelopeFilePath);
			final SOAPModelBuilder builder = OMXMLBuilderFactory.createSOAPModelBuilder(inputStream, ENCODING);
			soapEnvelope = builder.getSOAPEnvelope();
		} catch (final IOException e) {
			throw new EUBTException("Could not access SOAP response file at " + soapEnvelopeFilePath + ". Exception: " + e);
		}
		Debug.out(this, "Successfully created SOAP response from file at " + soapEnvelopeFilePath);
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.responses.Response#getType()
	 */
	@Override
	public APPLICATION_TYPE getType() {
		return type;
	}// getType

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.responses.Response#getData()
	 */
	@Override
	public Object getData() {
		return soapEnvelope;
	}

}
