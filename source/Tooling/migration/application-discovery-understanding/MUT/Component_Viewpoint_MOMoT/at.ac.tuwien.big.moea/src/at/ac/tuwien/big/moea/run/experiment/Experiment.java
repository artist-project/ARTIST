package at.ac.tuwien.big.moea.run.experiment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.moeaframework.Analyzer;
import org.moeaframework.Executor;
import org.moeaframework.analysis.collector.Collector;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.util.progress.ProgressListener;

import at.ac.tuwien.big.moea.run.listener.AccumulatorProgressListener;
import at.ac.tuwien.big.moea.ui.MetricPlotter;

public class Experiment {
	private Analyzer analyzer;
	private MetricPlotter metricPlotter;
	private Map<String, Executor> executors = new HashMap<>();
	private List<ProgressListener> progressListeners = new ArrayList<>();
	private List<Collector> collectors = new ArrayList<>();
	private File referenceFile;
	
	private boolean useAdaptiveMultimethodVariationCollector;
	private boolean useAdaptiveTimeContinuationCollector;
	private boolean useAdditiveEpsilonIndicatorCollector;
	private boolean useApproximationSetCollector;
	private boolean useContributionCollector;
	private boolean useElapsedTimeCollector;
	private boolean useEpsilonProgressCollector;
	private boolean useGenerationalDistanceCollector;
	private boolean useHypervolumeCollector;
	private boolean useInvertedGenerationalDistanceCollector;
	private boolean usePopulationSizeCollector;
	private boolean useSpacingCollector;
	
	private boolean printLogging = false;
	
	public Experiment useAnalyzer(Analyzer analyzer) {
		this.analyzer = analyzer;
		return this;
	}
	
	public Analyzer getAnalyzer() {
		return analyzer;
	}
	
	public Experiment useMetricPlotter(MetricPlotter metricPlotter) {
		this.metricPlotter = metricPlotter;
		return this;
	}
	
	public MetricPlotter getMetricPlotter() {
		return metricPlotter;
	}
	
	public Experiment addExecutor(String name, Executor executor) {
		executors.put(name, executor);
		return this;
	}
	
	public Collection<Executor> getExecutors() {
		return executors.values();
	}
	
	public Experiment useProgressListener(ProgressListener listener) {
		progressListeners.add(listener);
		return this;
	}
	
	public Experiment useProgressListener(ProgressListener... listeners) {
		for(ProgressListener listener : listeners)
			this.progressListeners.add(listener);
		return this;
	}
	
	public Experiment useCollector(Collector collector) {
		collectors.add(collector);
		return this;
	}
	
	public Experiment useCollector(Collector... collectors) {
		for(Collector collector : collectors)
			this.collectors.add(collector);
		return this;
	}
		
	public Experiment useAdaptiveMultimethodVariationCollector(boolean useAdaptiveMultimethodVariationCollector) {
		this.useAdaptiveMultimethodVariationCollector = useAdaptiveMultimethodVariationCollector;
		return this;
	}
	
	public boolean usesAdaptiveMultimethodVariationCollector() {
		return useAdaptiveMultimethodVariationCollector;
	}
	
	public Experiment useAdaptiveTimeContinuationCollector(boolean useAdaptiveTimeContinuationCollector) {
		this.useAdaptiveTimeContinuationCollector = useAdaptiveTimeContinuationCollector;
		return this;
	}
	
	public boolean usesAdaptiveTimeContinuationCollector() {
		return useAdaptiveTimeContinuationCollector;
	}
	
	public Experiment useAdditiveEpsilonIndicatorCollector(boolean useAdditiveEpsilonIndicatorCollector) {
		this.useAdditiveEpsilonIndicatorCollector = useAdditiveEpsilonIndicatorCollector;
		return this;
	}
	
	public boolean usesAdditiveEpsilonIndicatorCollector() {
		return useAdditiveEpsilonIndicatorCollector;
	}
	
	public Experiment useApproximationSetCollector(boolean useApproximationSetCollector) {
		this.useApproximationSetCollector = useApproximationSetCollector;
		return this;
	}
	
	public boolean usesApproximationSetCollector() {
		return useApproximationSetCollector;
	}
	
	public Experiment useContributionCollector(boolean useContributionCollector) {
		this.useContributionCollector = useContributionCollector;
		return this;
	}
	
	public boolean usesContributionCollector() {
		return useContributionCollector;
	}
	
	public Experiment useElapsedTimeCollector(boolean useElapsedTimeCollector) {
		this.useElapsedTimeCollector = useElapsedTimeCollector;
		return this;
	}
	
	public boolean usesElapsedTimeCollector() {
		return useElapsedTimeCollector;
	}
	
	public Experiment useEpsilonProgressCollector(boolean useEpsilonProgressCollector) {
		this.useEpsilonProgressCollector = useEpsilonProgressCollector;
		return this;
	}
	
	public boolean usesEpsilonProgressCollector() {
		return useEpsilonProgressCollector;
	}
	
	public Experiment useGenerationalDistanceCollector(boolean useGenerationalDistanceCollector) {
		this.useGenerationalDistanceCollector = useGenerationalDistanceCollector;
		return this;
	}
	
	public boolean usesGenerationalDistanceCollector() {
		return useGenerationalDistanceCollector;
	}
	
	public Experiment useHypervolumeCollector(boolean useHypervolumeCollector) {
		this.useHypervolumeCollector = useHypervolumeCollector;
		return this;
	}
	
	public boolean usesHypervolumeCollector() {
		return useHypervolumeCollector;
	}
	
	public Experiment useInvertedGenerationalDistanceCollector(boolean useInvertedGenerationalDistanceCollector) {
		this.useInvertedGenerationalDistanceCollector = useInvertedGenerationalDistanceCollector;
		return this;
	}
	
