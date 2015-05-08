package at.ac.tuwien.big.momot.algorithm.local.neighborhood;

import at.ac.tuwien.big.moea.algorithm.local.neighborhood.AbstractNeighborhood;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractMatchSolutionNeighborhood extends AbstractNeighborhood<MatchSolution> {

	public AbstractMatchSolutionNeighborhood(MatchSolution baseSolution) {
		super(baseSolution);
	}
	
	public AbstractMatchSolutionNeighborhood(MatchSolution baseSolution, int maxNeighbors) {
		super(baseSolution, maxNeighbors);
	}

}
