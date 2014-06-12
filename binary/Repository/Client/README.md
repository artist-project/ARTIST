ARTIST Repository Client
========================

Purpose
-------

The Java API client eases integration of the ARTIST Repository in other tools by 
providing a Java API to address the repository services. A small code demo demonstrates 
the uses of the API.

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


Known issues of this version
----------------------------

- No issues known so far


Installation instructions
-------------------------

To run the demo, please start the ARTIST Repository server first by following the 
instructions in the "Server" folder. Then issue the command

    runDemo.bat

to start the demo application. It 

- creates a project
- creates several categories
- creates an artefact with content
- retrieves the artefact record and content
- creates additional artefacts
- searches artefacts by tags and categories


Disclaimer
----------

This software is a research prototype and is not suited for production use.


Copyright and license
---------------------

Copyright (c) Fraunhofer IAO 2014 except where stated otherwise.
All code of the ARTIST Repository is published under the EPL v1.0 license.

