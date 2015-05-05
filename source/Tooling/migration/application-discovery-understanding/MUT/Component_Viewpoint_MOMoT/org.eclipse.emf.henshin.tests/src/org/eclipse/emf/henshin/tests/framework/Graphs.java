/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.framework;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;

/**
 * Assertions for (static) {@link EGraph}s. For everything related to changes
 * (caused by Rules/TransformationUnits) on graphs, see
 * {@link GraphTransformations}.
 * 
 * @see GraphTransformations
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class Graphs {
	/**
	 * Assert that the specified object is contained in the graph
	 * 
	 * @param obj
	 *            {@link EObject}
	 * @param graph
	 *            {@link EGraphImpl}
	 * @throws AssertionError
	 */
	public static void assertObjectInGraph(EObject obj, EGraph graph) throws AssertionError {
		if (!(graph.contains(obj))) {
			throw new AssertionError("expected: Object " + obj.toString() + " contained in graph");
		}
	}
		
	/**
	 * Assert that the specified object is not contained in the graph
	 * 
	 * @param obj
	 *            {@link EObject}
	 * @param graph
	 *            {@link EGraphImpl}
	 * @throws AssertionError
	 */
	public static void assertObjectNotInGraph(EObject obj, EGraph graph) throws AssertionError {
		if (graph.contains(obj)) {
			throw new AssertionError("expected: Object " + obj.toString()
					+ " not contained in graph");
		}
	}
	
	/**
	 * Assert that both graphs are equal, i.e.
	 * <ul>
	 * <li>all matched elements have a similarity above the
	 * matchSimilarityThreshold</li>
	 * <li>there are no unmatched elements or changes</li>
	 * </ul>
	 * 
	 * @param graph1
	 *            {@link EGraphImpl}
	 * @param graph2
	 *            {@link EGraphImpl}
	 * @param matchSimilarityThreshold
	 *            similarity for EmfCompare's mapping. Values above (and
	 *            including) this are considered as mapped. Range [0..1]. 0.9 is
	 *            a good value to start with, adjust if problems occur.
	 * @throws AssertionError
	 */
	public static void assertGraphsEqual(EGraph graph1, EGraph graph2) throws AssertionError {
		if (!InterpreterUtil.areIsomorphic(graph1, graph2)) {
			throw new AssertionError("expected equal graphs");
		}
	}
		
}
