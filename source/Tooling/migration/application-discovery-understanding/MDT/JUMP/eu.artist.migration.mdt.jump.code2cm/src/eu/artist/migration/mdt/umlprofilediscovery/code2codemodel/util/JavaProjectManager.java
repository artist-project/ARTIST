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
package eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.util;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * @author Alexander Bergmayr
 *
 */
public class JavaProjectManager {
	
	/**
	 * 
	 */
	private static final String JAVA_PROJECT_NATURE = "org.eclipse.jdt.core.javanature";
	
	/**
	 * 
	 */
	private static Map<String, IJavaProject> JAVA_PROJECTS = new HashMap<String, IJavaProject>();

	/**
	 * 
	 * @param project
	 * @return
	 * @throws CoreException
	 */
	public static boolean isJavaProject(IProject project) throws CoreException {
		return project.getNature(JAVA_PROJECT_NATURE) != null;
	}
	
	public static Collection<IJavaProject> init(IWorkspace workspace) throws CoreException {		
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		for(IProject project : myWorkspaceRoot.getProjects()) {
			if(project.isOpen() && isJavaProject(project)) {
				IJavaProject javaProject = JavaCore.create(project);
				JAVA_PROJECTS.put(project.getName(), javaProject);
			}
		}
		
		return JAVA_PROJECTS.values();
	}
	
	public static IJavaProject getJavaProject(String name) {
		return JAVA_PROJECTS.get(name);
	}
	
	/**
	 * 
	 * @param project
	 * @return
	 */
	public static URI createJavaProjectURI(IJavaProject project) {
		return URI.createURI(project.getElementName() + "_java_code_model.xmi");
	}
	
	/**
	 * 
	 * @param fragment
	 * @param project
	 * @return
	 */
	public static URI createJavaProjectURI(String fragment, IJavaProject project) {
		// TODO produce platform URI !!!
		return URI.createFileURI(new File(fragment + "/" + project.getElementName() + "_java_code_model.xmi").getAbsolutePath());
	}
}
