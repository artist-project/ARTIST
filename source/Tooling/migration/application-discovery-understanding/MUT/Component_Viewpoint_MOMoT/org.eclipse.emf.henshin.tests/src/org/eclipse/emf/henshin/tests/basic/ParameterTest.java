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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.henshin.tests.framework.Graphs;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Matches;
import org.eclipse.emf.henshin.tests.framework.Parameters;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.eclipse.emf.henshin.tests.framework.Tools;
import org.eclipse.emf.henshin.tests.framework.Units;
import org.eclipse.emf.henshin.tests.testmodel.Node;
import org.eclipse.emf.henshin.tests.testmodel.Val;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests handling of parameters.
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 *
 */
public class ParameterTest extends HenshinTest {

	@Before
	public void setUp() throws Exception {
		init("basic/rules/parameterTests.henshin");
		setEGraphPath("basic/models/parameterTestsModels/", "testmodel");
	}

	@Test
	public void testParameterName() {
		// Tests if passing a parameter and using it as an attribute in the LHS works
		loadEGraph("paramTest");
		Node nd1 = (Node) Tools.getFirstOCLResult("self.nodename = 'nd1'", htEGraph);
		Node nd2 = (Node) Tools.getFirstOCLResult("self.nodename = 'nd2'", htEGraph);
		loadRule("parameterAttribute", "param_Nodename", "nd1");

		Rules.assertRuleCanBeApplied(htRuleApp);
		Graphs.assertObjectNotInGraph(nd1, htEGraph); // assert that nd1 has been removed
		Graphs.assertObjectInGraph(nd2, htEGraph); // assert that nd2 is still there
	}

	@Test
	public void testParameterObject() {
		// Tests if passing a parameter and using it as an object in the LHS works
		loadEGraph("paramTest");
		Node nd1 = (Node) Tools.getFirstOCLResult("self.nodename = 'nd1'", htEGraph);
		Node nd2 = (Node) Tools.getFirstOCLResult("self.nodename = 'nd2'", htEGraph);
		loadRule("parameterObject", "param_nd", nd1); // pass the Node directly

		Rules.assertRuleCanBeApplied(htRuleApp);
		Graphs.assertObjectNotInGraph(nd1, htEGraph);
		Graphs.assertObjectInGraph(nd2, htEGraph);
	}

	@Test
	public void testParameterInOut1() {
		// Input attribute name, output Node
		loadEGraph("paramTest");
		Node nd1 = (Node) Tools.getFirstOCLResult("self.nodename='nd1'", htEGraph);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("param_ndname", "nd1");
		loadRule("parameterInOut", params);

		Rules.assertRuleCanBeApplied(htRuleApp);
		Tools.printParameterMappings(htRuleApp);
		Parameters.assertParameterMappingEquals(htRuleApp.getResultMatch(), "param_node", nd1);

	}

	@Test
	public void testParameterInOut2() {
		// Input Node, output attribute name
		loadEGraph("paramTest");
		loadRule("parameterInOut");

		Node nd1 = (Node) Tools.getFirstOCLResult("self.nodename='nd1'", htEGraph);

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("param_node", nd1);

		loadRule("parameterInOut", params);
		Rules.assertRuleCanBeApplied(htRuleApp);
		Tools.printParameterMappings(htRuleApp);

		Parameters.assertParameterMappingEquals(htRuleApp.getCompleteMatch(), "param_ndname", "nd1");
		Parameters.assertParameterMappingEquals(htRuleApp.getResultMatch(), "param_ndname", "nd1");
	}

	@Test
	public void testParameterInOut3() {
		// Input nothing, output attribute name and node
		loadEGraph("paramTest");
		loadRule("parameterInOut");

		Rules.assertRuleCanBeApplied(htRuleApp);

		String paramNdname = (String) htRuleApp.getResultParameterValue("param_ndname");
		Node matchedNode = (Node) Tools.getFirstOCLResult("self.nodename='" + paramNdname + "'", htEGraph);

		Tools.printParameterMappings(htRuleApp);

		Parameters.assertParameterMappingEquals(htRuleApp.getResultMatch(), "param_node", matchedNode);
		Parameters.assertParameterMappingEquals(htRuleApp.getResultMatch(), "param_ndname", matchedNode.getNodename());

	}

