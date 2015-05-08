package at.ac.tuwien.big.moea.algorithm.local;

import java.util.Arrays;
import java.util.Set;

import org.moeaframework.algorithm.AbstractAlgorithm;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;

public abstract class AbstractLocalSearchAlgorithm<S extends Solution> extends AbstractAlgorithm implements LocalSearchAlgorithm<S> {
	
	protected S initialSolution;
	
	protected S currentSolution;
	protected Comparable<?> currentFitness;
	
	protected S bestSolution;
	protected Comparable<?> bestFitness;
	
	protected INeighborhoodFunction<S> neighborhoodFunction;
	protected IFitnessComparator<?, S> fitnessComparator;
	
	public AbstractLocalSearchAlgorithm(Problem problem, 
			S initialSolution,
			INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> fitnessComparator) {
		super(problem);
		this.initialSolution = initialSolution;
		this.neighborhoodFunction = neighborhoodFunction;
		this.fitnessComparator = fitnessComparator;
	}

	protected NondominatedPopulation createPopulation(S solution) {
		NondominatedPopulation population = new NondominatedPopulation();
		population.add(getBestSolution());
		return population;
	}
	
	@Override
	public IFitnessComparator<?, S> getFitnessComparator() {
		return fitnessComparator;
	}
	
	@Override
	public NondominatedPopulation getResult() {
		return createPopulation(getBestSolution());
	}
	
	@Override
	public S getInitialSolution() {
		return initialSolution;
	}
	
	@Override
	public S getCurrentSolution() {
		return currentSolution;
	}
	
	protected void setCurrentSolution(S solution) {
		this.currentSolution = solution;
		this.currentFitness = getValue(solution);
	}
	
	@Override
	public Comparable<?> getCurrentFitness() {
		return currentFitness;
	}
	
	protected void setBestSolution(S bestSolution) {
		this.bestSolution = bestSolution;
		this.bestFitness = getValue(bestSolution);
	}
	
	@Override
	public S getBestSolution() {
		return bestSolution;
	}
	
	@Override
	public Comparable<?> getBestFitness() {
		return bestFitness;
	}

	protected void evaluateAll(Set<S> solutions) {
		for(S solution : solutions)
			evaluate(solution);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void initialize() {
		super.initialize();
		problem.evaluate(getInitialSolution());
		setCurrentSolution((S) getInitialSolution().copy());	
		problem.evaluate(getCurrentSolution());
		setBestSolution(getCurrentSolution());
	}
	
	protected boolean isBetter(S solution, S otherSolution) {
		return compare(solution, otherSolution) < 0;
	}
	
	protected Comparable<?> getValue(S solution) {
		return getFitnessComparator().getValue(solution);
	}
	
	protected boolean isImprovementToCurrent(S solution) {
		return isBetter(solution, getCurrentSolution());
	}
	
	protected boolean isImprovementToBest(S solution) {
		return isBetter(solution, getBestSolution());
	}
	
	@SafeVarargs
	protected final S getBest(S... solutions) {
		return sortSolutions(solutions)[0];
	}
	
	@SafeVarargs
	protected final S[] sortSolutions(S... solutions) {
		Arrays.sort(solutions, getFitnessComparator());
		return solutions;
	}
	
	protected int compare(S solution, S otherSolution) {
		if(getFitnessComparator() == null)
			throw new IllegalArgumentException("Local Search needs FitnessComparator to compare solutions.");
		return getFitnessComparator().compare(solution, otherSolution);
	}
	
	@Override
	public INeighborhoodFunction<S> getNeighborhoodFunction() {
		return neighborhoodFunction;
	}
	
	protected INeighborhood<S> generateCurrentNeighbors() {
		return getNeighborhoodFunction().generateNeighbors(getCurrentSolution());
	}
	
	protected INeighborhood<S> generateCurrentNeighbors(int maxNeighbors) {
		return getNeighborhoodFunction().generateNeighbors(getCurrentSolution(), maxNeighbors);
	}
	
	@Override
	public void terminate() {
		if(!isTerminated()) // terminate without exception
			super.terminate();
	}
}
