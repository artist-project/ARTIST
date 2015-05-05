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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;

/**
 * Assertions for element groups, i.e. {@link Collection}s of {@link EObject}s.<br />
 * For everything related to matches, see {@link Matches}
 * 
 * @see Matches
 * @author Felix Rieger, Stefan Jurack, Christian Krause
 * 
 */
public class ElementGroups {
	/**
	 * Asserts that the specified element group is deleted from the graph.<br>
	 * This is the case if one or more elements in the group have been deleted
	 * from the graph.<br>
	 * To assert that <b>all</b> elements contained in the group have been
	 * deleted, use {@link assertAllElementsFromElementGroupDeleted}
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s containing the elements
	 *            to check
	 * @param graph
	 *            {@link EGraphImpl}
	 * @throws AssertionError
	 */
	public static void assertElementGroupDeleted(Collection<? extends EObject> group, EGraph graph)
			throws AssertionError {
		if (graph.containsAll(group)) {
			throw new AssertionError(
					"expected: Any element in the specified element group deleted, but group still exists in its entirety.");
		}
	}
	
	/**
	 * Asserts that all elements from the specified group are deleted from the
	 * graph. To assert that at least one element is deleted, use
	 * {@link assertElementGroupDeleted}
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s containing the elements
	 *            to check
	 * @param graph
	 *            {@link EGraphImpl}
	 * @throws AssertionError
	 */
	public static void assertAllElementsFromElementGroupDeleted(
			Collection<? extends EObject> group, EGraph graph) throws AssertionError {
		assertElementGroupDeleted(group, graph);
		
		for (EObject eo : group) {
			if (graph.contains(eo)) {
				throw new AssertionError(
						"expected: All elements from the specified group deleted, but at least one element still exists in graph.");
			}
		}
		
	}
	
	/**
	 * Asserts that no element from the specified group is deleted from the
	 * graph (i.e. the graph contains all elements from the group)
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s containing the elements
	 *            to check
	 * @param graph
	 *            {@link EGraphImpl}
	 * @throws AssertionError
	 */
	public static void assertNoElementFromElementGroupDeleted(Collection<? extends EObject> group,
			EGraph graph) throws AssertionError {
		
		for (EObject eo : group) {
			if (!(graph.contains(eo))) {
				throw new AssertionError(
						"expected: No element from group deleted, but at least one element was deleted.");
			}
		}
	}
	
}
