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
import org.eclipse.emf.henshin.tests.framework.Units;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests execution of units.
 * 
 * @author Felix Rieger
 * @author Stefan Jurack
 * @author Christian Krause
 *
 */
public class UnitTest extends HenshinTest {

	@Before
	public void setUp() throws Exception {
		init("basic/rules/unitTests.henshin");
		setEGraphPath("basic/models/unitTestsModels/", "testmodel");
	}

	@Test
	public void testAmalgamationUnitAttributeInKernelRuleNac() {
		loadEGraph("graphBefore_amu_attributeInKernelNac");
		loadUnit("loop_amu_attributeInKernelNac");
		Units.assertTuCanBeExecuted(htUnitApp);
	}

	@Test
	public void testEmptyIndependentUnit() {
		loadEGraph("graphBefore_countedUnit");
		loadUnit("emptyIndependentUnit");
		Units.assertTuCanNotBeExecuted(htUnitApp);
	}

	@Test
	public void testEmptyPriorityUnit() {
		loadEGraph("graphBefore_countedUnit");
		loadUnit("emptyPriorityUnit");
		Units.assertTuCanNotBeExecuted(htUnitApp);
	}

}