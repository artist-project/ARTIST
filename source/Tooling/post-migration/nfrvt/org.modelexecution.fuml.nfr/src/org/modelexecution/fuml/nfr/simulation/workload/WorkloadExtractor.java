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
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HLAM.RtUnit;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.modelexecution.fuml.nfr.MarteUtil;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.ActivityNodeExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.CallActionExecution;
import org.modelexecution.fumldebug.core.trace.tracemodel.Trace;
import org.modelexecution.fumldebug.debugger.uml.UMLModelExecutor;
import org.modelexecution.fumldebug.debugger.uml.UMLModelLoader;

/***
 * The WorkloadExtractor takes an existing UML model and extracts the contained
 * workload specification. 
 * Services centers need to be annotated RtUnit (on  Classes), workload events 
 * need to be annotated with GaWorkloadEvent (on  Activity Diagrams). From the 
 * workload events, workload scenarios are extracted by executing the 
 * respective activity diagrams. Scenario steps need to be annotated with 
 * GaStep containing the demanded resources.
 * If an analysis context (GaAnalysisContext) is given, only the linked 
 * service centers and scenarios are considered, otherwise the complete
 * model will be searched.
 *  
 * @author Martin Fleck
 *
 */
public class WorkloadExtractor {	
	private UMLModelLoader loader;
	private Model root;
	
	private GaAnalysisContext context;
	private String modelPath;
	
	public WorkloadExtractor(String modelPath) {
		this.modelPath = modelPath;
		this.loader = new UMLModelLoader().setModel(getModelPath());
		this.loader.loadModel();
		this.root = (Model) loader.getUMLModelResource().getContents().get(0);
	}
	
	public WorkloadExtractor(Model umlModel) {
		this(umlModel.eResource().getURI().toString());
	}
	
	protected String getModelPath() {
		return modelPath;
	}
	
	/***
	 * Sets the analysis context to be considered for the extraction. If no 
	 * analysis context with the given name can be found, null is set.
	 * @param qualifiedName
	 * @return
	 */
	public WorkloadExtractor setAnalysisContext(String qualifiedName) {
		return setAnalysisContext(findAnalysisContext(qualifiedName));
	}
	
	/***
	 * Sets the analysis context to be considered for the extraction.
	 * 
	 * @param context
	 * @return
	 */
	public WorkloadExtractor setAnalysisContext(GaAnalysisContext context) {
		this.context = context;
		return this;
	}

	private GaAnalysisContext getAnalysisContext() {
		return context;
	}
	
	private UMLModelLoader getModelLoader() {
		if(!loader.isLoaded())
			loader.loadModel();
		return loader;
	}
	
	private Model getRootElement() {
		if(root == null)
			root = (Model) getModelLoader().obtainFirstNamedElement();
		return root;
	}
	
	/***************** Creation Methods *********************/
	
	private ServiceCenter createServiceCenter(Resource resource) {
		RtUnit rtUnit = MarteUtil.getFirstStereotype(resource.getBase_Classifier(), RtUnit.class); 
		if(rtUnit != null)
			return createServiceCenter(rtUnit);
		
		return new ServiceCenter()
			.setMultiplicity(Integer.parseInt(resource.getResMult()))
			.setUmlElement(resource.getBase_Classifier());
	}
	
	private ServiceCenter createServiceCenter(RtUnit rtUnit) {
		if(rtUnit == null)
			return null;
		
		return new ServiceCenter()
			.setUmlElement(rtUnit.getBase_BehavioredClassifier())
			.setMultiplicity(rtUnit.getSrPoolSize())
			.setSchedulingPolicy(rtUnit.getQueueSchedPolicy())
			.setDynamic(rtUnit.isIsDynamic());
	}
	
	private WorkloadScenario createWorkloadScenario(GaWorkloadEvent event, Set<ServiceCenter> serviceCenters) {
		UMLModelExecutor executor = new UMLModelExecutor(getModelLoader());
		return new WorkloadScenario(event, 
				aggregateScenarioSteps(
						event.getEffect(), 
						executor.executeActivity(event.getEffect().getBase_NamedElement().getQualifiedName()),
						serviceCenters
				));
	}
	
	
	private WorkloadScenarioStep createWorkloadScenarioStep(GaStep step, Set<ServiceCenter> serviceCenters) {
		if(step == null)
			return null;
		ServiceCenter serviceCenter = findServiceCenter(step, serviceCenters);
		if(serviceCenter != null)
			return new WorkloadScenarioStep(serviceCenter, step);
		return null;
	}
	
