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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;


public class GenericATLRunner {

	private RunConfiguration config;
	private HashMap<String, IReferenceModel> metaModels;
	
	// EMF objects
	private ILauncher transformationLauncher = new EMFVMLauncher();
	private ModelFactory modelFactory = new EMFModelFactory();
	private IInjector injector = new EMFInjector();
	private IExtractor extractor = new EMFExtractor();

	
	public GenericATLRunner(RunConfiguration config) {
		this.config = config;
		this.metaModels = new HashMap<>();

		this.transformationLauncher = new EMFVMLauncher();	
		this.modelFactory = new EMFModelFactory();
		this.injector = new EMFInjector();
		this.extractor = new EMFExtractor();
	}

	public void transform() throws ATLCoreException, FileNotFoundException {
		HashMap<IModel, ModelConfig> outModels = new HashMap<>();

		/*
		 * Load required resources
		 */
		this.loadMetaModels();

		this.transformationLauncher.initialize(new HashMap<String, Object>());
		
		// add RefiningTraceModel if required
		if(config.getRefinement()) {
			IReferenceModel refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore");
			IModel refiningTraceModel = modelFactory.newModel(refiningTraceMetamodel);
			
			transformationLauncher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
		}
		
		// add other models
		for(ModelConfig model : config.getModelConfigs()) {
			if(! metaModels.containsKey(model.getMetaModel())) {
				throw new RuntimeException("Metamodel not loaded");
			}
			IReferenceModel metamodel = metaModels.get(model.getMetaModel());
			IModel m = modelFactory.newModel(metamodel);
			
			// ((EMFInjector) injector).inject(model, resource);
			
			switch(model.getDirection()) {
			case In:
				transformationLauncher.addInModel(m, model.getAlias(), model.getName());
				injector.inject(m, model.getModel());
				break;
			case InOut:
				transformationLauncher.addInOutModel(m, model.getAlias(), model.getName());
				injector.inject(m, model.getModel());
				outModels.put(m, model);
				break;
			case Out:
				transformationLauncher.addOutModel(m, model.getAlias(), model.getName());
				outModels.put(m, model);
				break;
			}
		}

		/*
		 * Run transformation and extract results
		 */
		transformationLauncher.launch(ILauncher.RUN_MODE,
				new NullProgressMonitor(), new HashMap<String, Object>(),
				new FileInputStream(config.getTransformation()));
		for(IModel m : outModels.keySet()) {
			extractor.extract(m, outModels.get(m).getTarget());
		}
		

		/*
		 * Cleanup
		 */
		this.disposeMetaModels();
	}
	
	/*
	 * Loads all meta models
	 */
	private void loadMetaModels() throws ATLCoreException {
		String path;
		for(ModelConfig modelConfig : this.config.getModelConfigs()) {
			path = modelConfig.getMetaModel();
			if(metaModels.containsKey(path)) {
				continue;
			}
			IReferenceModel metamodel = modelFactory.newReferenceModel();
			injector.inject(metamodel, path);		
			this.metaModels.put(path, metamodel);
		}
	}

	/*
	 * Releases all meta models
	 */
	private void disposeMetaModels() {
		EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
		for(IReferenceModel model : metaModels.values()) {
			emfModelFactory.unload((EMFReferenceModel) model);
		}
	}
}
