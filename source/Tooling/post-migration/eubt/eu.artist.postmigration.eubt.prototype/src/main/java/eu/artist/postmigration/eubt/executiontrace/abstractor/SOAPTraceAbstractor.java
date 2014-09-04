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
package eu.artist.postmigration.eubt.executiontrace.abstractor;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMText;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.xml.sax.SAXException;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.executiontrace.IndependentSOAPTrace;
import eu.artist.postmigration.eubt.executiontrace.IndependentTrace;
import eu.artist.postmigration.eubt.executiontrace.SOAPTrace;
import eu.artist.postmigration.eubt.executiontrace.Trace;
import eu.artist.postmigration.eubt.helpers.SOAPHelper;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.SourceParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetElement;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.TargetParameter;
import eu.artist.postmigration.eubt.migrationtracemodel.wsmigrationtrace.loader.WSMigrationTraceHandler;
import eu.artist.postmigration.eubt.responses.Response;
import eu.artist.postmigration.eubt.responses.SOAPResponse;

/**
 * @author pneubaue
 * 
 */
public class SOAPTraceAbstractor implements TraceAbstractor {

	private static final String VALIDATION_VALID = "valid";
	private static final String VALIDATION_INVALID = "invalid";
	private static final String PATH_TO_INDEPENDENT_MIGRATED_RESPONSE_FOLDER = System.getProperty("user.dir") + "\\responses\\PIM\\migrated\\";
	private static final String PATH_TO_INDEPENDENT_ORIGINAL_RESPONSE_FOLDER = System.getProperty("user.dir") + "\\responses\\PIM\\original\\";
	private String schemaLocation;
	private LinkedMap<SOAPResponse, String> validationResults;
	private WSMigrationTraceHandler wsMigrationTraceHandler;

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.executiontrace.abstractor.TraceAbstractor#abstractTrace(eu.artist.postmigration.eubt.executiontrace.Trace, java.lang.String)
	 */
	@Override
	public IndependentTrace abstractTrace(final Trace soapTrace, final String responseMigrationTraceModelLocation) {

		IndependentTrace independentSoapTrace = null;

		try {
			if (schemaLocation == null) {
				throw new EUBTException("No Schema location defined.");
			}
			// validate trace against schema and store result		
			validationResults = validateSoapTrace((SOAPTrace) soapTrace);
			// init migration trace handler
			wsMigrationTraceHandler = new WSMigrationTraceHandler(responseMigrationTraceModelLocation);
			// abstract migrated or original trace to independent soap trace
			independentSoapTrace = abstractSoapTrace((SOAPTrace) soapTrace, responseMigrationTraceModelLocation);

		} catch (final Exception e) {
			Debug.out(this, "Failed to abstract trace. " + e.getMessage());
		}

		return independentSoapTrace;
	}// abstractTrace

	/**
	 * @param soapTrace
	 * @param responseMigrationTraceModelLocation
	 * @return
	 * @throws Exception
	 */
	private IndependentSOAPTrace abstractSoapTrace(final SOAPTrace soapTrace, final String responseMigrationTraceModelLocation) throws Exception {
		IndependentSOAPTrace independentSoapTrace = null;
		if (validationResults.size() == 0) {
			throw new EUBTException("Empty trace cannot be abstracted.");
		}
		// obtain trace application type
		final APPLICATION_TYPE applicationType = validationResults.asList().get(0).getType();

		if (applicationType == APPLICATION_TYPE.ORIGINAL_APPLICATION) {
			independentSoapTrace = abstractOriginalSoapTrace(soapTrace);
		} else if (applicationType == APPLICATION_TYPE.MODERNIZED_APPLICATION) {
			independentSoapTrace = abstractMigratedSoapTrace(soapTrace);
		}
		return independentSoapTrace;
	}// abstractSoapTrace

