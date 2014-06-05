/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.common.eval.logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ThreeValueLogicTest {
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | U | F |
	 *   U | U | U | F |
	 *   F | F | F | F |
	 */
	@Test
	public void TestBooleanAnd() {
		assertFalse(BooleanLogic.and(true, false));
		assertNull(BooleanLogic.and(true, null));
		assertTrue(BooleanLogic.and(true, true));
		assertFalse(BooleanLogic.and(false, false));
		assertFalse(BooleanLogic.and(false, null));
		assertFalse(BooleanLogic.and(false, true));
		assertFalse(BooleanLogic.and(null, false));
		assertNull(BooleanLogic.and(null, null));
		assertNull(BooleanLogic.and(null, true));
	}
	
	@Test
	public void TestBooleanOr() {
		assertTrue(BooleanLogic.or(true, false));
		assertTrue(BooleanLogic.or(true, null));
		assertTrue(BooleanLogic.or(true, true));
		assertFalse(BooleanLogic.or(false, false));
		assertNull(BooleanLogic.or(false, null));
		assertTrue(BooleanLogic.or(false, true));
		assertNull(BooleanLogic.or(null, false));
		assertNull(BooleanLogic.or(null, null));
		assertTrue(BooleanLogic.or(null, true));
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | F | U | T |
	 *   U | U | U | U |
	 *   F | T | U | F |
	 */
	@Test
	public void TestBooleanXOr() {
		assertTrue(BooleanLogic.xor(true, false));
		assertNull(BooleanLogic.xor(true, null));
		assertFalse(BooleanLogic.xor(true, true));
		assertFalse(BooleanLogic.xor(false, false));
		assertNull(BooleanLogic.xor(false, null));
		assertTrue(BooleanLogic.xor(false, true));
		assertNull(BooleanLogic.xor(null, false));
		assertNull(BooleanLogic.xor(null, null));
		assertNull(BooleanLogic.xor(null, true));
	}
	
	@Test
	public void TestBooleanNot() {
		assertNull(BooleanLogic.not(null));
		assertTrue(BooleanLogic.not(false));
		assertFalse(BooleanLogic.not(true));
	}
	
	@Test
	public void TestBooleanImplies() {
		assertFalse(BooleanLogic.implies(true, false));
		assertNull(BooleanLogic.implies(true, null));
		assertTrue(BooleanLogic.implies(true, true));
		assertTrue(BooleanLogic.implies(false, false));
		assertTrue(BooleanLogic.implies(false, null));
		assertTrue(BooleanLogic.implies(false, true));
		assertNull(BooleanLogic.implies(null, false));
		assertNull(BooleanLogic.implies(null, null));
		assertTrue(BooleanLogic.implies(null, true));
	}
	
	/***
	 * 
	 *  ___|_T_|_U_|_F_|
	 *   T | T | U | F |
	 *   U | U | T | U |
	 *   F | F | U | T |
	 */
	@Test
	public void TestBooleanEquals() {
		assertFalse(BooleanLogic.equals(true, false));
		assertNull(BooleanLogic.equals(true, null));
		assertTrue(BooleanLogic.equals(true, true));
		assertTrue(BooleanLogic.equals(false, false));
		assertNull(BooleanLogic.equals(false, null));
		assertFalse(BooleanLogic.equals(false, true));
		assertNull(BooleanLogic.equals(null, false));
		assertTrue(BooleanLogic.equals(null, null));
		assertNull(BooleanLogic.equals(null, true));
	}
	
	@Test
	public void TestBooleanUnEquals() {
		assertTrue(BooleanLogic.unequals(true, false));
		assertNull(BooleanLogic.unequals(true, null));
		assertFalse(BooleanLogic.unequals(true, true));
		assertFalse(BooleanLogic.unequals(false, false));
		assertNull(BooleanLogic.unequals(false, null));
		assertTrue(BooleanLogic.unequals(false, true));
		assertNull(BooleanLogic.unequals(null, false));
		assertFalse(BooleanLogic.unequals(null, null));
		assertNull(BooleanLogic.unequals(null, true));
	}
}
