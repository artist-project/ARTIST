package at.ac.tuwien.big.moea.algorithm.local;

import org.moeaframework.core.Algorithm;
import org.moeaframework.core.Solution;

public interface LocalSearchAlgorithm<S extends Solution> extends Algorithm {
	INeighborhoodFunction<S> getNeighborhoodFunction();
	IFitnessComparator<?, S> getFitnessComparator();

	S getInitialSolution();

	S getCurrentSolution();
	Comparable<?> getCurrentFitness();
	
	S getBestSolution();
	Comparable<?> getBestFitness();	
}