	@Test
	public void testParameterTu() {
		// Tests if parameters are correctly handled in transformation units
		loadEGraph("paramTest");
		loadUnit("parameterUnit", "tu_param_in", "nd1");
		Node matchedNode = (Node) Tools.getFirstOCLResult("self.nodename='nd1'", htEGraph);

		Units.assertTuCanBeExecuted(htUnitApp);
		Graphs.assertObjectNotInGraph(matchedNode, htEGraph);
	}

	@Test
	public void testParameterComposition2() {
		loadEGraph("paramTest");
		loadRule("parameterComposition2");
		Val vl = (Val) Tools.getFirstOCLResult("self.valname='vl1'", htEGraph);
		htRuleApp.setParameterValue("vl", vl);
		htRuleApp.setParameterValue("p1", 20);
		htRuleApp.setParameterValue("p2", 30);
		Rules.assertRuleCanBeApplied(htRuleApp);

		double compositionResult = Double.valueOf(vl.getValname());
		Assert.assertEquals(50.0, compositionResult, 0.001);
	}

	@Test
	public void testParameterComposition3() {
		loadEGraph("paramTest");
		loadRule("parameterComposition2");
		Val vl = (Val) Tools.getFirstOCLResult("self.valname='vl1'", htEGraph);
		htRuleApp.setParameterValue("vl", vl);
		htRuleApp.setParameterValue("p1", "20");
		htRuleApp.setParameterValue("p2", "30");
		Rules.assertRuleCanBeApplied(htRuleApp);
		Assert.assertEquals("2030", vl.getValname());
	}

	@Test
	public void testParameterComposition1() {
		loadEGraph("paramTest");
		loadRule("parameterComposition1");
		Val vl = (Val) Tools.getFirstOCLResult("self.valname='vl1'", htEGraph);
		htRuleApp.setParameterValue("vl", vl);
		htRuleApp.setParameterValue("p1", 20);
		htRuleApp.setParameterValue("p2", 30);
		Rules.assertRuleCanBeApplied(htRuleApp);
		Assert.assertEquals(50, vl.getIntvl());
	}

	@Test
	public void testEmptyRuleWithAttributeCondition() {
		loadEGraph("paramTest");
		loadRule("emptyRuleWithAttribCond");
		htRuleApp.setParameterValue("p1", 10);
		htRuleApp.setParameterValue("p2", 20);
		htRuleApp.setParameterValue("p3", 30);
		Rules.assertRuleCanBeApplied(htRuleApp);
		Tools.printParameterMappings(htRuleApp);
	}

	@Test
	public void testParameterInNestedCondition1() {
		// Tests a parameter in a nested condition (PAC). If the test succeeds, one Node should be matched
		loadEGraph("paramTest");
		loadRule("parameterInNestedCondition1");
		htRuleApp.setParameterValue("p1", "ndVal");

		Node ndVal = (Node) Tools.getFirstOCLResult("self.nodename='ndVal'", htEGraph);
		Matches.assertObjectContainedInAllMatches(htRule, htEGraph, htRuleApp.getPartialMatch(), htEngine, ndVal);
	}

	@Test
	public void testParameterInNestedCondition2() {
		// Tests a parameter in a nested condition (NAC). If the test succeeds, nd1 and nd2 should be matched
		loadEGraph("paramTest");
		loadRule("parameterInNestedCondition2");

		htRuleApp.setParameterValue("p1", "ndVal");

		Node ndVal = (Node) Tools.getFirstOCLResult("self.nodename='ndVal'", htEGraph);

		Matches.assertObjectContainedInNoMatch(htRule, htEGraph, htRuleApp.getPartialMatch(), htEngine, ndVal);

		Node nd1 = (Node) Tools.getFirstOCLResult("self.nodename='nd1'", htEGraph);
		Node nd2 = (Node) Tools.getFirstOCLResult("self.nodename='nd2'", htEGraph);

		Matches.assertObjectContainedInAtLeastOneMatch(htRule, htEGraph, htRuleApp.getPartialMatch(), htEngine, nd1);
		Matches.assertObjectContainedInAtLeastOneMatch(htRule, htEGraph, htRuleApp.getPartialMatch(), htEngine, nd2);

	}

	@Test
	public void testParameterWithImports() {
		loadEGraph("paramTest");
		loadRule("parameterWithImports");
		Rules.assertRuleCanBeApplied(htRuleApp);
	}

}