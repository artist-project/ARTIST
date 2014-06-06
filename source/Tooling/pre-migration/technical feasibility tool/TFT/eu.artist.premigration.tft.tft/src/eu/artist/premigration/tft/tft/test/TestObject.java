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
package eu.artist.premigration.tft.tft.test;

public class TestObject {

	String a;
	String b;

	public TestObject(){

	}

	public TestObject(String a, String b){
		this.a = a;
		this.b = b;
	}

	public void setA(String a){
		this.a = a;
	}
	public void setB(String b){
		this.b = b;
	}
	public String getA(){
		return a;
	}
	public String getB(){
		return b;
	}
}
