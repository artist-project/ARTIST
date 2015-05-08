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

import java.util.Map;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ApplicationCondition;
import org.eclipse.emf.henshin.interpreter.matching.conditions.ConditionHandler;

/**
 * Solution finder. This is the internal realization of the match finder.
 * 
 * @author Enrico Biermann, Christian Krause
 */
public class SolutionFinder extends ApplicationCondition {
	
	// Attribute condition handler:
	protected final ConditionHandler conditionHandler;

	// Started flag:
	protected boolean started;
	
	// Next solution:
	protected Solution nextSolution;
		
	/**
	 * Default constructor.
	 * @param graph Target graph.
	 * @param variableDomainMap Variable domain map.
	 * @param conditionHandler Attribute condition handler.
	 */
	public SolutionFinder(EGraph graph, 
			Map<Variable, DomainSlot> variableDomainMap,
			ConditionHandler conditionHandler) {
		super(graph, variableDomainMap);
		this.conditionHandler = conditionHandler;
		this.started = false;
	}
	
	/**
	 * Find a new solution.
	 * @return <code>true</code> if a new solution was found.
	 */
	public boolean findSolution() {
		
		boolean matchIsPossible = false;
		if (!started) {
			started = true;
			matchIsPossible = true;
		} else {
			int varCount = variables.size();
			for (int i=varCount-1; i>=0; i--) {
				Variable var = variables.get(i);
				if (domainMap.get(var).unlock(var)) {
					matchIsPossible = true;
					break;
				} else {
					domainMap.get(var).clear(var);
				}
			}
		}
		
		if (matchIsPossible) {
			boolean success = findGraph();
			if (success) {
				nextSolution = new Solution(variables, domainMap, conditionHandler);
			}
			return success;
		}
		
		// No solution found.
		return false;
		
	}
	
	/**
	 * Returns the next solution. On consecutive calls other matches will be returned.
	 * @return A solution or <code>null</code> if no match exists.
	 */
	public Solution getNextSolution() {
		if (findSolution()) {
			return nextSolution;
		}
		return null;
	}
	
}
