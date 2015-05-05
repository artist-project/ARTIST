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
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.util.UMLUtil;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonFactory;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.AvgOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MaxOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.MinOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Operator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.SumOperator;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ValueSpecification;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.logic.NumericLogic;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;

/**
 * A property evaluator can evaluate applied qualitative and quantitative
 * property. Applied qualitative properties are evaluated using impact
 * analysis. Applied quantitative properties are evaluated using the 
 * respective evaluation strategies.
 * 
 * @author Martin Fleck
 * 
 * @see AppliedQualitativeProperty
 * @see AppliedQuantitativeProperty
 * @see EvaluationStrategy
 * @deprecated
 */
public class PropertyEvaluator {
	
	private static GELTextRenderer renderer = new GELTextRenderer();
	
	private Set<Transformation> relevantTransformations;
	private EvaluationSettings settings;
	private List<AppliedProperty> relevantProperties;
	
	/**
	 * A property evaluator can evaluate applied qualitative and quantitative
	 * property. Applied qualitative properties are evaluated using impact
	 * analysis. Applied quantitative properties are evaluated using the 
	 * respective evaluation strategies.
	 * 
	 * @param relevantTransformations used transformations containing impacts
	 * on different properties
	 * @param settings settings used for the evaluation
	 */
	public PropertyEvaluator(Set<Transformation> relevantTransformations, EvaluationSettings settings) {
		this.relevantTransformations = relevantTransformations;
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
	
	protected void setRelevantTransformations(Set<Transformation> relevantTransformations) {
		this.relevantTransformations = relevantTransformations;
	}
	
	/**
	 * Returns the transformations considered during the property evaluations.
	 * 
	 * @return evaluation relevant transformations
	 */
	public Set<Transformation> getRelevantTransformations() {
		if(relevantTransformations == null)
			return Collections.emptySet();
		return relevantTransformations;
	}
	
	protected void setRelevantProperties(List<AppliedProperty> relevantProperties) {
		this.relevantProperties = relevantProperties;
	}
	
	/**
	 * Returns the relevant properties
	 * @return
	 */
	public List<AppliedProperty> getRelevantProperties() {
		if(relevantProperties == null)
			return Collections.emptyList();
		return relevantProperties;
	}
	
	protected Map<AppliedProperty, AppliedPropertyEvaluation> evaluate(List<AppliedProperty> appliedProperties, Map<AppliedProperty, AppliedPropertyEvaluation> existingEvaluations) {
		setRelevantProperties(appliedProperties);
		Map<AppliedProperty, AppliedPropertyEvaluation> appliedPropertyEvaluations = existingEvaluations;
		AppliedPropertyEvaluation eval;
		for(AppliedProperty property : appliedProperties) {
			eval = evaluate(property, existingEvaluations.get(property));
			if(eval != null)
				appliedPropertyEvaluations.put(property, eval);
		}
		setRelevantProperties(null);
		return appliedPropertyEvaluations;
	}
	
	protected AppliedPropertyEvaluation evaluate(AppliedProperty property, AppliedPropertyEvaluation evaluation) {
		if(property instanceof AppliedQualitativeProperty) {
			if(evaluation == null) {
				evaluation = GelFactory.eINSTANCE.createAppliedQualitativePropertyEvaluation();
				((AppliedQualitativePropertyEvaluation)evaluation).setProperty((AppliedQualitativeProperty)property);
				evaluation.setName(property.getName() + getSettings().getSuffix());
			}
			return evaluate((AppliedQualitativeProperty)property, (AppliedQualitativePropertyEvaluation)evaluation);
		}
		
		if(property instanceof AppliedQuantitativeProperty) {
			if(evaluation == null) {
				evaluation = GelFactory.eINSTANCE.createAppliedQuantitativePropertyEvaluation();
				((AppliedQuantitativePropertyEvaluation)evaluation).setProperty((AppliedQuantitativeProperty)property);
				evaluation.setName(property.getName() + getSettings().getSuffix());
			}
			return evaluate((AppliedQuantitativeProperty)property, (AppliedQuantitativePropertyEvaluation)evaluation);
		}
		return null;
	}
	
	protected void addOrReplaceRealization(AppliedQuantitativePropertyEvaluation evaluation, Measurement measurement) {
		if(measurement == null || evaluation == null || measurement.getName() == null)
			return;
		Measurement toRemove = null;
		for(Measurement r : evaluation.getMeasurements()) {
			if(measurement.getName().equals(r.getName())) {
				toRemove = r;
				break;
			}
		}
		if(toRemove != null)
			evaluation.getMeasurements().remove(toRemove);
		evaluation.getMeasurements().add(measurement);
	}
	
	protected AppliedQuantitativePropertyEvaluation evaluate(AppliedQuantitativeProperty p, AppliedQuantitativePropertyEvaluation evaluation) {		
//		Measurement randomRealization = RandomObservationStrategy.createRandomRealization(p);
//		addOrReplaceRealization(evaluation, randomRealization);
		
		ValueSpecification value = retrieveValue(evaluation);
		if(value == null)
			return null;

		evaluation.setValue(MigrationFactory.copy(value));
		return evaluation;
	}
	
	protected List<ValueSpecification> getValues(List<Measurement> measurements) {
		if(measurements == null)
			return Collections.emptyList();
		
		List<ValueSpecification> values = new ArrayList<ValueSpecification>();
		for(Measurement measurement : measurements)
			if(measurement instanceof DataPointMeasurement)
				values.add(((DataPointMeasurement)measurement).getValue());
			else if(measurement instanceof TimeSeriesMeasurement)
				for(TimeValuePair pair : ((TimeSeriesMeasurement)measurement).getValues())
					values.add(pair.getValue());
		return values;
	}
	
	protected ValueSpecification retrieveValue(AppliedQuantitativePropertyEvaluation evaluation) {
		List<ValueSpecification> values = getValues(evaluation.getMeasurements());
		DataType type = evaluation.getProperty().getProperty().getType();
		
		if(values.isEmpty()) {
			ValueSpecificationExpressionEvaluation valueEvaluation = GelFactory.eINSTANCE.createValueSpecificationExpressionEvaluation();
			valueEvaluation.setReason("No values found.");
			evaluation.setEvaluation(valueEvaluation);
			return null;
		}
		
		
		if(!UMLUtil.isInteger(type) && !UMLUtil.isReal(type)) {
			ValueSpecificationExpressionEvaluation valueEvaluation = GelFactory.eINSTANCE.createValueSpecificationExpressionEvaluation();
			valueEvaluation.setReason("First value of " + renderer.doRender("(", ")", ", ", values) + " = " + renderer.doRender(values.get(0)));
			valueEvaluation.setResult(MigrationFactory.copy(values.get(0)));
			evaluation.setEvaluation(valueEvaluation);
			return MigrationFactory.copy(values.get(0));
		}
		
		// numeric value
		List<BigDecimal> numbers = new ArrayList<BigDecimal>();
		BigDecimal current;
		for(ValueSpecification value : values) {
			current = ValueUtil.getNumberOrNull(value);
			if(current != null)
				numbers.add(current);
		}
		
		Operator function = evaluation.getProperty().getFunction();
		if(function == null)
			function = ArtistCommonFactory.eINSTANCE.createAvgOperator();
		
		BigDecimal result = null;
		if(function instanceof MinOperator) 
			result = NumericLogic.min(numbers);
		else if(function instanceof MaxOperator) 
			result = NumericLogic.max(numbers);
		else if(function instanceof SumOperator) 
			result = NumericLogic.sum(numbers);
		else if(function instanceof AvgOperator) 
			result = NumericLogic.avg(numbers);
		
		if(result == null)
			return null;
		
//		result = result.setScale(0, getSettings().getRoundingMode());
		
		NumberLiteral resultLiteral = MigrationFactory.createNumberLiteral(result);
		NumberExpressionEvaluation functionEvaluation = GelFactory.eINSTANCE.createNumberExpressionEvaluation();
		functionEvaluation.setResult(resultLiteral);
		functionEvaluation.setReason(renderer.doRender(function) + renderer.doRender("(", ")", ", ", numbers) + " = " + renderer.doRender(result));
		evaluation.setEvaluation(functionEvaluation);
		return resultLiteral;
	}
	
	protected AppliedQualitativePropertyEvaluation evaluate(AppliedQualitativeProperty p, AppliedQualitativePropertyEvaluation evaluation) {
		NumberExpressionEvaluation sumImpact = evaluateSum(p);
		
		evaluation.setEvaluation(sumImpact);
		evaluation.setValue(MigrationFactory.copy(sumImpact.getResult()));
		return evaluation;
	}
	
	private NumberExpressionEvaluation evaluateSum(AppliedQualitativeProperty p) {
		List<NumberExpressionEvaluation> evaluations = new ArrayList<NumberExpressionEvaluation>();
		NumberExpressionEvaluation impactEvaluation;
		
		for(AppliedProperty property : getRelevantProperties()) {
			for(PropertyImpact impact : property.getProperty().getImpacts()) {
				impactEvaluation = evaluateImpact(p.getProperty(), impact, property.getProperty().getName());
				if(impactEvaluation != null)
					evaluations.add(impactEvaluation);
			}
		}
		
		for(Transformation transformation : getRelevantTransformations())
			for(PropertyImpact impact : transformation.getPattern().getPropertyImpacts()) {
				impactEvaluation = evaluateImpact(p.getProperty(), impact, transformation.getPattern().getName());
				if(impactEvaluation != null)
					evaluations.add(impactEvaluation);
			}
		
		NumberExpressionEvaluation sumImpactEvaluation = GelFactory.eINSTANCE.createNumberExpressionEvaluation();
		
		BigDecimal influence = new BigDecimal(0, getSettings().getMathContext());
		for(NumberExpressionEvaluation val : evaluations)
			influence = influence.add(ValueUtil.valueOf(val.getResult()), settings.getMathContext());
		
		sumImpactEvaluation.getEvaluations().addAll(evaluations);
		sumImpactEvaluation.setReason("Sum of all impacts.");
		sumImpactEvaluation.setResult(MigrationFactory.createNumberLiteral(influence));
		return sumImpactEvaluation;
	}

	private NumberExpressionEvaluation evaluateImpact(Property target, PropertyImpact impact, String sourceRender) {
		NumberLiteral impactValue = null;
		if(impact.getTarget().getName().equals(target.getName()))
			impactValue = MigrationFactory.createNumberLiteral(impact.getImpact());
		
		if(impactValue == null)
			return null;
		
		NumberExpressionEvaluation evaluation = GelFactory.eINSTANCE.createNumberExpressionEvaluation();
		evaluation.setResult(impactValue);
		evaluation.setReason(sourceRender + ": " + renderer.doRender(impactValue));
		return evaluation;
	}
}
