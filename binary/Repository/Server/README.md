ARTIST Repository server runtime
================================

Content:
    - repo.server.war
      The web archive containing the ARTIST repository server

This WAR file requires an Apache TomEE 1.6.0 JAXRS server runtime 
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

The ARTIST repository server is released under EPL v1 license.
