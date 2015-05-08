/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.momot.match;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.engine.MomotEngine;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.util.MomotUtil;
import at.ac.tuwien.big.momot.variable.IMatchVariable;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchExecutor {
	
	private Engine engine;
	private ParameterManager parameterManager;

	public MatchExecutor(ParameterManager parameterManager) {
		this(new MomotEngine(false), parameterManager);
	}
	
	public MatchExecutor(Engine engine, ParameterManager parameterManager) {
		this.engine = engine;
		this.parameterManager = parameterManager;
	}	
	
	public Engine getEngine() {
		return engine;
	}
	
	public ParameterManager getParameterManager() {
		return parameterManager;
	}
	
	protected  boolean executeInternal(EGraph graph, Assignment assignment) {
		return executeInternal(graph, assignment, null);
	}
	
	protected  boolean executeInternal(EGraph graph, Assignment assignment, ApplicationMonitor monitor) {
		if(assignment == null)
			return false;
		if(assignment instanceof MatchPlaceholderVariable)
			return true;
		
		UnitApplication	application = new UnitApplicationImpl(
				engine, 
				graph, 
				assignment.getUnit(), 
				assignment);
		return application.execute(monitor);
	}
	
	
	public ExecutionResult execute(EGraph original, Assignment assignment, ApplicationMonitor monitor) {
		EGraph result = MomotUtil.copy(original);
		boolean success = executeInternal(result, assignment, monitor);
		return new ExecutionResult(original, result, assignment, success);
	}
	
	public ExecutionResult execute(EGraph graph, Assignment assignment) {
		return execute(graph, assignment, null);
	}
	
	
	public ExecutionResult execute(EGraph original, List<? extends Assignment> assignments, ApplicationMonitor monitor) {		
		EGraph result = MomotUtil.copy(original);
		List<? extends Assignment> nonNullMatches = new ArrayList<>(assignments);
		CollectionUtil.removeNull(nonNullMatches);
		
		Boolean[] success = new Boolean[nonNullMatches.size()];
		for(int i = 0; i < nonNullMatches.size(); i++)
			success[i] = executeInternal(result, nonNullMatches.get(i), monitor);
		return new ExecutionResult(original, result, nonNullMatches, success);
	}
	
	public ExecutionResult execute(EGraph original, List<? extends Assignment> assignments) {
		return execute(original, assignments, null);
	}
	
	
	public ExecutionResult execute(EGraph original, MatchSolution solution) {
		List<IMatchVariable> matches = new ArrayList<>(solution.getMatchVariables());
		matches.addAll(solution.getResultMutations());
		return execute(original, matches);
	}
	
	
	public ExecutionResult appendRandomExecutionSequence(ExecutionResult result, int nrMatches, MatchFinder finder) {
		ExecutionResult extension = createRandomExecutionSequence(result.getResultGraph(), nrMatches, finder);
		return result.append(extension);
	}
	
	public ExecutionResult createRandomExecutionSequence(EGraph initialGraph, int nrMatches, MatchFinder finder) {
		EGraph resultGraph = MomotUtil.copy(initialGraph);
		
		List<Assignment> executedMatches = new ArrayList<>();
		List<Boolean> executionSuccess = new ArrayList<>();
		
		Assignment randomMatch = null;
		while(executedMatches.size() < nrMatches) {
			randomMatch = finder.findMatch(resultGraph);
			if(randomMatch == null) 
				break;
			
			executionSuccess.add(executeInternal(resultGraph, randomMatch));
			executedMatches.add(getParameterManager().cleanMatch(randomMatch));
		}
		
		return new ExecutionResult(initialGraph, 
				resultGraph, 
				executedMatches, 
				executionSuccess.toArray(new Boolean[] {})).fillWithPlaceholders(nrMatches);
	}
	
	public ExecutionResult createRandomExecutionSequence(EGraph initialGraph, int nrMatches, MatchFinder finder, Number ruleSearchLimit) {
		if(ruleSearchLimit == null)
			return createRandomExecutionSequence(initialGraph, nrMatches, finder);
		
		EGraph resultGraph = MomotUtil.copy(initialGraph);
		
		List<Assignment> executedMatches = new ArrayList<>(nrMatches);
		List<Boolean> executionSuccess = new ArrayList<>();
		
		List<? extends Assignment> matches = new ArrayList<>(nrMatches);
		Assignment randomMatch = null;
		while(executedMatches.size() < nrMatches) {
			matches = finder.findMatches(resultGraph, ruleSearchLimit.intValue());
			randomMatch = CollectionUtil.getRandomElement(matches);
			if(randomMatch == null) 
				break;
			
			executionSuccess.add(executeInternal(resultGraph, randomMatch));
			executedMatches.add(getParameterManager().cleanMatch(randomMatch));
		}
		
		return new ExecutionResult(initialGraph, 
				resultGraph, 
				executedMatches, 
				executionSuccess.toArray(new Boolean[] {})).fillWithPlaceholders(nrMatches);
	}
}
