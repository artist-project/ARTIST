package at.ac.tuwien.big.moea.operator.crossover;

import at.ac.tuwien.big.moea.operator.AbstractProbabilityVariation;

public abstract class AbstractParentalCrossoverVariation extends AbstractProbabilityVariation implements ICrossoverVariation {

	public AbstractParentalCrossoverVariation() {
		super();
	}
	
	public AbstractParentalCrossoverVariation(double probability) {
		super(probability);
	}
	
	@Override
	public int getArity() {
		return 2;
	}

}
