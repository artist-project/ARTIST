package at.ac.tuwien.big.moea.run.executor;

import java.io.File;

import org.moeaframework.Executor;
import org.moeaframework.Instrumenter;
import org.moeaframework.algorithm.AdaptiveTimeContinuation;
import org.moeaframework.algorithm.EpsilonMOEA;
import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.algorithm.RandomSearch;
import org.moeaframework.algorithm.ReferencePointNondominatedSortingPopulation;
import org.moeaframework.analysis.collector.ApproximationSetCollector;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.NondominatedSortingPopulation;
import org.moeaframework.core.Population;
import org.moeaframework.core.Selection;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variation;
import org.moeaframework.core.comparator.ChainedComparator;
import org.moeaframework.core.comparator.CrowdingComparator;
import org.moeaframework.core.comparator.DominanceComparator;
import org.moeaframework.core.comparator.ParetoDominanceComparator;
import org.moeaframework.core.operator.CompoundVariation;
import org.moeaframework.core.operator.TournamentSelection;
import org.moeaframework.core.operator.UniformSelection;
import org.moeaframework.core.operator.real.UM;

import at.ac.tuwien.big.moea.algorithm.IAlgorithmCreator;
import at.ac.tuwien.big.moea.initialization.IPopulationGenerator;
import at.ac.tuwien.big.moea.problem.IMOEAProblem;

public class EvolutionarySearchExecutorFactory<S extends Solution> extends AbstractExecutorFactory<S> {
	
	private IPopulationGenerator<S> populationGenerator;
	private Selection selection;
	private DominanceComparator dominanceComparator;
	private CompoundVariation variations = new CompoundVariation();
	
	public EvolutionarySearchExecutorFactory(IMOEAProblem<S> problem) {
		super(problem);
	}
	
	public EvolutionarySearchExecutorFactory(
			IMOEAProblem<S> problem, 
			IPopulationGenerator<S> populationGenerator,
			int maxEvaluations) {
		super(problem, maxEvaluations);
		this.populationGenerator = populationGenerator;
	}

	public EvolutionarySearchExecutorFactory<S> setPopulationGenerator(IPopulationGenerator<S> populationGenerator) {
		this.populationGenerator = populationGenerator;
		return this;
	}
	
	public IPopulationGenerator<S> getPopulationGenerator() {
		return populationGenerator;
	}
	
	public int getPopulationSize() {
		return getPopulationGenerator().getPopulationSize();
	}
	
	@Override
	public EvolutionarySearchExecutorFactory<S> setInstrumenter(Instrumenter instrumenter) {
		super.setInstrumenter(instrumenter);
		this.instrumenter.withFrequency(getPopulationGenerator().getPopulationSize());
		this.instrumenter.attach(new ApproximationSetCollector());
		return this;
	}
	
	public DominanceComparator getDominanceComparator() {
		if(dominanceComparator == null)
			dominanceComparator = new ChainedComparator(
					new ParetoDominanceComparator(),
					new CrowdingComparator());
		return dominanceComparator;
	}

	public EvolutionarySearchExecutorFactory<S> setDominanceComparator(DominanceComparator dominanceComparator) {
		this.dominanceComparator = dominanceComparator;
		return this;
	}

	public Selection getSelection() {
		if(selection == null)
			selection = new TournamentSelection(2);
		return selection;
	}

	public EvolutionarySearchExecutorFactory<S> setSelection(Selection selection) {
		this.selection = selection;
		return this;
	}

	public CompoundVariation getVariations() {
		return variations;
	}

	public EvolutionarySearchExecutorFactory<S> addVariation(Variation variation) {
		this.variations.appendOperator(variation);
		return this;
	}
	
	public EvolutionarySearchExecutorFactory<S> addVariations(Variation... variations) {
		for(Variation variation : variations)
			addVariation(variation);
		return this;
	}
	
