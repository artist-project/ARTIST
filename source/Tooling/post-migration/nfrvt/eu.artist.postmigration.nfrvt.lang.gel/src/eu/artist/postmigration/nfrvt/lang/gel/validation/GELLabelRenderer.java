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
package eu.artist.postmigration.nfrvt.lang.gel.validation;

import eu.artist.postmigration.nfrvt.lang.gel.gel.AppliedPropertyEvaluation;
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
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.ValueSpecificationExpressionEvaluation;
import eu.artist.postmigration.nfrvt.lang.gel.gel.Verdict;
import eu.artist.postmigration.nfrvt.lang.gml.validation.GMLLabelRenderer;

public class GELLabelRenderer extends GMLLabelRenderer {
	
	public String render(MigrationEvaluation evaluation) {
		return evaluation.getDate() + " > " + evaluation.getName();
	}
	
	public String render(Transformation transformation) {
		return transformation.getPattern().getName() + " > " + transformation.getName();
	}
	
	public String render(GoalModelEvaluation goalModelEvaluation) {
		return goalModelEvaluation.getGoalModel().getName();
	}
	
	public String render(Verdict verdict) {
		return verdict.getLiteral();
	}
	
	public String render(SoftGoalEvaluation evaluation) {
		return evaluation.getName() + " > " + evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}
	
	public String render(HardGoalEvaluation evaluation) {
		return evaluation.getName() + " > " + evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}
	
	public String render(CompositeGoalEvaluation evaluation) {
		return evaluation.getName() + " > " + evaluation.getGoal().getName() + ": " + render(evaluation.getVerdict());
	}

	public String render(ValueExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		
		if(evaluation instanceof NumberExpressionEvaluation)
			return render((NumberExpressionEvaluation)evaluation);
		
		if(evaluation instanceof BooleanExpressionEvaluation)
			return render((BooleanExpressionEvaluation)evaluation);
		
		if(evaluation instanceof ValueSpecificationExpressionEvaluation)
			return render((ValueSpecificationExpressionEvaluation)evaluation);
		
		return render(evaluation.getResult());
	}
		
	public String render(NumberExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return render(evaluation.getResult());
	}
	
	public String render(BooleanExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return render(evaluation.getResult());
	}
	
	public String render(ValueSpecificationExpressionEvaluation evaluation) {
		if(evaluation == null)
			return null;
		return render(evaluation.getResult());
	}
	
	public String render(AppliedPropertyEvaluation evaluation) {
		if(evaluation instanceof AppliedQualitativePropertyEvaluation)
			return render((AppliedQualitativePropertyEvaluation)evaluation);
		
		if(evaluation instanceof AppliedQuantitativePropertyEvaluation)
			return render((AppliedQuantitativePropertyEvaluation)evaluation);
		
		return null;
	}
	
	public String render(AppliedQualitativePropertyEvaluation evaluation) {
		return render(evaluation.getProperty()) + " = " + render(evaluation.getValue());
	}
	
	public String render(AppliedQuantitativePropertyEvaluation evaluation) {
		return render(evaluation.getProperty()) + " = " + render(evaluation.getValue());
	}
	
	public String render(QuantitativePropertyRealization value) {
		return value.getStrategy().getLevel() + " > " + value.getType().getLiteral() + " > " + value.getStrategy().getName();
	}
}