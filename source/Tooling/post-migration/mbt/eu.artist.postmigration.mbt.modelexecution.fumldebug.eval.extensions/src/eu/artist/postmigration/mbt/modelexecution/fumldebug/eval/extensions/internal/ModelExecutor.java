//////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2014 Vienna University of Technology.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
// Tanja Mayerhofer (Vienna University of Technology) - initial API and implementation
//
//////////////////////////////////////////////////////////////////////////////

package eu.artist.postmigration.mbt.modelexecution.fumldebug.eval.extensions.internal;

import java.util.Map;

import org.modelexecution.fuml.convert.IConversionResult;
import org.modelexecution.fumldebug.core.ExecutionContext;

import eu.artist.postmigration.mbt.modelexecution.fumldebug.debugger.uml.UMLModelLoader;
import eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.LibraryRegistry;
import eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry.OpaqueBehaviorCallReplacer;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class ModelExecutor {

	private Activity activity;
	
	public ModelExecutor(String modelPath, String activityName) {
		IConversionResult conversionResult = loadAndConvertModel(modelPath);
		activity = getActivity(conversionResult, activityName);
	}
	
	private IConversionResult loadAndConvertModel(String modelPath) {
		UMLModelLoader modelLoader = new UMLModelLoader().setModel(modelPath);
		IConversionResult conversionResult = modelLoader.getConversionResult();
		Map<String, OpaqueBehavior> registeredOpaqueBehaviors = registerOpaqueBehaviors(conversionResult);
		replaceOpaqueBehaviors(conversionResult, registeredOpaqueBehaviors);
		return conversionResult;
	}
	
	private Map<String, OpaqueBehavior> registerOpaqueBehaviors(IConversionResult conversionResult) {
		LibraryRegistry libraryRegistry = new LibraryRegistry(getExecutionContext());
		Map<String, OpaqueBehavior> registeredOpaqueBehaviors = libraryRegistry.loadRegisteredLibraries();
		return registeredOpaqueBehaviors;
	}

	private void replaceOpaqueBehaviors(IConversionResult conversionResult,
			Map<String, OpaqueBehavior> registeredOpaqueBehaviors) {
		OpaqueBehaviorCallReplacer.instance.replaceOpaqueBehaviorCalls(conversionResult.getAllActivities(), registeredOpaqueBehaviors);
	}
	
	private ExecutionContext getExecutionContext() {
		return ExecutionContext.getInstance();
	}
	
	private Activity getActivity(IConversionResult conversionResult, String activityName) {
		return conversionResult.getActivity(activityName);
	}
	
	public int executeStepwise() {
		EventListener eventListener = registerEventListener();
		ExecutionContext executionContext = getExecutionContext();
		executionContext.executeStepwise(activity, null, null);
		
		int rootExecutionID = eventListener.getRootExecutionID();
		while(!eventListener.executionFinished()) {
			executionContext.nextStep(rootExecutionID);
		}
		return rootExecutionID;
	}
	
	public EventListener registerEventListener() {
		ExecutionContext executionContext = getExecutionContext();
		EventListener eventListener = new EventListener();
		executionContext.addEventListener(eventListener);
		return eventListener;
	}
	
	public Activity getActivityPublic(){
		return activity;
	}
}
