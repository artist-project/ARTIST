package at.ac.tuwien.big.momot.fitness;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.fitness.IFitnessFunction;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public interface IEGraphFitnessFunction extends IFitnessFunction<MatchSolution> {	
	EGraph getInitialGraph();
	MatchHelper getMatchHelper();
	
	void saveExecutionResult(boolean saveEGraph);
}
