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

import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;

public class ModelAnnotator {
	
	private boolean modelIsAnnotated = false;
	private WorkloadSimulation simulation;
	
	public ModelAnnotator(WorkloadSimulation simulation) {
		this.simulation = simulation;
	}
	
	public WorkloadSimulation getSimulation() {
		return simulation;
	}
		
	
	public ModelAnnotator annotateModel() {
		if(modelIsAnnotated)
			return this;
		
		new ServiceCenterAnnotator(getSimulation()).annotate();
		new ScenarioAnnotator(getSimulation()).annotate();
		new WorkloadAnnotator(getSimulation()).annotate();
		modelIsAnnotated = true;
		
		return this;
	}
}
