package at.ac.tuwien.big.momot.algorithm.local.neighborhood;

import java.util.Iterator;

import at.ac.tuwien.big.moea.algorithm.local.INeighborhood;
import at.ac.tuwien.big.moea.algorithm.local.neighborhood.AbstractNeighborhoodFunction;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.problem.ModelTransformationProblem;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class IncreasingNeighborhoodFunction extends AbstractNeighborhoodFunction<MatchSolution> {

	private ModelTransformationProblem problem;

	public IncreasingNeighborhoodFunction(ModelTransformationProblem problem, int maxNeighbors) {
		super(maxNeighbors);
		this.problem = problem;
	}
	
	public IncreasingNeighborhoodFunction(ModelTransformationProblem problem) {
		this(problem, 50);
	}	
	
	public ModelTransformationProblem getProblem() {
		return problem;
	}
	
	@Override
	public INeighborhood<MatchSolution> generateNeighbors(
			MatchSolution solution, int maxNeighbors) {
		MatchSolution nonEmptySolution = MatchSolution.removePlaceholders(solution);
		return new AbstractMatchSolutionNeighborhood(nonEmptySolution, maxNeighbors) {
			
			@Override
			public Iterator<MatchSolution> iterator() {
				return new AbstractMatchSolutionIterator(getBaseSolution(), getMaxNeighbors()) {
					@Override
					protected MatchSolution getNext() {
						return extendSolution(getBaseSolution());
					}

					private MatchSolution extendSolution(MatchSolution baseSolution) {
						ExecutionResult result = baseSolution.execute(getProblem());
//						result = result.removeEmptyMatches();
						ExecutionResult extended = getProblem().getMatchHelper().appendRandomExecutionSequence(result, 1);
						return extended.toMatchSolution(getBaseSolution().getNumberOfObjectives(), getBaseSolution().getNumberOfConstraints());
					}
				};
			}
		};
	}

}
