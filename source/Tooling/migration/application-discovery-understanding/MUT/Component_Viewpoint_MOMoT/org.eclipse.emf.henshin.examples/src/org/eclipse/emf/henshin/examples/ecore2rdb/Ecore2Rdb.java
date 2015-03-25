/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.ecore2rdb;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * This class triggers a transformation of an Ecore model into a relational
 * (database) format. This is one example of an exogenous transformation with
 * Henshin.
 * 
 * @author Stefan Jurack, Christian Krause
 * 
 */
public class Ecore2Rdb {
	
	/**
	 * Relative path to the example files:
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/ecore2rdb";
	
	/**
	 * Example Ecore-input model:
	 */
	public static final String EXAMPLE_ECORE_MODEL = "CarRental.ecore";

	/**
	 * Package name of the example model: 
	 */
	public static final String EXAMPLE_PACKAGE_NAME = "CarRentalModel";

	/**
	 * Example RDB-output model (reference):
	 */
	public static final String EXAMPLE_RDB_MODEL = "CarRental-reference-result.xmi";
	
	/**
	 * Run the transformation.
	 * @param path Path to the example files.
	 * @param ecoreModel File name of an Ecore model.
	 * @param referenceRdbModel If set, the generated result will be compared with that model (for testing).
	 * @param saveResult Whether to save the result.
	 */
	public static void run(String path, String ecoreModel, String packageName, String referenceRdbModel, boolean saveResult) {
		
		System.out.println("Generating Rdb model for '" + ecoreModel + "'...");
		
		// Load the transformation module and the input model:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		Module module = resourceSet.getModule("ecore2rdb.henshin", false);
		Resource carRental = resourceSet.getResource(ecoreModel);
		
		// Initialize the Henshin graph:
		EGraph graph = new EGraphImpl(carRental);
		
		// Initialize the interpreter:
		Engine engine = new EngineImpl();
		
		Unit unit = module.getUnit("main");
		UnitApplication unitApp = new UnitApplicationImpl(engine, graph, unit, null);
		unitApp.setParameterValue("packageName", packageName);
		
		// Execute the transformation unit:
		InterpreterUtil.executeOrDie(unitApp);
		EObject result = (EObject) unitApp.getResultParameterValue("schema");
		System.out.println("Generated Rdb model.");
		
		// Save the result?
		if (saveResult) {
			String resultFile = ecoreModel.replaceFirst(".ecore", "-generated-result.xmi");
			resourceSet.saveEObject(result, resultFile);
			System.out.println("Saved result in '" + resultFile + "'");
		}

		// Compare with a reference model?
		if (referenceRdbModel!=null) {
			Resource reference = resourceSet.getResource(referenceRdbModel);
			Resource generated = new ResourceImpl();
			generated.getContents().add(result);
			if (!InterpreterUtil.areIsomorphic(reference, generated)) {
				throw new AssertionError("Unexpected result for '" + ecoreModel + "'");
			} else {
				System.out.println("Generated result is correct.");
			}
			
		}
		
	}

	public static void main(String[] args) {
		run(PATH, EXAMPLE_ECORE_MODEL, EXAMPLE_PACKAGE_NAME, EXAMPLE_RDB_MODEL, true);
	}

}
