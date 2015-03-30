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

public enum ServiceCenterResult implements ISimulationResult {
	
	Time("Time", "time"),
	Goal("Goal", "goal"),
	Name("Name", "name"),
	DefaultServiceTime("Default Service Time", "defaultServiceTime"),
	Utilization("Utilization", "utilization"),
	IdleTime("Idle Time", "idleTime"),
	BusyTime("Busy Time", "busyTime"),
	MaxQueueLength("Max Queue Length", "maxQueueLength"),
	AvgQueueLength("Avg Queue Length", "avgQueueLength"),
	AvgDemandPerRequest("Avg Demand per Request", "avgDemandPerRequest"),
	Throughput("Throughput", "throughput");
	
	private final String title;
	private final String qualifierName;
	
	private ServiceCenterResult(String title, String qualifierName) {
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
