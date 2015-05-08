package at.ac.tuwien.big.momot.rule.parameter.increment;

import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class IncrementalDoubleValue implements IParameterValue<Double> {

	private double initialValue;
	private double curValue;
	private double step;
	
	public IncrementalDoubleValue() {
		this(0.0, 1.0);
	}
	
	public IncrementalDoubleValue(double initialValue) {
		this(initialValue, 1.0);
	}
	
	public IncrementalDoubleValue(double initialValue, double step) {
		this.initialValue = initialValue;
		this.curValue = initialValue;
		this.step = step;
	}
		
	public double getStep() {
		return step;
	}
	
	public double getCurrentValue() {
		return curValue;
	}
	
	@Override
	public Double nextValue() {
		double returnValue = curValue;
		curValue += step;
		return returnValue;
	}

	@Override
	public Double getInitialValue() {
		return initialValue;
	}	
}
