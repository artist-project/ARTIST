package at.ac.tuwien.big.momot.solution.printer;

import at.ac.tuwien.big.moea.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.fitness.IEGraphFitnessFunction;

public class MatchSolutionPrinter extends GenericMatchSolutionPrinter {
	protected IEGraphFitnessFunction fitnessFunction;
	
	public MatchSolutionPrinter() { }
	
	public MatchSolutionPrinter(IEGraphFitnessFunction fitnessFunction) {
		this.fitnessFunction = fitnessFunction;
		if(fitnessFunction instanceof IMultiDimensionalFitnessFunction<?>) {
			IMultiDimensionalFitnessFunction<?> f = (IMultiDimensionalFitnessFunction<?>) fitnessFunction;
			setConstraintNames(f.getConstraintNames());
			setObjectiveNames(f.getObjectiveNames());
		}
	}
	
	protected IEGraphFitnessFunction getFitnessFunction() {
		return fitnessFunction;
	}
}
