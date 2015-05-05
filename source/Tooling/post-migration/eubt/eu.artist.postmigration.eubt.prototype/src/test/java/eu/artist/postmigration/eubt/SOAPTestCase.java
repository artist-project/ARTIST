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
package eu.artist.postmigration.eubt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import eu.artist.postmigration.eubt.applications.APPLICATION_TYPE;
import eu.artist.postmigration.eubt.applications.SOAPApplication;
import eu.artist.postmigration.eubt.exceptions.EUBTException;
import eu.artist.postmigration.eubt.monitors.Monitor;
import eu.artist.postmigration.eubt.monitors.SOAPMonitor;
import eu.artist.postmigration.eubt.oracles.ASSERTION_LEVEL;
import eu.artist.postmigration.eubt.requests.Request;
import eu.artist.postmigration.eubt.requests.SOAPRequest;

/**
 * @author pneubaue
 *
 */
public class SOAPTestCase {
	
	private static final String ORIGINAL_APP_SERVICE_NAMESPACE = "http://webservices.artist.eu/";
	private static final String MIGRATED_APP_SERVICE_NAMESPACE = "http://webservices.artist.eu/";
	private static final String ORIGINAL_APP_WSDL_SCHEMA = "http://artist-jaxws-original.appspot.com/WebservicesDemoService_schema1.xsd";
	private static final String MIGRATED_APP_WSDL_SCHEMA = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService_schema1.xsd";
	private static final String ORIGINAL_APP_WSDL = "http://artist-jaxws-original.appspot.com/WebservicesDemoService.wsdl";
	private static final String MIGRATED_APP_WSDL = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService.wsdl";
	private static final String ORIGINAL_APP_SERVICE_URL = "http://artist-jaxws-original.appspot.com/WebservicesDemoService";
	private static final String MIGRATED_APP_SERVICE_URL = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService";
	private static final String PATH_TO_MIGRATED_REQUEST_FOLDER = System.getProperty("user.dir") + "\\requests\\migrated\\";
	
	final SOAPApplication modernizedApplication = new SOAPApplication(APPLICATION_TYPE.MODERNIZED_APPLICATION, MIGRATED_APP_SERVICE_URL, MIGRATED_APP_WSDL,
			MIGRATED_APP_WSDL_SCHEMA, "WebservicesDemoService", "WebservicesDemoPort", ORIGINAL_APP_SERVICE_NAMESPACE);
	final SOAPApplication originalApplication = new SOAPApplication(APPLICATION_TYPE.ORIGINAL_APPLICATION, ORIGINAL_APP_SERVICE_URL, ORIGINAL_APP_WSDL,
			ORIGINAL_APP_WSDL_SCHEMA, "WebservicesDemoService", "WebservicesDemoPort", MIGRATED_APP_SERVICE_NAMESPACE);

	final Monitor monitor = new SOAPMonitor(modernizedApplication, originalApplication);
	
	@Test
	public void setupTest() throws EUBTException {		
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
	}// setupTest
	
	@Test
	public void obtainUserEqualTest() throws EUBTException {
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
		Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "obtainUser_equal.xml", "http://webservices.artist.eu/ObtainUser");
		monitor.executeRequest(modernizedRequest);
		assertTrue(monitor.evaluateResponses(ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL));
	}// obtainUserEqualTest
	
	@Test
	public void obtainUserUnequalTest() throws EUBTException {
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
		Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "obtainUser_unequal.xml", "http://webservices.artist.eu/ObtainUser");
		monitor.executeRequest(modernizedRequest);
		assertFalse(monitor.evaluateResponses(ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL));
	}// obtainUserUnequalTest
	
	@Test
	public void createPetCategoryTest() throws EUBTException {
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
		Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "createPetCategory.xml", "http://webservices.artist.eu/CreatePetCategory");
		monitor.executeRequest(modernizedRequest);
		assertTrue(monitor.evaluateResponses(ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL));
	}// createPetCategoryTest
	
	@Test
	public void getPetCategoryTest() throws EUBTException {
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
		Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "getPetCategory.xml", "http://webservices.artist.eu/GetPetCategory");
		monitor.executeRequest(modernizedRequest);
		assertTrue(monitor.evaluateResponses(ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL));
	}// getPetCategoryTest
	
	@Test
	public void createUserTest() throws EUBTException {
		monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");
		Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "createUser.xml", "http://webservices.artist.eu/CreateUser");
		monitor.executeRequest(modernizedRequest);
		assertTrue(monitor.evaluateResponses(ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL));
	}// getPetCategoryTest
	
	public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(SOAPTestCase.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}// main
	
}
