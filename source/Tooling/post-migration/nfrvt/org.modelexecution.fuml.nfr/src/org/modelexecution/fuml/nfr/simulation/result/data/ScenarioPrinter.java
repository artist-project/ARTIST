/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.data;

import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;
import org.modelexecution.fuml.nfr.simulation.result.ScenarioResult;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;

import scala.collection.immutable.Range;
import at.ac.tuwien.big.simpleqn.QueuingNet;

public class ScenarioPrinter extends AbstractPrinter implements IStaticResultPrinter {

	private QueuingNet net;
	private WorkloadScenario scenario;
	
	public ScenarioPrinter(char separator, QueuingNet net, WorkloadScenario scenario) {
		super(',');
		setQueuingNet(net);
		setWorkloadScenario(scenario);
	}
	
	public WorkloadScenario getWorkloadScenario() {
		return scenario;
	}
	
	public ScenarioPrinter setWorkloadScenario(WorkloadScenario scenario) {
		this.scenario = scenario;
		return this;
	}
	
	public QueuingNet getQueuingNet() {
		return net;
	}
	
	public ScenarioPrinter setQueuingNet(QueuingNet net) {
		this.net = net;
		return this;
	}
	
	public void printStatic(StringBuilder builer, Range range) {
		String scenarioName = getWorkloadScenario().getName();
		printLine(builer, ScenarioResult.Name.getTitle() + ": " + scenarioName);
		printLine(builer, ScenarioResult.AvgResidenceTime.getTitle() + "  : " + getQueuingNet().averageResidenceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MinResidenceTime.getTitle() + "  : " + getQueuingNet().minResidenceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MaxResidenceTime.getTitle() + "  : " + getQueuingNet().maxResidenceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.AvgServiceTime.getTitle() + "  :   " + getQueuingNet().averageServiceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MinServiceTime.getTitle() + "  :   " + getQueuingNet().minServiceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MaxServiceTime.getTitle() + "  :   " + getQueuingNet().maxServiceTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.AvgWaitingTime.getTitle() + "  :   " + getQueuingNet().averageWaitingTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MinWaitingTime.getTitle() + "  :   " + getQueuingNet().minWaitingTimeOfJobCategory(scenarioName));
		printLine(builer, ScenarioResult.MaxWaitingTime.getTitle() + "  :   " + getQueuingNet().maxWaitingTimeOfJobCategory(scenarioName));
		printNewLine(builer);
	}
}
