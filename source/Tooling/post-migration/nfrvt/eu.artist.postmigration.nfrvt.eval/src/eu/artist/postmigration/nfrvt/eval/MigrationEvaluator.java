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

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.xtext.EcoreUtil2;

import eu.artist.postmigration.nfrvt.eval.util.ComparatorUtil;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;

/**
 * An evaluator encapsulating the evaluation of a complete 
 * migration process, i.e., the goals specified in the pre-migration phase,
 * the transformations applied in the migration phase, and the evaluation
 * of the individual goals done in the post-migration phase.
 * 
 * @author Martin Fleck
 *
 */
public class MigrationEvaluator {	
	
	private EvaluationSettings settings = new EvaluationSettings();
	private Map<Goal, GoalEvaluation> goalEvaluations = new HashMap<>();
	private MigrationEvaluation migrationEvaluation;
	private GoalModel goalModel;
	
	private Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations = new HashMap<>();
	private Set<Transformation> transformations = new TreeSet<Transformation>(ComparatorUtil.createTransformationComparator());

	
	/**
	 * Sets the evaluation that should be re-evaluated.
	 * 
	 * @param migrationEvaluation evaluation to be re-evaluated
	 */
	public void setMigrationEvaluation(MigrationEvaluation migrationEvaluation) {
		this.migrationEvaluation = migrationEvaluation;
	}
	
	/**
	 * Returns the evaluation that should be re-evaluated.
	 * 
	 * @return evaluation to be re-evaluated
	 * 
	 */
	public MigrationEvaluation getMigrationEvaluation() {
		if(migrationEvaluation == null) 
			throw new IllegalArgumentException("No migration evaluation.");
		return migrationEvaluation;
	}
	
	/**
	 * Sets the goal model that should be evaluated.
	 * 
	 * @param goalModel goal model to be evaluated
	 */
	public void setGoalModel(GoalModel goalModel) {
		this.goalModel = goalModel;
	}
	
	/**
	 * Returns the goal model that should be evaluated.
	 * 
	 * @return goal model to be evaluated
	 */
	public GoalModel getGoalModel() {
		if(goalModel == null)
			throw new IllegalArgumentException("No goal model specified in goal model evaluation.");
		return goalModel;
	}
	
	/**
	 * The settings specify how numeric evaluations should be handled, e.g., 
	 * their precision and their rounding mode.
	 * 
	 * @param settings new settings
	 */
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
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
	 * Sets all evaluation results to be considered for applied properties.
	 * 
	 * @param appliedPropertyEvaluations new evaluation results
	 */
	public void setAppliedPropertyEvaluations(Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations) {
		this.appliedPropertyEvaluations = appliedPropertyEvaluations;
	}
	
	/**
	 * Adds a new evaluation result for the given applied property. Any result
	 * previously stored will be overridden.
	 * 
	 * @param property property that has been evaluated
	 * @param evaluation evaluation result
	 */
	public void addAppliedPropertyEvaluation(AppliedProperty property, AppliedPropertyEvaluation evaluation) {
		this.appliedPropertyEvaluations.put(property, evaluation);
	}
	
	/**
	 * Adds new evaluation result for the given applied properties. Any result
	 * previously stored for the properties will be overridden.
	 * 
	 * @param evaluations new evaluation results
	 * @param evaluation evaluation result
	 */
	public void addAppliedPropertyEvaluations(Collection<AppliedPropertyEvaluation> evaluations) {
		for(AppliedPropertyEvaluation evaluation : evaluations)
			this.appliedPropertyEvaluations.put(evaluation.getProperty(), evaluation);
	}
	
	/**
	 * Return the applied patterns (transformations).
	 * 
	 * @return used transformations
	 */
	public Set<Transformation> getTransformations() {
		return transformations;
	}
	
	/**
	 * Add a new transformation.
	 * 
	 * @param transformation new applied pattern
	 */
	protected void addTransformation(Transformation transformation) {
		if(transformation != null)
			transformations.add(transformation);
	}
	
