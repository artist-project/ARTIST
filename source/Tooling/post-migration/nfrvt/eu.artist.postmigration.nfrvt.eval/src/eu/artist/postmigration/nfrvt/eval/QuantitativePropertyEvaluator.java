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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xtext.EcoreUtil2;

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
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GelFactory;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.renderer.GELTextRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.pml.pml.ApplicationMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.DataPointMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeSeriesMeasurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.TimeValuePair;
import eu.artist.postmigration.nfrvt.lang.util.CollectionUtil;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;

public class QuantitativePropertyEvaluator {
	private static GELTextRenderer renderer = new GELTextRenderer();
	
	private List<MeasurementModel> measurements;
	private EvaluationSettings settings;

	public QuantitativePropertyEvaluator(EvaluationSettings settings, List<MeasurementModel> measurements) {
		this.settings = settings;
		renderer.setPrecision(settings.getPrecision());
		this.measurements = measurements;
	}
	
	public EvaluationSettings getSettings() {
		return settings;
	}
	
	public List<MeasurementModel> getMeasurements() {
		return measurements;
	}
	
	protected boolean equals(EObject leftObject, EObject rightObject) {
		URI leftUri = EcoreUtil2.getURI(leftObject);
		URI rightUri = EcoreUtil2.getURI(rightObject);
		boolean equals = leftUri.equals(rightUri);
		return equals;
	}
	
	protected List<Measurement> extractMeasurements(AppliedQuantitativeProperty property) {
		List<String> uris = new ArrayList<>();
		for(NamedElement element : property.getContext())
			uris.add(EcoreUtil2.getURI(element).toString());
		
		List<Measurement> relevantMeasurements = new ArrayList<>();
		for(MeasurementModel measurementModel : getMeasurements()) {
			for(Observation observation : measurementModel.getObservations())
				for(Measurement measurement : observation.getMeasurements())
					if(measurement instanceof ApplicationMeasurement && equals(measurement.getProperty(), property.getProperty()) &&
						uris.contains(EcoreUtil2.getURI(((ApplicationMeasurement)measurement).getContext()).toString()))
						relevantMeasurements.add(measurement);
		}
		return relevantMeasurements;
	}
	
	protected List<Measurement> sort(List<Measurement> relevantMeasurements) {
		return relevantMeasurements;
	}
	
	public Map<AppliedQuantitativeProperty, AppliedQuantitativePropertyEvaluation> evaluate(List<AppliedQuantitativeProperty> properties) {
		Map<AppliedQuantitativeProperty, AppliedQuantitativePropertyEvaluation> evaluations = new HashMap<>();
		for(AppliedQuantitativeProperty property : properties) {
			AppliedQuantitativePropertyEvaluation evaluation = evaluate(property);
			if(evaluation != null) 
				evaluations.put(property, evaluation);
		}
		return evaluations;
	}
	
	public AppliedQuantitativePropertyEvaluation evaluate(AppliedQuantitativeProperty property) {
		List<Measurement> relevantMeasurements = sort(extractMeasurements(property));
		
		AppliedQuantitativePropertyEvaluation evaluation = 
				GelFactory.eINSTANCE.createAppliedQuantitativePropertyEvaluation();
		
		evaluation.setName(property.getName() + getSettings().getSuffix());
		evaluation.setProperty(property);
		CollectionUtil.add(relevantMeasurements, evaluation.getMeasurements());
		
		ValueSpecification value = internalEvaluate(evaluation);
		if(value == null)
			return null;

		evaluation.setValue(value);
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
	
	protected ValueSpecification internalEvaluate(AppliedQuantitativePropertyEvaluation evaluation) {
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
		return MigrationFactory.copy(resultLiteral);
	}
}