	/******************* Read from GaAnalysisContext ******************/
	
	private GaAnalysisContext findAnalysisContext(String qualifiedName) {
		return MarteUtil.getExactStereotype(
				MarteUtil.findNamedElement(getRootElement(), qualifiedName),
				GaAnalysisContext.class);
	}
	
	private Set<ServiceCenter> readServiceCenters(GaAnalysisContext context) {
		Set<ServiceCenter> serviceCenters = new HashSet<ServiceCenter>();
		for(GaResourcesPlatform platform : context.getPlatform())
			for(Resource resource : platform.getResources()) 
				serviceCenters.add(createServiceCenter(resource));
				
		return serviceCenters;
	}
	
	private List<GaWorkloadEvent> readWorkloadEvents(GaAnalysisContext context) {
		List<GaWorkloadEvent> workloadEvents = new ArrayList<GaWorkloadEvent>();
		for(GaWorkloadBehavior workload : context.getWorkload())
			workloadEvents.addAll(workload.getDemand());
		return workloadEvents;
	}
	
	/******************** Extract from Model ***************************/
	
	private GaAnalysisContext extractAnalysisContext() {
		TreeIterator<EObject> modelContents = getModelLoader().getUMLModelResource().getAllContents();
		while(modelContents.hasNext()) {
			EObject eObject = modelContents.next();
			if(eObject instanceof Element) {
				Element element = (Element)eObject;
				GaAnalysisContext context = MarteUtil.getExactStereotype(element, GaAnalysisContext.class);
				if (context != null && context.getPlatform() != null && context.getWorkload() != null) {
					return context;
				}
			}			
		}		
		return null;
	}
	
	private Set<ServiceCenter> aggregateServiceCenters(NamedElement element, Set<ServiceCenter> services) {
		if(element == null)
			return services;
		
		RtUnit rtUnit = MarteUtil.getFirstStereotype(element, RtUnit.class);
		if(rtUnit != null)
			services.add(createServiceCenter(rtUnit));
		
		for(Element child : element.getOwnedElements())
			if(child instanceof NamedElement)
				aggregateServiceCenters((NamedElement) child, services);
		
		return services;
	}
	
	private List<GaWorkloadEvent> aggregateWorkloadEvents(Element element, List<GaWorkloadEvent> workloadEvents) {
		if(element == null)
			return workloadEvents;
		
		GaWorkloadEvent event = MarteUtil.getFirstStereotype(element, GaWorkloadEvent.class);
		if(event != null)
			workloadEvents.add(event);
		
		for(Element child : element.getOwnedElements())
			aggregateWorkloadEvents(child, workloadEvents);
		
		return workloadEvents;
	}
	
	/******************** Analysis ****************/
	
	private GaAnalysisContext findAnalysisContext() {
		GaAnalysisContext analysisContext = getAnalysisContext();
		if(analysisContext == null)
			analysisContext = extractAnalysisContext();
		return analysisContext;
	}
	
	private Set<ServiceCenter> getServiceCenters(GaAnalysisContext context) {
		if(context != null)
			return readServiceCenters(context);
		return aggregateServiceCenters(getRootElement(), new HashSet<ServiceCenter>());
	}
	
	private List<GaWorkloadEvent> getWorkloadEvents(GaAnalysisContext context) {
		if(context != null)
			return readWorkloadEvents(context);
		return aggregateWorkloadEvents(getRootElement(), new ArrayList<GaWorkloadEvent>());
	}
	
	private List<WorkloadScenario> getWorkloadScenarios(List<GaWorkloadEvent> workloadEvents, Set<ServiceCenter> serviceCenters) {
		List<WorkloadScenario> scenarios = new ArrayList<WorkloadScenario>();
		for(GaWorkloadEvent event : workloadEvents)
			if(event.getEffect() != null)
				scenarios.add(createWorkloadScenario(event, serviceCenters));
		return scenarios;
	}
	
	/***
	 * Extracts the workload from the given model by retrieving the analysis 
	 * context and if no such context is found, searching for all service 
	 * centers and workload scenarios contained in the model.
	 * @return extracted workload
	 */
	public Workload extractWorkload() {
		GaAnalysisContext context = findAnalysisContext();
		Set<ServiceCenter> serviceCenters = getServiceCenters(context);
		List<GaWorkloadEvent> workloadEvents = getWorkloadEvents(context);
		List<WorkloadScenario> scenarios = getWorkloadScenarios(workloadEvents, serviceCenters);
		
		Workload workload = new Workload(getModelLoader().getUMLModelResource());
		workload.setServiceCenters(serviceCenters);
		workload.setScenarios(scenarios);
		
		return workload;
	}
	
