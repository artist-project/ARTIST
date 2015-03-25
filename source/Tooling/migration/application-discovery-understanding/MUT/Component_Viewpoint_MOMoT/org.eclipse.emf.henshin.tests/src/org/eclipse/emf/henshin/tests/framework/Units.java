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
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Assertions for Units. For assertions on specific objects
 * matched, see {@link Matches}.
 * 
 * @see Matches
 * @see Rules
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * @author Christian Krause
 * 
 */
public class Units {
	
	/**
	 * Assert that the specified {@link TransformationUnit} can be executed
	 * multiple times.
	 * 
	 * @param tu
	 *            {@link TransformationUnit} to be executed
	 * @param graph
	 *            {@link EGraph} the {@link TransformationUnit} should be
	 *            executed on
	 * @throws AssertionError
	 */
	public static void assertTransformationUnitCanBeExecutedMultipleTimes(Unit tu,
			EGraph graph, Engine engine) throws AssertionError {
		UnitApplication ua = InterpreterFactory.INSTANCE.createUnitApplication(engine);
		ua.setUnit(tu);
		ua.setEGraph(graph);
		assertUnitApplicationCanBeExecutedMultipleTimes(ua);
	}
	
	/**
	 * Assert that the specified {@link UnitApplication} can be executed
	 * multiple times.
	 * 
	 * @param ua
	 *            {@link UnitApplication} to be executed
	 * @throws AssertionError
	 */
	public static void assertUnitApplicationCanBeExecutedMultipleTimes(UnitApplication ua)
			throws AssertionError {
		
		boolean success = ua.execute(null);
		if (success) {
			success = ua.execute(null);
		}
		if (!success) {
			throw new AssertionError(
					"expected: UnitApplication can be executed multiple times, but could not.");
		}
		
	}
	
	/**
	 * Assert that the specified {@link TransformationUnit} can be executed at
	 * least n times.
	 * 
	 * @param tu
	 *            {@link TransformationUnit} to be executed
	 * @param graph
	 *            {@link EGraph} the {@link TransformationUnit} should be
	 *            executed on
	 * @param n
	 *            minimum number of times the {@link TransformationUnit} should
	 *            be able to be executed
	 * @throws AssertionError
	 */
	public static void assertTransformationUnitCanBeExecutedNTimes(Unit tu,
			EGraph graph, Engine engine, int n) throws AssertionError {
		UnitApplication ua = InterpreterFactory.INSTANCE.createUnitApplication(engine);
		ua.setUnit(tu);
		ua.setEGraph(graph);
		assertUnitApplicationCanBeExecutedNTimes(ua, n);
	}
	
	/**
	 * Assert that the specified {@link UnitApplication} can be executed at
	 * least n times.
	 * 
	 * @param ua
	 *            {@link UnitApplication} to be executed
	 * @param n
	 *            minimum number of times the {@link UnitApplication} should be
	 *            able to be executed
	 * @throws AssertionError
	 */
	public static void assertUnitApplicationCanBeExecutedNTimes(UnitApplication ua, int n)
			throws AssertionError {
		
		boolean success = true;
		int i;
		for (i=0; i<n; i++) {
			success = ua.execute(null);
			if (!success) {
				break;
			}
		}
		if (!success) {
			throw new AssertionError("expected: UnitApplication can be executed at least " + n
					+ " times, but could only be executed " + i + " times");
		}
		
	}
	
	public static void assertTuCanBeExecuted(UnitApplication ua) throws AssertionError {
		if (!(ua.execute(null))) {
			throw new AssertionError("expected: UnitApplication can be executed.");
		}
	}
	
	public static void assertTuCanNotBeExecuted(UnitApplication ua) throws AssertionError {
		if (ua.execute(null)) {
			throw new AssertionError("expected: UnitApplication can not be executed.");
		}
	}
	
}
