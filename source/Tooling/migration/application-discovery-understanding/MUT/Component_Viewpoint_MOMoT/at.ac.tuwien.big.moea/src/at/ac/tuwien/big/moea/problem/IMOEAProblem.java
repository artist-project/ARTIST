package at.ac.tuwien.big.moea.problem;

import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.fitness.IFitnessFunction;
import at.ac.tuwien.big.moea.initialization.solution.ISolutionGenerator;

public interface IMOEAProblem<S extends Solution> extends Problem {
	IFitnessFunction<S> getFitnessFunction();
	ISolutionGenerator<S> getSolutionGenerator();
}
