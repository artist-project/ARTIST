package at.ac.tuwien.big.moea.fitness;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.MathUtil;

public abstract class AbstractFitnessFunction<T extends Solution> implements IFitnessFunction<T> {

	private Class<T> clazz;
	
	public AbstractFitnessFunction(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	protected double getAggregateFitness(Solution solution) {
		return MathUtil.getSum(solution.getConstraints(), solution.getObjectives());
	}
	
	@Override
	public double doEvaluate(Solution solution) {
		if(!clazz.isInstance(solution)) {
			for(int i : evaluatesObjectives())
				solution.setObjective(i, WORST_FITNESS);
			for(int i : evaluatesConstraints())
				solution.setConstraint(i, WORST_FITNESS);
		} else 
			return evaluate(clazz.cast(solution));
		
		return getAggregateFitness(solution);
	}

	@Override
	public abstract double evaluate(T solution);

	@Override
	public abstract int[] evaluatesObjectives();
	
	@Override
	public int evaluatesNrObjectives() {
		return evaluatesObjectives().length;
	}
	
	@Override
	public abstract int[] evaluatesConstraints();
	
	@Override
	public int evaluatesNrConstraints() {
		return evaluatesConstraints().length;
	}
}
