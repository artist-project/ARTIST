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

/**
 * This execption indicates that the entity requested by a query or request has
 * not been found.
 * 
 * @author strauss
 * 
 */
public class NoSuchEntityException extends RuntimeException {
	private static final long serialVersionUID = 8304265997290902475L;

	public NoSuchEntityException() {
		super();
	}

	public NoSuchEntityException(String msg) {
		super(msg);
	}

	public NoSuchEntityException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchEntityException(Throwable cause) {
		super(cause);
	}
}
