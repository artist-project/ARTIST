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
import java.io.File;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.external.AbstractFileBasedValidator;

/**
 * PRISM CTMC steady-state tool.
 * @author Christian Krause
 */
public class CTMCSteadyStateTool extends AbstractFileBasedValidator {
	
	/**
	 * ID of this validator.
	 */
	public static final String VALIDATOR_ID = "org.eclipse.emf.henshin.statespace.validator.prism.ctmc.steadystates";
	
	/**
	 * Register this validator in the global validator registry in the state space plug-in.
	 */
	public static void register() {
		StateSpacePlugin.INSTANCE.getValidators().put(VALIDATOR_ID, new CTMCSteadyStateTool());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.StateSpaceValidator#validate(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public ValidationResult validate(StateSpace stateSpace, IProgressMonitor monitor) throws Exception {
		
		monitor.beginTask("Computing steady-state probabilities...", -1);
		
		// Generate the model file.
		File modelFile = export(stateSpace, new CTMCStateSpaceExporter(), null, "sm", monitor);

		// Invoke the PRISM tool:
		monitor.subTask("Running PRISM...");
		Map<String, String> constants = PRISMUtil.getAllRates(stateSpace, true);
		Process process = PRISMUtil.invokePRISM(stateSpace, modelFile, null, 
				new String[] { "-steadystate" }, constants, false, monitor);
		
		// Parse the output
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		List<Integer> states = new ArrayList<Integer>();
		List<Double> probabilities = new ArrayList<Double>();
		
		String line, time = null, error = null;
		boolean parseProbabilities = false;
		boolean parseError = false;
		MessageFormat format = new MessageFormat("{0,number,integer}:({1,number,integer})={2,number}", Locale.ENGLISH);
		
		while ((line = reader.readLine())!=null) {
			line = line.trim();
			System.out.println(line);
			if (line.length()==0) {
				parseProbabilities = false;
				parseError = false;
				continue;
			}
			if (parseProbabilities) {
				Object[] parsed = format.parse(line);
				states.add(((Number) parsed[0]).intValue()); 
				probabilities.add(((Number) parsed[2]).doubleValue()); 
			}
			else if (parseError) {
				error = error + "\n" + line;
			}
			else {
				if (line.startsWith("Probabilities:") ||
					line.startsWith("Printing steady-state probabilities in plain text format below:")) {
					parseProbabilities = true;
				} 
				else if (line.startsWith("Error")) {
					error = line;
					parseError = true;
					parseProbabilities = false;
				}
				else if (line.startsWith("Time")) {
					time = line;
				}
			}
			if (monitor.isCanceled()) {
				process.destroy();
				return null;
			}
		}
		
		// Check whether an error occurred.
		if (error!=null) {
			throw new RuntimeException(error);
		}
		
		// Pretty-print the results.
		StringBuffer result = new StringBuffer("Computed steady-state probabilities:\n\n");
		for (int i=0; i<states.size(); i++) {
			result.append("   State " + states.get(i) + ":\t" + probabilities.get(i) + "\n");
		}
		if (time!=null) result.append("\n" + time);
		
		// And we are done.
		monitor.done();
		return new ValidationResult(true, result.toString());
		
	}	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#getName()
	 */
	@Override
	public String getName() {
		return "PRISM CTMC (steady-states)";
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#usesProperty()
	 */
	@Override
	public boolean usesProperty() {
		return false;
	}

}
