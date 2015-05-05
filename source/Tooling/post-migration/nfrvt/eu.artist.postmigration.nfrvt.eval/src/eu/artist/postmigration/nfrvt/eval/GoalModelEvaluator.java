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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.eval.VerdictConverter;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;

/**
 * An evaluator for goal models. Goal models are evaluated by evaluating all
 * goals within the goal model and checking whether all top-level goals are
 * fulfilled. Top level goals are goals that are not used in the condition
 * of a composite goal.
 * 
 * @author Martin Fleck
 *
 */
public class GoalModelEvaluator {
	
	private static GELTextRenderer renderer = new GELTextRenderer();
	
	private Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations;
	private EvaluationSettings settings = new EvaluationSettings();
	private List<Goal> topLevelGoals = new ArrayList<>();
	private Map<Goal, GoalEvaluation> goalEvaluations = new HashMap<>();
	private GoalExpressionEvaluator goalExpressionEvaluator;
	private HardGoalConditionEvaluator hardGoalConditionEvaluator;
	
	/**
	 * An evaluator for goal models. Goal models are evaluated by evaluating all
	 * goals within the goal model and checking whether all top-level goals are
	 * fulfilled. Top level goals are goals that are not used in the condition
	 * of a composite goal.
	 *
	 * @param appliedPropertyEvaluations available property evaluations
	 * @param settings settings to be used for the evaluation
	 */
	public GoalModelEvaluator(Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations, EvaluationSettings settings) {
		this.appliedPropertyEvaluations = appliedPropertyEvaluations;
		this.goalExpressionEvaluator = new GoalExpressionEvaluator(this, settings);
		this.hardGoalConditionEvaluator = new HardGoalConditionEvaluator(this, settings);
		setSettings(settings);
	}
	