	/**
	 * Migrated Soap Trace ==> Independent Soap Trace
	 * 
	 * Returns an independent form of the migrated soap trace comparable with
	 * the independent original soap trace.
	 * It does so by:
	 * - removing operations that have been newly introduced and do not originate from the
	 * original system
	 * - removing parameters that have been newly introduced and do not originate from the
	 * original system
	 * 
	 * @param migratedSoapTrace
	 * @param wsMigrationTraceHandler
	 * @return
	 * @throws EUBTException 
	 */
	private IndependentSOAPTrace abstractMigratedSoapTrace(final SOAPTrace migratedSoapTrace) throws EUBTException {
		SOAP11Factory factory = new SOAP11Factory();

		// check newly introduced operations/parameters that cannot be traced back to the original system
		Response migratedResponse = migratedSoapTrace.getResponses().get(0);		
		SOAPEnvelope sourceSoapEnvelope = (SOAPEnvelope) migratedResponse.getData();
		SOAPBody sourceSoapBody = sourceSoapEnvelope.getBody();
		OMElement sourceSoapBodyFirstChild = (OMElement) sourceSoapBody.getFirstOMChild();	// level: soap response
		OMElement independentSoapResponse = generateIndependentMigratedResponse(sourceSoapBodyFirstChild);
		
		// put result in soap envelope and store it in the "targetMigratedSoapResponse"
		SOAPEnvelope targetSoapEnvelope = factory.createSOAPEnvelope();
		SOAPBody targetSoapBody = factory.createSOAPBody(targetSoapEnvelope);	
		targetSoapBody.addChild(independentSoapResponse);
		
		SOAPResponse targetMigratedSoapResponse = null;

		// store independent soap response to file
		final String migratedIndependentResponseFileLocation = SOAPHelper.storeSoapEnvelopeToFile(targetSoapEnvelope, PATH_TO_INDEPENDENT_MIGRATED_RESPONSE_FOLDER);
		Debug.out(this, "Successfully stored abstracted SOAP envelope to file at ".concat(migratedIndependentResponseFileLocation));
		targetMigratedSoapResponse = SOAPHelper.createSoapResponseFromFile(targetSoapEnvelope, migratedIndependentResponseFileLocation, APPLICATION_TYPE.MODERNIZED_APPLICATION);
		
		LinkedList<Response> targetMigratedSoapResponses = new LinkedList<Response>();
		targetMigratedSoapResponses.add(targetMigratedSoapResponse); // can only be one response as it always starts with one migrated response
		SOAPTrace targetMigratedSoapTrace = new SOAPTrace(targetMigratedSoapResponses);
		
		return new IndependentSOAPTrace(targetMigratedSoapTrace);
	}
	
