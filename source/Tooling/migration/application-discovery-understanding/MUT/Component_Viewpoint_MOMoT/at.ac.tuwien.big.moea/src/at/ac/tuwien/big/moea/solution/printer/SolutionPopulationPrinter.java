package at.ac.tuwien.big.moea.solution.printer;

import org.moeaframework.core.Solution;

public class SolutionPopulationPrinter extends PopulationPrinter<Solution> {

	public SolutionPopulationPrinter(ISolutionPrinter<Solution> solutionPrinter) {
		super(Solution.class, solutionPrinter);
	}

}
