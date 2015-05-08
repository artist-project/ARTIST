package org.eclipse.emf.henshin.statespace.info;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.impl.StateExplorer;


public class StateInfo {
	
	private final State state;
	
	private final Model model;
	
	private final List<TransitionInfo> outgoing;
	
	public StateInfo(State state, Model model, StateExplorer explorer) throws StateSpaceException {
		
		this.state = state;
		this.model = model;
		
		this.outgoing = new ArrayList<TransitionInfo>();
		
		for (Transition transition : state.getOutgoing()) {
			outgoing.add(new TransitionInfo(transition, model, explorer));
		}
		
	}

	public State getState() {
		return state;
	}

	public Model getModel() {
		return model;
	}

	public List<TransitionInfo> getOutgoing() {
		return outgoing;
	}
	
}
