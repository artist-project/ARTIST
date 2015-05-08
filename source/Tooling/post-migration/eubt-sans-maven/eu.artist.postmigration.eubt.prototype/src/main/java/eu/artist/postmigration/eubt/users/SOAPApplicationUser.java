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
package eu.artist.postmigration.eubt.users;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.MessageContext;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.applications.Application;
import eu.artist.postmigration.eubt.applications.SOAPApplication;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.requests.SOAPRequest;
import eu.artist.postmigration.eubt.responses.Response;
import eu.artist.postmigration.eubt.responses.SOAPResponse;

/**
 * @author pneubaue
 * 
 */
public class SOAPApplicationUser implements ApplicationUser {

	private SOAPApplication soapApplication;
	private ServiceClient serviceClient;
	private OperationClient operationClient;

	@SuppressWarnings("unused")
	private SOAPApplicationUser() {
		// avoid default constructor access
	}

	public SOAPApplicationUser(final SOAPApplication soapApplication) throws EUBTException {
		this.soapApplication = soapApplication;
		try {
			this.serviceClient = new ServiceClient();
		} catch (final AxisFault axisFault) {
			throw new EUBTException("Failed to create service/operation client. Exception: " + axisFault.getMessage());
		}

	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.users.User#fireRequest(eu.artist.postmigration.eubt.requests.Request)
	 */
	public Response fireSOAPRequest(final SOAPRequest soapRequest) throws EUBTException {
		Response response = null;

		try {
			// TODO fire request to soap application and establish "response"
			// Tutorial: https://today.java.net/pub/a/today/2006/12/13/invoking-web-services-using-apache-axis2.html
			// Scenario6Client.java in https://today.java.net/sites/all/modules/pubdlcnt/pubdlcnt.php?file=/today/2006/12/13/invoking-web-services-using-apache-axis2.zip&nid=219728
			// XML File to SOAPEnvelope: https://ws.apache.org/axiom/quickstart-samples.html

			this.operationClient = serviceClient.createClient(ServiceClient.ANON_OUT_IN_OP);

			// Creating message context
			final MessageContext outMsgContext = new MessageContext();
			final Options outMsgContextOptions = outMsgContext.getOptions();
			outMsgContextOptions.setTo(new EndpointReference(soapApplication.getServiceLocation()));
			outMsgContextOptions.setAction(soapRequest.getAction());
			outMsgContextOptions.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, "false");

			// XML input file -> SOAPEnvelope
			outMsgContext.setEnvelope(soapRequest.getSOAPEnvelope());
			operationClient.addMessageContext(outMsgContext);
			operationClient.execute(true);

			Debug.out(this, "Fired request action " + soapRequest.getAction() + " to location " + soapApplication.getServiceLocation());
			final MessageContext inMsgContext = operationClient.getMessageContext("In");

			response = new SOAPResponse(soapApplication.getType(), inMsgContext.getEnvelope());
			operationClient.reset();
			serviceClient.cleanupTransport();

		} catch (final Exception e) {
			throw new EUBTException("Failed to execute request to " + soapRequest.getType() + ". Detailed exception: " + e);
		}

		return response;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.users.ApplicationUser#getApplication()
	 */
	@Override
	public Application getApplication() {
		return this.soapApplication;
	}

	@Override
	public Response fireRequest(final Request request) throws EUBTException {
		final SOAPRequest soapRequest = (SOAPRequest) request;
		return fireSOAPRequest(soapRequest);
	}

}
