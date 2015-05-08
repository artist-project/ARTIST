/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ConditionHandler;
import org.eclipse.emf.henshin.interpreter.matching.conditions.IFormula;
import org.eclipse.emf.henshin.interpreter.matching.constraints.AttributeConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot;
import org.eclipse.emf.henshin.interpreter.matching.constraints.ReferenceConstraint;
import org.eclipse.emf.henshin.interpreter.matching.constraints.SolutionFinder;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Variable;

/**
 * A graph isomorphy checker for {@link EGraph}s.
 * @author Christian Krause
 */
public class EGraphIsomorphyChecker {
	
	// Attribute condition handles (used internally for the match finding):
	private static final ConditionHandler ATTRIBUTE_CONDITION_HANDLER;

	// Initialize static members:
	static {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
		ATTRIBUTE_CONDITION_HANDLER = new ConditionHandler(new HashMap<String, Collection<String>>(), engine);
	}
	
	// The source graph:
	private final EGraph source;
	
	// Number of links in the source graph:
	private int linkCount;
	
	// Ignored attributes:
	private final List<EAttribute> ignoredAttributes;
	
	// Object variables map:
	private Map<EObject, Variable> variablesMap;
	
	// Variables as a list:
	private List<Variable> variablesList;
	
	/**
	 * Default constructor.
	 * @param source Source graph.
	 * @param useAttributes Flag indicating whether attribute values should be used.
	 */
	public EGraphIsomorphyChecker(final EGraph source, List<EAttribute> ignoredAttributes) {
		this.source = source;
		this.ignoredAttributes = ignoredAttributes;
		this.linkCount = InterpreterUtil.countEdges(source);
		initVariables();
	}
	
	/*
	 * Initialize variables.
	 */
	private void initVariables() {
		
		// Instantiate variables map and list:
		int objectCount = source.size();
		variablesMap = new HashMap<EObject, Variable>(objectCount);
		variablesList = new ArrayList<Variable>(objectCount);
		
		// Create a variable for every object:
		for (EObject object : source) {
			Variable variable = new Variable(object.eClass(), true);
			variablesMap.put(object, variable);
			variablesList.add(variable);
		}

		// Create constraints:
		for (Map.Entry<EObject, Variable> entry : variablesMap.entrySet()) {
			EObject object = entry.getKey();
			Variable variable = entry.getValue();
			
			// Create attribute constraints if necessary:
			for (EAttribute attr : object.eClass().getEAllAttributes()) {
				if (ignoredAttributes==null || !ignoredAttributes.contains(attr)) {
					variable.attributeConstraints.add(new AttributeConstraint(attr, object.eGet(attr), true));
				}
			}
			
			// Create reference constraints:
			for (EReference ref : object.eClass().getEAllReferences()) {
				if (ref.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> targets = (EList<EObject>) object.eGet(ref);
					for (EObject target : targets) {
						variable.referenceConstraints.add(new ReferenceConstraint(variablesMap.get(target), ref));
					}
				} else {
					EObject target = (EObject) object.eGet(ref);
					if (target!=null) {
						variable.referenceConstraints.add(new ReferenceConstraint(variablesMap.get(target), ref));
					}
				}
			}	
		}
		
	}
	
	/**
	 * Check whether the argument graph is isomorphic to the source graph.
	 * @param graph Graph for which you want to check isomorphy.
	 * @param partialMatch Optional partial match from source to the argument graph.
	 * @return <code>true</code> if the source and the graph are isomorphic.
	 */
	public boolean isIsomorphicTo(EGraph graph, Map<EObject,EObject> partialMatch) {
		
		// We do a quick comparison of the object count first:
		if (source.size()!=graph.size()) {
			return false;
		}
		
		// Create the domain map:
		Map<Variable, DomainSlot> domainMap = new HashMap<Variable, DomainSlot>();
		
		// Create the domain slots:
		for (Map.Entry<EObject, Variable> entry : variablesMap.entrySet()) {
			DomainSlot domainSlot = new DomainSlot(ATTRIBUTE_CONDITION_HANDLER, 
					new HashSet<EObject>(), true, false, true, true);
			if (partialMatch!=null) {
				EObject match = partialMatch.get(entry.getKey());
				if (match!=null) {
					domainSlot.fixInstantiation(match);
				}
			}
			domainMap.put(entry.getValue(), domainSlot);
		}

		// Create the match finder:
		SolutionFinder matchFinder = new SolutionFinder(graph, domainMap, ATTRIBUTE_CONDITION_HANDLER);
		matchFinder.variables = variablesList;
		matchFinder.formula = IFormula.TRUE;
		
		// Try to find a match:
		if (!matchFinder.findSolution()) {
			return false;
		}
		
		// We still need to verify that the link count is the same:
		if (linkCount!=InterpreterUtil.countEdges(graph)) {
			return false;
		}
		
		// No reason why they shouldn't be isomorphic:
		return true;
		
	}
	
}
