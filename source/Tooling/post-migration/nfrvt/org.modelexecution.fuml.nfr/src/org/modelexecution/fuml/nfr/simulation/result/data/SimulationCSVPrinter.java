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

import java.io.IOException;
import java.io.OutputStream;

import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.AbstractPrinter;
import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;

import scala.collection.immutable.Range.Inclusive;
import at.ac.tuwien.big.simpleqn.Service;

public class SimulationCSVPrinter extends AbstractPrinter {

	private static final int ONE_SECOND = 1000;
	private static final char SEPARATOR = ',';
	
	private WorkloadSimulation simulation;
	private WorkloadPrinter netPrinter;
	private int finalTime;
	private int timeStepSize;
	
	public SimulationCSVPrinter(WorkloadSimulation simulation) {
		super(SEPARATOR);
		this.simulation = simulation;
		this.finalTime = simulation.getQueuingNet().completionTime();
		this.timeStepSize = ONE_SECOND;
	}
	
	public int getTimeStepSize() {
		return timeStepSize;
	}
	
	public SimulationCSVPrinter setTimeStepSize(int timeStepSize) {
		this.timeStepSize = timeStepSize;
		return this;
	}
	
	public int getFinalTime() {
		return finalTime;
	}

	public SimulationCSVPrinter setFinalTime(int finalTime) {
		this.finalTime = finalTime;
		return this;
	}
	
	public WorkloadSimulation getSimulation() {
		return simulation;
	}
	
	/********** Helper methods ***********/

	private WorkloadPrinter getNetPrinter() {
		if(netPrinter == null)
			netPrinter = new WorkloadPrinter(getSeparator(), getSimulation().getQueuingNet());
		return netPrinter;
	}
	
	/*********** Printing All  ***********/
	
	public void printAllTo(OutputStream out) throws IOException {
		printStaticInformation(out);
		printNetEvolution(out);
		printAllServicesEvolution(out);
		printAllServicePropertiesEvolution(out);
	}
	
	/*********** Static Printing ***********/
	
	public OutputStream printStaticInformation(OutputStream out) throws IOException {
		StringBuilder buffer = new StringBuilder();
		Inclusive range = new Inclusive(0, getFinalTime(), 1);
		
		printLine(buffer, "Analysis Data for time 0 - " + getFinalTime());
		printNewLine(buffer);
		out.write(buffer.toString().getBytes());
		out.flush();
		buffer = new StringBuilder();
		
		printLine(buffer, "Overall Values");
		printLine(buffer, "--------------");
		getNetPrinter().printStatic(buffer, range);
		
		printNewLine(buffer);
		out.write(buffer.toString().getBytes());
		out.flush();
		buffer = new StringBuilder();
		
		printLine(buffer, "-------------------------------------------------");
		printNewLine(buffer);
		
		printLine(buffer, "Services");
		printLine(buffer, "--------");
		printStaticInformationServices(buffer, range);
		printNewLine(buffer);
		out.write(buffer.toString().getBytes());
		out.flush();
		buffer = new StringBuilder();
		
		printLine(buffer, "-------------------------------------------------");
		printNewLine(buffer);
		
		printLine(buffer, "Scenarios");
		printLine(buffer, "---------");
		printStaticInformationScenarios(buffer, range);
		out.write(buffer.toString().getBytes());		
		out.flush();
		return out;
	}
	
	private void printStaticInformationServices(StringBuilder buffer, Inclusive range) {
		for(Service service : getSimulation().getAllServices())	
			new ServiceCenterPrinter(getSeparator(), service).printStatic(buffer, range);
	}
	
	private void printStaticInformationScenarios(StringBuilder builer, Inclusive range) {
		for(WorkloadScenario scenario : simulation.getWorkload().getScenarios())
			new ScenarioPrinter(getSeparator(), simulation.getQueuingNet(), scenario).printStatic(builer, range);
	}
	
	/*********** Net Printing ***********/
	
	public OutputStream printNetEvolution(OutputStream out) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		getNetPrinter().printPropertyHeaderLine(builder);
		getNetPrinter().printPropertyEvolution(builder, getFinalTime(), getTimeStepSize());
		
		out.write(builder.toString().getBytes());
		out.flush();
		return out;
	}
	
	/*********** Service Printing ***********/
	
	public void printAllServicesEvolution(OutputStream out) throws IOException {
		for(Service service : getSimulation().getAllServices())	
			printServiceEvolution(out, service);
	}
	
	public OutputStream printServiceEvolution(OutputStream out, Service service) throws IOException {		
		ServiceCenterPrinter printer = new ServiceCenterPrinter(getSeparator(), service);
		StringBuilder builder = new StringBuilder();
		
		printer.printPropertyHeaderLine(builder);
		printer.printPropertyEvolution(builder, getFinalTime(), getTimeStepSize());
		
		out.write(builder.toString().getBytes());
		out.flush();
		return out;
	}
	
	/************* Property Printing *********/
	
	public void printAllServicePropertiesEvolution(OutputStream out) throws IOException {
		printServicesPropertyEvolution(out, ServiceCenterResult.Utilization);
		printServicesPropertyEvolution(out, ServiceCenterResult.Throughput);
		printServicesPropertyEvolution(out, ServiceCenterResult.BusyTime);
		printServicesPropertyEvolution(out, ServiceCenterResult.IdleTime);
		printServicesPropertyEvolution(out, ServiceCenterResult.AvgDemandPerRequest);
		printServicesPropertyEvolution(out, ServiceCenterResult.AvgQueueLength);
		printServicesPropertyEvolution(out, ServiceCenterResult.MaxQueueLength);
	}
	
	private IEvolutionResultPrinter getResultPrinter(ServiceCenterResult property) {
		switch(property) {
		case AvgDemandPerRequest:
			return new ServiceCentersAvgDemandPerRequestPrinter(getSeparator(), getSimulation().getAllServices());
		case AvgQueueLength:
			return new ServiceCentersAvgQueueLengthPrinter(getSeparator(), getSimulation().getAllServices());
		case BusyTime:
			return new ServiceCentersBusyTimePrinter(getSeparator(), getSimulation().getAllServices());
		case IdleTime:
			return new ServiceCentersIdleTimePrinter(getSeparator(), getSimulation().getAllServices());
		case MaxQueueLength:
			return new ServiceCentersMaxQueueLengthPrinter(getSeparator(), getSimulation().getAllServices());
		case Throughput:
			return new ServiceCentersThroughputPrinter(getSeparator(), getSimulation().getAllServices());
		case Utilization:
			return new ServiceCentersUtilizationPrinter(getSeparator(), getSimulation().getAllServices());
		default:
			break;
		}
		return null;
	}
	
	public OutputStream printServicesPropertyEvolution(OutputStream out, ServiceCenterResult property) throws IOException {
		return printServicesPropertyEvolution(out, getResultPrinter(property));
	}
	
	public OutputStream printServicesPropertyEvolution(OutputStream out, IEvolutionResultPrinter printer) throws IOException {
		StringBuilder builder = new StringBuilder();

		printer.printPropertyHeaderLine(builder);
		printer.printPropertyEvolution(builder, getFinalTime(), getTimeStepSize());
		
		out.write(builder.toString().getBytes());
		out.flush();
		return out;
	}	
}
