/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.EqualityHelper;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.Path;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceFactory;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.StateValidator;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.Validator;
import org.eclipse.emf.henshin.statespace.hashcodes.StateSpaceHashCodeUtil;
import org.eclipse.emf.henshin.statespace.util.ObjectKeyHelper;

/**
 * Helper class for exploring states. This forms the bridge between a {@link StateSpaceManager}
 * and an {@link Engine}. This class tries to minimize the number of created 
 * short living objects to improve the performance. Instances of this class must not be 
 * used concurrently!
 * 
 * @author Christian Krause
 *
 */
public class StateExplorer {

	/**
	 * Dummy progress monitor.
	 */
	private static final NullProgressMonitor NULL_PROGRESS_MONITOR = new NullProgressMonitor();

	/** 
	 * State space index.
	 */
	private final StateSpaceIndex index;

	/**
	 * Cached state space.
	 */
	private final StateSpace stateSpace;

	/** 
	 * Cached equality helper.
	 */
	private final EqualityHelper equalityHelper;

	/** 
	 * Cached engine.
	 */
	private Engine engine;

	/**
	 * Cached result.
	 */
	private final List<Transition> result;

	/** 
	 * Whether to use object keys.
	 */
	private final boolean useObjectKeys;

	/** 
	 * Cached rules sorted by priority.
	 */
	private final Rule[][] rules;

	/** 
	 * Cached rule parameters.
	 */
	private final Map<Rule,List<Node>> ruleParameters;

	/** 
	 * Cached rule application.
	 */
	private final RuleApplication application;

	/** 
	 * Cached identity types.
	 */
	private final EList<EClass> identityTypes;

	/**
	 * Cached post-processor.
	 */
	private final ModelPostProcessor postProcessor;

	/**
	 * Cached state validator for deciding whether a state is a goal state.
	 */
	private StateValidator goalStateValidator;	

	/** 
	 * Cached flag determining whether to collect missing roots.
	 */
	private final boolean collectMissingRoots;

	/**
	 * Default constructor.
	 */
	public StateExplorer(StateSpaceIndex index) {

		// Set the index:
		this.index = index;

		// Cache basic data:
		stateSpace = index.getStateSpace();
		equalityHelper = stateSpace.getEqualityHelper();
		result = new ArrayList<Transition>();
		identityTypes = equalityHelper.getIdentityTypes();
		useObjectKeys = !identityTypes.isEmpty();

		// Sort the rules by their priorities:
		Map<Integer,List<Rule>> prioritizedRules = new LinkedHashMap<Integer,List<Rule>>();
		for (Rule rule : stateSpace.getRules()) {
			int priority = 0;
			String key = getRulePriorityKey(rule);
			String val = stateSpace.getProperties().get(key);
			if (val==null) val = stateSpace.getProperties().get(key.toLowerCase());
			if (val!=null && val.trim().length()!=0) {
				try {
					priority = Integer.parseInt(val.trim());
				} catch (Throwable t) {
					StateSpacePlugin.INSTANCE.logError("Error parsing priority of rule " + rule.getName(), t);
				}
			}
			if (!prioritizedRules.containsKey(priority)) {
				prioritizedRules.put(priority, new ArrayList<Rule>());
			}
			prioritizedRules.get(priority).add(rule);
		}
		List<Integer> priorities = new ArrayList<Integer>(prioritizedRules.keySet());
		Collections.sort(priorities);
		Collections.reverse(priorities);

		// Cache rule data:
		rules = new Rule[priorities.size()][];
		for (int i=0; i<rules.length; i++) {
			rules[i] = prioritizedRules.get(priorities.get(i)).toArray(new Rule[0]);
		}
		ruleParameters = new HashMap<Rule,List<Node>>();
		if (useObjectKeys) {
			for (Rule rule : stateSpace.getRules()) {
				ruleParameters.put(rule, rule.getParameterNodes());
			}
		}

		// Collect missing roots flag:
		String collect = stateSpace.getProperties().get(StateSpace.PROPERTY_COLLECT_MISSING_ROOTS);
		collectMissingRoots = (collect!=null) && ("true".equalsIgnoreCase(collect) || "yes".equalsIgnoreCase(collect));

		// Set-up the engine:
		engine = InterpreterFactory.INSTANCE.createEngine();
		engine.getOptions().put(Engine.OPTION_DETERMINISTIC, Boolean.TRUE); // really make sure it is deterministic

		// Create a rule application:
		application = InterpreterFactory.INSTANCE.createRuleApplication(engine);

		// Set-up the goal state validator:
		goalStateValidator = null;
		String goalProperty = stateSpace.getProperties().get(StateSpace.PROPERTY_GOAL_PROPERTY);
		if (goalProperty!=null && goalProperty.trim().length()>0) {
			String type = null;
			if (goalProperty.indexOf(':')>0) {
				type = goalProperty.substring(0, goalProperty.indexOf(':')).trim();
				goalProperty = goalProperty.substring(goalProperty.indexOf(':')+1).trim();
			}
			for (Validator validator : StateSpacePlugin.INSTANCE.getValidators().values()) {
				if (validator instanceof StateValidator && (type==null || type.equalsIgnoreCase(validator.getName()))) {
					try {
						goalStateValidator = (StateValidator) validator.getClass().newInstance();
						goalStateValidator.setStateSpaceIndex(index);
						goalStateValidator.setProperty(goalProperty);
						break;
					} catch (Exception e) {}
				}
			}
			if (goalStateValidator==null) {
				StateSpacePlugin.INSTANCE.logError("Error loading goal state validator: " + type, null);
			}
		}

		// Post-processor:
		postProcessor = new ModelPostProcessor(stateSpace);

	}