	public Executor createRandomSearchExecutor() {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<RandomSearch>() {
					@Override
					public RandomSearch newInstance() {
						return new RandomSearch(getProblem(), 
								getPopulationGenerator(),
								new NondominatedPopulation());
					}
				}));
	}
	
	public Executor createRandomSearchExecutor(int maxEvaluations) {
		return createRandomSearchExecutor().withMaxEvaluations(maxEvaluations);
	}
	
	public Executor createNSGAIIExecutor(final double... epsilon) {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<NSGAII>() {
					@Override
					public NSGAII newInstance() {
						return new NSGAII(getProblem(), 
								new NondominatedSortingPopulation(new ParetoDominanceComparator()), 
								createEpsilonBoxArchive(epsilon), 
								getSelection(), 
								getVariations(), 
								getPopulationGenerator());
					}
				}));
	}
	
	public Executor createNSGAIIExecutor(int maxEvaluations, double... epsilon) {
		return createNSGAIIExecutor(epsilon).withMaxEvaluations(maxEvaluations);
	}
	
	/**
	 * 
	 * @param injectionRate default value of MOEA: 0.25
	 * @param epsilon
	 * @return
	 */
	public Executor createENSGAIIExecutor(final double injectionRate, final double... epsilon) {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<AdaptiveTimeContinuation>() {
					@Override
					public AdaptiveTimeContinuation newInstance() {
						NSGAII algorithm = new NSGAII(getProblem(), 
								new NondominatedSortingPopulation(new ParetoDominanceComparator()), 
								createEpsilonBoxArchive(epsilon), 
								getSelection(), 
								getVariations(), 
								getPopulationGenerator());
					return new AdaptiveTimeContinuation(
								algorithm, 100, 100, 
								1.0 / injectionRate, 
								getPopulationSize(), getPopulationSize() * 10, 
								new UniformSelection(), new UM(1.0));
					}
				}));
	}
	
	public Executor createENSGAIIExecutor(int maxEvaluations, final double injectionRate, final double... epsilon) {
		return createENSGAIIExecutor(injectionRate, epsilon).withMaxEvaluations(maxEvaluations);
	}
	
	public Executor createEpsilonMOEAExecutor(final double... epsilon) {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<EpsilonMOEA>() {
					@Override
					public EpsilonMOEA newInstance() {
						return new EpsilonMOEA(getProblem(), 
								new Population(), 
								createEpsilonBoxArchive(epsilon), 
								getSelection(), 
								getVariations(), 
								getPopulationGenerator(),
								new ParetoDominanceComparator());
					}
				}));
	}
	
	/**
	 * 
	 * @param divisionsInner default value of MOEA: 0
	 * @param divisionsOuter default value of MOEA: 4
	 * @return
	 */
	public Executor createNSGAIIIExecutor(final int divisionsInner, final int divisionsOuter) {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<NSGAII>() {
					@Override
					public NSGAII newInstance() {
						ReferencePointNondominatedSortingPopulation population = new ReferencePointNondominatedSortingPopulation(
								getProblem().getNumberOfObjectives(), divisionsOuter, divisionsInner);
						
						return new NSGAII(getProblem(), 
								population,
								null, 
								getSelection(), 
								getVariations(), 
								getPopulationGenerator());
					}
				}));
	}
	
	public Executor createNSGAIIIExecutor(int maxEvaluations, final int divisionsInner, final int divisionsOuter) {
		return createNSGAIIIExecutor(divisionsInner, divisionsOuter).withMaxEvaluations(maxEvaluations);
	}
	
	/**
	 * 
	 * @param divisions default value of MOEA: 4
	 * @return
	 */
	public Executor createNSGAIIIExecutor(final int divisions) {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<NSGAII>() {
					@Override
					public NSGAII newInstance() {
						ReferencePointNondominatedSortingPopulation population = new ReferencePointNondominatedSortingPopulation(
								getProblem().getNumberOfObjectives(), divisions);
						
						return new NSGAII(getProblem(), 
								population,
								null, 
								getSelection(), 
								getVariations(), 
								getPopulationGenerator());
					}
				}));
	}
	
	public Executor createEpsilonMOEAExecutor(int maxEvaluations, double... epsilon) {
		return createEpsilonMOEAExecutor(epsilon).withMaxEvaluations(maxEvaluations);
	}
	
	@Override
	public EvolutionarySearchExecutorFactory<S> setReferenceSetFile(File referenceSetFile) {
		return (EvolutionarySearchExecutorFactory<S>) super.setReferenceSetFile(referenceSetFile);
	}
	
	@Override
	public EvolutionarySearchExecutorFactory<S> setReferenceSetFile(
			String referenceSetFile) {
		return (EvolutionarySearchExecutorFactory<S>) super.setReferenceSetFile(referenceSetFile);
	}
}
