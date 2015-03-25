package at.ac.tuwien.big.moea.util.random;

import org.apache.commons.lang.RandomStringUtils;

public class RandomString implements IRandomGenerator<String> {

	RandomInteger randomInteger;
	
	public RandomString(int lowerBoundLength, int upperBoundLength) {
		randomInteger = new RandomInteger(lowerBoundLength, upperBoundLength);
	}
	
	public RandomString(int length) {
		this(length, length);
	}

	@Override
	public String nextRandom() {
		return RandomStringUtils.random(randomInteger.nextRandom());
	}
}
