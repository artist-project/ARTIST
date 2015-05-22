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

package eu.artist.migration.cloudselection.umlmodelservice.validation;

public abstract class Validator {
	
	public static class CompositeRequest{
		protected String stereotype;
		protected String property;
		protected String[] enumValues;
		
		public CompositeRequest(String stereotype, String property, String[] enumValues){
			this.stereotype = stereotype;
			this.property = property;
			this.enumValues = enumValues;
		}
				
		public String getProperty() {
			return property;
		}

		public String[] getEnumValues() {
			return enumValues;
		}
		
		public String getStereotype(){
			return stereotype;
		}
		
	}
		
}
