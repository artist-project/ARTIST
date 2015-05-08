/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package at.ac.tuwien.big.moea.run.executor;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import org.moeaframework.Executor;
import org.moeaframework.algorithm.AlgorithmTerminationException;
import org.moeaframework.algorithm.Checkpoints;
import org.moeaframework.core.Algorithm;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Problem;
import org.moeaframework.core.comparator.ParetoDominanceComparator;
import org.moeaframework.core.spi.AlgorithmFactory;
import org.moeaframework.util.TypedProperties;
import org.moeaframework.util.distributed.DistributedProblem;
import org.moeaframework.util.progress.ProgressHelper;

import at.ac.tuwien.big.moea.algorithm.DynamicAlgorithmFactory;
import at.ac.tuwien.big.moea.util.CastUtil;

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
	private Map<String, Field> reflectiveFields = new HashMap<>();
	
	private static final String ALGORITHM_NAME = "algorithmName";
	private static final String PROPERTIES_NAME = "properties";
	private static final String THREADS_NAME = "numberOfThreads";
	private static final String EXECUTOR_SERVICE_NAME = "executorService";
	private static final String CHECKPOINT_FILE_NAME = "checkpointFile";
	private static final String CHECKPOINT_FREQUENCY_NAME = "checkpointFrequency";
	private static final String ALGORITHM_FACTORY_NAME = "algorithmFactory";
	private static final String PROGRESSHELPER_NAME = "progress";
	private static final String ISCANCELED_NAME = "isCanceled";
	
	public TerminatableExecutor() {
		Field[] fields = getClass().getSuperclass().getDeclaredFields();
		for(Field field : fields) {
			field.setAccessible(true);
			reflectiveFields.put(field.getName(), field);
		}
	}

	protected String getAlgorithmName() {
		try {
			return CastUtil.asClass(reflectiveFields.get(ALGORITHM_NAME).get(this), String.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return "<algorithname-not-available>";
		}
	}
	
	protected TypedProperties getTypedProperties() {
		try {
			return CastUtil.asClass(reflectiveFields.get(PROPERTIES_NAME).get(this), TypedProperties.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected AlgorithmFactory getAlgorithmFactory() {
		try {
			return CastUtil.asClass(reflectiveFields.get(ALGORITHM_FACTORY_NAME).get(this), AlgorithmFactory.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected File getCheckpointFile() {
		try {
			return CastUtil.asClass(reflectiveFields.get(CHECKPOINT_FILE_NAME).get(this), File.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected int getCheckpointFrequency() {
		try {
			return CastUtil.asClass(reflectiveFields.get(CHECKPOINT_FREQUENCY_NAME).get(this), Integer.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	protected ProgressHelper getProgressHelper() {
		try {
			return CastUtil.asClass(reflectiveFields.get(PROGRESSHELPER_NAME).get(this), ProgressHelper.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected int getNumberOfThreads() {
		try {
			return CastUtil.asClass(reflectiveFields.get(THREADS_NAME).get(this), Integer.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return 1;
		}
	}
	
	protected ExecutorService getExecutorService() {
		try {
			return CastUtil.asClass(reflectiveFields.get(EXECUTOR_SERVICE_NAME).get(this), ExecutorService.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected AtomicBoolean getCanceled() {
		try {
			return CastUtil.asClass(reflectiveFields.get(ISCANCELED_NAME).get(this), AtomicBoolean.class);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected void setCanceled(boolean cancel) {
		try {
			AtomicBoolean isCanceled = CastUtil.asClass(reflectiveFields.get(ISCANCELED_NAME).get(this), AtomicBoolean.class);
			isCanceled.set(cancel);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public Algorithm getLastAlgorithm() {
		return algorithm;
	}

	protected void setLastAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	protected Algorithm createAlgorithm(Problem problem) {	
		AlgorithmFactory factory = getAlgorithmFactory();
		if(factory == null)
			factory = new DynamicAlgorithmFactory();
		
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
		
		
		NondominatedPopulation result;
		try {
			Method newArchiveMethod = getClass().getSuperclass().getSuperclass().getDeclaredMethod("newArchive");
			newArchiveMethod.setAccessible(true);
			result = CastUtil.asClass(newArchiveMethod.invoke(this), NondominatedPopulation.class);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			result = new NondominatedPopulation(new ParetoDominanceComparator());
		}
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
			Method getProblemMethod = getClass().getSuperclass().getSuperclass().getDeclaredMethod("getProblemInstance");
			getProblemMethod.setAccessible(true);
			problem = CastUtil.asClass(getProblemMethod.invoke(this), Problem.class);
			
			try {
				if (getExecutorService() != null) {
					problem = new DistributedProblem(problem, getExecutorService());
				} else if (getNumberOfThreads() > 1) {
					executor = Executors.newFixedThreadPool(getNumberOfThreads());
					problem = new DistributedProblem(problem, getExecutorService());
				}
				
				return runAlgorithm(problem, maxEvaluations);
			} catch(AlgorithmTerminationException e) {
				System.err.println(e.getMessage());
				return null;
			} finally {
				if (executor != null) 
					executor.shutdown();
			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
			ex.printStackTrace();
			System.err.println(ex.getMessage());
			return null;
		} finally {
			if (problem != null) 
				problem.close();
		}
	}
	
	public void terminateRun() {
		if(getLastAlgorithm() != null && !getLastAlgorithm().isTerminated())
			getLastAlgorithm().terminate();
	}

	
	
	@Override
	public NondominatedPopulation run() {
		setCanceled(false);
		int maxEvaluations = getTypedProperties().getInt("maxEvaluations", 25000);
		getProgressHelper().start(1, maxEvaluations);
		NondominatedPopulation population = runSingleSeed(1, 1, maxEvaluations);
		getProgressHelper().stop();
		return population;
	}
}
