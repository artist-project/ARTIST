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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.emf.henshin.interpreter.Assignment;
import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.util.CollectionUtil;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class ExecutionResult implements Serializable {
	
	private static final long serialVersionUID = -2756967648743472758L;

	private EGraph initialGraph;
	private EGraph resultGraph;
	private List<Assignment> matches;
	private Boolean[] success;

	public ExecutionResult(ExecutionResult result) {
		this(result.getInitialGraph(), result.getResultGraph(), result.getMatches(), result.getMatchExecutionSuccess());
	}
	
	public ExecutionResult(EGraph initialGraph, EGraph resultGraph, Assignment match, boolean success) {
		this(initialGraph, resultGraph, CollectionUtil.newList(match), new Boolean[] { success });
	}
	
	public ExecutionResult(EGraph initialGraph, EGraph resultGraph, List<? extends Assignment> matches, Boolean[] success) {
		this.initialGraph = initialGraph;
		this.resultGraph = resultGraph;
		if(matches.size() != success.length)
			throw new IllegalArgumentException("Matches and execution success must be of equal size.");
		for(int i = 0; i < matches.size(); i++) {
			if(matches.get(i) == null)
				throw new IllegalArgumentException("No null matches allowed, use placeholders instead.");
			if(success[i] == null)
				throw new IllegalArgumentException("No null success values, use false as default instead.");
		}
		this.matches = new ArrayList<>(matches);
		this.success = success;
	}
	
	public EGraph getInitialGraph() {
		return initialGraph;
	}

	public EGraph getResultGraph() {
		return resultGraph;
	}

	public List<? extends Assignment> getMatches() {
		return matches;
	}
	
	public int getNrMatches() {
		if(getMatches() == null)
			return 0;
		return getMatches().size();
	}

	public Boolean[] getMatchExecutionSuccess() {
		return success;
	}
	
	public boolean hasResult() {
		return getResultGraph() != null;
	}
	
	public boolean hasExecuted() {
		for(boolean s : getMatchExecutionSuccess())
			if(!s)
				return false;
		return true;
	}
	
	public boolean hasExecuted(int matchNr) {
		if(matchNr >= getMatchExecutionSuccess().length)
			return false;
		
		return getMatchExecutionSuccess()[matchNr];
	}	
	
	public MatchSolution toMatchSolution(int nrObjectives, int nrConstraints) {
		MatchSolution solution = new MatchSolution(getMatches(), nrObjectives, nrConstraints); 
		solution.storeExecutionResult(this);
		solution.storeMatchExecutionSuccess(getMatchExecutionSuccess());
		return solution;
	}
	
	public MatchSolution toMatchSolution(int nrObjectives) {
		return toMatchSolution(nrObjectives, 0);
	}
	
	public ExecutionResult fillWithPlaceholders(int nrMatches) {
		if(getNrMatches() > nrMatches)
			return this;
		
		Boolean[] newSuccess = new Boolean[nrMatches];
		for(int i = 0; i < success.length; i++)
			newSuccess[i] = success[i];
		List<Assignment> newMatches = new ArrayList<>(matches);
		
		if(getMatches().size() == 0) {
			while(newMatches.size() < nrMatches) {
				newSuccess[newMatches.size()] = true;
				newMatches.add(new MatchPlaceholderVariable());
			}
		} else {
			// assign placeholders at random positions until nrMatches is reached
			// random, because if we only put them at the end, it may effect
			// the success of crossover etc.
			Random rand = new Random();
			while(newMatches.size() < nrMatches) {
				int randomIndex = rand.nextInt(newMatches.size());
				
				newSuccess[newMatches.size()] = newSuccess[randomIndex];
				newSuccess[randomIndex] = true;
				newMatches.add(randomIndex, new MatchPlaceholderVariable());
			}
		}
		this.matches = newMatches;
		this.success = newSuccess;
		return this;
	}
	
	public ExecutionResult removePlaceholders() {
		List<Integer> kept = new ArrayList<>();
		List<Assignment> newMatches = new ArrayList<>();
		for(int i = 0; i < getNrMatches(); i++) {
			if(matches.get(i) != null && !(matches.get(i) instanceof MatchPlaceholderVariable)) {
				newMatches.add(matches.get(i));
				kept.add(i);
			}
		}
		matches = newMatches;
		
		Boolean[] newSuccess = new Boolean[kept.size()];
		for(int i = 0; i < kept.size(); i++)
			newSuccess[i] = success[kept.get(i)];
		success = newSuccess;
		return this;
	}
	
	public ExecutionResult append(ExecutionResult result) {
		this.matches.addAll(result.getMatches());
		this.success = (Boolean[]) ArrayUtils.addAll(this.success, result.getMatchExecutionSuccess());
		this.resultGraph = result.getResultGraph();
		return this;
	}
		
	@Override
	public String toString() {
		return getMatches() + "\n";
	}
	
	public static ExecutionResult merge(ExecutionResult firstResult, ExecutionResult secondResult) {
		List<Assignment> executedMatches = new ArrayList<>(firstResult.getMatches());
		for(Assignment m : secondResult.getMatches())
			executedMatches.add(m);
		
		Boolean[] executionSuccess = (Boolean[]) ArrayUtils.addAll(
				firstResult.getMatchExecutionSuccess(), 
				secondResult.getMatchExecutionSuccess());
		
		return new ExecutionResult(
				firstResult.getInitialGraph(), 
				secondResult.getResultGraph(), 
				executedMatches,
				executionSuccess);
	}
}
