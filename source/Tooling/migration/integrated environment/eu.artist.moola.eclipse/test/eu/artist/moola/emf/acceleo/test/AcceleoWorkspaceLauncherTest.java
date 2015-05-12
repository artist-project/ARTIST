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
package eu.artist.moola.emf.acceleo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.common.internal.utils.workspace.AcceleoWorkspaceUtil;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.ide.ui.launching.strategy.AcceleoLaunchOperation;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

public class AcceleoWorkspaceLauncherTest {

	@Test
	public void test() {
		
		
		String projectName = "eu.artist.migration.modernization.uml2java";
		String qualifiedName = "eu.artist.migration.modernization.uml2java.repackaged.gen.java.main.Uml2java";
		//String model = "platform:/resource/model/petstore_domain_objectified_dao.uml";
		String model = "platform:/eu.artist.migration.modernization.uml2java/model/petstore_domain_objectified_dao.uml";
		File targetFolder = new File("src-gen");
		List<String> args = new ArrayList<>();

		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		AcceleoWorkspaceUtil.INSTANCE.addWorkspaceContribution(project);
		final Class<?> generatorClass = AcceleoWorkspaceUtil.INSTANCE.getClass(qualifiedName, false);
	
		
		
		try {
			URI modelURI = URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(model)).getLocation().toString());
			
			AbstractAcceleoGenerator generator = (AbstractAcceleoGenerator) generatorClass.newInstance();
			generator.initialize(modelURI, targetFolder, args);
			
			generator.doGenerate(new BasicMonitor());
			System.out.println("Finished");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
/*
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project == null || !project.isAccessible()) {
			throw new RuntimeException("Project null or not accessible");
		}
		
		System.out.println("Project found, creating launch configuration");
		
		AcceleoLaunchOperation operation = new AcceleoLaunchOperation(project, qualifiedName, model,
				targetFolder, args);

		System.out.println("Operation initialized");
		
		try {
			project.getWorkspace().run(operation, new NullProgressMonitor());

			System.out.println("Finished");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		*/
		
	}

}
