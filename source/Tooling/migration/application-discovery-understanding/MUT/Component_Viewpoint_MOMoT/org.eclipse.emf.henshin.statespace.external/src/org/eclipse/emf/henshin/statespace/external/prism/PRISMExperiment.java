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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.util.StateSpaceXYPlot;

/**
 * Data class and parsing functionality for PRISM experiment results.
 * @author Christian Krause
 */
public class PRISMExperiment {

	/**
	 * English number format (used for parsing and printing).
	 */
	public static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance(Locale.ENGLISH);

	// Constants:
	private Map<String,Double> constants;
	
	// The result:
	private double result;
	
	/**
	 * Default constructor.
	 */
	public PRISMExperiment() {
		constants = new LinkedHashMap<String,Double>();
		result = 0;
	}
	
	public double getResult() {
		return result;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
	
	public Map<String,Double> getConstants() {
		return constants;
	}
	
	/**
	 * Parse an experiment from a PRISM process.
	 * @param reader Reader for the input stream of the PRISM process.
	 * @param monitor Progress monitor.
	 * @return The PRISMExperiment object.
	 * @throws Exception On errors.
	 */
	public static PRISMExperiment parse(BufferedReader reader, IProgressMonitor monitor) throws Exception {
		
		// Create a new experiment object:
		PRISMExperiment experiment = new PRISMExperiment();
		String line = null, error = null;
		boolean parseError = false;
		
		// Parse the PRISM output:
		while ((line = reader.readLine())!=null) {
			
			// The next line:
			line = line.trim();
			//System.out.println(line);
			if (line.length()==0) {
				if (parseError) {
					throw new RuntimeException(error);
				} else {
					continue;
				}
			}
			// Parse error?
			if (parseError) {
				error = error + "\n" + line;
			}
			else if (line.startsWith("Error")) {
				error = line;
				parseError = true;
			}
			else if (line.startsWith("Model constants:") && experiment.getConstants().isEmpty()) {
				//System.out.println("\n" + line);
				line = line.substring("Model constants:".length()).trim();
				String[] constants = line.split(",");
				for (String constant : constants) {
					String[] keyval = constant.split("=");
					if (keyval.length!=2) throw new RuntimeException("Unexpected PRISM output");
					experiment.getConstants().put(keyval[0], NUMBER_FORMAT.parse(keyval[1]).doubleValue());
				}
			}
			else if (line.startsWith("Result")) {
				//System.out.println(line);
				line = line.substring(line.indexOf(':')+1).trim();
				experiment.setResult(NUMBER_FORMAT.parse(line).doubleValue());
				return experiment; // done!
			}
			
			// Cancel?
			if (monitor.isCanceled()) {
				return null;
			}
		}
		
		// Error occurred?
		if (parseError) {
			throw new RuntimeException(error);
		}

		// No result.
		return null;
		
	}

	/**
	 * Parse all experiments from a PRISM process.
	 * @param process PRISM process.
	 * @param monitor Progress monitor.
	 * @return List of experiments.
	 * @throws Exception On errors.
	 */
	public static List<PRISMExperiment> parseAll(Process process, IProgressMonitor monitor) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		List<PRISMExperiment> experiments = new ArrayList<PRISMExperiment>();
		PRISMExperiment next;
		while ((next = parse(reader, monitor))!=null) {
			experiments.add(next);
			if (monitor.isCanceled()) {
				process.destroy();
				return null;
			}
		}
		return experiments;
	}
	
