/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.modelexecution.fuml.nfr.simulation.time.ArrivalTimeGeneratorFactory;
import org.modelexecution.fuml.nfr.simulation.time.IArrivalTimeGenerator;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.Workload;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenario;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenarioStep;

import scala.collection.immutable.Range;

import at.ac.tuwien.big.simpleqn.FixedBalancer;
import at.ac.tuwien.big.simpleqn.Job;
import at.ac.tuwien.big.simpleqn.QueuingNet;
import at.ac.tuwien.big.simpleqn.Request;
import at.ac.tuwien.big.simpleqn.ScalingBalancer;
import at.ac.tuwien.big.simpleqn.Service;
import at.ac.tuwien.big.simpleqn.strategies.AvgQueueLengthScaling;
import at.ac.tuwien.big.simpleqn.strategies.BalancingStrategy;
import at.ac.tuwien.big.simpleqn.strategies.RandomBalancing;
import at.ac.tuwien.big.simpleqn.strategies.RoundRobinBalancing;
import at.ac.tuwien.big.simpleqn.strategies.ScalingStrategy;

/***
 * The WorkloadSimulator takes the service centers and scenarios of a specified
 * workload and produces timed execution traces for each scenario. These traces
 * are fed into a queuing net-like structure and operational analysis is 
 * performed. All mapping information between the queuing net and the original
 * workload is preserved in the resulting WorkloadSimulation.
 * 
 * @author Martin Fleck
 *
 */
public class WorkloadSimulator {
	
	public WorkloadSimulator() { }
	
	private BalancingStrategy getBalancingStrategy(ServiceCenter serviceCenter, int balancingTime) {
		switch(serviceCenter.getSchedulingPolicy()) {
			case ROUND_ROBIN:
				return new RoundRobinBalancing(balancingTime);
				
			case OTHER:
				return new RandomBalancing(balancingTime);
				
			default:
				return null;
		}
	}
	
	private ScalingStrategy getScalingStrategy(ServiceCenter serviceCenter, int scalingTime) {
		if(serviceCenter.isDynamic())
			return new AvgQueueLengthScaling(
						new Range(1, 6, 1),
						scalingTime,
						1.2,
						0.6);
		return null;
	}
	
	private Service createService(ServiceCenter serviceCenter) {
		int balancingTime = 1;
		int scalingTime = 100;
		
		int defaultServiceTime = serviceCenter.getDefaultServiceTime();
		String name = serviceCenter.getName();
		int multiplicity = serviceCenter.getMultiplicity();
		
		BalancingStrategy balancing = getBalancingStrategy(
				serviceCenter, balancingTime); 
		
		
		ScalingStrategy scaling = getScalingStrategy(
				serviceCenter, scalingTime);
		
		Service service = null;
		if(balancing == null && scaling == null && multiplicity == 1)				
			service = new Service(name, defaultServiceTime);
		else if(balancing != null && multiplicity > 1)
			service = new FixedBalancer(name, defaultServiceTime, balancing, multiplicity);
		else if(scaling != null)
			service = new ScalingBalancer(name, defaultServiceTime, balancing, scaling);
		else
			service = new Service(name, defaultServiceTime);

		return service;
	}
	
	/***
	 * Simulate the given workload for the specified simulation time. This time
	 * corresponds to the time for which initial requests are generated 
	 * according to the arrival time patterns specified in the workload 
	 * scenarios. The workload gets parsed into a queuing net-like structure,
	 * which can be used to obtain several performance indicators such as
	 * utilization or throughput. All mapping information is preserved in the
	 * WorkloadSimulation returned.
	 * 
	 * @param workload workload to be simulated
	 * @param simulationTime time for which initial requests are generated
	 * @return workload simulation results
	 */
	public WorkloadSimulation simulateWorkload(Workload workload, int simulationTime) {
		if(workload == null)
			return null;

		Map<ServiceCenter, Service> marteToQNService = new HashMap<ServiceCenter, Service>();
		Map<Service, ServiceCenter> qnToMarteService = new HashMap<Service, ServiceCenter>();

		for(ServiceCenter marteService : workload.getServiceCenters()) {
			Service service = createService(marteService);
			marteToQNService.put(marteService, service);
			qnToMarteService.put(service, marteService);
		}
		
		
		QueuingNet net = new QueuingNet(new ArrayList<Service>(marteToQNService.values()));
		
		Map<WorkloadScenarioStep, Request> traceStepToRequest = new HashMap<WorkloadScenarioStep, Request>();
		Map<Request, WorkloadScenarioStep> requestToTraceStep = new HashMap<Request, WorkloadScenarioStep>();
		
		Job job;
		Service service;
		Request request;
		ArrivalTimeGeneratorFactory factory = ArrivalTimeGeneratorFactory.getInstance();
		for(WorkloadScenario scenario : workload.getScenarios()) {
			IArrivalTimeGenerator generator = factory.getGenerator(simulationTime, scenario.getArrivalTimePattern());
			
			for(int msTime : generator) {
				job = new Job(msTime, scenario.getName(), net);
				for(WorkloadScenarioStep step : scenario.getSteps()) {
					service = marteToQNService.get(step.getServiceCenter());
					if(service != null) {
						int demand = (int) (step.getResourceUsage().getExecTimeSum());
						if(demand > 0) {
							request = job.request(service, demand);
							traceStepToRequest.put(step, request);
							requestToTraceStep.put(request, step);
						}
					}
				}
			}
		}
		net.close();
		return new WorkloadSimulation(workload, net, simulationTime, marteToQNService, qnToMarteService, traceStepToRequest, requestToTraceStep);
	}
}
