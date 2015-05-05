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

import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Assertions for changes on graphs/graph transformations.
 * 
 * @see Graphs
 * @see Matches
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class GraphTransformations {
	// test number 30
	
	/**
	 * Assert that the number of objects in the given graph is identical before
	 * and after application of the {@link Rule}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph}
	 * @throws AssertionError
	 */
	public static void assertNumberOfObjectsIdentical(Rule r, EGraph graph, Engine engine) throws AssertionError {
		RuleApplication ra = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		ra.setRule(r);
		ra.setEGraph(graph);
		assertNumberOfObjectsIdentical(ra);
	}
	
	
	/**
	 * Assert that the number of objects in the {@link UnitApplication}'s graph
	 * is identical before and after its execution.
	 * 
	 * @param ua
	 *            {@link UnitApplication}
	 * @throws AssertionError
	 */
	public static void assertNumberOfObjectsIdentical(UnitApplication ua) throws AssertionError {
		int[] sizes = Tools.getGraphSizes(ua);
		if (sizes[0] != sizes[1]) {
			throw new AssertionError("expected: Number of elements before and after execution of "
					+ ua.getUnit().getName() + " identical. Values: <" + sizes[0]
					+ "> -> <" + sizes[1] + ">");
		}
	}
	
	// test number 31
	
	/**
	 * Assert that the number of objects in the graph is not identical before
	 * and after application of the specified {@link Rule}
	 * 
	 * @param r
	 *            {@link Rule}
	 * @param graph
	 *            {@link EGraph}
	 * @throws AssertionError
	 */
	public static void assertNumberOfObjectsChanged(Rule r, EGraph graph, Engine engine) throws AssertionError {
		RuleApplication ra = InterpreterFactory.INSTANCE.createRuleApplication(engine);
		ra.setRule(r);
		ra.setEGraph(graph);
		assertNumberOfObjectsChanged(ra);
	}
	
	/**
	 * Assert that the number of objects in the engine's graph is not identical
	 * before and after execution of the specified {@link Unit}
	 * 
	 * @param tu
	 *            {@link Unit}
	 * @param engine
	 *            {@link Engine}
	 * @throws AssertionError
	 */
	public static void assertNumberOfObjectsChanged(Unit tu, EGraph graph, Engine engine)
			throws AssertionError {
		UnitApplication ua = InterpreterFactory.INSTANCE.createUnitApplication(engine);
		ua.setUnit(tu);
		ua.setEGraph(graph);
		assertNumberOfObjectsChanged(ua);
	}
	
	/**
	 * Assert that the number of objects in the {@link UnitApplication}'s graph
	 * is not identical before and after its execution
	 * 
	 * @param ua
	 *            {@link UnitApplication}
	 * @throws AssertionError
	 */
	public static void assertNumberOfObjectsChanged(UnitApplication ua) throws AssertionError {
		int[] sizes = getGraphSizes(ua);
		if (sizes[0] == sizes[1]) {
			throw new AssertionError("expected: Number of elements before and after execution of "
					+ ua.getUnit().getName() + " different. Values: <" + sizes[0]
					+ "> -> <" + sizes[1] + ">");
		}
	}
	
	// test number 18
	
	// 16, 17
	
	private static int[] getGraphSizes(UnitApplication ua) {
		return Tools.getGraphSizes(ua);
	}
	
}
