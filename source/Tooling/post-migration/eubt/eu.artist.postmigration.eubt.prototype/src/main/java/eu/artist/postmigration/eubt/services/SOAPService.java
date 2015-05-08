/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.eubt.services;

/**
 * @author pneubaue
 * 
 */
public class SOAPService implements Service {

	private String serviceLocation;

	public SOAPService() {
		// avoid default constructor instantiation
	}

	public String getServiceLocation() {
		return serviceLocation;
	}

	public void setServiceLocation(final String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	/**
	 * @param serviceLocation
	 */
	public SOAPService(final String serviceLocation) {
		super();
		this.serviceLocation = serviceLocation;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.services.Service#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		// TODO IMPLEMENT
		return false;
	}

}