	private OMElement generateIndependentMigratedResponse(OMElement element) {	
		SOAP11Factory factory = new SOAP11Factory();
		
		if (SOAPHelper.hasElementChildren(element)) {
			// has more children --> recursively add each child
			TargetElement targetElement = wsMigrationTraceHandler.getTargetElement(element.getNamespace().getNamespaceURI(), element.getLocalName(), SOAPHelper.obtainImmediateChildNodesAndValues(element));
			List<SourceElement> sourceElements = wsMigrationTraceHandler.getSourceElements(targetElement);
			Iterator<?> elementChildrenIterator = element.getChildElements();
			// has more children --> check if element exists a corresponding target element, if so add children, if not skip
			while (sourceElements.size()>0 && elementChildrenIterator.hasNext()) {
				QName elementName = new QName(element.getNamespace().getNamespaceURI(), element.getLocalName(), element.getNamespace().getPrefix());
				OMElement independentElement = factory.createOMElement(elementName);
				OMElement matchingChildElement = (OMElement) elementChildrenIterator.next();
				independentElement.addChild(generateIndependentMigratedResponse(matchingChildElement));
				return independentElement;
			}
		} else {
			// no more children (leaf(s) reached) --> add matching parameters
			OMElement parameterContainer = factory.createOMElement(element.getQName());
			Map<String, String> parameterNamesAndValues = SOAPHelper.obtainImmediateChildNodesAndValues(element);			
			TargetElement matchingTargetElement = obtainMatchingTargetElement(element, parameterNamesAndValues);
			
			if (matchingTargetElement != null) {
				for (TargetParameter targetParameter : matchingTargetElement.getParameters()) {
					// obtain corresponding source parameter(s)
					MultiMap<SourceElement, SourceParameter> sourceElementParameterMap = wsMigrationTraceHandler.getSourceParameters(matchingTargetElement, targetParameter);
					for (Object sourceParameterObject : sourceElementParameterMap.values()) {
						SourceParameter sourceParameter = (SourceParameter) sourceParameterObject;
						// check if source parameter links to given target parameter (i.e., the source parameter's target parameter list must contain the given target parameter)
						for (TargetParameter matchingTargetParameter : sourceParameter.getTargetParameter()) {
							if (matchingTargetParameter.equals(targetParameter)) {
								// matching target parameter found --> add it
								String parameterValueString = parameterNamesAndValues.get(targetParameter.getParameterName());
								QName parameterName = new QName(targetParameter.getParameterName());
								OMElement parameter = factory.createOMElement(parameterName);
								OMText parameterValue = factory.createOMText(parameter, parameterValueString);
								parameter.addChild(parameterValue);
								parameterContainer.addChild(parameter);
							}// if target parameter matches
						}// for each matching target parameter
					}// for each source parameter object
				}// for each target parameter
			} else {
				// the target is a parameter (not an element, e.g. in case of <result>boolean</result>)
				QName parameterName = new QName(((OMElement)element.getFirstOMChild()).getLocalName());
				String parameterValueString = parameterNamesAndValues.get(parameterName.toString());
				OMElement parameter = factory.createOMElement(parameterName);
				OMText parameterValue = factory.createOMText(parameter, parameterValueString);
				parameter.addChild(parameterValue);
				parameterContainer.addChild(parameter);
			}
			
			return parameterContainer;
		}// else
		
		return null; // unreachable?
	}

	/**
	 * @param element soap element to find a match for in the model
	 * @param parameterNamesAndValues parameter names and values found in the soap element
	 * @return a matching target element
	 */
	private TargetElement obtainMatchingTargetElement(OMElement element, Map<String, String> parameterNamesAndValues) {
		OMElement parentElement = (OMElement) element.getParent();

		// obtain matching target element
		TargetElement matchingTargetElement = wsMigrationTraceHandler.getTargetElement(parentElement.getNamespace().getNamespaceURI(), element.getLocalName(), parameterNamesAndValues);
		return matchingTargetElement;
	}// obtainMatchingTargetElement

