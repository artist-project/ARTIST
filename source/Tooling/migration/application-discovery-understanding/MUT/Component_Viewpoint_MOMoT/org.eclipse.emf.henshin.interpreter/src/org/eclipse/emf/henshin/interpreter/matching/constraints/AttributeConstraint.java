/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.constraints;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * This constraint checks the value of an attribute. The attribute 
 * value should be either a constant or the value of a parameter.
 * If the parameter value is not set yet, it will be set to the 
 * value of the attribute.
 */
public class AttributeConstraint implements UnaryConstraint {

	// Target attribute:
	final EAttribute attribute;

	// Value (either constant or a parameter name):
	final Object value;

	// Constant attribute value or parameter name?
	final boolean isConstantValue;

	/**
	 * Default constructor.
	 * @param attribute Target attribute.
	 * @param value Either fixed value or a parameter name.
	 * @param isConstantValue Whether the value is a constant or a parameter name.
	 */
	public AttributeConstraint(EAttribute attribute, Object value, boolean isConstantValue) {
		this.attribute = attribute;
		this.value = value;
		this.isConstantValue = isConstantValue;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.constraints.UnaryConstraint#check(org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot)
	 */
	@Override
	public boolean check(DomainSlot slot) {

		// Constant attribute value?
		if (isConstantValue) {

			// Slot locked already?
			if (slot.locked) {
				Object attValue = slot.value.eGet(attribute);
				return (value==null) ? (attValue==null) : (attValue!=null && attValue.equals(value));
			}

			// Remove illegal objects from the slot:
			int size = slot.domain.size();
			for (int i=size-1; i>=0; i--) {
				EObject domainObject = slot.domain.get(i);
				if (value==null) {
					if (domainObject.eGet(attribute) != null) {
						slot.domain.remove(i);
					}
				} else {
					if (!value.equals(domainObject.eGet(attribute))) {
						slot.domain.remove(i);
					}
				}
			}

			// Slot should not be empty:
			return !slot.domain.isEmpty();

		}

		// Otherwise the value is a parameter name:
		else {

			// If the slot is not locked ignore the parameter constraint. 
			if (!slot.locked) {
				return true;
			}
			
			// Get the attribute value and the parameter name:
			Object attValue = slot.value.eGet(attribute);
			String paramName = (String) value;
			
			// Parameter not set yet?
			if (!slot.conditionHandler.isSet(paramName)) {
				
				// Try to initialize the parameter with attributeValue. Might fail due to attribute conditions.
				boolean ok = slot.conditionHandler.setParameter(paramName, attValue);
				if (!ok) {
					slot.conditionHandler.unsetParameter(paramName);
				}
				return ok;
				
			} else {
				
				// Get the parameter value and treat it like a constant:
				Object paramValue = slot.conditionHandler.getParameter(paramName);
				return (paramValue==null) ? (attValue==null) : paramValue.equals(attValue);
				
			}
		}
	}
	
}
