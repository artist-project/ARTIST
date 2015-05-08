package at.ac.tuwien.big.momot.fitness.dimension;

import at.ac.tuwien.big.moea.fitness.dimension.SolutionLengthDimension;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchSolutionLengthDimension extends SolutionLengthDimension<MatchSolution> {

	public MatchSolutionLengthDimension() {
		this("SolutionLength");
	}
	
	public MatchSolutionLengthDimension(String name) {
		super(MatchSolution.class, name, FunctionType.Minimum);
		ignoreVariable(MatchPlaceholderVariable.class);
	}

}
