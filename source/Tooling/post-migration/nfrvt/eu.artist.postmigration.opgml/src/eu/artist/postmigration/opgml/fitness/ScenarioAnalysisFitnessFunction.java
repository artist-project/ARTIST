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
package eu.artist.postmigration.opgml.fitness;

import java.util.Set;
import java.util.TreeSet;

import at.ac.tuwien.big.moea.fitness.AbstractFitnessFunction;
import eu.artist.postmigration.opgml.fitness.analysis.ScenarioAnalysis;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class ScenarioAnalysisFitnessFunction extends AbstractFitnessFunction<PatternSelectionSolution> {
	
	
	
	public static final int OBJECTIVE_UTILIZATION = 2;
	public static final int OBJECTIVE_COST = 0;
	public static final int OBJECTIVE_AVERAGE_RESPONSE_TIME = 1;
	public static final int OBJECTIVE_CONSTRAINT_VIOLATIONS = 3;
	
	public static final int CONSTRAINT_DUPLICATE_APPLICATIONS = 0;
	public static final int CONSTRAINT_DUPLICATE_SCALING = 1;
	
	private static final double CONSTRAINT_VIOLATED = 10000;
	private static final double CONSTRAINT_OK = 0;
	
	private PatternImpactEstimates impactEstimates;
	private UMLScenario scenario;
	private ScenarioAnalysis analysis;
	private int nrRequests;
	
	public ScenarioAnalysisFitnessFunction(UMLScenario scenario, int nrRequests, PatternImpactEstimates impactEstimates) {
		super(PatternSelectionSolution.class);
		this.scenario = scenario;
		this.nrRequests = nrRequests;
		this.impactEstimates = impactEstimates;
		this.analysis = new ScenarioAnalysis(getScenario(), getImpactEstimates()).setNrRequests(nrRequests);
	}
	
	public ScenarioAnalysisFitnessFunction(ScenarioAnalysis analysis) {
		super(PatternSelectionSolution.class);
		this.scenario = analysis.getScenario();
		this.nrRequests = analysis.getNrRequests();
		this.impactEstimates = analysis.getImpactEstimates();
		this.analysis = analysis;
	}

	public PatternImpactEstimates getImpactEstimates() {
		return impactEstimates;
	}

	public UMLScenario getScenario() {
		return scenario;
	}
	
	public ScenarioAnalysis getAnalysis() {
		return analysis;
	}
	
	public int getNrRequests() {
		return nrRequests;
	}

	public double validateDuplicateApplications(PatternSelectionSolution solution) {
		Set<UMLElement> cached = new TreeSet<>();
		Set<UMLElement> horizontal = new TreeSet<>();
		Set<UMLElement> auto = new TreeSet<>();
			
		for(IPatternTemplateVariable config : solution.getNonEmptyConfigurations())
			if(config instanceof CacheTemplate) {
				if(cached.contains(config.getApplication()))
					return CONSTRAINT_VIOLATED;
				cached.add(config.getApplication());
			} else if(config instanceof FixedScalingTemplate) {
				if(horizontal.contains(config.getApplication()))
					return CONSTRAINT_VIOLATED;
				horizontal.add(config.getApplication());
			} else if(config instanceof AutoScalingTemplate) {
				if(auto.contains(config.getApplication()))
					return CONSTRAINT_VIOLATED;
				auto.add(config.getApplication());
			}
		return CONSTRAINT_OK;
	}
	
	public double validateDuplicateScaling(PatternSelectionSolution solution) {
		Set<UMLElement> scaled = new TreeSet<>();
			
		for(IPatternTemplateVariable config : solution.getNonEmptyConfigurations())
			if(config instanceof FixedScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					return CONSTRAINT_VIOLATED;
				scaled.add(config.getApplication());
			} else if(config instanceof AutoScalingTemplate) {
				if(scaled.contains(config.getApplication()))
					return CONSTRAINT_VIOLATED;
				scaled.add(config.getApplication());
			}
		return CONSTRAINT_OK;
	}
	
	@Override
	public double evaluate(PatternSelectionSolution solution) {
		getAnalysis().setNrRequests(nrRequests).run(solution);
		
		solution.setObjective(OBJECTIVE_COST, getAnalysis().getCost());
		solution.setObjective(OBJECTIVE_UTILIZATION, 1 - getAnalysis().getAvgUtilization());
		solution.setObjective(OBJECTIVE_AVERAGE_RESPONSE_TIME, getAnalysis().getRunTimePerRequest());
		
		evaluateConstraints(solution);
		
		return getAggregateFitness(solution);
	}
	
	protected void evaluateConstraints(PatternSelectionSolution solution) {
		solution.setConstraint(CONSTRAINT_DUPLICATE_APPLICATIONS, validateDuplicateApplications(solution));
		solution.setConstraint(CONSTRAINT_DUPLICATE_SCALING, validateDuplicateScaling(solution));
	}

	@Override
	public int[] evaluatesObjectives() {
		return new int[] { OBJECTIVE_UTILIZATION, OBJECTIVE_COST, OBJECTIVE_AVERAGE_RESPONSE_TIME }; //, OBJECTIVE_CONSTRAINT_VIOLATIONS };
	}

	@Override
	public int[] evaluatesConstraints() {
		return new int[] { CONSTRAINT_DUPLICATE_APPLICATIONS, CONSTRAINT_DUPLICATE_SCALING };
	}
}
