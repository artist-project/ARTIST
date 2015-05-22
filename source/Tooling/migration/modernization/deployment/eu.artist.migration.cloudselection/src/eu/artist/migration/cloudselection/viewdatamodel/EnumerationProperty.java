/*******************************************************************************
 * Copyright (c) 2015 ICCS/NTUA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Aliki Kopaneli
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/ 

package eu.artist.migration.cloudselection.viewdatamodel;

public class EnumerationProperty extends HelperElement{
	
	protected String parentStereotype;
	
	public EnumerationProperty(String referencedProperty, String parentStereotype){
		super(referencedProperty);
		this.parentStereotype = parentStereotype;
	}

	public String getReferencedProperty() {
		return name;
	}
	
	public String getParentStereotype(){
		return parentStereotype;
	}
}
