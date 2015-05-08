UML2Java Code Generator Test 
============================

Purpose
-------

Test project for the UML2Java code generator. 


Functionality included in this version
--------------------------------------

Eclipse project to execute the UML2Java code generator.


Functionality expected in next versions
---------------------------------------

The test class is used to execute the code generator in terms of
a JUnit plug-in test.


Documentation
-------------

A deliverable is not yet available for the UML2Java generator. The two respective plugins, i.e.,
eu.artist.migration.modernization.uml2java and eu.artist.migration.modernization.uml2java.objectify
need to be located in drop-ins or plug-ins folder. As there is not yet a UI available, a test
projects is available to run the code generator from the workspace. The code generator is executed by
a JUnit plug-in test. The pertinent project eu.artist.migration.modernization.uml2java.test needs to 
be located in the workspace. To execute the code generator for the reference application (the pre-
pared launch configuration) the project eu.artist.migration.reference.application needs to be located
in the workspace.   

Known issues of this version
----------------------------


Installation instructions
-------------------------

Locate the plug-ins eu.artist.migration.modernization.uml2java and   
eu.artist.migration.modernization.uml2java.objectify in the dropins of plugins folder and
run the code generator from the test project. A launch configuration is prepared for
a reference application.

Disclaimer
----------

This software is a research prototype.


Copyright and license
---------------------

Copyright (c) Vienna University of Technology 2014 except where stated otherwise.
All code of the UML2Java Code Generator is published under the EPL v1.0 license.

