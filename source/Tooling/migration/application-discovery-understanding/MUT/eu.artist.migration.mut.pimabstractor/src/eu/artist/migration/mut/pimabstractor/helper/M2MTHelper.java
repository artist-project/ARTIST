/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
package eu.artist.migration.mut.pimabstractor.helper;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;

public class M2MTHelper {
	/**
	 * It executes a M2M ATL transformation
	 * @param inModels A map of input models, reference by model name within the transformation
	 * @param outputUri The output model
	 * @param transformationPathURIs A list of path locations where look for ATL modules required by the M2M transformation
	 * @param transformationModule The ATL transformation module that performs the M2M transformation
	 * @param monitor An Eclipse Job execution monitor
	 * @return The transformed model
	 * @throws Exception
	 */
	static public URI performM2MTransformation(Map<String, org.eclipse.emf.common.util.URI> inModels, org.eclipse.emf.common.util.URI outModelUri,
			List<String> transformationPathURIs, String transformationModule, Map<String, String> metamodels, IProgressMonitor monitor)
			throws Exception {

		URI result = null;
		ResourceSet rs = new ResourceSetImpl();

		monitor.subTask("Performing M2MT: " + transformationModule);
		try {
			ExecEnv env = loadMetamodels(metamodels);
			
			// Load Models
			for (String modelName: inModels.keySet()){
				Model profileModel = EmftvmFactory.eINSTANCE.createModel();
				profileModel.setResource(rs.getResource(inModels.get(modelName), true));
				env.registerInputModel(modelName, profileModel);
			}
			
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
			outModel.setResource(rs.createResource(outModelUri));
			env.registerOutputModel("OUT", outModel);

			// Load and run module
			DefaultModuleResolver mr = new DefaultModuleResolver(transformationPathURIs.get(0),
					new ResourceSetImpl());
			for (int i=1; i< transformationPathURIs.size(); i++)
				mr.addUriPrefix(transformationPathURIs.get(i));
			TimingData td = new TimingData();
			env.loadModule(mr, transformationModule);
			td.finishLoading();
			env.run(td);
			td.finish();

			// Save models
			outModel.getResource().save(Collections.emptyMap());
			result = URI.create(outModel.getResource().getURI().toString());

		} catch (Exception e) {
			throw e;
		} finally {

		}
		return result;
	}
	
	/**
	 * Helper method to load required meta-models for M2M transformations in the ATL execution environment
	 * @return The ATL execution environment
	 */
	static public ExecEnv loadMetamodels(Map<String, String> metamodels) {
		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env = null;
		
		if (env == null) {
			env = EmftvmFactory.eINSTANCE.createExecEnv();
			Metamodel metaModel;
			
			// Load Meta-models
			for (String mm: metamodels.keySet()){
				metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
				metaModel.setResource(rs.getResource(
					org.eclipse.emf.common.util.URI
						.createURI(metamodels.get(mm)),
				true));
				env.registerMetaModel(mm, metaModel);
			}
		}
		
		return env;
	}
}
