/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.external.prism;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Transition labels for MDPs. The identity of MDPLabels is based on the
 * name of the applied rule together with the used match. This assumes that
 * rules with the same name have the same LHS (and other application conditions).
 * 
 * @author Christian Krause
 */
public class MDPLabel {

	// The transition:
	Transition transition;

	/**
	 * Default constructor.
	 * @param transition Transition.
	 */
	public MDPLabel(Transition transition) {
		this.transition = transition;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// Rule name and match matter:
		return transition.getRule().getName().hashCode() + transition.getMatch();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof MDPLabel) {
			MDPLabel l = (MDPLabel) o;
			// Same rule name and same match:
			return transition.getRule().getName().equals(l.transition.getRule().getName()) &&
					transition.getMatch()==l.transition.getMatch();
		}
		return false;
	}
	
	/**
	 * Returns the transition of this label.
	 * @return The transition.
	 */
	public Transition getTransition() {
		return transition;
	}

	/**
	 * For a given state, this method sorts its outgoing transitions
	 * by their labels and generates a map.
	 * @param state A state.
	 * @return Map associating labels to transition lists.
	 */
	public static Map<MDPLabel,List<Transition>> getTransitionsByLabel(State state) {
		Map<MDPLabel,List<Transition>> transitions = 
				new LinkedHashMap<MDPLabel,List<Transition>>();
		for (Transition transition : state.getOutgoing()) {
			MDPLabel label = new MDPLabel(transition);
			List<Transition> trs = transitions.get(label);
			if (trs==null) {
				trs = new ArrayList<Transition>();
				transitions.put(label, trs);
			}
			trs.add(transition);
		}
		return transitions;
	}

}
