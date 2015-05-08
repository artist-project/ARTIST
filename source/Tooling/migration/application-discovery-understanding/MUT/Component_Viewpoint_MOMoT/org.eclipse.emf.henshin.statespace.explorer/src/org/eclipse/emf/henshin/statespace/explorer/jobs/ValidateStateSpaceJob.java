/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.explorer.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.henshin.statespace.StateSpaceManager;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.StateSpaceValidator;
import org.eclipse.emf.henshin.statespace.ValidationResult;

/**
 * Job for running a state space validator.
 * @author Christian Krause
 */
public class ValidateStateSpaceJob extends AbstractStateSpaceJob {
	
	// State space validator:
	private StateSpaceValidator validator;
	
	// Property to be checked:
	private String property;
	
	// Validation result:
	private ValidationResult result;
	
	/**
	 * Default constructor.
	 * @param validator State space validator.
	 * @param manager State space manager.
	 */
	public ValidateStateSpaceJob(StateSpaceManager manager) {
		super("Validating state space...", manager);
		setUser(true);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			validator.setStateSpaceIndex(getStateSpaceManager());
			validator.setProperty(property);
			result = validator.validate(getStateSpaceManager().getStateSpace(), monitor);
		} catch (Exception e) {
			String message = e.getMessage()!=null ? e.getMessage() : "Error validating property";
			return new Status(IStatus.ERROR, StateSpacePlugin.PLUGIN_ID, 0, message, e);
		}
		return Status.OK_STATUS;
	}
	
	public ValidationResult getValidationResult() {
		return result;
	}

	public void setValidator(StateSpaceValidator validator) {
		this.validator = (StateSpaceValidator) validator;
		setName("Running " + validator.getName() + "...");
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
}
