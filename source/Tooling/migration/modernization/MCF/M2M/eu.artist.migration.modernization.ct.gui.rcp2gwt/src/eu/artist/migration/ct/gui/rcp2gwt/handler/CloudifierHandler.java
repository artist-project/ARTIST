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
package eu.artist.migration.ct.gui.rcp2gwt.handler;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.migration.ct.gui.rcp2gwt.abstractors.Cloudifiers;
import eu.artist.migration.ct.gui.rcp2gwt.dialog.GUICloudifierDialog;
import eu.artist.migration.ct.gui.rcp2gwt.helper.EclipseWorkbenchHelper;
import eu.artist.migration.ct.gui.rcp2gwt.helper.M2MTHelper;

public class CloudifierHandler extends AbstractHandler {
	private Shell shell;	
	static private Map<String, String> metamodels = new HashMap<>();
	private String dialogTitle = "Cloudification Toolbox: GUI Cloudifier";
	private String dialogMsg = "Generated GUI cloudified models placed in project: ";
	private String dialogErrMsg = "GUI cloudified models could not be generated. Check error log in console";
	
	static {
		metamodels.put("UML2", "http://www.eclipse.org/uml2/4.0.0/UML");
		metamodels.put("profile", "http://www.eclipse.org/uml2/4.0.0/UML/Profile/L3");
		metamodels.put("XML", "http://www.eclipse.org/MoDisco/Xml/0.1.incubation/XML");
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		this.shell = window.getShell();

		IFile selectedClassModel = EclipseWorkbenchHelper.getSelectedFile(event);
		IProject targetProject = EclipseWorkbenchHelper.getTargetProject(event);

		showGUICloudificationDialog(selectedClassModel, event, targetProject);
		
		return null;
	}
	
	/**
	 * This method shows a dialog prompting the user information required to cloudify GUI models
	 * for given input class model.
	 * @param selectedClassModel The input class model
	 * @param event Event triggered by the action managed by this handler.
	 * @param targetProject Project owing the selected input class model.
	 */
	private void showGUICloudificationDialog(IFile selectedClassModel, ExecutionEvent event, IProject targetProject) {
		GUICloudifierDialog dialog = new GUICloudifierDialog(shell);
		dialog.setInputModel (selectedClassModel);
	    
	    // get the new values from the dialog
	    if (dialog.open() == Window.OK) {
	    	generateGUICloudifiedModels(selectedClassModel, event, targetProject, dialog.getSelectedGUICloudifiers(), dialog.getLegacyModel());
	    }
	}
	
	/**
	 * This method performs the chain of required M2M transformations to obtain the cloudified GUI models
	 * selected by the user
	 * TODO Re-structure the code to support performing a number of M2M transformations for a arbitrary 
	 * number of selected GUI cloudifiers. 
	 * @param model Input class model
	 * @param event Event associated to the action triggered by the user.
	 * @param targetProject Project where the input class model is located.
	 * @param cmCloudifiers Collection of selected GUI cloudifiers
	 * @param legacyModel Input legacy model required if merging requested
	 */
	public void generateGUICloudifiedModels(final IFile model, final ExecutionEvent event, 
			final IProject targetProject, final EnumSet<Cloudifiers> cmCloudifiers, 
			final String legacyModel) {
			Job job = new Job("Generating cloudified GUI models in progress") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				URI modelUri = model.getLocationURI();
				List<URI> outFiles = new ArrayList<>();
				List<URI> outMergedFiles = new ArrayList<>();
				for (Cloudifiers cloudifier: cmCloudifiers){
					outFiles.add(
						URI.create(modelUri.toString().substring(0, modelUri.toString().lastIndexOf(".") + 1)
							+ cloudifier.getLabel() + ".uml")
					);
					outMergedFiles.add(
						URI.create(modelUri.toString().substring(0, modelUri.toString().lastIndexOf(".") + 1)
							+ cloudifier.getLabel() + ".merged.uml")
					);
				}
				int numberOfTask = cmCloudifiers.size()*(legacyModel != null && !legacyModel.isEmpty()?2:1);
						
				monitor.beginTask("Generating cloudified GUI models", numberOfTask);
				System.out.println ("Number of tasks " + numberOfTask);

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				try {
					int i=0;
					for (Cloudifiers cloudifier: cmCloudifiers){
						URI outFile = outFiles.get(i);
						URI outMergedFile = outMergedFiles.get(i++);
						switch (cloudifier){
						case RCP2GWT:
							generateCloudifiedGUIModel(modelUri, outFile, 
								org.eclipse.emf.common.util.URI.createURI(cloudifier.getPDM()), 
								cloudifier.getModule(), monitor);
							monitor.worked(1);
							System.out.println ("Completed GUI cloudification " + cloudifier.getLabel());
							break;
						default:
							//Ignored
							System.out.println ("Ignored cloudifier: " + cloudifier.getLabel());
						}
						
						// Merging to legacy
						if (legacyModel != null && !legacyModel.isEmpty()){
							EclipseWorkbenchHelper.refreshTargetProject(targetProject);
							mergeCloudifiedGUIModel(outFile, legacyModel, outMergedFile, monitor);
							monitor.worked(1);
							System.out.println ("Completed GUI cloudification merging " + cloudifier.getLabel());
						}
					}	
					
	
					EclipseWorkbenchHelper.refreshTargetProject(targetProject);
				} catch (Exception e) {
					e.printStackTrace();
					EclipseWorkbenchHelper.showDialog(shell, dialogTitle, dialogMsg, dialogErrMsg, Status.CANCEL_STATUS, targetProject);
					return Status.CANCEL_STATUS;
				}

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				EclipseWorkbenchHelper.showDialog(shell, dialogTitle, dialogMsg, dialogErrMsg, Status.OK_STATUS, targetProject);
				System.out.println ("Completion dialog shown");
				EclipseWorkbenchHelper.openFilesInEditor(outFiles);
				EclipseWorkbenchHelper.openFilesInEditor(outMergedFiles);
				System.out.println ("Generated Files opened");
				return Status.OK_STATUS;
			}

			/**
			 * Specialized generator method to obtain an cloudified GUI model
			 * @param modelUri The input class model
			 * @param outUri The output model
			 * @param pdm The PDM model
			 * @param m2mtModule The M2MT module
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateCloudifiedGUIModel(URI modelUri, URI outUri,
					org.eclipse.emf.common.util.URI pdm, String m2mtModule,
					final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Abstracting RCP
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(modelUri.toString()));
				inModels.put("PDM", pdm);
				
				M2MTHelper.performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(outUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.modernization.ct.gui.rcp2gwt/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
						m2mtModule, metamodels, monitor);
			}
			
			/**
			 * Specialized generator method to merge an cloudified GUI model
			 * @param modelUri The input class model
			 * @param legacyModel The input legacy model
			 * @param outUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void mergeCloudifiedGUIModel(URI modelUri, final String legacyModel, URI outUri,
					final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Abstracting RCP
				inModels.clear();
				inModels.put("INEclipse", org.eclipse.emf.common.util.URI.createURI("file://" + legacyModel));
				inModels.put("INGWT", org.eclipse.emf.common.util.URI.createURI(modelUri.toString()));
				
				M2MTHelper.performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(outUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.repository.artefacts/"}), 
						"EclipseGUI2GWTMerger", metamodels, monitor);
			}
			
		};
		job.setPriority(Job.LONG);
		job.setUser(true);
		job.schedule();
	}
}
