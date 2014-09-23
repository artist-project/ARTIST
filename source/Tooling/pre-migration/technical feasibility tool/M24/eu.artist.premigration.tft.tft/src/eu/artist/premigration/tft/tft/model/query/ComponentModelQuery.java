/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.model.query;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import eu.artist.premigration.tft.scc.metricexplorer.MetricCalculator;
import eu.artist.premigration.tft.tft.model.Component;
import eu.artist.premigration.tft.tft.model.MigrationGoalsContainer;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

//TODO: Add a component (not viewable in inventory view) to represent the application as a whole. Add this component as a global variable in the rule engine

/**
 * Singleton for Component Model queries
 * @author Burak Karaboga
 *
 */
public enum ComponentModelQuery {

	INSTANCE;

	private Model model; 								//The selected model to be queried 
	private IFile file;									//Resource for the model
	private ResourceSet resSet;							//Resource set containing loaded resources  
	private StatefulKnowledgeSession ksession;			//Knowledge session for rule engine
	private KnowledgeBase kbase;						//Knowledge base for rule engine
	private static final String RULE_PATH = "eu/artist/premigration/tft/tft/rules/StrategySuggestion.drl";

	//Source paths are now obtanied from the user. Below are for testing and will be replaced by the field definition below
//	public static List<String> sourceFolderPaths = Arrays.asList("E:/eclipse_workspace/DEWS/fosslab.ccui.geotools/org.dews_online.ccui.core/src/",
//			"E:/eclipse_workspace/DEWS/fosslab.ccui.geotools/org.dews_online.ccui.swe/src/",
//			"E:/eclipse_workspace/DEWS/fosslab.ccui.geotools/org.dews_online.ccui.sim/src/",
//			"E:/eclipse_workspace/DEWS/fosslab.ccui.geotools/org.dews_online.ccui.ilc/src/",
//			"E:/eclipse_workspace/DEWS/fosslab.ccui.geotools/org.fosslab.ccui.idc/src/");
	
	public List<String> sourceFolderPaths = new ArrayList<String>();

	/**
	 * Constructor
	 */
	private ComponentModelQuery() {

		//Loading model
		UMLPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uml", new XMIResourceFactoryImpl());

		//Initializing the resource set
		resSet = new ResourceSetImpl();

		//Initializing EMF stand-alone
		UMLResourcesUtil.init(resSet);

		//Drools initialization
		try {
			// load up the knowledge base
			kbase = readKnowledgeBase();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	/**
	 * Initializes the rule engine's knowledge base
	 * @return An instance of {@link KnowledgeBase}
	 * @throws Exception
	 */
	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource(RULE_PATH), ResourceType.DRL);
		KnowledgeBuilderErrors errors = kbuilder.getErrors();
		if (errors.size() > 0) {
			for (KnowledgeBuilderError error: errors) {
				System.err.println(error);
			}
			throw new IllegalArgumentException("Could not parse knowledge.");
		}
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		return kbase;
	}

	/**
	 * Traverses all components and sets their parent child relationships
	 * @param componentsMap 
	 */
	private void setParentChildRelationships(Map<org.eclipse.uml2.uml.Component, Component> componentsMap){
		for (org.eclipse.uml2.uml.Component uml2Component : componentsMap.keySet()) {
			List<Component> children = new ArrayList<Component>();
			for (Element element : uml2Component.getOwnedElements()){
				if (element instanceof org.eclipse.uml2.uml.Component){
					children.add(componentsMap.get(( org.eclipse.uml2.uml.Component) element));
					componentsMap.get(( org.eclipse.uml2.uml.Component) element).setParent(componentsMap.get(uml2Component));
				}
			}
			componentsMap.get(uml2Component).setChildren(children);
		}
	}

