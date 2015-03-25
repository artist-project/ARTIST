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
