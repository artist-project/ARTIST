/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.hashcodes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.henshin.statespace.EqualityHelper;

/**
 * Helper class for computing local hash codes of objects.
 * 
 * @author Christian Krause
 */
class LocalHashCodeHelper {
	
	/**
	 * Compute the local hash code for an object. This is done based on its type,
	 * its Id, its attribute values, and the number of references to other objects.
	 * If the object Id shall be irrelevant, use 0.
	 * 
	 * @param object Object for which the local hash code shall be computed.
	 * @param objectId The Id of the object.
	 * @return The object's local hash code.
	 */
	static int hashCode(EObject object, int objectId, EqualityHelper equalityHelper) {
		
		// Class and its features:
		EClass eclass = object.eClass();
		
		// Compute the local hash code:
		int hashCode;
		
		// Use the package URI:
		String uri = eclass.getEPackage().getNsURI();
		if (uri!=null) {
			hashCode = uri.hashCode();
		} else {
			hashCode = 1;
		}
		
		// Use type Id and the object Id:
		hashCode = (hashCode * 23) + eclass.getClassifierID();
		hashCode = (hashCode * 29) + objectId;
		
		// Use features:
		for (EStructuralFeature feature : eclass.getEAllStructuralFeatures()) {
			int value = 0;
			if (feature.isMany()) {
				EList<?> list = (EList<?>) object.eGet(feature);
				if (feature instanceof EReference) {
					value = list.size();
				} else if (feature instanceof EAttribute) {
					value = equalityHelper.getIgnoredAttributes().contains(feature) ? 0 : list.hashCode();
				}
			} else {
				Object single = object.eGet(feature);
				if (single==null) {
					value = 0;
				} else if (feature instanceof EReference) {
					value = 1;
				} else if (feature instanceof EAttribute) {
					value = equalityHelper.getIgnoredAttributes().contains(feature) ? 0 : single.hashCode();
				}
			}
			hashCode = (hashCode * 31) + value;
		}
		
		// That is all.
		return hashCode;
		
	}

}
