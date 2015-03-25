package at.ac.tuwien.big.momot.algorithm.local.neighborhood;

import at.ac.tuwien.big.moea.algorithm.local.neighborhood.AbstractSolutionGenerator;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractMatchSolutionIterator extends AbstractSolutionGenerator<MatchSolution> {

	public AbstractMatchSolutionIterator(MatchSolution baseSolution) {
		super(baseSolution);
	}
	
	public AbstractMatchSolutionIterator(MatchSolution baseSolution, int maxSolutions) {
		super(baseSolution, maxSolutions);
	}
}
