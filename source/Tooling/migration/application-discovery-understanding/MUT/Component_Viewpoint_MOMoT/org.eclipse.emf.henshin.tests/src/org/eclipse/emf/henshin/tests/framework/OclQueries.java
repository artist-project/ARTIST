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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.query.conditions.Condition;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;

/**
 * Assertions for context-free OCL Queries on {@link EGraph}s.
 * 
 * @see Tools
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class OclQueries {
	/**
	 * Asserts that the query result contains elements
	 * 
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertElementsInQueryResult(String contextFreeOclQuery, EGraph graph)
			throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		
		if (result.isEmpty()) {
			throw new AssertionError(
					"expected: Query returns elements, but no elements in query result.");
		}
	}
	
	/**
	 * Asserts that the specified {@link EObject} is contained in the query
	 * result
	 * 
	 * @param eobj
	 *            {@link EObject}
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertObjectInQueryResult(EObject eobj, String contextFreeOclQuery,
			EGraph graph) throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		if (!(result.contains(eobj))) {
			throw new AssertionError("expected: Query result contains object <" + eobj
					+ ">, but doesn't.");
		}
	}
	
	/**
	 * Asserts that the specified object is not contained in the result returned
	 * by running the specified context-free ocl query on the graph
	 * 
	 * @param eobj
	 *            {@link EObject}
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertObjectNotInQueryResult(EObject eobj, String contextFreeOclQuery,
			EGraph graph) throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		if (result.contains(eobj)) {
			throw new AssertionError("expected: Object not in query result");
		}
	}
	
	/**
	 * Asserts that all objects contained in the specified group are contained
	 * in the query result
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertGroupInQueryResult(Collection<? extends EObject> group,
			String contextFreeOclQuery, EGraph graph) throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		
		if (!result.containsAll(group)) {
			throw new AssertionError("expected: Group is in query result");
		}
	}
	
	/**
	 * Asserts that at least one object from the group is not contained in the
	 * query result
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertGroupNotInQueryResult(Collection<? extends EObject> group,
			String contextFreeOclQuery, EGraph graph) throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		
		if (result.containsAll(group)) {
			throw new AssertionError(
					"expected: Group not in query result (i.e. at least one element from group not in query result)");
		}
	}
	
	/**
	 * Asserts that no element contained in the group is contained in the query
	 * result
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertNoElementFromGroupInQueryResult(Collection<? extends EObject> group,
			String contextFreeOclQuery, EGraph graph) throws AssertionError {
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		for (EObject eo : group) {
			if (result.contains(eo)) {
				throw new AssertionError(
						"expected: No element from group in query result, but at least one in query result <"
								+ eo + ">");
			}
		}
	}
	
	/**
	 * Asserts that at least one element contained in the group is contained in
	 * the query result.
	 * 
	 * @param group
	 *            {@link Collection} of {@link EObject}s
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query should be executed on
	 * @throws AssertionError
	 */
	public static void assertAtLeastOneElementFromGroupInQueryResult(
			Collection<? extends EObject> group, String contextFreeOclQuery, EGraph graph)
			throws AssertionError {
		if (group.size() == 0) {
			throw new AssertionError("group is empty");
		}
		OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		
		Condition oclQueryCondition;
		try {
			oclQueryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>(
					ocl.getEnvironment(), contextFreeOclQuery, null);
		} catch (ParserException e) {
			e.printStackTrace();
			throw new AssertionError("error parsing OCL query!   " + contextFreeOclQuery);
		}
		
		WHERE wr = new WHERE((EObjectCondition) oclQueryCondition);
		FROM fm = new FROM(graph);
		SELECT st = new SELECT(fm, wr);
		
		IQueryResult result = st.execute();
		for (EObject eo : group) {
			if (result.contains(eo)) {
				return;
			}
		}
		
		throw new AssertionError(
				"expected: At least one element from group in query result, but no element from group in query result");
	}
}
