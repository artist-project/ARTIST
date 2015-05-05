package at.ac.tuwien.big.moea.algorithm.local.neighborhood;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.local.INeighborhood;
import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;

public abstract class AbstractNeighborhoodFunction<S extends Solution> implements INeighborhoodFunction<S> {

	private int maxNeighbors = UNLIMITED;
	
	public AbstractNeighborhoodFunction() {
	}
	
	public AbstractNeighborhoodFunction(int maxNeighbors) {
		setMaxNeighbors(maxNeighbors);
	}
	
	@Override
	public int getMaxNeighbors() {
		return maxNeighbors;
	}

	@Override
	public INeighborhoodFunction<S> setMaxNeighbors(int maxNeighbors) {
		this.maxNeighbors = maxNeighbors;
		return this;
	}
	
	@Override
	public INeighborhood<S> generateNeighbors(S solution) {
		return generateNeighbors(solution, getMaxNeighbors());
	}
}