	/*
	 * Get the priority property key for a rule.
	 */
	private static String getRulePriorityKey(Rule rule) {
		String key = rule.getName();
		if (key==null) key = "";
		key = key.replaceAll(" ", "_");
		key = key.replaceAll("\t", "_");
		key = key.replaceAll("\n", "_");
		String first = key.substring(0,1).toUpperCase();
		if (key.length()==1) key = first;
		else key = first + key.substring(1);
		return "priority" + key;
	}

	/**
	 * Explore a state without actually changing the state space.
	 * This method does not check if the state is explored already
	 * or whether any of the transitions or states exists already.
	 * @param state State to be explored.
	 * @throws StateSpaceException On explore errors.
	 */
	public List<Transition> doExplore(State state) throws StateSpaceException {

		// Clear the result:
		result.clear();

		// Get the state model and create an engine for it:
		Model model = index.getModel(state);
		EGraph graph = model.getEGraph();

		// Find the first layer with an applicable rule and apply all its rules:
		for (int l=0; l<rules.length; l++) {
			
			// Remember whether we applied at least one rule in the layer:
			boolean applicable = false;

			// Try all rules in the current layer:
			for (int i=0; i<rules[l].length; i++) {

				// Get the parameters of the rule:
				List<Node> parameters = ruleParameters.get(rules[l][i]);

				// Iterate over all matches:
				int matchIndex = 0;
				for (Match match : engine.findMatches(rules[l][i], graph, null)) {
					
					// We know it is applicable:
					applicable = true;
					
					// Transform the model:
					Model transformed = model.getCopy(match);
					application.setRule(rules[l][i]);
					application.setEGraph(transformed.getEGraph());
					application.setCompleteMatch(match);
					if (!application.execute(null)) {
						throw new StateSpaceException("Error applying rule \"" + rules[l][i].getName() + "\" to found match in state " + state.getIndex());
					}
					postProcessor.process(transformed);
					if (collectMissingRoots) {
						transformed.collectMissingRootObjects();
					}

					// Create a new state:
					State newState = StateSpaceFactory.eINSTANCE.createState();
					newState.setModel(transformed);

					// Update object keys if necessary:
					if (useObjectKeys) {
						transformed.updateObjectKeys(identityTypes);
						int[] objectKeys = transformed.getObjectKeys();
						newState.setObjectKeys(objectKeys);
						newState.setObjectCount(objectKeys.length);
					}

					// Now compute and set the hash code (after the node IDs have been updated!):
					int newHashCode = equalityHelper.hashCode(transformed);
					newState.setHashCode(newHashCode);
					newState.setDerivedFrom(state.getIndex());

					// Create a new transition:
					Transition newTransition = StateSpaceFactory.eINSTANCE.createTransition();
					newTransition.setRule(rules[l][i]);
					newTransition.setMatch(matchIndex);
					newTransition.setTarget(newState);

					// Set the parameters if necessary:
					if (useObjectKeys) {
						int[] params = new int[parameters.size()];
						for (int p=0; p<params.length; p++) {
							Node node = parameters.get(p);
							EObject matched = match.getNodeTarget(node);
							if (matched==null) {
								matched = application.getResultMatch().getNodeTarget(node);
							}
							int objectKey = transformed.getObjectKeysMap().get(matched);
							params[p] = ObjectKeyHelper.createObjectKey(
									matched.eClass(), 
									objectKey, 
									identityTypes);
						}
						newTransition.setParameterKeys(params);
						newTransition.setParameterCount(params.length);
					}

					// Remember the transition:
					result.add(newTransition);

					// Increase the match index:
					matchIndex++;

				}
			}
			
			// If at least one rule in the layer was applicable, we stop:
			if (applicable) {
				break;
			}
			
		}

		// Done.
		return result;

	}


