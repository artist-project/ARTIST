package at.ac.tuwien.big.momot.solution.printer;

import org.eclipse.emf.henshin.interpreter.EGraph;

import at.ac.tuwien.big.moea.solution.printer.ISolutionPrinter;
import at.ac.tuwien.big.momot.solution.MatchSolution;

public interface IMatchSolutionPrinter extends ISolutionPrinter<MatchSolution> {
	String print(EGraph graph);
}
