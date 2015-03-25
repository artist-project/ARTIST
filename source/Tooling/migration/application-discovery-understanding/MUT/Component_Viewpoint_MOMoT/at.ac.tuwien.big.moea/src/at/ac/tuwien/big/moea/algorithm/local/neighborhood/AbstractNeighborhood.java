package at.ac.tuwien.big.moea.algorithm.local.neighborhood;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.local.INeighborhood;
import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;

public abstract class AbstractNeighborhood<S extends Solution> implements INeighborhood<S> {

	protected S baseSolution;
	protected int maxNeighbors = INeighborhoodFunction.UNLIMITED;
	
	public AbstractNeighborhood(S baseSolution, int maxNeighbors) {
		this.baseSolution = baseSolution;
		this.maxNeighbors = maxNeighbors;
	}
	
	public AbstractNeighborhood(S baseSolution) {
		this.baseSolution = baseSolution;
	}
	
	public S getBaseSolution() {
		return baseSolution;
	}
	
	@Override
	public int getMaxNeighbors() {
		return maxNeighbors;
	}
	
	@Override
	public INeighborhood<S> setMaxNeighbors(int maxNeighbors) {
		this.maxNeighbors = maxNeighbors;
		return this;
	}
	
}
