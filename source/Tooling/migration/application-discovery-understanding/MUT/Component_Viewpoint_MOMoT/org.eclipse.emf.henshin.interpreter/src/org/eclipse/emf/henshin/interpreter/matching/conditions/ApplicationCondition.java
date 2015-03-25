/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.interpreter.matching.conditions;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.matching.constraints.DomainSlot;
import org.eclipse.emf.henshin.interpreter.matching.constraints.Variable;

/**
 * Application condition.
 * @author Enrico Biermann, Christian Krause
 */
public class ApplicationCondition implements IFormula {
	
	// Target graph:
	public final EGraph graph;

	// Domain map:
	public final Map<Variable, DomainSlot> domainMap;

	// Formula:
	public IFormula formula;

	// Variables:
	public List<Variable> variables;
	
	/**
	 * Default constructor.
	 * @param graph Target graph.
	 * @param domainMap Domain map.
	 */
	public ApplicationCondition(EGraph graph, Map<Variable, DomainSlot> domainMap) {
		this.domainMap = domainMap;
		this.graph = graph;
	}
	
	/**
	 * Find a graph.
	 * @return <code>true</code> if a graph was found.
	 */
	public boolean findGraph() {
		for (Variable var : variables) {
			if (!var.typeConstraint.instantiationPossible(domainMap.get(var), graph)) {
				return false;
			}
		}
		return findMatch(0);
	}
	
	/**
	 * Finds a match for the variable at the given index in the LHS-variables vector.
	 */
	protected boolean findMatch(int index) {
		
		// Matched all variables?
		if (index==variables.size()) {
			
			// Final variable re-checks:
			for (Variable variable : variables) {
				if (variable.requiresFinalCheck) {
					DomainSlot slot = domainMap.get(variable);
					if (!slot.recheck(variable, domainMap)) {
						return false;
					}
				}
			}
			
			// Evaluate formula:
			return formula.eval();
			
		}
		
		// Otherwise try to match the last variable:
		Variable variable = variables.get(index);
		DomainSlot slot = domainMap.get(variable);
		
		boolean valid = false;
		while (!valid) {
			valid = slot.instantiate(variable, domainMap, graph);
			if (valid) {
				valid = findMatch(index + 1);  // recursion
			}
			if (!valid) {
				slot.unlock(variable);
				if (!slot.instantiationPossible()) {
					slot.clear(variable);
					return false;
				}
			}
		}
		
		// Found a match.
		return true;
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.matching.conditions.IFormula#eval()
	 */
	@Override
	public boolean eval() {
		
		// Find a graph:
		boolean result = findGraph();
		
		// Reset the variables:
		for (Variable var : variables) {
			domainMap.get(var).reset(var);
		}
		
		// Done.
		return result;
		
	}
	
}