	/**
	 * Adds all given transformations.
	 * 
	 * @param transformation transformations to be added
	 */
	protected void addTransformations(Collection<Transformation> transformation) {
		if(transformation != null && !transformation.isEmpty())
			transformations.addAll(transformation);
	}
	
	/**
	 * Returns the current date.
	 * 
	 * @return string representation of the current date
	 */
	private String getCurrentDate() {
		return new SimpleDateFormat().format(new Date());
	}
	
	/**
	 * Evaluates the given goal model.
	 * 
	 * @param goalModel model to be evaluated
	 * @return evaluation result
	 */
	public MigrationEvaluation evaluateMigration(GoalModel goalModel) {
		return evaluateMigration(goalModel, null);
	}
	
	/**
	 * Re-evaluates the given evaluation.
	 * 
	 * @param evaluation evaluation to be re-evaluated
	 * @return evaluation result
	 */
	public MigrationEvaluation evaluateMigration(MigrationEvaluation evaluation) {
		return evaluateMigration(evaluation.getEvaluation().getGoalModel(), evaluation);
	}
	
	/**
	 * Evaluates the given goal model with the data present in the given 
	 * migration evaluation.
	 * 
	 * @param goalModel goal model to be evaluated
	 * @param existingEvaluation already present evaluation information
	 * @return new evaluation result
	 */
	protected MigrationEvaluation evaluateMigration(GoalModel goalModel, MigrationEvaluation existingEvaluation) {
		MigrationEvaluation migrationEvaluation = GelFactory.eINSTANCE.createMigrationEvaluation();
		
		setMigrationEvaluation(migrationEvaluation);
		setGoalModel(goalModel);
		
		migrationEvaluation.setName(getGoalModel().getName() + getSettings().getSuffix());
		migrationEvaluation.setDate(getCurrentDate());
		
		if(existingEvaluation != null)
			addTransformations(EcoreUtil2.copyAll(existingEvaluation.getTransformations()));
		migrationEvaluation.getTransformations().addAll(getTransformations());
		
		if(existingEvaluation != null)
			addAppliedPropertyEvaluations(EcoreUtil2.copyAll(existingEvaluation.getPropertyEvaluations()));
		addAppliedPropertyEvaluations(evaluateProperties());
		
		migrationEvaluation.getPropertyEvaluations().addAll(getAppliedPropertyEvaluations().values());
		migrationEvaluation.setEvaluation(evaluateGoalModel());
		
		return migrationEvaluation;
	}
	
	/**
	 * Returns the applied properties from the goal model or null if there
	 * are no applied properties.
	 * 
	 * @return applied properties if present or null
	 */
	private List<AppliedProperty> extractRelevantAppliedProperties() {
		if(getGoalModel() == null)
			return null;
		return getGoalModel().getAppliedProperties();
	}
	
	/**
	 * Evaluates all relevant properties from the current goal model.
	 * 
	 * @return evaluation results for all relevant properties
	 */
	private Set<AppliedPropertyEvaluation> evaluateProperties() {
		PropertyEvaluator propertyEvaluator = new PropertyEvaluator(getTransformations(), getSettings());
		Map<AppliedProperty, AppliedPropertyEvaluation> evaluations = propertyEvaluator.evaluate(extractRelevantAppliedProperties(), getAppliedPropertyEvaluations());
		Set<AppliedPropertyEvaluation> result =  new TreeSet<>(ComparatorUtil.createAppliedPropertyEvaluationComparator());
		Collection<AppliedPropertyEvaluation> values = evaluations.values();
		result.addAll(values);
		return result;
	}
	
	/**
	 * Evaluates the current goal model.
	 * 
	 * @return evaluation result for the current goal model
	 */
	private GoalModelEvaluation evaluateGoalModel() {
		GoalModelEvaluator goalModelEvaluator = new GoalModelEvaluator(getAppliedPropertyEvaluations(), getSettings());
		return goalModelEvaluator.evaluate(getGoalModel());
	}
}
