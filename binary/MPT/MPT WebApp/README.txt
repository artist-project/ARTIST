Methodology Process Tool (MPT) WebApp
Release date: 5/6/2014
=====================================

Copyright
---------
The source code in this distribution is © Copyright Institute of Communications and Computer Systems (ICCS) - National Technical University of Athens 2014.

Licenses
--------
This software is open source under MIT License.

Installation instructions
-------------------------
1. The MPT WebApp is a Java Server Faces (JSF) web application that runs on a web server, such as Apache Tomcat, and is packaged as a WAR file (eu.artist.methodology.mpt.webapp.war). 
It has been implemented using Eclipse Java EE IDE for Web Developers, Version: Kepler Service Release 2, and has been tested against Apache Tomcat v7.  All required Java libraries are included inside the WAR. 

The WAR also includes the following properties files for configuration:

	- mpt.properties: for configuring the path where the reports are uploaded in the hosting machine
	- database.properties: for configuring database connectivity
	- log4j.properties: for logging configuration

The usage of Eclipse is recommended to those that want to build the MPT WebApp project and generate a new WAR. 
For simply running it, open the distributed WAR using a file archiver program for zip format, edit the *.properties files mentioned above using the instructions that follow and directly save changes in the WAR file. 

2. At runtime, the MPT WebApp stores the files that are uploaded along with other required files at a specific location. 
This location can be configured by editing the following line inside the mpt.properties file:

path_to_reports=<the path to the directory where you wish the report files to be stored in your hosting machine>

3. The MPT WebApp uses PostgreSQL as a database solution (please follow installation instructions from the PostgreSQL official website).

3.1 Create a database with UTF-8 encoding:
 
		CREATE DATABASE "WebLogin"
   			 WITH OWNER = postgres
			 ENCODING = 'UTF8'
     		 CONNECTION LIMIT = -1;

Any name can be used for the database ('WebLogin' is used as an example). 

3.2 You can configure MPT WebApp to connect to the database in its database.properties file by editing the following line:

		connectionURL=jdbc:postgresql://<PostgreSQL server Port>/<name of database>
		username=<the owner of the database>
		pwd=<the owner's password>

3.3 The file 'mpt-webapp.sql' is an SQL script that creates the required tables in the database. After loading the database created in previous steps, execute the mpt-webapp.sql script as follows (assuming that the username is 'postgres' and the database is named 'WebLogin'):

		psql -d WebLogin -U postgres -f mpt-webapp.sql 

4. Log4j is used for logging. All logs are directed by default to the console. For changing the location of the created logs, their names, the used pattern etc, please edit log4j.properties before deploying the WAR.

5. Before performing deployment, make sure you performed the steps above for configuring the MPT WebApp.
The deployment of the MPT WebApp (Tomcat v7 recommended - for installing Tomcat please follow instruction in official website) can be done manually by copying the eu.artist.methodology.mpt.webapp.war inside Tomcat's 'webapps' directory and restarting Tomcat 
or by following instructions through Tomcat's Manager GUI. Upon successful deployment, the MPT WebApp can be accessed at the following URL (replace port 8080 if necessary with your Tomcat port):
		
		http://localhost:8080/eu.artist.methodology.mpt.webapp/
   





