package at.ac.tuwien.big.moea.algorithm.local;

import org.moeaframework.core.Solution;

public interface INeighborhoodFunction<S extends Solution> {
	public static final int UNLIMITED = Integer.MAX_VALUE;
	
	int getMaxNeighbors();
	INeighborhoodFunction<S> setMaxNeighbors(int maxNeighbors);
	INeighborhood<S> generateNeighbors(S solution);
	INeighborhood<S> generateNeighbors(S solution, int maxNeighbors);
}