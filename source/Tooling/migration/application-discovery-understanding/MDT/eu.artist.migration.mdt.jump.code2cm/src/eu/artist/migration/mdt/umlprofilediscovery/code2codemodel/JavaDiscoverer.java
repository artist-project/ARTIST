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
package eu.artist.migration.mdt.umlprofilediscovery.code2codemodel;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;


/**
 * @author Alexander Bergmayr
 *
 */
public interface JavaDiscoverer {
	
	/**
	 * The singleton instance of the discoverer.
	 */
	JavaDiscoverer INSTANCE = eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.impl.JavaDiscovererImpl.init();
	
	/**
	 * 
	 * @param projectName for which a code model is generated.
	 * @param workspace where the projects that are discovered are located.
	 * @return the code model of the Java code.
	 * @throws JavaModelException 
	 * @throws DiscoveryException 
	 * @throws CoreException 
	 */
	Resource runDiscovery(String projectName, IWorkspace workspace) throws JavaModelException, DiscoveryException, CoreException;
	
	/**
	 * 
	 * @param project
	 * @return
	 * @throws DiscoveryException
	 */
	Resource runDiscovery(IJavaProject project) throws JavaModelException, DiscoveryException;
	
}
