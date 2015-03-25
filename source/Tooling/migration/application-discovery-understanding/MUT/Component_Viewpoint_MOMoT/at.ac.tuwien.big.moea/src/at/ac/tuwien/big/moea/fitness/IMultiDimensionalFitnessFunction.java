package at.ac.tuwien.big.moea.fitness;

import java.util.Collection;
import java.util.List;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.fitness.dimension.IFitnessDimension;

public interface IMultiDimensionalFitnessFunction<T extends Solution> extends IFitnessFunction<T> {
	<D extends IFitnessDimension<T>> IFitnessFunction<T> addObjective(D objective);
	<D extends IFitnessDimension<T>> IFitnessFunction<T> removeObjective(D objective);
	<D extends IFitnessDimension<T>> IFitnessFunction<T> removeObjective(String objectiveName);
	String getObjectiveName(int index);
	List<String> getObjectiveNames();
	Collection<IFitnessDimension<T>> getObjectives();
	IFitnessDimension<T> getObjective(String name);
	int getObjectiveIndex(String name);
	
	<D extends IFitnessDimension<T>> IFitnessFunction<T> addConstraint(D constraint);
	<D extends IFitnessDimension<T>> IFitnessFunction<T> removeConstraint(D constraint);
	<D extends IFitnessDimension<T>> IFitnessFunction<T> removeConstraint(String constraintName);
	String getConstraintName(int index);
	List<String> getConstraintNames();
	Collection<IFitnessDimension<T>> getConstraints();
	IFitnessDimension<T> getConstraint(String name);
	int getConstraintIndex(String name);
}
