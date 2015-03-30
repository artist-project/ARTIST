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

import java.util.List;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;

import at.ac.tuwien.big.momot.engine.MomotEngine;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class MatchHelper {
	
	private MatchFinder matchFinder;
	private MatchExecutor matchExecutor;
	private ParameterManager parameterManager;
	private Engine engine;

	public MatchHelper(ParameterManager parameterManager) {
		this(new MomotEngine(false), parameterManager);
	}
	
	public MatchHelper(Engine engine, ParameterManager parameterManager) {
		this.engine = engine;
		this.parameterManager = parameterManager;
		this.matchFinder = new MatchFinder(engine, parameterManager);
		this.matchExecutor = new MatchExecutor(engine, parameterManager);
	}
	
	protected MatchExecutor getMatchExecutor() {
		return matchExecutor;
	}
	
	protected MatchFinder getMatchFinder() {
		return matchFinder;
	}
	
	public ParameterManager getParameterManager() {
		return parameterManager;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public ExecutionResult execute(EGraph original, Assignment assignment, ApplicationMonitor monitor) {
		return getMatchExecutor().execute(original, assignment, monitor);
	}
	
	public ExecutionResult execute(EGraph original, Assignment assignment) {
		return getMatchExecutor().execute(original, assignment);
	}
	
	public ExecutionResult execute(EGraph original, List<? extends Assignment> assignments, ApplicationMonitor monitor) {
		return getMatchExecutor().execute(original, assignments, monitor);
	}
	
	public ExecutionResult execute(EGraph original, List<? extends Assignment> assignments) {
		return getMatchExecutor().execute(original, assignments);
	}
	
	public ExecutionResult execute(EGraph original, MatchSolution solution) {
		return getMatchExecutor().execute(original, solution);
	}
	
	public ExecutionResult appendRandomExecutionSequence(ExecutionResult result, int nrMatches) {
		return getMatchExecutor().appendRandomExecutionSequence(result, nrMatches, getMatchFinder());
	}
	
	public ExecutionResult createRandomExecutionSequence(EGraph initialGraph, int nrMatches) {
		return getMatchExecutor().createRandomExecutionSequence(initialGraph, nrMatches, getMatchFinder());
	}
	
	public ExecutionResult createRandomExecutionSequence(EGraph initialGraph, int nrMatches, Number ruleSearchLimit) {
		return getMatchExecutor().createRandomExecutionSequence(initialGraph, nrMatches, getMatchFinder(), ruleSearchLimit);
	}
	
	public Match findMatch(EGraph graph) {
		return getMatchFinder().findMatch(graph);
	}
	
	public Match findMatch(EGraph graph, int nrTriesPerRule) {
		return getMatchFinder().findMatch(graph, nrTriesPerRule);
	}
	
	public List<Match> findMatches(EGraph graph) {
		return getMatchFinder().findMatches(graph);
	}
	
	public List<Match> findMatches(EGraph graph, int nrTriesPerRule) {
		return getMatchFinder().findMatches(graph, nrTriesPerRule);
	}
}
