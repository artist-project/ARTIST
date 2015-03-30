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
package eu.artist.postmigration.nfrvt.lang.util.builder;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.Grammar;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.gel.eval.VerdictConverter;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gel.parser.antlr.GELParser;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.CompositeGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalModel;
import eu.artist.postmigration.nfrvt.lang.gml.gml.HardGoal;
import eu.artist.postmigration.nfrvt.lang.gml.gml.SoftGoal;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationEvaluationSelector;

/**
 * This builder class helps to create or adapt one migration evaluation.
 * 
 * @author Martin Fleck
 * @see MigrationEvaluationSelector
 * @see MigrationEvaluation
 */
public class MigrationEvaluationBuilder extends MigrationModelBuilder<MigrationEvaluation> {	
	private MigrationEvaluation migrationEvaluation;

	/**
	 * Creates a new migration evaluation builder with a default migration 
	 * resource set and a default migration evaluation. Make sure that the 
	 * given migration evaluation fulfills all constraints before saving it.
	 * 
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationBuilder() {
		this(new MigrationResourceSet());
	}
	
	/**
	 * Creates a new migration evaluation builder with a default migration 
	 * resource set and a default migration evaluation with the given name. 
	 * Make sure that the given migration evaluation fulfills all constraints 
	 * before saving it.
	 * 
	 * @param evaluationName name of the evaluation
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationBuilder(String evaluationName) {
		this(new MigrationResourceSet(), MigrationFactory.createMigrationEvaluation(evaluationName, new Date()));
	}
	
	/**
	 * Creates a new migration evaluation builder with the given migration 
	 * resource set and a default migration evaluation . Make sure that the 
	 * given migration evaluation fulfills all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the evaluation
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationBuilder(MigrationResourceSet resourceSet) {
		this(resourceSet, MigrationFactory.createMigrationEvaluation("", new Date()));
	}
	
	/**
	 * Creates a new migration evaluation builder with the given migration 
	 * resource set and the given migration evaluation. Make sure that the 
	 * given migration evaluation fulfills all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the evaluation
	 * @param migrationEvaluation migration evaluation
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationBuilder(MigrationResourceSet resourceSet, MigrationEvaluation migrationEvaluation) {
		super(resourceSet, migrationEvaluation);
		this.migrationEvaluation = migrationEvaluation;
	}
	
	/**
	 * Creates a new migration evaluation builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * migration evaluation that is previously stored at the given uri will 
	 * be replaced. Make sure that the given migration evaluation fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the migration evaluation 
	 * @param migrationEvaluationUri migration evaluation uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */
	public MigrationEvaluationBuilder(MigrationResourceSet resourceSet, String migrationEvaluationUri, boolean override) {
		this(resourceSet, URI.createURI(adaptUri(migrationEvaluationUri)), override);
	}
	
	/**
	 * Creates a new migration evaluation builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * migration evaluation that is previously stored at the given uri will 
	 * be replaced. Make sure that the given migration evaluation fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param migrationEvaluationUri migration evaluation uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see MigrationEvaluation
	 */	
	public MigrationEvaluationBuilder(MigrationResourceSet resourceSet, URI migrationEvaluationUri, boolean override) {
		super(resourceSet, null);
		if(override) 
			this.migrationEvaluation = getResourceSet().createMigrationEvaluation(migrationEvaluationUri, override);
		else
			this.migrationEvaluation = getResourceSet().loadMigrationEvaluation(migrationEvaluationUri, true);
		if(this.migrationEvaluation == null)
			throw new IllegalArgumentException("No migration evaluation could be obtained for uri '" + migrationEvaluationUri + "'.");
		this.model = migrationEvaluation;
	}
	
	@Override
	protected GELParser getParser() {
		return (GELParser) super.getParser();
	}

	@Override
	protected Grammar getGrammar() {
		return getParser().getGrammarAccess().getGrammar();
	}
	
	@Override
	protected MigrationEvaluationSelector createSelector() {
		return new MigrationEvaluationSelector(getMigrationEvaluation());
	}
	
	@Override
	public MigrationEvaluationSelector getSelector() {
		return ObjectUtil.asClass(super.getSelector(), MigrationEvaluationSelector.class);
	}
	
