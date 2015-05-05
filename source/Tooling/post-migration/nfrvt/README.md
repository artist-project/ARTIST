# Non-functional Requirements Verification Tools (NFRVT)

Release date: 30/03/2015, Version: 1.0.0.201503301546

The provided components enable the user with a way to model migration goals in the context of the reverse engineered UML software models. 
These goals are collected in a so called goal model and are the objectives why the software is migrated into the cloud in the first place.
Goals are conditions based on (non-functional) properties of the system. 
These properties can be evaluated using different evaluation strategies and are influenced by the optimization patterns applied during the migration.
Furthermore, we have developed the MOMoT framework which can guide the application of model transformations towards specific objectives using search-based optimization techniques.

From a technical point of view, the goal model is initially created by the maturity assessment tool and further refined by the user. 
The specified goals then drive forward engineering process in terms of choosing a good set of optimization patterns and provide a way to check whether the migration can be considered successful or not.

### Installation
  1. Install and update the latest version of [Eclipse Kepler Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr2). More precisely, while we use the version with the build id `20140224-0627`, newer versions may also work. Please make sure that your Eclipse version has Apache Ant version greater than 1.9. If not, copy the provided zip file into your Eclipse `/dropins` directory.
  2. Install version 2.6 of the [Xtext Framework](http://www.eclipse.org/Xtext/). Specifically, we use version `2.6.0.v201405210727`, but future versions may also work. 
  3. Install the latest version of [Henshin](http://www.eclipse.org/henshin/). Henshin may be used as a graph transformation engine in the automated pattern application approach.
  3. Put the respective plugins available in the [ARTIST GitHub Repository](https://github.com/artist-project/ARTIST/tree/master/binary/NFRVT) in the `/dropins` directory of your Eclipse installation. Alternatively you can check out the source here and import the projects in Eclipse.

### Included Functionality  
  * Grammars for modeling property catalogues, pattern catalogues, measurement models, goal models and migration evaluations
  * Textual editors for all above mentioned models and languages
  * Outline view and content assist for all involved languages
  * Templates in content assisst to create skeletons
  * 'New File' dialogue for each language resource
  * Supported Drag and Drop from tree-based UML editors
  * Run Dialog to automatically produce the migration evaluation based on a goal model
  * An evaluation strategy for performance-related properties based on the fUML standard
  * Implementation of a search-based process that guides the application of model transformations towards given objectives/goals

### Reference
These tools are accompanied by the deliverable D11.3.2 which can be found on the [ARTIST web page](http://artist-project.eu/documents).
  
### Licensing info
Copyright (c) 2015 Vienna University of Technology. All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available under [Eclipse EPL](http://www.eclipse.org/legal/epl-v10.html).
  
### Additional Licensing info
Icons for the textual editor have been partially provided by [FatCow](http://www.fatcow.com/free-icons) under Creative Commons Attribution 3.0 License.
Xtext and Henshin are also available under the [Eclipse EPL](http://www.eclipse.org/legal/epl-v10.html). 
The [MOEA Framework](http://moeaframework.org/) is available under [GNU LGPL](http://www.gnu.org/licenses/lgpl.html).
The [reference implementation of the fUML virtual machine](http://portal.modeldriven.org/project/foundationalUML) is available under [CCDL](https://glassfish.java.net/public/CDDL+GPL.html), [CPL](http://opensource.org/licenses/cpl1.0.php) and [Apache License v2.0](http://www.apache.org/licenses/LICENSE-2.0).