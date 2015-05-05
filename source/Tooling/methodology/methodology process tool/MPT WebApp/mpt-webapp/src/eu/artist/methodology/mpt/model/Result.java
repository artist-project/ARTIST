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
package eu.artist.methodology.mpt.model;

public class Result {

	boolean booleanResult;
	String stringResult;
	Integer integerResult;
	
	public boolean getBooleanResult() {
		return booleanResult;
	}
	public void setBooleanResult(boolean booleanResult) {
		this.booleanResult = booleanResult;
	}
	public String getStringResult() {
		return stringResult;
	}
	public void setStringResult(String stringResult) {
		this.stringResult = stringResult;
	}
	public Integer getIntegerResult() {
		return integerResult;
	}
	public void setIntegerResult(Integer integerResult) {
		this.integerResult = integerResult;
	}
}
