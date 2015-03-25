package at.ac.tuwien.big.momot.rule.parameter.random;

import org.moeaframework.core.PRNG;

public class RandomIntegerValue extends AbstractRandomNumberValue<Integer> {

	private Integer initialValue = null;
	
	public RandomIntegerValue() {
		this(0, 1);
	}
	
	public RandomIntegerValue(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
	}

	@Override
	public Integer nextValue() {
		Integer toReturn = PRNG.nextInt(getLowerBound(), getUpperBound());
		if(initialValue == null)
			initialValue = new Integer(toReturn);
		return toReturn;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[" + getLowerBound() + "," + getUpperBound() + "]";
	}

	@Override
	public Integer getInitialValue() {
		return initialValue;
	}

}
