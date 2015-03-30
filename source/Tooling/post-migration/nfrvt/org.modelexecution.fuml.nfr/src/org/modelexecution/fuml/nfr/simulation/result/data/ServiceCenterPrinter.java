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

import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;

import scala.collection.immutable.Range;
import scala.collection.immutable.Range.Inclusive;
import at.ac.tuwien.big.simpleqn.Service;

public class ServiceCenterPrinter extends AbstractServiceCenterPrinter implements IStaticResultPrinter, IEvolutionResultPrinter {

	private Service service;
	
	public ServiceCenterPrinter(char separator, Service service) {
		super(separator);
		this.service = service;
	}
	
	private Service getService() {
		return this.service;
	}
	
	public void printPropertyHeaderLine(StringBuilder builder) {
		printWithSeparator(builder, ServiceCenterResult.Time);
		printWithSeparator(builder, ServiceCenterResult.Name);
		printWithSeparator(builder, ServiceCenterResult.Utilization);
		printWithSeparator(builder, ServiceCenterResult.IdleTime);
		printWithSeparator(builder, ServiceCenterResult.BusyTime);
		printWithSeparator(builder, ServiceCenterResult.MaxQueueLength);
		printWithSeparator(builder, ServiceCenterResult.AvgQueueLength);
		printWithSeparator(builder, ServiceCenterResult.AvgDemandPerRequest);
		printWithSeparator(builder, ServiceCenterResult.Throughput);
		printNewLine(builder);
	}
	
	public void printPropertyEvolution(StringBuilder builder, int finalTime, int stepSize) {
		for(int i = 0; i < finalTime; i += stepSize)
			printPropertyValueLine(builder, i, stepSize);
	}
	
	public void printPropertyValueLine(StringBuilder builder, int time, int stepSize) {
		Inclusive range = new Inclusive(0, time, stepSize);
		printWithSeparator(builder, time);
		printWithSeparator(builder, getServiceName(getService()));
		printWithSeparator(builder, getService().utilization(range));
		printWithSeparator(builder, getService().idleTime(range));
		printWithSeparator(builder, getService().busyTime(range));
		printWithSeparator(builder, getService().maxQueueLength(range));
		printWithSeparator(builder, getService().avgQueueLength(range));
		printWithSeparator(builder, getService().avgServiceRequirementPerRequest(range));
		printWithSeparator(builder, getService().throughput(range));
		printNewLine(builder);
	}
	
	public void printStatic(StringBuilder builer, Range range) {
		if(getService() == null)
			return;
		printLine(builer, ServiceCenterResult.Name.getTitle() + ": " + getServiceName(getService()));
		printLine(builer, "  " + ServiceCenterResult.DefaultServiceTime.getTitle() +  ": " + getService().serviceTime());
		printLine(builer, "  " + ServiceCenterResult.Utilization.getTitle() +  ": " + getService().utilization(range));
		printLine(builer, "  " + ServiceCenterResult.IdleTime.getTitle() +  ": " + getService().idleTime(range));
		printLine(builer, "  " + ServiceCenterResult.BusyTime.getTitle() +  ": " + getService().busyTime(range));
		printLine(builer, "  " + ServiceCenterResult.MaxQueueLength.getTitle() +  ": " + getService().maxQueueLength(range));
		printLine(builer, "  " + ServiceCenterResult.AvgQueueLength.getTitle() +  ": " + getService().avgQueueLength(range));
		printLine(builer, "  " + ServiceCenterResult.AvgDemandPerRequest.getTitle() +  ": " + getService().avgServiceRequirementPerRequest(range));
		printLine(builer, "  " + ServiceCenterResult.Throughput.getTitle() +  ": " + getService().throughput(range));
		printNewLine(builer);
	}

}
