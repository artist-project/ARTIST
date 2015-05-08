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
package eu.artist.postmigration.eubt.helpers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.om.OMText;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.commons.collections4.MultiMap;

import com.sun.xml.txw2.output.IndentingXMLStreamWriter;

import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.loader.WSMigrationTraceHandler;
import eu.artist.postmigration.eubt.responses.SOAPResponse;

/**
 * @author pneubaue
 * 
 */
public class SOAPHelper {

	/**
	 * Obtain the element node and values (= parameter and value) of an element
	 * (!) Warning this assumes that you are on the lowest level (leaf) and no more children are available.
	 * Hence, value at non-leaf level is skipped (i.e., only element names is returned)
	 * 
	 * @param element element from which to obtain the nodes  (= node name
	 *            and value) from
	 * @return the nodes (= attribute and value) of an element
	 */
	public static Map<String, String> obtainImmediateChildNodesAndValues(final OMElement element) {
		final Map<String, String> elementAndValues = new LinkedHashMap<String, String>();
		final Iterator<?> childElementIterator = element.getChildElements();
		while (childElementIterator.hasNext()) {
			// collect attribute names and values      			
			final OMElement childElement = (OMElement) childElementIterator.next();
			String attributeName = childElement.getLocalName();
			OMNode childOMNode = childElement.getFirstOMChild();
			String attributeValue = null;
			if (childOMNode instanceof OMText) {
				attributeValue = ((OMText) childOMNode).getText();				
			}
			elementAndValues.put(attributeName, attributeValue);
		}
		return elementAndValues;
	}// obtainChildElementAndValues
	
	/**
	 * Obtain a list of child elements for a given element
	 * 
	 * @param element element for which a list of children is established
	 * @return a list of children for the given element
	 */
	public static List<OMElement> obtainChildElements(final OMElement element) {
		List<OMElement> childElements = new LinkedList<OMElement>();
		final Iterator<?> childElementsIterator = element.getChildElements();
		while (childElementsIterator.hasNext()) {
			// collect child elements in a list
			final OMElement childElement = (OMElement) childElementsIterator.next();
			childElements.add(childElement);			
		}
		return childElements;
	}// obtainChildElements
	
	/**
	 * Obtain a list of child element local names for a given element
	 * 
	 * @param element element for which a list of children local names is established
	 * @return a list of children local names for the given element
	 */
	public static List<String> obtainChildElementLocalNames(final OMElement element) {
		List<String> childElementNames = new LinkedList<String>();
		List<OMElement> childElements = obtainChildElements(element);
		for (OMElement childElement : childElements) {
			childElementNames.add(childElement.getLocalName());
		}
		return childElementNames;
	}// obtainChildElementLocalNames
	
	/**
	 * Checks if the given element has element (non-parameter) children
	 * 
	 * @param element element to check for element (non-parameter) children
	 * @return true if the element has element (non-parameter) children, false otherwise
	 */
	public static boolean hasElementChildren(final OMElement element) {
		final Iterator<?> childElementIterator = element.getChildElements();
		while (childElementIterator.hasNext()) {
			OMElement child = (OMElement) childElementIterator.next();
			final Iterator<?> childChildIterator = child.getChildElements();
			if (childChildIterator.hasNext()) {
				return true;				
			}
		}
		return false;
	}// hasElementChildren
		