	/**
	 * The settings specify how numeric evaluations should be handled, e.g., 
	 * their precision and their rounding mode.
	 * 
	 * @param settings new settings
	 */
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
		this.goalExpressionEvaluator.setSettings(settings);
		this.hardGoalConditionEvaluator.setSettings(settings);
		renderer.setPrecision(settings.getPrecision());
	}
	
	/**
	 * Returns the current settings used for the evaluation.
	 * 
	 * @return current settings
	 */
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	/**
	 * Returns a map of all goals that have been evaluated so far together
	 * with their respective evaluation results.
	 * 
	 * @return map of all evaluated goals and their evaluation results
	 */
	public Map<Goal, GoalEvaluation> getGoalEvaluations() {
		return goalEvaluations;
	}
	
	/**
	 * Returns the evaluator used in composite goals.
	 * 
	 * @return composite goals expression evaluator
	 */
	protected GoalExpressionEvaluator getGoalExpressionEvaluator() {
		return goalExpressionEvaluator;
	}
	
	/**
	 * Returns the evaluator used for hard goal expressions.
	 * 
	 * @return hard goal expression evaluator
	 */
	protected HardGoalConditionEvaluator getHardGoalConditionEvaluator() {
		return hardGoalConditionEvaluator;
	}
	
	/**
	 * Adds a new goal evaluation result to this evaluation. Any old evaluation
	 * will be replaced.
	 * 
	 * @param goal goal that has been evaluated
	 * @param evaluation evaluation result
	 */
	public void addGoalEvaluation(Goal goal, GoalEvaluation evaluation) {
		this.goalEvaluations.put(goal, evaluation);
	}
	
	/**
	 * Returns the evaluation result for the given goal.
	 * 
	 * @param goal goal for which to retrieve the evaluation result
	 * @return evaluation result or null if no evaluation result is available 
	 * yet
	 */
	public GoalEvaluation getGoalEvaluation(Goal goal) {
		return this.goalEvaluations.get(goal);
	}
	
	/**
	 * Sets the list of top level goals of the goal model that is evaluated.
	 * 
	 * @param topLevelGoals list of top level goals
	 */
	protected void setTopLevelGoals(List<Goal> topLevelGoals) {
		this.topLevelGoals = new ArrayList<Goal>(topLevelGoals);
	}
	
	/**
	 * Remove the given goal from the list of top level goals.
	 * 
	 * @param goal goal that is not top level
	 */
	protected void removeTopLevelGoal(Goal goal) {
		topLevelGoals.remove(goal);
	}
	
	/**
	 * Returns all top level goals so far. Top level goals are goals that are 
	 * not used in the condition of a composite goal.
	 * 
	 * @return top level goals
	 */
	public List<Goal> getTopLevelGoals() {
		return topLevelGoals;
	}
	
	/**
	 * Returns a map of applied properties and their evaluations. This map may
	 * be empty.
	 * 
	 * @return applied properties and their evaluation results
	 */
	public Map<AppliedProperty, AppliedPropertyEvaluation> getAppliedPropertyEvaluations() {
		if(appliedPropertyEvaluations == null)
			return Collections.emptyMap();
		return appliedPropertyEvaluations;
	}
	
	/**
	 * Return the evaluation result for the given applied property.
	 * 
	 * @param property applied property
	 * @return evaluation of property or null if no evaluation is available
	 * so far
	 */
	public AppliedPropertyEvaluation getAppliedPropertyEvaluation(AppliedProperty property) {
		return getAppliedPropertyEvaluations().get(property);
	}
	
	/**
	 * Evaluates the given goal model.
	 * 
	 * @param goalModel model to be evaluated
	 * @return evaluation result
	 */
	public GoalModelEvaluation evaluate(GoalModel goalModel) {
		GoalModelEvaluation goalModelEvaluation = GelFactory.eINSTANCE.createGoalModelEvaluation();
		goalModelEvaluation.setGoalModel(goalModel);
		
		setTopLevelGoals(goalModel.getGoals());
		for(Goal goal : goalModel.getGoals())
			evaluate(goal);
		goalModelEvaluation.getEvaluations().addAll(getGoalEvaluations().values());
		
		Boolean booleanVerdict = true;
		String listOfTopLevelGoals = "";
		String listDelimiter = "";
		for(Goal goal : getTopLevelGoals()) {
			booleanVerdict = BooleanLogic.and(booleanVerdict, VerdictConverter.toBoolean(getGoalEvaluation(goal).getVerdict()));
			listOfTopLevelGoals += listDelimiter + goal.getName();
			listDelimiter = ", ";
		}
		goalModelEvaluation.setVerdict(VerdictConverter.toVerdict(booleanVerdict));
		
		
		
		if(booleanVerdict == null)
			goalModelEvaluation.setReason("Not enough information to determine whether all Top-Level Goals (" + listOfTopLevelGoals + ") can be fulfilled.");
		else if(booleanVerdict) {
			if(listOfTopLevelGoals.isEmpty())
				goalModelEvaluation.setReason("No goals specified, so everything passed.");
			else
				goalModelEvaluation.setReason("All Top-Level Goals (" + listOfTopLevelGoals + ") fulfilled.");
		} else
			goalModelEvaluation.setReason("Not All Top-Level Goals (" + listOfTopLevelGoals + ") fulfilled.");
		
		return goalModelEvaluation;
	}

	/**
	 * Evaluates the given goal by delegating to the more specific method.
	 * 
	 * @param goal goal to be evaluated
	 * @return evaluation result
	 * 
	 * @see #evaluate(SoftGoal)
	 * @see #evaluate(HardGoal)
	 * @see #evaluate(CompositeGoal)
	 */
	protected GoalEvaluation evaluate(Goal goal) {
		GoalEvaluation evaluation = getGoalEvaluation(goal);
		if(evaluation != null)
			return evaluation;
		
		if(goal instanceof SoftGoal)
			evaluation = evaluate((SoftGoal)goal);
		if(goal instanceof HardGoal)
			evaluation = evaluate((HardGoal)goal);
		if(goal instanceof CompositeGoal)
			evaluation = evaluate((CompositeGoal)goal);

		if(evaluation != null)
			addGoalEvaluation(goal, evaluation);
		return evaluation;
	}
	
	/**
	 * Evaluates the given soft goal. Soft goals are evaluated using impact
	 * analysis, i.e., the impacts that are produced by applying different
	 * patterns (transformations).
	 * 
	 * @param goal goal to be evaluated
	 * @return evaluation result
	 */
	protected SoftGoalEvaluation evaluate(SoftGoal goal) {
		SoftGoalEvaluation evaluation = GelFactory.eINSTANCE.createSoftGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		AppliedPropertyEvaluation propertyEvaluation = getAppliedPropertyEvaluation(goal.getProperty());
		if(propertyEvaluation == null) {
			evaluation.setVerdict(Verdict.INCONCLUSIVE);
			evaluation.setReason("No value for " + renderer.doRender(goal.getProperty()) + " found.");
			return evaluation;
		}
		
		BigDecimal impact = ValueUtil.assertNumber(propertyEvaluation.getValue());
		
		BigDecimal difference = NumericLogic.scale(NumericLogic.abs(NumericLogic.subtract(goal.getThreshold(), impact)));
		evaluation.setDifference(difference);
		DirectionKind direction = goal.getProperty().getProperty().getDirection();
		
		evaluation.setReason(
				renderer.doRender(goal.getProperty()) + " = " + renderer.doRender(impact) + 
					", Threshold is " + renderer.doRender(goal.getThreshold()) + 
					", Direction is " + direction.getLiteral());
		Boolean success = 
				(direction == DirectionKind.RANGE && impact.compareTo(goal.getThreshold()) == 0) ||
				(direction == DirectionKind.DECREASING && impact.compareTo(goal.getThreshold()) <= 0) ||
		        (direction == DirectionKind.INCREASING && impact.compareTo(goal.getThreshold()) >= 0);
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		return evaluation;
	}
	
	/**
	 * Evaluates the given composite goal. Composite goals are evaluated by 
	 * evaluating the boolean condition referring to other goals.
	 * 
	 * @param goal goal to be evaluated
	 * @return evaluation result
	 */
	public CompositeGoalEvaluation evaluate(CompositeGoal goal) {
		CompositeGoalEvaluation evaluation = GelFactory.eINSTANCE.createCompositeGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		ValueExpressionEvaluation conditionEvaluation = getGoalExpressionEvaluator().doEvaluate(goal.getCondition());
		Boolean success = GoalExpressionEvaluator.getBooleanOrNull(conditionEvaluation);
		
		if(conditionEvaluation instanceof BooleanExpressionEvaluation)
			evaluation.setConditionEvaluation((BooleanExpressionEvaluation) conditionEvaluation);
		
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		evaluation.setReason(conditionEvaluation.getReason());
		return evaluation;
	}
	
	/**
	 * Evaluates the given hard goal. Hard goals are evaluated by 
	 * evaluating the boolean condition referring to applied quantitative
	 * goals.
	 * 
	 * @param goal goal to be evaluated
	 * @return evaluation result
	 */
	public HardGoalEvaluation evaluate(HardGoal goal) {
		HardGoalEvaluation evaluation = GelFactory.eINSTANCE.createHardGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		ValueExpressionEvaluation conditionEvaluation = getHardGoalConditionEvaluator().doEvaluate(goal.getCondition());
		Boolean success = GoalExpressionEvaluator.getBooleanOrNull(conditionEvaluation);
		
		if(conditionEvaluation instanceof BooleanExpressionEvaluation)
			evaluation.setConditionEvaluation((BooleanExpressionEvaluation) conditionEvaluation);
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		evaluation.setReason(conditionEvaluation.getReason());
		return evaluation;
	}
}
