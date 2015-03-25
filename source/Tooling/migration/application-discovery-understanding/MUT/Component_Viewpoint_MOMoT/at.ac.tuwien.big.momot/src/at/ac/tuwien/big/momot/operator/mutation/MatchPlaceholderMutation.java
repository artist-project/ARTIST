package at.ac.tuwien.big.momot.operator.mutation;

import at.ac.tuwien.big.moea.util.MathUtil;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.variable.MatchPlaceholderVariable;

public class MatchPlaceholderMutation extends AbstractMatchSolutionMutation {

	public MatchPlaceholderMutation(double probability) {
		super(probability);
	}
	
	@Override
	protected MatchSolution mutate(MatchSolution mutant) {
		int randomVariable = MathUtil.randomInteger(mutant.getNumberOfVariables());
		mutant.setVariable(randomVariable, new MatchPlaceholderVariable());
		return mutant;
	}

}