	/**
	 * Original Soap Trace ==> Independent Soap Trace
	 * 
	 * Returns an independent form of the original soap trace comparable with the
	 * independent migrated soap trace.
	 * It does so by:
	 * - migrating the original soap responses into migrated soap responses
	 * 
	 * @param originalSoapTrace
	 * @param wsMigrationTraceHandler
	 * @return
	 * @throws Exception
	 */
	private IndependentSOAPTrace abstractOriginalSoapTrace(final SOAPTrace originalSoapTrace) throws Exception {
		final LinkedList<Response> targetSoapResponses = new LinkedList<Response>();
		SOAP11Factory factory = new SOAP11Factory();		
		/*
		 * - Use the response migration trace model to ... resulting in independent soap traces
		 * 		- ... map the original response to a migrated response, i.e., 
		 * 			similarly as done by SOAPUserRequestMapper for the request. 
		 */
		for (Response originalResponse : originalSoapTrace.getResponses()) {
			SOAPEnvelope sourceSoapEnvelope = (SOAPEnvelope) originalResponse.getData();
			SOAPBody sourceSoapBody = sourceSoapEnvelope.getBody();
			OMElement sourceSoapBodyFirstChild = (OMElement) sourceSoapBody.getFirstOMChild();  // level: soap response
			String namespaceUri = sourceSoapBodyFirstChild.getNamespace().getNamespaceURI();
			String operationName = sourceSoapBodyFirstChild.getLocalName();
			OMElement sourceSoapBodyFirstChildReturn = (OMElement) sourceSoapBodyFirstChild.getFirstOMChild();	// level: <return>..</return>
			Map<String, String> parameterNameValueMap = SOAPHelper.obtainImmediateChildNodesAndValues(sourceSoapBodyFirstChildReturn);
			
			if (parameterNameValueMap.size()==0) {
				// only one child that represents the parameter (e.g. <return>..</return>)
				OMText singleChildText = (OMText) sourceSoapBodyFirstChildReturn.getFirstOMChild();
				parameterNameValueMap.put(sourceSoapBodyFirstChildReturn.getLocalName(), singleChildText.getText());
			}

			// obtain migration trace elements
			SourceElement originalOperation = wsMigrationTraceHandler.getSourceElement(namespaceUri, operationName, parameterNameValueMap);

			// abstract to independent response
			OMElement independentSoapResponse = abstractOriginalSoapResponse((SOAPResponse) originalResponse, originalOperation);
			
			// put result in soap envelope and store it in the "targetMigratedSoapResponse"
			SOAPEnvelope targetSoapEnvelope = factory.createSOAPEnvelope();
			SOAPBody targetSoapBody = factory.createSOAPBody(targetSoapEnvelope);	
			targetSoapBody.addChild(independentSoapResponse);
			
			// store independent soap trace to file
			final String originalIndependentResponseFileLocation = SOAPHelper.storeSoapEnvelopeToFile(targetSoapEnvelope, PATH_TO_INDEPENDENT_ORIGINAL_RESPONSE_FOLDER);
			Debug.out(this, "Successfully stored abstracted SOAP envelope to file at ".concat(originalIndependentResponseFileLocation));
			SOAPResponse targetOriginalSoapResponse = SOAPHelper.createSoapResponseFromFile(targetSoapEnvelope, originalIndependentResponseFileLocation, APPLICATION_TYPE.ORIGINAL_APPLICATION);
			
			// add to list of responses			
			targetSoapResponses.add(targetOriginalSoapResponse);
		}

		// init independentSoapTrace and assign resulting soapTrace to it
		SOAPTrace independializedSoapTrace = new SOAPTrace(targetSoapResponses);
		IndependentSOAPTrace independenSoapTrace = new IndependentSOAPTrace(independializedSoapTrace);
		return independenSoapTrace;
	}// abstractOriginalSoapTrace

	/**
	 * Original Response ==> Independent Original Response
	 * 
	 * @param sourceResponse a original response
	 * @param originalOperation original operation element in migration trace model
	 *            corresponding to the original response
	 * @return migrated response (independent)
	 * @throws Exception 
	 */
	private OMElement abstractOriginalSoapResponse(SOAPResponse sourceResponse, SourceElement originalOperation) throws Exception {
		final SOAPEnvelope sourceSoapEnvelope = (SOAPEnvelope) sourceResponse.getData();
		final SOAPBody sourceSoapBody = sourceSoapEnvelope.getBody();
		final Iterator<?> sourceSoapBodyChildrenIterator = sourceSoapBody.getChildElements();
		final OMElement sourceSoapBodyChildElement = (OMElement) sourceSoapBodyChildrenIterator.next(); // operation

		OMElement independentSoapResponse = generateIndependentOriginalResponse(sourceSoapBodyChildElement);
		Debug.out(this, "Successfully abstracted source SOAP response to target SOAP response.");
		return independentSoapResponse;
	}// abstractOriginalSoapResponse
	
