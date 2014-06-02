Repository Server Project
=========================

The code of the server component is organized in the following directories in the "src/main" folder:

		java : contains the source code
		resources : contains configuration files for the web application
		tomee : contains configuration files and external dependencies for the TomEE application server
		webapp: contains configuration files for the web application and openEJB

The source code is organized in the following packages:

		eu.artist.reusevol.repo.exceptions : Definition of some business exceptions (obsolete) 
		eu.artist.reusevol.repo.server.jcr : Database session handling
		eu.artist.reusevol.repo.server.rest : Implementation of the web service layer
		eu.artist.reusevol.repo.server.security : first incomplete integration of authorization service
		eu.artist.reusevol.repo.server.service : Implementation of the data and business service layer
		eu.artist.reusevol.repo.server.util : Utilities

All tests can be found under "src/test".

To start the server, issue

		mvn tomee:run
		
To execute the tests, issue

		mvn clean test

All code of the repository server is published under the EPL v1.0 license.