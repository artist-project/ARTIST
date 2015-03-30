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

public class UMLMethod extends UMLElement {
	
	private UMLClass umlClass;
	private double executionTime;
	private String simpleName;
	
	public UMLMethod(UMLClass umlClass, String name, double executionTime) {
		super(name);
		if(!getName().startsWith(umlClass.getName())) {
			setName(umlClass.getName() + QUALIFYING_DELIMITER + name);
			setSimpleName(name);
		} else {
			String[] names = name.split(QUALIFYING_DELIMITER);
			setName(name);
			setSimpleName(names[names.length-1]);
		}
		this.umlClass = umlClass;
		this.executionTime = executionTime;
		umlClass.addMethod(this);
	}

	public double getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(double executionTime) {
		this.executionTime = executionTime;
	}

	public UMLClass getUMLClass() {
		return umlClass;
	}

	public void setUMLlClass(UMLClass umlClass) {
		this.umlClass = umlClass;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
}
