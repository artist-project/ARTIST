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

import eu.artist.postmigration.nfrvt.lang.gel.eval.VerdictConverter;
import eu.artist.postmigration.nfrvt.lang.gel.validation.GELLabelRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.BooleanLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
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
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;

public class GoalModelEvaluator {
	
	private static GELLabelRenderer renderer = new GELLabelRenderer();
	
	private Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations;
	private EvaluationSettings settings = new EvaluationSettings();
	private List<Goal> topLevelGoals = new ArrayList<>();
	private Map<Goal, GoalEvaluation> goalEvaluations = new HashMap<>();
	
	public GoalModelEvaluator(Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations, EvaluationSettings settings) {
		this.appliedPropertyEvaluations = appliedPropertyEvaluations;
		this.settings = settings;
	}
	
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	public Map<Goal, GoalEvaluation> getGoalEvaluations() {
		return goalEvaluations;
	}
	
	public void addGoalEvaluation(Goal goal, GoalEvaluation evaluation) {
		this.goalEvaluations.put(goal, evaluation);
	}
	
	public GoalEvaluation getGoalEvaluation(Goal goal) {
		return this.goalEvaluations.get(goal);
	}
	
	public void setTopLevelGoals(List<Goal> topLevelGoals) {
		this.topLevelGoals = new ArrayList<Goal>(topLevelGoals);
	}
	
	public void removeTopLevelGoal(Goal goal) {
		topLevelGoals.remove(goal);
	}
	
	public List<Goal> getTopLevelGoals() {
		return topLevelGoals;
	}
	
	public Map<AppliedProperty, AppliedPropertyEvaluation> getAppliedPropertyEvaluations() {
		if(appliedPropertyEvaluations == null)
			return Collections.emptyMap();
		return appliedPropertyEvaluations;
	}
	
	public AppliedPropertyEvaluation getAppliedPropertyEvaluation(AppliedProperty property) {
		return getAppliedPropertyEvaluations().get(property);
	}
	
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
		else if(booleanVerdict)
			goalModelEvaluation.setReason("All Top-Level Goals (" + listOfTopLevelGoals + ") fulfilled.");
		else
			goalModelEvaluation.setReason("Not All Top-Level Goals (" + listOfTopLevelGoals + ") fulfilled.");
		
		return goalModelEvaluation;
	}

	public GoalEvaluation evaluate(Goal goal) {
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
	
	public SoftGoalEvaluation evaluate(SoftGoal goal) {
		SoftGoalEvaluation evaluation = GelFactory.eINSTANCE.createSoftGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		AppliedPropertyEvaluation propertyEvaluation = getAppliedPropertyEvaluation(goal.getProperty());
		if(propertyEvaluation == null) {
			evaluation.setVerdict(Verdict.INCONCLUSIVE);
			evaluation.setReason("No value for " + renderer.render(goal.getProperty()) + " found.");
			return evaluation;
		}
		
		BigDecimal impact = ValueUtil.assertNumber(propertyEvaluation.getValue());
		
		BigDecimal difference = goal.getThreshold().subtract(impact);
		evaluation.setDifference(difference.abs());

		DirectionKind direction = goal.getProperty().getProperty().getDirection();
		
		evaluation.setReason(
				renderer.render(goal.getProperty()) + " = " + renderer.render(impact) + 
					", Threshold is " + renderer.render(goal.getThreshold()) + 
					", Direction is " + direction.getLiteral());
		Boolean success = (direction == DirectionKind.DECREASING && impact.compareTo(goal.getThreshold()) <= 0) ||
		                  (direction == DirectionKind.INCREASING && impact.compareTo(goal.getThreshold()) >= 0);
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		return evaluation;
	}
	
	private GoalExpressionEvaluator goalExpressionEvaluator = new GoalExpressionEvaluator(this, getSettings());
	
	public GoalExpressionEvaluator getGoalExpressionEvaluator() {
		return goalExpressionEvaluator;
	}
	
	public CompositeGoalEvaluation evaluate(CompositeGoal goal) {
		CompositeGoalEvaluation evaluation = GelFactory.eINSTANCE.createCompositeGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		ValueExpressionEvaluation conditionEvaluation = getGoalExpressionEvaluator().evaluate(goal.getCondition());
		Boolean success = GoalExpressionEvaluator.getBooleanOrNull(conditionEvaluation);
		
		if(conditionEvaluation instanceof BooleanExpressionEvaluation)
			evaluation.setConditionEvaluation((BooleanExpressionEvaluation) conditionEvaluation);
		
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		evaluation.setReason(conditionEvaluation.getReason());
		return evaluation;
	}
	
	private HardGoalConditionEvaluator hardGoalConditionEvaluator = new HardGoalConditionEvaluator(this, getSettings());
	
	public HardGoalConditionEvaluator getHardGoalConditionEvaluator() {
		return hardGoalConditionEvaluator;
	}
	
	public HardGoalEvaluation evaluate(HardGoal goal) {
		HardGoalEvaluation evaluation = GelFactory.eINSTANCE.createHardGoalEvaluation();
		evaluation.setGoal(goal);
		evaluation.setName(goal.getName() + getSettings().getSuffix());
		
		ValueExpressionEvaluation conditionEvaluation = getHardGoalConditionEvaluator().evaluate(goal.getCondition());
		Boolean success = GoalExpressionEvaluator.getBooleanOrNull(conditionEvaluation);
		
		if(conditionEvaluation instanceof BooleanExpressionEvaluation)
			evaluation.setConditionEvaluation((BooleanExpressionEvaluation) conditionEvaluation);
		evaluation.setVerdict(VerdictConverter.toVerdict(success));
		evaluation.setReason(conditionEvaluation.getReason());
		return evaluation;
	}
}
