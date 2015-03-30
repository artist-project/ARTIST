/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result;

public enum ScenarioResult implements ISimulationResult {
	Goal("Goal", "goal"),
	Name("Name", "name"),
	AvgResidenceTime("Avg Residence Time", "avgResidenceTime"),
	MinResidenceTime("Min Residence Time", "minResidenceTime"),
	MaxResidenceTime("Max Residence Time", "maxResidenceTime"),
	AvgServiceTime("Avg Service Time", "avgServiceTime"),
	MinServiceTime("Min Service Time", "minServiceTime"),
	MaxServiceTime("Max Service Time", "maxServiceTime"),
	AvgWaitingTime("Avg Waiting Time", "avgWaitingTime"),
	MinWaitingTime("Min Waiting Time", "minWaitingTime"),
	MaxWaitingTime("Max Waiting Time", "maxWaitingTime")
	;
	
	
	private final String title;
	private final String qualifierName;
	
	private ScenarioResult(String title, String qualifierName) {
		this.title = title;
		this.qualifierName = qualifierName;
	}
	
	public String getQualifierName() {
		return qualifierName;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return getQualifierName();
	}
}
