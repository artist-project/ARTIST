package at.ac.tuwien.big.momot.rule.parameter.fix;

import org.eclipse.emf.henshin.model.Parameter;

import at.ac.tuwien.big.momot.rule.parameter.IParameterValue;

public class FixValue<T extends Object> implements IParameterValue<T> {
	private T value;
	
	public FixValue(Parameter parameter, T value) {
		this.value = value;
	}
	
	public FixValue(T value) {
		this(null, value);
	}
	
	@Override
	public T nextValue() {
		return value;
	}
	
	protected void setValue(T value) {
		this.value = value;
	}

	@Override
	public T getInitialValue() {
		return value;
	}
	
}
