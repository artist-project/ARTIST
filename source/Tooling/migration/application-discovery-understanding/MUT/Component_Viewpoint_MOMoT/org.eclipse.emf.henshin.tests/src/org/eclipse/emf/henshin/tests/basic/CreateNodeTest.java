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

import org.eclipse.emf.henshin.tests.framework.HenshinTest;
import org.eclipse.emf.henshin.tests.framework.Rules;
import org.eclipse.emf.henshin.tests.framework.Tools;
import org.eclipse.emf.henshin.tests.testmodel.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests creating nodes.
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 * 
 */
public class CreateNodeTest extends HenshinTest {

	@Before
	public void setUp() throws Exception {
		init("basic/rules/basicTests.henshin");
		setEGraphPath("basic/models/createNodesModels/", "testmodel");
		loadEGraph("graphWithOneNode");
	}

	@Test
	public void testCreateRootNode() {
		createEGraph();
		loadRule("createRootNode");
		Rules.assertRuleCanBeApplied(htRuleApp);
		Node createdRootNode = (Node) Tools.getGraphRoot(htEGraph);
		Assert.assertNotNull(createdRootNode);
	}

}
