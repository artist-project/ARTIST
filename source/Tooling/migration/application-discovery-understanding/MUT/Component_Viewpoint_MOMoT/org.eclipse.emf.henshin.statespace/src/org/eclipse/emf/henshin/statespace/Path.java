/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

import java.util.ArrayDeque;

/**
 * Data-type for paths in {@link StateSpace}s.
 * 
 * @generated NOT
 */
public class Path extends ArrayDeque<Transition> {
	
	// Default serial ID:
	private static final long serialVersionUID = 1L;
	
	// Source / target state, for empty paths:
	private State state;
	
	/**
	 * Default constructor.
	 */
	public Path() {
		super();
	}
	
	/**
	 * Alternative constructor.
	 */
	public Path(State state) {
		super();
		setState(state);
	}
	
	/**
	 * Alternative constructor.
	 * @param transitions Transitions.
	 */
	public Path(Transition... transitions) {
		super();
		for (Transition transition : transitions) {
			addLast(transition);
		}
	}

	public State getSource() {
		return isEmpty() ? state : getFirst().getSource();
	}
	
	public State getTarget() {
		return isEmpty() ? state : getLast().getTarget();
	}
		
	public void setState(State state) {
		this.state = state;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractCollection#toString()
	 */
	@Override
	public String toString() {
		if (isEmpty()) {
			return "empty";
		} else {
			String result = "";
			boolean first = true;
			for (Transition t : this) {
				if (first) {
					result = t.getSource().getIndex() + "";
				}
				result = result + " --" + t.getLabel() + "--> " + t.getTarget().getIndex();
				first = false;
			}
			return result;
		}
	}
	
}