package at.ac.tuwien.big.momot.variable;

import org.eclipse.emf.henshin.interpreter.Assignment;
import org.moeaframework.core.Variable;

public interface IMatchVariable extends Assignment, Variable, Comparable<IMatchVariable> {
	@Override
	public IMatchVariable copy();
}
