package at.ac.tuwien.big.moea.fitness.comparator;

import org.moeaframework.core.Solution;

public class ConstraintFitnessComparator<S extends Solution> extends AbstractFitnessComparator<Double, S> {

	private int constraintIndex = 0;
	
	public ConstraintFitnessComparator(int constraintIndex) {
		this.constraintIndex = constraintIndex;
	}
	
	public int getConstraintIndex() {
		return constraintIndex;
	}
	
	@Override
	public Double getValue(S solution) {
		if(getConstraintIndex() >= solution.getNumberOfConstraints())
			throw new IllegalArgumentException("Solution does not have " + getConstraintIndex() + 1 + " constraints.");
		return solution.getConstraint(getConstraintIndex());
	}
}
