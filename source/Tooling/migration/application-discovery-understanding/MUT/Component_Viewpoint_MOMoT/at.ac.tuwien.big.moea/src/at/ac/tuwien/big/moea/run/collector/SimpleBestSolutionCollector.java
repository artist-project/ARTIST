package at.ac.tuwien.big.moea.run.collector;

import org.moeaframework.analysis.collector.Accumulator;
import org.moeaframework.analysis.collector.AttachPoint;
import org.moeaframework.analysis.collector.Collector;
import org.moeaframework.core.Algorithm;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.AccumulatorUtil;
import at.ac.tuwien.big.moea.util.MathUtil;

public class SimpleBestSolutionCollector implements Collector {

	private Algorithm algorithm;

	public SimpleBestSolutionCollector() {
		this(null);
	}
	
	public SimpleBestSolutionCollector(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	@Override
	public AttachPoint getAttachPoint() {
		return AttachPoint.isSubclass(Algorithm.class).and(
				AttachPoint.not(AttachPoint.isNestedIn(Algorithm.class)));
	}

	@Override
	public Collector attach(Object object) {
		return new SimpleBestSolutionCollector((Algorithm)object);
	}

	@Override
	public void collect(Accumulator accumulator) {
		NondominatedPopulation result = algorithm.getResult();
		Solution bestSolution = result.size() > 0 ? result.get(0) : null;
		double bestObjectiveSum = Double.MAX_VALUE;
		
		double curObjectiveSum;
		for(Solution solution : result) {
			curObjectiveSum = calculateAggregatedFitness(solution);
			if(curObjectiveSum < bestObjectiveSum) {
				bestObjectiveSum = curObjectiveSum;
				bestSolution = solution;
			}
		}
		
		if(bestSolution != null)
			accumulator.add(AccumulatorUtil.Keys.SIMPLE_BEST_SOLUTION, bestSolution);
	}
	
	public static double calculateAggregatedFitness(Solution solution) {
		return MathUtil.getSum(solution.getObjectives(), solution.getConstraints());
	}

}
