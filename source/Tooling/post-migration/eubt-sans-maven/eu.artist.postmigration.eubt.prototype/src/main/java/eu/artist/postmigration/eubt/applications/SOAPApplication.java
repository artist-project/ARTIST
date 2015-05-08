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
package eu.artist.postmigration.eubt.applications;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import eu.artist.postmigration.eubt.Debug;
import eu.artist.postmigration.eubt.exceptions.EUBTException;

/**
 * @author pneubaue
 * 
 */
public class SOAPApplication implements Application {

	private String serviceLocation;
	private String serviceWsdlLocation;
	private String serviceSchemaLocation;
	private String serviceName;
	private String servicePort;
	private String serviceTargetNamespace;
	private APPLICATION_TYPE applicationType;

	@SuppressWarnings("unused")
	private SOAPApplication() {
		// avoid default constructure instatiation
	}

	/**
	 * 
	 * @param serviceLocation WSDL service URL
	 * @param serviceName
	 * @param servicePort
	 */
	public SOAPApplication(final APPLICATION_TYPE applicationType, final String serviceLocation, final String serviceWsdlLocation,
			final String serviceSchemaLocation, final String serviceName, final String servicePort, final String serviceTargetNamespace) {
		this.serviceLocation = serviceLocation;
		this.serviceWsdlLocation = serviceWsdlLocation;
		this.serviceSchemaLocation = serviceSchemaLocation;
		this.applicationType = applicationType;
		this.serviceName = serviceName;
		this.servicePort = servicePort;
		this.serviceTargetNamespace = serviceTargetNamespace;
	}

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.applications.Application#getType()
	 */
	public APPLICATION_TYPE getType() {
		return applicationType;
	}// getType

	/* (non-Javadoc)
	 * @see eu.artist.postmigration.eubt.applications.Application#isAvailable()
	 */
	public void isAvailable() throws EUBTException {
		isServiceWsdlAvailable();
		isServiceSchemaAvailable();
	}// isAvailable

	/**
	 * @throws EUBTException
	 */
	private void isServiceWsdlAvailable() throws EUBTException {
		try {
			// check if the provided service WSDL location represents a valid URL
			final URL destinationUrl = new URL(serviceWsdlLocation);
			// check availability of service, if not available throw exception
			final HttpURLConnection connection = (HttpURLConnection) destinationUrl.openConnection();
			connection.setRequestProperty("Connection", "close");
			connection.setConnectTimeout(10000); // Timeout 10 seconds
			connection.connect();
			// If not available
			if (connection.getResponseCode() != 200) {
				throw new EUBTException(applicationType + " service WSDL at " + serviceWsdlLocation + " is not available. Response code: "
						+ connection.getResponseCode());
			}
		} catch (final MalformedURLException e) {
			throw new EUBTException(applicationType + " service WSDL at " + serviceWsdlLocation + " is not a valid URL. Exception: " + e);
		} catch (final IOException e) {
			throw new EUBTException(applicationType + " service WSDL at " + serviceWsdlLocation + " is not available. Exception: " + e);
		}
		Debug.out(this, "Successfully found " + applicationType + " service WSDL at " + serviceWsdlLocation);
	}

	/**
	 * 
	 */
	private void isServiceSchemaAvailable() throws EUBTException {
		try {
			// check if the provided service schema location represents a valid URL
			final URL destinationUrl = new URL(serviceSchemaLocation);
			// check availability of service, if not available throw exception
			final HttpURLConnection connection = (HttpURLConnection) destinationUrl.openConnection();
			connection.setRequestProperty("Connection", "close");
			connection.setConnectTimeout(10000); // Timeout 10 seconds
			connection.connect();
			// If not available
			if (connection.getResponseCode() != 200) {
				throw new EUBTException(applicationType + " service Schema at " + serviceSchemaLocation + " is not available. Response code: "
						+ connection.getResponseCode());
			}
		} catch (final MalformedURLException e) {
			throw new EUBTException(applicationType + " service Schema at " + serviceSchemaLocation + " is not a valid URL. Exception: " + e);
		} catch (final IOException e) {
			throw new EUBTException(applicationType + " service Schema at " + serviceSchemaLocation + " is not available. Exception: " + e);
		}
		Debug.out(this, "Successfully found " + applicationType + " service Schema at " + serviceSchemaLocation);
	}

	public String getServiceLocation() {
		return serviceLocation;
	}

	public String getServiceName() {
		return serviceName;
	}

	public String getServicePort() {
		return servicePort;
	}

	public String getServiceTargetNamespace() {
		return serviceTargetNamespace;
	}

	public String getServiceWsdlLocation() {
		return serviceWsdlLocation;
	}

	public String getServiceSchemaLocation() {
		return serviceSchemaLocation;
	}
}
