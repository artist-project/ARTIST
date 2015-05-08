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
package eu.artist.postmigration.opgml.fitness.analysis;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import at.ac.tuwien.big.moea.util.TextUtil;
import eu.artist.postmigration.opgml.gml.uml.UMLClass;
import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLMethod;
import eu.artist.postmigration.opgml.gml.uml.UMLModel;
import eu.artist.postmigration.opgml.gml.uml.UMLScenario;
import eu.artist.postmigration.opgml.input.PatternImpactEstimates;
import eu.artist.postmigration.opgml.util.OPGMLUtil;
import eu.artist.postmigration.opgml.variable.AutoScalingTemplate;
import eu.artist.postmigration.opgml.variable.CacheTemplate;
import eu.artist.postmigration.opgml.variable.FixedScalingTemplate;
import eu.artist.postmigration.opgml.variable.IPatternTemplateVariable;
import eu.artist.postmigration.opgml.variable.PatternSelectionSolution;

public class ScenarioAnalysis implements Serializable {
	
	private static final long serialVersionUID = -8213554637714466096L;

	private static final double BASE_TIME = 0.0;
	private static final double BASE_COST = 0.0;
	private static final double BASE_SPEEDUP = 1.0;
	
	private UMLScenario scenario;
	private PatternImpactEstimates impactEstimates;
	private Map<UMLClass, Double> instances = new TreeMap<>();
	private Map<UMLClass, Double> executionTimesPerRequest = new TreeMap<>();
	private Map<UMLClass, Double> utilizations = new TreeMap<>();
	private Map<UMLElement, Double> costs = new TreeMap<>();
	
	private PatternSelectionSolution latestSolution = null;
	
	private int nrRequests = 1;
	
	public ScenarioAnalysis(ScenarioAnalysis analysis) {
		this.scenario = analysis.getScenario();
		this.impactEstimates = analysis.getImpactEstimates();
	}
	
	public ScenarioAnalysis(UMLScenario scenario, PatternImpactEstimates impactEstimates) {
		this.scenario = scenario;
		this.impactEstimates = impactEstimates;
	}
	
	public UMLScenario getScenario() {
		return scenario;
	}
	
	public int getNrRequests() {
		return nrRequests;
	}
	
	public double getInstances(UMLClass umlClass) {
		Double instances = this.instances.get(umlClass);
		if(instances == null)
			return 0.0;
		return instances;
	}

	public ScenarioAnalysis setNrRequests(int nrRequests) {
		if(nrRequests >= 0)
			this.nrRequests = nrRequests;
		return this;
	}
	
	public double getCost() {
		return getCost(UMLModel.COMPLETE_APPLICATION);
	}
	
	public double getCostPerRequest() {
		return getCost() / getNrRequests();
	}
	
	public double getCost(UMLElement umlElement) {
		Double cost = costs.get(umlElement);
		if(cost == null)
			return BASE_COST;
		return cost;
	}
		
	public double getRunTime() {
		return getExecutionTime(UMLModel.COMPLETE_APPLICATION);
	}
	
	public double getRunTimePerRequest() {
		return getExecutionTimePerRequest(UMLModel.COMPLETE_APPLICATION);
	}
	
	public double getExecutionTimePerRequest(UMLClass umlClass) {
		return getExecutionTime(umlClass) / getNrRequests();
	}
	
	public double getExecutionTime(UMLClass umlClass) {
		Double execTime = executionTimesPerRequest.get(umlClass);
		if(execTime == null)
			return BASE_TIME;
		return execTime * getNrRequests();
	}

	public double getUtilization() {
		return getUtilization(UMLModel.COMPLETE_APPLICATION);
	}
	
	public double getUtilization(UMLClass umlClass) {
		Double utilization = utilizations.get(umlClass);
		if(utilization == null || utilization == 0.0)
			return BASE_TIME;
		return utilization;
	}
	
	public double getUtilizationPerInstance(UMLClass umlClass) {
		return getUtilization(umlClass) / getInstances(umlClass);
	}
	
