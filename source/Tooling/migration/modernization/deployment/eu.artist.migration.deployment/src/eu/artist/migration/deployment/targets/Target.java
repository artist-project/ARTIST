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

package eu.artist.migration.deployment.targets;


/**
 * List of supported deployment Cloud targets
 * @author Jesús Gorroñogoitia
 *
 */
public enum Target {
		GAE ("Google App Engine"), AWS ("Amazon Web Services"), Azure ("Microsoft Azure");
	
	private String label;
	
	/**
	 * Default constructor
	 * @param label The Cloud target label to display 
	 */
	Target (String label){
		this.label = label;
	}
	
	/**
	 * It returns the cloudifier label
	 * @return
	 */
	public String getLabel(){
		return label;
	}
	
	
} // TODO Read available Cloud target deployment tools from configuration
