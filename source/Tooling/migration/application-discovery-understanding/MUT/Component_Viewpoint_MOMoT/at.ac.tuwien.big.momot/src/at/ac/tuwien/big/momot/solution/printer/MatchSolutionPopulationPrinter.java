package at.ac.tuwien.big.momot.solution.printer;

import at.ac.tuwien.big.moea.solution.printer.ISolutionPrinter;
import at.ac.tuwien.big.moea.solution.printer.PopulationPrinter;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public class MatchSolutionPopulationPrinter extends PopulationPrinter<MatchSolution> {

	public MatchSolutionPopulationPrinter(ISolutionPrinter<MatchSolution> solutionPrinter) {
		super(MatchSolution.class, solutionPrinter);
	}
}
