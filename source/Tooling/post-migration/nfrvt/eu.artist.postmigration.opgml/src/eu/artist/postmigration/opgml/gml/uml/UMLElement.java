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


public abstract class UMLElement implements Comparable<UMLElement> {
	
	public static final String QUALIFYING_DELIMITER = "::";
	
	private String name;

	public UMLElement(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(UMLElement other) {
		return getName().compareTo(other.getName());
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this)
			return true;
		if(other == null || other.getClass() != getClass())
			return false;
		
		return getName().equals(((UMLElement)other).getName());
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
