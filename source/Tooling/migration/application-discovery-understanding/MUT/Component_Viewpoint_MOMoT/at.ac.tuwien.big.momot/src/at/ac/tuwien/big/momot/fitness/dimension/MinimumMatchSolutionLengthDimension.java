package at.ac.tuwien.big.momot.fitness.dimension;

import at.ac.tuwien.big.moea.fitness.dimension.MinimumSolutionLengthDimension;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MinimumMatchSolutionLengthDimension extends MinimumSolutionLengthDimension<MatchSolution> {

	public MinimumMatchSolutionLengthDimension(String name, int minimum) {
		super(MatchSolution.class, name, minimum);
		ignoreVariable(MatchPlaceholderVariable.class);
	}
	
	public MinimumMatchSolutionLengthDimension(int minimum) {
		this("MinimumSolutionLength", minimum);
	}

}
