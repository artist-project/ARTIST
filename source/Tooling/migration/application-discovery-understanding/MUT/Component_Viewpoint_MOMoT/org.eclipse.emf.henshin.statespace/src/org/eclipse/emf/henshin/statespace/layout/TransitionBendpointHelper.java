/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.layout;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.Transition;

/**
 * Helper class for computing bend points for transitions.
 * @author Christian Krause
 */
public class TransitionBendpointHelper {
	
	private static final int[][] EMPTY = new int[0][];

	public static int getBendpointDistance(Transition transition) {
		if (transition.getSource()==null || transition.getTarget()==null) {
			return 0;
		}
		List<Transition> connecting = getConnectingTransitions(transition.getSource(), transition.getTarget());
		if (connecting.size()==1) {
			return 0;
		} else {
			int index = connecting.indexOf(transition);
			int d = ((index/2+1)*15);
			if (index % 2==0) d = -d;
			return d;
		}
	}
	
	public static int[][] getBendPoints(Transition transition) {
		if (transition.getSource()==null || transition.getTarget()==null) {
			return EMPTY;	// Illegal
		}
		else if (transition.getSource()==transition.getTarget()) {
			int d = 30;
			return new int[][] { new int[] { 0, d, 0, d }, new int[] { d, 0, d, 0 } }; // Self loop transitions
		}
		else {
			int d = getBendpointDistance(transition);
			return new int[][] { new int[] { 0, d, 0, d } }; // Normal transitions
		}
	}
	
	private static List<Transition> getConnectingTransitions(State s1, State s2) {
		
		// Enforce deterministic order:
		if (s1.getIndex()>s2.getIndex()) {
			State tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		
		// Add all transitions:
		List<Transition> transitions = new ArrayList<Transition>();
		transitions.addAll(s1.getOutgoing());
		transitions.addAll(s1.getIncoming());
		transitions.addAll(s2.getOutgoing());
		transitions.addAll(s2.getIncoming());
		
		// Now filter:
		for (int i=0; i<transitions.size(); i++) {
			State source = transitions.get(i).getSource();
			State target = transitions.get(i).getTarget();
			if ((source!=s1 && source!=s2) || (target!=s1 && target!=s2)) {
				transitions.remove(i--);
				continue;
			}
			for (int j=0; j<i; j++) {
				if (transitions.get(i)==transitions.get(j)) {
					transitions.remove(i--);
					break;
				}
			}
		}
		
		// Done.
		return transitions;
		
	}

}
