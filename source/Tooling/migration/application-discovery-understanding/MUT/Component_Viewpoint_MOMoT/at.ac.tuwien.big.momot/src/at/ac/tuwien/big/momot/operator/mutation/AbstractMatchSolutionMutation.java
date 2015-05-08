package at.ac.tuwien.big.momot.operator.mutation;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.operator.mutation.AbstractMutationVariation;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractMatchSolutionMutation extends AbstractMutationVariation {

	public AbstractMatchSolutionMutation() {
		super();
	}
	
	public AbstractMatchSolutionMutation(double probability) {
		super(probability);
	}

	@Override
	protected Solution[] doEvolve(Solution[] parents) {
		if(!(parents[0] instanceof MatchSolution))
			return new Solution[] { parents[0] };
		return new Solution[] { mutate(((MatchSolution)parents[0]).copy()) };
	}

	protected abstract MatchSolution mutate(MatchSolution mutant);

}