	/**
	 * Traverses all components and set their dependency relationships
	 * @param componentsMap
	 */
	private void setDependencyRelationships(Map<org.eclipse.uml2.uml.Component, Component> componentsMap){
		//Setting suppliers of client components
		for (org.eclipse.uml2.uml.Component uml2Component : componentsMap.keySet()) {
			List<Component> clientOf = new ArrayList<Component>();


			for (Dependency dependency : uml2Component.getClientDependencies()) {

				for (NamedElement element : dependency.getSuppliers()) {

					org.eclipse.uml2.uml.Component supplier = (org.eclipse.uml2.uml.Component) element;
					clientOf.add(componentsMap.get(supplier));
				}
			}
			componentsMap.get(uml2Component).setClientOf(clientOf);
		}

		//Setting clients of supplier components
		List<Component> components = new ArrayList<Component>(componentsMap.values());
		for (Component component1 : components){
			List<Component> clients = new ArrayList<Component>();
			for (Component component2 : components) {
				if (!component1.equals(component2) && component2.getClientOf().contains(component1)){
					clients.add(component2);
				}
			}
			component1.setSupplierFor(clients);
		}
	}

	/**
	 * Creates the application level component. A new component is created if there are more than one top level components. If there is only one top level component then
	 * this component is assigned to be the application level component.
	 * 
	 * @param componentList A {@link List} of {@link Component}s
	 */
	private void createAppLevelComponent(List<Component> componentList){

		List<Component> topLevelComponents = new ArrayList<Component>();
		for (Component component : componentList) {
			if (component.getParent() == null){
				topLevelComponents.add(component);
			}
		}

		Component appLevelComponent;
		if (topLevelComponents.size() > 1){
			appLevelComponent = new Component("APP", false, true, "Application", new ArrayList<String>(), new ArrayList<String>(), new ArrayList<MigrationStrategy>(), new ArrayList<String>()); 
			appLevelComponent.setChildren(new ArrayList<Component>());
			componentList.add(appLevelComponent);
		}
		else {
			appLevelComponent = topLevelComponents.get(0);
			appLevelComponent.setApplicationLevelComponent(true);
		}

		for (Component component : componentList) {
			if (component != appLevelComponent && component.getParent() == null){
				component.setParent(appLevelComponent);
				appLevelComponent.getChildren().add(component);
			}
		}

	}

	private List<Component> calculateComplexities(List<Component> componentList) {

		MetricCalculator metricCalculator = new MetricCalculator();

		HashMap <String, List<String>> classFiles = new HashMap<String, List<String>>();

		for (Component component : componentList) {
			classFiles.put(component.getName(), component.getOwnedClassesWithFQN());
		}


		List<eu.artist.premigration.tft.scc.structures.Component> metrics = new ArrayList<eu.artist.premigration.tft.scc.structures.Component>();

		try {
			metrics = metricCalculator.getMetricsByComponent(classFiles, sourceFolderPaths, null, null, 1);
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", 
					"Error occured while calculating metrics. This may be due to a missing source path information. "
					+ "The migration suggestions will be made but component complexities and effort calculation will not be calculated."); 
		}

		for (int i = 0; i < componentList.size(); i++) {
			for (int j = 0; j < metrics.size(); j++) {
				if (componentList.get(i).getName().equalsIgnoreCase(metrics.get(j).getName())){
					componentList.get(i).setComplexity(metrics.get(j).getLevelOfComplexity());
				}
			}
		}

