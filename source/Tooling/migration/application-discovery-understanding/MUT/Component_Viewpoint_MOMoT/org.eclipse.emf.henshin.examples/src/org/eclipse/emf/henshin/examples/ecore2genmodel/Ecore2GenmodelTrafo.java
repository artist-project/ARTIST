/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.ecore2genmodel;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.ChangeImpl;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * This implementation of an Ecore to Genmodel transformation by 
 * <a href="http://www.eclipse.org/modeling/emft/henshin/">Henshin</a> 
 * was created in the context of the 
 * <a href="http://is.ieis.tue.nl/staff/pvgorp/events/TTC2010/">Transformation Tool
 * Contest 2010</a> organized as satellite workshop to the 
 * <a href="http://malaga2010.lcc.uma.es/">TOOLS 2010</a> conference.<br>
 * Authors are (in alphabetical order):
 * <ul>
 * <li>Enrico Biermann</li>
 * <li>Claudia Ermel</li>
 * <li>Stefan Jurack</li>
 * <li>Christian Krause</li>
 * </ul>
 * 
 * <i>Remark:</i> As proof of concept only, in the following source (*.ecore) and
 * target (*.genmodel) model files are hard-coded. An adaptation to a full-fledged 
 * plug-in providing a context menu entry for Ecore files is straightforward.
 * 
 */
public class Ecore2GenmodelTrafo {

	// Base directory relative to the plug-in root:
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/ecore2genmodel";

	/**
	 * Example transformation that translates an Ecore model for flow charts to a GenModel. 
	 */
	public static void runEcore2GenmodelExample(String path, boolean save) {
		
		System.out.println("Generating GenModel for flowchartdsl.ecore...");
		
		// Create a resource set:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		
		// Register Genmodel package (everything else is automatically registered):
		resourceSet.registerXMIResourceFactories("genmodel");
		GenModelPackage.eINSTANCE.getName();
		
		// Load the module:
		Module module = resourceSet.getModule("Ecore2Genmodel.henshin", false);
		
		// Load Ecore files:
		EPackage mappingModel = (EPackage) resourceSet.getEObject("ecore2gen.ecore");
		EPackage ecoreModel = (EPackage) resourceSet.getEObject("flowchartdsl.ecore");

		// Create the object graph:
		EGraph graph = new EGraphImpl(ecoreModel);
		
		// Prepare the interpreter engine:
		Engine engine = new EngineImpl();
		ChangeImpl.PRINT_WARNINGS = false; // we can ignore the warnings
		UnitApplication unitApp = new UnitApplicationImpl(engine);

		// Generate genmodel from ecore model (without annotations).
		unitApp.setEGraph(graph);
		unitApp.setUnit(module.getUnit("translateGenModel"));
		
		// File name and plug-in name cannot be reliably deduced by the model elements, thus need to be set:
		unitApp.setParameterValue("modelFileName", "flowchartdsl.ecore");
		unitApp.setParameterValue("pluginName", ecoreModel.getName());
		
		// Execute the transformation unit:
		InterpreterUtil.executeOrDie(unitApp);
		
		// Get the generated Genmodel:
		GenModel genModel = (GenModel) unitApp.getResultParameterValue("genModel");
		
		graph.addTree(module);
		graph.addTree(GenModelPackage.eINSTANCE);
		graph.addTree(mappingModel);

		// Process annotations and generate related Henshin rules:
		unitApp.setUnit(module.getUnit("prepareCustomizationUnit"));
		InterpreterUtil.executeOrDie(unitApp);

		// Apply generated rules to transfer annotations to the genmodel.
		Unit customizationUnit = (Unit) unitApp.getResultParameterValue("seqUnit");
		unitApp.setUnit(customizationUnit);
		InterpreterUtil.executeOrDie(unitApp);

		System.out.println("Successfully generated GenModel.");
		
		if (save) {
			resourceSet.saveEObject(genModel, "flowchartdsl-generated.genmodel");
			System.out.println("Saved the result to flowchartdsl-generated.genmodel");
		}

	}

	public static void main(String[] args) {
		runEcore2GenmodelExample(PATH, true);
	}
	
}