ARTIST Repository Eclipse client 
================================

Purpose
-------

This project contains a Repository Eclipse client to access the services of the ARTIST Repository from within the Eclipse IDE. 


Functionality included in this version
--------------------------------------

The following functionality is provided as Java API:

- Management (create, read, update, delete, list and filter) of projects (aka dedicated artefact collections)
- Management (create, read, update, delete, list and filter) of artefact metadata and content
- Management (create, read, update, delete, list and filter) of hierarchical categories
- Assignment of categories
- Tagging of artefacts
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

Contents:
    - repo.eclipse.api_2.0.0.jar    : Plugin containing the Repository API client and needed dependencies
    - repo.eclipse.client_2.0.0.jar : GUI and additional logic

The Repository Eclipse client can be installed in two ways:

    1) Use the ARTIST update site available soon to be available on the ARTIST web site
    2) Copy the two provided JAR files into the "dropins" folder of your Eclipse Kepler installation.
    

Configuration
-------------

Since the repository uses the WSO2 Identity Server for user management and authentication, the necessary 
configurations need to be made in the Settings dialog, before the repository can be used. A demo installation
of WSO2 Identity Service is available at 

    Username          : demo
    Password          : demo123
    WSO2 base url     : https://artist-demo.iao.fraunhofer.de
    Tentant           : test.artist-demo.eu")
    OAuthClientId     : j0gffE9u_TqiHbf7s3ZG9YEBIi8a
    OAuthClientSecret : VbB_Jo_t3pIsyHPuXobSJGn5pNoa


Disclaimer
----------

This software is a research prototype and is not suited for production use.


Copyright and license
---------------------

Copyright (c) Fraunhofer IAO 2015 except where stated otherwise.
All code of the ARTIST Repository is published under the EPL v1.0 license.