		return componentList;
	}

	/**
	 * Analyzes all components the selected component model has 
	 * @return A {@link List} of analyzed components
	 */
	//public List<Component> analyzeAllComponents(IProgressMonitor monitor) {
	public List<Component> analyzeAllComponents() {
		
//		monitor.beginTask("Analyzing component model for strategy suggestions", 2);

		ksession = kbase.newStatefulKnowledgeSession();
		ksession.setGlobal("mGoals", MigrationGoalsContainer.INSTANCE.getMigrationGoals());

		//Select all elements from the selected model of type component
		SELECT select = new SELECT(
				new FROM(model),
				new WHERE(new EObjectTypeRelationCondition(UMLPackage.Literals.COMPONENT, TypeRelation.SAMETYPE_OR_DIRECT_SUBTYPE_LITERAL)
						)
				);

		Collection<EObject> queryResult = select.execute();
		Map<org.eclipse.uml2.uml.Component, Component> componentsMap = new HashMap<org.eclipse.uml2.uml.Component, Component>();

		KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");

		//TODO: COMPONENTS INSIDE COMPONENTS PROBLEM
		//TODO: DO THIS OPERATION WITH EMF QUERY (Setting clients and suppliers  of component dependencies)
		for (EObject c: queryResult){
			if (c instanceof org.eclipse.uml2.uml.Component) {
				org.eclipse.uml2.uml.Component uml2Component = (org.eclipse.uml2.uml.Component) c;
				//						componentsMap.put(uml2Component, analyzeComponent(uml2Component));
				componentsMap.put(uml2Component, convertToTFTComponent(uml2Component));
			}
		}


		//Setting dependency and parent/child relationships
		setParentChildRelationships(componentsMap);
		setDependencyRelationships(componentsMap);

		//Derive the list of components from the component map
		List<Component> componentList = new ArrayList<Component>();
		componentList.addAll(componentsMap.values());

		//Create application component representing the whole application as the parent of all components
		createAppLevelComponent(componentList);

		//Add all components to the knowledge session
		for (Component component : componentList) {
			ksession.insert(component);
		}

		//Setting focus the agenda group (set of rules for each cloud provider) to the target platform value on the Migraion Goals
		ksession.getAgenda().getAgendaGroup(MigrationGoalsContainer.INSTANCE.getMigrationGoals().getTechnicalGoals().getIaas().getSelectedTargetPlatform().toString()).setFocus();
		ksession.fireAllRules();

		logger.close();

		ksession.dispose();
		
//		monitor.worked(1);
//		monitor.setTaskName("Analyzing source code for component complexities");
		
		calculateComplexities(componentList);

//		monitor.worked(1);

		return componentList;

	}

	/**
	 * Analyzes the passed UML2 component and returns the created TFT Component
	 * 
	 * @param uml2Component {@link org.eclipse.uml2.uml.Component} to be analyzed
	 * @return An instance of {@link Component} 
	 */
	private Component convertToTFTComponent(org.eclipse.uml2.uml.Component uml2Component) {

		List<String> ownedClasses = new ArrayList<String>();
		List<String> ownedClassesWithFQN = new ArrayList<String>();
		//Scan all classes owned by the component and add them to the ownedClasses list
		for (PackageableElement p : uml2Component.getPackagedElements()){
			if (p instanceof Class && !(p instanceof org.eclipse.uml2.uml.Component)) {
				ownedClasses.add(((Class) p).getName());
				//TODO: Initial coding, will be revised
				if (((Class) p).getAttribute("qualifiedName", null) != null){
					ownedClassesWithFQN.add(((Class) p).getAttribute("qualifiedName", null).getDefault().replace("root model::org.dews_online.ccui.core::", "").replace("::", ".")+".java");
				}
				else {
					System.out.println("No qualified name attached to the class: " + ((Class) p).getName());
				}
			}
		}

		List<String> stereotypes = new ArrayList<String>();
		//Collecting the stereotype names
		for (EObject eObject : uml2Component.getStereotypeApplications()) {
			stereotypes.add(eObject.eClass().getName());
		}

		//Initializing the component
		return new Component(uml2Component.getQualifiedName(), false, false, uml2Component.getName(), ownedClasses, ownedClassesWithFQN, new ArrayList<MigrationStrategy>(), stereotypes);
	}

	/**
	 * This method loads the model from the file passed as the parameter
	 * @param file {@link File} to be loaded
	 */
	public void loadModel (IFile file) {
		//Change the currently loaded resource file
		this.file = file;
		//getResource(URI,boolean) method creates and loads the resource if it has not been created yet otherwise resource is just loaded from the resource set   
		Resource resource = resSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
		model = (Model) resource.getContents().get(0);
	}

	/**
	 * This method unload and loads the model again in case it is needed to be refreshed (i.e modifications in the resource itself)
	 */
	public void updateModel () {
		Resource resource = resSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
		resource.unload();
		resource = resSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
		model = (Model) resource.getContents().get(0);
	}

	/**
	 * Get selected file
	 * @return An instance of {@link File} which is the selected file
	 */
	public IFile getFile() {
		return this.file;
	}

}
