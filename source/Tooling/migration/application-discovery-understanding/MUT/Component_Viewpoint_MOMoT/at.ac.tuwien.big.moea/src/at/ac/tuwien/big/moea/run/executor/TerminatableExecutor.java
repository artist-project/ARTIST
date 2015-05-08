package at.ac.tuwien.big.moea.run.executor;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.moeaframework.Executor;
import org.moeaframework.algorithm.AlgorithmTerminationException;
import org.moeaframework.algorithm.Checkpoints;
import org.moeaframework.core.Algorithm;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Problem;
import org.moeaframework.core.spi.AlgorithmFactory;
import org.moeaframework.util.TypedProperties;
import org.moeaframework.util.distributed.DistributedProblem;
import org.moeaframework.util.progress.ProgressHelper;

/**
 * An executor class that is based on the existing MOEA {@link Executor} and 
 * modified in a way that single execution runs can also be cancelled.
 * <p/>
 * ATTENTION: The existing {@link Executor} class has been modified to allow
 * access to some private fields.
 * 
 */
public class TerminatableExecutor extends Executor {
	
	private Algorithm algorithm;

	protected String getAlgorithmName() {
		return algorithmName;
	}
	
	protected TypedProperties getTypedProperties() {
		return properties;
	}
	
	protected AlgorithmFactory getAlgorithmFactory() {
		return algorithmFactory;
	}
	
	protected File getCheckpointFile() {
		return checkpointFile;
	}
	
	protected int getCheckpointFrequency() {
		return checkpointFrequency;
	}
	
	protected ProgressHelper getProgressHelper() {
		return progress;
	}
	
	protected int getNumberOfThreads() {
		return numberOfThreads;
	}
	
	protected ExecutorService getExecutorService() {
		return executorService;
	}
	
	protected Algorithm createAlgorithm(Problem problem) {	
		AlgorithmFactory factory = getAlgorithmFactory();
		if(factory == null)
			factory = AlgorithmFactory.getInstance();
		
		Algorithm algorithm = factory.getAlgorithm(
				getAlgorithmName(), 
				getTypedProperties().getProperties(), 
				problem);

		if (getCheckpointFile() != null) 
			algorithm = new Checkpoints(
					algorithm, 
					getCheckpointFile(),
					getCheckpointFrequency());
		
		if (getInstrumenter() != null) 
			algorithm = getInstrumenter().instrument(algorithm);		
		return algorithm;
	}
	
	public NondominatedPopulation runAlgorithm(Problem problem, int maxEvaluations) {
		NondominatedPopulation result = newArchive();
		try {
			Algorithm algorithm = createAlgorithm(problem);
			setLastAlgorithm(algorithm);
			
			while (!algorithm.isTerminated() && 
					algorithm.getNumberOfEvaluations() < maxEvaluations &&
					!isCanceled()) {
				algorithm.step();
				getProgressHelper().setCurrentNFE(algorithm.getNumberOfEvaluations());
			}

			result.addAll(algorithm.getResult());
		} finally {
			if (algorithm != null && !algorithm.isTerminated()) {
				algorithm.terminate();
			}
		}
		return result;
	}
	
	@Override
	protected NondominatedPopulation runSingleSeed(int seed, int numberOfSeeds,	int maxEvaluations) {
		
		setLastAlgorithm(null);
		
		if (getAlgorithmName() == null)
			throw new IllegalArgumentException("No algorithm specified");
		
		Problem problem = null;
		ExecutorService executor = null;
		
		try {
			problem = getProblemInstance();
			
			try {
				if (getExecutorService() != null) {
					problem = new DistributedProblem(problem, getExecutorService());
				} else if (getNumberOfThreads() > 1) {
					executor = Executors.newFixedThreadPool(getNumberOfThreads());
					problem = new DistributedProblem(problem, getExecutorService());
				}
				
				return runAlgorithm(problem, maxEvaluations);
			} catch(AlgorithmTerminationException e) {
				System.out.println(e.getMessage());
				return null;
			} finally {
				if (executor != null) 
					executor.shutdown();
			}
		} finally {
			if (problem != null) 
				problem.close();
		}
	}
	
	public void terminateRun() {
		if(getLastAlgorithm() != null && !getLastAlgorithm().isTerminated())
			getLastAlgorithm().terminate();
	}

	public Algorithm getLastAlgorithm() {
		return algorithm;
	}

	protected void setLastAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	@Override
	public NondominatedPopulation run() {
		isCanceled.set(false);
		int maxEvaluations = properties.getInt("maxEvaluations", 25000);
		getProgressHelper().start(1, maxEvaluations);
		NondominatedPopulation population = runSingleSeed(1, 1, maxEvaluations);
		getProgressHelper().stop();
		return population;
	}
}
