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
package eu.artist.moola.emf.atl.emftvm;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

import eu.artist.moola.dsl.core.Transformation;

public class AtlEmftvmTransformation extends Transformation {

	protected String module;
	protected String path;
	
	protected DefaultModuleResolver moduleResolver;
	protected ResourceSet resourceSet;
	protected ExecEnv exec;
	
	public Map<String, Resource> models;
	
	
	public AtlEmftvmTransformation() {
		this.resourceSet = new ResourceSetImpl();
		this.exec = EmftvmFactory.eINSTANCE.createExecEnv();
		this.models = new HashMap<>();
	}
	
	//***********************************************************************
	//*  MetaModel registration
	//***********************************************************************
	
	public void metaModel(String name, String uri) {
		URI uriImpl = URI.createURI(uri);
		this.metaModel(name, uriImpl);
	}

	public void metaModel(String name, URI uri) {
		Resource resource = this.resourceSet.getResource(uri, true);
		this.metaModel(name, resource);
	}

	public void metaModel(String name, Resource resource) {
		Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
		metaModel.setResource(resource);
		this.exec.registerMetaModel(name, metaModel);
	}
	
	
	//***********************************************************************
	//*  In, InOut, Out Model Registration
	//***********************************************************************
	
	public void input(String name, String uri) {
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		Resource resource = this.resourceSet.getResource(URI.createURI(uri, true), true);
		inModel.setResource(resource);
		this.exec.registerInputModel(name, inModel);
		this.models.put(name, resource);
	}
	
	public void inOut(String name, String uri) {
		Model inOutModel = EmftvmFactory.eINSTANCE.createModel();
		Resource resource = this.resourceSet.getResource(URI.createURI(uri, true), true);
		inOutModel.setResource(resource);
		this.exec.registerInOutModel(name, inOutModel);
		this.models.put(name, resource);
	}
	
	public void output(String name, String uri) {
		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		Resource resource = this.resourceSet.getResource(URI.createURI(uri, true), true);
		outModel.setResource(resource);
		this.exec.registerOutputModel(name, outModel);
		this.models.put(name, resource);
	}
	
	@Override
	protected void execute() {
		this.moduleResolver = new DefaultModuleResolver(this.path, resourceSet);
		
		TimingData td = new TimingData();
		exec.loadModule(moduleResolver, this.module);
		td.finishLoading();
		exec.run(td);
		td.finish();
		
	}
	
}
