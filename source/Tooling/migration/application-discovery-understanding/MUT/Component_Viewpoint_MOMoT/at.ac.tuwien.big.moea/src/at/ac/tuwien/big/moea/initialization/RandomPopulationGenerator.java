package at.ac.tuwien.big.moea.initialization;

import org.apache.commons.lang3.time.StopWatch;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;

public class RandomPopulationGenerator<S extends Solution> implements IPopulationGenerator<S> {
	
	private IRandomSolutionGenerator<S> solutionGenerator;
	private int populationSize;
	private boolean logTime = false;

	public RandomPopulationGenerator(int populationSize, IRandomSolutionGenerator<S> solutionGenerator) {
		this.populationSize = populationSize;
		this.solutionGenerator = solutionGenerator;
	}
	
	@Override
	public IPopulationGenerator<S> setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
		return this;
	}
	
	@Override
	public int getPopulationSize() {
		return populationSize;
	}

	@Override
	public S[] initialize() {
		StopWatch watch = null;
		if(logsTime()) {
			watch = new StopWatch();
			watch.start();
		}
		@SuppressWarnings("unchecked")
		S[] population = (S[]) new Solution[getPopulationSize()];

		for (int i = 0; i < getPopulationSize(); i++)
			population[i] = solutionGenerator.createRandomSolution();
		
		if(logsTime()) {
			watch.stop();
			System.err.println("Population of " + getPopulationSize() + " with length " + population[0].getNumberOfVariables() + " created in: " + watch);
		}
		return population;
	}

	@Override
	public RandomPopulationGenerator<S> logTime(boolean logTime) {
		this.logTime = logTime;
		return this;
	}

	@Override
	public boolean logsTime() {
		return logTime;
	}
}