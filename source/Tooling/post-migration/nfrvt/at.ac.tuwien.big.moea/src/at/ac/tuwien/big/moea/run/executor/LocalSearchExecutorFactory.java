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

import org.moeaframework.Executor;
import org.moeaframework.Instrumenter;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.IAlgorithmCreator;
import at.ac.tuwien.big.moea.algorithm.local.HillClimbing;
import at.ac.tuwien.big.moea.algorithm.local.IFitnessComparator;
import at.ac.tuwien.big.moea.algorithm.local.INeighborhoodFunction;
import at.ac.tuwien.big.moea.algorithm.local.RandomDescent;
import at.ac.tuwien.big.moea.problem.IMOEAProblem;

public class LocalSearchExecutorFactory<S extends Solution> extends AbstractExecutorFactory<S> {
	
	private INeighborhoodFunction<S> neighborhoodFunction;
	private IFitnessComparator<?, S> fitnessComparator;
	private S initialSolution;
	
	public LocalSearchExecutorFactory(IMOEAProblem<S> problem, int maxEvaluations, 
			INeighborhoodFunction<S> neighborhoodFunction,
			IFitnessComparator<?, S> fitnessComparator,
			S initialSolution) {
		super(problem, maxEvaluations);
		this.neighborhoodFunction = neighborhoodFunction;
		this.fitnessComparator = fitnessComparator;
		this.initialSolution = initialSolution;
	}
	
	public IFitnessComparator<?, S> getFitnessComparator() {
		return fitnessComparator;
	}
	
	public LocalSearchExecutorFactory<S> setFitnessComparator(IFitnessComparator<?, S> fitnessComparator) {
		this.fitnessComparator = fitnessComparator;
		return this;
	}
	
	public LocalSearchExecutorFactory<S> setNeighborhoodFunction(INeighborhoodFunction<S> neighborhoodFunction) {
		this.neighborhoodFunction = neighborhoodFunction;
		return this;
	}
	
	public INeighborhoodFunction<S> getNeighborhoodFunction() {
		return neighborhoodFunction;
	}
	
	public S getInitialSolution() {
		return initialSolution;
	}
	
	public LocalSearchExecutorFactory<S> setInitialSolution(S initialSolution) {
		this.initialSolution = initialSolution;
		return this;
	}
	
	@Override
	public LocalSearchExecutorFactory<S> setInstrumenter(Instrumenter instrumenter) {
		super.setInstrumenter(instrumenter);
		this.instrumenter.withFrequency(0);
		return this;
	}
	
	public Executor createRandomDescentExecutor(int maxEvaluations) {
		return createRandomDescentExecutor().withMaxEvaluations(maxEvaluations);
	}
	
	@Override
	public LocalSearchExecutorFactory<S> setReferenceSetFile(File referenceSetFile) {
		return (LocalSearchExecutorFactory<S>) super.setReferenceSetFile(referenceSetFile);
	}
	
	@Override
	public LocalSearchExecutorFactory<S> setReferenceSetFile(String referenceSetFile) {
		return (LocalSearchExecutorFactory<S>) super.setReferenceSetFile(referenceSetFile);
	}
	
	public Executor createRandomDescentExecutor() {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<RandomDescent<S>>() {
					@Override
					public RandomDescent<S> newInstance() {
						return new RandomDescent<S>(getProblem(), 
								getInitialSolution(),
								getNeighborhoodFunction(),
								getFitnessComparator());
					}
				}));
	}
	
	public Executor createHillClimbingExecutor(int maxEvaluations) {
		return createHillClimbingExecutor().withMaxEvaluations(maxEvaluations);
	}
	
	public Executor createHillClimbingExecutor() {
		return createExecutor().withAlgorithm(registerAlgorithm(
				new IAlgorithmCreator<HillClimbing<S>>() {
					@Override
					public HillClimbing<S> newInstance() {
						return new HillClimbing<S>(getProblem(), 
								getInitialSolution(),
								getNeighborhoodFunction(),
								getFitnessComparator());
					}
				}));
	}
}
