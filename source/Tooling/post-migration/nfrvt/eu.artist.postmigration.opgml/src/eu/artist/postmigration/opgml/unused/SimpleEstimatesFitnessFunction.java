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

import java.util.List;

import org.moeaframework.core.Solution;
import org.moeaframework.core.Variable;
import org.moeaframework.core.variable.RealVariable;

import eu.artist.postmigration.opgml.gml.Property;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.PatternTemplatePlaceholder;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;

public class SimpleEstimatesFitnessFunction extends AbstractEstimatesFitnessFunction {

	public SimpleEstimatesFitnessFunction(Property[] properties, PatternImpactEstimates estimates) {
		super(properties, estimates);
	}
	
	public SimpleEstimatesFitnessFunction(List<Property> properties, PatternImpactEstimates estimates) {
		super(properties, estimates);
	}
	
	protected RealVariable fitValue(RealVariable range, double value) {
		RealVariable var = range.copy();
		double val = value;
		if(val < range.getLowerBound())
			val = range.getLowerBound();
		if(val > range.getUpperBound())
			val = range.getUpperBound();
		var.setValue(val);
		return var;
	}
	
	protected void evaluateUtilization(Solution solution, Property property) {
		double utilizationImprovement = 0.0;
		
		for(int i = 0; i < solution.getNumberOfVariables(); i++) {
			Variable var = solution.getVariable(i);
			if(var instanceof IPatternTemplateVariable) 
				utilizationImprovement += evaluateProperty(property, (IPatternTemplateVariable)var);
		}
		RealVariable utilization = fitValue(property.getRange(), (1-utilizationImprovement) * property.getRange().getUpperBound());
		solution.setObjective(getIndex(property), rescaleZeroToOne(utilization));
	}
	
	protected void evaluateCost(Solution solution, Property property) {
		double costSum = 0.0;
		for(int i = 0; i < solution.getNumberOfVariables(); i++) {
			Variable var = solution.getVariable(i);
			if(var instanceof IPatternTemplateVariable)
				costSum += evaluateProperty(property, (IPatternTemplateVariable)var);
		}
		RealVariable cost = fitValue(property.getRange(), costSum);
		solution.setObjective(getIndex(property), rescaleZeroToOne(cost));
	}
	
	protected void evaluateResponseTime(Solution solution, Property property) {
		double responseTimeImprovement = 0.0;
		for(int i = 0; i < solution.getNumberOfVariables(); i++) {
			Variable var = solution.getVariable(i);
			if(var instanceof IPatternTemplateVariable) 
				responseTimeImprovement += evaluateProperty(property, (IPatternTemplateVariable)var);
		}
		RealVariable responseTime = fitValue(property.getRange(), (1-responseTimeImprovement) * property.getRange().getUpperBound()); 
		solution.setObjective(getIndex(property), rescaleZeroToOne(responseTime));
	}

	protected Double evaluateCost(PatternTemplatePlaceholder config, Property property) {
		return ZERO;
	}
	
	protected Double evaluateCost(CacheTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property);
	}
	
	protected Double evaluateCost(FixedScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getInstances();
	}
	
	protected Double evaluateCost(AutoScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getAvgInstances();
	}
	
	protected Double evaluateResponseTime(PatternTemplatePlaceholder config, Property property) {
		return ZERO;
	}
	
	protected Double evaluateResponseTime(CacheTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property);
	}
	
	protected Double evaluateResponseTime(FixedScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getInstances();
	}
	
	protected Double evaluateResponseTime(AutoScalingTemplate config, Property property) {
		return getEstimates().getEstimate(config.getClass(), config.getApplication(), property) * config.getAvgInstances();
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
}
