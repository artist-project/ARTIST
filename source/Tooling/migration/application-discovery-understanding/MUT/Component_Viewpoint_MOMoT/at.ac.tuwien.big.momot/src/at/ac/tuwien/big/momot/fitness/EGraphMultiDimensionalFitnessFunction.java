package at.ac.tuwien.big.momot.fitness;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.fitness.MultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.match.ExecutionResult;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.solution.repair.IMatchSolutionRepairer;

public class EGraphMultiDimensionalFitnessFunction extends MultiDimensionalFitnessFunction<MatchSolution> implements IEGraphMultiDimensionalFitnessFunction {
	private MatchHelper matchHelper;
	private EGraph initialGraph;
	private IMatchSolutionRepairer repairer;
	private boolean saveExecutionResult = false;
	
	public EGraphMultiDimensionalFitnessFunction(EGraph initialGraph, MatchHelper matchHelper) {
		super(MatchSolution.class);
		this.initialGraph = initialGraph;
		this.matchHelper = matchHelper;
	}
	
	public ExecutionResult getExecutionResult(MatchSolution solution) {
		ExecutionResult result = solution.getStoredExecutionResult();
		if(result == null)
			result = getMatchHelper().execute(getInitialGraph(), solution);
		return result;
	}
	
	@Override
	protected void preprocessEvaluation(MatchSolution solution) {
		super.preprocessEvaluation(solution);
		ExecutionResult executionResult = getExecutionResult(solution);
		solution.storeExecutionResult(executionResult);
		
		if(repairsSolutions() && !executionResult.hasExecuted()) {
			solution = getSolutionRepairer().repair(solution);
			executionResult = solution.getStoredExecutionResult();
		}
		
		solution.storeMatchExecutionSuccess(executionResult.getMatchExecutionSuccess());
		preprocessEvaluation(solution, executionResult);
	}
		
	protected void preprocessEvaluation(MatchSolution solution, ExecutionResult executionResult) {	}
	
	@Override
	protected void postprocessEvaluation(MatchSolution solution, double result) {
		super.postprocessEvaluation(solution, result);
		if(!saveExecutionResult)
			solution.removeStoredExecutionResult();
	}
	
	@Override
	public EGraph getInitialGraph() {
		return initialGraph;
	}
	
	@Override
	public MatchHelper getMatchHelper() {
		return matchHelper;
	}
	
	@Override
	public void saveExecutionResult(boolean saveExecutionResult) {
		this.saveExecutionResult = saveExecutionResult;
	}
	
	@Override
	public IMatchSolutionRepairer getSolutionRepairer() {
		return repairer;
	}
	
	@Override
	public boolean repairsSolutions() {
		return getSolutionRepairer() != null;
	}
	
	@Override
	public IEGraphMultiDimensionalFitnessFunction setSolutionRepairer(IMatchSolutionRepairer repairer) {
		this.repairer = repairer;
		return this;
	}
}
