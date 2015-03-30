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

public enum WorkloadResult implements ISimulationResult {
	
	Time("Time", "time"),
	Goal("Goal", "goal"),
	Jobs("Jobs", "jobs"),
	Services("Services", "services"),
	LastArrivalTime("LastArrival Time", "lastArrivalTime"),
	CompletionTime("Completion Time", "completionTime"),
	Utilization("Utilization", "utilization"),
	Throughput("Throughput", "throughput"),
	CompletedJobs("Completed Jobs", "completedJobs"),
	BusyTime("Busy Time", "busyTime")
	;
	
	private final String title;
	private final String qualifierName;
	
	private WorkloadResult(String title, String qualifierName) {
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
