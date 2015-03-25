package at.ac.tuwien.big.moea.algorithm.local.neighborhood;

import org.moeaframework.core.Solution;

public abstract class AbstractSolutionGenerator<S extends Solution> implements ISolutionGenerator<S> {

	private S baseSolution;
	private int maxSolutions = UNLIMITED;
	
	private int generatedSolutions = 0;

	public AbstractSolutionGenerator(S baseSolution) {
		this.baseSolution = baseSolution;
	}
	
	public AbstractSolutionGenerator(S baseSolution, int maxSolutions) {
		this.baseSolution = baseSolution;
		this.maxSolutions = maxSolutions;
	}
	
	public S getBaseSolution() {
		return baseSolution;
	}
	
	@Override
	public int getMaxSolutions() {
		return maxSolutions;
	}
	
	@Override
	public ISolutionGenerator<S> setMaxSolutions(int maxSolutions) {
		this.maxSolutions = maxSolutions;
		return this;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("'remove' operation is not supported by this iterator.");
	}
	
	public int getGeneratedSolutions() {
		return generatedSolutions;
	}
	
	@Override
	public boolean hasNext() {
		return getGeneratedSolutions() < getMaxSolutions();
	}
	
	@Override
	public S next() {	
		S next = getNext();
		this.generatedSolutions++;
		return next;
	}

	protected abstract S getNext();
}
