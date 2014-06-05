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

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage;

public class HardGoalValidator extends ExpressionValidator {
	
	public HardGoalValidator() {
		setFeature(GmlPackage.Literals.HARD_GOAL__CONDITION);
	}
	
	@Override
	public NumberLiteral evaluate(NumberExpression e) {
		NumberLiteral evaluation = null;
		if(e instanceof AppliedQuantitativePropertyExpression)
			evaluation = evaluate((AppliedQuantitativePropertyExpression)e);
		
		if(evaluation != null)
			return evaluation;
		return super.evaluate(e);
	}
	
	public NumberLiteral evaluate(AppliedQuantitativePropertyExpression reference) {
		return null;
	}
}
