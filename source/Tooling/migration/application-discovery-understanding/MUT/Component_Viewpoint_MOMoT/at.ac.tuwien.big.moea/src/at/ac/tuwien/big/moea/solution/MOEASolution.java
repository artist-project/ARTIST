package at.ac.tuwien.big.moea.solution;

import java.io.Serializable;

import org.moeaframework.core.Solution;

public class MOEASolution extends Solution {
	private static final long serialVersionUID = 1489801128861913870L;

	/**
	 * The aggregated fitness of a solution is the sum of all objective values 
	 * plus the sum of all constraint values.
	 */
	public static final String ATTRIBUTE_AGGREGATED_FITNESS = "AggregatedFitness";
	
	public MOEASolution(double[] objectives) {
		super(objectives);
	}

	public MOEASolution(int numberOfVariables, int numberOfObjectives,
			int numberOfConstraints) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints);
	}

	public MOEASolution(int numberOfVariables, int numberOfObjectives) {
		super(numberOfVariables, numberOfObjectives);
	}

	public MOEASolution(Solution solution) {
		super(solution);
	}

	public <A extends Serializable> A getAttribute(String key, Class<A> resultClass) {
		Object value = getAttribute(key);
		if(value == null || !resultClass.isInstance(value))
			return null;
		return resultClass.cast(value);
	}
	
	public void storeAggregatedFitness(double fitness) {
		setAttribute(ATTRIBUTE_AGGREGATED_FITNESS, fitness);
	}
		
	public Double getStoredAggregatedFitness() {
		return getAttribute(ATTRIBUTE_AGGREGATED_FITNESS, Double.class);
	}
	
	public void removeStoredAggregatedFitness() {
		removeAttribute(ATTRIBUTE_AGGREGATED_FITNESS);
	}
}
