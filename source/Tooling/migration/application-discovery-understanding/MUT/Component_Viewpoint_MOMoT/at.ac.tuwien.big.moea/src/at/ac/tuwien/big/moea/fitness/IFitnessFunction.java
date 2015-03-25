package at.ac.tuwien.big.moea.fitness;

import org.moeaframework.core.Solution;

public interface IFitnessFunction<T extends Solution> extends IFitnessEvaluation<T> {
	int[] evaluatesObjectives();
	int evaluatesNrObjectives();
	
	int[] evaluatesConstraints();
	int evaluatesNrConstraints();
	
//	boolean hasBestKnownSolution();
//	T getBestKnownSolution();
//	void setBestKnownSolution(T solution);
//	
//	boolean equalsBestKnownSolution(Solution solution);
}
