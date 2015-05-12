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

import java.util.Collection;

import eu.artist.moola.workflow.ICondition;
import eu.artist.moola.workflow.Token;
import groovy.lang.Closure;

public class CodeCondition implements ICondition {
	
	private Closure<?> closure;
	
	public CodeCondition(Closure<?> closure) {
		this.closure = closure;
	}
	
	@Override
	public boolean evaluate(Collection<Token> tokens) {
		Object result = closure.call();
		if(result instanceof Boolean) {
			return (boolean) result;
		}
		throw new RuntimeException("Condition does not return a boolean. Result: " + result);
	}

}