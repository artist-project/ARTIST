/*******************************************************************************
 * Copyright (c) 2014 ATOS S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jesús Gorroñogoitia - main development
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/
package eu.artist.migration.mut.cmg.handlers;

import java.io.File;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

import eu.artist.migration.mut.cmg.dialog.ComponentModelGeneratorDialog;
import eu.artist.migration.mut.cmg.dotnet.tagging.taggers.DotNetTagger;
import eu.artist.migration.mut.cmg.generators.CMGenerators;
import eu.artist.migration.mut.cmg.j2ee.tagging.taggers.J2EETagger;
import eu.artist.migration.mut.cmg.lob.tagging.taggers.MSSharePointTagger;

public class GenerateComponentModelHandler extends AbstractHandler {
	public static final String UML_MM_URI = "http://www.eclipse.org/uml2/4.0.0/UML";
	public static final String PROFILE_MM_URI = "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L3";
	public static final String XML_MM_URI = "http://www.eclipse.org/MoDisco/Xml/0.1.incubation/XML";
	private Shell shell;
	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		this.shell = window.getShell();

		IFile selectedClassModel = getSelectedFile(event);
		IProject targetProject = getTargetProject(event);

		showComponentModelGeneratorDialog(selectedClassModel, event, targetProject);
		
		return null;
	}

	/**
	 * This method shows a dialog prompting the user information required to generate component models
	 * for given input class model.
	 * @param selectedClassModel The input class model
	 * @param event Event triggered by the action managed by this handler.
	 * @param targetProject Project owing the selected input class model.
	 */
	private void showComponentModelGeneratorDialog(IFile selectedClassModel, ExecutionEvent event, IProject targetProject) {
		ComponentModelGeneratorDialog dialog = new ComponentModelGeneratorDialog(shell);
		dialog.setInputModel (selectedClassModel);
	    
	    // get the new values from the dialog
	    if (dialog.open() == Window.OK) {
	    	generateComponentModel(selectedClassModel, event, targetProject, dialog.getSelectedCMGenerators(), dialog.getPluginModel(), dialog.isMergeModel());
	    }
	}

	/**
	 * Helper method to obtain the selected input class model from the event triggered by the workbench
	 * @param event Event triggered by the action managed by this handler.
	 * @return The selected class model.
	 */
	private IFile getSelectedFile(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IFile result = null;
		IWorkbenchPage activePage = window.getActivePage();
		ISelection selection = activePage.getSelection();
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				if (selection instanceof ITreeSelection) {
					TreeSelection treeSelection = (TreeSelection) selection;
					TreePath[] treePaths = treeSelection.getPaths();
					if (treePaths.length == 0)
						return null;
					Object lastSegmentObj = treePaths[0].getLastSegment();
					if (lastSegmentObj instanceof IAdaptable) {
						IFile file = (IFile) ((IAdaptable) lastSegmentObj)
								.getAdapter(IFile.class);
						if (file != null) {
							result = file;
						}
					}
				}
			}
		}
		return result;
	}

	/**
	 * Helper method to obtain the project that owns the selected input class model from the event triggered by the workbench
	 * @param event Event triggered by the action managed by this handler.
	 * @return The project that owns the selected class model.
	 */
	private IProject getTargetProject(ExecutionEvent event) {
		IProject result = null;
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage activePage = window.getActivePage();
		ISelection selection = activePage.getSelection();
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				if (selection instanceof ITreeSelection) {
					TreeSelection treeSelection = (TreeSelection) selection;
					TreePath[] treePaths = treeSelection.getPaths();
					Object firstSegmentObj = treePaths[0].getFirstSegment();
					if (firstSegmentObj instanceof IAdaptable) {
						result = (IProject) ((IAdaptable) firstSegmentObj)
								.getAdapter(IProject.class);
					}
				}
			}
		}
		return result;
	}

	/**
	 * This method performs the chain of required M2M transformations to obtain the component models
	 * selected by the user
	 * TODO Re-structure the code to support performing a number of M2M transformations for a arbitrary 
	 * number of selected component models. Current implementation is not generic, but specific to ARTIST DEWS use case
	 * @param model Input class model
	 * @param event Event associated to the action triggered by the user.
	 * @param targetProject Project where the input class model is located.
	 * @param cmGenerators Collection of selected component model generators
	 * @param pluginModel Input plug-in model required by RCP generator
	 * @param mergeModels Flag informing if the generated models should be merged.
	 */
	public void generateComponentModel(final IFile model, final ExecutionEvent event, 
			final IProject targetProject, final EnumSet<CMGenerators> cmGenerators, 
			final String pluginModel, final boolean mergeModels) {
			Job job = new Job("Generating component models in progress") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				URI modelUri = model.getLocationURI();
				URI dmOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "dm_component_model.uml");
				URI rcpOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "rcp_component_model.uml");
				URI mergedOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "merged_component_model.uml");
				URI spOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "share_point_component_model.uml");
				URI j2EEOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "j2ee_component_model.uml");
				URI dotNetOutUri = URI.create(modelUri.toString().substring(0,
						modelUri.toString().lastIndexOf("/") + 1)
						+ "dotnet_component_model.uml");

				monitor.beginTask("Generating component models", 2*cmGenerators.size() + (mergeModels?1:0));
				System.out.println ("Number of tasks " + (2*cmGenerators.size() + (mergeModels?1:0)));

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				try {
					
					// Generating Observer pattern component model
					if (cmGenerators.contains(CMGenerators.Observer_pattern)){
						generateObserverPatternComponentModel(modelUri, dmOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}

	
					// Generating Eclipse RCP component model
					if (cmGenerators.contains(CMGenerators.RCP)){
						generateEclipseRCPComponentModel(modelUri, pluginModel, rcpOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}
					
					//Merging models
					if (mergeModels){
						mergeModels(dmOutUri, rcpOutUri, mergedOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}
					
					//Generating MS SharePoint component model
					if (cmGenerators.contains(CMGenerators.MS_Sharepoint)){
						generateMSSharePointComponentModel(model, spOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}
					//Generating J2EE component model
					if (cmGenerators.contains(CMGenerators.J2EE)){
						generateJ2EEComponentModel(model, j2EEOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}
					//Generating DotNet component model
					if (cmGenerators.contains(CMGenerators.DOTNET)){
						generateDotNetComponentModel(model, dotNetOutUri, monitor);
						monitor.worked(1);
						System.out.println ("Completed task");
					}

					refreshTargetProject(targetProject);
				} catch (Exception e) {
					e.printStackTrace();
					showDialog(Status.CANCEL_STATUS, targetProject);
					return Status.CANCEL_STATUS;
				}

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				showDialog(Status.OK_STATUS, targetProject);
				System.out.println ("Completion dialog shown");
				openFilesInEditor(Arrays.asList(new URI[]{dmOutUri, rcpOutUri, mergedOutUri, spOutUri, dotNetOutUri}));
				System.out.println ("Generated Files opened");
				return Status.OK_STATUS;
			}

			/**
			 * Specialized generator method to obtain an Eclipse RCP component model
			 * @param modelUri The input class model
			 * @param pluginModel The input plug-in model
			 * @param rcpOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateEclipseRCPComponentModel(URI modelUri, final String pluginModel, URI rcpOutUri, 
					final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Profiling RCP
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(modelUri.toString()));
				inModels.put("Plugin", org.eclipse.emf.common.util.URI.createURI("file://" + pluginModel));
				inModels.put("Profile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/rcp-indigo.profile.uml"));
				
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(rcpOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.dews/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"RCPProfiling", monitor);
				monitor.worked(1);
				System.out.println ("Completed task");


				//Generating RCP component model
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(rcpOutUri.toString()));
				inModels.put("Profile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/rcp-indigo.profile.uml"));
				
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(rcpOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.dews/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"RCPComponentModelGenerator", monitor);
			}

			/**
			 * Specialized generator method to obtain an Observer pattern component model
			 * @param modelUri The input class model
			 * @param pluginModel The input plug-in model
			 * @param rcpOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateObserverPatternComponentModel(URI modelUri, URI dmOutUri, final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Profiling Data Management (Observer pattern)
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(modelUri.toString()));
				inModels.put("Profile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/DataManagement.profile.uml"));
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(dmOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.dews/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"DataManagementProfiling", monitor);
				monitor.worked(1);
				System.out.println ("Completed task");
				
				//Generating Data Management (Observer pattern) component model
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(dmOutUri.toString()));
				inModels.put("Profile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/DataManagement.profile.uml"));
				
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(dmOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.dews/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"DataManagementComponentModelGenerator", monitor);
				
			}
			
			/**
			 * Specialized generator method to obtain a MS SharePoint component model
			 * @param modelFile The input class model
			 * @param spOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateMSSharePointComponentModel(IFile modelFile, URI spOutUri, final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Tagging MS SharePoint elements in model
				MSSharePointTagger spTagger = new MSSharePointTagger();
				 org.eclipse.emf.common.util.URI taggedModelURI = spTagger.tagModel(modelFile);
				
				
				//Generating the MS SharePoint component model
				inModels.clear();
				inModels.put("IN", taggedModelURI); //org.eclipse.emf.common.util.URI.createURI(modelFile.getLocationURI().toString()));
				inModels.put("GenericProfile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/Generic.profile.uml"));
				inModels.put("MicrosoftSharePointProfile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/MicrosoftSharePoint.profile.uml"));
				
				//TODO: Module name should be changed
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(spOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.lob/transformation/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"SharepointComponentModelGenerator", monitor);
				monitor.worked(1);
				System.out.println ("Completed task");
			}
			
			/**
			 * Specialized generator method to obtain an Observer pattern component model
			 * @param modelFile The input class model
			 * @param j2eeOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateJ2EEComponentModel(IFile modelFile, URI j2EEOutUri, final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Tagging J2EE elements in model
				J2EETagger j2eeTagger = new J2EETagger();
				 org.eclipse.emf.common.util.URI taggedModelURI = j2eeTagger.tagModel(modelFile);
				
				//Generating the J2EE component model
				inModels.clear();
				inModels.put("IN", taggedModelURI); //org.eclipse.emf.common.util.URI.createURI(modelFile.getLocationURI().toString()));
				inModels.put("J2EEProfile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/J2EE6.profile.uml"));
				
				//TODO: Module name should be changed
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(j2EEOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.j2ee/transformation/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"ComponentModelGenerator", monitor);
				monitor.worked(1);
				System.out.println ("Completed task");
			}
			
			/**
			 * Specialized generator method to obtain an Observer pattern component model
			 * @param modelFile The input class model
			 * @param j2eeOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateDotNetComponentModel(IFile modelFile, URI dotNetOutUri, final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Tagging DotNet elements in model
				DotNetTagger dotNetTagger = new DotNetTagger();
				 org.eclipse.emf.common.util.URI taggedModelURI = dotNetTagger.tagModel(modelFile);
				
				//Generating the J2EE component model
				inModels.clear();
				inModels.put("IN", taggedModelURI); //org.eclipse.emf.common.util.URI.createURI(modelFile.getLocationURI().toString()));
				inModels.put("DotNetProfile", org.eclipse.emf.common.util.URI.createURI(
						"platform:/plugin/eu.artist.repository.artefacts/profiles/dotnet.profile.uml"));
				
				//TODO: Module name should be changed
				performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(dotNetOutUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.cmg.news/transformation/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
					"DotNetComponentModelGenerator", monitor);
				monitor.worked(1);
				System.out.println ("Completed task");
			}
		};
		
		job.setPriority(Job.LONG);
		job.setUser(true);
		job.schedule();
	}

	/**
	 * This methods shows a dialog informing the user of the result of the generation process.
	 * @param status Status of the generation
	 * @param targetProject Project where generated models have been placed within.
	 */
	private void showDialog(final IStatus status, final IProject targetProject) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (status.isOK())
					MessageDialog
							.openInformation(
									shell,
									"Model Understanding Toolbox: Component Model Generator",
									"Generated component models placed in project: "
											+ targetProject.getName());
				else
					MessageDialog
							.openError(
									shell,
									"Model Understanding Toolbox: Component Model Generator",
									"Component model could not be generated. Check error log in console");
			}
		});
	}
	
	/**
	 * Helper method that request to open generated models in default associated editors 
	 * @param files List of generated models to be opened.
	 */
	private void openFilesInEditor(final List<URI> files) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				for (URI file: files)
					openFileInEditor(file);
			}
		});
	}

	/**
	 * Helper method that request to refresh the project where generated models have been placed
	 * @param targetProject The project to refresh.
	 * @throws CoreException
	 */
	private void refreshTargetProject(IProject targetProject)
			throws CoreException {
		targetProject.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	/**
	 * Helper method to load required meta-models for M2M transformations in the ATL execution environment
	 * @return The ATL execution environment
	 */
	private ExecEnv loadMetamodels() {
		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env = null;
		
		if (env == null) {
			env = EmftvmFactory.eINSTANCE.createExecEnv();

			// Load Meta-models
			Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
			metaModel
					.setResource(rs.getResource(
							org.eclipse.emf.common.util.URI
									.createURI(GenerateComponentModelHandler.UML_MM_URI),
							true));
			env.registerMetaModel("UML2", metaModel);

			metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
			metaModel
					.setResource(rs.getResource(
							org.eclipse.emf.common.util.URI
									.createURI(GenerateComponentModelHandler.PROFILE_MM_URI),
							true));
			env.registerMetaModel("profile", metaModel);

			metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
			metaModel
					.setResource(rs.getResource(
							org.eclipse.emf.common.util.URI
									.createURI(GenerateComponentModelHandler.XML_MM_URI),
							true));
			env.registerMetaModel("XML", metaModel);
		}
		
		return env;
	}
	
	/**
	 * It executes a M2M ATL transformation
	 * @param inModels A map of input models, reference by model name within the transformation
	 * @param outputUri The output model
	 * @param transformationPathURIs A list of path locations where look for ATL modules required by the M2M transformation
	 * @param transformationModule The ATL transformation module that performs the M2M transformation
	 * @param monitor An Eclipse Job execution monitor
	 * @return The transformed model
	 * @throws Exception
	 */
	private URI performM2MTransformation(Map<String, org.eclipse.emf.common.util.URI> inModels, org.eclipse.emf.common.util.URI outModelUri,
			List<String> transformationPathURIs, String transformationModule, IProgressMonitor monitor)
			throws Exception {

		URI result = null;
		ResourceSet rs = new ResourceSetImpl();

		monitor.subTask("Performing M2MT: " + transformationModule);
		try {
			ExecEnv env = loadMetamodels();
			
			// Load Models
			for (String modelName: inModels.keySet()){
				Model profileModel = EmftvmFactory.eINSTANCE.createModel();
				profileModel.setResource(rs.getResource(inModels.get(modelName), true));
				env.registerInputModel(modelName, profileModel);
			}
			
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
			outModel.setResource(rs.createResource(outModelUri));
			env.registerOutputModel("OUT", outModel);

			// Load and run module
			DefaultModuleResolver mr = new DefaultModuleResolver(transformationPathURIs.get(0),
					new ResourceSetImpl());
			for (int i=1; i< transformationPathURIs.size(); i++)
				mr.addUriPrefix(transformationPathURIs.get(i));
			TimingData td = new TimingData();
			env.loadModule(mr, transformationModule);
			td.finishLoading();
			env.run(td);
			td.finish();

			// Save models
			outModel.getResource().save(Collections.emptyMap());
			result = URI.create(outModel.getResource().getURI().toString());

		} catch (Exception e) {
			throw e;
		} finally {

		}
		return result;
	}
	
	/**
	 * It executes an ATL M2M transformation to merge given two input models
	 * @param firstUri The first input model
	 * @param secondUri The second input model
	 * @param outputUri The merged output model
	 * @param monitor An Eclipse Job execution monitor
	 * @return The merged output model
	 * @throws Exception
	 */
	public URI mergeModels(URI firstUri, URI secondUri, URI outputUri, IProgressMonitor monitor) throws Exception{
		
		URI result = null;
		ResourceSet rs = new ResourceSetImpl();
		ExecEnv env;
		
		monitor.subTask("Merging model: " + firstUri.toString());
		try {
			env = EmftvmFactory.eINSTANCE.createExecEnv();
			
			//Load Meta-models
			Metamodel metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
			metaModel.setResource(rs.getResource(org.eclipse.emf.common.util.URI.createURI(GenerateComponentModelHandler.UML_MM_URI), true));
			env.registerMetaModel("UML2", metaModel);
			
			metaModel = EmftvmFactory.eINSTANCE.createMetamodel();
			metaModel.setResource(rs.getResource(org.eclipse.emf.common.util.URI.createURI(GenerateComponentModelHandler.PROFILE_MM_URI), true));
			env.registerMetaModel("profile", metaModel);
		
			//Load Models
			Model firstModel = EmftvmFactory.eINSTANCE.createModel();
			firstModel.setResource(rs.getResource(org.eclipse.emf.common.util.URI.createURI(firstUri.toString(), true), true));
			env.registerInputModel("FIRST", firstModel);
			
			Model secondModel = EmftvmFactory.eINSTANCE.createModel();
			secondModel.setResource(rs.getResource(org.eclipse.emf.common.util.URI.createURI(secondUri.toString(), true), true));
			env.registerInputModel("SECOND", secondModel);
			
			Model outModel = EmftvmFactory.eINSTANCE.createModel();
			outModel.setResource(rs.createResource(org.eclipse.emf.common.util.URI.createURI(outputUri.toString())));
			env.registerOutputModel("OUT", outModel);
			
			// Load and run module
			ModuleResolver mr = new DefaultModuleResolver("platform:/plugin/eu.artist.migration.mdt.umlmodelmerging/", new ResourceSetImpl());
			TimingData td = new TimingData();
			env.loadModule(mr, "Transformations::EMFTVMModelMixing");
			td.finishLoading();
			env.run(td);
			td.finish();
			
			// Save models
			outModel.getResource().save(Collections.emptyMap());
			result =  URI.create(outModel.getResource().getURI().toString());
			
		} catch (Exception e) {
			throw e;
		} finally {
			
		}
		return result;
	}
	
	/**
	 * Helper method that request to open a given model in default associated editors 
	 * @param file Model to be opened.
	 */
	private void openFileInEditor (URI file){
		File fileToOpen = new File (file);
		if (fileToOpen.exists() && fileToOpen.isFile()) {
		    IFileStore fileStore = EFS.getLocalFileSystem().getStore(file);
		    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		 
		    try {
		        IDE.openEditorOnFileStore( page, fileStore );
		    } catch ( PartInitException e ) {
		        e.printStackTrace();
		    }
		} else {
		    //File does not exist: ignore request to open it in Editor
		}
		
	}
}
