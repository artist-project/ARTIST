ARTIST Repository client 
========================

Purpose
-------

This project contains a Java client to access the services of the ARTIST Repository and to ease integration 
with other ARTIST tools. 


Functionality included in this version
--------------------------------------

The following functionality is provided as Java API:

- Management (create, read, update, delete, list and filter) of projects (aka dedicated artefact collections)
- Management (create, read, update, delete, list and filter) of artefact metadata and content
- Management (create, read, update, delete, list and filter) of hierarchical categories
- Assignment of categories
- Tagging of artefacts
- Rating of artefacts
- Commenting of artefacts
- Linear versioning of artefacts
- OAuth2 authentication and access control
- Retrieval by structure ({project}/{package}/{artefact})
- Retrieval by category
- Retrieval by tag


Documentation
-------------

Installation instructions , user manual and API documentation can be found in the ARTIST deliverable D10.3.2 "Repository Prototype" 
soon to be available at http://www.artist-project.eu/documents.


Known issues of this version
----------------------------

- No issues known so far


Installation Instructions
-------------------------

To use the Repository API client in your project, include the file "repo.client-2.0.0.jar" and all JAR
files in the "lib" directory in the classpath of your project.


Configuration
-------------

Since the repository uses the WSO2 Identity Server for user management and authentication, the necessary 
configurations can be made in eu.artist.reusevol.repo.config.Wso2Configuration. See this file (to be found in the
source section in the 'repo.config' project) and the documentation for reference.


Disclaimer
----------

This software is a research prototype and is not suited for production use.


Copyright and license
---------------------

Copyright (c) Fraunhofer IAO 2015 except where stated otherwise.
All code of the ARTIST Repository is published under the EPL v1.0 license.

