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
package eu.artist.postmigration.nfrvt.lang.gml.validation;

import org.eclipse.uml2.uml.NamedElement;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.BooleanUnit;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.Expression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberExpression;
import eu.artist.postmigration.nfrvt.lang.common.validation.ARTISTCommonRenderer;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;
import eu.artist.postmigration.nfrvt.lang.nsl.validation.NSLLabelRenderer;

public class GMLLabelRenderer extends NSLLabelRenderer {
	
	public class HardGoalRenderer extends ARTISTCommonRenderer {
		@Override
		public String render(NumberExpression e) {
			String returnValue = null;
			if(e instanceof AppliedQuantitativePropertyExpression)
				returnValue = render((AppliedQuantitativePropertyExpression)e);
			
			if(returnValue != null)
				return returnValue;
			return super.render(e);
		}

		private String render(AppliedQuantitativePropertyExpression e) {
			if(e.getValue().getFunction() == null)
				return "$" + e.getValue().getName();
			return render(e.getValue().getFunction()) + "($" + e.getValue().getName() + ")";
		}

	}
	
	public class CompositeGoalRenderer extends ARTISTCommonRenderer {
		@Override
		public String render(BooleanUnit e) {
			String returnValue = null;
			if(e instanceof GoalReference)
				returnValue = render((GoalReference)e);
			
			if(returnValue != null)
				return returnValue;
			return super.render(e);
		}
		
		public String render(GoalReference l) {
			return l.getValue().getName();
		}
	}
	
	private HardGoalRenderer hardGoalRenderer = new HardGoalRenderer();
	private CompositeGoalRenderer compositeGoalRenderer = new CompositeGoalRenderer();
	
	@Override
	public String render(Expression e) {
		return hardGoalRenderer.render(e);
	}
	
	public String render(GoalExpression e) {
		return compositeGoalRenderer.render(e);
	}
	
	public String render(GoalKind kind) {
		return kind.getName();
	}
	
	public String render(Workload workload) {
		return workload.getName() + ": " + workload.getActivity().getName() + " (" + workload.getPattern() + ")";
	}
	
	public String render(AppliedProperty property) {
		if(property instanceof AppliedQualitativeProperty)
			return render((AppliedQualitativeProperty)property);
		
		if(property instanceof AppliedQuantitativeProperty)
			return render((AppliedQuantitativeProperty)property);
		
		return null;
	}
	
	public String render(AppliedQualitativeProperty property) {
		return "$" + property.getName();
	}
	
	public String render(AppliedQuantitativeProperty property) {
		if(property.getFunction() == null)
			return "$" + property.getName();
		return render(property.getFunction()) + "($" + property.getName() + ")";
	}
	
	public String render(NamedElement element) {
		return element.getQualifiedName();
	}
	
	@Override
	public String render(BooleanUnit e) {
		String returnValue = null;
		if(e instanceof GoalReference)
			returnValue = render((GoalReference)e);
		
		if(returnValue != null)
			return returnValue;
		return super.render(e);
	}
	
	public String render(GoalReference l) {
		return "$" + l.getValue().getName();
	}
	
	@Override
	public String render(NumberExpression e) {
		String returnValue = null;
		if(e instanceof AppliedQuantitativePropertyExpression)
			returnValue = render((AppliedQuantitativePropertyExpression)e);
		
		if(returnValue != null)
			return returnValue;
		return super.render(e);
	}

	private String render(AppliedQuantitativePropertyExpression e) {
		if(e.getValue().getFunction() == null)
			return "$" + e.getValue().getName();
		return render(e.getValue().getFunction()) + "($" + e.getValue().getName() + ")";
	}
}