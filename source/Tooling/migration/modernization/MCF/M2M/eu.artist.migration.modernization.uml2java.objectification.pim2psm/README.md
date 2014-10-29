UML2Java - Objectification of Domain Model PIM2PSM
==================================================

Purpose
-------

Given a Platform-Independent Model (PIM) that represents the domain classes
of an application (i.e., entities that are persisted) the respective Platform-Specific
Model (PSM) is generated. Thereby, the Objectify profile provides the necessary
platform information. In a second step, service classes are generated that allow
the entities to be accessible from other classes of the application.  


Functionality included in this version
--------------------------------------

ATL-based transformations that realize the objectification:
1) PIM2PSM
2) PSM2PSM with service classes


Functionality expected in next versions
---------------------------------------

Dedicated UI for the component.


Documentation
-------------
Currently, the Objectification component is realized in terms of two model transformations. A dedicated UI is planned for future work.
First, the transformation implementing the objectification needs to be executed (PIM2PSM). Then, in a second step, the transformation
for generating the respective service classes of the domain classes needs to be executed. Dedicated configurations to launch the transformations
for the Petstore reference application are prepared (see "trafo-launch" folder).

A User manual is covered by the corresponding Deliverable D9.3 in Section 3.3..1.3. 


Known issues of this version
----------------------------


Installation instructions
-------------------------

The project needs to be located in the local workspace.

Required ARTIST plugins:
eu.artist.migration.umlprofilestore (available in D8.2.2, JUMP prototype)

Disclaimer
----------

This software is a research prototype.


Copyright and license
---------------------

Copyright (c) Vienna University of Technology 2014 except where stated otherwise.
All code of the UML2Java - Objectification of Domain Model PIM2PSM component is published
under the EPL v1.0 license.

