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
import org.eclipse.uml2.uml.Model;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.WorkloadResult;

import scala.collection.immutable.Range.Inclusive;

import at.ac.tuwien.big.simpleqn.QueuingNet;

public class WorkloadAnnotator extends AbstractAnnotator {

	public WorkloadAnnotator(WorkloadSimulation simulation) {
		super(simulation);
	}

	private void addWorkloadResults(EList<String> result, ResultType resultType) {
		Inclusive range = getRange(resultType);
		if(range == null)
			return;
		
		result.add(getResultString(resultType, WorkloadResult.Throughput, getQueuingNet().throughput(range)));
		result.add(getResultString(resultType, WorkloadResult.Utilization, getQueuingNet().utilization(range)));
		result.add(getResultString(resultType, WorkloadResult.CompletedJobs, getQueuingNet().completedJobs(range)));
	}
	
	public void annotate() {
		Model model = getSimulation().getWorkload().getModelElement();
		if(model == null)
			return;
		QueuingNet net = getQueuingNet();
		
		EList<String> result = createResultList();
		result.add(getResultString(WorkloadResult.CompletionTime, net.completionTime()));
		addWorkloadResults(result, ResultType.Complete);
		addWorkloadResults(result, ResultType.Longrun);

		MarteUtil.setOrUpdateFeature(
			model,
			GaAnalysisContext.class, "context", result);
	}
}
