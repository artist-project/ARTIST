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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Matches;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.eclipse.emf.henshin.tests.framework.Tools;
import org.eclipse.emf.henshin.tests.testmodel.Node;
import org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage;
import org.eclipse.emf.henshin.tests.testmodel.Val;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test aspects of matching.
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 */
public class MatchTest extends HenshinTest {

	@Before
	public void setUp() throws Exception {
		init("basic/rules/basicMatchingTests.henshin");
		setEGraphPath("basic/models/matchTestsModels/", "testmodel");
	}

	@Test
	public void testACMatchNoNodes() {
		// Test if no nodes are matched when using a NAC containing the Node to
		// be matched in the Rule (match (Node) and (NOT Node))
		loadEGraph("manyNodes");
		loadRule("acMatchNoNode");
		Rules.assertRuleHasNoMatch(htRule, htEGraph, null, htEngine);
	}

	@Test
	public void testMatchAllNodes() {
		// Test if all Nodes are matched. First, get all Nodes via OCL, then
		// check if they are contained in the match produced by the Rule 'matchAllNodes'
		loadEGraph("manyNodes");
		loadRule("matchAllNodes");

		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 32);

		Collection<? extends EObject> nodesInGraph = Tools.getOCLQueryResults("self.oclIsKindOf(Node)", htEGraph);

