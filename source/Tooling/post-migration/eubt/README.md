End User-Based Testing (EUBT) Prototype
Release date: 4/9/2014
=======================================

Copyright
---------
Copyright (c) 2014 Vienna University of Technology. All rights reserved.

Licenses
--------
This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html

Reference
---------
The End User-Based Testing (EUBT) Prototype is described in the ARTIST deliverable D11.2 (currently under review), which is part of task 11.2 in work package 11.

Expected Functionality
----------------------
User requests are assumed to be created by a real user on the migrated software and stored to the file system.
The prototype then uses these user request files and a migration trace model to map the migrated user request to one or multiple original user requests to induce equivalent behavior on both sides.
To verify whether the two systems actually behave equally, the respective runtime traces are extracted from both system and abstracted into a platform-specific compatible trace.
After comparing both traces, which are compatible to each other, a verdict about their equivalence can be yielded.
A runtime trace is defined as the output of a request (i.e., the response), operation calls, their parameters, as well as their parameter values.
The test oracle can distinguish a comparison to be successful if both traces contain the response of equivalent operation calls, or equivalent operation calls and their parameter names, or equivalent operation calls, their parameter names, and their parameter values.

Known/Open Issues
-----------------
  * Automatic and direct user request capturing from running applications
  * Support for different web service types other than SOAP (i.e., UI-based applications, REST web services, etc.)
  *  Replacement of exemplaric migration trace model with the migration trace model eventually established within the context of ARTIST WP9

Instructions to build
---------------------
Running the build requires Apache Maven to be installed, either as an Eclipse plugin (case A) or natively on the machine (case B).

In case A, it has been tested successfully using "Eclipse Kepler Service Release 2 (20140224-0627)", Apache Maven plugin "m2e - Maven Integration for Eclipse (1.5.0.20140606-0033)" and JDK 1.7.0_51 on Windows 7.
In case B, it has been tested successfully using "Apache Maven 3.2.1" and Oracle Java version 1.8.0_25 on Windows 7.

To run a native Maven build change to the main project folder (i.e., "eu.artist.postmigration.eubt") and issue the following command:
> mvn clean install

To run the build from inside Eclipse proceed as follows:
> Right click on the project
> Select “ Run As > Maven install”

Instructions to run tests
-------------------------
The test cases can be run as part of the build process or standalone using native Maven or Eclipse.

By running the following command the build process, including the test cases, are executed:
> mvn clean install

To run the test cases only (without build), issue the following command:
> mvn test

To run the test cases inside the Eclipse IDE:
> Right click on "SOAPTestCase.java" 
> Select Run as > JUnit test.

Instructions on how to build test cases
---------------------------------------
The JUnit test or other source code example to that represents an entire ARTIST end user-based test case has the following minimum required steps. In the following we go through a list of steps that are required to build up such a test case.

STEP 1: Setup the migrated application and original application information.
> SOAPApplication modernizedApplication = new SOAPApplication(APPLICATION_TYPE.MODERNIZED_APPLICATION, MIGRATED_APP_SERVICE_URL, MIGRATED_APP_WSDL, MIGRATED_APP_WSDL_SCHEMA, "WebservicesDemoService", "WebservicesDemoPort", ORIGINAL_APP_SERVICE_NAMESPACE);
> SOAPApplication originalApplication = new SOAPApplication(APPLICATION_TYPE.ORIGINAL_APPLICATION, ORIGINAL_APP_SERVICE_URL, ORIGINAL_APP_WSDL, ORGINAL_APP_WSDL_SCHEMA, "WebservicesDemoService", "WebservicesDemoPort", MIGRATED_APP_SERVICE_NAMESPACE);

STEP 2: Setup the monitor component.
> Monitor monitor = new SOAPMonitor(modernizedApplication, originalApplication);
> monitor.setup("models/PetstoreWSMigrationTrace_Request.xmi", "models/PetstoreWSMigrationTrace_Response.xmi");

Note that the “ PetstoreWSMigrationTrace_Request.xmi ” and “ PetstoreWSMigrationTrace_Response.xmi ” files in step 2 refer to the request trace model and the response trace model, respectively. These models could be produced during the migration process in the ARTIST project. To be more specific, during the reverse engineering and forward engineering process, i.e., WP8 and WP9, respectively. These models enclose information on the correspondence between original elements and migrated elements. Within the Eclipse IDE, the “Sample Reflective Ecore Modeling Editor” has been used to create the aforementioned model files.

STEP 3: Setup the migrated application and original application information.
> Request modernizedRequest = new SOAPRequest(APPLICATION_TYPE.MODERNIZED_APPLICATION, PATH_TO_MIGRATED_REQUEST_FOLDER + "createUser.xml", "http://webservices.artist.eu/CreateUser");

The XML file location stated in step 3 refers to a XML file containing a concrete migrated SOAP envelope in XML notation. The corresponding original SOAP envelope, to be issued to the original web service, is created by the prototype using the supplied migration trace model.

STEP 4: Specifying the modernized request to be issued.
> monitor.executeRequest(modernizedRequest);

STEP 5:  Evaluating the response retrieved from the web service.
> assertTrue( monitor.evaluateResponses( ASSERTION_LEVEL.ATTRIBUTE_VALUE_LEVEL ) );

The evaluation in step 5 can be made at different levels of comparison. The responses retrieved by the Monitor and (internally) evaluated by the TestOracle will return “ true ” if the verdict produced is “ PASS ” and “ false ” in case the verdict produced is “ FAIL ”.
Within the prototype, SOAP web services can be compared at the following levels of comparison:
  * Operation level (i.e., the operation name)
  * Parameter level (i.e., the operation name and the parameter names)
  * Parameter value level (i.e., the operation name, the parameter names, and the parameter values)

Details on the exemplary web services
-------------------------------------
The exemplary web services developed for these test cases and deployed at the Google App Engine.
To deploy them on the local machine change to their particular project directory (i.e., "eu.artist.postmigration.eubt.example.ws.migrated" or "eu.artist.postmigration.eubt.example.ws.original") and run:
> mvn appengine:devserver

The exemplary web services are located and identified as follows:
ORIGINAL_APP_SERVICE_NAMESPACE = "http://webservices.artist.eu/";
MIGRATED_APP_SERVICE_NAMESPACE = "http://webservices.artist.eu/";
ORIGINAL_APP_WSDL_SCHEMA = "http://artist-jaxws-original.appspot.com/WebservicesDemoService_schema1.xsd";
MIGRATED_APP_WSDL_SCHEMA = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService_schema1.xsd";
ORIGINAL_APP_WSDL = "http://artist-jaxws-original.appspot.com/WebservicesDemoService.wsdl";
MIGRATED_APP_WSDL = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService.wsdl";
ORIGINAL_APP_SERVICE_URL = "http://artist-jaxws-original.appspot.com/WebservicesDemoService";
MIGRATED_APP_SERVICE_URL = "http://artist-jaxws-migrated.appspot.com/WebservicesDemoService";