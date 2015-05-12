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
package eu.artist.moola.emf.modisco;


import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;

import eu.artist.moola.dsl.core.Transformation;

public class MoDiscoTransformation extends Transformation {
	
	private final static String RESULT_NAME = "result";
	
	protected DiscoverJavaModelFromJavaProject javaDiscoverer;
	
	protected Resource result;
	protected IJavaProject targetProject;
	
	public String project = "";
	public boolean deepAnalysis = false;
	public boolean serialize = false;
	
	public MoDiscoTransformation() { }
	
	@Override
	public void runConfigFinished() {
		try {
			this.javaDiscoverer = this.createDiscoverer();
		} catch(Exception ex) {
			throw new RuntimeException("Could not initialize MoDisco Java discoverer", ex);
		}
	}
	
	@Override
	protected void execute() {
		try {
			System.out.println("** Starting MoDisco: " + this.javaDiscoverer);
			
			this.targetProject = this.createProject();
			this.javaDiscoverer.discoverElement(this.targetProject, new NullProgressMonitor());
			this.result = javaDiscoverer.getTargetModel();
			
			this.emit(RESULT_NAME, this.result);
		} catch(CoreException ex) {
			throw new RuntimeException("Could not initialize Java project", ex);
		} catch (DiscoveryException ex) {
			throw new RuntimeException("Could not discover project", ex);
		}
	}
	
	protected DiscoverJavaModelFromJavaProject createDiscoverer() {
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.setDeepAnalysis(deepAnalysis);
		discoverer.setSerializeTarget(serialize);
		return discoverer;
	}
	
	protected IJavaProject createProject() throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IWorkspace workspace = root.getWorkspace();

		JavaProjectFactory.init(workspace);
		IJavaProject javaProject = JavaProjectFactory.getJavaProject(this.project);
		javaProject.open(new NullProgressMonitor());
		return javaProject;
	}

}
