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

import eu.artist.postmigration.nfrvt.lang.gel.validation.GELLabelRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
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
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;

public class PropertyEvaluator {
	
	private static GELLabelRenderer renderer = new GELLabelRenderer();
	
	private Set<Transformation> relevantTransformations;
	private EvaluationSettings settings;
	private List<AppliedProperty> relevantProperties;
	
	public PropertyEvaluator(Set<Transformation> relevantTransformations, EvaluationSettings settings) {
		this.relevantTransformations = relevantTransformations;
		this.settings = settings;
	}
	
	public void setSettings(EvaluationSettings s) {
		settings = s;
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	public void setRelevantTransformations(Set<Transformation> relevantTransformations) {
		this.relevantTransformations = relevantTransformations;
	}
	
	public Set<Transformation> getRelevantTransformations() {
		if(relevantTransformations == null)
			return Collections.emptySet();
		return relevantTransformations;
	}
	
	public void setRelevantProperties(List<AppliedProperty> relevantProperties) {
		this.relevantProperties = relevantProperties;
	}
	
	public List<AppliedProperty> getRelevantProperties() {
		if(relevantProperties == null)
			return Collections.emptyList();
		return relevantProperties;
	}
	
	public Map<AppliedProperty, AppliedPropertyEvaluation> evaluate(List<AppliedProperty> appliedProperties, Map<AppliedProperty, AppliedPropertyEvaluation> existingEvaluations) {
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
	
	public AppliedPropertyEvaluation evaluate(AppliedProperty property, AppliedPropertyEvaluation evaluation) {
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
	
	public void addOrReplaceRealization(AppliedQuantitativePropertyEvaluation evaluation, QuantitativePropertyRealization realization) {
		if(realization == null || evaluation == null || realization.getName() == null)
			return;
		QuantitativePropertyRealization toRemove = null;
		for(QuantitativePropertyRealization r : evaluation.getRealizations()) {
			if(realization.getName().equals(r.getName())) {
				toRemove = r;
				break;
			}
		}
		if(toRemove != null)
			evaluation.getRealizations().remove(toRemove);
		evaluation.getRealizations().add(realization);
	}
	
	public AppliedQuantitativePropertyEvaluation evaluate(AppliedQuantitativeProperty p, AppliedQuantitativePropertyEvaluation evaluation) {		
		QuantitativePropertyRealization randomRealization = RandomRealizationStrategy.createRandomRealization(p);
		addOrReplaceRealization(evaluation, randomRealization);
		
		ValueSpecification value = retrieveValue(evaluation);
		if(value == null)
			return null;

		evaluation.setValue(ValueUtil.copy(value));
		return evaluation;
	}
	
	public List<ValueSpecification> getValues(List<QuantitativePropertyRealization> realizations) {
		if(realizations == null)
			return Collections.emptyList();
		
		List<ValueSpecification> values = new ArrayList<ValueSpecification>();
		for(QuantitativePropertyRealization realization : realizations)
			values.addAll(realization.getValues());
		return values;
	}
	
	public ValueSpecification retrieveValue(AppliedQuantitativePropertyEvaluation evaluation) {
		List<ValueSpecification> values = getValues(evaluation.getRealizations());
		DataType type = evaluation.getProperty().getProperty().getType();
		
		if(values.isEmpty()) {
			ValueSpecificationExpressionEvaluation valueEvaluation = GelFactory.eINSTANCE.createValueSpecificationExpressionEvaluation();
			valueEvaluation.setReason("No values found.");
			evaluation.setEvaluation(valueEvaluation);
			return null;
		}
		
		if(!UMLUtil.isInteger(type) && !UMLUtil.isReal(type)) {
			ValueSpecificationExpressionEvaluation valueEvaluation = GelFactory.eINSTANCE.createValueSpecificationExpressionEvaluation();
			valueEvaluation.setReason("First value of " + renderer.renderList(values, ValueSpecification.class, "(", ")", ", ") + " = " + renderer.render(values.get(0)));
			valueEvaluation.setResult(ValueUtil.copy(values.get(0)));
			evaluation.setEvaluation(valueEvaluation);
			return ValueUtil.copy(values.get(0));
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
		
		NumberLiteral resultLiteral = ValueUtil.createNumberLiteral(result);
		NumberExpressionEvaluation functionEvaluation = GelFactory.eINSTANCE.createNumberExpressionEvaluation();
		functionEvaluation.setResult(resultLiteral);
		functionEvaluation.setReason(renderer.render(function) + renderer.renderList(numbers, BigDecimal.class, "(", ")", ", ") + " = " + renderer.render(result));
		evaluation.setEvaluation(functionEvaluation);
		return resultLiteral;
	}
	
	public AppliedQualitativePropertyEvaluation evaluate(AppliedQualitativeProperty p, AppliedQualitativePropertyEvaluation evaluation) {
		NumberExpressionEvaluation sumImpact = evaluateSum(p);
		
		evaluation.setEvaluation(sumImpact);
		evaluation.setValue(ValueUtil.copy(sumImpact.getResult()));
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
		
		BigDecimal influence = new BigDecimal(0, settings.getMathContext());
		for(NumberExpressionEvaluation val : evaluations)
			influence = influence.add(ValueUtil.valueOf(val.getResult()), settings.getMathContext());
		
		sumImpactEvaluation.getEvaluations().addAll(evaluations);
		sumImpactEvaluation.setReason("Sum of all impacts.");
		sumImpactEvaluation.setResult(ValueUtil.createNumberLiteral(influence));
		return sumImpactEvaluation;
	}

	private NumberExpressionEvaluation evaluateImpact(Property target, PropertyImpact impact, String sourceRender) {
		NumberLiteral impactValue = null;
		if(impact.getTarget().getName().equals(target.getName()))
			impactValue = ValueUtil.createNumberLiteral(impact.getImpact());
		
		if(impactValue == null)
			return null;
		
		NumberExpressionEvaluation evaluation = GelFactory.eINSTANCE.createNumberExpressionEvaluation();
		evaluation.setResult(impactValue);
		evaluation.setReason(sourceRender + ": " + renderer.render(impactValue));
		return evaluation;
	}
}
