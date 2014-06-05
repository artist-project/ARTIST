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
package eu.artist.postmigration.nfrvt.eval;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;

public class HardGoalConditionEvaluator extends ExpressionEvaluator {

	private GoalModelEvaluator goalModelEvaluator;
	
	public HardGoalConditionEvaluator(GoalModelEvaluator goalModelEvaluator, EvaluationSettings settings) {
		super(settings);
		this.setGoalModelEvaluator(goalModelEvaluator);
	}

	public GoalModelEvaluator getGoalModelEvaluator() {
		return goalModelEvaluator;
	}

	public void setGoalModelEvaluator(GoalModelEvaluator goalModelEvaluator) {
		this.goalModelEvaluator = goalModelEvaluator;
	}
	
	@Override
	public ValueExpressionEvaluation evaluate(NumberExpression e) {
		ValueExpressionEvaluation evaluation = null;
		if(e instanceof AppliedQuantitativePropertyExpression)
			evaluation = evaluate((AppliedQuantitativePropertyExpression)e);
		
		if(evaluation != null)
			return evaluation;
		return super.evaluate(e);
	}
	
	public ValueExpressionEvaluation evaluate(AppliedQuantitativePropertyExpression reference) {		
		AppliedPropertyEvaluation propertyEvaluation = getGoalModelEvaluator().getAppliedPropertyEvaluation(reference.getValue());
		if(propertyEvaluation == null) {
			NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
			evaluation.setResult(null);
			evaluation.setReason("[" + renderer.render(reference.getValue()) + "] has no value assigned.");
			return evaluation;
		}
		
		ValueSpecification value = propertyEvaluation.getValue();
		if(ValueUtil.isBoolean(value)) {
			BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
			evaluation.setResult(ValueUtil.createBooleanLiteral(ValueUtil.assertBoolean(value)));
			evaluation.setReason("$" + reference.getValue().getName() + " as evaluated.");
			return evaluation;
		}
		else if(ValueUtil.isNumber(value)) {
			NumberExpressionEvaluation evaluation = newNumberExpressionEvaluation();
			evaluation.setResult(ValueUtil.createNumberLiteral(ValueUtil.assertNumber(value)));
			evaluation.setReason("$" + reference.getValue().getName() + " as evaluated.");
			return evaluation;
		}
		
		ValueSpecificationExpressionEvaluation evaluation = newValueSpecificationExpressionEvaluation();
		evaluation.setResult(ValueUtil.copy(value));
		evaluation.setReason("$" + reference.getValue().getName() + " as evaluated.");
		
		return evaluation;
	}
}
