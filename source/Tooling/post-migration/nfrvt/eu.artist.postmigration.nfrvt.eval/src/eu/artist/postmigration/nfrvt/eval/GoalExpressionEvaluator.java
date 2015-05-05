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

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.gel.eval.VerdictConverter;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;

/**
 * An evaluator for goal expressions.
 * 
 * @author Martin Fleck
 *
 */
public class GoalExpressionEvaluator extends ExpressionEvaluator {

	private GoalModelEvaluator goalModelEvaluator;
	
	/**
	 * An evaluator for goal expressions. The given settings specify how 
	 * numeric evaluations should be handled, e.g., their precision and 
	 * their rounding mode.
	 * 
	 * @param goalModelEvaluator goal model evaluator for setting top level
	 * goals
	 * @param settings settings used for the evaluation
	 */
	public GoalExpressionEvaluator(GoalModelEvaluator goalModelEvaluator, EvaluationSettings settings) {
		super(settings);
		this.setGoalModelEvaluator(goalModelEvaluator);
	}

	/**
	 * Returns the goal model evaluator used.
	 * 
	 * @return used goal model evaluator
	 */
	public GoalModelEvaluator getGoalModelEvaluator() {
		return goalModelEvaluator;
	}

	/**
	 * Sets the goal model evaluator, for which the top level goals should be
	 * set.
	 * 
	 * @param goalModelEvaluator goal model evaluator
	 */
	protected void setGoalModelEvaluator(GoalModelEvaluator goalModelEvaluator) {
		this.goalModelEvaluator = goalModelEvaluator;
	}

	/**
	 * Evaluates the goal reference by checking the value of the referenced 
	 * goal.
	 * 
	 * @param reference goal reference
	 * @return evaluation result
	 */
	public BooleanExpressionEvaluation evaluate(GoalReference reference) {
		GoalEvaluation goalEvaluation = getGoalModelEvaluator().getGoalEvaluation(reference.getValue());
		Boolean result = VerdictConverter.toBoolean(goalEvaluation.getVerdict());
		getGoalModelEvaluator().removeTopLevelGoal(reference.getValue());
		
		return MigrationFactory.createBooleanExpressionEvaluation(
				result,
				"$" + reference.getValue().getName() + " is " + goalEvaluation.getVerdict());
	}
}
