package at.ac.tuwien.big.momot.fitness.dimension;

import at.ac.tuwien.big.moea.fitness.dimension.AbstractFitnessDimension;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public abstract class AbstractEGraphFitnessDimension extends AbstractFitnessDimension<MatchSolution> implements IEGraphFitnessDimension {
	public AbstractEGraphFitnessDimension(String name) {
		super(MatchSolution.class, name);
	}

	public AbstractEGraphFitnessDimension(String name, FunctionType type) {
		super(MatchSolution.class, name, type);
	}
	
	@Override
	public double evaluate(MatchSolution solution) {
		ExecutionResult result = solution.getStoredExecutionResult();
		if(result == null)
			return WORST_FITNESS;
		return evaluate(solution, result);
	}

	protected abstract double evaluate(MatchSolution solution, ExecutionResult executionResult);
}