	private OMElement generateIndependentOriginalResponse(OMElement element) throws Exception {	
		SOAP11Factory factory = new SOAP11Factory();
		
		if (SOAPHelper.hasElementChildren(element)) {
			// has more children --> recursively add each child
			SourceElement sourceElement = wsMigrationTraceHandler.getSourceElement(element.getNamespace().getNamespaceURI(), element.getLocalName(), SOAPHelper.obtainImmediateChildNodesAndValues(element));
			List<TargetElement> targetElements = wsMigrationTraceHandler.getTargetElements(sourceElement);
			Iterator<?> elementChildrenIterator = element.getChildElements();
			// has more children --> check if element exists a corresponding source element, if so add children, if not skip
			while (targetElements.size()>0 && elementChildrenIterator.hasNext()) {
				QName elementName = null;
				if (element.getParent() instanceof SOAPBody) {
					// operation level element
					elementName = new QName(element.getNamespace().getNamespaceURI(), targetElements.get(0).getElementName(), element.getNamespace().getPrefix());
				} else {
					// below operation level element
					elementName = new QName(element.getNamespace().getNamespaceURI(), element.getLocalName(), element.getNamespace().getPrefix());
				}				
				OMElement independentElement = factory.createOMElement(elementName);
				OMElement matchingChildElement = (OMElement) elementChildrenIterator.next();
				independentElement.addChild(generateIndependentOriginalResponse(matchingChildElement));
				return independentElement;
			}// while there are children of element
		} else {
			// no more children (leaf(s) reached) --> add matching parameters
			OMElement parameterContainer = factory.createOMElement(element.getQName());
			Map<String, String> parameterNamesAndValues = SOAPHelper.obtainImmediateChildNodesAndValues(element);			
			SourceElement matchingSourceElement = obtainMatchingSourceElement(element, parameterNamesAndValues);
			
			if (matchingSourceElement != null) {
				for (SourceParameter sourceParameter : matchingSourceElement.getParameters()) {
					// obtain corresponding target parameter(s)
					MultiMap<TargetElement, TargetParameter> targetElementParameterMap = wsMigrationTraceHandler.getTargetParameters(matchingSourceElement, sourceParameter);
					for (Object targetParameterObject : targetElementParameterMap.values()) {
						TargetParameter targetParameter = (TargetParameter) targetParameterObject;
						// check if target parameter links to given source parameter (i.e., the source parameter's target parameter list must match with the iterating target parameter)
						for (TargetParameter matchingTargetParameter : sourceParameter.getTargetParameter()) {
							if (matchingTargetParameter.equals(targetParameter) && parameterContainer.getChildrenWithLocalName(sourceParameter.getParameterName()).hasNext()!=true) {
								// matching target parameter that is not yet there found --> add it
								String parameterValueString = parameterNamesAndValues.get(sourceParameter.getParameterName());
								QName parameterName = new QName(targetParameter.getParameterName());
								OMElement parameter = factory.createOMElement(parameterName);
								OMText parameterValue = factory.createOMText(parameter, parameterValueString);
								parameter.addChild(parameterValue);
								parameterContainer.addChild(parameter);
							}
						}
					}// for each source parameter object
				}// for each target parameter
			} else {
				// the target is a parameter (not an element, e.g. in case of <result>..</result>)
				QName parameterName = new QName(((OMElement)element.getFirstOMChild()).getLocalName());
				String parameterValueString = parameterNamesAndValues.get(parameterName.toString());
				OMElement parameter = factory.createOMElement(parameterName);
				OMText parameterValue = factory.createOMText(parameter, parameterValueString);
				parameter.addChild(parameterValue);
				parameterContainer.addChild(parameter);
			}
			
			return parameterContainer;
		}// else
		
		return null; // unreachable?
	}

