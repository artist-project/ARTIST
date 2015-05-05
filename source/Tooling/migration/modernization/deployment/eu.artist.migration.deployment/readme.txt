/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A, TUWIEN
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *     Alexander Bergmayr - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
 
 Tool: Deployment Tool
 Plugins: 
 - eu.artist.migration.deployment: 
 	Workbench contribution. It provides the UI.
 - eu.artist.migration.deployment.azure.service.configuration: 
 	It provides the metamodel and serializer support for the Microsoft Azure service configuration schema
 - eu.artist.migration.deployment.azure.service.definition: 
 	It provides the metamodel and serializer support for the Microsoft Azure service definition schema
 - eu.artist.migration.deployment.azure.service.descriptor: 
 	It provides the metamodel and serializer support for the Microsoft Azure service descriptor schema
 - eu.artist.migration.deployment.azure.transformation: 
 	It provides the CloudML@ARTIST to Microsoft Azure metamodel transformations
 - eu.artist.migration.deployment.feature: 
 	It defines the ARTIST Deployment Tool Eclipse feature
 - eu.artist.migration.deployment.gae.appengine.web.app: 
 	It provides the metamodel and serializer support for the Google App Engine web application schema
 - eu.artist.migration.deployment.gae.transformation: 
 	It provides the CloudML@ARTIST to Google App Engine metamodel transformations
 - eu.artist.migration.deployment.model: 
 	It provides the conceptual platform independent metamodel and PDMs for referenced Cloud providers (AWS, GAE, Azure)
 	
 Description: This tool supports the generation of Cloud target specific deployment descriptors and scripts from CloudML@ARTIST deployment models, for Google App Engine and Microsoft Azure.
 
 Usage: 
 Select a UML deployment in your Eclipse explorer. 
 Right click and select "Deployment Tool/Generate Deployment Descriptors". Select required target Cloud provider in the dialog. 
 Provide other information if prompted. Once the generation has completed, 
 all generated deployment descriptors are placed within the project in the deployment folder.

 
 Known issues:
 - N/A
 
