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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.modelexecution.fuml.nfr.simulation.WorkloadSimulation;
import org.modelexecution.fuml.nfr.simulation.result.ISimulationResult;

import scala.collection.immutable.Range.Inclusive;

import at.ac.tuwien.big.simpleqn.QueuingNet;

public abstract class AbstractAnnotator implements IAnnotator {
	
	protected enum ResultType {
		
		Normal(""),
		Longrun("untilLastArrival"),
		Complete("untilLastCompletion");
		
		private final String prefix;
		
		private ResultType(String prefix) {
			this.prefix = prefix;
		}
		
		@Override
		public String toString() {
			return prefix;
		}
	}
	
	private static final String RESULT_PREFIX = "$out";
	private static final String RESULT_SEPARATOR = ".";
	
	private WorkloadSimulation simulation;
	
	public AbstractAnnotator(WorkloadSimulation simulation) {
		this.simulation = simulation;
	}

	public WorkloadSimulation getSimulation() {
		return simulation;
	}
	
	protected QueuingNet getQueuingNet() {
		if(getSimulation() == null)
			return null;
		return getSimulation().getQueuingNet();
	}	
	
	protected String getResultString(ResultType resultType, String subCategory, ISimulationResult result, Object value) {
		String subCategoryString = "";
		if(subCategory != null && !subCategory.isEmpty())
			subCategoryString = subCategory + RESULT_SEPARATOR;
		
		String resultTypeString = resultType.toString();
		if(resultTypeString != null && !resultTypeString.isEmpty())
			resultTypeString = resultType + RESULT_SEPARATOR;
		
		return RESULT_PREFIX + RESULT_SEPARATOR + 
				subCategoryString +
				resultTypeString +
				result + "=" + value.toString();
	}
	
	protected String getResultString(ResultType resultType, ISimulationResult result, Object value) {
		return getResultString(resultType, "", result, value);
	}
	
	protected String getResultString(String subCategory, ISimulationResult result, Object value) {
		return getResultString(ResultType.Normal, subCategory, result, value);
	}
	
	protected String getResultString(ISimulationResult result, Object value) {
		return getResultString(ResultType.Normal, "", result, value);
	}
	
	protected EList<String> createResultList() {
		return new BasicEList<String>();
	}
	
	protected Inclusive getRange(ResultType resultType) {
		if(getQueuingNet() == null)
			return null;
		if(resultType == ResultType.Complete)
			return getQueuingNet().completeRange();
		if(resultType == ResultType.Longrun)
			return getQueuingNet().estimatedLongRunRange();
		return null;
	} 
}
