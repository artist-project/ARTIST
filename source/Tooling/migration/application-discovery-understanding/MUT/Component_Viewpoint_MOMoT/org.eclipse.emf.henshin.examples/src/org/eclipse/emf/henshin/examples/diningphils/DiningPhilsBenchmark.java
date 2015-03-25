/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.diningphils;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResourceSet;
import org.eclipse.emf.henshin.statespace.util.StateSpaceExplorationHelper;

/**
 * Dining philosophers benchmark. This is just a demonstration for using the
 * state space generation API of Henshin.
 * 
 * @author Christian Krause
 */
public class DiningPhilsBenchmark {

	/**
	 * Relative path to the example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/diningphils";
	
	/**
	 * Perform the benchmark.
	 * @param path Relative path to the model files.
	 * @param maxPhils Maximum number of philosophers.
	 * @param numThreads Number of threads to use.
	 */
	public static void run(String path, int maxPhils, int numThreads) {

		// Create a resource set with a base directory:
		StateSpaceResourceSet resourceSet = new StateSpaceResourceSet(path);
		
		// Load the state space and create a state space manager:
		StateSpace stateSpace = resourceSet.getStateSpace("3-phils.henshin_statespace");
		StateSpaceManager manager = StateSpaceFactory.eINSTANCE.createStateSpaceManager(stateSpace, numThreads);
		
		// To improve the performance, we omit the identity types:
		stateSpace.getProperties().remove(StateSpace.PROPERTY_IDENTITY_TYPES);
		
		// Find the rule for adding a philosopher:
		Rule createPhilRule = (Rule) stateSpace.getRules().get(0).getModule().getUnit("createPhil");

		// Transformation engine for adding philosophers:
		Engine engine = new EngineImpl();

		// Now do the benchmark...
		System.out.println("Starting dining philosophers benchmark...");
		System.out.println("NumThreads: " + manager.getNumThreads());
		System.out.println("MaxMemory: " + Runtime.getRuntime().maxMemory() / (1024 * 1024) + "MB\n");
		System.out.println("Phils\tStates\tTrans\tTime");

		try {
			for (int phils=3; phils<=maxPhils; phils++) {
				
				// First reset the state space:
				manager.resetStateSpace(false);
				
				// Then explore it again:
				long time = System.currentTimeMillis();
				new StateSpaceExplorationHelper(manager).doExploration(-1, new NullProgressMonitor());
				time = (System.currentTimeMillis() - time);

				// Check whether the number of states is as expected:
				int expectedStates = (int) Math.pow(3, phils);
				if (stateSpace.getStateCount()!=expectedStates || !stateSpace.getOpenStates().isEmpty()) {
					throw new StateSpaceException("Unexpected number of states: " +
							stateSpace.getStateCount() + "(" +
							stateSpace.getOpenStates().size() + ")");
				}
				
				// Print benchmark info: 
				System.out.println(phils + "\t" + 
								stateSpace.getStateCount() + "\t" + 
								stateSpace.getTransitionCount() + "\t" + 
								time);
				
				// Add a philosopher:
				EGraph initialStateGraph = manager.getModel(stateSpace.getInitialStates().get(0)).getEGraph();
				RuleApplication app = new RuleApplicationImpl(engine);
				app.setEGraph(initialStateGraph);
				app.setRule(createPhilRule);
				if (!app.execute(null)) {
					throw new RuntimeException("Error adding philosopher");
				}
			}	
		}
		catch (StateSpaceException e) {
			e.printStackTrace();
		}
		finally {
			manager.shutdown();
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int maxPhils = 12;
		int numThreads = Runtime.getRuntime().availableProcessors();
		if (args.length > 0) {
			maxPhils = Integer.parseInt(args[0]);
		}
		if (args.length > 1) {
			numThreads = Integer.parseInt(args[1]);
		}
		
		System.out.println("\n******* WARMUP PHASE ********\n");
		run(PATH, 8, numThreads);
		System.out.println("\n******* BENCHMARK ********\n");
		run(PATH, maxPhils, numThreads);
		
	}

}
