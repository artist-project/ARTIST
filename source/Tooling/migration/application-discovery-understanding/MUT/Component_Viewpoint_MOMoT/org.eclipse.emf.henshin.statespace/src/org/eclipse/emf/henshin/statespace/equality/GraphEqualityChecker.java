/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.equality;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.Model;

/**
 * Helper class for deciding whether two models are graph equal.
 * 
 * @generated NOT
 * @author Christian Krause
 * @see GraphEqualityChecker
 */
public class GraphEqualityChecker extends EcoreUtil.EqualityHelper {

	// Generated serial ID:
	private static final long serialVersionUID = -2171147717750245758L;

	// State equality helper:
	private final EqualityHelper equalityHelper;

	// Root objects:
	private List<EObject> roots1, roots2;
	
	// Cached object hash codes and keys:
	private EMap<EObject,Integer> hashCodes1, hashCodes2, keys1, keys2;

	// Resource navigator for model1:
	private ResourceNavigator navigator;
	
	/**
	 * Default constructor.
	 */
	public GraphEqualityChecker(EqualityHelper equalityHelper) {
		this.equalityHelper = equalityHelper;
	}

	/**
	 * Check graph equality for two models.
	 * 
	 * @param model1 Model 1.
	 * @param model2 Model 2.
	 * @return <code>true</code> if they are equal.
	 */
	public boolean equals(Model model1, Model model2) {

		// Empty models?
		if (model1.getResource().getContents().isEmpty()) {
			return model2.getResource().getContents().isEmpty();
		}
		
		// Initialize:
		roots1 = model1.getResource().getContents();
		roots2 = model2.getResource().getContents();
		hashCodes1 = model1.getObjectHashCodes();
		hashCodes2 = model2.getObjectHashCodes();
		keys1 = model1.getObjectKeysMap();
		keys2 = model2.getObjectKeysMap();
		navigator = new ResourceNavigator(model1.getResource(), true, false);
		
		// Try to find a match:
		boolean result = (roots1.size()==roots2.size()) && findMatch();

		// Clean up:
		roots1 = null;
		roots2 = null;
		hashCodes1 = null;
		hashCodes2 = null;
		keys1 = null;
		keys2 = null;
		navigator = null;

		// Done.
		return result;

	}

	/*
	 * Try to find a match from the source to the target model.
	 */
	@SuppressWarnings("unchecked")
	protected boolean findMatch() {
		
		// Reached the end? => We are done.
		if (navigator.end) {
			return true;
		}
		// Reached the start? => Back-tracking failed.
		if (navigator.start) {
			return false;
		}

		// Next target object:
		EObject target = navigator.getTarget();

		// Was the target matched already?
		if (containsKey(target)) {
			navigator.skip();
			if (findMatch()) {
				return true;
			}
			navigator.backward();
			return false;			
		}

		// Otherwise try to find a possible match for the next target.
		// Source object is either matched or null.
		List<EObject> matchCandidates;
		if (navigator.last.source==null) {
			matchCandidates = roots2;
		} else {
			if (navigator.last.reference.isMany()) {
				matchCandidates = (List<EObject>) 
						get(navigator.last.source).eGet(navigator.last.reference);
			} else {
				matchCandidates = Collections.singletonList((EObject) 
						get(navigator.last.source).eGet(navigator.last.reference));
			}
		}
		// Try to guess a match:
		EObject match = matchCandidates.get(navigator.last.index);
		if (haveEqualProperties(target, match)) {
			put(target, match);
			navigator.forward();
			if (findMatch()) {
				return true;
			}
			navigator.backward();
			remove(target);
		}
		// Try the other possible matches:
		for (int i=0; i<navigator.last.targets.size(); i++) {
			if (i!=navigator.last.index) {
				match = matchCandidates.get(i);
				if (haveEqualProperties(target, match)) {
					put(target, match);
					navigator.forward();
					if (findMatch()) {
						return true;
					}
					navigator.backward();
					remove(target);
				}
			}
		}
		
		// We were not able to find a match :(
		return false;

	}
	
	/**
	 * Check whether two object have the same properties. That is, the
	 * same hash code, the same type, the same number of links and the 
	 * same attributes.
	 * @param o1 Object 1.
	 * @param o2 Object 2.
	 * @return <code>true</code> if they have equal properties.
	 */
	protected boolean haveEqualProperties(EObject o1, EObject o2) {		
		if (!hashCodes1.get(o1).equals(hashCodes2.get(o2))) {
			return false;
		}
		EClass type = o1.eClass();
		if (type!=o2.eClass()) {
			return false;
		}
		if (equalityHelper.getIdentityTypes().contains(type) && !keys1.get(o1).equals(keys2.get(o2))) {
			return false;
		}
		for (EStructuralFeature feature : type.getEAllStructuralFeatures()) {
			if (feature instanceof EReference) {
				if (feature.isMany()) {
					if (((List<?>) o1.eGet(feature)).size()!=((List<?>) o2.eGet(feature)).size()) {
						return false;
					}
				} else {
					if ((o1.eGet(feature)==null)!=(o2.eGet(feature)==null)) {
						return false;
					}
				}				
			} else if (!equalityHelper.getIgnoredAttributes().contains(feature) &&
					   !haveEqualAttribute(o1, o2, (EAttribute) feature)) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper#equals(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public boolean equals(EObject o1, EObject o2) {
		throw new UnsupportedOperationException("Use equals(Model,Model)");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper#equals(java.util.List, java.util.List)
	 */
	@Override
	public boolean equals(List<EObject> l1, List<EObject> l2) {
		throw new UnsupportedOperationException("Use equals(Model,Model)");
	}

}
