package at.ac.tuwien.big.momot.solution.repair;

import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractMatchSolutionRepairer implements IMatchSolutionRepairer {

	@Override
	public MatchSolution repair(MatchSolution solution) {
		ExecutionResult result = solution.getStoredExecutionResult();
		if(result == null)
			return solution;
		return repair(solution, result);
	}

	protected abstract MatchSolution repair(MatchSolution solution, ExecutionResult result);
}
