package at.ac.tuwien.big.moea.fitness;

import org.moeaframework.core.Solution;

public interface IFitnessEvaluation<T extends Solution> {
	static final double WORST_FITNESS = Double.POSITIVE_INFINITY;
	
	double doEvaluate(Solution solution);
	double evaluate(T solution);
}
