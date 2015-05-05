/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.ecore2uml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * Ecore2UML example for Henshin.
 * 
 * @author Christian Krause
 */
public class Ecore2UML {

	/** 
	 * Relative path to the model files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/ecore2uml";

	/**
	 * Example Ecore model.
	 */
	public static final String ECORE_EXAMPLE = "flowchartdsl.ecore";

	/**
	 * Run the Ecore2UML conversion.
	 * @param path Relative path to the model files.
	 * @param ecore The Ecore file.
	 * @param saveResult Whether the result should be saved.
	 */
	public static void run(String path, String ecore, boolean saveResult) {

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Initialize UML package and register *.uml file extension:
		if (!resourceSet.initPackageImplementation("org.eclipse.uml2.uml.UMLPackage")) {
			throw new RuntimeException("UML2 package not found. Make sure that org.eclipse.uml2.uml is in the classpath.");
		}
		resourceSet.registerXMIResourceFactories("uml");

		// Load the module:
		Module module = resourceSet.getModule("ecore2uml.henshin", false);

		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource(ecore));
		graph.addAll(EcorePackage.eINSTANCE.getEClassifiers()); // we need the EDataTypes in the graph
		
		// Create an engine and a unit application:
		Engine engine = new EngineImpl();
		UnitApplication app = new UnitApplicationImpl(engine, graph, module.getUnit("main"), null);		
		
		// Execute the transformation:
		if (!app.execute(new LoggingApplicationMonitor())) {
			throw new RuntimeException("Error executing transformation");
		}
		
		// Saving the result:
		if (saveResult) {
			// Collect all generated UML packages:
			List<EObject> umlPackages = new ArrayList<EObject>();
			for (EObject obj : graph.getRoots()) {
				if (obj.eClass().getName().equals("Package")) {	// Ecore packages are instances of "EPackage"
					umlPackages.add(obj);
				}
			}
			Resource resource = resourceSet.
				createResource(URI.createFileURI(ecore.replaceAll(".ecore", ".uml")));
			resource.getContents().addAll(umlPackages);
			try {
				resource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		run(PATH, ECORE_EXAMPLE, true); // we assume the working directory is the root of the examples plug-in
	}
	
}
