package at.ac.tuwien.big.momot.rule.parameter;


public interface IParameterValue<T extends Object> {
	T nextValue();
	T getInitialValue();
}
