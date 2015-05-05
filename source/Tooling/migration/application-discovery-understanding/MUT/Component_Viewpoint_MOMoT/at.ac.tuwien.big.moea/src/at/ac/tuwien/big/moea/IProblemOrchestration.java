package at.ac.tuwien.big.moea;

import org.moeaframework.Analyzer;
import org.moeaframework.core.Population;
import org.moeaframework.core.Selection;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variation;

import at.ac.tuwien.big.moea.algorithm.local.IFitnessComparator;
import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;
import at.ac.tuwien.big.moea.fitness.IMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;
import at.ac.tuwien.big.moea.problem.IMOEAProblem;
import at.ac.tuwien.big.moea.run.executor.EvolutionarySearchExecutorFactory;
import at.ac.tuwien.big.moea.run.executor.LocalSearchExecutorFactory;

public interface IProblemOrchestration<S extends Solution> {
	IMOEAProblem<S> getProblem();
	IMultiDimensionalFitnessFunction<S> getFitnessFunction();
	IRandomSolutionGenerator<S> getSolutionGenerator();
		
	LocalSearchExecutorFactory<S> createLocalExecutorFactory(
			int maxEvaluations, 
			INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> solutionComprator,
			S initialSolution);
	
	LocalSearchExecutorFactory<S> createLocalExecutorFactory(
			int maxEvaluations, 
			INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> solutionComprator);
	
	EvolutionarySearchExecutorFactory<S> createEvolutionaryExecutorFactory(
			int populationSize, 
			int nrIterations);
	
	EvolutionarySearchExecutorFactory<S> createEvolutionaryExecutorFactory(
			int populationSize, 
			int nrIterations,
			Selection selection,
			Variation... variations);
	
	Analyzer createAnalyzer();
	
	String print(Population population);
	String print(S solution);
	
}
