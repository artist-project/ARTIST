package at.ac.tuwien.big.momot.algorithm.local.neighborhood;

import java.util.Iterator;

import org.moeaframework.core.Solution;
import org.moeaframework.core.Variation;

import at.ac.tuwien.big.moea.algorithm.local.INeighborhood;
import at.ac.tuwien.big.moea.algorithm.local.neighborhood.AbstractNeighborhoodFunction;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class MutationNeighborhoodFunction extends AbstractNeighborhoodFunction<MatchSolution> {
	
	private Variation mutationOperator;
	
//	public MutationNeighborhoodFunction(Variation mutationOperator) {
//		setMutationOperator(mutationOperator);
//	}
	
	public MutationNeighborhoodFunction(Variation mutationOperator, int maxNeighbors) {
		super(maxNeighbors);
		setMutationOperator(mutationOperator);
	}

	public Variation getMutationOperator() {
		return mutationOperator;
	}
	
	public void setMutationOperator(Variation mutationOperator) {
		if(mutationOperator.getArity() != 1)
			throw new IllegalArgumentException("Mutation operator needs to have an arity of one.");
		this.mutationOperator = mutationOperator;
	}
	
	@Override
	public  INeighborhood<MatchSolution> generateNeighbors(MatchSolution solution, final int maxNeighbors) {
		return new AbstractMatchSolutionNeighborhood(solution, maxNeighbors) {
			
			@Override
			public Iterator<MatchSolution> iterator() {
				return new AbstractMatchSolutionIterator(getBaseSolution(), getMaxNeighbors()) {
					@Override
					protected MatchSolution getNext() {
						return createMutant(getBaseSolution());
					}
				};
			}
		};
	}
	
	protected MatchSolution createMutant(MatchSolution solution) {
		return (MatchSolution) getMutationOperator().evolve(new Solution[] { solution.copy() })[0];
	}
}
