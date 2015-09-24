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


Installation instructions
-------------------------

Content:

-   repo.server-2.0.0.jar: The web archive containing the ARTIST Repository server and all its dependencies
-   repository.yml: Main configuration file for the ARTIST Repository. It extends the standard [Dropwizard Configuration][dw-config] 
-   etc: Folder containing additional configuration files for the Modeshape JCR database

Installation instructions:

    1) Download and copy the resource mentioned above into a folder <ROOT>
    2) If needed, adjust the configuration in "repository.yml". The server provides sensible defaults and should work out of the box
    3) If needed, adjust the configuration of the database in "etc/modeshape/artist.json" 
       and "etc/modeshape/infinispan-configuration.xml". The default uses a HSQLDB database and stores data to <ROOT>/data

To start the repository server, go to the <ROOT> folder and execute 

    java -jar repo.server-2.0.0.jar server repository.yml

depending on your environment. The server will run on port 8080 and show all available REST resources 
on startup.


Disclaimer
----------

This software is a research prototype and is not suited for production use.


Copyright and license
---------------------

Copyright (c) Fraunhofer IAO 2015 except where stated otherwise.
All code of the ARTIST Repository is published under the EPL v1.0 license.


Links
-----

[dw-config]: https://dropwizard.github.io/dropwizard/manual/configuration.html  "Dropwizard Configuration Reference"