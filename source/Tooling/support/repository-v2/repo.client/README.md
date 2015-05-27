ARTIST Repository client 
========================

Purpose
-------

This project contains a Java client to access the services of the ARTIST Repository. 


Installation
------------

Build the whole project by issuing the following command in the 'Repository' folder:

		mvn clean install -DskipTests
		
You will find the client jar in the folder 'Repository/repo.client/target' and the dependencies in
'Repository/repo.client/target/lib'. Include all these jar in your build path and you should be ready
to go.


Configuration
-------------
Since the repository uses the WSO2 Identity Server for user management and authentication, the necessary 
configuration includes the options described in the 'repo.config' project.



Licensing Information
---------------------

All code of this project is published under the EPL v1.0 license.
