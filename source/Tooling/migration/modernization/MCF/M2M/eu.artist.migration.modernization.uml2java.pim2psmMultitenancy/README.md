UML2Java Code Generator
========================

Purpose
-------

Generation of basic Java Code from UML Class Diagrams. 


Functionality included in this version
--------------------------------------

This project is to be integrated with the UML2Java tool chain.
Main UML concepts that are translated to Java program code:
-> Package
-> Class
-> Property
-> Relationship (Association, Composition)
-> Operation
-> Parameter


Functionality expected in next versions
---------------------------------------

Support of all UML concepts from Class / Package / Component Diagram


Documentation
-------------

This project is to be integrated with the UML2Java tool chain. However, a deliverable is not yet available 
for the UML2Java generator. This project contains a transformation that takes a PIM domain model and 
annotates it with EclipseLink stereotypes so that we obtain a PSM model.

Known issues of this version
----------------------------


Installation instructions
-------------------------

This project is to be integrated with the UML2Java tool chain. However, for the moment, it can be 
executed as stand-alone project. The input PIM model can be found under the folder 'model' with the 
name 'petstore_domain.uml', while the PSM model produced by the transformation is named 
'petstore_domain_eclipseLink_multitenancy.uml'. In order to run the transformation, there is a launch 
file under 'trafo-launch', called 'DomainModelEclipseLinkMultitenancy.launch'. To execute it, we just need 
to double-click it and select Run As -> DomainModelEclipseLinkMultitenancy. The EclipseLink profile used 
in the transformation is referenced from Plug-in Dependencies -> umlprofiles -> eclipselink_profile.profile.uml.
It has first to be included in dropins\umlprofilestore_1.0.0.201406171109\umlprofiles


Disclaimer
----------

This software is a research prototype.


Copyright and license
---------------------

Copyright (c) Vienna University of Technology 2014 except where stated otherwise.
All code of the UML2Java Code Generator is published under the EPL v1.0 license.

