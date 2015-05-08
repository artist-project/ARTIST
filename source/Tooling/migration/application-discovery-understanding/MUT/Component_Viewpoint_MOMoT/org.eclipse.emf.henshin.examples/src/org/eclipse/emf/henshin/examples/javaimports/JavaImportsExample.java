/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.javaimports;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

/**
 * @author Christian Krause
 */
public class JavaImportsExample {

	/**
	 * Relative path to the example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/javaimports";

	/**
	 * Run the java-imports example.
	 * 
	 * @param path Relative path to the model files.
	 */
	public static void run(String path) {

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Load the module:
		Module module = resourceSet.getModule("javaimports.henshin", false);

		// Create an empty EGraph:
		EGraph graph = new EGraphImpl();

		// Use a delegating class loader so that the script engine can find the helper class:
		Thread thread = Thread.currentThread();
		thread.setContextClassLoader(new InterpreterUtil.DelegatingClassLoader(thread.getContextClassLoader(),
				JavaImportsExample.class.getClassLoader()));

		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		RuleApplication app = new RuleApplicationImpl(engine, graph, (Rule) module.getUnit("simple"), null);
		String value = "hello world";
		app.setParameterValue("x", value);
		InterpreterUtil.executeOrDie(app);

		
		
		// retrieve the node that was created by the rule
		Iterator<EObject> graphIt =graph.iterator(); 
		EObject newObj = null;
		if(graphIt.hasNext()) 
			newObj = graphIt.next();
		if(newObj==null) 
			throw new RuntimeException("Unexpected result of rule application: no graph node was created (expected one node)");
		
		// retrieve the attribute value of the node and check the expected result
		String newValue = (String) newObj.eGet(newObj.eClass().getEStructuralFeature("stringValue"));
		if (!newValue.equals(value.toUpperCase())) {
			throw new RuntimeException("Unexpected string value: \"" + newValue + "\" (expected \""
					+ value.toUpperCase() + "\")");
		} else {
			System.out.println("Java Imports Example: Found correct value: \"" + newValue + "\"");
		}

	}

	public static void main(String[] args) {
		run(PATH); // we assume the working directory is the root of the examples plug-in
	}

}
