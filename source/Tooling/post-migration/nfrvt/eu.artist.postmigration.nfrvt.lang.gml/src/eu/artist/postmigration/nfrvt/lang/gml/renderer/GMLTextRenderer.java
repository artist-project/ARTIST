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
package eu.artist.postmigration.nfrvt.lang.gml.renderer;

import org.eclipse.uml2.uml.NamedElement;

import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.gml.gml.AppliedQuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalKind;
import eu.artist.postmigration.nfrvt.lang.gml.gml.GoalReference;
import eu.artist.postmigration.nfrvt.lang.gml.gml.Workload;
import eu.artist.postmigration.nfrvt.lang.nsl.renderer.NSLTextRenderer;

public class GMLTextRenderer extends NSLTextRenderer {

	protected String render(AppliedQuantitativePropertyExpression e) {
		if (e.getValue().getFunction() == null)
			return "$" + e.getValue().getName();
		return doRender(e.getValue().getFunction()) + "($"
				+ e.getValue().getName() + ")";
	}

	protected String render(GoalReference l) {
		return l.getValue().getName();
	}

	protected String render(GoalKind kind) {
		return kind.getName();
	}

	protected String render(Workload workload) {
		return workload.getName() + ": " + workload.getActivity().getName()
				+ " (" + workload.getPattern() + ")";
	}

	protected String render(AppliedQualitativeProperty property) {
		return "$" + property.getName();
	}

	protected String render(AppliedQuantitativeProperty property) {
		if (property.getFunction() == null)
			return "$" + property.getName();
		return doRender(property.getFunction()) + "($" + property.getName()
				+ ")";
	}

	protected String render(NamedElement element) {
		return element.getQualifiedName();
	}

}