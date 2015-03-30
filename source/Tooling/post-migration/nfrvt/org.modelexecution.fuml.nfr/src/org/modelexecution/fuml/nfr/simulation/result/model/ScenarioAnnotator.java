/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.ScenarioResult;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;

public class ScenarioAnnotator extends AbstractAnnotator {

	public ScenarioAnnotator(WorkloadSimulation simulation) {
		super(simulation);
	}
	
	private void annotateScenario(WorkloadScenario scenario) {
		String scenarioName = scenario.getName();
		EList<String> result = createResultList();
		result.add(getResultString(ScenarioResult.AvgResidenceTime, getQueuingNet().averageResidenceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MinResidenceTime, getQueuingNet().minResidenceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MaxResidenceTime, getQueuingNet().maxResidenceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.AvgServiceTime, getQueuingNet().averageServiceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MinServiceTime, getQueuingNet().minServiceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MaxServiceTime, getQueuingNet().maxServiceTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.AvgWaitingTime, getQueuingNet().averageWaitingTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MinWaitingTime, getQueuingNet().minWaitingTimeOfJobCategory(scenarioName)));
		result.add(getResultString(ScenarioResult.MaxWaitingTime, getQueuingNet().maxWaitingTimeOfJobCategory(scenarioName)));
		
		MarteUtil.setOrUpdateFeature(
				scenario.getScenarioUmlElement(),
				GaAnalysisContext.class, "context", result);
	}
	
	@Override
	public void annotate() {
		for(WorkloadScenario scenario : getSimulation().getWorkload().getScenarios()) 
			annotateScenario(scenario);
	}

}
