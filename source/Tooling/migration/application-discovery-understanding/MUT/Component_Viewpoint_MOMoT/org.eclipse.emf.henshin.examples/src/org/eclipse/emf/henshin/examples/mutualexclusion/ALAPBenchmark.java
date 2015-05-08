/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.mutualexclusion;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class ALAPBenchmark {
	
	/**
	 * Relative path to the example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/mutualexclusion";

	final static int GRAPH_SIZE_MIN = 1000;
	
	final static int GRAPH_SIZE_MAX = 10000;
	
	final static int STEP = 1000;
	
	final static int ITERATIONS = 3;

	public static void run(String path) {

		System.out.println("***************** Alap Transformation Sequence***************");
		System.out.println("Memory allocated:" +Runtime.getRuntime().maxMemory()/1024/1024 + "Mb");
		System.out.println("GRAPH_SIZE_MIN:" + GRAPH_SIZE_MIN);
		System.out.println("GRAPH_SIZE_MAX:" + GRAPH_SIZE_MAX);
		System.out.println("STEP:" + STEP);
		System.out.println("ITERATIONS:" + ITERATIONS + " , first iteration is not included into evaluation");
		System.out.println("*************************************************************");

		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);

		// Load the module:
		Module module = resourceSet.getModule("mutualexclusion.henshin", false);

		// Load initial model:
		EObject container = resourceSet.getEObject("initialgraph.xmi");
		
		// Load the rules:
		Rule newRule = (Rule) module.getUnit("newRule");
		Unit alap2Unit = module.getUnit("alap2");
//		LoggingApplicationMonitorImpl monitor = new LoggingApplicationMonitorImpl();

		
		//Perform benchmark for several graph sizes
		for(int graphSize = GRAPH_SIZE_MIN; graphSize <=GRAPH_SIZE_MAX; graphSize +=STEP){

			long sum = 0;
			for (int j = 0; j < ITERATIONS; j++) {
	
				EObject container2 = EcoreUtil.copy(container);
				
				// Initialize the Henshin interpreter:
				EGraph graph = new EGraphImpl(container2);
				Engine engine = new EngineImpl();
	
				UnitApplication unitAppl = new UnitApplicationImpl(engine);
				unitAppl.setEGraph(graph);
				RuleApplication ruleAppl = new RuleApplicationImpl(engine);
				ruleAppl.setEGraph(graph);
				// get Starting Time
				long startTime = System.currentTimeMillis();
				
				// create initial graph
				ruleAppl.setRule(newRule);

				for (int i = 0; i < graphSize - 2; i++) {
					ruleAppl.execute(null);
				}
		
				//execute sequences of rules
				unitAppl.setUnit(alap2Unit);
			    unitAppl.execute(null);
				
				//get finish time
				long finishTime = System.currentTimeMillis();
				
				if(j!=0) //don't include first ITERATION; emf  classes are loaded
					sum = sum + finishTime - startTime;
	
				//persist the resulting graph
				//BenchmarkHelper.persistGraph(BENCHMARK_CASE, resourceSet, container2);
			}
	
			System.out.println("Graph size: "+graphSize +"  average time:" + (sum/(ITERATIONS-1)));
		} //FOR several STEPS
	}

	public static void main(String[] args) {
		run(PATH);
	}

}
