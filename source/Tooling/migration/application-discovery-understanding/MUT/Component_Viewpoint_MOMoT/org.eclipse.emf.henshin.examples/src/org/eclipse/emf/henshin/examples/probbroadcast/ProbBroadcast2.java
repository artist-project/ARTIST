/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.examples.probbroadcast;

import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.external.prism.MDPStateSpaceValidator;
import org.eclipse.emf.henshin.statespace.impl.OCLStateValidator;
import org.eclipse.emf.henshin.statespace.impl.ParallelStateSpaceManager;
import org.eclipse.emf.henshin.statespace.impl.StateSpaceImpl;
import org.eclipse.emf.henshin.statespace.resource.StateSpaceResourceSet;
import org.eclipse.emf.henshin.statespace.util.StateSpaceExplorationHelper;

/**
 * Revised version of the probabilistic broadcast example.
 * 
 * @author Christian Krause
 */
public class ProbBroadcast2 {
	
	/**
	 * Relative path to the example files.
	 */
	public static final String PATH = "src/org/eclipse/emf/henshin/examples/probbroadcast";
	
	// State space manager used to generate state spaces:
	public final StateSpaceManager manager;
	
	// State space resource set for loading files:
	public final StateSpaceResourceSet resourceSet;
	
	/**
	 * Default constructor.
	 */
	public ProbBroadcast2(String path) {
		resourceSet = new StateSpaceResourceSet(path);
		Module module = resourceSet.getModule("probbroadcast2.henshin", false); // load the transformation module
		StateSpace stateSpace = new StateSpaceImpl(module);
		manager = new ParallelStateSpaceManager(stateSpace); // create a state space manager
	}
	
	/**
	 * Generates the state space for the given initial model.
	 */
	private void generate(String initModel) throws StateSpaceException {
		System.out.println("\n - Generating state space for topology in '" + initModel+ "'...");
		manager.resetStateSpace(true);
		manager.createInitialState(resourceSet.getModel(initModel));
		long time = System.currentTimeMillis();
		new StateSpaceExplorationHelper(manager).doExploration(-1, null);
		System.out.println(" - Generated " + manager.getStateSpace().getStateCount() + 
				" states in " + (System.currentTimeMillis() - time) + "ms");
	}
	
	/*
	 * Compute the results by running the PRISM tool.
	 */
	private Object getResults(String probSend, String property) throws Exception {
		MDPStateSpaceValidator validator = new MDPStateSpaceValidator(manager);
		validator.setProperty(property);
		manager.getStateSpace().getProperties().put("probSend1", probSend);  // set the send probability
		manager.getStateSpace().getProperties().put("probSend2", "1-probSend1");  // probability for *not* sending
		return validator.validate(manager.getStateSpace(), null).getResult();
	}
	
	/**
	 * Compute the message reception probabilities for a set of nodes and a fixed send probability. 
	 * @param nodes The nodes for which the reception probabilities shall be computed. 
	 * @param probSend The fixed send probability.
	 */
	public void fixedSendProb(int[] nodes, double probSend) throws Exception {	
		System.out.println("\n - Computing reception probabilities for send probability "  + probSend + "...\n");
		System.out.println("   Node\tPmin\tPmax");
		for (int i=0; i<nodes.length; i++) {
			String label = "label \"target\" = <<<OCL not self.nodes->at(" + nodes[i] + ").active >>>;"; // OCL constraint for identifying the target states
			double pmin = (Double) getResults(probSend+"", label + " Pmin=?[F \"target\"]");   // minimum reception probability
			double pmax = (Double) getResults(probSend+"", label + " Pmax=?[F \"target\"]");   // maximum reception probability
			System.out.println("   " + nodes[i] + "\t" + pmin + "\t" + pmax);
		}
	}

	/**
	 * Compute the results for the probabilistic broadcast example.
	 * @param path Relative path to the model files.
	 */
	public static void run(String path) {
		ProbBroadcast2 main = new ProbBroadcast2(path);
		try {
			OCLStateValidator.register(); // we need the OCL validator
			main.generate("init-grid3x3.xmi");
			main.fixedSendProb(new int[] {2,4,3,5,7,6,8,9}, 0.8);
		}
		catch (Throwable t){
			t.printStackTrace();
		} finally {
			main.manager.shutdown();  // shut down the state space manager
		}
	}
	
	public static void main(String[] args) {
		run(PATH);
	}
	
}
