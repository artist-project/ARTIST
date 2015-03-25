/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.tests.basic;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.interpreter.util.InterpreterUtil;
import org.eclipse.emf.henshin.model.Action;
import org.eclipse.emf.henshin.model.Edge;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.impl.EdgeImpl;
import org.eclipse.emf.henshin.model.impl.NodeImpl;
import org.eclipse.emf.henshin.model.impl.ParameterImpl;
import org.eclipse.emf.henshin.model.impl.RuleImpl;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage;
import org.eclipse.emf.henshin.tests.testmodel.cont;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdgeIndexTest extends HenshinTest {
	
	private TestmodelPackage tm;
	
	private Edge edge;

	private int nodeCount;

	private ParameterImpl param;
	
	@Before
	public void setUp() throws Exception {

		htEngine = new EngineImpl();
		tm = TestmodelPackage.eINSTANCE;

		// Load the test graph and get the number of child nodes in the graph:
		setEGraphPath("basic/models/matchTestsModels/", "testmodel");
		loadEGraph("manyNodes");
		nodeCount = htEGraph.getDomainSize(tm.getNode(), true);
		
		// Create the test rule:
		htRule = new RuleImpl("edgeIndexTest");
		
		Node source = new NodeImpl("source", tm.getcont());
		Node target = new NodeImpl("target", tm.getNode());
		edge = new EdgeImpl(source, target, tm.getcont_ContainsNode());
		param = new ParameterImpl("x", EcorePackage.eINSTANCE.getEInt());
		
		htRule.getLhs().getNodes().add(source);
		htRule.getLhs().getNodes().add(target);
		htRule.getLhs().getEdges().add(edge);
		htRule.getParameters().add(param);
		
		edge.setAction(new Action(Action.Type.PRESERVE));
		
	}

	private void checkEdgeIndex(Edge edge, String indexExpr, int index, Match partialMatch) {
		edge.setIndex(indexExpr);
		if (index>=0) {
			Rules.assertRuleHasNMatches(htRule, htEGraph, partialMatch, htEngine, 1);
			Match match = htEngine.findMatches(htRule, htEGraph, partialMatch).iterator().next();
			cont srcMatch = (cont) match.getNodeTarget(edge.getSource());
			EObject trgMatch = match.getNodeTarget(edge.getTarget());
			int theIndex = srcMatch.getContainsNode().indexOf(trgMatch);
			Assert.assertTrue("Unexpected target node matched (edge index is " + theIndex + 
					" but should be " + index, theIndex==index);
		} else {
			Rules.assertRuleHasNoMatch(htRule, htEGraph, partialMatch, htEngine);
		}
	}
	
	@Test
	public void testConstantEdgeIndexMatch() {
		
		// If we do not specify the edge index, we should get all matches:
		edge.setIndex(null);
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, nodeCount);

		// Test constant edge indices (also with negative constants):
		for (int i=0; i<nodeCount; i++) {
			checkEdgeIndex(edge, ""+i, i, null);
			checkEdgeIndex(edge, ""+(i*13) + "/13", i, null);
			checkEdgeIndex(edge, ""+(-i-1), nodeCount-i-1, null);
		}
		
		// Test out of range indices:
		checkEdgeIndex(edge, ""+nodeCount, -1, null);
		checkEdgeIndex(edge, ""+(-nodeCount-1), -1, null);
		
	}

	@Test
	public void testSetParamEdgeIndexMatch() {
		
		// If we do not specify the edge index, we should get all matches:
		edge.setIndex(param.getName());

		// Test constant edge indices (also with negative constants):
		Match partialMatch = new MatchImpl(htRule);
		for (int i=0; i<nodeCount; i++) {
			partialMatch.setParameterValue(param, i);
			checkEdgeIndex(edge, param.getName(), i, partialMatch);
		}
		
	}

	@Test
	public void testGetParamEdgeIndexMatch() {
		
		// If we do not specify the edge index, we should get all matches:
		edge.setIndex(param.getName());

		// Test constant edge indices (also with negative constants):
		List<Match> matches = InterpreterUtil.findAllMatches(htEngine, htRule, htEGraph, null);
		Assert.assertTrue(matches.size()==nodeCount);
		
		// Check whether the calculated indices are correct:
		for (Match match : matches) {
			int paramIndex = (Integer) match.getParameterValue(param);
			cont srcMatch = (cont) match.getNodeTarget(edge.getSource());
			EObject trgMatch = match.getNodeTarget(edge.getTarget());
			Assert.assertTrue(paramIndex==srcMatch.getContainsNode().indexOf(trgMatch));
		}
		
	}

	@Test
	public void testChangeConstantEdgeIndex() {
		for (int i=0; i<nodeCount; i++) {
			int j = nodeCount-i-1;
			edge.setIndex(""+i);
			htRule.getMappings().getImage(edge, htRule.getRhs()).setIndex(""+j);
			Match match = htEngine.findMatches(htRule, htEGraph, null).iterator().next();
			cont srcMatch = (cont) match.getNodeTarget(edge.getSource());
			EObject iTarget = srcMatch.getContainsNode().get(i);
			RuleApplication app = new RuleApplicationImpl(htEngine, htEGraph, htRule, match);
			app.setCompleteMatch(match);
			app.execute(null);
			assertIndexIs(srcMatch.getContainsNode(), iTarget, j);
			app.undo(null);
			assertIndexIs(srcMatch.getContainsNode(), iTarget, i);
		}
	}

	private void assertIndexIs(List<?> list, Object obj, int index) {
		int realIndex = list.indexOf(obj);
		if (index!=realIndex) {
			throw new AssertionError("Expected object at index " + index + " but it is at " + realIndex);
		}
	}

}