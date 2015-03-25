package at.ac.tuwien.big.moea.fitness.comparator;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.solution.MOEASolution;
import at.ac.tuwien.big.moea.util.MathUtil;

public class AggregatedFitnessComparator<S extends Solution> extends AttributeFitnessComparator<Double, S> {

	public AggregatedFitnessComparator(String attributeName,
			Class<Double> comparableClass) {
		super(MOEASolution.ATTRIBUTE_AGGREGATED_FITNESS, Double.class);
	}

	@Override
	public Double getValue(S solution) {
		Double fitness = super.getValue(solution);
		if(fitness != null)
			return fitness;
		return MathUtil.getSum(solution.getObjectives(), solution.getConstraints());
	}
}
