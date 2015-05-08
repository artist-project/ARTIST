package at.ac.tuwien.big.moea.fitness;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.moea.solution.MOEASolution;
import at.ac.tuwien.big.moea.util.MathUtil;

public class MultiDimensionalFitnessFunction<T extends Solution> implements IMultiDimensionalFitnessFunction<T> {

	protected Map<String, IFitnessDimension<T>> objectives;
	protected Map<String, IFitnessDimension<T>> constraints;
	private Class<T> clazz;
	
	public MultiDimensionalFitnessFunction(Class<T> clazz) {
		this.objectives = new HashMap<>();
		this.constraints = new HashMap<>();
		this.clazz = clazz;
	}
	
	@Override
	public double doEvaluate(Solution solution) {
		if(clazz.isInstance(solution)) 
			preprocessEvaluation(clazz.cast(solution));
				
		double result = delegateEvaluation(solution);
		
		if(clazz.isInstance(solution)) 
			postprocessEvaluation(clazz.cast(solution), result);
					
		return result;
	}
	
	private double evaluate(IFitnessDimension<T> dimension, Solution solution) {
		Double evaluation = dimension.doEvaluate(solution);
		if(dimension.isMaximumFunction())
			return -evaluation;
		
		return evaluation;
	}

	private double delegateEvaluation(Solution solution) {
		int i = 0;
		for(IFitnessDimension<T> dimension : objectives.values())
			solution.setObjective(i++, evaluate(dimension, solution));

		i = 0;
		for(IFitnessDimension<T> dimension : constraints.values())
			solution.setConstraint(i++, evaluate(dimension, solution));
		
		return getAggregateFitness(solution);
	}
	
	@Override
	public double evaluate(T solution) {
		return delegateEvaluation(solution);
	}
	
	protected void postprocessEvaluation(T solution, double result) {
		solution.setAttribute(MOEASolution.ATTRIBUTE_AGGREGATED_FITNESS, result);
	}

	protected void preprocessEvaluation(T solution) {
	}

	@Override
	public int[] evaluatesObjectives() {
		int[] objectiveIndices = new int[constraints.size()];
		for(int i = 0; i < constraints.size(); i++)
			objectiveIndices[i] = i;
		return objectiveIndices;
	}
	
	@Override
	public int evaluatesNrObjectives() {
		return objectives.size();
	}
	
	@Override
	public int[] evaluatesConstraints() {
		int[] constraintIndices = new int[constraints.size()];
		for(int i = 0; i < constraints.size(); i++)
			constraintIndices[i] = i;
		return constraintIndices;
	}
	
	@Override
	public int evaluatesNrConstraints() {
		return constraints.size();
	}
	
	@Override	
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> addConstraint(D constraint) {
		constraints.put(constraint.getName(), constraint);
		return this;
	}
	
	@Override
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> addObjective(D objective) {
		objectives.put(objective.getName(), objective);
		return this;
	}
	
	protected double getAggregateFitness(Solution solution) {
		return MathUtil.getSum(solution.getObjectives(), solution.getConstraints());
	}

	@Override
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> removeObjective(D objective) {
		this.objectives.remove(objective.getName());
		return this;
	}
	
	@Override
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> removeObjective(String objectiveName) {
		this.objectives.remove(objectiveName);
		return this;
	}

	@Override
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> removeConstraint(D constraint) {
		if(constraint == null)
			return this;
		this.constraints.remove(constraint.getName());
		return this;
	}
	
	@Override
	public <D extends IFitnessDimension<T>> IFitnessFunction<T> removeConstraint(String constraintName) {
		this.constraints.remove(constraintName);	
		return this;
	}

	@Override
	public String getObjectiveName(int index) {
		if(index < objectives.size())
			return objectives.get(index).getName();
		return null;
	}

	@Override
	public String getConstraintName(int index) {
		if(index < constraints.size())
			return constraints.get(index).getName();
		return null;
	}
	
	private List<String> getNames(Iterable<IFitnessDimension<T>> list) {
		List<String> names = new ArrayList<>();
		for(IFitnessDimension<?> element : list)
			names.add(element.getName());
		return names;
	}
	
	@Override
	public List<String> getConstraintNames() {
		return getNames(constraints.values());
	}
	
	@Override
	public List<String> getObjectiveNames() {
		return getNames(objectives.values());
	}
	
	@Override
	public Collection<IFitnessDimension<T>> getConstraints() {
		return constraints.values();
	}
	
	@Override
	public Collection<IFitnessDimension<T>> getObjectives() {
		return objectives.values();
	}
	
	@Override
	public IFitnessDimension<T> getObjective(String name) {
		return objectives.get(name);
	}
	
	@Override
	public IFitnessDimension<T> getConstraint(String name) {
		return constraints.get(name);
	}
	
	protected int getIndex(String name, Iterable<IFitnessDimension<T>> values) {
		int index = 0;
		for(IFitnessDimension<T> dimension : values) {
			if(dimension.getName().equals(name))
				return index;
			index++;
		}
		return -1;
	}
	
	@Override
	public int getConstraintIndex(String name) {
		return getIndex(name, constraints.values());
	}
	
	@Override
	public int getObjectiveIndex(String name) {
		return getIndex(name, objectives.values());
	}
}
