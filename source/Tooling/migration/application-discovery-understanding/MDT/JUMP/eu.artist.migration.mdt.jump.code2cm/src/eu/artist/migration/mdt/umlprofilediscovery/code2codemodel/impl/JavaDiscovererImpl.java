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
package eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.impl;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;

import eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.JavaDiscoverer;
import eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.util.JavaProjectManager;

/**
 * @author Alexander Bergmayr
 *
 */
public class JavaDiscovererImpl implements JavaDiscoverer {
	
	/**
	 * 
	 */
	private static boolean IS_INTIALIZED = false;
	
	/**
	 * 
	 */
	private JavaDiscovererImpl() {	}
	
	/**
	 * 
	 * @return the {@link JavaDiscoverer}
	 */
	public static JavaDiscoverer init() {
		if(!IS_INTIALIZED) {
			IS_INTIALIZED = true;
			return new JavaDiscovererImpl();
		} 
		return JavaDiscoverer.INSTANCE;
	}

	/** (non-Javadoc) 
	 * @see eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.JavaDiscoverer#runDiscovery(java.lang.String)
	 */
	@Override
	public Resource runDiscovery(String projectName, IWorkspace workspace) throws DiscoveryException, CoreException {
		JavaProjectManager.init(workspace);
		IJavaProject javaProject = JavaProjectManager.getJavaProject(projectName);
		javaProject.open(new NullProgressMonitor());
		
		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		
		// TODO maybe we should allow the caller to set them
		javaDiscoverer.setDeepAnalysis(false);
		javaDiscoverer.setSerializeTarget(false);
		// TODO the model path could also be setable
		// javaDiscoverer.setTargetURI(JavaProjectManager.createJavaProjectURI("model", javaProject));
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource javaResource = javaDiscoverer.getTargetModel();
		
		return javaResource;
	}

	@Override
	public Resource runDiscovery(IJavaProject project) throws JavaModelException, DiscoveryException {
		project.open(new NullProgressMonitor());
		
		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		
		// TODO maybe we should allow the caller to set them
		javaDiscoverer.setDeepAnalysis(false);
		javaDiscoverer.setSerializeTarget(false);
		// TODO the model path could also be setable
		// javaDiscoverer.setTargetURI(JavaProjectManager.createJavaProjectURI("model", javaProject));
		javaDiscoverer.discoverElement(project, new NullProgressMonitor());
		Resource javaResource = javaDiscoverer.getTargetModel();
		
		return javaResource;
	}
	

}
