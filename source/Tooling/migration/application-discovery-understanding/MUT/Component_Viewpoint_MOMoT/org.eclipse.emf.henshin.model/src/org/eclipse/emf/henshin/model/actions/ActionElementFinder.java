/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.GraphElement;
import org.eclipse.emf.henshin.model.NestedCondition;
import org.eclipse.emf.henshin.model.Rule;

import static org.eclipse.emf.henshin.model.Action.Type.*;

/**
 * Action element finder class.
 */
public class ActionElementFinder {	
	
	/*
	 * Get all elements in a rule that are associated with the given argument action.
	 */
	@SuppressWarnings("unchecked")
	static <E extends GraphElement> List<E> getRuleElementCandidates(
			Rule kernel, Action action, EReference containment) {
		
		// Get a list of elements to be checked:
		List<E> candidates = new ArrayList<E>();
		
		// Determine the rules top be checked:
		List<Rule> rules = new ArrayList<Rule>();
		if (action==null || !action.isMulti()) {
			rules.add(kernel);
		}
		if (action==null || action.isMulti()) {
			rules.addAll(kernel.getAllMultiRules());
		}
		
		// Add LHS elements:
		if (action==null || action.getType()==DELETE || action.getType()==PRESERVE) {
			for (Rule rule : rules) {
				candidates.addAll((List<E>) rule.getLhs().eGet(containment));
			}
		}
		
		// Add RHS elements:
		if (action==null || action.getType()==CREATE) {
			for (Rule rule : rules) {
				candidates.addAll((List<E>) rule.getRhs().eGet(containment));				
			}
		}

		// Add PAC and NAC elements:
		for (Rule rule : rules) {
			for (NestedCondition nestedCond : rule.getLhs().getNestedConditions()) {
				if (action==null || 
					(action.getType()==REQUIRE && nestedCond.isPAC()) || 
					(action.getType()==FORBID && nestedCond.isNAC())) {
					candidates.addAll((List<E>) nestedCond.getConclusion().eGet(containment));					
				}			
			}
		}
		
		// Look for the elements that actually match the action:
		return candidates;
		
	}
	
	/*
	 * For an arbitrary element in a rule graph, find the corresponding action element.
	 */
	public static <E extends GraphElement> E getActionElement(E element, ActionHelper<E,?> helper) {		
		
		// Check whether its null:
		if (element==null || element.getGraph()==null) {
			return null;
		}
		
		// Is the element itself already an action element?
		if (helper.getAction(element)!=null) {
			return element;
		} else {
			
			// Get the mappings:
			EObject container = element.getGraph().eContainer();
			
			if (container instanceof Rule) {
				
				Rule rule = (Rule) container;
				E origin = rule.getMappings().getOrigin(element);
				if (origin==null) origin = element;
				
				// Multi-rule?
				E originInKernel = rule.getMultiMappings().getOrigin(origin);
				if (originInKernel!=null) {
					return getActionElement(originInKernel, helper);
				}
				return origin;
			}
			else if (container instanceof NestedCondition) {
				// Find the origin in the LHS:
				return getActionElement(((NestedCondition) container).getMappings().getOrigin(element), helper);
			}
			else {
				throw new RuntimeException("Graph neither contained in a Rule nor in a NestedCondition");
			}
			
			
		}
	}

}
