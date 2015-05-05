/*
 * Copyright (c) 2012 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package org.modelexecution.fuml.nfr;

import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;
import org.modelexecution.fumldebug.debugger.uml.UMLModelExecutor;

import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;

public class ResourceUsageAnalyzer {

	private boolean isRunning = false;
	private UMLModelExecutor executor;

	public ResourceUsageAnalyzer(String modelPath) {
		executor = new UMLModelExecutor(modelPath);
	}

	public ResourceUsageAnalysis runAnalysis(String activityName,
			Object_ context, ParameterValueList parameterValues) {
		isRunning = true;
		Trace trace = executor.executeActivity(activityName, context,
				parameterValues);		
		IConversionResult mapping = executor.getModelLoader().getConversionResult();
		ResourceUsageAnalysis analysis = new ResourceUsageAnalysis(trace, mapping);
		isRunning = false;
		return analysis; 
	}

	public ResourceUsageAnalysis runAnalysis(String activityName) {
		return runAnalysis(activityName, null, new ParameterValueList());
	}

	public boolean isRunning() {
		return isRunning;
	}	
}
