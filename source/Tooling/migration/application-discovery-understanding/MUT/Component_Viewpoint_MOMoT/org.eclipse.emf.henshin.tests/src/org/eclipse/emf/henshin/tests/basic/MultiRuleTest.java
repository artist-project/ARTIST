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

import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.junit.Before;
import org.junit.Test;

public class MultiRuleTest extends HenshinTest {

	@Before
	public void setUp() throws Exception {
		init("basic/rules/multiruleTests.henshin");
		setEGraphPath("basic/models/multiruleTestsModels/", "testmodel");
	}

	/**
	 * Test nested rules separately.
	 */
	@Test
	public void testSeparateMatch() {
		loadEGraph("nested2initial");

		loadRule("matchm-M-MM");
		Rule rule1 = htRule.getMultiRules().get(0);
		// will match (n1 ; n1-1) and (n1 ; n1-2)
		Rules.assertRuleHasNMatches(rule1, htEGraph, null, htEngine, 2);

		loadRule("matchm-M-MM");
		Rule rule2 = htRule.getMultiRules().get(0).getMultiRules().get(0);
		// will match (n1;n1-1;v1-1-1), (n1;n1-1;v1-1-2), (n1;n1-2;v1-2-1), (n1;n1-2;v1-2-2)
		Rules.assertRuleHasNMatches(rule2, htEGraph, null, htEngine, 4);
	}

	/**
	 * Tests the nested rules' forall-semantics.
	 * 
	 * If the outermost rule can be matched, the inner rules are matched with forall-semantics i.e. even if they can not
	 * be matched, this will count as a match.
	 */
	@Test
	public void testForallSemantics() {
		loadEGraph("nested2initial");
		loadRule("matchm-M-MM");
		// 3 matches: n1 (full match w/ all nested rules), n1-1 (no subrules matched), n1-2 (no subrules matched)
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 3);
	}

}
