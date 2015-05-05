/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *	   Burak Karaboga	   - main development
 *     Javier Garcia       - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
 
 Tool: UML Cloudification Toolbox: RCP2GWT Cloudification tool
 Plugins: 
 - eu.artist.migration.modernization.ct.gui.rcp2gwt: 
 	Workbench contribution. Provides the UI and the M2MTs required for cloudifying (to GWT) the GUI elements of the application RCP.
 - Requires reusable repository artefacts plugin: eu.artist.reusable.artefacts
 
 Description: This tools enables users to cloudify the GUI of a Eclipse RCP application, by applying the GUI-to-GWT pattern
 At the moment the following GUI cloudifiers are available:
 - Eclipse RCP to GWT cloudifier
 
 Usage: Select a UML class models (GUI PIM) in your Eclipse explorer. 
 Right click and select "Cloudification Toolbox/Cloudify GUI". Select required cloudifier in the dialog. 
 Provide other information if prompted. Once the generation has completed, 
 all generated cloudified models (PSM) are placed within the project and opened with default associated editors.

 
 Known issues:
 - No one
 