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
package eu.artist.migration.mdt.database.sql.discoverer;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import eu.artist.migration.mdt.database.sql.editor.SQLDSLStandaloneSetup;
import eu.artist.migration.mdt.database.sql.editor.insertSQLDSL.InsertSQLDSLPackage;


public class SQLDiscoverer extends AbstractModelDiscoverer<IFile>{
	
	@Override
	public boolean isApplicableTo(final IFile source) {
		return source.getName().toLowerCase().endsWith(SQLDiscovererConstants.SQL_FILE_SUFFIX);
	}
			
//	private IFile getSourceSQL(IFile source) {
//		IResource resource = null;
//		if (getIAdaptableMembers(source) != null){
//			for (IResource resourceMember : getIAdaptableMembers(source)){
//				if (resourceMember instanceof IFile && resourceMember.getName().toLowerCase().endsWith(SQLDiscovererConstants.SQL_FILE_SUFFIX)){
//					resource = resourceMember;
//					break;
//				}else {
//					resource = getSourceSQL(resourceMember);
//				}				
//			}
//		}
//		return resource;
//	}
		
//	private IResource[] getIAdaptableMembers(IFile source){
//		IResource[] members = null;
//		try {			
//			if (source instanceof IContainer){
//				members = ((IContainer) source).members();				
//			} else if (source instanceof IJavaElement){	
//					members = ((IContainer)((IJavaElement)source).getResource()).members();
//			} 
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//		return members;
//	}
	
	@Override
	public void basicDiscoverElement(IFile source, IProgressMonitor monitor)throws DiscoveryException {
		
		monitor.beginTask(SQLDiscovererConstants.DISCOVERING_MESSAGE, IProgressMonitor.UNKNOWN);
		
		String filePath = source.getFullPath().toString();
		
		URI outputURI = URI.createURI(filePath);
		Resource res = null;
		
		try {			
			/*SQL file to SQL model - XMI*/
			SQLInsertToXMI(outputURI, res);			
		} catch (Exception e) {
			e.printStackTrace();
			 throw new DiscoveryException(e);
		}		
	}
	
	private void SQLInsertToXMI(URI outputURI, Resource res) throws IOException{
		Injector injector = new SQLDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet xTextResourceSet = injector.getInstance(XtextResourceSet.class);	
		xTextResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource resource = xTextResourceSet.getResource(outputURI, true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(InsertSQLDSLPackage.eNS_URI, InsertSQLDSLPackage.eINSTANCE);	
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(SQLDiscovererConstants.SQL_MODEL_FILE_SUFFIX, new EcoreResourceFactoryImpl());
		
		URI outputURIXMIExtension = outputURI.trimFileExtension().appendFileExtension(SQLDiscovererConstants.SQL_MODEL_FILE_SUFFIX);
								
		res = resourceSet.createResource(outputURIXMIExtension);
		res.getContents().addAll(resource.getContents());		
		res.save(Collections.EMPTY_MAP);
	}
	
}
