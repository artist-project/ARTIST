package at.ac.tuwien.big.moea.fitness.dimension;

import org.moeaframework.core.Solution;

public class MinimumSolutionLengthDimension<S extends Solution> extends SolutionLengthDimension<S> {

	private int minimum;

	public MinimumSolutionLengthDimension(Class<S> solutionClazz, String name, int minimum) {
		super(solutionClazz, name);
		this.setMinimum(minimum);
	}	

	@Override
	public double evaluate(S solution) {
		double nrSolutions = super.evaluate(solution);
		if(nrSolutions < getMinimum())
			return getMinimum() - nrSolutions;
		return CONSTRAINT_OK;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
}
