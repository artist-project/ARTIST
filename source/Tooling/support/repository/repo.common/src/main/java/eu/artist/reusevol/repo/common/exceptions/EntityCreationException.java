/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.exceptions;

public class EntityCreationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7203740787887306243L;

	public EntityCreationException(String msg) {
		super(msg);
	}

	public EntityCreationException() {
		super();
	}

	public EntityCreationException(Throwable ex) {
		super(ex);
	}

	public EntityCreationException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
