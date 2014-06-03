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

import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;

public class VerdictConverter {
	public static Verdict toVerdict(Boolean bool) {
		if(bool == null)
			return Verdict.INCONCLUSIVE;
		if(bool)
			return Verdict.PASS;
		return Verdict.FAIL;
	}
	
	public static Boolean toBoolean(Verdict verdict) {
		if(verdict == Verdict.INCONCLUSIVE)
			return null;
		if(verdict == Verdict.PASS)
			return true;
		return false;
	}
}
