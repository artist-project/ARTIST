package at.ac.tuwien.big.moea.operator.mutation;

import at.ac.tuwien.big.moea.operator.AbstractProbabilityVariation;


public abstract class AbstractMutationVariation extends AbstractProbabilityVariation implements IMutationVariation {
	
	public AbstractMutationVariation() {
	}
	
	public AbstractMutationVariation(double probability) {
		super(probability);
	}
	
	@Override
	public int getArity() {
		return 1;
	}
}