	/**
	 * @param element soap element to find a match for in the model
	 * @param parameterNamesAndValues parameter names and values inside the soap element
	 * @return a matching source element
	 * @throws Exception
	 */
	private SourceElement obtainMatchingSourceElement(OMElement element, Map<String, String> parameterNamesAndValues) throws Exception {
		OMElement parentElement = (OMElement) element.getParent();

		// obtain matching source element
		SourceElement matchingSourceElement = null;
		if (parentElement instanceof SOAPBody) {
			matchingSourceElement = wsMigrationTraceHandler.getSourceElement(element.getNamespace().getNamespaceURI(), element.getLocalName(), parameterNamesAndValues);
		} else {
			matchingSourceElement = wsMigrationTraceHandler.getSourceElement(parentElement.getNamespace().getNamespaceURI(), element.getLocalName(), parameterNamesAndValues);
		}
		return matchingSourceElement;
	}
	
	/**
	 * Validates soap trace (i.e., list of soap responses) against schema and
	 * stores the result
	 * 
	 * @param soapResponseTrace trace that contains soap responses
	 * @return map of soap responses and their respective validation result
	 * @throws EUBTException in case the schema location could not be found
	 */
	private LinkedMap<SOAPResponse, String> validateSoapTrace(final SOAPTrace soapResponseTrace) throws EUBTException {
		final LinkedMap<SOAPResponse, String> validationResults = new LinkedMap<SOAPResponse, String>();

		final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Validator validator;
		try {
			final Schema schema = schemaFactory.newSchema(new URL(schemaLocation));
			validator = schema.newValidator();
		} catch (SAXException | IOException e) {
			throw new EUBTException("Failed to create Schema from Schema location " + schemaLocation + ". Detailed Exception: " + e.getMessage());
		}
		// for each soap response
		for (final Response response : soapResponseTrace.getResponses()) {
			String validationResult = VALIDATION_INVALID;
			final SOAPResponse soapResponse = (SOAPResponse) response;
			final SOAPEnvelope soapEnvelope = (SOAPEnvelope) soapResponse.getData();
			final OMElement bodyContent = soapEnvelope.getBody().getFirstElement();

			// create some invalid content
//			SOAP12Factory factory = new SOAP12Factory();
//			OMElement invalidElement = factory.createOMElement(new QName("blah"));
//			OMNamespace invalidNamespace = factory.createOMNamespace("http://notMyNamespace.com", "invNS");
//			OMAttribute invalidAttribute = factory.createOMAttribute("someAttribute", invalidNamespace, "attributeValue");
//			bodyContent.addChild(invalidElement);
//			bodyContent.addAttribute(invalidAttribute);

			// validate soap body content -> will cause an exception if not valid
			try {
				validator.validate(bodyContent.getSAXSource(true));
				// validation succeeded
				validationResult = VALIDATION_VALID;
				Debug.debug(this, "Successfully validated SOAP body content " + bodyContent);
			} catch (final IOException e) {
				throw new EUBTException("Failed to validate SOAP body content " + bodyContent + ". Detailed Exception: " + e.getMessage());
			} catch (final SAXException e) {
				// validation failed
				Debug.debug(this, "Failed to validate soap SOAP content " + bodyContent + ". Detailed Exception: " + e.getMessage());
			}
			// finished validating, store result
			validationResults.put(soapResponse, validationResult);
			validator.reset();
		}// for each soap response

		return validationResults;
	}// validateSoapTrace

	public void setSchemaLocation(final String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}// setSchemaLocation

	public boolean isValidTrace() throws EUBTException {
		if (validationResults == null) {
			throw new EUBTException("Trace has not been validated yet, call 'abstractTrace' first.");
		} else if (validationResults.size() == 0) {
			throw new EUBTException("Empty trace cannot be validated.");
		}
		for (final Map.Entry<SOAPResponse, String> mapEntry : validationResults.entrySet()) {
			if (mapEntry.getValue().equals(VALIDATION_INVALID)) {
				Debug.out(this, "Failed to validated full " + mapEntry.getKey().getType() + " response trace against its schema. First invalid trace element: "
						+ mapEntry.getKey());
				return false;
			}
		}
		Debug.out(this, "Successfully validated full " + validationResults.asList().get(0).getType() + " response trace against its schema.");
		return true;
	}// isValidTrace

}// SOAPTraceAbstractor
