/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.workload;

import java.util.List;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;
import org.eclipse.uml2.uml.NamedElement;

/***
 * A workload scenario corresponds to one expected interaction with the modeled
 * software application. It consists of a workload event that triggered the 
 * interaction as well as all interaction steps.
 * 
 * @author Martin Fleck
 */
public class WorkloadScenario {
	
	private GaWorkloadEvent workloadEvent;
	private GaScenario scenario;
	private List<WorkloadScenarioStep> steps;

	public WorkloadScenario(GaWorkloadEvent workloadEvent, List<WorkloadScenarioStep> steps) {
		this.workloadEvent = workloadEvent;
		this.scenario = workloadEvent.getEffect();
		setSteps(steps);
	}
	
	public WorkloadScenario(GaScenario scenario, List<WorkloadScenarioStep> steps) {
		this.workloadEvent = scenario.getCause();
		this.scenario = scenario;
		this.steps = steps;
	}
	
	public GaWorkloadEvent getWorkloadEvent() {
		return workloadEvent;
	}

	public void setWorkloadEvent(GaWorkloadEvent workloadEvent) {
		this.workloadEvent = workloadEvent;
	}

	public GaScenario getScenario() {
		return scenario;
	}

	public void setScenario(GaScenario scenario) {
		this.scenario = scenario;
	}

	public List<WorkloadScenarioStep> getSteps() {
		return steps;
	}

	public void setSteps(List<WorkloadScenarioStep> steps) {
		for(WorkloadScenarioStep step : steps)
			step.setScenario(this);
		this.steps = steps;
	}
	
	public String getArrivalTimePattern() {
		return getWorkloadEvent().getPattern();
	}
	
	public NamedElement getScenarioUmlElement() {
		if(getScenario() == null)
			return null;
		return getScenario().getBase_NamedElement();
	}
	
	public String getName() {
		if(getScenario() == null)
			return null;
		return getScenario().getBase_NamedElement().getName();
	}
	
	@Override
	public String toString() {
		return getScenario().getRoot().getBase_NamedElement().getQualifiedName() + " of " + 
				getScenario().getBase_NamedElement().getQualifiedName() + " with '" + 
				getScenario().getCause().getPattern() + "' containing " + 
				getSteps().size() + " steps";
	}
}
