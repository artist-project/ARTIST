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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Matches;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.eclipse.emf.henshin.tests.framework.Tools;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests several engine options.
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 */
public class EngineOptionsTest extends HenshinTest {
	
	@Before
	public void setUp() throws Exception {
		init("basic/rules/engineOptionsTests.henshin");
		setEGraphPath("basic/models/engineOptionsTestsModels/", "testmodel");
	}
	
	@Test
	public void testNonInjective1() {
		/**
		 * graph:
		 * 
		 *      n1
		 *     /
		 *   n2
		 */
		loadEGraph("nonInjective1");
		
		Collection<EObject> objGroup = new ArrayList<EObject>();
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n1'", htEGraph));
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph));
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph));
		
		loadRule("non-injectiveMatching");
		// Rule should have no match, as we're looking for a Node with
		// two child nodes, but the graph contains just a Node with one child node.
		Rules.assertRuleHasNoMatch(htRule, htEGraph, null, htEngine);
		
		htEngine.getOptions().put(Engine.OPTION_INJECTIVE_MATCHING, false);
		loadRule("non-injectiveMatching");
		// Rule should have exactly 1 match.
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 1); 
		// This match should contain n1, n2, n2
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, objGroup);
	}
	
	@Test
	public void testNonInjective2() {
		/**
		 * graph:
		 * 
		 *       n1
		 *      /  \
		 *    n2   n3
		 */
		loadEGraph("nonInjective2");
		
		Collection<EObject> objGroup = new ArrayList<EObject>();
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n1'", htEGraph));
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph));
		objGroup.add(Tools.getFirstOCLResult("self.nodename='n3'", htEGraph));
		
		loadRule("non-injectiveMatching");
		
		// assert Rule is correct for injective matching
		
		// expected matches: n1 <-> (n2, n3) ; n1 <-> (n3, n2)
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 2);
		Matches.assertOnlyGroupIsMatched(htRule, htEGraph, null, htEngine, objGroup);
		
		// turn off injective matching and try again
		
		Collection<EObject> ninjObjGroup1 = new ArrayList<EObject>();
		ninjObjGroup1.add(Tools.getFirstOCLResult("self.nodename='n1'", htEGraph));
		ninjObjGroup1.add(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph));
		ninjObjGroup1.add(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph));
		
		Collection<EObject> ninjObjGroup2 = new ArrayList<EObject>();
		ninjObjGroup2.add(Tools.getFirstOCLResult("self.nodename='n1'", htEGraph));
		ninjObjGroup2.add(Tools.getFirstOCLResult("self.nodename='n3'", htEGraph));
		ninjObjGroup2.add(Tools.getFirstOCLResult("self.nodename='n3'", htEGraph));
		
		htEngine.getOptions().put(Engine.OPTION_INJECTIVE_MATCHING, Boolean.FALSE);
		loadRule("non-injectiveMatching");
		
		// expected matches: n1 <-> (n2, n3) ; n1 <-> (n3, n2) ; n1 <-> (n2, n2) ; n1 <-> (n3, n3)
		Rules.assertRuleHasNMatches(htRule, htEGraph, null, htEngine, 4);
		
		for (Match ma : htEngine.findMatches(htRule, htEGraph, null)) {
			if (ma.getNodeTargets().contains(Tools.getFirstOCLResult("self.nodename='n2'", htEGraph))) {
				if (ma.getNodeTargets().contains(Tools.getFirstOCLResult("self.nodename='n3'", htEGraph))) {
					Matches.assertMatchIsGroup(ma, objGroup);
				} else {
					Matches.assertMatchIsGroup(ma, ninjObjGroup1);
				}
			} else {
				Matches.assertMatchIsGroup(ma, ninjObjGroup2);
			}
		}
		
	}
	
}