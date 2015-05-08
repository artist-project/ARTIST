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
package at.ac.tuwien.big.momot.operator.mutation;

import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Rule;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.problem.ModelTransformationProblem;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class ResultGraphMutation extends AbstractMatchSolutionMutation {

	private ModelTransformationProblem problem;
	private Rule rule;

	public ResultGraphMutation(double probability, Rule rule, ModelTransformationProblem problem) {
		super(probability);
		this.rule = rule;
		this.problem = problem;
	}

	public ModelTransformationProblem getProblem() {
		return problem;
	}
	
	public Rule getRule() {
		return rule;
	}

	@Override
	protected MatchSolution mutate(MatchSolution mutant) {
		ExecutionResult execute = mutant.execute(getProblem());
		
		Iterable<Match> allMatches = getProblem().getEngine().findMatches(rule, execute.getResultGraph(), null);
		Match randomMatch = allMatches.iterator().next();
		if(randomMatch != null)
			mutant.addResultMutation(randomMatch);
		return mutant;
	}
	
}
