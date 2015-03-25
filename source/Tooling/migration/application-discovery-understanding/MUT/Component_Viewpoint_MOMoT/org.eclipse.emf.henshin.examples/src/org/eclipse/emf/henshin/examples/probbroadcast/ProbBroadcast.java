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
import org.eclipse.emf.henshin.statespace.util.StateSpaceXYPlot;

/**
 * Probabilistic broadcast example for wireless sensor networks. This example
 * is described in detail in this paper (presented at ICGT 2012):
 * <ul><li>
 * C. Krause, H. Giese: <i>Probabilistic Graph Transformation Systems</i>. 
 * Lecture Notes in Computer Science 7562, Springer-Verlag, 2012.
 * </li></ul>
 * This program computes some of the results for the example of probabilistic
 * broadcasting in wireless sensor network as presented in the above paper.
 * To run this program, you need a recent version of the PRISM model checker
 * installed on your computer. The PRISM executable needs to be present in
 * your system-wide path.
 * You can obtain PRISM from <a href="http://www.prismmodelchecker.org/">here</a>.
 * 
 * @author Christian Krause
 */
public class ProbBroadcast {
	
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
	public ProbBroadcast(String path) {
		resourceSet = new StateSpaceResourceSet(path);
		Module module = resourceSet.getModule("probbroadcast.henshin", false); // load the transformation module
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
	 * Compute the message reception probabilities for a fixed node and varying send probability.
	 * @param node The fixed node for which the reception probabilities shall be computed. 
	 * @param probSend Varying send probability (see PRISM syntax for experiments).
	 */
	public void fixedNode(int node, String probSend) throws Exception {
		System.out.println("\n - Computing reception probabilities for node " + node + "...\n");
		System.out.println("   Psend\tPmin\tPmax");
		String label = "label \"target\" = <<<OCL not self.nodes->at(" + node + ").active >>>;"; // OCL constraint for identifying the target states
		StateSpaceXYPlot pmin = (StateSpaceXYPlot) getResults(probSend, label + " Pmin=?[F \"target\"]");   // minimum reception probabilities
		StateSpaceXYPlot pmax = (StateSpaceXYPlot) getResults(probSend, label + " Pmax=?[F \"target\"]");   // maximum reception probabilities
		for (int x=0; x<pmin.getXMaxSegments(); x++) {
			System.out.println("   " + pmin.getX(0, x) + "\t" + pmin.getY(0, x) + "\t" + pmax.getY(0, x));
		}
	}

	/**
	 * Compute the results for the probabilistic broadcast example.
	 * @param path Relative path to the model files.
	 */
	public static void run(String path) {
		ProbBroadcast main = new ProbBroadcast(path);
		try {
			OCLStateValidator.register(); // we need the OCL validator
			main.generate("init-grid3x3.xmi");
			main.fixedSendProb(new int[] {2,4,3,5,7,6,8,9}, 0.6); // first diagram in Figure 12
			main.fixedNode(9, "0:0.1:1"); // first diagram in Figure 13 
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
