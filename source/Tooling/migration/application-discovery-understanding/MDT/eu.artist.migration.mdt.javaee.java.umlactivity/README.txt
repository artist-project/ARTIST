Java2UMLActivities, Version 1.0.0

=================================

ABOUT
-----
- Java2UMLActivity, component from the ARTIST Model Discovery Toolbox, allows automatically 
producing an UML Activity model from initial Java source code via an intermediate Java source 
code model. The obtained UML Activity model covers the behavioural aspects of the initial 
Java code by detailing the expressions and statements (as expressed inside method bodies).
This component is complementary to the Java2UMLClass component from the ARTIST Model 
Discovery Toolbox.

=========================================================================================

INCLUDED FUNCTIONALITIES
------------------------
- Each Java methods are transformed into an UML activity, with the various flows relating 
them (Information flows, object flows, ...) and their elements (Control flows, ...).
- This component currently considers:
	* As input: Java source code or the Java model representing the Java source code 
	* As output: an UML Activity model generated out of the input.

=========================================================================================

KNOWN ISSUES
------------
- Some 'XFlow' elements (ControlFlow, ObjectFlow ...) are duplicated,
- Some relations between activities are incorrect (e.g. incorrect 'InputPin' elements for
an 'ObjectFlow' elements).	

=========================================================================================

EXPECTED FUNCTIONALITIES
------------------------
Bug fixing in next versions.

=========================================================================================

INSTALLATION AND USER MANUAL
----------------------------
In the deliverable 'Components for Model Discovery from Legacy Technologies' of the ARTIST
project website (artist-project.eu) :
- For the installation, see the section 3.1.5.4 ('Download and installation instructions').
- Concerning the user manual, see the section 3.1.5.5('User manual').
http://www.artist-project.eu/sites/default/files/D8.2.1%20Components%20for%20Model%20Discovery%20from%20Legacy%20Technologies_M12_30092013.pdf