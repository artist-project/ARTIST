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

import at.ac.tuwien.big.moea.util.TextUtil;

public class UMLScenario extends UMLMethodContainer {
	
	public UMLScenario(String name) {
		super(name);
	}
	
	public UMLScenario(String name, UMLMethod... steps) {
		super(name);
		for(UMLMethod step : steps)
			addMethod(step);
	}
	
	public List<UMLMethod> getSteps() {
		return super.getMethods();
	}

	public UMLScenario addStep(UMLMethod step) {
		super.addMethod(step);
		return this;
	}
	
	@Override
	public String toString() {
		return toString("");
	}
	
	public String toString(String indent) {
		String scenario = "";
		String delimiter = "";
		for(UMLMethod step : getSteps()) {
			scenario += delimiter + indent + step.getName() + " (" + TextUtil.toString(step.getExecutionTime()) + ")";
			delimiter = " ->\n";
		}
		return scenario;
	}
}
