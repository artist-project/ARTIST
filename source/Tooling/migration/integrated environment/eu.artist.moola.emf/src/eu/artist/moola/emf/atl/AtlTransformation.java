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
package eu.artist.moola.emf.atl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import eu.artist.moola.dsl.core.Transformation;

public class AtlTransformation extends Transformation {

	protected Map<IModel, String> outModels;
	protected Map<String, IReferenceModel> metaModels;
	protected ResourceSetImpl resourceSet;
	protected ILauncher atlLauncher;
	protected ModelFactory modelFactory;
	protected IInjector injector;
	protected IExtractor extractor;

	protected boolean refinement = false;
	protected String transformation = "";
	protected Map<String, Object> atlOptions = new HashMap<>();

	
	
	public AtlTransformation() {
		resourceSet = new ResourceSetImpl();
		atlLauncher = new EMFVMLauncher();
		modelFactory = new EMFModelFactory();
		injector = new EMFInjector();
		extractor = new EMFExtractor();
		metaModels = new HashMap<>();
		outModels = new HashMap<>();
		
		// init launcher with empty settings to have it ready in config phase
		atlLauncher.initialize(new HashMap<String, Object>());
	}
	

	// ***********************************************************************
	// * MetaModel registration
	// ***********************************************************************

	public void metaModel(String name, String uri) {
		URI uriImpl = URI.createURI(uri);
		this.metaModel(name, uriImpl);
	}

	public void metaModel(String name, URI uri) {
		Resource resource = this.resourceSet.getResource(uri, true);
		this.metaModel(name, resource);
	}

	public void metaModel(String name, Resource resource) {
		IReferenceModel metamodel;
		try {
			metamodel = modelFactory.newReferenceModel();
			populateModel(metamodel, resource);

			metaModels.put(name, metamodel);
		} catch (ATLCoreException e) {
			throw new RuntimeException("Cannot create metamodel for " + name, e);
		}
	}

	
	// ***********************************************************************
	// * Model registration
	// ***********************************************************************

	public void input(String name, String alias, String path, String conformsTo) {
		IModel model = this.createModel(conformsTo);
		populateModel(model, path);
		atlLauncher.addInModel(model, alias, name);
	}	
	
	public void input(String name, String alias, URI modelUri, String conformsTo) {
		Resource resource = this.resourceSet.getResource(modelUri, true);
		input(name, alias, resource, conformsTo);
	}
	
	public void input(String name, String alias, Resource resource, String conformsTo) {
		IModel model = this.createModel(conformsTo);
		populateModel(model, resource);
		atlLauncher.addInModel(model, alias, name);
	}


	public void inOut(String name, String alias, String path, String conformsTo) {
		IModel model = this.createModel(conformsTo);
		populateModel(model, path);
		outModels.put(model, path);
		atlLauncher.addInOutModel(model, alias, name);
	}	
	
	public void inOut(String name, String alias, String path, String target, String conformsTo) {
		IModel model = this.createModel(conformsTo);
		populateModel(model, path);
		outModels.put(model, target);
		atlLauncher.addInOutModel(model, alias, name);
	}	
	
//	public void inOut(String name, String alias, URI modelUri, String conformsTo) {
//		Resource resource = this.resourceSet.getResource(modelUri, true);
//		inOut(name, alias, resource, conformsTo);
//	}
//	
//	public void inOut(String name, String alias, Resource resource, String conformsTo) {
//		IModel model = this.createModel(conformsTo);
//		populateModel(model, resource);
//		atlLauncher.addInOutModel(model, alias, name);
//	}


	public void output(String name, String alias, String path, String conformsTo) {
		IModel model = this.createModel(conformsTo);
		outModels.put(model, path);
		atlLauncher.addOutModel(model, alias, name);
	}	
	
//	public void output(String name, String alias, URI modelUri, String conformsTo) {
//		Resource resource = this.resourceSet.getResource(modelUri, true);
//		output(name, alias, resource, conformsTo);
//	}
	
//	public void output(String name, String alias, Resource resource, String conformsTo) {
//		IModel model = this.createModel(conformsTo);
//		//populateModel(model, resource);
//		atlLauncher.addOutModel(model, alias, name);
//	}
	
	
	protected IModel createModel(String conformsTo) {
		try {
			if(! metaModels.containsKey(conformsTo)) {
				throw new RuntimeException("Metamodel not loaded");
			}
			IReferenceModel metamodel = metaModels.get(conformsTo);
			IModel m = modelFactory.newModel(metamodel);
			return m;
		} catch (ATLCoreException e) {
			throw new RuntimeException("Cannot create model for metamodel" + conformsTo, e);
		}
	}
	
	protected void populateModel(IModel model, String path) {
		try {
			injector.inject(model, path);
		} catch (ATLCoreException e) {
			throw new RuntimeException("Cannot populate model with " + path, e);
		}
	}

	protected void populateModel(IModel model, Resource resource) {
		((EMFInjector) injector).inject(model, resource);
	}
	
	
	// ***********************************************************************
	// * Execution
	// ***********************************************************************

	protected void addRefinementModel() throws ATLCoreException {
		IReferenceModel refiningTraceMetamodel;
		IModel refiningTraceModel;

		refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore");
		refiningTraceModel = modelFactory.newModel(refiningTraceMetamodel);
		atlLauncher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
	}
	
	@Override
	protected void execute() {
		try {
			if(refinement) {
				addRefinementModel();
			}
			
			launchATL();
			extractOutModels();
		} catch (Exception e) {
			throw new RuntimeException("Error during ATL transformation", e);
		}
	}
	
	protected void launchATL() throws FileNotFoundException {
		IProgressMonitor monitor = new NullProgressMonitor();
		FileInputStream file = new FileInputStream(transformation);
		atlLauncher.launch(ILauncher.RUN_MODE, monitor, atlOptions, file);
	}
	
	protected void extractOutModels() throws ATLCoreException {
		for(IModel m : outModels.keySet()) {
			extractor.extract(m, outModels.get(m));
		}
	}

}
