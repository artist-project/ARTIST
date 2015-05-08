package at.ac.tuwien.big.moea.initialization.solution;

import org.moeaframework.core.Solution;

public interface IRandomSolutionGenerator<S extends Solution> extends ISolutionGenerator<S> {
	S createRandomSolution();
	S createRandomSolution(int nrVariables);
	S createRandomSolution(int nrVariables, int nrObjectives);
	S createRandomSolution(int nrVariables, int nrObjectives, int nrConstraints);
}