	/******************* Steps **************/
	
	private List<WorkloadScenarioStep> aggregateScenarioSteps(GaScenario scenario, Trace trace, Set<ServiceCenter> serviceCenters) {
		List<WorkloadScenarioStep> steps = new ArrayList<WorkloadScenarioStep>();
		
		ActivityExecution rootActivityExecution = findRootActivityExecution(scenario, trace);
		aggregateScenarioSteps(rootActivityExecution, steps, serviceCenters);		
		
		return steps;
	}
	
	/***
	 * Check activity execution itself as well as its specification (operation on class)
	 * @param activityExecution
	 * @param scenarioSteps
	 * @param serviceCenters
	 */
	private void aggregateScenarioSteps(ActivityExecution activityExecution, List<WorkloadScenarioStep> scenarioSteps, Set<ServiceCenter> serviceCenters) {
		if(activityExecution == null)
			return;
	
		WorkloadScenarioStep scenarioStep = createWorkloadScenarioStep(
				getGaStep(activityExecution), serviceCenters);
		if(scenarioStep != null)
			scenarioSteps.add(scenarioStep);

		for (ActivityNodeExecution nodeExecution : activityExecution.getNodeExecutions()) 
			aggregateScenarioSteps(nodeExecution, scenarioSteps, serviceCenters);	
	}
	
	/***
	 * Check activity node execution.
	 * @param nodeExecution
	 * @param scenarioSteps
	 * @param serviceCenters
	 */
	private void aggregateScenarioSteps(ActivityNodeExecution nodeExecution, List<WorkloadScenarioStep> scenarioSteps, Set<ServiceCenter> serviceCenters) {
		if(nodeExecution == null)
			return;

		WorkloadScenarioStep scenarioStep = createWorkloadScenarioStep(
				getGaStep(nodeExecution), serviceCenters);
		if(scenarioStep != null)
			scenarioSteps.add(scenarioStep);
		
		if (nodeExecution instanceof CallActionExecution) {
			CallActionExecution callActionExecution = (CallActionExecution) nodeExecution;			
			ActivityExecution calledExecution = callActionExecution.getCallee();
			aggregateScenarioSteps(calledExecution, scenarioSteps, serviceCenters);
		}
	}
	
	/******************************* Trace Root Activity Execution *******************/
	
	private ActivityExecution findRootActivityExecution(Trace trace) {
		for (ActivityExecution execution : trace.getActivityExecutions())
			if (execution.getCaller() == null)
				return execution;
		
		return null;
	}
	
	private ActivityExecution findRootActivityExecution(GaScenario scenario, Trace trace) {
		if(scenario == null || scenario.getRoot() == null)
			return findRootActivityExecution(trace);
		
		for(ActivityExecution execution : trace.getActivityExecutions()) 
			if(scenario.getBase_NamedElement().getQualifiedName().equals(execution.getActivity().qualifiedName)) 
				return execution;
				
		return null;
	}
	
	/**************** Helper Methods *******************/
	
	private ServiceCenter findServiceCenter(GaStep step, Set<ServiceCenter> serviceCenters) {
		for(ServiceCenter resource : serviceCenters) {
			if(step.getBase_NamedElement().getQualifiedName().startsWith(resource.getUmlElement().getQualifiedName()))
				return resource;
		}
		return null;
	}
	
	private GaStep getGaStep(ActivityExecution activityExecution) {
		GaStep step = MarteUtil.getFirstStereotype(
				getMappedElement(activityExecution.getActivity(), Activity.class),
				GaStep.class);
		if(step == null)
			return MarteUtil.getFirstStereotype(
					getMappedElement(activityExecution.getActivity(), Activity.class).getSpecification(), 
					GaStep.class);
		return step;
	}
	
	private GaStep getGaStep(ActivityNodeExecution nodeExecution) {
		return MarteUtil.getFirstStereotype(
				getMappedElement(nodeExecution.getNode(), ActivityNode.class),
				GaStep.class);
	}
	
	/***
	 * Map from fUML element to corresponding UML element.
	 * @param element
	 * @param clazz
	 * @return uml element
	 */
	private <T extends Element> T getMappedElement(fUML.Syntax.Classes.Kernel.Element element, Class<T> clazz) {
		return clazz.cast(getModelLoader().getConversionResult().getInputObject(element));
	}
}