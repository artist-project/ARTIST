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

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
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
 * This class contains an assortment of various tools useful for testing and
 * debugging henshin rules.
 * 
 * @see HenshinLoaders
 * @author Felix Rieger
 * @author Stefan Jurack (sjurack)
 * 
 */
public class Tools {
	/*----------------------------
	 * MISC
	 * ----------------------------*/

	/**
	 * Get number of elements in the specified graph; execute
	 * {@link UnitApplication}; get number of elements in the specified graph
	 * again
	 * 
	 * @param ua
	 *            {@link UnitApplication}
	 * @return int[2]: <br>
	 *         [0] size before execution<br>
	 *         [1] size after execution
	 */
	protected static int[] getGraphSizes(UnitApplication ua) {
		EGraph graph = ua.getEGraph();
		int[] sizes = new int[2];
		sizes[0] = graph.size();
		ua.execute(null);
		sizes[1] = graph.size();
		return sizes;
	}
	
	/**
	 * print matches
	 * 
	 * @param ma
	 */
	public static void printMatches(List<Match> ma) {
		System.out.println("matches:");
		for (Match m : ma) {
			System.out.println(m);
			System.out.println("===");
		}
	}
	
	/**
	 * print graph
	 * 
	 * @param graph
	 */
	public static void printGraph(EGraph graph) {
		for (EObject eo : graph) {
			System.out.println(eo);
		}
	}
	
	/**
	 * print graph
	 * 
	 * @param graph
	 */
	public static void printGraph(Graph graph) {
		for (EObject eo : graph.eContents()) {
			System.out.println(eo);
			for (Edge edge : graph.getEdges()) {
				System.out.println("edge: " + edge);
			}
		}
	}
	
	/**
	 * store a rule to disk for analyzing
	 * 
	 * @param rule
	 *            Rule to be stored
	 * @param filename
	 *            Path to store URI
	 * @throws IOException
	 */
	public static void persist(Rule rule, String filename) throws IOException {
		ResourceSet rSet = new ResourceSetImpl();
		URI myURI = URI.createFileURI(filename);
		Resource res = rSet.createResource(myURI, "henshin");
		res.getContents().add(rule);
		res.save(null);
	}
	
	/**
	 * Returns the objects matching the specified context-free OCL query
	 * 
	 * @param contextFreeOclQuery
	 *            context-free OCL query
	 * @param graph
	 *            {@link EGraph} the query is executed on
	 * @return
	 */
	public static Collection<? extends EObject> getOCLQueryResults(String contextFreeOclQuery,
			EGraph graph) {
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
		return result.getEObjects();
	}
	
	/**
	 * Return the first element matched by the context-free OCL query
	 * 
	 * @param contextFreeOclQuery
	 * @param graph
	 * @return
	 */
	public static EObject getFirstOCLResult(String contextFreeOclQuery,
			EGraph graph) {
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
		if (result.size() == 0) {
			return null;
		}
		return result.getEObjects().toArray(new EObject[1])[0];
	}
	
	/**
	 * get the {@link EGraph}'s first root
	 * 
	 * @param graph
	 * @return
	 */
	public static EObject getGraphRoot(EGraph graph) {
		return graph.getRoots().toArray(new EObject[1])[0];
	}
	
	public static void printCollection(Collection<? extends EObject> coll) {
		System.out.println("-------");
		for (EObject eo : coll) {
			System.out.println(eo);
		}
		System.out.println("-------");
	}
	
	public static void printParameterMappings(RuleApplication ra) {
		System.out.println("Input parameters:\n" + ra.getAssignment());
		System.out.println("Output parameters:\n" + ra.getResultAssignment());
	}
	
	public static Map<Parameter, Object> createParameterMapping(Map<String, Object> mapping,
			Rule rule) {
		Map<Parameter, Object> pMapping = new HashMap<Parameter, Object>();
		for (Parameter param : rule.getParameters()) {
			if (mapping.get(param.getName()) != null) {
				pMapping.put(param, mapping.get(param.getName()));
			}
		}
		return pMapping;
	}
	
	public static void printParameterMappings(UnitApplication ua) {
		System.out.println(ua.getAssignment());
	}
	
}
