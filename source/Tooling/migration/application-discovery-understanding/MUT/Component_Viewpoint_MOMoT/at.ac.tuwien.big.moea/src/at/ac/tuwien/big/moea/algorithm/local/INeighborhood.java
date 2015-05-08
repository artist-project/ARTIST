package at.ac.tuwien.big.moea.algorithm.local;

import org.moeaframework.core.Solution;

public interface INeighborhood<S extends Solution> extends Iterable<S> {
	public static final int UNLIMITED = INeighborhoodFunction.UNLIMITED;
	
	int getMaxNeighbors();
	INeighborhood<S> setMaxNeighbors(int maxNeighbors);
}
