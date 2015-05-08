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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class DomainChange {
	
	DomainSlot slot;
	List<EObject> originalValues;
	
	public DomainChange(DomainSlot slot, List<EObject> originalValues) {
		this.slot = slot;
		this.originalValues = originalValues;
	}
	
	/**
	 * Get the original values of this domain change.
	 * @return the originalValues The original values.
	 */
	public List<EObject> getOriginalValues() {
		return originalValues;
	}

}
