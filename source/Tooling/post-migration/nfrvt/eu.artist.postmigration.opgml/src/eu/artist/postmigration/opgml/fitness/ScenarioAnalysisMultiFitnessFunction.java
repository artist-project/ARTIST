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

import at.ac.tuwien.big.moea.fitness.MultiDimensionalFitnessFunction;
import at.ac.tuwien.big.moea.fitness.dimension.AbstractFitnessDimension;
import eu.artist.postmigration.opgml.fitness.analysis.ScenarioAnalysis;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class ScenarioAnalysisMultiFitnessFunction extends MultiDimensionalFitnessFunction<PatternSelectionSolution> {	
	private PatternImpactEstimates impactEstimates;
	private UMLScenario scenario;
	private ScenarioAnalysis analysis;
	private int nrRequests;
	
	public ScenarioAnalysisMultiFitnessFunction(UMLScenario scenario, int nrRequests, PatternImpactEstimates impactEstimates) {
		super(PatternSelectionSolution.class);
		this.scenario = scenario;
		this.nrRequests = nrRequests;
		this.impactEstimates = impactEstimates;
		this.analysis = new ScenarioAnalysis(getScenario(), getImpactEstimates()).setNrRequests(nrRequests);
		initDimensions();
	}
	
	public ScenarioAnalysisMultiFitnessFunction(ScenarioAnalysis analysis) {
		super(PatternSelectionSolution.class);
		this.scenario = analysis.getScenario();
		this.nrRequests = analysis.getNrRequests();
		this.impactEstimates = analysis.getImpactEstimates();
		this.analysis = analysis;
		initDimensions();
	}

	protected void initDimensions() {
		initObjectiveDimensions();
		initConstraintDimensions();
	}
	
	protected void initObjectiveDimensions() {
		addObjective(new AbstractFitnessDimension<PatternSelectionSolution>(
				PatternSelectionSolution.class, "Cost") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
				return getAnalysis().getCost();
			}
		});
		
		addObjective(new AbstractFitnessDimension<PatternSelectionSolution>(PatternSelectionSolution.class, "Utilization") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
				return 1 - getAnalysis().getAvgUtilization();
			}
		});
		
		addObjective(new AbstractFitnessDimension<PatternSelectionSolution>(PatternSelectionSolution.class, "RunTimePerRequest") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
				return getAnalysis().getRunTimePerRequest();
			}
		});
	}
	
	protected void initConstraintDimensions() {
		addConstraint(new AbstractFitnessDimension<PatternSelectionSolution>(PatternSelectionSolution.class, "DuplicatePatterns") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
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
		});
		
		addConstraint(new AbstractFitnessDimension<PatternSelectionSolution>(PatternSelectionSolution.class, "DuplicateScaling") {
			@Override
			public double evaluate(PatternSelectionSolution solution) {
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
		});
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
	
	@Override
	protected void preprocessEvaluation(PatternSelectionSolution solution) {
		super.preprocessEvaluation(solution);
		solution.setAttribute("SCENARIO_ANALYSIS", getAnalysis());
		getAnalysis().setNrRequests(getNrRequests()).run(solution);
	}
	
	@Override
	protected void postprocessEvaluation(PatternSelectionSolution solution,
			double result) {
		super.postprocessEvaluation(solution, result);
		solution.removeAttribute("SCENARIO_ANALYSIS");
	}
}
