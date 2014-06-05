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
package eu.artist.postmigration.nfrvt.lang.gel.eval;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

public class VerdictConverterTest {
	@Test
	public void TestBooleanToVerdict() {
		assertEquals(Verdict.FAIL, VerdictConverter.toVerdict(false));
		assertEquals(Verdict.PASS, VerdictConverter.toVerdict(true));
		assertEquals(Verdict.INCONCLUSIVE, VerdictConverter.toVerdict(null));
	}
	
	@Test
	public void TestVerdictToBoolean() {
		assertFalse(VerdictConverter.toBoolean(Verdict.FAIL));
		assertTrue(VerdictConverter.toBoolean(Verdict.PASS));
		assertNull(VerdictConverter.toBoolean(Verdict.INCONCLUSIVE));
	}
}
