package at.ac.tuwien.big.momot.fitness;

import at.ac.tuwien.big.moea.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.solution.repair.IMatchSolutionRepairer;

public interface IEGraphMultiDimensionalFitnessFunction extends IMultiDimensionalFitnessFunction<MatchSolution>, IEGraphFitnessFunction {
	IMatchSolutionRepairer getSolutionRepairer();
	IEGraphMultiDimensionalFitnessFunction setSolutionRepairer(IMatchSolutionRepairer repairer);
	
	boolean repairsSolutions();
}
