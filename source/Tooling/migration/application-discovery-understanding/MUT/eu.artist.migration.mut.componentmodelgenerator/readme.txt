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
 
 Tool: UML Component Model Generator Toolbox
 Plugins: 
 - eu.artist.migration.mut.componentmodelgenerator: 
 	Workbench contribution. Provides the UI.
 - eu.artist.migration.mut.componentmodelgenerator.dews: 
 	includes a set of component model generators for ARTIST DEWS use case
 - eu.artist.migration.mut.componentmodelgenerator.lib: 
 	includes a set of ATL libraries required by the component model generators
 - eu.artist.migration.mut.componentmodelgenerator.profiles: 
 	includes a set of UML profiles and meta-models required by the component model generators
 
 Description: This tools enables users to obtain some component models out of their selected class models.
 At the moment the following generators are available:
 - Eclipse RCP component model generator
 - Observer pattern component model generator (only compatible with DEWS use case)
 
 Usage: Select a UML class models in your Eclipse explorer. 
 Right click and select "Model Discovery Toolbox/Generate Component Model". Select required generator in the dialog. 
 Provide other information if prompted. Once the generation has completed, 
 all generated component models are placed within the project and opened with default associated editors.

 
 Known issues:
 - Orphan classes placed outside main model.
 