/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.mpt.model;

/**
 * GlobalVariable class is a wrapper class for any object that is desired to be inserted into the Drools Knowledge session as a global variable
 * in the context of MPT.
 * <br><br>
 * An instance of GlobalVariable contains the name of the variable and the variable itself as an object of type ava.Lang.Object
 *
 */
public class GlobalVariable {
	
	String name;
	Object variable;
	
	public GlobalVariable(){
		
	}
	
	public GlobalVariable(String name, Object variable){
		this.name = name;
		this.variable = variable;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getVariable() {
		return variable;
	}
	public void setVariable(Object variable) {
		this.variable = variable;
	}
}
