/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Martin Fleck - initial version
 */
package org.modelexecution.fuml.nfr.simulation.result.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.ServiceCenterResult;
import org.modelexecution.fuml.nfr.simulation.workload.ServiceCenter;

import scala.collection.immutable.Range.Inclusive;
import at.ac.tuwien.big.simpleqn.Service;

public class ServiceCenterAnnotator extends AbstractAnnotator {

	public ServiceCenterAnnotator(WorkloadSimulation simulation) {
		super(simulation);
	}

	private void addServiceCenterResults(EList<String> result, Service service, ResultType resultType) {
		Inclusive range = getRange(resultType);
		if(range == null)
			return;
		String serviceName = getSimulation().getServiceName(service);
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.Utilization, service.utilization(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.IdleTime, service.idleTime(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.BusyTime, service.busyTime(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.MaxQueueLength, service.maxQueueLength(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.AvgQueueLength, service.avgQueueLength(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.AvgDemandPerRequest, service.avgServiceRequirementPerRequest(range)));
		result.add(getResultString(resultType, serviceName, ServiceCenterResult.Throughput, service.throughput(range)));
	}
	
	private void annotateServiceCenter(ServiceCenter serviceCenter) {
		if(serviceCenter == null)
			return;
		
		EList<String> results = createResultList();
		
		for(Service service : getSimulation().getAllServices(serviceCenter)) {
			results.add(getResultString(getSimulation().getServiceName(service), ServiceCenterResult.DefaultServiceTime, service.serviceTime()));
			addServiceCenterResults(results, service, ResultType.Complete);
			addServiceCenterResults(results, service, ResultType.Longrun);
		}
		
		MarteUtil.setOrUpdateFeature(
				serviceCenter.getUmlElement(),
				GaAnalysisContext.class, "context", results);
	}
	
	public void annotate() {
		for(ServiceCenter serviceCenter : getSimulation().getWorkload().getServiceCenters())
			annotateServiceCenter(serviceCenter);
	}

}