	/**
	 * Returns the migration evaluation managed by this builder.
	 * @return migration evaluation
	 */
	public MigrationEvaluation getMigrationEvaluation() {
		return migrationEvaluation;
	}
	
	/**
	 * Sets the name of the migration evaluation.
	 * @param name new name of the migration evaluation
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder setName(String name) {
		getMigrationEvaluation().setName(toQualifiedName(name));
		return this;
	}
	
	/**
	 * Returns the name of the migration evaluation.
	 * 
	 * @return migration evaluation name
	 */
	public String getName() {
		return getMigrationEvaluation().getName();
	}
	
	/**
	 * Sets the date/time of the evaluation.
	 * 
	 * @param date new date/time of the migration evaluation
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder setDate(Date date) {
		getMigrationEvaluation().setDate(date);
		return this;
	}
	
	/**
	 * Returns the date/time of the evaluation.
	 * @return date/time of the migration evaluation
	 */
	public Date getDate() {
		return getMigrationEvaluation().getDate();
	}
	
	/**
	 * Adds the given transformations to the migration evaluation managed by 
	 * this builder.
	 * 
	 * @param transformations transformations to be added
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder addTransformations(Collection<? extends Transformation> transformations) {
		getMigrationEvaluation().getTransformations().addAll(transformations);
		return this;
	}
	
	/**
	 * Adds the given transformation to the migration evaluation managed by 
	 * this builder.
	 * 
	 * @param transformation transformation to be added
	 * @return added transformation
	 */
	public Transformation addTransformation(Transformation transformation) {
		getMigrationEvaluation().getTransformations().add(transformation);
		return transformation;
	}
	
	/**
	 * Adds the transformation specified by the given data to the migration 
	 * evaluation managed by this builder.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern applied in this transformation
	 * @param sources source elements that have used as input for this 
	 * transformation
	 * @param targets target elements that have been produced as output
	 * for this transformation
	 * @param context context in which pattern is applied
	 * @param info additional information, e.g, parameters
	 * @return newly created and added transformation
	 */
	public Transformation addTransformation(String name, Pattern pattern, List<NamedElement> sources, List<NamedElement> targets, List<NamedElement> context, String info) {
		return addTransformation(MigrationFactory.createTransformation(name, pattern, sources, targets, context, info));
	}
	
	/**
	 * Adds the transformation specified by the given data to the migration 
	 * evaluation managed by this builder.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern applied in this transformation
	 * @param sources source elements that have used as input for this 
	 * transformation
	 * @param targets target elements that have been produced as output
	 * for this transformation
	 * @param context context in which pattern is applied
	 * @return newly created and added transformation
	 */
	public Transformation addTransformation(String name, Pattern pattern, List<NamedElement> sources, List<NamedElement> targets, List<NamedElement> context) {
		return addTransformation(MigrationFactory.createTransformation(name, pattern, sources, targets, context));
	}
	
	/**
	 * Adds the transformation specified by the given data to the migration 
	 * evaluation managed by this builder.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern applied in this transformation
	 * @param sources source elements that have used as input for this 
	 * transformation
	 * @param targets target elements that have been produced as output
	 * for this transformation
	 * @return newly created and added transformation
	 */
	public Transformation addTransformation(String name, Pattern pattern, List<NamedElement> sources, List<NamedElement> targets) {
		return addTransformation(MigrationFactory.createTransformation(name, pattern, sources, targets));
	}

	/**
	 * Adds the transformation specified by the given data to the migration 
	 * evaluation managed by this builder.
	 * 
	 * @param name name of the transformation, should be unique
	 * @param pattern pattern applied in this transformation
	 * @return newly created and added transformation
	 */
	public Transformation addTransformation(String name, Pattern pattern) {
		return addTransformation(MigrationFactory.createTransformation(name, pattern));
	}
	
