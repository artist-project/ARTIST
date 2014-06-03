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
package eu.artist.postmigration.nfrvt.lang.gml.validation;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;

public class CompositeGoalValidator extends ExpressionValidator {

	public CompositeGoalValidator() {
		setFeature(GmlPackage.Literals.COMPOSITE_GOAL__CONDITION);
	}
	
	@Override
	public ValueSpecification evaluate(BooleanUnit e) {
		ValueSpecification evaluation = null;
		if(e instanceof GoalReference)
			evaluation = evaluate((GoalReference)e);
		
		if(evaluation != null)
			return evaluation;
		return super.evaluate(e);
	}

	public ValueSpecification evaluate(GoalReference reference) {
		return null;
	}
	
}
