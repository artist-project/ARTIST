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

import eu.artist.postmigration.nfrvt.lang.gel.eval.VerdictConverter;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;

public class GoalExpressionEvaluator extends ExpressionEvaluator {

	private GoalModelEvaluator goalModelEvaluator;
	
	public GoalExpressionEvaluator(GoalModelEvaluator goalModelEvaluator, EvaluationSettings settings) {
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
	public ValueExpressionEvaluation evaluate(BooleanUnit e) {
		ValueExpressionEvaluation evaluation = null;
		if(e instanceof GoalReference)
			evaluation = evaluate((GoalReference)e);
		
		if(evaluation != null)
			return evaluation;
		return super.evaluate(e);
	}

	public BooleanExpressionEvaluation evaluate(GoalReference reference) {
		BooleanExpressionEvaluation evaluation = newBooleanExpressionEvaluation();
		GoalEvaluation goalEvaluation = getGoalModelEvaluator().getGoalEvaluation(reference.getValue());
		
		Boolean result = VerdictConverter.toBoolean(goalEvaluation.getVerdict());
		evaluation.setResult(ValueUtil.createBooleanLiteralOrNull(result));
		evaluation.setReason("$" + reference.getValue().getName() + " is " + goalEvaluation.getVerdict());
		
		getGoalModelEvaluator().removeTopLevelGoal(reference.getValue());
		
		return evaluation;
	}
	
}
