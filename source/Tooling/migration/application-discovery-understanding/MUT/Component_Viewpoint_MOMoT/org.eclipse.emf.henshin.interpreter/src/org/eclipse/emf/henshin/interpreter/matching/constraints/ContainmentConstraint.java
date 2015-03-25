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

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

/**
 * Binary interface for containment constraints. 
 * 
 * @author Gregor Bonifer
 */
public class ContainmentConstraint implements BinaryConstraint {
	
	// Target variable:
	final Variable targetVariable;
	
	/**
	 * Default constructor.
	 * @param target Target variable.
	 */
	public ContainmentConstraint(Variable target) {	
		this.targetVariable = target;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.constraints.BinaryConstraint#check(org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot, org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot)
	 */
	@Override
	public boolean check(DomainSlot containedSlot, DomainSlot containerSlot) {
		
		// Only locked slots may be valid.
		if (!containedSlot.locked) {
			return false;
		}
		
		// The value of the contained slot must be an element of the temporaryDomain
		// specified by the containment reference.
		if (containerSlot.locked) {
			return true;
		}
		
		// The source value must have a container.
		EObject container = containedSlot.value.eContainer();
		if (container == null) {
			return false;
		}
		
		// Constraint is fulfilled if the containerSlot's temporaryDomain is
		// unrestricted or contains the required container.
		boolean result = (containerSlot.temporaryDomain == null)
				|| containerSlot.temporaryDomain.contains(container);
		
		// Create a domain change:
		if (result) {
			DomainChange change = new DomainChange(containerSlot, containerSlot.temporaryDomain);
			containedSlot.remoteChangeMap.put(this, change);
			containerSlot.temporaryDomain = new ArrayList<EObject>(1);
			containerSlot.temporaryDomain.add(container);
		}
		
		// Done.
		return result;
		
	}
	
}
