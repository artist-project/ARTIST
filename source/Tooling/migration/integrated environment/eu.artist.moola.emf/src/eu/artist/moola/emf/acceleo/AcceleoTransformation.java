/*******************************************************************************
 * Copyright (coffee) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Stefan Weghofer (Vienna University of Technology) - DSL and petri nets implementation
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.moola.emf.acceleo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.common.internal.utils.workspace.AcceleoWorkspaceUtil;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import eu.artist.moola.dsl.core.Transformation;

public class AcceleoTransformation extends Transformation {
	
	protected Class<AbstractAcceleoGenerator> generatorClass;
	protected AbstractAcceleoGenerator generator;
	
	public String project;
	public String main;
	public String target;
	public Object model;
	public List<Object> arguments;
	public List<String> propertyFiles;
	
	public AcceleoTransformation() {
		this.arguments = new ArrayList<>();
		this.propertyFiles = new ArrayList<>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void runConfigFinished() { 
		if(this.generatorClass != null){
			return; // allow users to use custom classes
		}
		
		// register Acceleo project
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.project);
		AcceleoWorkspaceUtil.INSTANCE.addWorkspaceContribution(project);
		this.generatorClass = (Class<AbstractAcceleoGenerator>) AcceleoWorkspaceUtil.INSTANCE.getClass(this.main, false);
		
		try {
			// create generator and initialize it
			this.generator = this.generatorClass.newInstance();
			this.configureGenerator();
		} catch (Exception e) {
			throw new RuntimeException("Could not initialize Acceleo generator", e);
		}
	}

	protected void configureGenerator() throws IOException {
		File outputPath;
		outputPath = new File(this.target);
		
		// configure input model
		if(this.model instanceof EObject) {
			EObject model = (EObject) this.model;
			this.generator.initialize(model, outputPath, this.arguments);
		} else if(this.model instanceof Resource) {
			Resource resource = (Resource) this.model;
			EObject model = resource.getContents().get(0);
			this.generator.initialize(model, outputPath, this.arguments);
		}  else if(this.model instanceof URI) {
			URI modelURI = (URI) this.model;
			this.generator.initialize(modelURI, outputPath, this.arguments);
		} else if(this.model instanceof String) {
			URI modelURI = URI.createURI(this.model.toString());
			this.generator.initialize(modelURI, outputPath, this.arguments);
		}  else {
			throw new RuntimeException("No model specified for Acceleo transformation");
		}

		// configure property files
		for(String filePath : this.propertyFiles) {
			this.generator.addPropertiesFile(filePath);
		}
	}
	
	@Override
	public void execute() {
		try {
			this.generator.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Acceleo transformation failed", e);
		}
	}
	
}
