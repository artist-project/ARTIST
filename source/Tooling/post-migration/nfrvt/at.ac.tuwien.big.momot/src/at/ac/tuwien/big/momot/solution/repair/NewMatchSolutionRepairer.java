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
package at.ac.tuwien.big.momot.solution.repair;

import java.util.List;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.IMatchVariable;

public class NewMatchSolutionRepairer extends AbstractMatchSolutionRepairer {

	private MatchHelper matchHelper;

	public NewMatchSolutionRepairer(MatchHelper matchHelper) {
		this.matchHelper = matchHelper;
	}

	public MatchHelper getMatchHelper() {
		return matchHelper;
	}
	
	@Override
	protected MatchSolution repair(MatchSolution solution,
			ExecutionResult result) {
		
		int firstNotExecuted = 0;
		while(result.hasExecuted(firstNotExecuted))
			firstNotExecuted++;

		
		List<IMatchVariable> executed = solution.getMatchVariables().subList(0, firstNotExecuted);
		int nrToExecute = solution.getNumberOfVariables() - executed.size();
		if(nrToExecute > 0) {
			ExecutionResult firstResult = getMatchHelper().execute(result.getInitialGraph(), executed);
			ExecutionResult secondResult = getMatchHelper().createRandomExecutionSequence(firstResult.getResultGraph(), nrToExecute);
			
			solution.storeExecutionResult(ExecutionResult.merge(firstResult, secondResult));
		}
		return solution;
	}
	

}
