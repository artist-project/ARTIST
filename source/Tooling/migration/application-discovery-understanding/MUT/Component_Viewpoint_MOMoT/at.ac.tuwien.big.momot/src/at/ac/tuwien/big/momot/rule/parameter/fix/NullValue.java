package at.ac.tuwien.big.momot.rule.parameter.fix;

import org.eclipse.emf.henshin.model.Parameter;

public class NullValue extends FixValue<Object> {

	public NullValue(Parameter parameter) {
		super(parameter, null);
	}
	
	public NullValue() {
		this(null);
	}

}
