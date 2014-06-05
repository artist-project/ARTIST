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

import java.text.DateFormat;
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

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Goal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.eval.util.ComparatorUtil;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;

public class MigrationEvaluator {	
	
	private EvaluationSettings settings = new EvaluationSettings();
	
	private MigrationEvaluation migrationEvaluation;
	private GoalModel goalModel;
	
	public void setMigrationEvaluation(MigrationEvaluation migrationEvaluation) {
		this.migrationEvaluation = migrationEvaluation;
	}
	
	public MigrationEvaluation getMigrationEvaluation() {
		if(migrationEvaluation == null) 
			throw new IllegalArgumentException("No migration evaluation.");
		return migrationEvaluation;
	}
	
	public void setGoalModel(GoalModel goalModel) {
		this.goalModel = goalModel;
	}
	
	public GoalModel getGoalModel() {
		if(goalModel == null)
			throw new IllegalArgumentException("No goal model specified in goal model evaluation.");
		return goalModel;
	}
	
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	
	private Map<Goal, GoalEvaluation> goalEvaluations = new HashMap<>();
	
	public Map<Goal, GoalEvaluation> getGoalEvaluations() {
		return goalEvaluations;
	}
	
	public void addGoalEvaluation(Goal goal, GoalEvaluation evaluation) {
		this.goalEvaluations.put(goal, evaluation);
	}
	
	public GoalEvaluation getGoalEvaluation(Goal goal) {
		return this.goalEvaluations.get(goal);
	}
	
	private Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations = new HashMap<>();
	
	public Map<AppliedProperty, AppliedPropertyEvaluation> getAppliedPropertyEvaluations() {
		return appliedPropertyEvaluations;
	}
	
	public void setAppliedPropertyEvaluations(Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations) {
		this.appliedPropertyEvaluations = appliedPropertyEvaluations;
	}
	
	public void addAppliedPropertyEvaluation(AppliedProperty property, AppliedPropertyEvaluation evaluation) {
		this.appliedPropertyEvaluations.put(property, evaluation);
	}
	
	public void addAppliedPropertyEvaluations(Collection<AppliedPropertyEvaluation> evaluations) {
		for(AppliedPropertyEvaluation evaluation : evaluations)
			this.appliedPropertyEvaluations.put(evaluation.getProperty(), evaluation);
	}
	
	public AppliedPropertyEvaluation getGoalEvaluation(AppliedProperty property) {
		return this.appliedPropertyEvaluations.get(property);
	}
	
	
	
	private Set<Transformation> transformations = new TreeSet<Transformation>(ComparatorUtil.createTransformationComparator());

	public Set<Transformation> getTransformations() {
		return transformations;
	}
	
	public void addTransformation(Transformation transformation) {
		transformations.add(transformation);
	}
	
	public void addTransformations(Collection<Transformation> transformation) {
		transformations.addAll(transformation);
	}
	
	
	
	private GelFactory getGelFactory() {
		return GelFactory.eINSTANCE;
	}
	
	private String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat();
		return dateFormat.format(new Date());
	}
	
	private MigrationEvaluation newMigrationEvaluation() {
		MigrationEvaluation migrationEvaluation = getGelFactory().createMigrationEvaluation();	
		return migrationEvaluation;
	}
	
	private MigrationEvaluation newMigrationEvaluation(MigrationEvaluation existingEvaluation) {
		MigrationEvaluation migrationEvaluation = newMigrationEvaluation();		
		return migrationEvaluation;
	}
	
	public MigrationEvaluation evaluateMigration(GoalModel goalModel) {
		MigrationEvaluation migrationEvaluation = newMigrationEvaluation();

		setMigrationEvaluation(migrationEvaluation);
		setGoalModel(goalModel);
		
		migrationEvaluation.setName(getGoalModel().getName() + getSettings().getSuffix());
		migrationEvaluation.setDate(getCurrentDate());
		
		
		addTransformations(applyTransformations());
		migrationEvaluation.getTransformations().addAll(getTransformations());
		
		addAppliedPropertyEvaluations(evaluateProperties());
		
		migrationEvaluation.getPropertyEvaluations().addAll(getAppliedPropertyEvaluations().values());
		migrationEvaluation.setEvaluation(evaluateGoalModel());
		
		return migrationEvaluation;
	}
	
	public MigrationEvaluation evaluateMigration(MigrationEvaluation evaluation) {
		MigrationEvaluation migrationEvaluation = newMigrationEvaluation(evaluation);
		
		setMigrationEvaluation(migrationEvaluation);
		setGoalModel(evaluation.getEvaluation().getGoalModel());
		
		migrationEvaluation.setName(getGoalModel().getName() + getSettings().getSuffix());
		migrationEvaluation.setDate(getCurrentDate());
		
		
		addTransformations(EcoreUtil2.copyAll(evaluation.getTransformations()));
		addTransformations(applyTransformations());
		migrationEvaluation.getTransformations().addAll(getTransformations());
		
		addAppliedPropertyEvaluations(EcoreUtil2.copyAll(evaluation.getPropertyEvaluations()));
		addAppliedPropertyEvaluations(evaluateProperties());
		
		migrationEvaluation.getPropertyEvaluations().addAll(getAppliedPropertyEvaluations().values());
		migrationEvaluation.setEvaluation(evaluateGoalModel());
		
		return migrationEvaluation;
	}
	
	private Set<Transformation> applyTransformations() {
		return Collections.emptySet();
	}
	
	private List<AppliedProperty> extractRelevantAppliedProperties() {
		if(getGoalModel() == null)
			return null;
		return getGoalModel().getAppliedProperties();
	}
	
	private Set<AppliedPropertyEvaluation> evaluateProperties() {
		PropertyEvaluator propertyEvaluator = new PropertyEvaluator(getTransformations(), getSettings());
		Map<AppliedProperty, AppliedPropertyEvaluation> evaluations = propertyEvaluator.evaluate(extractRelevantAppliedProperties(), getAppliedPropertyEvaluations());
		Set<AppliedPropertyEvaluation> result =  new TreeSet<>(ComparatorUtil.createAppliedPropertyEvaluationComparator());
		Collection<AppliedPropertyEvaluation> values = evaluations.values();
		result.addAll(values);
		return result;
	}
	
	private GoalModelEvaluation evaluateGoalModel() {
		GoalModelEvaluator goalModelEvaluator = new GoalModelEvaluator(getAppliedPropertyEvaluations(), getSettings());
		return goalModelEvaluator.evaluate(getGoalModel());
	}
}
