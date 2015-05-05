/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.workload;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Model;

/***
 * A workload represents typical behavior of the software application.
 * It consists of service centers and workload scenarios, that can request
 * services from these service centers.
 * 
 * @author Martin Fleck
 *
 */
public class Workload {
	private Resource umlModelResource;
	private Set<ServiceCenter> serviceCenters;
	private List<WorkloadScenario> scenarios;
	private Model modelElement;
	
	public Workload(Resource umlModelResource) {
		this.umlModelResource = umlModelResource;
		this.serviceCenters = new HashSet<ServiceCenter>();
		this.scenarios = new ArrayList<WorkloadScenario>();
	}
	
	public Workload(Resource umlModelResource, Set<ServiceCenter> services, List<WorkloadScenario> scenarios) {
		this.umlModelResource = umlModelResource;
		this.serviceCenters = services;
		this.scenarios = scenarios;
	}

	public Set<ServiceCenter> getServiceCenters() {
		return serviceCenters;
	}

	public void setServiceCenters(Set<ServiceCenter> services) {
		this.serviceCenters = services;
	}
	
	public void addServiceCenter(ServiceCenter services) {
		this.serviceCenters.add(services);
	}

	public List<WorkloadScenario> getScenarios() {
		return scenarios;
	}

	public void setScenarios(List<WorkloadScenario> scenarios) {
		this.scenarios = scenarios;
	}
	
	public void addScenario(WorkloadScenario scenario) {
		this.scenarios.add(scenario);
	}
	
	public Resource getUMLModelResource() {
		return umlModelResource;
	}
	
	public Model getModelElement() {
		if(modelElement == null && getUMLModelResource() != null) {
			TreeIterator<EObject> elements = getUMLModelResource().getAllContents();
			while(elements.hasNext()) {
				EObject element = elements.next();
				if(element instanceof Model)
					return (Model) element;
			}
		}
		return modelElement;
	}
	
	public String getModelName() {
		Model model = getModelElement();
		return model == null ? "model" : model.getName();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("MarteAnalysis\n");
		builder.append("-------------\n");
		
		builder.append("Services:\n");
		for(ServiceCenter service : getServiceCenters())
			builder.append("  " + service + "\n");
		
		builder.append("\n");
		
		builder.append("Traces:\n");
		for(WorkloadScenario trace : getScenarios()) {
			builder.append("  " + trace + "\n");			
			for(WorkloadScenarioStep step : trace.getSteps())
				builder.append("    " + step  + "\n");				
				
			builder.append("\n");
		}
		return builder.toString();
	}
	
}
