package org.eclipse.emf.henshin.statespace.info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceException;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.Transition;
import org.eclipse.emf.henshin.statespace.util.ObjectKeyHelper;
import org.eclipse.emf.henshin.statespace.util.StateSpaceTypesHelper;

public class StateSpaceTimeInfo {
	
	private final boolean timed;
	
	private final List<EClass> identityTypes;
	
	private final Map<EClass,List<String>> clockDeclarations;
	
	private final Set<String> usedClocks;
	
	private final Map<EClass,Integer> maxObjectIds;
	
	private final Map<Rule,Vector<String>> ruleGuards;
	
	private final Map<Rule,Vector<String>> ruleResets;
	
	private final Map<Rule,Vector<String>> ruleInvariants;
		
	/**
	 * Default constructor.
	 * @param index State space index.
	 */
	public StateSpaceTimeInfo(StateSpaceIndex index) throws StateSpaceException {
		StateSpace stateSpace = index.getStateSpace();
		
		// Find out whether the state space is timed:
		String useClocks = stateSpace.getProperties().get(StateSpace.PROPERTY_USE_CLOCKS);
		timed = ("yes".equalsIgnoreCase(useClocks) || "true".equalsIgnoreCase(useClocks));
		
		// Extract the clock declarations:
		clockDeclarations = new LinkedHashMap<EClass,List<String>>();
		identityTypes = index.getStateSpace().getEqualityHelper().getIdentityTypes();
		for (EClass type : identityTypes) {
			clockDeclarations.put(type, new Vector<String>());
		}
		String prop = stateSpace.getProperties().get(StateSpace.PROPERTY_CLOCK_DECLARATIONS);
		if (prop!=null) {
			Map<String,EClass> typeNameMap = StateSpaceTypesHelper.getTypesNameMap(index.getStateSpace());
			for (String decl : prop.split(",")) {
				String[] split = decl.split("\\.");
				if (split.length==2) {
					EClass type = typeNameMap.get(split[0]);
					if (type!=null && identityTypes.contains(type)) {
						clockDeclarations.get(type).add(split[1]);
					}
				}
			}
		}
		
		// Compute the maximum used object IDs for every type:
		maxObjectIds = new LinkedHashMap<EClass,Integer>();
		for (EClass type : identityTypes) {
			maxObjectIds.put(type, 0);
		}
		int[] objectKeys;
		for (State state : stateSpace.getStates()) {
			objectKeys = state.getObjectKeys();
			for (int i=0; i<objectKeys.length; i++) {
				EClass type = ObjectKeyHelper.getObjectType(objectKeys[i], identityTypes);
				List<String> dec = clockDeclarations.get(type);
				if (dec!=null && !dec.isEmpty()) {
					int id = ObjectKeyHelper.getObjectID(objectKeys[i]);
					if (maxObjectIds.get(type) < id) {
						maxObjectIds.put(type, id);
					}
				}
			}
		}
		
		// Now we can cache the used clocks:
		usedClocks = new LinkedHashSet<String>();
		for (State state : stateSpace.getStates()) {
			objectKeys = state.getObjectKeys();
			for (int i=0; i<objectKeys.length; i++) {
				EClass type = ObjectKeyHelper.getObjectType(objectKeys[i], identityTypes);
				int objectId = ObjectKeyHelper.getObjectID(objectKeys[i]);
				List<String> dec = clockDeclarations.get(type);
				if (dec!=null) {
					for (String clockName : dec) {
						usedClocks.add(getClock(type, objectId, clockName));
					}
				}
			}
		}
		
		// Extract the rule guards and resets:
		ruleGuards = getRuleProperties(stateSpace, "guard");
		ruleResets = getRuleProperties(stateSpace, "resets");
		ruleInvariants = getRuleProperties(stateSpace, "invariant");
		
	}
	
