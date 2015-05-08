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

public class FederatedIdentityTemplate extends AbstractAppliedPatternTemplate {

	private static final long serialVersionUID = 5970171868490307046L;

	public FederatedIdentityTemplate(UMLElement possibleApplication) {
		super("FederatedIdentity", new UMLElement[] { possibleApplication });
	}
	
	public FederatedIdentityTemplate(UMLElement[] possibleApplications) {
		super("FederatedIdentity", possibleApplications);
	}
	
	@Override
	public FederatedIdentityTemplate copy() {
		FederatedIdentityTemplate instance = new FederatedIdentityTemplate(getPossibleApplications());
		copyParameterValues(this, instance);
		return instance;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getApplication() + ")";
	}

}
