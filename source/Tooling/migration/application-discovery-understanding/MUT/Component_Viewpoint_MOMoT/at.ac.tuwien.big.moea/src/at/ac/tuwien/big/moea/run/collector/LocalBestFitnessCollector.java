package at.ac.tuwien.big.moea.run.collector;

import java.io.Serializable;

import org.moeaframework.analysis.collector.Accumulator;
import org.moeaframework.analysis.collector.AttachPoint;
import org.moeaframework.analysis.collector.Collector;

import at.ac.tuwien.big.moea.algorithm.local.LocalSearchAlgorithm;
import at.ac.tuwien.big.moea.util.AccumulatorUtil;

public class LocalBestFitnessCollector implements Collector {

	private LocalSearchAlgorithm<?> algorithm;

	public LocalBestFitnessCollector() {
		this(null);
	}
	
	public LocalBestFitnessCollector(LocalSearchAlgorithm<?> algorithm) {
		this.algorithm = algorithm;		
	}

	@Override
	public AttachPoint getAttachPoint() {
		return AttachPoint.isSubclass(LocalSearchAlgorithm.class).and(
				AttachPoint.not(AttachPoint.isNestedIn(LocalSearchAlgorithm.class)));
	}

	@Override
	public Collector attach(Object object) {
		return new LocalBestFitnessCollector((LocalSearchAlgorithm<?>)object);
	}

	@Override
	public void collect(Accumulator accumulator) {
		Serializable bestFitness = (Serializable)algorithm.getBestFitness();
		accumulator.add(AccumulatorUtil.Keys.LOCAL_BEST_FITNESS, bestFitness);
	}

}