	/*
	 * Helper method for extracting rule properties from a state space.
	 */
	private static Map<Rule,Vector<String>> getRuleProperties(StateSpace stateSpace, String prefix) {
		Map<Rule,Vector<String>> result = new LinkedHashMap<Rule,Vector<String>>();
		for (Rule rule : stateSpace.getRules()) {
			int index = 1;
			for (Rule rule2 : stateSpace.getRules()) {
				if (rule2==rule) break;
				if (rule2.getName().equals(rule.getName())) index++;
			}
			String property = prefix + capitalize(rule.getName()) + index;
			if (!stateSpace.getProperties().containsKey(property)) {
				property = prefix + capitalize(rule.getName());				
			}
			String value = stateSpace.getProperties().get(property);
			if (value!=null) {
				value = value.trim();
				if (value.length()>0) {
					Vector<String> vals = new Vector<String>();
					for (String s : value.split("&")) {
						vals.add(s);
					}
					result.put(rule, vals);
				}
			}
		}
		return result;
	}
	
	/**
	 * Get the clock declarations to be used in a state space.
	 * @return The clock declarations.
	 */
	public Map<EClass,List<String>> getClockDeclarations() {
		return clockDeclarations;
	}
	
	/**
	 * Check whether this state space is timed.
	 * @return <code>true</code> if it is timed.
	 */
	public boolean isTimed() {
		return timed;
	}
	
	/**
	 * Get the number of clocks required for the state space.
	 * @return The total number of required clocks.
	 */
	public int getClockCount() {
		return usedClocks.size();
	}

	public String getClock(EClass type, int objectId, String clockName) {
		if (objectId<1) {
			throw new IllegalArgumentException("Class '" + type.getName() + "' must be an identity type to have clocks.");
		}
		int clock = 0;
		for (EClass t : identityTypes) {
			if (t==type) {
				clock += objectId;
				break;
			} else {
				clock += maxObjectIds.get(type) * clockDeclarations.get(type).size();
			}
		}
		return "c" + clock;
	}

	public String getClock(Model model, EObject object, String clockName) {
		int objectId = ObjectKeyHelper.getObjectID(model.getObjectKeysMap().get(object));
		return getClock(object.eClass(), objectId, clockName);
	}
	
	public Iterable<String> getClocks() {
		return usedClocks;
	}
	
	public String getGuard(TransitionInfo transitionInfo) {
		return getNestedMatchProperty(ruleGuards.get(transitionInfo.getTransition().getRule()), transitionInfo);
	}

	public String getResets(TransitionInfo transitionInfo) {
		return getNestedMatchProperty(ruleResets.get(transitionInfo.getTransition().getRule()), transitionInfo);
	}
	
	public String getInvariant(StateInfo stateInfo) {
		int index = 0;
		List<String> atoms = new Vector<String>();
		for (Transition t : stateInfo.getState().getOutgoing()) {
			String s = getNestedMatchProperty(ruleInvariants.get(t.getRule()), stateInfo.getOutgoing().get(index++));
			if (s!=null && !atoms.contains(s)) {
				atoms.add(s);
			}
		}
		if (atoms.isEmpty()) return null;
		Collections.sort(atoms);
		String r = "";
		for (int i=0; i<atoms.size(); i++) {
			if (i>0) r = r + "&";
			r = r + atoms.get(i);
		}
		return r;
	}
	
