package at.ac.tuwien.big.moea.initialization;

import org.moeaframework.core.Initialization;
import org.moeaframework.core.Solution;

public interface IPopulationGenerator<T extends Solution> extends Initialization, ITimeLogger {
	IPopulationGenerator<T> setPopulationSize(int populationSize);
	int getPopulationSize();
	T[] initialize();
}