	/**
	 * @param element 
	 * @return
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private static String obtainAttributeName(final OMNode element) {
		String attributeName = null;		
		// NOTE: The following line is DANGEROUS (!) -> Find a better solution?
		attributeName = element.toString().substring(element.toString().indexOf("<") + 1,
				element.toString().indexOf(">"));
		return attributeName;
	}// obtainAttributeName

	@Deprecated
	public static String obtainAttributeValue(final OMNode element) {
		String attributeValue = null;
		// NOTE: The following line is DANGEROUS (!) -> Find a better solution?
		attributeValue = element.toString().substring(element.toString().indexOf(">") + 1,
				element.toString().indexOf("</"));				
		return attributeValue;
	}// obtainAttributeValue
	
	
	/**
	 * Migrated request operation ==> Original request operation(s)
	 * 
	 * @param migratedOperationModel migrated operation model
	 * @param migratedOperationAttributes operation attributes (= attribute name
	 *            and value)
	 * @return original soap envelops corresponding to the given migrated
	 *         operation
	 */
	public static List<SOAPEnvelope> generateOriginalRequestSoapEnvelops(final TargetElement migratedOperationModel,
			final Map<String, String> migratedOperationAttributes, final WSMigrationTraceHandler wsMigrationTraceHandler) {
		final Map<SourceElement, OMElement> oparationMap = new LinkedHashMap<SourceElement, OMElement>();
		final SOAP11Factory factory = new SOAP11Factory();

		// For every migrated parameter, create its corresponding original parameter within their original operation(s)
		for (final TargetParameter migratedParameter : migratedOperationModel.getParameters()) {
			// in which original operation does this parameter exist?
			final MultiMap<SourceElement, SourceParameter> originalOperationParameters = wsMigrationTraceHandler.getSourceParameters(migratedOperationModel,
					migratedParameter);

			// for any original operation in which the migrated parameter exist --> create/extend original operation and parameter
			for (final SourceElement originalOperation : originalOperationParameters.keySet()) {
				OMElement operationElement = null;
				if (!oparationMap.containsKey(originalOperation)) {
					// new operation encountered --> create new operation
					final QName operationName = new QName(originalOperation.getElementNamespace().getNamespaceURI(), originalOperation.getElementName(),
							originalOperation.getElementNamespace().getNamespacePrefix());
					operationElement = factory.createOMElement(operationName);

				} else {
					// existing operation encountered --> extend
					operationElement = oparationMap.get(originalOperation);
				}
				// obtain corresponding original parameter by checking the source parameter's target parameter back-link
				SourceParameter originalParameter = null;
				for (final SourceParameter sourceParameter : originalOperation.getParameters()) {
					for (final TargetParameter sourcesTargetParameter : sourceParameter.getTargetParameter()) {
						if (sourcesTargetParameter.equals(migratedParameter)) {
							originalParameter = sourceParameter;
						}
					}
				}

				// if there is a corresponding original attribute in the model --> create attribute
				if (originalParameter != null) {
					// create operation parameter
					final QName operationElementAttributeName = new QName(originalParameter.getParameterName());
					final OMElement operationElementAttribute = factory.createOMElement(operationElementAttributeName);
					// obtain attribute value
					final OMText operationElementAttributeValue = factory.createOMText(operationElementAttribute,
							migratedOperationAttributes.get(migratedParameter.getParameterName()));
					// add attribute value to attribute
					operationElementAttribute.addChild(operationElementAttributeValue);
					// add attribute to operation
					operationElement.addChild(operationElementAttribute);
					// add operation to operation map
					oparationMap.put(originalOperation, operationElement);
				}

			}// for each original operation

		}// for each migrated parameter

		// Obtain corresponding original operation(s)
		final List<SourceElement> originalOperations = wsMigrationTraceHandler.getSourceElements(migratedOperationModel);
		// create new soap envelope for each original operation
		final List<SOAPEnvelope> soapEnvelops = new ArrayList<SOAPEnvelope>();
		for (final SourceElement originalOperation : originalOperations) {
			// create operation element
			final OMElement operationElement = oparationMap.get(originalOperation);
			//OMNamespace operationNamespace = factory.createOMNamespace(originalOperation.getElementNamespace().getNamespaceURI(), originalOperation.getElementNamespace().getNamespacePrefix());
			final SOAPEnvelope soapEnvelope = factory.createSOAPEnvelope();
			final SOAPBody soapBody = factory.createSOAPBody(soapEnvelope);
			soapBody.addChild(operationElement);
			// populate list of soap envelops
			soapEnvelops.add(soapEnvelope);
		}

		return soapEnvelops;
	}// generateOriginalSoapEnvelops
	
