TFT_SCC

What the tool/component is about: 

This prototype provides some software metrics (i.e: Maintainability, modifiability, Level of complexity, lines of code, couplig, etc) for each component of the component model.

The current SCC prototype architecture is a java API that explores source files an UML models to generate several Metrics of a specific project.

The current SCC prototype component comprises three components:

•Metric Explorer: This is the main component of SCC current prototype. It provides the calculation of all the required metrics that are used to generate the new ARTIST metrics. Besides, it also provides exporting features to convenient formats like XML or JSON. 
•Structures: This component contains the structures of the inputs and outputs models that the Metric Explorer uses. It also provides the functionality for generating the output file formats (XML, JSON).
•Test Cases: This component is provided for implementing the testing of the Metric Explorer component. It generates several use cases that test the functionality of the SCC. The test case generates console logs and XML files with several examples (DEWS and JavaPetStore).

Current functionality:


This version calculates the following metrics per component:


Maintenance=2.399+0.493×Modifiability+0.474×Understability+0.524×Scalability+0.507*LOC

Modifiability=0.629+0.471×NC-0.173×NGen-0.616×NAggH-0.696×NGenH+0.396×MaxDIT

Scalability=0.182×0.99×AC+0.100×EC+0.097×ND-0.036×PC+0.068×DMS

LOC= 0.269+0.008 × Coupling + 0.181×cohesion + 0.119×CC + 0.084×ILCC


Expected functionality in next versions

Refinement of the metrics calculations

Reference to the user/installation manual (link to the deliverable published in our web site)


http://www.artist-project.eu/sites/default/files/D5.3.1%20Technical%20feasibility%20tools_M12_30092013.pdf

For installation instructions, see section 3.2.2.
For user manual, see section 3.2.3.