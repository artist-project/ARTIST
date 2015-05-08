package org.modelexecution.fumldebug.debugger.uml;

import java.util.Map;

import org.modelexecution.fumldebug.core.ExecutionContext;
import org.modelexecution.fumldebug.core.ExecutionEventListener;
import org.modelexecution.fumldebug.core.event.ActivityEntryEvent;
import org.modelexecution.fumldebug.core.event.Event;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;
import org.modelexecution.fumldebug.libraryregistry.LibraryRegistry;
import org.modelexecution.fumldebug.libraryregistry.OpaqueBehaviorCallReplacer;

import fUML.Semantics.Classes.Kernel.Object_;
import fUML.Semantics.CommonBehaviors.BasicBehaviors.ParameterValueList;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class UMLModelExecutor {

	private int executionID = -1;
	private Trace trace;
	private UMLModelLoader loader;
	
	public UMLModelExecutor(String modelPath) {
		loader = new UMLModelLoader().setModel(modelPath);
	}
	
	public UMLModelExecutor(UMLModelLoader loader) {
		this.loader = loader;
	}
	
	public UMLModelLoader getModelLoader() {
		return loader;
	}
	
	private void executeActivity(Activity activity, Object_ context,
			ParameterValueList parameterValues) {
		addEventListener(new ExecutionEventListener() {
			@Override
			public void notify(Event event) {
				if (executionID == -1) {
					if (event instanceof ActivityEntryEvent) {
						ActivityEntryEvent activityEntryEvent = (ActivityEntryEvent) event;
						executionID = activityEntryEvent
								.getActivityExecutionID();
					}
				}
			}
		});
		getExecutionContext().execute(activity, context, parameterValues);
		trace = getExecutionContext().getTrace(executionID);
		executionID = -1;
	}

	public Trace executeActivity(String name, Object_ context,
			ParameterValueList parameterValues) {
		loader.loadModel();
		registerOpaqueBehaviors();
		Activity activity = loader.getConversionResult().getActivity(name);
		executeActivity(activity, context, parameterValues);
		return getTrace();
	}
	
	public Trace executeActivity(String name, Object_ context,
			ParameterValueList parameterValues, boolean resetExecutionContext) {
		if(resetExecutionContext)
			getExecutionContext().reset();
		return executeActivity(name, context, parameterValues);
	}
	
	private void registerOpaqueBehaviors() {
		LibraryRegistry libraryRegistry = new LibraryRegistry(getExecutionContext());
		Map<String, OpaqueBehavior> registeredOpaqueBehaviors = libraryRegistry.loadRegisteredLibraries();
		OpaqueBehaviorCallReplacer.instance.replaceOpaqueBehaviorCalls(loader.getConversionResult().getAllActivities(), registeredOpaqueBehaviors);	
	}
	
	public Trace executeActivity(String name) {
		return executeActivity(name, null, new ParameterValueList());
	}
	
	public Trace executeActivity(String name, boolean resetExecutionContext) {
		return executeActivity(name, null, new ParameterValueList(), resetExecutionContext);
	}

	public void addEventListener(ExecutionEventListener eventListener) {
		getExecutionContext().addEventListener(eventListener);
	}

	public void removeEventListener(ExecutionEventListener eventListener) {
		getExecutionContext().addEventListener(eventListener);
	}

	public ExecutionContext getExecutionContext() {
		return ExecutionContext.getInstance();
	}

	public Trace getTrace() {
		return trace;
	}
}
