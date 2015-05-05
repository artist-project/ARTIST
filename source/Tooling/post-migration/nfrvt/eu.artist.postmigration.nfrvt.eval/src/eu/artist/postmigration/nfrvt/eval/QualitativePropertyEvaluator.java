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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.common.eval.EvaluationSettings;
import eu.artist.postmigration.nfrvt.lang.common.eval.util.ValueUtil;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;

public class QualitativePropertyEvaluator {
	private static GELTextRenderer renderer = new GELTextRenderer();
	private List<Transformation> transformations;
	private EvaluationSettings settings;

	private List<AppliedQualitativeProperty> tempProperties;
	
	public QualitativePropertyEvaluator(EvaluationSettings settings, List<Transformation> transformations) {
		this.settings = settings;
		renderer.setPrecision(settings.getPrecision());
		this.transformations = transformations;	
	}
	
	public List<Transformation> getTransformations() {
		return transformations;
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	public void setProperties(List<AppliedQualitativeProperty> properties) {
		tempProperties = properties;
	}
	
	public List<AppliedQualitativeProperty> getProperties() {
		if(tempProperties == null)
			tempProperties = new ArrayList<>();
		return tempProperties;
	}
	
	public Map<AppliedQualitativeProperty, AppliedQualitativePropertyEvaluation> evaluate(List<AppliedQualitativeProperty> properties) {
		setProperties(properties);
		
		Map<AppliedQualitativeProperty, AppliedQualitativePropertyEvaluation> evaluations =
				new HashMap<>();
		for(AppliedQualitativeProperty property : properties) {
			NumberExpressionEvaluation valueEvaluation = evaluateSum(property);
			evaluations.put(property,
					MigrationFactory.createAppliedQualitativePropertyEvaluation(
					property.getName() + getSettings().getSuffix(), 
					property, 
					MigrationFactory.copy(valueEvaluation.getResult()), 
					valueEvaluation));
		}
		
		setProperties(null);
		return evaluations;
	}
	
	private NumberExpressionEvaluation evaluateSum(AppliedQualitativeProperty appliedProperty) {
		List<NumberExpressionEvaluation> evaluations = new ArrayList<NumberExpressionEvaluation>();
		NumberExpressionEvaluation impactEvaluation;
		
//		for(AppliedProperty property : getProperties()) {
//			for(PropertyImpact impact : property.getProperty().getImpacts()) {
//				impactEvaluation = evaluateImpact(
//						appliedProperty.getProperty(), 
//						impact, 
//						property.getProperty().getName());
//				if(impactEvaluation != null)
//					evaluations.add(impactEvaluation);
//			}
//		}
		
		for(Transformation transformation : getTransformations())
			for(PropertyImpact impact : transformation.getPattern().getPropertyImpacts()) {
				impactEvaluation = evaluateImpact(
						appliedProperty.getProperty(), 
						impact, 
						transformation.getPattern().getName());
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
