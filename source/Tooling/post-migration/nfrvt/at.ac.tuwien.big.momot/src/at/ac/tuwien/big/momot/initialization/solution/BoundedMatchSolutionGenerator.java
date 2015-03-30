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
package at.ac.tuwien.big.momot.initialization.solution;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.util.random.RandomInteger;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;

public class BoundedMatchSolutionGenerator extends MatchSolutionGenerator {

	private RandomInteger randomMatchBound;
	
	public BoundedMatchSolutionGenerator(int nrVariables, int nrObjectives,
			int nrConstraints, EGraph initialGraph, MatchHelper matchHelper,
			int lowerBound, int upperBound) {
		super(nrVariables, nrObjectives, nrConstraints, initialGraph, matchHelper);
		randomMatchBound = new RandomInteger(lowerBound, upperBound);
	}
	
	@Override
	protected ExecutionResult createRandomMatchExecution(int nrVariables) {
		return getMatchHelper().createRandomExecutionSequence(getInitialGraph(), nrVariables, randomMatchBound);
	}
}
