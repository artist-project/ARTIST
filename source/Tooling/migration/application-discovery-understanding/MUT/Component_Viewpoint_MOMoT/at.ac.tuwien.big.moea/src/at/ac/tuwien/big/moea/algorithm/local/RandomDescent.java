package at.ac.tuwien.big.moea.algorithm.local;

import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;

public class RandomDescent<S extends Solution> extends AbstractLocalSearchAlgorithm<S> {

	public RandomDescent(Problem problem, S initialSolution,
			INeighborhoodFunction<S> neighborhoodFunction, 
			IFitnessComparator<?, S> fitnessComparator) {
		super(problem, initialSolution, neighborhoodFunction, fitnessComparator);
		if(neighborhoodFunction.getMaxNeighbors() == INeighborhoodFunction.UNLIMITED)
			System.err.println("Warning: Neighborhood-Function may produce infinite neighbors, Random-Descent may get stuck in infinite loop.");
	}

	@Override
	protected void iterate() {		
//		int neighborsChecked = 0;
		for(S neighbor : generateCurrentNeighbors()) {
			evaluate(neighbor);
//			neighborsChecked++;
			
			if(update(neighbor)) 
				break;
		}
	}

	protected boolean update(S solutionCandidate) {
		boolean isImprovement = false;
		if(isImprovementToCurrent(solutionCandidate)) {
			setCurrentSolution(solutionCandidate);
			isImprovement = true;
		}
		if(isImprovementToBest(solutionCandidate)) {
			setBestSolution(solutionCandidate);
			isImprovement = true;
		}
		return isImprovement;
	}
}
