package at.ac.tuwien.big.momot.rule.parameter.random;

import at.ac.tuwien.big.moea.util.random.RandomString;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class RandomStringParameterValue implements IParameterValue<String> {

	private RandomString randomString;
	private String initialValue = null;
	
	public RandomStringParameterValue(Integer lowerBoundLength,
			Integer upperBoundLength) {
		randomString = new RandomString(lowerBoundLength, upperBoundLength);
	}
	
	public RandomStringParameterValue(Integer length) {
		this(length, length);
	}

	public RandomStringParameterValue() {
		this(1);
	}

	@Override
	public String nextValue() {
		String value = randomString.nextRandom();
		if(initialValue == null)
			initialValue = value;
		return value;
	}

	@Override
	public String getInitialValue() {
		return initialValue;
	}	
}
