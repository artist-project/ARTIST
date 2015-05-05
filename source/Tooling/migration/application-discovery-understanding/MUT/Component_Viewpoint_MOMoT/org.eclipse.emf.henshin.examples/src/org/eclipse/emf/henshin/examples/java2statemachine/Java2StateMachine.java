/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.java2statemachine;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * M2M transformation with a JaMoPP Java model as source model and a state
 * machine model as target. This is an implementation in terms of case study 1
 * of TTC2011 (http://planet-research20.org/ttc2011/index.php?option=com_content
 * &view=article&id=118&Itemid=160).
 * 
 * @author Johannes Tietje
 * @author Stefan Jurack
 * @author Christian Krause
 */
public class Java2StateMachine {
	
	// Relative path to the example files:
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/java2statemachine";
	
	// The input Java models:
	public static final String JAVA_MODEL_SMALL = "1-java-model-small.xmi";
	public static final String JAVA_MODEL_MEDIUM = "2-java-model-medium.xmi";
	public static final String JAVA_MODEL_BIG = "3-java-model-big.xmi"; // unpack this first
	
	// The reference result for the default Java model:
	public static final String REFERENCE_STATE_MACHINE = "reference-statemachine.xmi";
	
	/**
	 * Execute the conversion.
	 * @param path Relative path to the working directory. 
	 * @param javaModel The file name of the input java model.
	 * @param referenceModel The file name of the reference state machine model.
	 * @param saveResult Whether to save the result.
	 */
	@SuppressWarnings("unchecked")
	public static void run(String path, String javaModel, String referenceModel, boolean saveResult) {
		
		// Create the resource set:
		System.out.println("Loading Java2StateMachine transformation...");
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		
		// Load the module:
		Module module = resourceSet.getModule("java2statemachine.henshin", false);
		
		// Create a "Package" instance to store all "CompilationUnit"s
		EObject rootPackage = null;
		List<EObject> compilationUnits = null;
		for (EPackage imported : module.getImports()) {
			if ("containers".equals(imported.getName())) {
				EClass packageClass = (EClass) imported.getEClassifier("Package");
				rootPackage = imported.getEFactoryInstance().create(packageClass);
				EReference ref = (EReference) packageClass.getEStructuralFeature("compilationUnits");
				compilationUnits = (List<EObject>) rootPackage.eGet(ref);
				break;
			}
		}
		
		// Now load the Java model and add all "CompilationUnits" to the Package:
		System.out.println("Loading Java input model in '" + javaModel + "'");
		Resource javaResource = resourceSet.getResource(javaModel);
		for (EObject object : javaResource.getContents()) {
			if ("CompilationUnit".equals(object.eClass().getName())) {
				compilationUnits.add(object);
			}
		}

		// Create a graph representation of the model:
		EGraph graph = new EGraphImpl(rootPackage);
		System.out.println("Model has " + graph.size() + " objects");

		// Prepare the transformation engine: 
		Engine engine = new EngineImpl();
		engine.getOptions().put(Engine.OPTION_SORT_VARIABLES, false);
		
		UnitApplication unitApp = new UnitApplicationImpl(engine);
		unitApp.setEGraph(graph);
		unitApp.setUnit(module.getUnit("Start"));

		// Execute the transformation:
		System.out.println("Generating state machine...");
		long time = System.currentTimeMillis();
		InterpreterUtil.executeOrDie(unitApp);
		time = System.currentTimeMillis() - time;
		System.out.println("Generation took " + time + "ms.");
		
		// The generated state machine:
		EObject statemachine = (EObject) unitApp.getResultParameterValue("sm");

		// Save the generated state machine:
		if (saveResult) {
			resourceSet.saveEObject(statemachine, "generated-statemachine.xmi");
			System.out.println("Saved generated state machine in 'generated-statemachine.xmi'");
		} else {
			Resource dummyResource = new ResourceImpl(); // dump it into a dummy resource
			dummyResource.getContents().add(statemachine);
		}
		
		// Compare it with the reference:
		if (referenceModel!=null) {
			Resource reference = resourceSet.getResource("reference-statemachine.xmi");
			if (InterpreterUtil.areIsomorphic(reference, statemachine.eResource())) {
				System.out.println("Generated state machine is correct.");
			} else {
				throw new AssertionError("Generated state machine is not correct!");
			}
		}
		
	}
	
	public static void main(final String[] args) {
		run(PATH, JAVA_MODEL_SMALL, REFERENCE_STATE_MACHINE, false);
		//run(PATH, JAVA_MODEL_MEDIUM, REFERENCE_STATE_MACHINE, false);
		//run(PATH, JAVA_MODEL_BIG, REFERENCE_STATE_MACHINE, false);
	}

}