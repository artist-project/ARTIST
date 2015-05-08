package at.ac.tuwien.big.moea.run.listener;

import java.util.ArrayList;
import java.util.List;

import org.moeaframework.Executor;
import org.moeaframework.Instrumenter;
import org.moeaframework.analysis.collector.Accumulator;
import org.moeaframework.util.progress.ProgressEvent;

public class AccumulatorProgressListener extends AbstractProgressListener{

	private List<Accumulator> accumulators = new ArrayList<>();
	
	@Override
	public void update(ProgressEvent event) {
		if (isSeedFinished(event) || isFinished(event)) {
			Executor executor = event.getExecutor();
			Instrumenter instrumenter = executor.getInstrumenter();
			
			accumulators.add(instrumenter.getLastAccumulator());
		}
	}

	public List<Accumulator> getAccumulators() {
		return accumulators;
	}
	
	public AccumulatorProgressListener reset() {
		accumulators.clear();
		return this;
	}
}
