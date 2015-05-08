package at.ac.tuwien.big.momot.rule.parameter.random;

import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public abstract class AbstractRandomNumberValue<T extends Number> implements IParameterValue<T> {

	private T lowerBound;
	private T upperBound;
	
	public AbstractRandomNumberValue(T lowerBound, T upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		checkBounds();
	}
	
	public T getLowerBound() {
		return lowerBound;
	}

	public T getUpperBound() {
		return upperBound;
	}
	
	public void checkBounds() {
		if(getLowerBound() == null)
			throw new IllegalArgumentException("Lower bound must not be null.");
		if(getUpperBound() == null)
			throw new IllegalArgumentException("Upper bound must not be null.");
		if(getLowerBound().doubleValue() > getUpperBound().doubleValue())
			throw new IllegalArgumentException("Lower bound must not be greater than upper bound.");
	}

}
