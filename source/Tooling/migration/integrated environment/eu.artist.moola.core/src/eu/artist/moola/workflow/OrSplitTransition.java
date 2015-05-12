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
package eu.artist.moola.workflow;

import java.util.ArrayList;
import java.util.List;

import eu.artist.moola.workflow.exceptions.TransitionFailedException;

public class OrSplitTransition extends Transition {

	protected Arc outputArc;
	
	public OrSplitTransition(String name) {
		super(name);
	}
	
	/**
	 * The OrSplit transition determines, which arc will get the tokens (there can only be
	 * one arc, otherwise an exception is thrown).
	 */
	@Override
	protected List<Token> process(List<Token> inputs) {
		List<Arc> relevants = new ArrayList<>();
		List<Arc> elseArcs = new ArrayList<>();
		
		for(Arc output : this.outputs) {
			if(output.isElseArc()) {
				elseArcs.add(output);
			} else if(output.evaluateCondition(inputs)) {
				relevants.add(output);
			}
		}
		
		if(relevants.size() == 0 && elseArcs.size() != 0){
			relevants = elseArcs; // set the elseArcs relevant when there is no other arc fulfilling the condition
		} 

		if(relevants.size() != 1){
			throw new TransitionFailedException("Unexpected number of conditions match: " + relevants.size());
		} else {
			this.outputArc = relevants.get(0);
		}

		return inputs; // forward all tokens
	}
	
	@Override
	protected void distributeOutputTokens(List<Token> outputs) {
		this.outputArc.moveTokens(outputs);
	}
	
}