		Matches.assertGroupIsMatched(htRule, htEGraph, null, htEngine, nodesInGraph);
	}

	@Test
	public void testACMatchAllNodes() {
		// Test if all Nodes are matched when using a PAC containing the Node to
		// be matched in the Rule (match (Node) and (Node))
		loadEGraph("manyNodes");
		loadRule("acMatchAllNodes");
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 32);
		Collection<? extends EObject> nodesInGraph = Tools.getOCLQueryResults("self.oclIsKindOf(Node)", htEGraph);
		Matches.assertGroupIsMatched(htRule, htEGraph, null, htEngine, nodesInGraph);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testMatchNodesWithVals() {
		// Test matching Nodes with unidirectional edges to Vals
		loadEGraph("nodesAndVals");
		loadRule("matchNodesAndVals");

		Collection<Node> foundNodes = (Collection<Node>) Tools.getOCLQueryResults("self.nodename = 'v1'", htEGraph);
		foundNodes.add((Node) Tools.getFirstOCLResult("self.nodename = 'v2'", htEGraph));
		foundNodes.add((Node) Tools.getFirstOCLResult("self.nodename = 'v3'", htEGraph));
		Collection<Val> foundVals = (Collection<Val>) Tools.getOCLQueryResults("self.oclIsKindOf(Val)", htEGraph);

		Collection<EObject> matchContents = new ArrayList<EObject>();
		matchContents.addAll(foundNodes);
		matchContents.addAll(foundVals);

		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, matchContents);
	}

	@Test
	public void testEmptyRule() {
		// Test matching the empty Rule (there should be exactly one match, but this match should be empty)
		loadEGraph("nodesAndVals");
		loadRule("emptyRule");
		// There should be exactly 1 match
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 1);
		// Match should be empty
		Matches.assertNoObjectFromGroupContainedInAnyMatch(htRule, htEGraph, null, htEngine, htEGraph);
	}

	@Test
	public void testOnlyNAC() {
		/**
		 * test if Rules with only a NAC are matched correctly (there should be no match)
		 */
		loadEGraph("nodesAndVals");
		loadRule("onlyNAC");
		Rules.assertRuleHasNoMatch(htRule, htEGraph, null, htEngine); // there should be no match
	}

	@Test
	public void testOnlyPAC() {
		// Test if Rules with only a PAC are matched correctly (if the PAC can be matched, there should be exactly one
		// match, but this match should be empty)
		loadEGraph("nodesAndVals");
		loadRule("onlyPAC");
		// there should be exactly 1 match
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 1);
		// match should be empty
		Matches.assertNoObjectFromGroupContainedInAnyMatch(htRule, htEGraph, null, htEngine, htEGraph);
	}

	@Test
	public void testNestedPacPac() {
		/**
		 * test if nested Application Conditions work as expected. Tests a PAC nested inside a PAC
		 * 
		 */
		loadEGraph("nestedACTests");
		loadRule("nestedAC_pac-pac");
		// matches Nodes with a parent that has a Vals-reference
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		// parent is t_1, which has a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_11'", htEGraph));
		// parent is t_1, which has a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_12'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testNestedPacNac() {
		// Tests a NAC tested inside a PAC
		loadEGraph("nestedACTests");
		// matches Nodes with a parent that doesn't have a Vals-reference
		loadRule("nestedAC_pac-nac");
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		// parent is top, which doesn't have a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_1'", htEGraph));
		// parent is t_11, which doesn't have a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_111'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testNestedNacPac() {
		// Tests a PAC nested inside a NAC
		loadEGraph("nestedACTests");
		loadRule("nestedAC_nac-pac");
		// matches Nodes without (a parent that has a Vals-reference)
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 'unconnected'", htEGraph)); // no parent
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 'top'", htEGraph)); // no parent
		// parent is top, and top doesn't have a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_1'", htEGraph));
		// parent is t_11, and t_11 doesn't have a vals reference
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_111'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testNestedNacNac() {
		// Tests a NAC nested inside a NAC
		loadEGraph("nestedACTests");
		loadRule("nestedAC_nac-nac");
		// matches Nodes without (a parent that (doesn't have a Vals-reference))
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 'unconnected'", htEGraph)); // no parent
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 'top'", htEGraph)); // no parent
		// no parent which doesn't have a vals reference (parent is t1, and t1 has a vals reference)
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_11'", htEGraph));
		// no parent which doesn't have a vals reference (parent is t1, and t1 has a vals reference)
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename = 't_12'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testAndNestedCondition() {
		loadEGraph("nestedACTests");
		loadRule("andNestedCondition");
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='t_1'", htEGraph));
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='t_11'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testOrNestedCondition() {
		loadEGraph("nestedACTests");
		loadRule("orNestedCondition");
		Collection<? extends EObject> anticipatedMatches = Tools.getOCLQueryResults("self.oclIsKindOf(Node)", htEGraph);
		anticipatedMatches.remove((Node) Tools.getFirstOCLResult("self.nodename='unconnected'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testNotNestedCondition() {
		loadEGraph("nestedACTests");
		loadRule("notNestedCondition");
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='unconnected'", htEGraph));
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='top'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void testNestedConditionMultipleMappings() {
		// Tests multiple mappings in nested conditions Will find a parent Node nd1 which has a Val and a child Node (of
		// nd1) nd2 which doesn't have a Val i.e. t_11 and t_1
		loadEGraph("nestedACTests");
		loadRule("nestedCondition_multipleMappings");
		Collection<Node> anticipatedMatches = new ArrayList<Node>();
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='t_11'", htEGraph));
		anticipatedMatches.add((Node) Tools.getFirstOCLResult("self.nodename='t_1'", htEGraph));
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, anticipatedMatches);
	}

	@Test
	public void intListConstTest() {
		loadEGraph("intList");
		loadRule("intListConstTest");
		Rules.assertRuleCanBeApplied(htRuleApp);
		Val val = (Val) htEGraph.getDomain(TestmodelPackage.eINSTANCE.getVal(), true).get(0);
		EList<Integer> result = new BasicEList<Integer>();
		result.add(1);
		result.add(2);
		result.add(3);
		result.add(4);
		Assert.assertEquals("Unexpected integer list result: " + val.getIntlist(), val.getIntlist(), result);
	}

	@Test
	public void intListVarTest() {
		loadEGraph("intList");
		loadRule("intListVarTest");
		Rules.assertRuleCanBeApplied(htRuleApp);
		Val val = (Val) htEGraph.getDomain(TestmodelPackage.eINSTANCE.getVal(), true).get(0);
		EList<Integer> result = new BasicEList<Integer>();
		result.add(1);
		result.add(2);
		result.add(3);
		result.add(4);
		Assert.assertEquals("Unexpected integer list result: " + val.getIntlist(), result, val.getIntlist());
	}

}