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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.Model;

/**
 * Helper class for computing context hash codes.
 * @author Christian Krause
 */
class ContextHashCodeHelper {

	// Number of context updates to be done:
	private static final int CONTEXT_UPDATES = 8;
	
	// Target model:
	private final Model model;
	
	// Equality helper:
	private final EqualityHelper equalityHelper;
	
	// The objects in the model:
	private EObject[] objects;
	
	// Indizes of the objects.
	private Map<EObject,Integer> indizes; 
	
	// Cached context hash codes.
	private int[] hashCodes, newHashCodes;
	
	// Cached cross reference matrix.
	private int[] crossReferences;
	
	/**
	 * Default constructor.
	 */
	ContextHashCodeHelper(Model model, EqualityHelper equalityHelper) {
		this.model = model;
		this.equalityHelper = equalityHelper;
	}
	
	/**
	 * Computes the context hash codes and stores them in {@link Model#getObjectHashCodes()}.
	 */
	void computeContextHashCodes() {
		
		// Extract all relevant information:
		extractObjects(model);
		extractCrossReferences();

		// Initialize the context hash codes with the local hash codes:
		initContextHashCodes(model, equalityHelper);

		// Update the context hash codes a fixed number of times:
		for (int i=0; i<CONTEXT_UPDATES; i++) {
			updateContextHashCodes();
		}
		
		// Now we can store them in the map:
		EMap<EObject,Integer> map = model.getObjectHashCodes();
		map.clear();
		for (int i=0; i<objects.length; i++) {
			map.put(objects[i], hashCodes[i]);
		}
		
		// Cleanup:
		objects = null;
		indizes = null;
		hashCodes = null;
		crossReferences = null;
		
	}
	
	/**
	 * Extract the objects out of the model.
	 * 
	 * @param model Model to be analyzed.
	 */
	protected void extractObjects(Model model) {
		
		// Initialize object array and index map:
		objects = new EObject[model.getObjectCount()];
		indizes = new HashMap<EObject,Integer>();
		
		// Extract all objects:
		Iterator<EObject> iterator = model.getResource().getAllContents();
		int index = 0;
		while (iterator.hasNext()) {
			objects[index] = iterator.next();
			indizes.put(objects[index], index);
			index++;
		}
	}
	
	/**
	 * Initialize the hash codes arrays with the local hash codes.
	 * @param model Model to be analyzed.
	 */
	protected void initContextHashCodes(Model model, EqualityHelper equalityHelper) {
		
		// We store the hash codes in two arrays:
		hashCodes    = new int[objects.length];
		newHashCodes = new int[objects.length];
		
		// Initialize main array with local hash codes:
		for (int i=0; i<objects.length; i++) {
			
			// Do we need he object key?
			int objectKey = 0;
			if (equalityHelper.getIdentityTypes().contains(objects[i].eClass())) {
				Integer key = model.getObjectKeysMap().get(objects[i]);
				if (key==null) {
					throw new RuntimeException("Missing object key for " + objects[i]);
				}
				objectKey = key;
			}
			
			// Now compute the local hash code:
			hashCodes[i] = LocalHashCodeHelper.hashCode(objects[i], objectKey, equalityHelper);
		}
	}
	

	/**
	 * Compute a matrix with cross references for the objects.
	 */
	@SuppressWarnings("unchecked")
	private void extractCrossReferences() {
		
		// Java initializes the array with zeros:
		crossReferences = new int[objects.length * objects.length];
		
		// Now fill the array:
		int row, column, mask;
		for (row=0; row<objects.length; row++) {
			EObject object = objects[row];
			mask = 1;
			
			// Check for the container reference:
			EObject container = object.eContainer();
			if (container!=null) {
				column = indizes.get(container);
				crossReferences[row * objects.length + column] |= mask;
			}
			mask <<= 1;
			
			// Now iterate over all real references:
			for (EReference reference : object.eClass().getEAllReferences()) {
				if (reference.isMany()) {
					EList<EObject> targets = (EList<EObject>) object.eGet(reference);
					for (EObject target : targets) {
						column = indizes.get(target);
						crossReferences[row * objects.length + column] |= mask;
					}
				} else {
					EObject target = (EObject) object.eGet(reference);
					if (target!=null) {
						column = indizes.get(target);
						crossReferences[row * objects.length + column] |= mask;
					}
				}
				mask <<= 1;
			}
		}
	}


	/**
	 * Update the hash codes based on the objects contexts.
	 */
	protected void updateContextHashCodes() {
		
		// Compute the new context hash codes based on the old ones:
		for (int index=0; index<objects.length; index++) {
			
			// Start with the old value:
			newHashCodes[index] = hashCodes[index];
			
			// Check outgoing references:
			for (int column=0; column<objects.length; column++) {
				int outgoingRefs = crossReferences[index * objects.length + column];
				newHashCodes[index] += (hashCodes[column] * outgoingRefs);
			}
			
			// We incorporate the difference between incoming and outgoing references:
			//newHashCodes[index] *= 31;

			// Check incoming references:
			for (int row=0; row<objects.length; row++) {
				int incomingRefs = crossReferences[row * objects.length + index];
				newHashCodes[index] += (hashCodes[row] * incomingRefs);
			}

		}
		
		// Update the hash codes with the new values:
		int[] dummy = newHashCodes;
		newHashCodes = hashCodes;
		hashCodes = dummy;
		//System.arraycopy(newHashCodes, 0, hashCodes, 0, hashCodes.length);
		
	}
	
}
