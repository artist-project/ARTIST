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
import java.util.Date;

import org.moeaframework.Analyzer;
import org.moeaframework.Executor;
import org.moeaframework.Instrumenter;
import org.moeaframework.core.EpsilonBoxDominanceArchive;
import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.algorithm.DynamicAlgorithmProvider;
import at.ac.tuwien.big.moea.algorithm.IAlgorithmCreator;
import at.ac.tuwien.big.moea.problem.IMOEAProblem;

public class AbstractExecutorFactory<S extends Solution> implements IExecutorFactory<S> {
	protected IMOEAProblem<S> problem;
	protected int maxEvaluations;
	
	protected Instrumenter instrumenter;
	private File referenceSetFile;
	
	public AbstractExecutorFactory(IMOEAProblem<S> problem) {
		this.problem = problem;
	}
	
	public AbstractExecutorFactory(IMOEAProblem<S> problem, int maxEvaluations) {
		this.problem = problem;
		this.maxEvaluations = maxEvaluations;
	}
	
	@Override
	public IMOEAProblem<S> getProblem() {
		return problem;
	}
	
	@Override
	public AbstractExecutorFactory<S> setMaxEvaluations(int maxEvaluations) {
		this.maxEvaluations = maxEvaluations;
		return this;
	}
	
	@Override
	public int getMaxEvaluations() {
		return maxEvaluations;
	}
	
	@Override
	public File getReferenceSetFile() {
		return referenceSetFile;
	}
	
	@Override
	public AbstractExecutorFactory<S> setReferenceSetFile(String referenceSetFile) {
		if(referenceSetFile == null)
			return this;
		return setReferenceSetFile(new File(referenceSetFile));
	}
	
	@Override
	public AbstractExecutorFactory<S> setReferenceSetFile(File referenceSetFile) {
		if(referenceSetFile == null || !referenceSetFile.exists())
			return this;
		
		this.referenceSetFile = referenceSetFile;
		return this;
	}
	
	@Override
	public AbstractExecutorFactory<S> setInstrumenter(Instrumenter instrumenter) {
		this.instrumenter = instrumenter;
		if(instrumenter != null) {
			this.instrumenter.withProblemClass(
					getProblem().getClass(),
					getProblem().getFitnessFunction(), 
					getProblem().getSolutionGenerator());
			if(getReferenceSetFile() != null)
				this.instrumenter.withReferenceSet(getReferenceSetFile());
		}
		return this;
	}
	
	@Override
	public Instrumenter getInstrumenter() {
		if(instrumenter == null)
			setInstrumenter(new MOEAInstrumenter());
		return instrumenter;
	}
	
	protected Executor createExecutor() {		
		Executor executor = new TerminatableExecutor()
			.withInstrumenter(getInstrumenter())
			.withMaxEvaluations(getMaxEvaluations())
			.withProblemClass(problem.getClass(), problem.getFitnessFunction(), problem.getSolutionGenerator())
			.distributeOnAllCores();

		return executor;
	}
	
	@Override
	public Analyzer createAnalyzer() {
		return new Analyzer()
			.withProblemClass(problem.getClass(), problem.getFitnessFunction(), problem.getSolutionGenerator());
	}
	
	protected String registerAlgorithm(IAlgorithmCreator<?> algorithm) {
		String algorithmName = algorithm.getClass().getSimpleName() + new Date().getTime();
		DynamicAlgorithmProvider.registerAlgorithm(algorithmName, algorithm);
		return algorithmName;
	}
	
	protected EpsilonBoxDominanceArchive createEpsilonBoxArchive(double... epsilon) {
		if(epsilon.length == 0)
			return null;
		return new EpsilonBoxDominanceArchive(epsilon);	
	}
}
