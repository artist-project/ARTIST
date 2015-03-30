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


public class CacheTemplate extends AbstractAppliedPatternTemplate {

	private static final long serialVersionUID = 7585510161515534757L;
	
	public CacheTemplate(UMLElement[] possibleApplications) {
		super("Cache", new String[] { getApplicationParameter() }, possibleApplications);
	}

	@Override
	public CacheTemplate copy() {
		CacheTemplate instance = new CacheTemplate(getPossibleApplications());
		copyParameterValues(this, instance);
		return instance;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getApplication() + ")";
	}
}
