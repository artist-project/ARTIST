Repository Configuration
========================

Purpose
-------

This project contains the configuration classes for the repository (represented e.g. in the 'repository.yml' file), 
the SSL client and the WSO2 client. The server in the 'repo.server'-project is configured by the 'repository.yml' 
configuration file in YAML format. By editing this file you can customize different aspects of the repository. 
The configuration file offers all the options of a standard Dropwizard configuration file 
(see the [Dropwizard Configuration Reference][dw-config]). 

The project contains the following configurations:

* 	[RepositoryConfiguration](src/main/java/eu/artist/reusevol/repo/config/RepositoryConfiguration.xtend) for the options
	of the ARTIST Repository
* 	[Wso2Configuration](src/main/java/eu/artist/reusevol/repo/config/Wso2Configuration.xtend)
	for the options concerning the integration of the ARTIST repository with the WSO2 Identity Server that
	manages the repository users.
*	[SSLConfiguration](src/main/java/eu/artist/reusevol/repo/config/SSLConfiguration.xtend) for
	options concerning HTTPS key- and truststores. 

The Wso2Configuration is nested in the config file under 'wso2'. The SSLConfiguration is nested in the 'wso2' parts 
under 'ssl'. See the 'repository.yml' file for an example. 


Project structure
-----------------

The source code is organized in the following packages:

		eu.artist.reusevol.repo.config : The configuration classes of the repository components 


Building
--------

To build the project, issue  

	mvn install -DskipTests 
	


Licensing Information
---------------------

All code of this project is published under the EPL v1.0 license.


Links
-----

[dw-config]: https://dropwizard.github.io/dropwizard/manual/configuration.html  "Dropwizard Configuration Reference"