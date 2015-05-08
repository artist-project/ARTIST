package at.ac.tuwien.big.moea;

import org.moeaframework.Analyzer;
import org.moeaframework.core.Population;
import org.moeaframework.core.Selection;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variation;

import at.ac.tuwien.big.moea.algorithm.local.IFitnessComparator;
import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;
import at.ac.tuwien.big.moea.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.moea.initialization.IPopulationGenerator;
import at.ac.tuwien.big.moea.initialization.RandomPopulationGenerator;
import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;
import at.ac.tuwien.big.moea.problem.IMOEAProblem;
import at.ac.tuwien.big.moea.problem.MOEAProblem;
import at.ac.tuwien.big.moea.run.executor.EvolutionarySearchExecutorFactory;
import at.ac.tuwien.big.moea.run.executor.LocalSearchExecutorFactory;
import at.ac.tuwien.big.moea.solution.printer.GenericSolutionPrinter;
import at.ac.tuwien.big.moea.solution.printer.IPopulationPrinter;
import at.ac.tuwien.big.moea.solution.printer.ISolutionPrinter;
import at.ac.tuwien.big.moea.solution.printer.PopulationPrinter;

public abstract class AbstractProblemOrchestration<S extends Solution> implements IProblemOrchestration<S> {
	protected Class<S> solutionClass;
	
	protected IMOEAProblem<S> problem;
	protected IRandomSolutionGenerator<S> solutionGenerator;
	protected IPopulationGenerator<S> populationGenerator;
	protected IMultiDimensionalFitnessFunction<S> fitnessFunction;
	protected ISolutionPrinter<S> solutionPrinter;
	protected IPopulationPrinter<S> populationPrinter;
	protected EvolutionarySearchExecutorFactory<S> problemExecutor;

	private int nrVariables;
	
	public AbstractProblemOrchestration(Class<S> solutionClass, int nrVariables) {
		this.solutionClass = solutionClass;
		this.nrVariables = nrVariables;
	}
	
	public int getNrVariables() {
		return nrVariables;
	}
	
	public Class<S> getSolutionClass() {
		return solutionClass;
	}
	
	@Override
	public IMOEAProblem<S> getProblem() {
		if(problem == null)
			problem = createProblem();
		return problem;
	}
	
	protected IMOEAProblem<S> createProblem() {
		return new MOEAProblem<S>(getFitnessFunction(), getSolutionGenerator());
	}
	
	@Override
	public IMultiDimensionalFitnessFunction<S> getFitnessFunction() {
		return fitnessFunction;
	}
	
	public AbstractProblemOrchestration<S> setFitnessFunction(IMultiDimensionalFitnessFunction<S> fitnessFunction) {
		this.fitnessFunction = fitnessFunction;
		return this;
	}
	
	@Override
	public IRandomSolutionGenerator<S> getSolutionGenerator() {
		if(solutionGenerator == null)
			solutionGenerator = createSolutionGenerator();
		return solutionGenerator;
	}

	protected abstract IRandomSolutionGenerator<S> createSolutionGenerator();
	
	public ISolutionPrinter<S> getSolutionPrinter() {
		if(solutionPrinter == null)
			solutionPrinter = createSolutionPrinter();
		return solutionPrinter;
	}
	
	public AbstractProblemOrchestration<S> setSolutionPrinter(ISolutionPrinter<S> solutionPrinter) {
		this.solutionPrinter = solutionPrinter;
		return this;
	}

	protected ISolutionPrinter<S> createSolutionPrinter() {
		return new GenericSolutionPrinter<S>()
				.setObjectiveNames(getFitnessFunction().getObjectiveNames())
				.setConstraintNames(getFitnessFunction().getConstraintNames());
	}
	
	public IPopulationPrinter<S> getPopulationPrinter() {
		if(populationPrinter == null)
			populationPrinter = createPopulationPrinter();
		return populationPrinter;
	}

	protected IPopulationPrinter<S> createPopulationPrinter() {
		return new PopulationPrinter<S>(getSolutionClass(), getSolutionPrinter());
	}
	
	@Override
	public EvolutionarySearchExecutorFactory<S> createEvolutionaryExecutorFactory(int populationSize, int nrIterations) {
		return new EvolutionarySearchExecutorFactory<S>(
				getProblem(), 
				createPopulationGenerator(populationSize),
				nrIterations * populationSize);
	}
	
	@Override
	public EvolutionarySearchExecutorFactory<S> createEvolutionaryExecutorFactory(int populationSize, int nrIterations, Selection selection, Variation... variations) {
		return createEvolutionaryExecutorFactory(populationSize, nrIterations).setSelection(selection).addVariations(variations);
	}
	
	@Override
	public LocalSearchExecutorFactory<S> createLocalExecutorFactory(
			int maxEvaluations, INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> solutionComprator,
			S initialSolution) {
		return new LocalSearchExecutorFactory<S>(
				getProblem(), maxEvaluations, neighborhoodFunction, solutionComprator, initialSolution);
	}
	
	@Override
	public LocalSearchExecutorFactory<S> createLocalExecutorFactory(
			int maxEvaluations, INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> solutionComprator) {
		return new LocalSearchExecutorFactory<S>(
				getProblem(), maxEvaluations, 
				neighborhoodFunction, 
				solutionComprator, 
				createNewRandomSolution());
	}
	
	public IPopulationGenerator<S> createPopulationGenerator(int populationSize) {
		return new RandomPopulationGenerator<S>(populationSize, getSolutionGenerator());
	}
	
	@Override
	public Analyzer createAnalyzer() {
		return new Analyzer().withProblemClass(
					problem.getClass(),
					problem.getFitnessFunction(), 
					problem.getSolutionGenerator());
	}
	
	@Override
	public String print(Population population) {
		return getPopulationPrinter().print(population);
	}
	
	@Override
	public String print(S solution) {
		return getSolutionPrinter().print(solution);
	}
	
	public S createNewSolution(int nrVariables) {
		return getSolutionGenerator().createNewSolution(nrVariables);
	}
	
	public S createNewSolution() {
		return createNewSolution(getNrVariables());
	}
	
	public S createNewRandomSolution(int nrVariables) {
		return getSolutionGenerator().createRandomSolution(nrVariables);
	}
	
	public S createNewRandomSolution() {
		return getSolutionGenerator().createRandomSolution(getNrVariables());
	}
}
