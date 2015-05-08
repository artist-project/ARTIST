package at.ac.tuwien.big.moea.util.random;

import java.util.HashSet;
import java.util.Set;

public class BlackListRandomInteger extends RandomInteger {
	private static final long serialVersionUID = -4132618436861069750L;

	private Set<Integer> blackList = new HashSet<>();

	public BlackListRandomInteger() {
		super();
	}

	public BlackListRandomInteger(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
	}
	
	public BlackListRandomInteger addToBlackList(int number) {
		if(number < getLowerBound() || number > getUpperBound())
			return this;
		blackList.add(number);
		return this;
	}
	
	public int getRange() {
		return getUpperBound() - getLowerBound() + 1;
	}
	
	@Override
	public Integer nextRandom() {
		return nextRandom(false);
	}
	
	public Integer nextRandom(boolean addToBlackList) {
		if(blackList.size() == getRange())
			return null;
		Integer random = super.nextRandom();
		while(blackList.contains(random))
			random = super.nextRandom();
		if(addToBlackList)
			addToBlackList(random);
		return random;
	}
}
