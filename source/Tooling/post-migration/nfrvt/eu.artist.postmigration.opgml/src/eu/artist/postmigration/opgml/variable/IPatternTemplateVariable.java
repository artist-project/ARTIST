/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.opgml.variable;

import org.moeaframework.core.Variable;

import at.ac.tuwien.big.moea.util.random.IRandomizable;
import eu.artist.postmigration.opgml.gml.IAppliedPattern;
import eu.artist.postmigration.opgml.gml.IPatternTemplate;

public interface IPatternTemplateVariable extends 
	IPatternTemplate<Variable>, 
	IAppliedPattern<Variable>,
	Variable, 
	IRandomizable<IPatternTemplateVariable> {	
}
