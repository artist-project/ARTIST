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

import java.text.ParseException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.statespace.Model;
import org.eclipse.emf.henshin.statespace.State;
import org.eclipse.emf.henshin.statespace.StateSpaceIndex;
import org.eclipse.emf.henshin.statespace.StateSpacePlugin;
import org.eclipse.emf.henshin.statespace.StateValidator;
import org.eclipse.emf.henshin.statespace.ValidationResult;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.helper.OCLHelper;

/**
 * OCL state validator.
 * @author Christian Krause
 */
public class OCLStateValidator implements StateValidator {
	
	/**
	 * ID of this validator.
	 */
	public static final String VALIDATOR_ID = "org.eclipse.emf.henshin.statespace.validators.ocl";
	
	/**
	 * Register this validator in the global validator registry in the state space plug-in.
	 */
	public static void register() {
		StateSpacePlugin.INSTANCE.getValidators().put(VALIDATOR_ID, new OCLStateValidator());
	}
	
	// Property to be checked.
	private String property;

	// State space index.
	private StateSpaceIndex index;
	
	// OCL:
	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
	
	// OCL helper:
	private OCLHelper<EClassifier, ?, ?, Constraint> helper;
	
	// Parsed constraint:
	private Constraint constraint;
	
	// Context classifier:
	private EClassifier classifier;

	/**
	 * Default constructor.
	 */
	public OCLStateValidator() {
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
		helper = ocl.createOCLHelper();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateValidator#validate(org.eclipse.emf.henshin.statespace.State, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public ValidationResult validate(State state, IProgressMonitor monitor) throws Exception {
		
		// Get the model for the current state:
		Model model = index.getModel(state);
		
		// Check the constraint for all root elements:
		for (EObject root : model.getResource().getContents()) {
			
			// Update the context and the constraint:
			if (constraint==null || classifier!=root.eClass()) {
				classifier = root.eClass();
			  	helper.setContext(classifier);
			  	try {
			  		constraint = helper.createInvariant(property);
			  	} catch (Exception e) {
			  		throw new RuntimeException("Problem in property \"" + property + "\": " + e.getMessage(), e);
			  	}
			}
			
			// Check the constraint:
			if (!ocl.check(root, constraint)) {
				monitor.done();
				return ValidationResult.INVALID;
			}
			
		}
		
		// Invariant is true.
		monitor.done();
		return ValidationResult.VALID;
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#setProperty(java.lang.String)
	 */
	public void setProperty(String property) throws ParseException {
		this.property = property;
		this.constraint = null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#setStateSpaceIndex(org.eclipse.emf.henshin.statespace.StateSpaceIndex)
	 */
	public void setStateSpaceIndex(StateSpaceIndex index) {
		this.index = index;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.statespace.StateSpaceValidator#getName()
	 */
	public String getName() {
		return "OCL";
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
