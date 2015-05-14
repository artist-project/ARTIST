/*******************************************************************************
 * Copyright (c) 2015 ICCS/NTUA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Aliki Kopaneli
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/ 

Cloud Target Selection Tool

Description: The Cloud Target Selection tool is an Eclipse plugin aiming at guiding the user through the
complex process of making the final decision for the target platform of the migration of their 
application or application components. 

Installation: The Cloud Target Selection Tool plugin has been tested on of Eclipse Kepler SR2. Java v7 is required.
Before installing this tool, the user should download and install the UML2 plugin as well as the CloudML@ARTIST plugin.
The next step is to copy the Cloud Target Selection Tool plugins on the “dropins” folder of the Eclipse installation.

Usage:
In order to ensure the success of the tool's installation, the user should try selecting: Window > Show View > Other...
In the opening dialog with the available views, there should be a new category added under the label: Cloud Target Selection. There the user can select between the two available (or more, upon extension) views. Double selection is also feasible.
Having managed to get to this point means that the installation has been successful and the user can make the following steps in order to make use of the plug in :
1. Go to one of the open views. There, on the upper right corner a toolbar appears,
containing a set of icons each one of them representing a specific action, which is
shown simply by rolling the mouse over each icon.
2. By selecting the first icon a view will appear showing the list of supported providers to select from. These will be the candidate target platforms for the cloud target selection process.
3. The user can select any of the shown items which represent services and cloud features. The eraser button can seem helpful by unselecting every object and clearing the view.
4. When the feature selection process is finished, the validation process can begin by pressing he “play” button. The validation will take place among the selected providers. If the user hasn’t made a selection, all the supported providers will be checked (default configuration).
5. The results will appear on screen as scores for each of the selected providers.
6.Steps 2 to 5 can be repeated any number of times the user desires (with different input in each repetition)

Known issues: N/A
