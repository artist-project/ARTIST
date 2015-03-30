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

import at.ac.tuwien.big.moea.util.MathUtil;
import eu.artist.postmigration.opgml.fitness.analysis.ScenarioAnalysis;
import eu.artist.postmigration.opgml.gml.GoalModel;
import eu.artist.postmigration.opgml.gml.PropertyCatalogue;
import eu.artist.postmigration.opgml.gml.RealGoal;
import eu.artist.postmigration.opgml.gml.uml.UMLClass;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class GoalAnalysisFitnessFunction extends ScenarioAnalysisFitnessFunction {
	
	private GoalModel goals;
	private double penaltyFactor = 1.0;
	
	public GoalAnalysisFitnessFunction(
			UMLScenario scenario,
			int nrRequests,
			PatternImpactEstimates impactEstimates,
			GoalModel goals) {
		super(scenario, nrRequests, impactEstimates);
		this.goals = goals;
	}
	
	public GoalAnalysisFitnessFunction(
			ScenarioAnalysis analysis,
			GoalModel goals) {
		super(analysis);
		this.goals = goals;
	}
	
	public GoalAnalysisFitnessFunction(
			ScenarioAnalysis analysis,
			GoalModel goals,
			double penaltyFactor) {
		super(analysis);
		this.goals = goals;
		this.penaltyFactor = penaltyFactor;
	}
	
	public GoalAnalysisFitnessFunction(
			UMLScenario scenario,
			int nrRequests,
			PatternImpactEstimates impactEstimates,
			GoalModel goals,
			double penaltyFactor) {
		super(scenario, nrRequests, impactEstimates);
		this.goals = goals;
		this.penaltyFactor = penaltyFactor;
	}

	public GoalModel getGoals() {
		return goals;
	}
	
	@Override
	public double evaluate(PatternSelectionSolution solution) {
		getAnalysis().run(solution);		

		solution.setObjective(OBJECTIVE_COST, getCostDifference());
		solution.setObjective(OBJECTIVE_UTILIZATION, getUtilizationDifference());
		solution.setObjective(OBJECTIVE_AVERAGE_RESPONSE_TIME, getResponseTimeDifference());
		
		evaluateConstraints(solution);
		
		return getAggregateFitness(solution);
	}
	
	private double getResponseTimeDifference() {
		double responseTimeDiff = 0.0;
		for(RealGoal goal : getGoals().getGoals(PropertyCatalogue.AverageResponseTime))
			responseTimeDiff += getResponseTimeDifference(goal);
		return responseTimeDiff;
	}
	
	private double getResponseTimeDifference(RealGoal goal) {
		double timeDiff = 0.0;
		if(goal.getProperty().equals(PropertyCatalogue.AverageResponseTime) && goal.getUMLElement() instanceof UMLClass)
			timeDiff += goal.calcRelativeDifferenceToGoal(getAnalysis().getExecutionTimePerRequest((UMLClass) goal.getUMLElement()));
		double diff = timeDiff * (getPriorityFactor(goal.getPriority()) + getPenaltyFactor());
		return diff;
	}
	
	private double getCostDifference() {
		double costDiff = 0.0;
		for(RealGoal goal : getGoals().getGoals(PropertyCatalogue.Cost))
			costDiff += getCostDifference(goal);
		return costDiff;
	}
	
	private double getCostDifference(RealGoal goal) {
		double costDiff = 0.0;
		if(goal.getProperty().equals(PropertyCatalogue.Cost))
			costDiff += goal.calcRelativeDifferenceToGoal(getAnalysis().getCost(goal.getUMLElement()));
		double diff = costDiff * (getPriorityFactor(goal.getPriority()) + getPenaltyFactor());
		return diff;
	}
	
	private double getUtilizationDifference() {
		double utilizationDiff = 0.0;
		for(RealGoal goal : getGoals().getGoals(PropertyCatalogue.Utilization))
			utilizationDiff += getUtilizationDifference(goal);
		return utilizationDiff;
	}
	
	private double getUtilizationDifference(RealGoal goal) {
		double utilizationDiff = 0.0;
		if(goal.getProperty().equals(PropertyCatalogue.Utilization) && goal.getUMLElement() instanceof UMLClass)
			utilizationDiff += goal.calcAbsoluteDifferenceToGoal(getAnalysis().getUtilization((UMLClass) goal.getUMLElement()));
		
		double diff = utilizationDiff * (getPriorityFactor(goal.getPriority()) + getPenaltyFactor());
		return diff;
	}
	
	private double getPriorityFactor(int priority) {
		double zeroOnePriority = MathUtil.rescaleZeroOne(priority, getGoals().getPriorityRange());
		return 1 - zeroOnePriority;
	}

	public double getPenaltyFactor() {
		return penaltyFactor;
	}
}
