/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

import eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.util.ModelUtil;
import eu.artist.migration.model.trace.TracePackage;
import eu.artist.migration.umlprofilestore.UMLProfileStoreManager;

/**
 * @author Alexander Bergmayr
 *
 */
public class CodeModel2UMLProfileWithResourceInjection extends CodeModel2UMLProfile {
	
	/**
	 * 
	 */
	private String umlProfilePath;
	
	/**
	 * 
	 */
	private String traceModelPath;
	
	/**
	 * 
	 * @throws IOException
	 */
	public CodeModel2UMLProfileWithResourceInjection() throws IOException {
		super();
		// the Java metamodel needs to be registered because we directly inject
		// a java resource produced by Modisco (Dynamic API vs. Metamodel API)
		EPackage.Registry.INSTANCE.put(getMetamodelUri("JMM"), org.eclipse.gmt.modisco.java.emf.JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("TMM"), TracePackage.eINSTANCE);
	}
	
	/**
	 * Loads the models required for the transformation. The <i>Code Model</i> is already
	 * a <code>Resource</code>, which means we can directly inject it. 
	 * 
	 * @param cmModelResource the <i>Code Model</i> of the Java application.
	 * @param jpModelPath the Java profile that contains UML steretypes for
	 * 		generic types and meta annotations.
	 * @param jptModelPath the UML model library for Java primitive types.
	 * @param mcModelPath the UML meta classes
	 * @param uptModelPath the UML model library for UML primitive types.
	 * @throws ATLCoreException 
	 */
	public void loadModels(Resource cmModelResource, String jpModelPath, String jptModelPath, String mcModelPath,
			String uptModelPath, String eptModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		
		ModelUtil.loadUMLResources((EMFModelFactory) factory);
		
		IInjector injector = new EMFInjector();
	 	IReferenceModel jmmMetamodel = factory.newReferenceModel();
		injector.inject(jmmMetamodel, getMetamodelUri("JMM"));
	 	IReferenceModel umlmmMetamodel = factory.newReferenceModel();
		injector.inject(umlmmMetamodel, getMetamodelUri("UMLMM"));
	 	IReferenceModel tmmMetamodel = factory.newReferenceModel();
		injector.inject(tmmMetamodel, getMetamodelUri("TMM"));
		this.cmModel = factory.newModel(jmmMetamodel);
		((EMFInjector) injector).inject(cmModel, cmModelResource);
		this.jpModel = factory.newModel(umlmmMetamodel);
		injector.inject(jpModel, jpModelPath);
		this.jptModel = factory.newModel(umlmmMetamodel);
		injector.inject(jptModel, jptModelPath);
		this.mcModel = factory.newModel(umlmmMetamodel);
		injector.inject(mcModel, mcModelPath);
		this.uptModel = factory.newModel(umlmmMetamodel);
		injector.inject(uptModel, uptModelPath);
		
		this.eptModel = factory.newModel(umlmmMetamodel);
		injector.inject(eptModel, eptModelPath);
		
		this.upModel = factory.newModel(umlmmMetamodel);
		this.tmModel = factory.newModel(tmmMetamodel);
	}
	
	/* (non-Javadoc)
	 * @see eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files.CodeModel2UMLProfile#saveModels(java.lang.String, java.lang.String)
	 */
	@Override
	public void saveModels(String upModelPath, String tmModelPath)
			throws ATLCoreException {		
		// create the output models
		super.saveModels(upModelPath, tmModelPath);
	}
	
	/**
	 * 
	 * @throws ATLCoreException
	 */
	public void saveModels() throws ATLCoreException {
		saveModels(getUmlProfilePath(), getTraceModelPath());
	}
	
	/**
	 * 
	 * @param upModelPath
	 * @throws ATLCoreException
	 */
	public void saveUMLProfileModel(String upModelPath)
			throws ATLCoreException {	
		IExtractor extractor = new EMFExtractor();
		extractor.extract(upModel, upModelPath);
		
		// add the profile to the local uml profile store
		UMLProfileStoreManager.INSTANCE.addProfile(((EMFModel) upModel).getResource());
	}
	
	/**
	 * 
	 * @throws ATLCoreException
	 */
	public void saveUMLProfileModel()
			throws ATLCoreException {	
		IExtractor extractor = new EMFExtractor();
		extractor.extract(upModel, getUmlProfilePath());
	}
	
	/**
	 * 
	 * @param tmModelPath
	 * @throws ATLCoreException
	 */
	public void saveTraceModel(String tmModelPath)
			throws ATLCoreException {		
		IExtractor extractor = new EMFExtractor();
		extractor.extract(tmModel, tmModelPath);
	}
	
	/**
	 * 
	 * @throws ATLCoreException
	 */
	public void saveTraceModel()
			throws ATLCoreException {		
		IExtractor extractor = new EMFExtractor();
		extractor.extract(tmModel, getTraceModelPath());
	}

	/* (non-Javadoc)
	 * @see eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files.CodeModel2UMLProfile#doCodeModel2UMLProfile(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Object doCodeModel2UMLProfile(IProgressMonitor monitor)
			throws ATLCoreException, IOException, ATLExecutionException {
		Object result = super.doCodeModel2UMLProfile(monitor);
		
		// create URIs for the generated models
		URI umlProfileURI = URI.createURI(umlProfilePath);
		URI traceModelURI = URI.createURI(traceModelPath);
		
		// set URIs
		((EMFModel) upModel).getResource().setURI(umlProfileURI);
		((EMFModel) tmModel).getResource().setURI(traceModelURI);
		
		// do post processing
		CodeModel2UMLProfilePostProcessor.runPostProcessing(this.cmModel, this.upModel, this.tmModel);
		
		// define profile		
		Profile profile = (Profile) ((EMFModel) upModel).getResource().getContents().get(0);
		
		Map<String, String> options = new HashMap<String, String>();
		options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, UMLUtil.OPTION__PROCESS);
		profile.define(options, null, null);
		
		return result;
	}

	/**
	 * @return the upModel
	 */
	public IModel getUpModel() {
		return this.upModel;
	}

	/**
	 * @return the tmModel
	 */
	public IModel getTmModel() {
		return this.tmModel;
	}

	/**
	 * @return the umlProfilePath
	 */
	public String getUmlProfilePath() {
		return umlProfilePath;
	}

	/**
	 * @param umlProfilePath the umlProfilePath to set
	 */
	public void setUmlProfilePath(String umlProfilePath) {
		this.umlProfilePath = umlProfilePath;
	}

	/**
	 * @return the traceModelPath
	 */
	public String getTraceModelPath() {
		return traceModelPath;
	}

	/**
	 * @param traceModelPath the traceModelPath to set
	 */
	public void setTraceModelPath(String traceModelPath) {
		this.traceModelPath = traceModelPath;
	}

}
