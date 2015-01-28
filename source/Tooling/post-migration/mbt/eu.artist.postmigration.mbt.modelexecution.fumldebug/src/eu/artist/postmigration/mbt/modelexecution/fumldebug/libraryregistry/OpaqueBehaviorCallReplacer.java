/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Tanja Mayerhofer - initial API and implementation
 */
package eu.artist.postmigration.mbt.modelexecution.fumldebug.libraryregistry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import fUML.Syntax.Actions.BasicActions.CallBehaviorAction;
import fUML.Syntax.Actions.CompleteActions.ReduceAction;
import fUML.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import fUML.Syntax.Activities.IntermediateActivities.Activity;
import fUML.Syntax.Activities.IntermediateActivities.ActivityNode;
import fUML.Syntax.Activities.IntermediateActivities.DecisionNode;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import fUML.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

public class OpaqueBehaviorCallReplacer {

	public static final OpaqueBehaviorCallReplacer instance = new OpaqueBehaviorCallReplacer();
	
	private Map<String, OpaqueBehavior> opaqueBehaviors; 
	
	private OpaqueBehaviorCallReplacer() {		
	}
		
	public void replaceOpaqueBehaviorCalls(Collection<Activity> activities, Map<String, OpaqueBehavior> opaqueBehaviors) {
		this.opaqueBehaviors = opaqueBehaviors;
		
		List<ActivityNode> nodesWithBehavior = new ArrayList<ActivityNode>();
		for (fUML.Syntax.Activities.IntermediateActivities.Activity activity : activities) {
			nodesWithBehavior.addAll(getBehaviorNodes(activity.node));
		}

		for (ActivityNode node : nodesWithBehavior) {
			if (node instanceof CallBehaviorAction) {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction) node;
				Behavior behavior = callBehaviorAction.behavior;
				if (behavior != null) {
					OpaqueBehavior behaviorReplacement = getOpaqueBehavior(behavior.qualifiedName);
					if (behaviorReplacement != null) {
						callBehaviorAction.behavior = behaviorReplacement;
					}
				}
			} else if (node instanceof DecisionNode) {
				DecisionNode decision = (DecisionNode) node;
				Behavior behavior = decision.decisionInput;
				OpaqueBehavior behaviorReplacement = getOpaqueBehavior(behavior.qualifiedName);
				if (behaviorReplacement != null) {
					decision.decisionInput = behaviorReplacement;
				}
			} else if (node instanceof ReduceAction) {
				ReduceAction reduceAction = (ReduceAction) node;
				Behavior behavior = reduceAction.reducer;
				OpaqueBehavior behaviorReplacement = getOpaqueBehavior(behavior.qualifiedName);
				if (behaviorReplacement != null) {
					reduceAction.reducer = behaviorReplacement;
				}
			}
		}
	}
	
	private List<ActivityNode> getBehaviorNodes(List<ActivityNode> nodes) {
		List<ActivityNode> nodesWithBehavior = new ArrayList<ActivityNode>();
		for (ActivityNode node : nodes) {
			if (node instanceof CallBehaviorAction) {
				CallBehaviorAction action = (CallBehaviorAction) node;
				nodesWithBehavior.add(action);
			} else if (node instanceof DecisionNode) {
				DecisionNode decision = (DecisionNode) node;
				if (decision.decisionInput != null) {
					nodesWithBehavior.add(decision);
				}
			} else if (node instanceof ReduceAction) {
				ReduceAction reduceAction = (ReduceAction) node;
				nodesWithBehavior.add(reduceAction);
			}
			if (node instanceof StructuredActivityNode) {
				StructuredActivityNode structurednode = (StructuredActivityNode) node;
				nodesWithBehavior.addAll(getBehaviorNodes(structurednode.node));
			}
		}
		return nodesWithBehavior;
	}
	
	private OpaqueBehavior getOpaqueBehavior(String qualifiedName) {
		return opaqueBehaviors.get(qualifiedName);
	}
}
