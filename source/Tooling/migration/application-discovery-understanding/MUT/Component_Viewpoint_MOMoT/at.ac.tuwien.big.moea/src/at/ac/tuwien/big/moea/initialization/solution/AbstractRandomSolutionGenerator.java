package at.ac.tuwien.big.moea.initialization.solution;

import org.moeaframework.core.Solution;

public abstract class AbstractRandomSolutionGenerator<S extends Solution> extends AbstractSolutionGenerator<S> implements IRandomSolutionGenerator<S> {
	
	public AbstractRandomSolutionGenerator(int nrVariables, int nrObjectives,
			int nrConstraints) {
		super(nrVariables, nrObjectives, nrConstraints);
	}
	
	public AbstractRandomSolutionGenerator(int nrVariables, int nrObjectives) {
		super(nrVariables, nrObjectives, 0);
	}
	
	public S createRandomSolution() {
		return createRandomSolution(getNrVariables());
	}
	
	public S createRandomSolution(int nrVariables) {
		return createRandomSolution(nrVariables, getNrObjectives());
	}
	
	public S createRandomSolution(int nrVariables, int nrObjectives) {
		return createRandomSolution(nrVariables, nrObjectives, getNrConstraints());
	}
}
