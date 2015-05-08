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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.StateValidator;
import org.eclipse.emf.henshin.statespace.Validator;

/**
 * PRISM utils.
 * @author Christian Krause
 */
public class PRISMUtil {
	
	public static final String STATE_VARIABLE = "s";
	
	/**
	 * Data class for ranges (and constants).
	 */
	public static class Range {
		
		// Minimum, step, maximum values:
		public double min = 0, step = 0, max = 0;
		
		public Range(double min, double step, double max) {
			this.min = min;
			this.step = step;
			this.max = max;
		}
		
		public Range(double constant) {
			this(constant,0,constant);
		}
		
		public Range(String value) throws ParseException {
			NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
			String[] fields = value.split(":");
			if (fields.length==1) {
				min = max = format.parse(fields[0]).doubleValue();
			}
			else if (fields.length==2) {
				min = format.parse(fields[0]).doubleValue();				
				max = format.parse(fields[1]).doubleValue();				
			}
			else if (fields.length==3) {
				min = format.parse(fields[0]).doubleValue();
				step = format.parse(fields[1]).doubleValue();
				max = format.parse(fields[2]).doubleValue();
			}
			else {
				throw new ParseException("Error parsing rate",0);
			}
		}
		
		public boolean isConstant() {
			return min==max;
		}
		
		public String toString() {
			if (isConstant()) {
				return String.valueOf(min);
			} else if (step<=0) {
				return min + ":" + max;
			} else {
				return min + ":" + step + ":" + max;
			}
		}

		public static boolean isRange(String value) {
			try {
				Range range = new Range(value);
				return !range.isConstant();
			} catch (ParseException e) {}
			return false;
		}
		
	}

	// Properties key for PRISM path.
	public static final String PRISM_PATH_KEY = "prismPath";
	
	// Properties key for PRISM arguments.
	public static final String PRISM_ARGS_KEY = "prismArgs";
	
	// Properties key for PRISM experiment parameter.
	public static final String PRISM_EXPERIMENT_KEY = "prismExperiment";

