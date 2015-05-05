package at.ac.tuwien.big.moea.algorithm.local.neighborhood;

import java.util.Iterator;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;

public interface ISolutionGenerator<S extends Solution> extends Iterator<S> {
	public static final int UNLIMITED = INeighborhoodFunction.UNLIMITED;
	
	int getMaxSolutions();
	ISolutionGenerator<S> setMaxSolutions(int maxSolutions);
}
