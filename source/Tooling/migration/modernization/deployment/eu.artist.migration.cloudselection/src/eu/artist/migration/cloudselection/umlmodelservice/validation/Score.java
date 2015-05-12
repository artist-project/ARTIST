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

public class Score {

	protected int maxScore;
	protected float actualScore;
	
	public Score(){
		maxScore = 0; 
		actualScore = 0;
	}
	
	public void increaseActualScore(float scoreToAdd){
		actualScore = actualScore + scoreToAdd;
	}
	
	public void increaseMaxScore(){
		maxScore++;
	}
}
