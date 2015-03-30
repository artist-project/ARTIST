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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.builder.MigrationEvaluationBuilder;

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
	
	public static EvaluationSettings DEFAULT_SETTINGS = new EvaluationSettings();
	
	private EvaluationSettings settings = new EvaluationSettings();
	
	public MigrationEvaluator(EvaluationSettings settings) {
		setSettings(settings);
	}
	
	public MigrationEvaluator() {
		this(DEFAULT_SETTINGS);
	}
	
	/**
	 * The settings specify how numeric evaluations should be handled, e.g., 
	 * their precision and their rounding mode.
	 * 
	 * @param settings new settings
	 */
	public void setSettings(EvaluationSettings settings) {
		this.settings = settings;
		NumericLogic.setSettings(settings);
		MigrationFactory.setSettings(settings);
	}
	
	/**
	 * Returns the current settings used for the evaluation.
	 * 
	 * @return current settings
	 */
	public EvaluationSettings getSettings() {
		return settings;
	}	
	
	public MigrationEvaluation evaluateMigration(GoalModel goalModel) {
		return evaluateMigration(goalModel, new ArrayList<MeasurementModel>());
	}
	
	public MigrationEvaluation evaluateMigration(GoalModel goalModel, List<MeasurementModel> measurements) {
		return evaluateMigration(goalModel, measurements, new ArrayList<Transformation>());
	}
	
	/**
	 * Evaluates the given goal model with the data present in the given 
	 * migration evaluation.
	 * 
	 * @param goalModel goal model to be evaluated
	 * @param measurements already present evaluation information
	 * @param transformation applied transformations
	 * @return new evaluation result
	 */
	public MigrationEvaluation evaluateMigration(GoalModel goalModel, List<MeasurementModel> measurements, List<Transformation> transformation) {
		return evaluateMigration(new MigrationResourceSet(), goalModel, measurements, transformation);
	}
		
	/**
	 * Evaluates the given goal model with the data present in the given 
	 * migration evaluation.
	 * 
	 * @param resourceSet to be used
	 * @param goalModel goal model to be evaluated
	 * @param measurements already present evaluation information
	 * @param transformation applied transformations
	 * @return new evaluation result
	 */
	public MigrationEvaluation evaluateMigration(MigrationResourceSet resourceSet, GoalModel goalModel, List<MeasurementModel> measurements, List<Transformation> transformation) {
		EcoreUtil.resolveAll(goalModel);
		for(MeasurementModel model : measurements)
			EcoreUtil.resolveAll(model);

		MigrationEvaluationBuilder builder = new MigrationEvaluationBuilder(resourceSet);
		
		// general data
		builder.setName(goalModel.getName() + getSettings().getSuffix());
		
		// transformations
		List<Transformation> transformations = new ArrayList<>(EcoreUtil2.copyAll(transformation));
		builder.addTransformations(transformation);
		
		// property evaluations
		Map<AppliedProperty, AppliedPropertyEvaluation> evaluations = new HashMap<>();

		QualitativePropertyEvaluator qualitativeEvaluator = new QualitativePropertyEvaluator(getSettings(), transformations);
		QuantitativePropertyEvaluator quantitativeEvaluator = new QuantitativePropertyEvaluator(getSettings(), measurements);		

		List<AppliedQualitativeProperty> qualitativeProperties = new ArrayList<>();
		List<AppliedQuantitativeProperty> quantitativeProperties = new ArrayList<>();
		for(AppliedProperty property : goalModel.getAppliedProperties()) {
			if(property instanceof AppliedQualitativeProperty)
				qualitativeProperties.add((AppliedQualitativeProperty) property);
			else if(property instanceof AppliedQuantitativeProperty)
				quantitativeProperties.add((AppliedQuantitativeProperty) property);
		}
		evaluations.putAll(qualitativeEvaluator.evaluate(qualitativeProperties));
		evaluations.putAll(quantitativeEvaluator.evaluate(quantitativeProperties));
		builder.addAppliedPropertyEvaluations(evaluations.values());
		
		// goal model evaluation
		GoalModelEvaluator goalModelEvaluator = new GoalModelEvaluator(evaluations, getSettings());
		GoalModelEvaluation goalModelEvaluation = goalModelEvaluator.evaluate(goalModel);
		builder.setGoalModelEvaluation(goalModelEvaluation);
		
		return builder.getMigrationEvaluation();
	}
}