	private String getNestedMatchProperty(Vector<String> properties, TransitionInfo transitionInfo) {
		if (properties!=null) {
			List<String> original = new Vector<String>(properties);
			properties = new Vector<String>(properties);
			
			Map<String,List<String>> replacements = new HashMap<String,List<String>>();
			computePropertyReplacements(getAllNodes(transitionInfo.getTransition().getRule()), 
					transitionInfo.getTransition(), transitionInfo.getSourceModel(), transitionInfo.getTargetModel(), 
					transitionInfo.getMatch(), transitionInfo.getResultMatch(), replacements);
			
			for (String key : replacements.keySet()) {
				List<String> details = replacements.get(key);
				for (int i=0; i<details.size(); i++) {
					for (int j=0; j<properties.size(); j++) {
						properties.set(j, properties.get(j).replaceAll(key, details.get(i)));
					}
					if (i<details.size()-1) {
						properties.addAll(original);
					}
				}
			}
			properties.removeAll(original);
			Set<String> missingClockVariables = getMissingClockVariables(replacements.keySet(), transitionInfo.getMatch().getRule());
			
			String result = "";
			int count = properties.size();
			for (int j=0; j<count; j++) {
				String prop = properties.get(j);
				boolean use = true;
				for (int k=0; k<j; k++) {
					if (properties.get(k).equals(prop)) {
						use = false;
						break;
					}
				}
				if (use) {
					for (String missing : missingClockVariables) {
						if (prop.indexOf(missing)>=0) {
							use = false;
							break;
						}
					}
				}
				if (use) {
					prop = prop.trim();
					if (!prop.startsWith("(")) {
						prop = "(" + prop + ")";
					}
					if (result.length()>0) {
						result = result + "&";
					}
					result = result + prop;
				}
			}
			return result.length()>0 ? result : null;
		}
		return null;
	}
	
	private List<Node> getAllNodes(Rule rule) {
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(rule.getLhs().getNodes());
		nodes.addAll(rule.getRhs().getNodes());
		for (Rule multiRule : rule.getMultiRules()) {
			nodes.addAll(getAllNodes(multiRule));
		}
		return nodes;
	}
	
	private void computePropertyReplacements(List<Node> nodes, Transition transition, Model sourceModel,  Model targetModel, Match match, Match resultMatch, Map<String,List<String>> replacements) {
		String nodeName;
		for (Node node : nodes) {
			nodeName = node.getName();
			if (nodeName!=null && identityTypes.contains(node.getType())) {
				Model model = sourceModel;
				EObject object = match.getNodeTarget(node);
				if (object==null && resultMatch!=null) {
					model = targetModel;
					object = resultMatch.getNodeTarget(node);
				}
				if (object==null) continue;
				if (object.eResource()!=model.getResource()) {
					throw new RuntimeException("Unexpected model object");
				}
				for (String clockName : clockDeclarations.get(node.getType())) {
					String key = nodeName + "\\." + clockName;
					if (!replacements.containsKey(key)) {
						replacements.put(key, new Vector<String>());
					}
					replacements.get(key).add(getClock(model, object, clockName));
				}
			}
		}
		for (Rule multiRule : match.getRule().getMultiRules()) {
			int size = match.getMultiMatches(multiRule).size();
			for (int i=0; i<size; i++) {
				Match r = resultMatch!=null ? resultMatch.getMultiMatches(multiRule).get(i) : null;
				computePropertyReplacements(nodes, transition, sourceModel, targetModel, match.getMultiMatches(multiRule).get(i), r, replacements);
			}
		}
	}
	
	private Set<String> getMissingClockVariables(Set<String> usedClockVariables, Rule rule) {
		Set<String> missing = new HashSet<String>();
		String nodeName;
		for (Node node : rule.getLhs().getNodes()) {
			nodeName = node.getName();
			if (nodeName!=null && identityTypes.contains(node.getType())) {
				for (String clockName : clockDeclarations.get(node.getType())) {
					if (!usedClockVariables.contains(nodeName + "\\." + clockName)) {
						missing.add(nodeName + "." + clockName);
					}
				}
			}
		}
		for (Rule multiRule : rule.getMultiRules()) {
			missing.addAll(getMissingClockVariables(usedClockVariables, multiRule));
		}
		return missing;
	}
	
	/*
	 * Capitalize a string.
	 */
	private static String capitalize(String string) {
		if (string==null || string.length()==0) return string;
		String first = string.substring(0,1).toUpperCase();
		if (string.length()==1) return first;
		return first + string.substring(1);
	}

}
