# Non-functional Requirements Verification Tools (NFRVT)

## Goal Modeling
Release date: 13/02/2015

The provided components enable the user with a way to model migration goals in the context of the reverse engineered UML software models. 
These goals are collected in a so called goal model and are the objectives why the software is migrated into the cloud in the first place.
Goals are conditions based on (non-functional) properties of the system. 
These properties can be evaluated using different evaluation strategies and are influenced by the optimization patterns applied during the migration.

From a technical point of view, the goal model is initially created by the maturity assessment tool and further refined by the user. 
The specified goals then drive forward engineering process in terms of choosing a good set of optimization patterns and provide a way to check whether the migration can be considered successful or not.

In this initial version we include a meta model, textual editors, and an initial version of the evaluation of the goal conditions.

### Installation
  1. Install and update the latest version of [Eclipse Kepler Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr2).
  2. Install the latest version (>= 2.6) of the [Xtext Framework](http://www.eclipse.org/Xtext/).
  3. Install the latest version of [Henshin](http://www.eclipse.org/henshin/).
  4. Put the respective plugins available in the [ARTIST GitHub Repository](https://github.com/artist-project/ARTIST/tree/master/binary/NFRVT) in the /dropins directory of your Eclipse installation. Alternatively you can check out the source here and import the projects in Eclipse.

### Included Functionality  
  * Grammars for modeling property catalogues, pattern catalogues, evaluation strategy catalogues, goal models and migration evaluations
  * Textual editors for all above mentioned models and languages
  * Outline view and content assist for all involved languages
  * Templates in content assisst to create skeletons
  * 'New File' dialogue for each language resource
  * Supported Drag and Drop from tree-based UML editors
  * Run Dialog to automatically produce the migration evaluation based on a goal model
  * Measurements from fUML Performance Analysis and simple static model analysis
  * Semi-automatic selection of pattern/transformations (not all cases are covered)
  
### Open Issues (Functionality expected in the future)
  * Semi-automatic selection of pattern/transformations (not all cases are covered)
  * Integration with other NFRVT tools (from George and Juncal)

### Reference
Currently there is no official ARTIST deliverable describing the Goal Modeling Tools, it will be released in March 2015.
  
### Licensing info
Copyright (c) 2015 Vienna University of Technology. All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available under [Eclipse EPL](http://www.eclipse.org/legal/epl-v10.html).
  
### Additional Licensing info
Icons for the textual editor have been partially provided by [FatCow](http://www.fatcow.com/free-icons) under Creative Commons Attribution 3.0 License.