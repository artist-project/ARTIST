package at.ac.tuwien.big.momot.initialization.solution;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.initialization.solution.AbstractRandomSolutionGenerator;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class MatchSolutionGenerator extends AbstractRandomSolutionGenerator<MatchSolution> {

	private EGraph initialGraph;
	private MatchHelper matchHelper;

	public MatchSolutionGenerator(int nrVariables, int nrObjectives, int nrConstraints, EGraph initialGraph, MatchHelper matchHelper) {
		super(nrVariables, nrObjectives, nrConstraints);
		this.initialGraph = initialGraph;
		this.matchHelper = matchHelper;
	}	
	
	public MatchHelper getMatchHelper() {
		return matchHelper;
	}
		
	public EGraph getInitialGraph() {
		return initialGraph;
	}

	@Override
	public MatchSolution createNewSolution(int nrVariables, int nrObjectives, int nrConstraints) {
		return new MatchSolution(nrVariables, nrObjectives, nrConstraints);
	}

	protected ExecutionResult createRandomMatchExecution(int nrVariables) {
		return getMatchHelper().createRandomExecutionSequence(getInitialGraph(), nrVariables);
	}

	@Override
	public MatchSolution createRandomSolution(int nrVariables, int nrObjectives, int nrConstraints) {
		return createRandomMatchExecution(nrVariables).toMatchSolution(nrObjectives, nrConstraints);
	}
}
