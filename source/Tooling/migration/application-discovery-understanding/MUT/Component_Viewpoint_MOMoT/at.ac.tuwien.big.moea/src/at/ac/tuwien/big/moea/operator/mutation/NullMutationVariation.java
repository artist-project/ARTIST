package at.ac.tuwien.big.moea.operator.mutation;

import org.moeaframework.core.Solution;

public class NullMutationVariation extends AbstractMutationVariation {

	public NullMutationVariation(double probability) {
		super(probability);
	}

	@Override
	public Solution[] doEvolve(Solution[] parents) {
		Solution mutant = parents[0].copy();
		return new Solution[] { mutant };
	}

}