	/**
	 * Invoke PRISM on a state space.
	 * @param stateSpace State space.
	 * @param args Arguments.
	 * @param monitor Monitor.
	 * @return Created process.
	 * @throws Exception On errors.
	 */
	protected static Process invokePRISM(StateSpace stateSpace, File modelFile, File formulaFile, 
			String[] args, Map<String,String> constants, boolean allowExperiments, IProgressMonitor monitor) throws Exception {
				
		// Get the executable, path and arguments.
		File path = getPRISMPath(stateSpace);
		String baseArgs = getPRISMArgs(stateSpace);
		
		// Create the command.
		List<String> command = new ArrayList<String>();
		command.add(path!=null ? new File(path.getAbsolutePath()+File.separator+"prism").getAbsolutePath() : "prism");
		if (modelFile.getName().endsWith(".tra")) {
			command.add("-importtrans");
			command.add(modelFile.getAbsolutePath());
			command.add("-importstates");
			command.add(modelFile.getAbsolutePath().replaceAll(".tra", ".sta"));			
		} else {
			command.add(modelFile.getAbsolutePath());			
		}
		
		if (formulaFile!=null) {
			command.add(formulaFile.getAbsolutePath());
		}
		if (baseArgs!=null) {
			for (String arg : baseArgs.split(" ")) {
				command.add(arg.trim());
			}
		}
		if (args!=null) {
			for (String arg : args) {
				command.add(arg.trim());
			}
		}
		
		// Now add the constants arguments:
		String cons = "";
		if (constants!=null && !constants.isEmpty()) {
			boolean first = true;
			for (Entry<String,String> e : constants.entrySet()) {
				if (!first) {
					cons = cons + ",";
				}
				if (!Range.isRange(e.getValue())) {
					continue;
				}
				cons = cons + e.getKey() + "=" + e.getValue();
				first = false;
			}
			
		}
		if (cons.length()>0) {
			command.add("-const");
			command.add(cons);
		}
		
		// Save the command to a script so that it can be manually re-run later:
		File script = new File(modelFile.getParentFile().getAbsolutePath() + File.separator + "last-prism-command.sh");
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(script)));
		writer.write("#!/bin/bash\n\n");
		for (String item : command) {
			writer.write(item + " ");
		}
		writer.write("\n");
		writer.close();
		script.setExecutable(true);
		
		// Now we can invoke the PRISM tool:
		return Runtime.getRuntime().exec(command.toArray(new String[] {}), null, path);
		
	}
	
	/*
	 * Expand labels.
	 */
	public static String expandLabels(String template, StateSpaceIndex index, IProgressMonitor monitor) throws Exception {

		// Find out how many sections need to be replaced:
		int sections = -1;
		String dummy1 = template;
		String dummy2 = template;
		do {
			dummy1 = dummy2;
			dummy2 = dummy2.replaceFirst("<<<", "xxx");
			sections++;
		} while (!dummy1.equals(dummy2));
		
		// Now do the expansion:
		monitor.beginTask("Expanding labels...", sections);
		for (int i=0; i<sections; i++) {
			template = doExpandLabels(template, index, new SubProgressMonitor(monitor,1));
		}
		monitor.done();
		return template;

	}

	/*
	 * Expand the first occurrence of <<<...>>>.
	 */
	private static String doExpandLabels(String template, StateSpaceIndex index, IProgressMonitor monitor) throws Exception {
		
		// Find <<< ... >>>
		int start = template.indexOf("<<<");
		if (start<0) return template;
		int end = template.indexOf(">>>", start);
		if (end<0) end = template.length();
		else end = end + 3;

		// Get the type: <<<TYPE: ... >>>
		String toReplace = template.substring(start, end);
		String type = "";
		int propStart = 3;
		for (int i=propStart; i<toReplace.length(); i++) {
			if (Character.isWhitespace(toReplace.charAt(i))) {
				break;
			}
			type = type + toReplace.charAt(i);
		}
		if (type.endsWith(":")) {
			type = type.substring(0, type.length()-1);
			propStart++;
		}
		
		// Find the state validator:
		StateValidator validator = null;
		for (Validator v : StateSpacePlugin.INSTANCE.getValidators().values()) {
			if (v.getName().startsWith(type) && v instanceof StateValidator) {
				validator = (StateValidator) v;
				break;
			}
		}
		if (validator==null) {
			throw new RuntimeException("Unknown validator \"" + type + "\"");
		}

		// Find all states which satisfy the property:
		String theProperty = toReplace.substring(propStart+type.length(), toReplace.length()-3).trim();
		validator.setStateSpaceIndex(index);
		validator.setProperty(theProperty);
		String result = "";
		IProgressMonitor nullMonitor = new NullProgressMonitor();
		monitor.beginTask("Expanding labels...", index.getStateSpace().getStateCount());
		
		// First collect all target states:
		List<State> targets = new ArrayList<State>();
		int steps = 0;
		for (State state : index.getStateSpace().getStates()) {
			if (validator.validate(state, nullMonitor).isValid()) {
				targets.add(state);
			}
			// Clean up regularly:
			if (steps++ % 5000==0) {
				index.clearCache();
			}
			// Update and check monitor:
			monitor.worked(1);
			if (monitor.isCanceled()) {
				return template;
			}
		}
		
		// Now generate the text representation:
		if (targets.size()==0) {
			result = "false";
		}
		else if (targets.size()==index.getStateSpace().getStateCount()){
			result = "true";
		}
		else {
			boolean negate = targets.size() > (index.getStateSpace().getStateCount() / 2);
			if (negate) {
				List<State> negated = new Vector<State>(index.getStateSpace().getStates());
				negated.removeAll(targets);
				targets = negated;
			}
			for (State state : targets) {
				if (result.length()>0) result = result + " | ";
				result = result + getPRISMState(state.getIndex(), null, false);
				if (monitor.isCanceled()) {
					return template;
				}
			}
			if (negate) {
				result = "!(" + result + ")";
			}
		}

		// Replace the text with the result:
		String expanded = template.substring(0,start) + result + template.substring(end);
		
		// Done:
		monitor.done();
		return expanded;
	}

	/**
	 * Get the properties key for rule rates.
	 */
	public static String getRateKey(Rule rule) {
		return "rate" + capitalize(removeWhiteSpace(rule.getName()));
	}

	/**
	 * Get the rate of a rule, as specified in the state space properties.
	 */
	public static String getRate(StateSpace stateSpace, Rule rule) {
		String rate = stateSpace.getProperties().get(getRateKey(rule));
		if (rate!=null && rate.trim().length()==0) {
			rate = null;
		}
		return rate;
	}

	/**
	 * Get the rate of a rule, as specified in the state space properties.
	 */
	public static Range getRateAsRange(StateSpace stateSpace, Rule rule) throws ParseException {
		String value = getRate(stateSpace, rule);
		return (value!=null) ? new Range(value) : null;
	}
	
	/**
	 * Get all rates for a state space.
	 * @param stateSpace The state space.
	 * @param force Whether the rate must be specified.
	 * @return Map associating constants to values.
	 */
	public static Map<String,String> getAllRates(StateSpace stateSpace, boolean force) {
		Map<String,String> map = new HashMap<String,String>();
		for (Rule rule : stateSpace.getRules()) {
			String key = getRateKey(rule);
			String value = getRate(stateSpace, rule);
			if (value!=null) {
				map.put(key, value);
			} else if (force) {
				throw new RuntimeException("State space property \"" + key + "\" must be specified.");
			}
		}
		return map;
	}

	/**
	 * Get the properties key for rule probabilities.
	 */
	public static String getProbKey(Rule rule, int index) {
		return "prob" + capitalize(removeWhiteSpace(rule.getName())) + (index+1);
	}

	/**
	 * Get the variable name for a rule probability.
	 */
	public static String getProbVar(int index) {
		return "p" + (index+1);
	}

	/**
	 * Get the probability of a rule, as specified in the state space properties.
	 */
	public static String getProb(StateSpace stateSpace, Rule rule, int index) {
		String prob = stateSpace.getProperties().get(getProbKey(rule, index));
		if (prob!=null && prob.trim().length()==0) {
			prob = null;
		}
		return prob;
	}

	/**
	 * Get the probability of a rule, as specified in the state space properties.
	 */
	public static Range getProbAsRange(StateSpace stateSpace, Rule rule, int index) throws ParseException {
		String value = getProb(stateSpace, rule, index);
		return (value!=null) ? new Range(value) : null;
	}

	/**
	 * Get all probabilities for a state space.
	 * @param stateSpace The state space.
	 * @param force Whether the probability must be specified.
	 * @return Map associating constants to values.
	 */
	public static Map<String,String> getAllProbs(StateSpace stateSpace, boolean force) {
		Map<String,String> map = new HashMap<String,String>();
		Map<String, List<Rule>> probRules = getProbabilisticRules(stateSpace);
		for (String ruleName : probRules.keySet()) {
			List<Rule> rules = probRules.get(ruleName);
			if (rules.size()>1) {
				for (int i=0; i<rules.size(); i++) {
					String key = getProbKey(rules.get(i), i);
					String value = getProb(stateSpace, rules.get(i), i);
					if (value!=null && value.trim().length()>0) {
						map.put(key, value);
					} else if (force) {
						throw new RuntimeException("State space property \"" + key + "\" must be specified.");
					}				
				}
			}
		}		
		return map;
	}
	
	/**
	 * Partition the rules of a state space into probabilistic rules, based on their names.
	 * That is, all rules with the same name become part of one probabilistic rule.
	 * The derived probabilistic rules are meaningful in the context of an MDP.
	 * @param stateSpace State space.
	 * @return Probabilistic rules.
	 */
	public static Map<String,List<Rule>> getProbabilisticRules(StateSpace stateSpace) {
		Map<String,List<Rule>> probRules = new LinkedHashMap<String,List<Rule>>();
		for (Rule rule : stateSpace.getRules()) {
			List<Rule> rules = probRules.get(rule.getName());
			if (rules==null) {
				rules = new ArrayList<Rule>();
				probRules.put(rule.getName(), rules);
			}
			rules.add(rule);
		}
		return probRules;
	}
	
	public static String getConstants(StateSpace stateSpace) {
		String constants = stateSpace.getProperties().get(StateSpace.PROPERTY_CONSTANTS);
		if (constants!=null) {
			String result = "";
			for (String part : constants.split(",")) {
				part = part.trim();
				if (part.length()>0) {
					result = result + "const " + part + ";\n";
				}
			}
			return result;
		}
		return "";
	}

	/**
	 * Get the PRISM path property.
	 * @param stateSpace State space.
	 * @return PRISM path property (can be <code>null</code>)
	 */
	public static File getPRISMPath(StateSpace stateSpace) {
		String path = stateSpace.getProperties().get(PRISM_PATH_KEY);
		if (path!=null && path.trim().length()>0) {
			return new File(path.trim());
		}
		return null;
	}

	/**
	 * Get the PRISM arguments property.
	 * @param stateSpace State space.
	 * @return PRISM arguments property (can be <code>null</code>)
	 */
	public static String getPRISMArgs(StateSpace stateSpace) {
		return stateSpace.getProperties().get(PRISM_ARGS_KEY);
	}

	/**
	 * Get the PRISM experiment parameter.
	 * @param stateSpace State space.
	 * @return PRISM experiment parameter (can be <code>null</code>)
	 */
	public static String getPRISMExperiment(StateSpace stateSpace) {
		return stateSpace.getProperties().get(PRISM_EXPERIMENT_KEY);
	}
	
	public static String getVariableDeclarations(int size, boolean explicit) {
		if (explicit) {
			return "(" + STATE_VARIABLE + ")";
		} else {
			return "\t" + STATE_VARIABLE + " : [0.." + (size-1) + "];\n";
		}
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
	
	/*
	 * Remove white space from a string.
	 */
	private static String removeWhiteSpace(String string) {
		string = string.replaceAll(" ", "_");
		string = string.replaceAll("\t", "_");
		string = string.replaceAll("\n", "_");
		return string;
	}

	public static String getModelHeader(String modelType) {
		String h = "// " + modelType.toUpperCase() + " model generated by Henshin on " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) + "\n\n";
		h = h + modelType.toLowerCase() + "\n\n";
		return h;
	}
	
	public static String getPRISMState(int index, String extra, boolean successor) {
		if (extra!=null && extra.trim().length()>0) {
			extra = extra.trim();
			if (!extra.startsWith("(")) {
				extra = "(" + extra + ")";
			}
			extra = "&" + extra;
		} else {
			extra = "";
		}
		if (successor) {
			return "(" + STATE_VARIABLE + "'=" + index + ")" + extra;
		} else {
			return "(" + STATE_VARIABLE + "=" + index + ")" + extra;
		}
	}
	
	public static String getPRISMStates(List<State> states) {
		String r = "";
		int count = states.size();
		for (int i=0; i<count; i++) {
			r = r + getPRISMState(states.get(i).getIndex(), null, false);
			if (i<count-1) r = r + " | ";
		}
		return r;
	}
	
}
