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
import org.modelexecution.fuml.nfr.simulation.result.WorkloadResult;

import scala.collection.immutable.Range;
import scala.collection.immutable.Range.Inclusive;
import at.ac.tuwien.big.simpleqn.QueuingNet;

public class WorkloadPrinter extends AbstractPrinter implements IStaticResultPrinter, IEvolutionResultPrinter {

	private QueuingNet net;
	
	public WorkloadPrinter(char separator, QueuingNet net) {
		super(separator);
		setQueuingNet(net);
	}

	public QueuingNet getQueuingNet() {
		return net;
	}
	
	public WorkloadPrinter setQueuingNet(QueuingNet net) {
		this.net = net;
		return this;
	}
	
	public void printPropertyHeaderLine(StringBuilder builder) {
		printWithSeparator(builder, WorkloadResult.Time.getTitle());
		printWithSeparator(builder, WorkloadResult.Utilization);
		printWithSeparator(builder, WorkloadResult.Throughput);
		printWithSeparator(builder, WorkloadResult.CompletedJobs);
		printWithSeparator(builder, WorkloadResult.BusyTime);
		printNewLine(builder);
	}
	
	public void printPropertyEvolution(StringBuilder builder, int finalTime, int stepSize) {
		for(int i = 0; i < finalTime; i += stepSize)
			printPropertyValueLine(builder, i, stepSize);
	}
	
	public void printPropertyValueLine(StringBuilder builder, int time, int stepSize) {
		Range range = new Inclusive(0, time, stepSize);
		printWithSeparator(builder, time);
		printWithSeparator(builder, net.utilization(range));
		printWithSeparator(builder, net.throughput(range));
		printWithSeparator(builder, net.completedJobs(range).size());
		printWithSeparator(builder, net.busyTime(range));
		printNewLine(builder);
	}
	
	public void printStatic(StringBuilder builder, Range range) {
		printLine(builder, WorkloadResult.Utilization + ":      " + net.utilization(range));
		printLine(builder, WorkloadResult.Throughput + ":       " + net.throughput(range));
		printLine(builder, WorkloadResult.CompletedJobs + ":   " + net.completedJobs(range).size());
		printLine(builder, WorkloadResult.Jobs + ":             " + net.jobs().size());
		printLine(builder, WorkloadResult.Services + ":         " + net.services().size());
		printLine(builder, WorkloadResult.CompletionTime + ":  " + net.completionTime());
		printLine(builder, WorkloadResult.LastArrivalTime + ": " + net.latestCompletingJob().arrivalTime());
	}
}
