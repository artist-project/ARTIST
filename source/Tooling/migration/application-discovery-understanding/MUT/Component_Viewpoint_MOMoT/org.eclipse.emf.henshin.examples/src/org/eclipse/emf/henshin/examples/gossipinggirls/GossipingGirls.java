/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.gossipinggirls;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResourceSet;
import org.eclipse.emf.henshin.statespace.util.StateSpaceExplorationHelper;
import org.eclipse.emf.henshin.statespace.impl.OCLStateValidator;
import org.eclipse.emf.henshin.statespace.impl.ParallelStateSpaceManager;
import org.eclipse.emf.henshin.statespace.impl.ShortestPathStateSpaceValidator;

/**
 * Gossiping girls example in Henshin.
 * @author Christian Krause
 */
public class GossipingGirls {

	/**
	 * Relative path to the example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/gossipinggirls";
	
	/**
	 * Perform the benchmark.
	 */
	public static void run(String path, int maxGirls) {

		System.out.println("Generating state spaces for gossiping girls...");
		System.out.println("MaxMemory: " + Runtime.getRuntime().maxMemory() / (1024 * 1024) + "MB\n");

		// Load the state space and create a state space manager:
		StateSpaceResourceSet resourceSet = new StateSpaceResourceSet(path);		
		StateSpace stateSpace = resourceSet.getStateSpace("2-girls.henshin_statespace");
		StateSpaceManager manager = new ParallelStateSpaceManager(stateSpace);
		
		// Find the rule for adding a girl and create an engine instance:
		Rule addGirlRule = (Rule) stateSpace.getRules().get(0).getModule().getUnit("addGirl");
		Engine engine = new EngineImpl();
		
		// Now do the benchmark...
		try {
			System.out.println("Girls\tStates\tTrans\tCalls\tGenTime\tChkTime");

			for (int girls=2; girls<=maxGirls; girls++) {
				
				// First reset the state space:
				manager.resetStateSpace(false);
				
				// Then explore it again:
				long genTime = System.currentTimeMillis();
				new StateSpaceExplorationHelper(manager).doExploration(-1, new NullProgressMonitor());
				genTime = (System.currentTimeMillis() - genTime);

				// Compute the shortest path to a target state:
				ShortestPathStateSpaceValidator validator = 
						new ShortestPathStateSpaceValidator(new OCLStateValidator());
				validator.setStateSpaceIndex(manager);
				validator.setProperty("girls->forAll(g : Girl | g.secrets->size()=girls->size())");
				
				long chkTime = System.currentTimeMillis();
				Path shortest = (Path) validator.validate(manager.getStateSpace(), new NullProgressMonitor()).getResult();
				chkTime = (System.currentTimeMillis() - chkTime);

				System.out.println(girls + "\t" + 
								stateSpace.getStateCount() + "\t" + 
								stateSpace.getTransitionCount() + "\t" +
								shortest.size() + "\t" +
								genTime + "\t" + chkTime);
				
				// Add a girl:
				EGraph initialStateGraph = manager.getModel(stateSpace.getInitialStates().get(0)).getEGraph();
				RuleApplication app = new RuleApplicationImpl(engine);
				app.setEGraph(initialStateGraph);
				app.setRule(addGirlRule);
				if (!app.execute(null)) {
					throw new RuntimeException("Error adding girl!");
				}
				
			}	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			manager.shutdown();
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		System.out.println("\n*** WARMUP PHASE ***\n");
		run(PATH, 4);
		System.out.println("\n*** BENCHMARKING ***\n");
		run(PATH, 8);
	}

}
