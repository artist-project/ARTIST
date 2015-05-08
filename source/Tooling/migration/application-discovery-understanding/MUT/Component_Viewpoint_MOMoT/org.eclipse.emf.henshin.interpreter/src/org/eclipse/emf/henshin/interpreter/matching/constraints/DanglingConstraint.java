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

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.henshin.interpreter.EGraph;

/**
 * This constraint checks whether the value of an EReference contains objects
 * from the target domain.
 * 
 * @authot Enrico Biermann, Christian Krause
 */
public class DanglingConstraint implements Constraint {

	// Outgoing edge count:
	private final Map<EReference, Integer> outgoingEdgeCount;

	// Incoming edge count:
	private final Map<EReference, Integer> incomingEdgeCount;

	/**
	 * Default constructor.
	 * @param outgoingEdgeCount Outgoing edge count.
	 * @param incomingEdgeCount Incoming edge count.
	 */
	public DanglingConstraint(
			Map<EReference, Integer> outgoingEdgeCount,
			Map<EReference, Integer> incomingEdgeCount) {
		this.outgoingEdgeCount = outgoingEdgeCount;
		this.incomingEdgeCount = incomingEdgeCount;
	}

	/*
	 * 
	 */
	@SuppressWarnings("unchecked")
	public boolean check(EObject sourceValue, EGraph graph) {
		
		// Compute the actual number of incoming edges:
		Collection<Setting> settings = graph.getCrossReferenceAdapter().getInverseReferences(sourceValue);
		Map<EReference, Integer> actualIncomingEdges = createMapFromSettings(settings);
		Integer expectedCount;

		if (incomingEdgeCount != null) {
			for (EReference ref: actualIncomingEdges.keySet()) {
				if (incomingEdgeCount.containsKey(ref)) {
					expectedCount = incomingEdgeCount.get(ref);
				} else {
					expectedCount = 0;
				}
				if (actualIncomingEdges.get(ref) > expectedCount) {
					return false;
				}
			}
		} else {
			if (!actualIncomingEdges.isEmpty()) {
				return false;
			}
		}

		// Outgoing references
		for (EReference type : sourceValue.eClass().getEReferences()) {
			if (!type.isDerived()) {
				if (outgoingEdgeCount != null && outgoingEdgeCount.containsKey(type)) {
					expectedCount = outgoingEdgeCount.get(type);
				} else {
					expectedCount = 0;
				}
				if (type.isMany()) {
					List<Object> outgoingEdges = (List<Object>) sourceValue.eGet(type);
					outgoingEdges.retainAll(graph);
					if (expectedCount!=null) {
						if (expectedCount!=outgoingEdges.size()) {
							return false;
						}
					}
				} else {
					if (sourceValue.eGet(type)!=null 
							&& expectedCount!=1
							&& graph.contains(sourceValue.eGet(type))) {
						return false;
					}
				}
			}
		}
		
		// Ok.
		return true;
		
	}

	/*
	 * Count edges.
	 */
	private Map<EReference, Integer> createMapFromSettings(Collection<Setting> settings) {
		Map<EReference, Integer> result = new HashMap<EReference, Integer>();
		for (Setting setting: settings) {
			Integer count = result.get(setting.getEStructuralFeature());
			if (count == null) {
				count = 1;
				result.put((EReference) setting.getEStructuralFeature(), count);
			} else {
				count++;
			}
		}
		return result;
	}

}