	/**
	 * Adds an applied property evaluations to this migration evaluation.
	 * 
	 * @param evaluations evaluations to be added
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder addAppliedPropertyEvaluations(Collection<? extends AppliedPropertyEvaluation> evaluations) {
		getMigrationEvaluation().getPropertyEvaluations().addAll(evaluations);
		return this;
	}
	
	/**
	 * Adds an applied property evaluations to this migration evaluation.
	 * 
	 * @param evaluations evaluations to be added
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder addAppliedQualitativePropertyEvaluations(Collection<? extends AppliedQualitativePropertyEvaluation> evaluations) {
		getMigrationEvaluation().getPropertyEvaluations().addAll(evaluations);
		return this;
	}
	
	/**
	 * Adds an applied property evaluation to this migration evaluation.
	 * 
	 * @param evaluation evaluation to be added
	 * @return added applied property evaluation
	 */
	public AppliedQualitativePropertyEvaluation addAppliedQualitativePropertyEvaluation(AppliedQualitativePropertyEvaluation evaluation) {
		getMigrationEvaluation().getPropertyEvaluations().add(evaluation);
		return evaluation;
	}
	
	/**
	 * Adds an applied property evaluation based on the given data to this 
	 * migration evaluation.
	 * 
	 * @param name name of the evaluation, should be unique
	 * @param property evaluated property
	 * @param value result value of this evaluation
	 * @param evaluation evaluation indicating how the result value has been
	 * produced
	 * @return newly created and added applied property evaluation
	 */
	public AppliedQualitativePropertyEvaluation addAppliedQualitativePropertyEvaluation(String name, AppliedQualitativeProperty property, ValueSpecification value, NumberExpressionEvaluation evaluation) {
		return addAppliedQualitativePropertyEvaluation(
				MigrationFactory.createAppliedQualitativePropertyEvaluation(name, property, value, evaluation));
	}
	
	/**
	 * Adds an applied property evaluations to this migration evaluation.
	 * 
	 * @param evaluations evaluations to be added
	 * @return this builder instance
	 */
	public MigrationEvaluationBuilder addAppliedQuantitativePropertyEvaluations(Collection<? extends AppliedQuantitativePropertyEvaluation> evaluations) {
		getMigrationEvaluation().getPropertyEvaluations().addAll(evaluations);
		return this;
	}
	
	/**
	 * Adds an applied property evaluation to this migration evaluation.
	 * 
	 * @param evaluation evaluation to be added
	 * @return added applied property evaluation
	 */
	public AppliedQuantitativePropertyEvaluation addAppliedQuantitativePropertyEvaluation(AppliedQuantitativePropertyEvaluation evaluation) {
		getMigrationEvaluation().getPropertyEvaluations().add(evaluation);
		return evaluation;
	}
	
