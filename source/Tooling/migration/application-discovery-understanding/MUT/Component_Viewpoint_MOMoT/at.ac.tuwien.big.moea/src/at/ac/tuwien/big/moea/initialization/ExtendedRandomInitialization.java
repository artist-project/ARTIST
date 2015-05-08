package at.ac.tuwien.big.moea.initialization;

import org.apache.commons.lang3.time.StopWatch;
import org.moeaframework.core.Problem;
import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.operator.RandomInitialization;

import at.ac.tuwien.big.moea.util.random.IRandomizable;

public class ExtendedRandomInitialization extends RandomInitialization implements ITimeLogger {
	
	private boolean logTime = false;
	private int populationSize;
	
	public ExtendedRandomInitialization(Problem problem, int populationSize) {
		super(problem, populationSize);
		this.populationSize = populationSize;
	}
	
	public int getPopulationSize() {
		return populationSize;
	}
	
	@Override
	public Solution[] initialize() {
		StopWatch watch = null;
		if(logsTime()) {
			watch = new StopWatch();
			watch.start();
		}
		Solution[] init = super.initialize();
		
		if(logsTime()) {
			watch.stop();
			System.err.println("Random Initialization of " + getPopulationSize() + " solutions with length " + init[0].getNumberOfVariables() + " created in: " + watch);
		}
		
		return init;
	}

	@Override
	protected void initialize(Variable variable) {
		if(variable instanceof IRandomizable<?>) {
			((IRandomizable<?>)variable).randomize();
		} else {
			super.initialize(variable);
		}
	}

	@Override
	public ExtendedRandomInitialization logTime(boolean logTime) {
		this.logTime = logTime;
		return this;
	}

	@Override
	public boolean logsTime() {
		return logTime;
	}
}
