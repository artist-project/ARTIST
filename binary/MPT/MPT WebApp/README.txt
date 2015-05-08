Methodology Process Tool (MPT) WebApp
Release date: 30/9/2014
version: 1.0.0

=========================================================================================

Copyright
---------
The source code in this distribution is © Copyright Institute of Communication and Computer Systems (ICCS) - 
National Technical University of Athens 2014.

=========================================================================================

Licenses
--------
This software is open source under MIT License.

=========================================================================================

ABOUT
-----
The MPT WebApp is a Java Server Faces (JSF) web application that runs on a web server, 
such as Apache Tomcat, and is packaged as a WAR file (eu.artist.methodology.mpt.webapp.war). 
This web application works in conjunction with the MPT Eclipse plug-in with the aim of 
guiding the user through the ARTIST migration process. It enables a user to upload and share
 pre-migration results with other people working on the project and uses them to configure 
 and visualize the ARTIST methodology through the EPF Composer.It has been implemented 
 using Eclipse Java EE IDE for Web Developers, Version: Kepler Service Release 2, and 
 has been tested against Apache Tomcat v7. All required Java libraries are included 
 inside the distributed WAR. 
 
=========================================================================================

INCLUDED FUNCTIONALITIES
------------------------

- Basic registrations and username/password authentication
- Web interface for uploading MAT, TFT and BFT reports and using them to configure the 
  ARTIST Methodology EPF project through the MPT Rule Engine
- Visualization of the configured ARTIST Methodology EPF project

=========================================================================================

KNOWN ISSUES
------------

Although the MPT WepApp supports the upload of MAT, TFT and BFT reports, only the MAT reports are used for the configuration, 
since there are no customization rules related to the TFT report and the BFT report is not yet available.  
Future implementations will be extended with customization rules that are TFT and BFT-based. 

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
- Bug fixing and improvements on existing functionality
- Including extra content management features for supporting the definition of different migration projects and working groups
- Expansion of the customization rules and application on the way the EPF output
- Integrating an in memory methodology model for improving the way the rules are applied in the background

=========================================================================================

Installation instructions
-------------------------

Detailed installation & usage instructions can be found at Deliverable D6.3.2 'ARTIST Methodology Process Framework M24':

- For installation instructions, please see Section 2.3.2.2.
- For usage instructions, please see Section 2.3.3. 

=========================================================================================



