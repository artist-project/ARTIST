package at.ac.tuwien.big.moea.fitness.dimension;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.fitness.IFitnessEvaluation;

public interface IFitnessDimension<T extends Solution> extends IFitnessEvaluation<T> {
	static final double CONSTRAINT_VIOLATED = WORST_FITNESS;
	static final double CONSTRAINT_OK = 0;
	
	public enum FunctionType {
		Minimum,
		Maximum
	}
	
	String getName();
	
	FunctionType getFunctionType();
	boolean isMaximumFunction();
	boolean isMinimumFunction();
	
	IFitnessDimension<T> setWeight(double weight);
	double getWeight();
}
