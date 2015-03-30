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

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.simulation.usage.BasicResourceUsageSum;
import org.modelexecution.fuml.nfr.simulation.usage.IResourceUsageSum;

public class WorkloadScenarioStep {
	private WorkloadScenario scenario;
	private ServiceCenter serviceCenter;
	private GaStep step;
	private IResourceUsageSum resourceUsage;
	
	public WorkloadScenarioStep(ServiceCenter service, GaStep step) {
		setServiceCenter(service);
		setGaStep(step);
	}

	public ServiceCenter getServiceCenter() {
		return serviceCenter;
	}

	public WorkloadScenarioStep setServiceCenter(ServiceCenter service) {
		this.serviceCenter = service;
		return this;
	}

	public GaStep getGaStep() {
		return step;
	}

	public WorkloadScenarioStep setGaStep(GaStep step) {
		this.step = step;
		this.resourceUsage = new BasicResourceUsageSum(step.getBase_NamedElement(), step);
		return this;
	}
	
	public IResourceUsageSum getResourceUsage() {
		return resourceUsage;
	}
	
	public NamedElement getUmlElement() {
		if(step != null)
			return step.getBase_NamedElement();
		return null;
	}
	
	public WorkloadScenarioStep reComputeSums() {
		getResourceUsage().reComputeSums();
		return this;
	}
	
	public WorkloadScenario getScenario() {
		return scenario;
	}
	
	public WorkloadScenarioStep setScenario(WorkloadScenario scenario) {
		this.scenario = scenario;
		return this;
	}
	
	public String getName() {
		if(getGaStep() == null)
			return "";
		return getGaStep().getBase_NamedElement().getName();
	}
	
	@Override
	public String toString() {
		return getResourceUsage().getExecTimeSum() + "ms " + getName() + " on " + getServiceCenter().getName();
	}
}
