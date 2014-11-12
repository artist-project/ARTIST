/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/

package eu.artist.migration.mut.pimabstractor.abstractors;


/**
 * List of available component model abstractors
 * TODO Design a new mechanism to add new abstractors by configuration and not hard-coded.
 * TODO Consider to use Eclipse extension points to declare and provide additional abstractors
 * @author Jesús Gorroñogoitia
 *
 */
public enum Abstractors {
		GUI ("GUI", "platform:/plugin/eu.artist.repository.artefacts/profiles/gui.profile.uml", "GUIAbstractor"),
		RCP ("RCP", "platform:/plugin/eu.artist.repository.artefacts/profiles/rcp.profile.uml", "RCPAbstractor");
	
		
	private String label;
	private String profile;
	private String module;
	
	/**
	 * Default constructor
	 * @param label The abstractor label to display 
	 */
	Abstractors (String label, String profile, String module){
		this.label = label;
		this.profile = profile;
		this.module = module;
	}
	
	/**
	 * It returns the abstractor label
	 * @return
	 */
	public String getLabel(){
		return label;
	}
	
	/**
	 * It returns the abstractor UML profile
	 * @return
	 */
	public String getProfile(){
		return profile;
	}
	
	/**
	 * It returns the abstractor M2MT module
	 * @return
	 */
	public String getModule(){
		return module;
	}
	
	
} // TODO Read available component model generators from configuration
