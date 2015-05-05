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
package eu.artist.postmigration.opgml.unused;

import org.moeaframework.core.Solution;

import at.ac.tuwien.big.moea.util.MathUtil;
import eu.artist.postmigration.opgml.gml.GoalModel;
import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.gml.RealGoal;
import eu.artist.postmigration.opgml.util.OPGMLUtil;
import eu.artist.postmigration.opgml.variable.AppliedTransformationSet;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;

public class GoalDifferenceFitnessFunction extends AbstractGoalFitnessFunction {
	
	private static final double DEFAULT_PENALTY_FACTOR = 1.0;
	
	private double penaltyFactor;
	
	public GoalDifferenceFitnessFunction(GoalModel goals,
			PatternImpactEstimates estimates) {
		this(goals, estimates, DEFAULT_PENALTY_FACTOR);
	}
	
	public GoalDifferenceFitnessFunction(GoalModel goals,
			PatternImpactEstimates estimates,
			double penaltyFactor) {
		super(goals, estimates);
		setPenaltyFactor(penaltyFactor);
	}
	
	public double difference(RealGoal goal, double value) {
		double goalDiff = goal.calcAbsoluteDifferenceToGoal(value);
		return Math.abs(goalDiff + punishment(goalDiff, goal.getPriority()));
	}
	
	public double punishment(double goalDiff, int priority) {
		double zeroOnePriority = MathUtil.rescaleZeroOne(priority, getGoals().getPriorityRange());
		double priorityFactor = 1 - zeroOnePriority;
		
		return priorityFactor * goalDiff * getPenaltyFactor();
	}

	public double getPenaltyFactor() {
		return penaltyFactor;
	}

	public void setPenaltyFactor(double penaltyFactor) {
		this.penaltyFactor = penaltyFactor;
	}
	
	protected Double evaluateUtilization(PatternTemplatePlaceholder config, Property property) {
		return ZERO;
	}
	
	protected Double evaluateUtilization(CacheTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property);
	}
	
	protected Double evaluateUtilization(FixedScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getInstances();
	}
	
	protected Double evaluateUtilization(AutoScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getAvgInstances();
	}
	
	protected double getAbsoluteValue(Property property, double improvement) {
		return (1-improvement) * property.getRange().getUpperBound();
	}
	
	protected void evaluateUtilization(Solution solution, Property property) {
		AppliedTransformationSet configurationSet = OPGMLUtil.convert(solution);
		
		double difference = 0.0;
		for(RealGoal goal : getGoals().getGoals(property)) {
			double improvement = 0.0;
			for(IPatternTemplateVariable config : configurationSet.getConfigurations(goal.getUMLElement()))
				improvement += evaluateProperty(property, config);
			double utilization = getAbsoluteValue(property, improvement);
			difference += difference(goal, utilization);
		}
		solution.setObjective(getIndex(property), difference);
	}
	
	protected void evaluateCost(Solution solution, Property property) {
		AppliedTransformationSet configurationSet = OPGMLUtil.convert(solution);
		
		double difference = 0.0;
		for(RealGoal goal : getGoals().getGoals(property)) {
			double cost = 0.0;
			for(IPatternTemplateVariable config : configurationSet.getConfigurations(goal.getUMLElement()))
				cost += evaluateProperty(property, config);
			difference += difference(goal, cost);
		}
		solution.setObjective(getIndex(property), difference);
	}
	
	protected void evaluateResponseTime(Solution solution, Property property) {
		AppliedTransformationSet configurationSet = OPGMLUtil.convert(solution);
		
		double difference = 0.0;
		for(RealGoal goal : getGoals().getGoals(property)) {
			double improvement = 0.0;
			for(IPatternTemplateVariable config : configurationSet.getConfigurations(goal.getUMLElement()))
				improvement += evaluateProperty(property, config);
			double responseTime = getAbsoluteValue(property, improvement);
			difference += difference(goal, responseTime);
		}
		solution.setObjective(getIndex(property), difference);
	}
}
