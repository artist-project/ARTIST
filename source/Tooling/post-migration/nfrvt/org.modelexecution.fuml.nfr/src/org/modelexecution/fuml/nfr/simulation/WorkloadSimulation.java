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
import java.util.List;
import java.util.Map;

import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;
import org.modelexecution.fuml.nfr.simulation.workload.Workload;
import org.modelexecution.fuml.nfr.simulation.workload.WorkloadScenarioStep;

import scala.collection.JavaConversions;

import at.ac.tuwien.big.simpleqn.Balancer;
import at.ac.tuwien.big.simpleqn.QueuingNet;
import at.ac.tuwien.big.simpleqn.Request;
import at.ac.tuwien.big.simpleqn.ScalingBalancer;
import at.ac.tuwien.big.simpleqn.Service;

/***
 * A WorkloadSimulation contains the results of a simulation run by the
 * WorkloadSimulator. This includes the original workload specification, the 
 * QueueingNet used for analysis as well as the mapping between the respective
 * elements and the specified simulation time.
 * 
 * @author Martin Fleck
 *
 */
public class WorkloadSimulation {
	private Workload workload;
	private QueuingNet queuingNet;
	
	private int simulationTime;
	
	private Map<ServiceCenter, Service> marteToQNService;
	private Map<Service, ServiceCenter> qnToMarteService;
	
	private Map<WorkloadScenarioStep, Request> traceStepToRequest;
	private Map<Request, WorkloadScenarioStep> requestToTraceStep;
	
	private List<Service> allServices;
	
	public WorkloadSimulation(Workload workload,
			QueuingNet queuingNet, int simulationTime,
			Map<ServiceCenter, Service> marteToQNService,
			Map<Service, ServiceCenter> qnToMarteService,
			Map<WorkloadScenarioStep, Request> traceStepToRequest,
			Map<Request, WorkloadScenarioStep> requestToTraceStep) {
		
		this.workload = workload;
		this.queuingNet = queuingNet;
		this.simulationTime = simulationTime;
		this.marteToQNService = marteToQNService != null ? marteToQNService : new HashMap<ServiceCenter, Service>();
		this.qnToMarteService = qnToMarteService != null ? qnToMarteService : new HashMap<Service, ServiceCenter>();
		this.traceStepToRequest = traceStepToRequest != null ? traceStepToRequest : new HashMap<WorkloadScenarioStep, Request>();
		this.requestToTraceStep = requestToTraceStep != null ? requestToTraceStep : new HashMap<Request, WorkloadScenarioStep>();
	}

	public Workload getWorkload() {
		return workload;
	}

	public QueuingNet getQueuingNet() {
		return queuingNet;
	}

	public int getSimulationTime() {
		return simulationTime;
	}

	public Map<ServiceCenter, Service> getMarteToQNServices() {
		return marteToQNService;
	}

	public Map<Service, ServiceCenter> getQnToMarteServices() {
		return qnToMarteService;
	}

	public Map<WorkloadScenarioStep, Request> getTraceStepToRequests() {
		return traceStepToRequest;
	}

	public Map<Request, WorkloadScenarioStep> getRequestToTraceSteps() {
		return requestToTraceStep;
	}

	public WorkloadScenarioStep getScenarioStep(Request request) {
		return getRequestToTraceSteps().get(request);
	}
	
	public Request getRequest(WorkloadScenarioStep step) {
		return getTraceStepToRequests().get(step);
	}
	
	public Service getService(ServiceCenter service) {
		return getMarteToQNServices().get(service);
	}
	
	public ServiceCenter getServiceCenter(Service service) {
		return getQnToMarteServices().get(service);
	}
	
	public String getModelName() {
		return getWorkload().getModelName();
	}
	
	/***
	 * Returns all services from the queuing net. Hierarchies in case of 
	 * multiple instances of a given service under a balancer or scaling
	 * service, are flattened.
	 * 
	 * @return list of all services of the queuing net
	 */
	public List<Service> getAllServices() {
		if(allServices == null) {
			allServices = new ArrayList<Service>();
			for(Service service : JavaConversions.asJavaIterable(getQueuingNet().services())) {
				allServices.add(service);
				for(Service subService : getServiceChildren(service))
					allServices.add(subService);
			}
		}
		return allServices;
	}
	
	/***
	 * Returns all services for the given service center. This includes the
	 * corresponding service itself as well as all children (in case of 
	 * multiple instances) of that service.
	 * 
	 * @param serviceCenter
	 * @return list of all services of the given service center
	 */
	public List<Service> getAllServices(ServiceCenter serviceCenter) {
		Service service = getService(serviceCenter);
		List<Service> services = new ArrayList<Service>();
		services.add(service);
		services.addAll(getServiceChildren(service));
		return services;
	}
	
	/***
	 * Returns all children of the given service or an empty list if no 
	 * children can be found.
	 * 
	 * @param qnService
	 * @return list of service children
	 */
	public List<Service> getServiceChildren(Service qnService) {
		if(qnService instanceof Balancer)
			return new ArrayList<>(JavaConversions.asJavaCollection(((Balancer)qnService).services()));
		return new ArrayList<Service>();
	}
	
	/***
	 * Returns the name of the given service. In case of a balancing service,
	 * the name is suffixed by '_Balancer', in case of a scaling service, the
	 * name is suffixed by '_ScalingBalancer'. Otherwise just the name is 
	 * returned.
	 * 
	 * @param service
	 * @return name for the given service
	 */
	public String getServiceName(Service service) {
		String suffix = "";
		if(service instanceof Balancer)
			suffix = "_Balancer";
		if(service instanceof ScalingBalancer)
			suffix = "_ScalingBalancer";
		return service.name() + suffix;
	}
}