/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace;

/**
 * Validation result data class.
 * 
 * @author Christian Krause
 * @generated NOT
 */
public final class ValidationResult {

	/**
	 * Static validation result for successful validations without messages.
	 */
	public static final ValidationResult VALID = new ValidationResult(true);

	/**
	 * Static validation result for invalid properties, without extra message or data.
	 */
	public static final ValidationResult INVALID = new ValidationResult(false);
	
	// Valid-flag.
	private boolean valid;
	
	// Message.
	private String message;
	
	// Result.
	private Object result;
	
	/**
	 * Default constructor.
	 * @param valid Valid-flag.
	 * @param message Message.
	 * @param result Result.
	 */
	public ValidationResult(boolean valid, String message, Object result) {
		if (message==null) {
			message = valid ? "Property satified." : "Property not satisfied.";
		}
		this.valid = valid;
		this.message = message;
		this.result = result;
	}

	/**
	 * Constructor.
	 * @param valid Valid-flag.
	 * @param message Message.
	 */
	public ValidationResult(boolean valid, String message) {
		this(valid, message, null);
	}

	/**
	 * Constructor.
	 * @param valid Valid-flag.
	 */
	public ValidationResult(boolean valid) {
		this(valid, null);
	}

	/**
	 * Returns <code>true</code> if a property was successfully validated.
	 * @return <code>true</code> if the property is valid.
	 */
	public boolean isValid() {
		return valid;
	}
	
	/**
	 * Get the message associated with this validation result.
	 * @return Message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Get the optional result associated with this result.
	 * @return Validation result.
	 */
	public Object getResult() {
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (message!=null) return message;
		return String.valueOf(valid);
	}
	
}
