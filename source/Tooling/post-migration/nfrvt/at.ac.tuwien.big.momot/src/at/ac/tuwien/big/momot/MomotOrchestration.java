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
package at.ac.tuwien.big.momot;

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.ChangeImpl;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;

import at.ac.tuwien.big.moea.AbstractProblemOrchestration;
import at.ac.tuwien.big.moea.initialization.solution.IRandomSolutionGenerator;
import at.ac.tuwien.big.moea.solution.printer.ISolutionPrinter;
import at.ac.tuwien.big.momot.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.initialization.solution.MatchSolutionGenerator;
import at.ac.tuwien.big.momot.match.MatchHelper;
import at.ac.tuwien.big.momot.problem.ModelTransformationProblem;
import at.ac.tuwien.big.momot.rule.ParameterManager;
import at.ac.tuwien.big.momot.rule.RuleManager;
import at.ac.tuwien.big.momot.solution.MatchSolution;
import at.ac.tuwien.big.momot.solution.printer.GenericMatchSolutionPrinter;
import at.ac.tuwien.big.momot.solution.printer.IMatchSolutionPrinter;

public class MomotOrchestration extends AbstractProblemOrchestration<MatchSolution> {

	private EGraph initialGraph;
	private MomotFactory factory;
	private RuleManager ruleManager;
	private ParameterManager ruleParameterManager;
	private MatchHelper matchHelper;
	private OCL ocl;
	
	public MomotOrchestration(MomotFactory factory, EGraph initialGraph, int nrVariables) {
		super(MatchSolution.class, nrVariables);
		ChangeImpl.PRINT_WARNINGS = false;
		this.factory = factory;
		this.initialGraph = initialGraph;
		setFitnessFunction(new EGraphMultiDimensionalFitnessFunction(getInitialGraph(), getMatchHelper()));
	}
	
	public MomotOrchestration(String path, String moduleFile, EGraph initialGraph, int nrVariables) {
		this(new MomotFactory(path, moduleFile), initialGraph, nrVariables);
	}
	
	public MomotOrchestration(MomotFactory factory, String initialGraphPath, int nrVariables) {
		this(factory, factory.loadGraph(initialGraphPath), nrVariables);
	}
	
	public MomotOrchestration(String path, String moduleFile, String initialGraphPath, int nrVariables) {
		this(new MomotFactory(path, moduleFile), initialGraphPath, nrVariables);
	}
	
	public EGraph getInitialGraph() {
		return initialGraph;
	}

	public MomotFactory getFactory() {
		return factory;
	}
	
	public RuleManager getRuleManager() {
		if(ruleManager == null)
			ruleManager = getFactory().createModuleRules();
		return ruleManager;
	}
	
	public ParameterManager getParameterManager() {
		if(ruleParameterManager == null)
			ruleParameterManager = getFactory().createParameterManager(getRuleManager());
		return ruleParameterManager;
	}
	
	public EGraph save(EGraph graph, String targetResource) {
		getFactory().saveGraph(graph, targetResource);
		return graph;
	}
	
	public OCL getOCL() {
		if(ocl == null)
			ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		return ocl;
	}
	
	public Helper createOCLHelper() {
		Helper helper = getOCL().createOCLHelper();
		helper.setContext(getInitialGraph().getRoots().get(0).eClass());
		return helper;
	}
	
	public String print(EGraph graph) {
		return getSolutionPrinter().print(graph);
	}
	
	protected MatchHelper createMatchHelper(ParameterManager parameterManager) {
		return getFactory().createMatchHelper(parameterManager);
	}
	
	protected MatchHelper createMatchHelper() {
		return getFactory().createMatchHelper(getParameterManager());
	}
	
	public MatchHelper getMatchHelper() {
		if(matchHelper == null)
			matchHelper = getFactory().createMatchHelper(getParameterManager());
		return matchHelper;
	}
	
	@Override
	public IEGraphMultiDimensionalFitnessFunction getFitnessFunction() {
		return (IEGraphMultiDimensionalFitnessFunction) super.getFitnessFunction();
	}

	@Override
	protected MatchSolutionGenerator createSolutionGenerator() {
		return (MatchSolutionGenerator) createSolutionGenerator(getNrVariables());
	}
	
	@Override
	public MatchSolutionGenerator getSolutionGenerator() {
		return (MatchSolutionGenerator) super.getSolutionGenerator();
	}
	
	protected IRandomSolutionGenerator<MatchSolution> createSolutionGenerator(int nrVariables) {
		return new MatchSolutionGenerator(
				nrVariables, 
				getFitnessFunction().evaluatesNrObjectives(), 
				getFitnessFunction().evaluatesNrConstraints(), 
				getInitialGraph(),
				getMatchHelper());
	}
	
	@Override
	public ModelTransformationProblem getProblem() {
		return (ModelTransformationProblem) super.getProblem();
	}

	@Override
	protected ModelTransformationProblem createProblem() {
		return new ModelTransformationProblem(getFitnessFunction(), getSolutionGenerator());
	}
	
	@Override
	public IMatchSolutionPrinter getSolutionPrinter() {
		return (IMatchSolutionPrinter) super.getSolutionPrinter();
	}
	
	@Override
	protected ISolutionPrinter<MatchSolution> createSolutionPrinter() {
		return new GenericMatchSolutionPrinter()
				.setObjectiveNames(getFitnessFunction().getObjectiveNames())
				.setConstraintNames(getFitnessFunction().getConstraintNames());
	}
	
	@Override
	public MomotOrchestration setSolutionPrinter(ISolutionPrinter<MatchSolution> solutionPrinter) {
		if(!(solutionPrinter instanceof IMatchSolutionPrinter))
			throw new IllegalArgumentException("Solution Printer must implement IMatchSolutionPrinter.");
		super.setSolutionPrinter(solutionPrinter);
		return this;
	}
}
