/**
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 * Tanja Mayerhofer - implementation
 * Alexander Bergmayr - implementation
 * 
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mut.umlprofiler.ui.launch;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ui.PlatformUI;

import eu.artist.migration.mdt.umlprofilediscovery.code2codemodel.JavaDiscoverer;
import eu.artist.migration.mdt.umlprofilediscovery.codemodel2umlprofile.files.CodeModel2UMLProfileWithResourceInjection;
import eu.artist.migration.mut.umlprofiler.java2profileduml.ProfiledUMLViewGenerator;
import eu.artist.migration.mut.umlprofiler.ui.util.J2PUMLLaunchUtil;

public class J2PUMLLaunchDelegate extends LaunchConfigurationDelegate {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// System.out.println("Pushed run ... start discovery ...");
				
		IResource[] resources = configuration.getMappedResources();
		IProject selectedProject = (IProject) resources[0];
		IJavaProject selectedJavaProject = JavaCore.create(selectedProject);
		
		String selectedDiscoverer = configuration.getAttribute(J2PUMLLaunchUtil.SELECTED_DISCOVERER, J2PUMLLaunchUtil.NO_DISCOVERY_SELECTION);
		
		// System.out.println("JavaProject: " + selectedJavaProject);
		// System.out.println("Selection: " + selectedDiscoverer);
		
		// run the UML Profile discovery
		if(selectedDiscoverer.equalsIgnoreCase(J2PUMLLaunchUtil.UML_PROFILE_DISCOVERY_SELECTION)) {
			// run the code2codemodel transformation - basically a small wrapper for MoDisco
			try {
				Resource javaCodeModelResource = JavaDiscoverer.INSTANCE.runDiscovery(selectedJavaProject);
				javaCodeModelResource.setURI(URI.createURI(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.CODE_MODEL_PATH)));
				
				// once we have the Java Code Model we can run the transformation that produces the UML Profile
				CodeModel2UMLProfileWithResourceInjection runner = new CodeModel2UMLProfileWithResourceInjection();
				runner.setUmlProfilePath(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.UML_PROFILE_PATH));
				runner.setTraceModelPath(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.TRACE_MODEL_PATH));
				runner.loadModels(javaCodeModelResource, J2PUMLLaunchUtil.JP_MODEL_PATH, J2PUMLLaunchUtil.JPT_MODEL_PATH,
						J2PUMLLaunchUtil.MC_MODEL_PATH, J2PUMLLaunchUtil.UPT_MODEL_PATH, J2PUMLLaunchUtil.EPT_MODEL_PATH);
				runner.doCodeModel2UMLProfile(new NullProgressMonitor());
				
				// store the produced UML Profile
				File upsl = new File(selectedProject.getFullPath().toString());
				runner.saveUMLProfileModel(URI.createPlatformResourceURI(upsl.getAbsolutePath(), true).
						appendSegment(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.UML_PROFILE_PATH)).toString());
				
				MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Success", "Profiled UML model created and saved in the respective project folder.");
					
				
			} catch (DiscoveryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ATLCoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error", "Profiled UML model could not be created.");
			}
			
		}
		
		// run the profiled UML model discovery
		else if(selectedDiscoverer.equalsIgnoreCase(J2PUMLLaunchUtil.PROFILED_UML_MODEL_DISCOVERY_SELECTION)) {
			// run the code2codemodel transformation - basically a small wrapper for MoDisco
			try {
				Resource javaCodeModelResource = JavaDiscoverer.INSTANCE.runDiscovery(selectedJavaProject);
				javaCodeModelResource.setURI(URI.createURI(selectedJavaProject.getElementName().concat(J2PUMLLaunchUtil.CODE_MODEL_PATH)));
				
				// once we have the Java Code Model we can run the transformation that produces the profiled UML Model
				ProfiledUMLViewGenerator.INSTANCE.generateProfiledUMLView(javaCodeModelResource, selectedJavaProject.getElementName(),
						selectedProject.getFullPath().toString());
				
				MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Success", "Profiled UML Class diagram created and saved in the respective project folder.");
				
			} catch (DiscoveryException e) {
				e.printStackTrace();
				MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Discovery Error", "Profiled class diagram could not be created.");
			}		
		}
		
		else if(selectedDiscoverer.equalsIgnoreCase(J2PUMLLaunchUtil.NO_DISCOVERY_SELECTION)) {
			// TODO Logging
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.LaunchConfigurationDelegate#buildForLaunch(org.eclipse.debug.core.ILaunchConfiguration, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public boolean buildForLaunch(ILaunchConfiguration configuration,
			String mode, IProgressMonitor monitor) throws CoreException {
		return false;
	}

}