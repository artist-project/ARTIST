/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.workflow.exceptions;

public class TransitionFailedException extends RuntimeException {

	private static final long serialVersionUID = 6114901532981159406L;
	
	public TransitionFailedException() { }

	public TransitionFailedException(String message) {
		super(message);
	}
	
	public TransitionFailedException(String message, Exception ex) {
		super(message, ex);
	}

}
