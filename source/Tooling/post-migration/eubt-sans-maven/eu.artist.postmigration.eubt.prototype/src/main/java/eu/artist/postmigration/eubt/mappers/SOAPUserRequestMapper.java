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
package eu.artist.postmigration.eubt.mappers;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;

import com.sun.xml.txw2.output.IndentingXMLStreamWriter;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.helpers.SOAPHelper;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.loader.WSMigrationTraceHandler;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.requests.SOAPRequest;

/**
 * One incoming migrated soap request --- mapped to ---> one or many original soap
 * requests
 * 
 * @author pneubaue
 * 
 */
public class SOAPUserRequestMapper implements UserRequestMapper {

	/**
	 * 
	 */
	private static final String PATH_TO_ORIGINAL_REQUEST_FOLDER = System.getProperty("user.dir") + "\\requests\\original\\";
	private WSMigrationTraceHandler wsMigrationTraceHandler = null;

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.mappers.UserRequestMapper#mapRequest(eu.artist.postmigration.eubt.requests.Request)
	 */
	@Override
	public List<Request> mapRequest(final Request request, final String migrationTraceModelLocation) throws EUBTException {
		final List<Request> soapRequests = mapSOAPRequest((SOAPRequest) request, migrationTraceModelLocation);
		return soapRequests;
	}

	/**
	 * Maps a source SOAP request to a target SOAP request with
	 * APPLICATION_TYPE.ORIGINAL_APPLICATION
	 * From SOURCE (= Migrated Request) ---- TO ----> TARGET Request (= Original
	 * Request)
	 * 
	 * @param sourceSoapRequest source SOAP request to be mapped
	 * @return target SOAP request(s) of type
	 *         APPLICATION_TYPE.ORIGINAL_APPLICATION
	 * @throws Exception
	 */
	public List<Request> mapSOAPRequest(final SOAPRequest sourceSoapRequest, final String migrationTraceModelLocation) throws EUBTException {
		final List<Request> targetSoapRequests = new LinkedList<Request>();
		try {
			// load migration trace model				
			wsMigrationTraceHandler = new WSMigrationTraceHandler(migrationTraceModelLocation);

			// traversing source (= migrated) soap body elements
			final SOAPBody sourceSoapBody = sourceSoapRequest.getSOAPEnvelope().getBody();
			final Iterator<?> sourceSoapBodyChildrenIterator = sourceSoapBody.getChildElements();
			// TODO: Fix this, there can only be one child (i.e., the only soap request in the soap body)?
			while (sourceSoapBodyChildrenIterator.hasNext()) {
				final OMElement sourceSoapBodyChildElement = (OMElement) sourceSoapBodyChildrenIterator.next();

				final String sourceSoapBodyChildElementNamespaceUri = sourceSoapBodyChildElement.getNamespace().getNamespaceURI();
				final String sourceSoapBodyChildElementName = sourceSoapBodyChildElement.getLocalName();
				final Map<String, String> sourceSoapBodyChildElementAttributes = SOAPHelper.obtainImmediateChildNodesAndValues(sourceSoapBodyChildElement);
				
				// find migrated soap request in the trace model
				final TargetElement migratedOperation = wsMigrationTraceHandler.getTargetElement(sourceSoapBodyChildElementNamespaceUri,
						sourceSoapBodyChildElementName, sourceSoapBodyChildElementAttributes);

				final List<SOAPEnvelope> originalSoapEnvelops = SOAPHelper.generateOriginalRequestSoapEnvelops(migratedOperation, sourceSoapBodyChildElementAttributes,
						wsMigrationTraceHandler);
				// create a soap envelope for every soap body (i.e., different requests)
				for (final SOAPEnvelope originalSoapEnvelope : originalSoapEnvelops) {
					// store created soap envelope in a file
					final String originalRequestFileLocation = PATH_TO_ORIGINAL_REQUEST_FOLDER + originalSoapEnvelope.getSOAPBodyFirstElementLocalName() + ".xml";
					final XMLStreamWriter writer = new IndentingXMLStreamWriter(XMLOutputFactory.newInstance().createXMLStreamWriter(
							new FileWriter(originalRequestFileLocation)));
					originalSoapEnvelope.serialize(writer);
					writer.flush();
					Debug.out(this, "Successfully stored mapped SOAP envelope to file at ".concat(originalRequestFileLocation));

					// create original soap request from file
					final String targetSoapAction = originalSoapEnvelope.getSOAPBodyFirstElementNS().getNamespaceURI()
							+ Character.toUpperCase(originalSoapEnvelope.getSOAPBodyFirstElementLocalName().charAt(0))
							+ originalSoapEnvelope.getSOAPBodyFirstElementLocalName().substring(1);
					final SOAPRequest targetSoapRequest = new SOAPRequest(APPLICATION_TYPE.ORIGINAL_APPLICATION, originalRequestFileLocation, targetSoapAction);
					targetSoapRequests.add(targetSoapRequest);
				}
			}// while there are soap body children
			Debug.out(this, "Successfully mapped source SOAP request to target SOAP request(s).");

		} catch (final Exception e) {
			Debug.out(this, "Failed to map source SOAP request to target SOAP request. Exception: " + e.getMessage());
		}

		return targetSoapRequests;
	}

	/**
	 * @param soapBody
	 * @return SOAPBody with children removed
	 */
	public SOAPBody removeChildren(final SOAPBody soapBody) {
		final Iterator<?> childIterator = soapBody.getChildElements();
		while (childIterator.hasNext()) {
			childIterator.next();
			childIterator.remove();
		}
		return soapBody;
	}

}
