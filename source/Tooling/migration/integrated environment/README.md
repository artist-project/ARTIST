ARTIST integrated environment
=============================

Purpose
-------

Many tools have been developed in the context of different WP’s of the ARTIST project. Allowing software engineers
and modellers to apply these tools for real world migrations scenarios, they need to be integrated into a common environment.
This source package contains the ARTIST integrated environment / tool suite that provides a common interface to the ARTIST tools.

Moreover, it contains a dedicated language that allows software engineers and modellers to compose multiple transformations
into a chain, thereby enabling the automatic execution of such transformations if the chain becomes executed. The language
supports transformation technologies mainly applied in the context of reverse-engineering application code into models
and forward-engineering application code hosted by a cloud environment from models.

Finally, this source package contains extensions we did regarding cloud-based optimization patterns and measuring the
quality of generated code. 

Functionality included in this version
--------------------------------------

1) ARTIST tool suite
2) Transformation Composition Language (in TCL directory)
3) Transformations / Profiles for Optimization Patterns (in Patterns directory)
4) Computation of code metrics (in Quality_Code directory)

Functionality expected in next versions
---------------------------------------

Documentation
-------------

The corresponding Deliverable D9.7 serves as documentation of the current version of
the ARTIST integrated environment.

Known issues of this version
----------------------------

Installation instructions
-------------------------   

- Components that have been realized in terms of Eclipse plugins need to be located in the respective Eclipse plugins folder.
  These components provide a dedicated UI to execute them. How they can be used is describe in the respective user manuals.

- Components that are not yet realized in terms of Eclipse plugins are provided as Eclipse projects. They need to be located
  in the respective Eclipse workspace to execute them. We have prepared dedicated configuration to launch them in Eclipse. Again,
  how they can be launched is described in the respective user manuals.
  
- A dedicated "dependency" folder contains plugins / projects that are required to execute the components. They need to be
  located either in the local Eclipse workspace or the plugins folder of the Eclipse environment, respectively.
  
Disclaimer
----------

This software is a research prototype.

Copyright and license
---------------------

All code of the ARTIST integrated environment is published under the EPL v1.0 license.
