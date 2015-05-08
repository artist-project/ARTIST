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

import java.util.Iterator;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNode;
import org.apache.axiom.om.OMText;
import org.apache.axiom.soap.SOAPBody;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.oracles.ASSERTION_LEVEL;
import eu.artist.postmigration.eubt.responses.Response;

/**
 * @author pneubaue
 * 
 */
public class IndependentSOAPTrace implements IndependentTrace {

	private SOAPTrace soapTrace;

	public IndependentSOAPTrace(SOAPTrace soapTrace) {
		this.soapTrace = soapTrace;
	}// constructor

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.trace.IndependentTrace#isEqual(eu.artist.postmigration.eubt.trace.IndependentTrace)
	 */
	@Override
	public boolean equals(IndependentTrace comparableTrace, ASSERTION_LEVEL comparisonLevel) {
		return isEqual((IndependentSOAPTrace)comparableTrace, comparisonLevel);
	}

	/**
	 * 
	 * 
	 * @param compareableTrace
	 */
	private boolean isEqual(IndependentSOAPTrace compareableTrace, ASSERTION_LEVEL comparisonLevel) {		
		// check if the given content matches with the own content
		for (Response soapResponse : soapTrace.getResponses()) {
			SOAPEnvelope soapEnvelope = (SOAPEnvelope) soapResponse.getData();
			SOAPBody soapBody = soapEnvelope.getBody();
			SOAPTrace comparableSoapTrace = (SOAPTrace) compareableTrace.getTrace();
			for (Response comparableResponse : comparableSoapTrace.getResponses()) {
				SOAPEnvelope comparableSoapEnvelope = (SOAPEnvelope) comparableResponse.getData();
				SOAPBody comparableSoapBody = comparableSoapEnvelope.getBody();
				
				// obtain own operations and parameters
				MultiMap<OMElement, OMElement> elementChildrenMultiMap = obtainElementChildrenMap(soapBody);
				// obtain comparable operations and parameters
				MultiMap<OMElement, OMElement> comparableElementChildrenMultiMap = obtainElementChildrenMap(comparableSoapBody);

				OMElement operationElement = (OMElement) elementChildrenMultiMap.keySet().toArray()[0];
				OMElement comparableOperationElement = (OMElement) comparableElementChildrenMultiMap.keySet().toArray()[0];
				
				// check if same operation name exists
				if (comparisonLevel == ASSERTION_LEVEL.OPERATION_LEVEL || comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_LEVEL || comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL) {
					if (operationElement.getLocalName().equals(comparableOperationElement.getLocalName())) {
						Debug.debug(this, "Trace comparison: found equal operation names '" + operationElement.getLocalName() + "'.");
						if (comparisonLevel == ASSERTION_LEVEL.OPERATION_LEVEL) {
							return true;
						}
					} else {
						Debug.debug(this, "Trace comparison: found unequal operation names '" + operationElement.getLocalName() + "' and '" + comparableOperationElement.getLocalName() +"'.");
						return false;
					}
				}
				// check if same attribute names exist
				if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_LEVEL || comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL) {
					boolean attributeNamesComparisonResult = compareElementNames(operationElement, comparableOperationElement);
					if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_LEVEL && attributeNamesComparisonResult) {
						Debug.debug(this, "Trace comparison: all attribute names are equal.");
						return true;
					} else if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_LEVEL && !attributeNamesComparisonResult) {
						Debug.debug(this, "Trace comparison: unequal attribute name found.");
						return false;
					}
				}
				// check if same attribute values exist
				if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL) {
					boolean attributeValuesComparisonResult = compareElementValues(operationElement, comparableOperationElement);
					if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL && attributeValuesComparisonResult) {
						Debug.debug(this, "Trace comparison: all attribute values are equal.");
						return true;
					} else if (comparisonLevel == ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL && !attributeValuesComparisonResult) {
						Debug.debug(this, "Trace comparison: unequal attribute values found.");
						return false;
					}
				}
				
			}// for each comparable response
		}// for each response
		
		return false; // not equal traces
	}
	
	/**
	 * @param operationElement
	 * @param comparableOperationElement
	 * @return
	 */
	private boolean compareElementValues(OMElement element1, OMElement element2) {
		Iterator<?> element1ChildIterator = element1.getChildElements();
		Iterator<?> element2ChildIterator = element2.getChildElements();
		
		while (element1ChildIterator.hasNext() && element2ChildIterator.hasNext()) {
			OMElement element1Child = (OMElement) element1ChildIterator.next();
			OMElement element2Child = (OMElement) element2ChildIterator.next();				
			if (element1Child.getFirstElement() != null && element2Child.getFirstElement() != null) {
				return true && compareElementValues(element1Child, element2Child);
			} else {
				// reached last (i.e., leaf) level of element
				OMNode element1ChildOMNode = element1Child.getFirstOMChild();
				OMNode element2ChildOMNode = element2Child.getFirstOMChild();
				if (element1ChildOMNode instanceof OMText && element2ChildOMNode instanceof OMText) {
					if ( ((OMText) element1ChildOMNode).getText().equals(((OMText) element2ChildOMNode).getText()) ) {
						Debug.debug(this, "Trace comparison: found equal '" + element1Child.getLocalName() + "' element values '" + ((OMText) element1ChildOMNode).getText() + "'.");
					} else {
						Debug.debug(this, "Trace comparison: found unequal '" + element1Child.getLocalName() + "' and '" + element2Child.getLocalName() + "' element values '" + element1Child.getLocalName() + "' and '" + element2Child.getLocalName() +"', respectively. Stopped further comparisons.");
						return false;
					}
				}
			}				
		}
		
		return true; // all element/attribute name values are equal
	}

	private boolean compareElementNames(OMElement element1, OMElement element2) {
		Iterator<?> element1ChildIterator = element1.getChildElements();
		Iterator<?> element2ChildIterator = element2.getChildElements();
		
		if ( element1.getLocalName().equals(element1.getLocalName()) ) {
			Debug.out(this, "Trace comparison: found equal element names '" + element1.getLocalName() + "'.");
			while (element1ChildIterator.hasNext() && element2ChildIterator.hasNext()) {
				OMElement element1Child = (OMElement) element1ChildIterator.next();
				OMElement element2Child = (OMElement) element2ChildIterator.next();				
				if (element1Child.getFirstElement() != null && element2Child.getFirstElement() != null) {
					return true && compareElementNames(element1Child, element2Child);
				} else {
					// reached last (i.e., leaf) level of element
					if (element1Child.getLocalName().equals(element2Child.getLocalName())) {
						Debug.debug(this, "Trace comparison: found equal element names '" + element1Child.getLocalName() + "'.");
					} else {
						Debug.debug(this, "Trace comparison: found unequal element names '" + element1Child.getLocalName() + "' and '" + element2Child.getLocalName() +"'. Stopped further comparisons.");
						return false;
					}
				}				
			}
		} else {
			Debug.debug(this, "Trace comparison: found unequal element names '" + element1.getLocalName() + "' and '" + element1.getLocalName() +"'.");
			return false;
		}		
		return true; // all element/attribute names are equal
		
	}
	
	/**
	 * Not recursive! Only element's children's children
	 * 
	 * @param element
	 * @return
	 */
	private MultiMap<OMElement, OMElement> obtainElementChildrenMap(OMElement element) {
		// obtain elements and children's name
		MultiMap<OMElement, OMElement> elementChildrenMultiMap = new MultiValueMap<>();
		Iterator<?> elementIterator = element.getChildElements();
		while (elementIterator.hasNext()) {
			OMElement elementChild = (OMElement) elementIterator.next();			
			Iterator<?> childrenIterator = elementChild.getChildElements();
			while (childrenIterator.hasNext()) {
				OMElement elementChildChild = (OMElement) childrenIterator.next();
				elementChildrenMultiMap.put(elementChild, elementChildChild);
			}
		}
		return elementChildrenMultiMap;
	}
	
	private SOAPTrace getSoapTrace() {
		return soapTrace;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.executiontrace.IndependentTrace#getTrace()
	 */
	@Override
	public Trace getTrace() {
		return getSoapTrace();
	}

}