	/**
	 * Generate plots from a list of PRISM experiments.
	 * @param experiments List of experiments.
	 * @return Generated plot.
	 */
	public static StateSpaceXYPlot generatePlot(StateSpace stateSpace, List<PRISMExperiment> experiments) {
		
		// Find out which parameters are changing:
		Set<String> parameters = experiments.get(0).getConstants().keySet();
		List<String> changing = new ArrayList<String>();
		for (String param : parameters) {
			for (int i=1; i<experiments.size(); i++) {
				double val1 = experiments.get(i-1).getConstants().get(param);
				double val2 = experiments.get(i).getConstants().get(param);
				if (val1!=val2) {
					changing.add(param);
					break;
				}
			}
		}
		
		// Find out which parameter to use for the X-axis:
		String variable;
		if (!changing.isEmpty()) {
			variable = changing.get(0);
			String userPreference = PRISMUtil.getPRISMExperiment(stateSpace);
			if (userPreference!=null && changing.contains(userPreference)) {
				variable = userPreference;
			}
		} else {
			variable = "x";
		}
		
		// Now partition the experiments into plots:
		List<List<PRISMExperiment>> plots = new ArrayList<List<PRISMExperiment>>();
		for (PRISMExperiment experiment1 : experiments) {
			boolean found = false;
			for (List<PRISMExperiment> plot : plots) {
				PRISMExperiment experiment2 = plot.get(0);
				boolean compatible = true;
				for (String param : parameters) {
					Double val1 = experiment1.getConstants().get(param);
					Double val2 = experiment2.getConstants().get(param);
					if (!param.equals(variable) && !val1.equals(val2)) {
						compatible = false; 
						break;
					}
				}
				if (compatible) {
					plot.add(experiment1);
					found = true;
					break;
				}
			}
			if (!found) {
				plots.add(new ArrayList<PRISMExperiment>());
				plots.get(plots.size()-1).add(experiment1);
			}
		}
		
		// Create the plots:
		double[][] xValues = new double[plots.size()][];
		double[][] yValues = new double[plots.size()][];
		
		// Now create the plots:
		for (int i=0; i<plots.size(); i++) {
			
			// The current plot:
			List<PRISMExperiment> plot = plots.get(i);
			int length = plot.size();
			
			// X- and Y-values for this plot:
			xValues[i] = new double[length];
			yValues[i] = new double[length];
			int xDefault = 1;
			for (int j=0; j<length; j++) {
				xValues[i][j] = plot.get(j).getConstants().containsKey(variable) ? plot.get(j).getConstants().get(variable) : xDefault++;
				yValues[i][j] = plot.get(j).getResult();
			}
							
		}
		
		// Create the legend:
		String[] legend = null;
		if (plots.size()>1) {
			legend = new String[plots.size()];
			for (int i=0; i<legend.length; i++) {
				legend[i] = "";
				for (String param : changing) {
					if (param.equals(variable)) continue;
					if (legend[i].length()>0) {
						legend[i] = legend[i] + ",";
					}
					String value = NUMBER_FORMAT.format(experiments.get(i).getConstants().get(param));
					legend[i] = legend[i] + param + "=" + value;
				}
				
			}
		}
		
		// Done:
		StateSpaceXYPlot plot = new StateSpaceXYPlot(variable, "Result", xValues, yValues, legend);
		//System.out.println(plot);
		return plot;

	}
	
	/**
	 * Parse the output of PRISM and generate a validation result.
	 * @param stateSpace The state space.
	 * @param process The PRISM process.
	 * @param monitor Progress monitor.
	 * @return The validation result.
	 * @throws Exception On errors.
	 */
	public static ValidationResult parseValidationResult(StateSpace stateSpace, Process process, IProgressMonitor monitor) throws Exception {
		
		// Parse the experiments:
		List<PRISMExperiment> experiments = parseAll(process, monitor);
		
		// There must be at least one experiment:
		if (experiments.isEmpty()) {
			throw new RuntimeException("Unexpected PRISM output");
		}
		
		// Single result or a plot?
		if (experiments.size()==1) {
			double value = experiments.get(0).getResult();
			return new ValidationResult(true, "Result: " + NUMBER_FORMAT.format(value), value);
		} else {
			StateSpaceXYPlot plot = PRISMExperiment.generatePlot(stateSpace, experiments);
			return new ValidationResult(true, null, plot);
		}

	}
	
}
