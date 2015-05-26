ARTIST Marketplace
==================

Purpose
-------

Purpose of the ARTIST Marketplace is to foster sharing and reuse of MDA artefacts across different ARTIST
migration projects and across general MDA development activities. It provides functionalities to browse,
retrieve, publish and comment artefacts.


Functionality included in this version
--------------------------------------

The following functionality is provided:

- Browse artefacts by structure and category
- Browse artefacts by searchable tabular view
- Artefact detail view
- Management (create, read, update, delete) of users' own artefacts
- Assignment of categories
- Tagging of artefacts
- Rating of artefacts
- Commenting of artefacts
- Linear versioning of artefacts
- Self-registration
- Authentication and access control


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

-   repo.marketplace-2.0.0.jar: The archive containing the ARTIST marketplace and all its respources

Currently the ARTIST Marketplace is bundled with the ARTIST Repository server, so no separate installation is needed. 
Install the server and start it with

	java -jar repo.server-2.0.0.jar server repository.yml
	
where 'repo.server-2.0.0.jar' is the name of the self contained server jar produced by the 'repo.server' project containing all the 
dependencies needed by the ARTIST Repository server. 'repository.yml' is the configuration file in YAML format to 
customize different aspects of the repository. The configuration file offers all the options of a 
standard Dropwizard configuration file (see the [Dropwizard Configuration Reference][dw-config]). 

See the config files in the 'repo.config' project for additional options.


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