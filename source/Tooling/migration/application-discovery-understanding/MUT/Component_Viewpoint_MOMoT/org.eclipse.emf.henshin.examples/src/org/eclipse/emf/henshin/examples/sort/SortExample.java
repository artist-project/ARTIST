/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.ProfilingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * Sort example for the Henshin interpreter.
 * 
 * @author Christian Krause
 */
public class SortExample {

	/** 
	 * Relative path to the bank model files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/sort";
	
	/**
	 * Run the sort example.
	 * @param path Relative path to the model files.
	 */
	public static void run(String path) {
		
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
		
		// Load the module:
		Module module = resourceSet.getModule("sort.henshin", false);

		// Create the example model:
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("test");
		List<EClass> eClasses = new ArrayList<EClass>();
		for (int i=0; i<10; i++) {
			EClass eClass = EcoreFactory.eINSTANCE.createEClass();
			char c = ((char)('A'+i));
			eClass.setName("" + c + c +c);
			eClasses.add(eClass);
		}
		Collections.shuffle(eClasses);
		ePackage.getEClassifiers().addAll(eClasses);
		
		// Put it into an EGraph:
		EGraph graph = new EGraphImpl(ePackage);
		
		// Create an engine and a unit application:
		Engine engine = new EngineImpl();
		UnitApplication app = new UnitApplicationImpl(engine, graph, module.getUnit("sort"), null);
		
		// Execute the transformation:
		ProfilingApplicationMonitor monitor = new ProfilingApplicationMonitor();
		if (!app.execute(monitor)) {
			throw new RuntimeException("Error executing transformation");
		}
		monitor.printStats();
		
		// Print the results:
		System.out.println("Result:");
		for (int i=0; i<ePackage.getEClassifiers().size(); i++) {
			System.out.println(ePackage.getEClassifiers().get(i).getName());
			if (i>0) {
				int cmp = ePackage.getEClassifiers().get(i-1).getName().compareTo(ePackage.getEClassifiers().get(i).getName());
				if (cmp>=0) {
					throw new RuntimeException("Error: incorrect sorting");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		run(PATH); // we assume the working directory is the root of the examples plug-in
	}
	
}
