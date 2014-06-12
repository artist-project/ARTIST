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

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQualitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedQuantitativePropertyEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.BooleanExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.CompositeGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.GoalModelEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.HardGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.MigrationEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.NumberExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.QuantitativePropertyRealization;
import eu.artist.postmigration.nfrvt.lang.gel.gel.SoftGoalEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Transformation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gml.renderer.GMLTextRenderer;

public class GELTextRenderer extends GMLTextRenderer {
	
	protected String render(MigrationEvaluation evaluation) {
		return evaluation.getDate() + " > " + evaluation.getName();
	}
	
	protected String render(Transformation transformation) {
		return transformation.getPattern().getName() + " > " + transformation.getName();
	}
	
	protected String render(GoalModelEvaluation goalModelEvaluation) {
		return "Evaluation of " + goalModelEvaluation.getGoalModel().getName();
	}
	
	protected String render(Verdict verdict) {
		return verdict.getLiteral();
	}
	
	protected String render(SoftGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + " > " + evaluation.getName() + ": " + render(evaluation.getVerdict());
	}
	
	protected String render(HardGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + " > " + evaluation.getName() + ": " + render(evaluation.getVerdict());
	}
	
	protected String render(CompositeGoalEvaluation evaluation) {
		return evaluation.getGoal().getName() + " > " + evaluation.getName() + ": " + render(evaluation.getVerdict());
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
	
	protected String render(QuantitativePropertyRealization value) {
		return value.getStrategy().getLevel() + " > " + value.getType().getLiteral() + " > " + value.getStrategy().getName();
	}
}