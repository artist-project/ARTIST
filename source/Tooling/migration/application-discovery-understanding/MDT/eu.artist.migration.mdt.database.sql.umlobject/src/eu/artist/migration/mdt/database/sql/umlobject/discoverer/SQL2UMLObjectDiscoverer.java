/********************************************************************************
* Copyright (c) 2013 INRIA. 
* All rights reserved. This program and the accompanying materials 
* are made available under the terms of the Eclipse Public License v1.0 
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors: 
*	INRIA - Initial implementation
*	authors: Matthieu Allon (matthieu.allon at gmail.com)
* Initially developed in the context of ARTIST EU project www.artist-project.eu
*********************************************************************************/ 
package eu.artist.migration.mdt.database.sql.umlobject.discoverer;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.osgi.framework.Bundle;

import eu.artist.migration.mdt.database.sql.umlobject.internal.Activator;


public class SQL2UMLObjectDiscoverer extends AbstractModelDiscoverer<IAdaptable>{

	public static final String SQLDIS_ID = "eu.artist.migration.mdt.database.sql.umlobject.discoverer";
	public static final String UML_MM_URI = "http://www.eclipse.org/uml2/4.0.0/UML";
	public static final String UMLDB_MM_URI = "http://www.spikes.be/dbmlprofile.uml";
	public static final String SQL_MM_URI = "http://www.artist.eu/migration/mdt/database/sql/editor/SQLDSL";
	public static final Bundle bundle = Platform.getBundle("eu.artist.migration.mdt.database.sql.umlobject");
	
	@Override
	public boolean isApplicableTo(final IAdaptable source) {
		return (getSourceSQL(source)!=null);
	}
			
	private IResource getSourceSQL(IAdaptable source) {
		IResource resource = null;
		if (getIAdaptableMembers(source) != null){
			for (IResource resourceMember : getIAdaptableMembers(source)){
				if (resourceMember instanceof IFile && resourceMember.getName().toLowerCase().endsWith(SQL2UMLObjectConstants.SQL_MODEL_FILE_SUFFIX)){
					resource = resourceMember;
					break;
				}else {
					resource = getSourceSQL(resourceMember);
				}				
			}
		}
		return resource;
	}
	
	private IResource getSourceUML(IAdaptable source) {
		IResource resource = null;
		if (getIAdaptableMembers(source) != null){
			for (IResource resourceMember : getIAdaptableMembers(source)){
				if (resourceMember instanceof IFile && resourceMember.getName().toLowerCase().endsWith(SQL2UMLObjectConstants.UML_MODEL_FILE_SUFFIX)
						&& !resourceMember.getName().contains(SQL2UMLObjectConstants.UML_PROFILE_MODEL_FILE_SUFFIX)){
					resource = resourceMember;
					break;
				}else {
					resource = getSourceUML(resourceMember);
				}
			}
		}
		return resource;
	}
	
	private IResource[] getIAdaptableMembers(IAdaptable source){
		IResource[] members = null;
		try {			
			if (source instanceof IContainer){
				members = ((IContainer) source).members();				
			} else if (source instanceof IJavaElement){	
					members = ((IContainer)((IJavaElement)source).getResource()).members();
			} 
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return members;
	}
	
	@Override
	public void basicDiscoverElement(IAdaptable source, IProgressMonitor monitor)throws DiscoveryException {
		
		monitor.beginTask(SQL2UMLObjectConstants.DISCOVERING_MESSAGE, IProgressMonitor.UNKNOWN);
		
		String filePath = getSourceSQL(source).getFullPath().toString();
		
		URI outputURI = URI.createURI(filePath);
		
		try {			
			/*SQL XMI to UML Object*/
			SQLXMIToUMLObject(source, monitor, outputURI);			
		} catch (Exception e) {
			MoDiscoLogger.logError(e, e.getMessage(), Activator.getDefault());
			e.printStackTrace();
			 throw new DiscoveryException(e);
		}		
	}
		
	private void SQLXMIToUMLObject(IAdaptable source, IProgressMonitor monitor, URI outputURIXMIExtension) throws ATLCoreException, IOException{
		ILauncher transformationLauncher = new EMFVMLauncher();
		ModelFactory modelFactory = new EMFModelFactory();
		IInjector EMFinjector = new EMFInjector();
		
		IReferenceModel umlMetamodel = modelFactory.newReferenceModel();
		EMFinjector.inject(umlMetamodel, UML_MM_URI);
				
		IReferenceModel insertSQLMetamodel = modelFactory.newReferenceModel();
		EMFinjector.inject(insertSQLMetamodel, SQL_MM_URI);	
		
		IModel insertSQLModel = modelFactory.newModel(insertSQLMetamodel);		
		EMFinjector.inject(insertSQLModel, outputURIXMIExtension.toString());
		
		String inputUMLAndProfileModelPath = getSourceUML(source).getFullPath().toString();
		IModel umlModelIn = modelFactory.newModel(umlMetamodel);
		EMFinjector.inject(umlModelIn, inputUMLAndProfileModelPath);
		
		IModel umlModelOut = modelFactory.newModel(umlMetamodel);
		
		transformationLauncher.initialize(new HashMap<String,Object>());
		transformationLauncher.addInModel(insertSQLModel, "INONE", "INSERTSQL");
		transformationLauncher.addInModel(umlModelIn, "INSEC", "UML");
		transformationLauncher.addOutModel(umlModelOut, "OUT", "UML");
		transformationLauncher.addLibrary(SQL2UMLObjectConstants.ATL_LIBRARY_SHORT_NAME, SQL2UMLObjectDiscoverer
				.class.getResource(SQL2UMLObjectConstants.ATL_LIBRARY).openStream());
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put("allowInterModelReferences", true);
		options.put("supportUML2stereotypes", true);
		
		transformationLauncher.launch(ILauncher.RUN_MODE, monitor, options,
				SQL2UMLObjectDiscoverer.class.getResource(SQL2UMLObjectConstants.ATL_MODULE).openStream());
		
		ResourceSet sqlToXMIResourceSet = new ResourceSetImpl();
		sqlToXMIResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("."+SQL2UMLObjectConstants.UML_MODEL_FILE_SUFFIX, new EcoreResourceFactoryImpl());
					
		Resource umlOutput = sqlToXMIResourceSet.createResource(URI.createURI(URI.createURI(inputUMLAndProfileModelPath)
				.trimFileExtension().toString() + SQL2UMLObjectConstants.UML_OBJECT_MODEL_FILE_SUFFIX));
		
		EMFModel umlEMFModel = (EMFModel) umlModelOut;
		umlOutput.getContents().addAll(umlEMFModel.getResource().getContents());
		umlOutput.save(Collections.EMPTY_MAP);
	}	
		
}
