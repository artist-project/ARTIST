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
package eu.artist.postmigration.opgml.gml;

public class PatternTemplate<T extends Object> extends ParameterList<T> implements IPatternTemplate<T> {
	private String name;
	
	public PatternTemplate() {
		this.name = getClass().getSimpleName();
	}
	
	public PatternTemplate(String name) {
		this.name = name;
	}
	
	public PatternTemplate(String name, ParameterList<T> parameters) {
		this.name = name;
		if(parameters != null)
			setParameters(parameters);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
