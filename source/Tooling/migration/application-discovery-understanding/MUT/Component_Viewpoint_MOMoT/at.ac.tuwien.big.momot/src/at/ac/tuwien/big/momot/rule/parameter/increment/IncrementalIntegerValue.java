package at.ac.tuwien.big.momot.rule.parameter.increment;

import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class IncrementalIntegerValue implements IParameterValue<Integer> {

	private int initialValue;
	private int curValue;
	private int step;
	
	public IncrementalIntegerValue() {
		this(0, 1);
	}
	
	public IncrementalIntegerValue(int initialValue) {
		this(initialValue, 1);
	}
	
	public IncrementalIntegerValue(int initialValue, int step) {
		this.initialValue = initialValue;
		this.curValue = initialValue;
		this.step = step;
	}
	
	public int getStartValue() {
		return initialValue;
	}
	
	public int getStep() {
		return step;
	}
	
	public int getCurrentValue() {
		return curValue;
	}
	
	@Override
	public Integer nextValue() {
		int returnValue = curValue;
		curValue += step;
		return returnValue;
	}

	@Override
	public Integer getInitialValue() {
		return initialValue;
	}	

}
