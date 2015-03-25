package at.ac.tuwien.big.momot.solution.repair;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchPlaceholderSolutionRepairer extends AbstractMatchSolutionRepairer {

	@Override
	protected MatchSolution repair(MatchSolution solution,
			ExecutionResult result) {
		for(int i = 0; i < solution.getNumberOfVariables(); i++)
			if(!result.hasExecuted(i)) {
				solution.setVariable(i, new MatchPlaceholderVariable());
				result.getMatchExecutionSuccess()[i] = true;
			}
		return solution;
	}	
}
