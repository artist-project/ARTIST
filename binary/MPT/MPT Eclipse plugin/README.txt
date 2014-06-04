Methodology Process Tool (MPT) CheatSheet Eclipse Plug-in
Release date: 5/6/2014
version: 1.0.0.201406041322
===============================================================

Copyright
---------
The source code in this distribution is © Copyright Institute of Communication and Computer Systems (ICCS) - 
National Technical University of Athens 2014.

Licenses
--------
This software is open source under MIT License.

Installation instructions
-------------------------
1. MPT CheatSheet is an Eclipse plug-in with composite cheat sheets and extensions to the Welcome page for helping and guiding the user through out the ARTIST phases and corresponding tools. 
It has been implemented and tested against Eclipse Java EE IDE for Web Developers, Version: Kepler Service Release 2. It requires Java v7. 
All required Java libraries are included within the distributed JAR of the plug-in, eu.artist.methodology.mpt.cheatsheet_1.0.0.201406041313.jar. 
  
2. The current version of the MPT CheatSheet plug-in has been integrated with the ARTIST TFT-TFT Eclipse plug-in and therefore the TFT-TFT should be installed prior to the MPT installation. 
TFT-TFT can be downloaded from the ARTIST GitHub repository. For installing it please follow the related instructions included in its distribution and make sure that all required dependencies are installed. 

3. For installing the MPT CheatSheet plug-in, copy the distributed JAR inside the 'plugins' folder of your Eclipse installation and restart it for the changes to take effect. 
For building the MPT CheatSheet plug-in source code and generating a new JAR, import the source code into an Eclipse installation as a Plug-in Project, modify and then export. 

4. The MPT CheatSheet can be accessed in two ways:
	(1) either from the Eclipse Welcome page (for opening it go to Help -> Welcome) by selecting the 'Tutorials' tab and then clicking on the provided ARTIST link 
	(2) or by going to Help -> Cheat Sheets... -> ARTIST -> ARTIST Methodology Process Tool

Note that if these MPT extensions are not available after you install the MPT plug-in and restart Eclipse, then its installation has not been successful. 
In such a case, make sure that the TFT-TFT has been installed correctly, and then reinstall MPT and restart Eclipse again. 
For reporting problems or bugs, please contact Kleopatra Konstanteli at kkonst@mail.ntua.gr.

5. The MPT CheatSheet communicates with the following two ARTIST web applications:
	- MPT WebApp
	- Benchmark results web interface

The MPT CheatSheet is being configured to use the available to the public deployment targets of these tools, at the time of writing. 

The MPT WebApp and Benchmark results web interfaces that are used are currently being hosted at NTUA. In case of communication problems with these two sites, please contact Kleopatra Konstanteli at kkonst@mail.ntua.gr.

Note that for using your own or another installation of the MPT WebApp and/or Benchmark web interface, just ignore the web sites that are opened automatically and use your own. 

6. It should be noted that this is a preliminary version of the MPT Eclipse plug-in that does not cover all the ARTIST tools and it should be taken into account that all ARTIST tools are currently evolving. Therefore, included information about the ARTIST tools maybe subjected to changes in future releases of the MPT Eclipse plug-in.

Future releases will be integrated with more ARTIST tools which are in the form of Eclipse plug-ins, in the way that TFT has already been integrated in this version.
