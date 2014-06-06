/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.model.migrationstrategy;


/**
 * Migration Strategy complexities
 * 
 * @author Burak Karaboga
 *
 */
public enum Complexity {

	UNKNOWN("Unknown", 0), LOW("Low", 1), AVERAGE("Average", 2), HIGH("High", 3);
	
	private String value;
	private int degree;
	
	private Complexity(String value, int degree) {
		this.value = value;
		this.degree = degree;
	}
	
	public String getValue(){
		return value;
	}
	
	public int getDegree(){
		return degree;
	}
}
