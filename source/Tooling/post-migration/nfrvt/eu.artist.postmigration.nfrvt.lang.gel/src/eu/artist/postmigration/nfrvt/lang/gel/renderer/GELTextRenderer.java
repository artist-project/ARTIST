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
package eu.artist.postmigration.nfrvt.lang.gel.renderer;

import eu.artist.postmigration.nfrvt.lang.common.ARTISTDateTimeValueConverter;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Workload;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gml.renderer.GMLTextRenderer;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Measurement;
import eu.artist.postmigration.nfrvt.lang.pml.pml.MeasurementModel;
import eu.artist.postmigration.nfrvt.lang.pml.pml.Observation;
import eu.artist.postmigration.nfrvt.lang.pml.renderer.PMLTextRenderer;

public class GELTextRenderer extends GMLTextRenderer {
	
	private PMLTextRenderer pmlRenderer = new PMLTextRenderer();
	
	@Override
	public void setPrecision(int precision) {
		super.setPrecision(precision);
		pmlRenderer.setPrecision(precision);
	}
	
	protected String render(MigrationEvaluation evaluation) {
		return evaluation.getName() + " at " + ARTISTDateTimeValueConverter.MILLISECONDS.format(evaluation.getDate());
	}
	
	protected String render(Transformation transformation) {
		return transformation.getPattern().getName() + ": " +
				doRender(transformation.getContext());
	}
	
	protected String render(GoalModelEvaluation evaluation) {
		return "Evaluation of " + evaluation.getGoalModel().getName() + ": " + render(evaluation.getVerdict());
	}
	
	protected String render(Verdict verdict) {
		return verdict.getLiteral();
	}
	
	protected String render(SoftGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}
	
	protected String render(HardGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}
	
	protected String render(CompositeGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}
		
	protected String render(NumberExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return doRender(evaluation.getReason());
	}
	
	protected String render(BooleanExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return doRender(evaluation.getReason());
	}
	
	protected String render(ValueSpecificationExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return doRender(evaluation.getReason());
	}
		
	protected String render(AppliedQualitativePropertyEvaluation evaluation) {
		return doRender(evaluation.getProperty()) + " = " + doRender(evaluation.getValue());
	}
	
	protected String render(AppliedQuantitativePropertyEvaluation evaluation) {
		return doRender(evaluation.getProperty()) + " = " + doRender(evaluation.getValue());
	}
	
	protected String render(Observation observation) {
		return pmlRenderer.doRender(observation);
	}

	protected String render(MeasurementModel model) {
		return pmlRenderer.doRender(model);
	}
	
	protected String render(Workload workload) {
		return pmlRenderer.doRender(workload);
	}

	protected String render(Measurement measurement) {
		return pmlRenderer.doRender(measurement); 
	}
}