	public double getAvgUtilization() {
		return getUtilization() / instances.size();
	}
	
	public PatternImpactEstimates getImpactEstimates() {
		return impactEstimates;
	}
	
	public ScenarioAnalysis run() {
		return run(new PatternSelectionSolution(0, 0));
	}
	
	public ScenarioAnalysis run(PatternSelectionSolution set) {
		this.latestSolution = set;
		retrieveInstances();
		calculateExecutionTimes();
		calculateUtilizations();
		calculateCosts();
		return this;
	}
	
	private PatternSelectionSolution getLatestSet() {
		return latestSolution;
	}
	
	private void calculateUtilizations() {
		double sum = 0.0;
		for(UMLClass umlClass : instances.keySet()) {
			double utilization = getExecutionTime(umlClass) / getRunTime();
			utilizations.put(umlClass, utilization);
			sum += utilization;
		}
		utilizations.put(UMLModel.COMPLETE_APPLICATION, sum);
	}
	
	protected double calculateSpeedUp(UMLMethod method, CacheTemplate config) {
		UMLElement entity = config.getApplication();
		if(//method.getSimpleName().contains("findAll") && 
			method.getSimpleName().contains(entity.getName()))
			return getImpactEstimates().getCacheSpeedUp(entity) - BASE_SPEEDUP;
		
		return PatternImpactEstimates.NEUTRAL_SPEEDUP;
	}
	
	protected double calculateSpeedUp(UMLMethod method, FixedScalingTemplate config) {
		if(method.getUMLClass().equals(config.getApplication()))
			return (config.getInstances() * getImpactEstimates().getInstanceSpeedUp(config.getApplication())) - BASE_SPEEDUP;
		return PatternImpactEstimates.NEUTRAL_SPEEDUP;
	}
	
	protected double calculateSpeedUp(UMLMethod method, AutoScalingTemplate config) {
		if(method.getUMLClass().equals(config.getApplication()))
			return (config.getAvgInstances() * getImpactEstimates().getInstanceSpeedUp(config.getApplication())) - BASE_SPEEDUP;
		return PatternImpactEstimates.NEUTRAL_SPEEDUP;
	}
	
	protected double calculateSpeedUp(UMLMethod method, IPatternTemplateVariable config) {
		if(config instanceof CacheTemplate)
			return calculateSpeedUp(method, (CacheTemplate)config);
		if(config instanceof FixedScalingTemplate)
			return calculateSpeedUp(method, (FixedScalingTemplate)config);
		if(config instanceof AutoScalingTemplate)
			return calculateSpeedUp(method, (AutoScalingTemplate)config);
		return PatternImpactEstimates.NEUTRAL_SPEEDUP;
	}
	
	protected double calculateSpeedUp(PatternSelectionSolution set, UMLMethod step) {
		double speedUp = BASE_SPEEDUP;
		for(IPatternTemplateVariable config : set.getConfigurations())
			speedUp += calculateSpeedUp(step, config);
		return speedUp;
	}
	
	protected double calculateExecutionTime(PatternSelectionSolution set, UMLMethod step) {
		return step.getExecutionTime() / calculateSpeedUp(set, step);
	}
		
	protected double calculateExecutionTimes() {	
		double runTime = BASE_TIME;
		executionTimesPerRequest.clear();
		for(UMLMethod step : getScenario().getSteps()) {
			double execTime = calculateExecutionTime(getLatestSet(), step);
			Double prevExecTime = executionTimesPerRequest.get(step.getUMLClass());
			if(prevExecTime == null)
				prevExecTime = 0.0;
			executionTimesPerRequest.put(step.getUMLClass(), prevExecTime + execTime);
			runTime += execTime;
		}
		executionTimesPerRequest.put(UMLModel.COMPLETE_APPLICATION, runTime);
		return runTime;
	}
	
