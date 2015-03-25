package at.ac.tuwien.big.moea.initialization.solution;

import org.moeaframework.core.Solution;

public interface ISolutionGenerator<S extends Solution> {
	/**
	 * Returns a new solution for a problem. Implementations must initialize 
	 * the variables so that the valid range of values is defined, but may 
	 * leave the actual value at a default or undefined state.
	 * @return newly created solution
	 */
	S createNewSolution();
	
	S createNewSolution(int nrVariables);
	
	S createNewSolution(int nrVariables, int nrObjectives);
	
	S createNewSolution(int nrVariables, int nrObjectives, int nrConstraints);
	
	int getNrConstraints();

	int getNrObjectives();

	int getNrVariables();

	
}
