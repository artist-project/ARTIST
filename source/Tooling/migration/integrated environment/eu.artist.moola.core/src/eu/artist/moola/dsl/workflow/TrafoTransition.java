/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.moola.dsl.workflow;

import java.util.List;

import eu.artist.moola.dsl.core.Transformation;
import eu.artist.moola.workflow.Place;
import eu.artist.moola.workflow.Token;
import eu.artist.moola.workflow.Transition;

public class TrafoTransition extends Transition {

	private Transformation trafo;
	private Place inputPlace;
	
	public TrafoTransition(String name, Transformation trafo) {
		super(name);
		this.trafo = trafo;
	}
	
	@Override
	protected List<Token> process(List<Token> inputs) {
		// perform the actual code declared in the transformation
		this.trafo.run();
		// "regular" token forwarding
		return inputs;
	}

	public Place getInputPlace() {
		return inputPlace;
	}

	public void setInputPlace(Place inputPlace) {
		this.inputPlace = inputPlace;
	}
	
}
