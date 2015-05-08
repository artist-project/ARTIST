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
package at.ac.tuwien.big.momot.problem;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;

import at.ac.tuwien.big.moea.initialization.solution.ISolutionGenerator;
import at.ac.tuwien.big.moea.problem.MOEAProblem;
import at.ac.tuwien.big.momot.fitness.IEGraphFitnessFunction;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class ModelTransformationProblem extends MOEAProblem<MatchSolution> implements ITransformationProblem {

	public ModelTransformationProblem(
			IEGraphFitnessFunction fitnessFunction,
			ISolutionGenerator<MatchSolution> solutionGenerator) {
		super(fitnessFunction, solutionGenerator);
	}
	
	@Override
	public IEGraphFitnessFunction getFitnessFunction() {
		return (IEGraphFitnessFunction) super.getFitnessFunction();
	}
	
	public ExecutionResult execute(MatchSolution solution) {
		return solution.execute(getFitnessFunction());
	}
	
	public MatchHelper getMatchHelper() {
		if(getFitnessFunction() == null)
			return null;
		return getFitnessFunction().getMatchHelper();
	}
	
	public Engine getEngine() {
		MatchHelper matchHelper = getMatchHelper();
		if(matchHelper == null)
			return null;
		return matchHelper.getEngine();
	}
	
	public EGraph getInitialGraph() {
		if(getFitnessFunction() == null)
			return null;
		return getFitnessFunction().getInitialGraph();
	}
}
