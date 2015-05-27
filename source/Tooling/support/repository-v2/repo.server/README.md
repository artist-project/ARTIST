Repository Server Project
=========================

Project structure
-----------------

The code of the server component is organized in the following directories in the "src/main" folder:

		java : contains the source code (including tests)
		resources : contains configuration files for the web application

The source code is organized in the following packages:

		eu.artist.reusevol.server                : The main application and configuration classes 
		eu.artist.reusevol.server.core           : Generic template implementations for REST resources, JCR DAOs and data services
		eu.artist.reusevol.server.core.dao       : Concrete DAO classes
		eu.artist.reusevol.server.core.model     : Server specific domain classes
		eu.artist.reusevol.server.core.modeshape : Database specific classes for managing the Modeshape JCR engine
		eu.artist.reusevol.server.core.security  : Integration with WSO2 IS for authentication
		eu.a.r.s.core.security.annotations       : Security related annotations
		eu.a.r.s.core.security.privileges        : Helpers for dealing with application-level and JCR permissions 
		eu.artist.reusevol.server.core.service   : Concrete data service implementations
		eu.artist.reusevol.server.filters        : Servlet filters
		eu.artist.reusevol.server.health         : HealthChecks to monitor the status of the different components
		eu.artist.reusevol.server.mappers        : Mapping from exceptions to server responses 
		eu.artist.reusevol.server.resource       : Concrete implementations of the REST interface 
		eu.artist.reusevol.server.util           : Utility classes like id validators 
		eu.artist.reusevol.server.util.guice     : Small Guice extensions to honour @PreDestroy lifecycle annotations. 
		eu.artist.reusevol.server.util.search    : Integration of CXF FIQL search with Modeshape   


Building and running
--------------------

To start the server, first build the server jar in the /target directory with the command 

	mvn package -DskipTests 
	
then you can start the server with

	java -jar target/repo.server-2.0.0.jar server repository.yml
	
where 'repo.server-2.0.0.jar' is the name of the generated self contained server jar containing all the 
dependencies needed by the ARTIST Repository server. 'repository.yml' the configuration file in YAML format to 
customize different aspects of the repository. The configuration file offers all the options of a 
standard Dropwizard configuration file (see the [Dropwizard Configuration Reference][dw-config]). 

See the config files in the 'repo.config' project for additional options.


Tests
-----

All tests can be found under "src/test". To execute the tests, issue

		mvn clean test

Licensing Information
---------------------

All code of the repository server is published under the EPL v1.0 license.


Links
-----

[dw-config]: https://dropwizard.github.io/dropwizard/manual/configuration.html  "Dropwizard Configuration Reference"