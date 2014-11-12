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
 
 Tool: Model Understanding Toolbox: PIM Abstractor tool
 Plugins: 
 - eu.artist.migration.mut.pimabstractor: 
 	Workbench contribution. Provides the UI and the M2MTs required for abstracting GUI elements of the application RCP.
 - Requires reusable repository artefacts plugin: eu.artist.reusable.artefacts
 
 Description: This tools enables users to obtain a PIM representation for concrete concerns of an application model.
 At the moment the following abstractors are available:
 - Eclipse RCP abstractor of GUI: both at RCP and GUI abstraction level. RCP is PS, GUI is PI
 
 Usage: Select a UML class model (PSM) in your Eclipse explorer. 
 Right click and select "Model Discovery Toolbox/Abstract Model". Select required generator in the dialog. 
 Provide other information if prompted. Once the generation has completed, 
 all generated abstract models are placed within the project and opened with default associated editors.

 
 Known issues:
 - No one at this moment when applied to PSMs describing Eclipse RCP applications
 