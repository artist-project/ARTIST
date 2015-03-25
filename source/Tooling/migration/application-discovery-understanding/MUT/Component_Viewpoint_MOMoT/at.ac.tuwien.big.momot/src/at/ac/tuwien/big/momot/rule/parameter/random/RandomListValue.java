package at.ac.tuwien.big.momot.rule.parameter.random;

import java.util.List;

import at.ac.tuwien.big.moea.util.random.RandomInteger;
import at.ac.tuwien.big.momot.rule.parameter.AbstractListValue;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class RandomListValue<T extends Object> extends AbstractListValue<T> implements IParameterValue<T> {

	private RandomInteger index;
	
	public RandomListValue(IParameterValue<T> value, int nrValues) {
		this(generateList(value, nrValues));
	}
	
	public RandomListValue(List<T> values) {
		super(values);
		this.index = new RandomInteger(0, values.size() - 1);
	}

	@Override
	protected int nextIndex() {
		return index.nextRandom();
	}
}
