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
package eu.artist.postmigration.opgml.gml.uml;

import java.util.List;


public class UMLClass extends UMLMethodContainer {

	public UMLClass(String name) {
		super(name);
	}
	
	@Override
	public List<UMLMethod> getMethods() {
		return super.getMethods();
	}
	
	@Override
	public boolean hasMethod(String simpleName) {
		return super.hasMethod(simpleName);
	}
	
	@Override
	public boolean hasMethod(UMLMethod method) {
		return super.hasMethod(method);
	}
	
	@Override
	public UMLMethodContainer addMethod(UMLMethod method) {
		return super.addMethod(method);
	}

	@Override
	public UMLMethod getMethod(String simpleName) {
		return super.getMethod(simpleName);
	}

	public UMLClass addMethod(String name, double executionTime) {
		addMethod(new UMLMethod(this, name, executionTime));
		return this;
	}
}