	protected double calculateCost(IPatternTemplateVariable config) {
		if(config instanceof CacheTemplate)
			return calculateCost((CacheTemplate)config);
		if(config instanceof FixedScalingTemplate)
			return calculateCost((FixedScalingTemplate)config);
		if(config instanceof AutoScalingTemplate)
			return calculateCost((AutoScalingTemplate)config);
		return PatternImpactEstimates.NEUTRAL_COST;
	}
	
	protected double calculateCost(CacheTemplate config) {
		return getImpactEstimates().getPriceOfChachePerTimeUnit() * getRunTime();
	}
	
	protected double calculateCost(FixedScalingTemplate config) {
		return getImpactEstimates().getPriceOfInstancePerTimeUnit() * getRunTime() * config.getInstances();
	}
	
	protected double calculateCost(AutoScalingTemplate config) {
		return getImpactEstimates().getPriceOfInstancePerTimeUnit() * getRunTime() * config.getAvgInstances();
	}
	
	protected void retrieveInstances() {
		instances.clear();
		for(IPatternTemplateVariable config : getLatestSet().getConfigurations())
			if(config instanceof FixedScalingTemplate) {
				FixedScalingTemplate fixed = (FixedScalingTemplate) config;
				instances.put(fixed.getApplication(), 0.0 + fixed.getInstances());
			} else if(config instanceof AutoScalingTemplate) {
				AutoScalingTemplate auto = (AutoScalingTemplate) config;
				instances.put(auto.getApplication(), 0.0 + auto.getAvgInstances());
			}
		
		for(UMLMethod method : getScenario().getSteps()) 
			if(!instances.containsKey(method.getUMLClass()))
				instances.put(method.getUMLClass(), 1.0);
	}
	
	protected double calculateCosts() {
		double costSum = BASE_COST;
		costs.clear();
		for(IPatternTemplateVariable config : getLatestSet().getConfigurations()) {
			double cost = calculateCost(config);
			Double prevCosts = costs.get(config.getApplication());
			if(prevCosts == null)
				prevCosts = 0.0;
			costs.put(config.getApplication(), prevCosts + cost);			
			costSum += cost;
		}
		for(UMLClass umlClass : instances.keySet())
			if(!costs.containsKey(umlClass)) {
				double cost = getRunTime() * impactEstimates.getPriceOfInstancePerTimeUnit();
				costs.put(umlClass, cost);
				costSum += cost;
			}
		costs.put(UMLModel.COMPLETE_APPLICATION, costSum);
		return costSum;
	}
	
	@Override
	public String toString() {
		String indent = "  ";
		String analysis = "";
		analysis += "Configuration Set:\n";
		analysis += getLatestSet().toString(indent) + "\n";
		analysis += "\n";
		analysis += "Scenario:\n";
		analysis += getScenario().toString(indent) + "\n";
		analysis += "\n";
		analysis += "Settings:\n";
		analysis += getImpactEstimates().toString(indent);
		analysis += "\n";
		analysis += "Instances:\n";
		analysis += OPGMLUtil.toString(instances, indent);
		analysis += "\n";
		analysis += "Execution Times per Request:\n";
		analysis += OPGMLUtil.toString(executionTimesPerRequest, indent);
		analysis += "\n";
		analysis += "Costs:\n";
		analysis += OPGMLUtil.toString(costs, indent);
		analysis += "\n";
		
		analysis += "Utilization:\n";
		Set<UMLClass> classes = executionTimesPerRequest.keySet();
		for(UMLClass umlClass : classes)
			analysis += indent + umlClass.getName() + ": " + TextUtil.toString(getUtilization(umlClass), 10) + "\n";
		
		analysis += "\n";
		analysis += "Runtime / Request: " + getRunTimePerRequest() + "\n";
		analysis += "Cost / Request: " + getCostPerRequest() + "\n";
		analysis += "Average Utilization: " + getAvgUtilization() + "\n";
		analysis += "\n";
		analysis += "Nr Requests: " + getNrRequests() + "\n";
		analysis += "Total Runtime: " + getRunTime() + "\n";
		analysis += "Total Cost: " + getCost() + "\n";
		analysis += "Total Utilization: " + getUtilization() + "\n";
		return analysis;
	}

}
