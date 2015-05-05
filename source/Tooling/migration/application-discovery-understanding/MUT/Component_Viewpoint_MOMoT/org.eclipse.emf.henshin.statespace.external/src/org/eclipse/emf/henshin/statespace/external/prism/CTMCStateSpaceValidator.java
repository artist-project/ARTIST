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

import java.io.File;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.henshin.statespace.StateSpace;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.emf.henshin.statespace.external.AbstractFileBasedValidator;

/**
 * PRISM CTMC state space validator.
 * @author Christian Krause
 */
public class CTMCStateSpaceValidator extends AbstractFileBasedValidator {
	
	/**
	 * ID of this validator.
	 */
	public static final String VALIDATOR_ID = "org.eclipse.emf.henshin.statespace.validator.prism.ctmc";
	
	/**
	 * Register this validator in the global validator registry in the state space plug-in.
	 */
	public static void register() {
		StateSpacePlugin.INSTANCE.getValidators().put(VALIDATOR_ID, new CTMCStateSpaceValidator());
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.StateSpaceValidator#validate(org.eclipse.emf.henshin.statespace.StateSpace, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public ValidationResult validate(StateSpace stateSpace, IProgressMonitor monitor) throws Exception {
		
		monitor.beginTask("Checking CSL property...", 4);

		// Generate the model file.
		CTMCStateSpaceExporter exporter = new CTMCStateSpaceExporter();
		File modelFile = export(stateSpace, exporter, null, "sm", new SubProgressMonitor(monitor, 1));

		// Generate the CSL file.
		String expanded = PRISMUtil.expandLabels(property, index, new SubProgressMonitor(monitor, 1));
		File cslFile = createTempFile("property", ".csl", expanded);


		// Invoke the PRISM tool:
		monitor.subTask("Running PRISM...");
		Map<String, String> constants = PRISMUtil.getAllRates(stateSpace, true);
		Process process = PRISMUtil.invokePRISM(stateSpace, modelFile, cslFile, null, constants, true, new SubProgressMonitor(monitor, 1));
		
		// Parse the experiments:
		return PRISMExperiment.parseValidationResult(stateSpace, process, new SubProgressMonitor(monitor, 1));
		
	}	
			
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#getName()
	 */
	@Override
	public String getName() {
		return "PRISM CTMC";
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.validation.Validator#usesProperty()
	 */
	@Override
	public boolean usesProperty() {
		return true;
	}

}
