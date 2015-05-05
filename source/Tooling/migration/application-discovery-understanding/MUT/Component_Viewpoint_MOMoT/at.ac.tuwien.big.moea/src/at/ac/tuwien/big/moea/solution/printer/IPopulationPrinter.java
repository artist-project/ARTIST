package at.ac.tuwien.big.moea.solution.printer;

import org.moeaframework.core.Population;
import org.moeaframework.core.Solution;

public interface IPopulationPrinter<S extends Solution> {
	String print(Population population);
}
