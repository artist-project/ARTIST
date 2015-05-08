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

import java.util.ArrayList;
import java.util.List;

public abstract class UMLMethodContainer extends UMLElement {
	private List<UMLMethod> methods = new ArrayList<>();
	
	public UMLMethodContainer(String name) {
		super(name);
	}

	protected List<UMLMethod> getMethods() {
		return methods;
	}

	protected boolean hasMethod(String simpleName) {
		return getMethod(simpleName) != null;
	}
	
	protected boolean hasMethod(UMLMethod method) {
		return getMethods().contains(method);
	}
	
	protected UMLMethodContainer addMethod(UMLMethod method) {
		if(!hasMethod(method))
			this.methods.add(method);
		return this;
	}

	protected UMLMethod getMethod(String simpleName) {
		for(UMLMethod method : getMethods())
			if(method.getSimpleName().equals(simpleName))
				return method;
		return null;
	}
}
