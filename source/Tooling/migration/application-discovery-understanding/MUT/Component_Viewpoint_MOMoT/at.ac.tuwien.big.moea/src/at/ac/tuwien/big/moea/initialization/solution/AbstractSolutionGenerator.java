package at.ac.tuwien.big.moea.initialization.solution;

import org.moeaframework.core.Solution;

public abstract class AbstractSolutionGenerator<S extends Solution> implements ISolutionGenerator<S> {
	private int nrConstraints;
	private int nrObjectives;
	private int nrVariables;
	
	public AbstractSolutionGenerator(int nrVariables, int nrObjectives, int nrConstraints) {
		this.nrVariables = nrVariables;
		this.nrObjectives = nrObjectives;
		this.nrConstraints = nrConstraints;
	}

	@Override
	public int getNrConstraints() {
		return nrConstraints;
	}

	@Override
	public int getNrObjectives() {
		return nrObjectives;
	}

	@Override
	public int getNrVariables() {
		return nrVariables;
	}
	
	@Override
	public S createNewSolution() {
		return createNewSolution(getNrVariables());
	}
	
	@Override
	public S createNewSolution(int nrVariables, int nrObjectives) {
		return createNewSolution(nrVariables, nrObjectives, getNrConstraints());
	}
	
	@Override
	public S createNewSolution(int nrVariables) {
		return createNewSolution(nrVariables, getNrObjectives(), getNrConstraints());
	}

}