	/**
	 * Adds an applied property evaluation based on the given data to this 
	 * migration evaluation.
	 * 
	 * @param name name of the evaluation, should be unique
	 * @param property evaluated property
	 * @param value result value of this evaluation
	 * @param evaluation evaluation indicating how the result value has been
	 * produced
	 * @return newly created and added applied property evaluation
	 */
	public AppliedQuantitativePropertyEvaluation addAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation) {
		return addAppliedQuantitativePropertyEvaluation(
				MigrationFactory.createAppliedQuantitativePropertyEvaluation(name, property, value, evaluation));
	}
	
	/**
	 * Adds an applied property evaluation based on the given data to this 
	 * migration evaluation.
	 * 
	 * @param name name of the evaluation, should be unique
	 * @param property evaluated property
	 * @param value result value of this evaluation
	 * @param evaluation evaluation indicating how the result value has been
	 * produced
	 * @param measurements measurements used in the evaluation
	 * @return newly created and added applied property evaluation
	 */
	public AppliedQuantitativePropertyEvaluation addAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation, Measurement... measurements) {
		return addAppliedQuantitativePropertyEvaluation(
				MigrationFactory.createAppliedQuantitativePropertyEvaluation(name, property, value, evaluation, Lists.newArrayList(measurements)));
	}
	
	/**
	 * Adds an applied property evaluation based on the given data to this 
	 * migration evaluation.
	 * 
	 * @param name name of the evaluation, should be unique
	 * @param property evaluated property
	 * @param value result value of this evaluation
	 * @param evaluation evaluation indicating how the result value has been
	 * produced
	 * @param measurements measurements used in the evaluation
	 * @return newly created and added applied property evaluation
	 */
	public AppliedQuantitativePropertyEvaluation addAppliedQuantitativePropertyEvaluation(String name, AppliedQuantitativeProperty property, ValueSpecification value, ValueExpressionEvaluation evaluation, Iterable<? extends Measurement> measurements) {
		return addAppliedQuantitativePropertyEvaluation(
				MigrationFactory.createAppliedQuantitativePropertyEvaluation(name, property, value, evaluation, measurements));
	}

	/**
	 * Set the goal model evaluation for this migration evaluation.
	 * 
	 * @param evaluation new goal model evaluation
	 * @return the added goal model evaluation
	 */
	public GoalModelEvaluation setGoalModelEvaluation(GoalModelEvaluation evaluation) {
		getMigrationEvaluation().setEvaluation(evaluation);
		return evaluation;
	}
	
	/**
	 * Sets the goal model evaluation specified by the given data for the 
	 * migration evaluation managed by this builder.
	 * 
	 * @param goalModel goal model that has been evaluated
	 * @param verdict verdict of that evaluation
	 * @param reason reason for the evaluation verdict
	 * @return newly created and added goal model evaluation
	 */
	public GoalModelEvaluation setGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason) {
		return setGoalModelEvaluation(MigrationFactory.createGoalModelEvaluation(goalModel, verdict, reason));
	}
	
	/**
	 * Sets the goal model evaluation specified by the given data for the 
	 * migration evaluation managed by this builder.
	 * 
	 * @param goalModel goal model that has been evaluated
	 * @param verdict verdict of that evaluation
	 * @param reason reason for the evaluation verdict
	 * @param goalEvaluations goal evaluations on which the verdict is based
	 * @return newly created and added goal model evaluation
	 */
	public GoalModelEvaluation setGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason, GoalEvaluation... goalEvaluations) {
		return setGoalModelEvaluation(MigrationFactory.createGoalModelEvaluation(goalModel, verdict, reason, Lists.newArrayList(goalEvaluations)));
	}
	
	/**
	 * Sets the goal model evaluation specified by the given data for the 
	 * migration evaluation managed by this builder.
	 * 
	 * @param goalModel goal model that has been evaluated
	 * @param verdict verdict of that evaluation
	 * @param reason reason for the evaluation verdict
	 * @param goalEvaluations goal evaluations on which the verdict is based
	 * @return newly created and added goal model evaluation
	 */
	public GoalModelEvaluation setGoalModelEvaluation(GoalModel goalModel, Verdict verdict, String reason, Iterable<? extends GoalEvaluation> goalEvaluations) {
		return setGoalModelEvaluation(MigrationFactory.createGoalModelEvaluation(goalModel, verdict, reason, goalEvaluations));
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param softGoalEvaluation evaluation to be added
	 * @return added goal evaluation
	 */
	public SoftGoalEvaluation addSoftGoalEvaluation(GoalModelEvaluation goalModelEvaluation, SoftGoalEvaluation softGoalEvaluation) {
		goalModelEvaluation.getEvaluations().add(softGoalEvaluation);
		return softGoalEvaluation;
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param name name of the evaluation, should be unique
	 * @param goal goal to be evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the evaluation verdict
	 * @return newly created and added goal evaluation
	 */
	public SoftGoalEvaluation addSoftGoalEvaluation(GoalModelEvaluation goalModelEvaluation, String name, SoftGoal goal, Verdict verdict, String reason) {
		return addSoftGoalEvaluation(goalModelEvaluation, MigrationFactory.createSoftGoalEvaluation(name, goal, verdict, reason));
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param name name of the evaluation, should be unique
	 * @param goal goal to be evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the evaluation verdict
	 * @param difference difference of evaluation and goal target value
	 * @return newly created and added goal evaluation
	 */
	public SoftGoalEvaluation addSoftGoalEvaluation(GoalModelEvaluation goalModelEvaluation, String name, SoftGoal goal, Verdict verdict, String reason, double difference) {
		return addSoftGoalEvaluation(goalModelEvaluation, MigrationFactory.createSoftGoalEvaluation(name, goal, verdict, reason, difference));
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param goalEvaluation evaluation to be added
	 * @return added goal evaluation
	 */
	public HardGoalEvaluation addHardGoalEvaluation(GoalModelEvaluation goalModelEvaluation, HardGoalEvaluation goalEvaluation) {
		goalModelEvaluation.getEvaluations().add(goalEvaluation);
		return goalEvaluation;
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param name name of the evaluation, should be unique
	 * @param goal goal to be evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the evaluation verdict
	 * @param evaluation evaluation on which the verdict is based
	 * @return newly created and added goal evaluation
	 */
	public HardGoalEvaluation addHardGoalEvaluation(GoalModelEvaluation goalModelEvaluation, String name, HardGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		return addHardGoalEvaluation(goalModelEvaluation, MigrationFactory.createHardGoalEvaluation(name, goal, verdict, reason, evaluation));
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param goalEvaluation evaluation to be added
	 * @return added goal evaluation
	 */
	public CompositeGoalEvaluation addCompositeGoalEvaluation(GoalModelEvaluation goalModelEvaluation, CompositeGoalEvaluation goalEvaluation) {
		goalModelEvaluation.getEvaluations().add(goalEvaluation);
		return goalEvaluation;
	}
	
	/**
	 * Adds the goal evaluation to the given goal model evaluation.
	 * 
	 * @param goalModelEvaluation existing goal model evaluation
	 * @param name name of the evaluation, should be unique
	 * @param goal goal to be evaluated
	 * @param verdict verdict of the evaluation
	 * @param reason reason for the evaluation verdict
	 * @param evaluation evaluation on which the verdict is based
	 * @return newly created and added goal evaluation
	 */
	public CompositeGoalEvaluation addCompositeGoalEvaluation(GoalModelEvaluation goalModelEvaluation, String name, CompositeGoal goal, Verdict verdict, String reason, BooleanExpressionEvaluation evaluation) {
		return addCompositeGoalEvaluation(goalModelEvaluation, MigrationFactory.createCompositeGoalEvaluation(name, goal, verdict, reason, evaluation));
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @return newly created evaluation
	 */
	public ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(result, reason);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason, ValueExpressionEvaluation... evaluations) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(result, reason, Lists.newArrayList(evaluations));
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public ValueSpecificationExpressionEvaluation createValueSpecificationExpressionEvaluation(ValueSpecification result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return MigrationFactory.createValueSpecificationExpressionEvaluation(result, reason, evaluations);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param difference difference between target value and evaluation result
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason, difference);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason, evaluations);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, ValueExpressionEvaluation... evaluations) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason, Lists.newArrayList(evaluations));
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param difference difference between target value and evaluation result
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference, Iterable<? extends ValueExpressionEvaluation> evaluations) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason, difference, evaluations);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param difference difference between target value and evaluation result
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public BooleanExpressionEvaluation createBooleanExpressionEvaluation(Boolean result, String reason, double difference, ValueExpressionEvaluation... evaluations) {
		return MigrationFactory.createBooleanExpressionEvaluation(result, reason, difference, Lists.newArrayList(evaluations));
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @return newly created evaluation
	 */
	public NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason) {
		return MigrationFactory.createNumberExpressionEvaluation(result, reason);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason, Iterable<? extends NumberExpressionEvaluation> evaluations) {
		return MigrationFactory.createNumberExpressionEvaluation(result, reason, evaluations);
	}
	
	/**
	 * Creates a value evaluation for the given data.
	 * 
	 * @param result result value
	 * @param reason reason for the result value
	 * @param evaluations evaluations on which the result value is based
	 * @return newly created evaluation
	 */
	public NumberExpressionEvaluation createNumberExpressionEvaluation(NumberLiteral result, String reason, NumberExpressionEvaluation... evaluations) {
		return MigrationFactory.createNumberExpressionEvaluation(result, reason, Lists.newArrayList(evaluations));
	}
	
	/**
	 * Converts the given result value into a verdict.
	 * @param result result to convert
	 * @return verdict
	 */
	public Verdict createVerdict(Boolean result) {
		return VerdictConverter.toVerdict(result);
	}
	
	/**
	 * Makes sure that the given uriString corresponds to a migration 
	 * evaluation uri.
	 * 
	 * @param uriString uri string
	 * @return uri string conforming to migration evaluation
	 */
	protected static String adaptUri(String uriString) {
		if(!FileExtensions.isMigrationEvaluation(uriString))
			return uriString + "." + FileExtensions.getMigrationEvaluationExtension();
		return uriString;
	}

}
