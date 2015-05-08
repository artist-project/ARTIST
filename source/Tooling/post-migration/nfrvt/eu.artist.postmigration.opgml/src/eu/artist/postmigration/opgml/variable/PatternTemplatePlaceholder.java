/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package eu.artist.postmigration.opgml.variable;

import eu.artist.postmigration.opgml.gml.uml.UMLElement;
import eu.artist.postmigration.opgml.gml.uml.UMLModel;

public class PatternTemplatePlaceholder extends AbstractAppliedPatternTemplate {

	private static final long serialVersionUID = 6127429185808452608L;

	public PatternTemplatePlaceholder() {
		super("None", new UMLElement[] { UMLModel.NONE });
	}
		
	@Override
	public PatternTemplatePlaceholder copy() {
		return new PatternTemplatePlaceholder();
	}

	@Override
	public AbstractAppliedPatternTemplate randomize() {
		return this;
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
	@Override
	public int compareTo(IPatternTemplateVariable o) {
		if(o.getName().equals(getName()))
			return -1;
		return 1;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
