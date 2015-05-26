ARTIST Marketplace
==================

Purpose
-------

Purpose of the ARTIST Marketplace is to 


Project structure
-----------------

The code of the server component is organized in the following directories in the "src/main" folder:

		java : contains the source code
		resources : contains the freemarker templates and the other web related resources of the webapp

The source code is organized in the following packages:

		eu.artist.reusevol.mp            : The Dropwizard bundle that adds the Marketplace webapp to a Dropwizard installation  
		eu.artist.reusevol.mp.model      : The marketplace specific domain model classes
		eu.artist.reusevol.mp.providers  : Jersey Providers to handle form submissions 
		eu.artist.reusevol.mp.resources  : The controller part of the webapp
		eu.artist.reusevol.mp.security   : Integration with the Repository server security system and Session handling
		eu.artist.reusevol.mp.util       : Utilities and constants
		eu.artist.reusevol.mp.views      : The view part of the webapp


Building and running
--------------------

You can build the marketplace jar in the /target directory with the command 

	mvn package -DskipTests 
	
Currently the ARTIST Marketplace is bundled with the ARTIST Repository server. Start the server with

	java -jar repo.server-2.0.0.jar server repository.yml
	
where 'repo.server-2.0.0.jar' is the name of the self contained server jar produced by the 'repo.server' project containing all the 
dependencies needed by the ARTIST Repository server. 'repository.yml' is the configuration file in YAML format to 
customize different aspects of the repository. The configuration file offers all the options of a 
standard Dropwizard configuration file (see the [Dropwizard Configuration Reference][dw-config]). 

See the config files in the 'repo.config' project for additional options.


Licensing Information
---------------------

All code of the repository server is published under the EPL v1.0 license.


Links
-----

[dw-config]: https://dropwizard.github.io/dropwizard/manual/configuration.html  "Dropwizard Configuration Reference"