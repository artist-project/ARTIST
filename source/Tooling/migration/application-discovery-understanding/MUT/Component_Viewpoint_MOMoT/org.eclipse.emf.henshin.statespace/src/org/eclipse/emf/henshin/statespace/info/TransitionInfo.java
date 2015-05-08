package org.eclipse.emf.henshin.statespace.info;

import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.impl.StateExplorer;

public class TransitionInfo {
	
	private final Transition transition;
	
	private final Model sourceModel, targetModel;
	
	private final Match match, resultMatch;
	
	public TransitionInfo(Transition transition, Model sourceModel, StateExplorer explorer) throws StateSpaceException {
		
		this.transition = transition;
		this.sourceModel = sourceModel; 
		
		this.match = explorer.getMatch(transition, sourceModel);
		
		Path path = new Path();
		path.add(transition);
		
		this.targetModel = explorer.deriveModel(path, sourceModel);
		this.resultMatch = explorer.getLastResultMatch();
		
	}

	public Transition getTransition() {
		return transition;
	}

	public Model getSourceModel() {
		return sourceModel;
	}

	public Model getTargetModel() {
		return targetModel;
	}

	public Match getMatch() {
		return match;
	}

	public Match getResultMatch() {
		return resultMatch;
	}
	
}
