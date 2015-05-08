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

package eu.artist.migration.ct.gui.rcp2gwt.abstractors;


/**
 * List of available GUI cloudifiers
 * TODO Design a new mechanism to add new cloudifiers by configuration and not hard-coded.
 * TODO Consider to use Eclipse extension points to declare and provide additional cloudifiers
 * @author Jesús Gorroñogoitia
 *
 */
public enum Cloudifiers {
		RCP2GWT ("RCP2GWT", "platform:/plugin/eu.artist.repository.artefacts/pdms/GWT-PDM_v2.0.uml", "GWTMapper");
	
	private String label;
	private String pdm;
	private String module;
	
	/**
	 * Default constructor
	 * @param label The cloudifier label to display 
	 */
	Cloudifiers (String label, String pdm, String module){
		this.label = label;
		this.pdm = pdm;
		this.module = module;
	}
	
	/**
	 * It returns the cloudifier label
	 * @return
	 */
	public String getLabel(){
		return label;
	}
	
	/**
	 * It returns the cloudifier PDM
	 * @return
	 */
	public String getPDM(){
		return pdm;
	}
	
	/**
	 * It returns the cloudifier M2MT module
	 * @return
	 */
	public String getModule(){
		return module;
	}
	
	
} // TODO Read available component model generators from configuration
