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
