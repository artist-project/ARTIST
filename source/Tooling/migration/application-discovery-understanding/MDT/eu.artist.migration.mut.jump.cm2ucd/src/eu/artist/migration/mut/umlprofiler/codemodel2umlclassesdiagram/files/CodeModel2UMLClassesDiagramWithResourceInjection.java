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
package eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.files;

import java.io.IOException;

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

import eu.artist.migration.model.trace.TracePackage;
import eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.util.ModelUtil;

/**
 * @author Alexander Bergmayr
 *
 */
public class CodeModel2UMLClassesDiagramWithResourceInjection extends CodeModel2UMLClassesDiagram {
	
	/**
	 * 
	 */
	private String umlCdPath;
	
	/**
	 * 
	 */
	private String traceModelPath;
	
	/**
	 * 
	 * @throws IOException
	 */
	public CodeModel2UMLClassesDiagramWithResourceInjection() throws IOException {
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
	 * @param jpModelPath the Java profile that contains UML stereotypes for
	 * 		generic types and meta annotations. 
	 * @param jptModelPath the UML model library for Java primitive types.
	 * @param ejtModelPath the extended UML model library for Java types: java.lang.Class, java.lang.Object, java.util.Date
	 * @param mcModelPath the UML meta classes
	 * @param uptModelPath the UML model library for UML primitive types.
	 * @throws ATLCoreException 
	 */
	public void loadModels(Resource cmModelResource, String jpModelPath, String jptModelPath, String ejtModelPath, String mcModelPath, String uptModelPath) throws ATLCoreException {
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
		this.ejtModel = factory.newModel(umlmmMetamodel);
		injector.inject(ejtModel, ejtModelPath);
		this.mcModel = factory.newModel(umlmmMetamodel);
		injector.inject(mcModel, mcModelPath);
		this.uptModel = factory.newModel(umlmmMetamodel);
		injector.inject(uptModel, uptModelPath);
		this.ucdModel = factory.newModel(umlmmMetamodel);
		this.tmModel = factory.newModel(tmmMetamodel);
	}
	
	/* (non-Javadoc)
	 * @see eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.files.CodeModel2UMLClassesDiagram#saveModels(java.lang.String, java.lang.String)
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
		saveModels(getUmlCdPath(), getTraceModelPath());
	}

	/**
	 * 
	 * @param upModelPath
	 * @throws ATLCoreException
	 */
	public void saveUMLModel(String ucdModelPath)
			throws ATLCoreException {	
		IExtractor extractor = new EMFExtractor();
		extractor.extract(ucdModel, ucdModelPath);
	}
	
	/**
	 * 
	 * @throws ATLCoreException
	 */
	public void saveUMLModel()
			throws ATLCoreException {	
		IExtractor extractor = new EMFExtractor();
		extractor.extract(ucdModel, getUmlCdPath());
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
	 * @see eu.artist.migration.mut.umlprofiler.codemodel2umlclassesdiagram.files.CodeModel2UMLClassesDiagram#doCodeModel2UMLClassesDiagram(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Object doCodeModel2UMLClassesDiagram(IProgressMonitor monitor)
			throws ATLCoreException, IOException, ATLExecutionException {
		Object result = super.doCodeModel2UMLClassesDiagram(monitor);
		
		// create URIs for the generated models
		URI umlCdURI = URI.createURI(umlCdPath);
		URI traceModelURI = URI.createURI(traceModelPath);
		
		// set URIs
		((EMFModel) ucdModel).getResource().setURI(umlCdURI);
		((EMFModel) tmModel).getResource().setURI(traceModelURI);
		
		// do post processing
		CodeModel2UMLClassesDiagramPostProcessor.runPostProcessing(ucdModel, tmModel);
		
		return result;
	}

	/**
	 * @return the upModel
	 */
	public IModel getUcdModel() {
		return this.ucdModel;
	}

	/**
	 * @return the tmModel
	 */
	public IModel getTmModel() {
		return this.tmModel;
	}

	/**
	 * @return the umlCdPath
	 */
	public String getUmlCdPath() {
		return umlCdPath;
	}

	/**
	 * @param umlCdPath the umlCdPath to set
	 */
	public void setUmlCdPath(String umlCdPath) {
		this.umlCdPath = umlCdPath;
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