	/**
	 * Check whether a state is a goal state.
	 * @param state State to be checked.
	 * @result <code>true</code> if it is a goal state.
	 */
	public boolean isGoalState(State state) throws StateSpaceException {
		if (goalStateValidator==null) {
			return false;
		}
		try {
			return goalStateValidator.validate(state, NULL_PROGRESS_MONITOR).isValid();
		} catch (Throwable e) {
			throw new StateSpaceException(e);
		}
	}

	/**
	 * Derive a model.
	 * @param State state.
	 * @param fromInitial Whether to derive it from an initial state.
	 * @return The derived model.
	 * @throws StateSpaceException On errors.
	 */
	public Model deriveModel(State state, boolean fromInitial) throws StateSpaceException {

		// Find a path from one of the states predecessors:
		Path trace = new Path();
		State source = state;
		State target;
		Model start = null;
		List<State> states = index.getStateSpace().getStates();
		try {
			while (start==null) {
				target = source;
				source = states.get(target.getDerivedFrom());
				trace.addFirst(source.getOutgoing(target, null, -1, null));
				start = index.getCachedModel(source);
				if (fromInitial && !source.isInitial()) {
					start = null;
				}
			}
		} catch (Throwable t) {
			throw new StateSpaceException("Error deriving model for " + state, t);
		}

		// Now derive the model:
		return deriveModel(trace, start);

	}

	/**
	 * Derive a model using a path and a given start model.
	 * @param path Path.
	 * @param sourceModel Source model.
	 * @return The derived model.
	 * @throws StateSpaceException On errors.
	 */
	public Model deriveModel(Path path, Model sourceModel) throws StateSpaceException {

		// We need to copy the start model!!!
		sourceModel = sourceModel.getCopy(null);
		application.setEGraph(sourceModel.getEGraph());
		Match match;

		// Derive the model for the current state:
		for (Transition transition : path) {

			// Find the match:
			match = getMatch(transition, sourceModel);

			// Apply the rule with the found match:
			application.setCompleteMatch(match);
			if (!application.execute(null)) {
				throw new StateSpaceException("Error deriving model");				
			}
			postProcessor.process(sourceModel);
			if (collectMissingRoots) {
				sourceModel.collectMissingRootObjects();
			}

			// Debug: Validate model if necessary:
			//int hashCode = getStateSpace().getEqualityHelper().hashCode(model);
			//if (transition.getTarget().getHashCode()!=hashCode) {
			//	throw new StateSpaceException("Error constructing model for state " +
			//			transition.getTarget().getIndex() + " in path " + trace);
			//}

			// Update object keys if necessary:
			if (useObjectKeys) {
				sourceModel.updateObjectKeys(identityTypes);
			}

		}

		// Set the object keys if necessary:
		//if (useObjectKeys) {
		//	model.setObjectKeys(path.getTarget().getObjectKeys());
		//}

		// Update the object hash codes:
		StateSpaceHashCodeUtil.computeHashCode(sourceModel, equalityHelper);

		// Done.
		return sourceModel;

	}

