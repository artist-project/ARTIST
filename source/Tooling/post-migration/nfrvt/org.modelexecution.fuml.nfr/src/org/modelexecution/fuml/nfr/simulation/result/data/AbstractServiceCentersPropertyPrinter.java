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

import java.util.List;

import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;

import scala.collection.immutable.Range;
import scala.collection.immutable.Range.Inclusive;

import at.ac.tuwien.big.simpleqn.Service;

public abstract class AbstractServiceCentersPropertyPrinter extends AbstractServiceCenterPrinter implements IEvolutionResultPrinter {

	private List<Service> services;
	
	public AbstractServiceCentersPropertyPrinter(char separator, List<Service> services) {
		super(separator);
		this.services = services;
	}
	
	protected List<Service> getServices() {
		return this.services;
	}
	
	public void printPropertyHeaderLine(StringBuilder builder) {
		printWithSeparator(builder, ServiceCenterResult.Time.getTitle());
		printWithSeparator(builder, ServiceCenterResult.Goal.getTitle());
		for(Service service : services)
			printWithSeparator(builder, getServiceName(service));
		printNewLine(builder);
	}
	
	public void printPropertyEvolution(StringBuilder builder, int finalTime, int stepSize) {
		for(int i = 0; i < finalTime; i += stepSize)
			printPropertyValueLine(builder, i, stepSize);
	}
	
	public void printPropertyValueLine(StringBuilder builder, int time, int stepSize) {
		Inclusive range = new Inclusive(0, time, stepSize);
		printWithSeparator(builder, time);
		printWithSeparator(builder, getGoalValue());
		for(Service service : getServices())
			printPropertyValue(builder, service, range);
		printNewLine(builder);
	}
	
	protected abstract void printPropertyValue(StringBuilder builder, Service service, Range range);
	
	protected double getGoalValue() {
		return 1.0;
	}
}
