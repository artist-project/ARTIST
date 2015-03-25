package at.ac.tuwien.big.momot.rule.parameter.increment;

import java.util.List;

import at.ac.tuwien.big.momot.rule.parameter.AbstractListValue;
import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class IncrementalListValue<T extends Object> extends AbstractListValue<T> implements IParameterValue<T> {

	private int index = 0;
	
	public IncrementalListValue(IParameterValue<T> value, int nrValues) {
		super(value, nrValues);
	}
	
	public IncrementalListValue(List<T> values) {
		super(values);
	}

	@Override
	protected int nextIndex() {
		int curIndex = index;
		index = (index + 1) % getValues().size();
		return curIndex;
	}
}