	/**
	 * Get the match for a given transition.
	 * @param transition The transition.
	 * @param sourceModel The model of the source state.
	 * @return The match.
	 * @throws StateSpaceException On state space errors.
	 */
	public Match getMatch(Transition transition, Model sourceModel) throws StateSpaceException {
		EGraph graph = sourceModel.getEGraph();
		application.setEGraph(graph);
		application.setRule(transition.getRule());
		int targetMatch = transition.getMatch();
		int currentMatch = 0;
		for (Match foundMatch : engine.findMatches(transition.getRule(), graph, null)) {
			if (currentMatch++ == targetMatch) {
				return foundMatch;
			}
		}
		throw new StateSpaceException("Illegal transition in state " + transition.getSource());
	}

	/**
	 * Get the last result match used during the derivation of a model.
	 * @return The last used result match.
	 */
	public Match getLastResultMatch() {
		return application.getResultMatch();
	}

	/*
	 * Perform a sanity check for the exploration. For testing only.
	 * This check if doExplore() really yields equal results when invoked
	 * more than once on the same state.
	 */
	/*	protected void checkEngineDeterminism(State state) throws StateSpaceException {

		// Explore the state without changing the state space:
		List<Transition> transitions = acquireTransitionList();
		doExplore(state, transitions);

		// Do it again and compare the results.
		for (int i=0; i<25; i++) {
			List<Transition> transitions2 = acquireTransitionList();
			doExplore(state, transitions2);
			if (transitions.size()!=transitions2.size()) {
				throw new StateSpaceException("Sanity check 1 failed!");
			}
			for (int j=0; j<transitions.size(); j++) {
				Transition t1 = transitions.get(j);
				Transition t2 = transitions2.get(j);
				if (t1.getRule()!=t2.getRule() || t1.getMatch()!=t2.getMatch()) {
					throw new StateSpaceException("Sanity check 2 failed!");
				}
				State s1 = t1.getTarget();
				State s2 = t2.getTarget();
				if (s1.getHashCode()!=s2.getHashCode()) {
					throw new StateSpaceException("Sanity check 3 failed!");
				}
				if (!getStateSpace().getEqualityHelper().equals(s1.getModel(),s2.getModel())) {
					throw new StateSpaceException("Sanity check 4 failed!");
				}
			}
		}

	}
	 */	

	/**
	 * Model post processor implementation.
	 * @author Chrstian Krause
	 */
	class ModelPostProcessor {

		// Script engine:
		private ScriptEngine engine;

		// Cached post processing script:
		private String script;

		/**
		 * Constructor.
		 * @param statepace State space.
		 */
		public ModelPostProcessor(StateSpace stateSpace) {
			ScriptEngineManager manager = new ScriptEngineManager();
			engine = manager.getEngineByName("JavaScript");
			script = stateSpace.getProperties().get("postProcessor");
			if (script!=null && script.trim().length()==0) {
				script = null;
			}
			if (script!=null) {
				String imports = "importPackage(java.lang);\n" +
						"importPackage(java.util);\n" +
						"importPackage(org.eclipse.emf.ecore);\n" ;
				script = imports + script;
			}
		}

		/**
		 * Do the post processing for a model.
		 * @param model Model.
		 * @throws StateSpaceException On execution errors.
		 */
		public void process(Model model) throws StateSpaceException {
			if (script!=null) {
				EObject root = model.getResource().getContents().get(0);
				synchronized (engine) {
					engine.put("model", root);
					try {
						engine.eval(script);
					} catch (ScriptException e) {
						throw new StateSpaceException(e);
					}
				}
			}
		}

	}

}