	public boolean usesInvertedGenerationalDistanceCollector() {
		return useInvertedGenerationalDistanceCollector;
	}
	
	public Experiment usePopulationSizeCollector(boolean usePopulationSizeCollector) {
		this.usePopulationSizeCollector = usePopulationSizeCollector;
		return this;
	}
	
	public boolean usesPopulationSizeCollector() {
		return usePopulationSizeCollector;
	}
	
	public Experiment useSpacingCollector(boolean useSpacingCollector) {
		this.useSpacingCollector = useSpacingCollector;
		return this;
	}
	
	public boolean usesSpacingCollector() {
		return useSpacingCollector;
	}
	
	public List<Collector> getCollectors() {
		return collectors;
	}
	
	public List<ProgressListener> getProgressListeners() {
		return progressListeners;
	}
	
	public Experiment printLogging(boolean printLogging) {
		this.printLogging = printLogging;
		return this;
	}
	
	public boolean printsLogging() {
		return printLogging;
	}
	
	public Experiment saveReferenceFile(File referenceFile) {
		try {
			FileUtils.touch(referenceFile);
			this.referenceFile = referenceFile;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}
		
	
	public Experiment saveReferenceFile(String referenceFileName) {
		File file = new File(referenceFileName);
		try {
			FileUtils.touch(file);
			this.referenceFile = file;
		} catch (IOException e) {
			;
		}
		return this;
	}
	
	public File getReferenceFile() {
		return referenceFile;
	}
	
	protected boolean savingReferenceFile() {
		return getReferenceFile() != null;
	}
	
	protected boolean plotMetrics() {
		return getMetricPlotter() != null;
	}
	
	protected boolean doAnalysis() {
		return getAnalyzer() != null;
	}
	
	protected Executor attachCollectors(Executor executor) {
		for(Collector collector : getCollectors())
			executor.getInstrumenter().attach(collector);
		
		if(usesAdaptiveMultimethodVariationCollector())
			executor.getInstrumenter().attachAdaptiveMultimethodVariationCollector();
		
		if(usesAdaptiveTimeContinuationCollector())
			executor.getInstrumenter().attachAdaptiveTimeContinuationCollector();
		
		if(usesAdditiveEpsilonIndicatorCollector())
			executor.getInstrumenter().attachAdditiveEpsilonIndicatorCollector();
		
		if(usesApproximationSetCollector())
			executor.getInstrumenter().attachApproximationSetCollector();
		
		if(usesContributionCollector())
			executor.getInstrumenter().attachContributionCollector();
		
		if(usesElapsedTimeCollector())
			executor.getInstrumenter().attachElapsedTimeCollector();
		
		if(usesEpsilonProgressCollector())
			executor.getInstrumenter().attachEpsilonProgressCollector();
		
		if(usesGenerationalDistanceCollector())
			executor.getInstrumenter().attachEpsilonProgressCollector();
		
		if(usesHypervolumeCollector())
			executor.getInstrumenter().attachHypervolumeCollector();
		
		if(usesInvertedGenerationalDistanceCollector())
			executor.getInstrumenter().attachInvertedGenerationalDistanceCollector();
		
		if(usesPopulationSizeCollector())
			executor.getInstrumenter().attachPopulationSizeCollector();
		
		if(usesSpacingCollector())
			executor.getInstrumenter().attachSpacingCollector();
		
		return executor;
	}
	
	protected Executor attachProgressListeners(Executor executor) {
		for(ProgressListener listener : getProgressListeners())
			executor.withProgressListener(listener);
	
		return executor;
	}
	
	public Experiment run(int nrSeeds) {
		AccumulatorProgressListener accumulatorCollector = null;
		if(plotMetrics()) 
			accumulatorCollector = new AccumulatorProgressListener();
		
		Analyzer analyzer = getAnalyzer();
		
		for(Entry<String, Executor> executorEntry : executors.entrySet()) {
			String name = executorEntry.getKey();
			Executor executor = executorEntry.getValue();
		
			if(savingReferenceFile() && analyzer == null) {
				this.analyzer = new Analyzer().withSameProblemAs(executor);
				analyzer = getAnalyzer();
			}
			
			executor = attachCollectors(executor);
			executor = attachProgressListeners(executor);
			
			if(plotMetrics())
				executor.withProgressListener(accumulatorCollector.reset());
			
			if(printsLogging())
				System.out.println("Executing '" + name + "' " + nrSeeds + " times...");
			
			List<NondominatedPopulation> results = executor.runSeeds(nrSeeds);
			if(printsLogging())
				System.out.println("done.");
			
			if(analyzer != null)
				analyzer.addAll(name, results);
			
			if(plotMetrics())
				getMetricPlotter().add(name, accumulatorCollector.getAccumulators());
		}
		
		if(savingReferenceFile())
			try {
				analyzer.saveReferenceSet(getReferenceFile());
				if(printsLogging())
					System.out.println("Reference set saved as '" + getReferenceFile() + "'.");
			} catch (IOException e) {
				if(printsLogging())
					System.err.println("Problem saving reference file: " + e.getMessage());
			}
			
		return this;
	}
	
	public NondominatedPopulation getReferenceSet() {
		if(getAnalyzer() == null)
			return null;
		return getAnalyzer().getReferenceSet();
	}
	
	public void printAnalysis() {
		if(getAnalyzer() == null)
			return;
		try {
			getAnalyzer().printAnalysis();
		} catch (IOException e) {
			if(printsLogging())
				System.err.println("Problem printing analysis: " + e.getMessage());
		}
	}
	
	public void show(boolean showIndividualTraces, String... metrics) {
		if(getMetricPlotter() == null)
			return;
		getMetricPlotter().show(showIndividualTraces, metrics);
	}
}