	/**
	 * Original response operation => Migrated response operation(s)
	 * 
	 * @param originalOperationModel migrated operation model
	 * @param originalOperationAttributes operation attributes (= attribute name
	 *            and value)
	 * @return migrated soap envelops corresponding to the given original
	 *         operation
	 */
	@Deprecated
	public static List<SOAPEnvelope> generateMigratedResponseSoapEnvelops(final SourceElement originalOperationModel, final OMElement originalOperation,
			final WSMigrationTraceHandler wsMigrationTraceHandler) {
		final Map<TargetElement, OMElement> elementMap = new LinkedHashMap<TargetElement, OMElement>();
		final SOAP11Factory factory = new SOAP11Factory();
		
		// SourceElement.parameters -> targetParameters (at source element level)
		// SourceElement.childElement(s) -> targetElement (from there match their parameters)		

		// For every original parameter, create its corresponding migrated parameter within their migrated operation(s)
		for (final SourceParameter originalParameter : originalOperationModel.getParameters()) {
			// in which migrated operation does this parameter exist?
			final MultiMap<TargetElement, TargetParameter> migratedOperationParameters = wsMigrationTraceHandler.getTargetParameters(originalOperationModel,
					originalParameter);

			// for any migrated operation in which the original parameter exist --> create/extend migrated operation and parameter
			for (final TargetElement migratedOperation : migratedOperationParameters.keySet()) {
				OMElement operationElement = null;
				if (!elementMap.containsKey(migratedOperation)) {
					// new operation encountered --> create new operation
					final QName operationName = new QName(originalOperation.getNamespace().getNamespaceURI(), originalOperation.getLocalName(),
							originalOperation.getNamespace().getPrefix());
					operationElement = factory.createOMElement(operationName);
					// create <result> element for result operation
					OMElement resultElement = factory.createOMElement(new QName("result"));
					operationElement.addChild(resultElement);

				} else {
					// existing operation encountered --> extend operation
					operationElement = elementMap.get(migratedOperation);					
				}
				// obtain corresponding migrated parameter by checking the target parameter's source parameter back-link
				TargetParameter migratedParameter = null;
				for (final TargetParameter targetParameter : migratedOperation.getParameters()) {
					MultiMap<SourceElement, SourceParameter> sourceElementParameterMap = wsMigrationTraceHandler.getSourceParameters(migratedOperation,
							targetParameter);
					for (Iterator<Object> iterator = sourceElementParameterMap.values().iterator(); iterator.hasNext();) {
						SourceParameter sourceElementParameter = (SourceParameter) iterator.next();
						if (sourceElementParameter.equals(originalParameter)) {
							migratedParameter = targetParameter; 
							break;
						}
					}
				}

				// if there is a corresponding migrated attribute in the model --> create attribute
				if (migratedParameter != null) {
					// create operation parameter
					final QName operationElementAttributeName = new QName(migratedParameter.getParameterName());
					final OMElement operationElementAttribute = factory.createOMElement(operationElementAttributeName);
					// obtain attribute value
					final OMText operationElementAttributeValue;
					if ( originalOperation.getFirstOMChild() instanceof OMText ) {
						// no child attributes available (only <result>)
						operationElementAttributeValue = factory.createOMText(operationElementAttribute, obtainAttributeValue((OMNode)originalOperation));						
					} else {
						// child attributes available
						final Map<String, String> originalOperationAttributes = SOAPHelper.obtainImmediateChildNodesAndValues(originalOperation); 
						operationElementAttributeValue = factory.createOMText(operationElementAttribute,
								originalOperationAttributes.get(originalParameter.getParameterName()));
					}
					// add attribute value to attribute
					operationElementAttribute.addChild(operationElementAttributeValue);
					// add attribute to operation result
					OMElement resultElement = operationElement.getFirstChildWithName(new QName("result"));
					resultElement.addChild(operationElementAttribute);
					// add operation to element map
					elementMap.put(migratedOperation, operationElement);
				}

			}// for each migrated operation

		}// for each original parameter

		// Obtain corresponding migrated operation(s)
		final List<TargetElement> migratedOperations = wsMigrationTraceHandler.getTargetElements(originalOperationModel);
		final List<SOAPEnvelope> soapEnvelops = new ArrayList<SOAPEnvelope>();
		for (final TargetElement migratedOperation : migratedOperations) {
			// create operation element
			final OMElement operationElement = elementMap.get(migratedOperation);
			final SOAPEnvelope soapEnvelope = factory.createSOAPEnvelope();
			final SOAPBody soapBody = factory.createSOAPBody(soapEnvelope);
			soapBody.addChild(operationElement);
			// populate list of soap envelops
			soapEnvelops.add(soapEnvelope);
		}

		return soapEnvelops;
	}// generateMigratedSoapEnvelops
	
	/**
	 * @param migratedSoapEnvelope
	 * @return
	 * @throws XMLStreamException
	 * @throws FactoryConfigurationError
	 * @throws IOException
	 */
	public static String storeSoapEnvelopeToFile(final SOAPEnvelope migratedSoapEnvelope, final String migratedResponseFileFolder) throws EUBTException {
		// store created soap envelope in a file
		final String migratedResponseFileLocation = migratedResponseFileFolder + migratedSoapEnvelope.getSOAPBodyFirstElementLocalName() + ".xml";
		XMLStreamWriter writer;
		try {
			writer = new IndentingXMLStreamWriter(XMLOutputFactory.newInstance().createXMLStreamWriter(
					new FileWriter(migratedResponseFileLocation)));
			migratedSoapEnvelope.serialize(writer);
			writer.flush();
		} catch (XMLStreamException e) {
			throw new EUBTException("Failed to create stream writer, or serialize or flush output. Detailed Exception: " + e);
		} catch (FactoryConfigurationError e) {
			throw new EUBTException("Failed to configure xml output factory. Detailed Exception: " + e);
		} catch (IOException e) {
			throw new EUBTException("General I/O Exception (wrong path, file location?). Detailed Exception: " + e);
		}
		return migratedResponseFileLocation;
	}// storeSoapEnvelopeToFile
	
	/**
	 * @param soapEnvelope
	 * @param responseFileLocation
	 * @return
	 * @throws EUBTException
	 */
	public static SOAPResponse createSoapResponseFromFile(final SOAPEnvelope soapEnvelope, final String responseFileLocation, final APPLICATION_TYPE applicationType) throws EUBTException {
		// create migrated soap request from file
		final String targetSoapAction = soapEnvelope.getSOAPBodyFirstElementNS().getNamespaceURI()
				+ Character.toUpperCase(soapEnvelope.getSOAPBodyFirstElementLocalName().charAt(0))
				+ soapEnvelope.getSOAPBodyFirstElementLocalName().substring(1);
		final SOAPResponse targetSoapResponse = new SOAPResponse(applicationType, responseFileLocation,
				targetSoapAction);
		return targetSoapResponse;
	}// createSoapResponseFromFile

}// SOAPHelper
