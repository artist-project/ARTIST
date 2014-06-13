ARTIST Repository server runtime
================================

Purpose
-------

The purpose of the ARTIST Repository is to manage the stable artefacts produced in an 
ARTIST migration project. Since ARTIST follows an MDE approach, the artefacts most likely managed 
by the repository are meta-models, UML profiles, as well as model-to-model and model-to-text transformations. 
The focus of the ARTIST repository is to make these more abstract and stable artefacts available via browsing, 
search, a public marketplace and integration into the developer’s Eclipse workspace. The repository is less 
suited to manage model instances or artefacts that change frequently.

The current version of the prototype supports the publishing and retrieval of artefacts, the categorization and tagging 
of artefacts and basic searching capabilities. For artefact storage, a database based on the Java Content Repository (JCR) standard 
is used. The functionality is provided to the user in form of a REST based web service and as a Java-based client API 
that makes integration of the repository services with other ARTIST tools easy. 


Functionality included in this version
--------------------------------------

The following functionality is provided as REST-based web service and Java API client:

- Management (create, read, update, delete, list) of projects (aka dedicated artefact collections)
- Management (create, read, update, delete, list) of artefact metadata and content
- Management (create, read, update, delete, list) of hierarchical categories
- Tagging of artefacts
- Assignment of categories
- Retrieval by structure ({project}/{package}/{artefact})
- Retrieval by category
- Retrieval by tag


Functionality expected in next versions
---------------------------------------

- Security (authentication and authorization)
- Versioning of artefacts
- Extended search capabilities
- Feedback (comments, ratings)


Documentation
-------------

Installation instructions (Section 3.2.1 and 3.2.2), user manual (section 3.3.1) and API documentation 
(appendix A-C) can be found in the ARTIST deliverable D10.3.1 "Repository Prototype" soon to be available 
at http://www.artist-project.eu/documents.


Known issues of this version
----------------------------

- No issues known so far


Installation instructions
-------------------------

Content:

-   repo.server.war: The web archive containing the ARTIST repository server
-   tomee-overlay.zip: Additional dependencies and configuration to be installed in a freshly 
    downloaded TomeEE installation

This deployment of the provided WAR file requires an Apache TomEE 1.6.0 JAXRS server runtime 
(available from http://tomee.apache.org/downloads.html) and expects
a Modeshape JCR database to be configured as server resource. 

In order to ease installation and keep the files in this repository
as small as possible the Modeshape dependecies and configurations are 
provided in the file "tomee-overlay.zip".

Installation instructions:
    1) Download and extract TomEE 1.6.0 JAXRS
    2) Extract "tomee-overlay.zip" to the folder of the TomEE installation 
       (i.e. the folder containing the "bin" and "conf" folder. 
       The Modeshape 3.7.1 dependencies and the configuration files 
       will be copied to the TomEE installation.
    3) Copy the "repo.server.war" archive to TomEE's "webapps" folder

To start the repository server, go to the "bin" folder and execute 

    "startup.bat" or "startup.sh" 

depending on your environment. The server will run on port 8081.


Disclaimer
----------

This software is a research prototype and is not suited for production use.


Copyright and license
---------------------

Copyright (c) Fraunhofer IAO 2014 except where stated otherwise.
All code of the ARTIST Repository is published under the EPL v1.0 license.

