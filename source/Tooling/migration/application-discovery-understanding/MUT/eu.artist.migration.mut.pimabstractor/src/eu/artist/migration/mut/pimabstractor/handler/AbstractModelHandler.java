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
package eu.artist.migration.mut.pimabstractor.handler;

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

import eu.artist.migration.mut.pimabstractor.abstractors.Abstractors;
import eu.artist.migration.mut.pimabstractor.dialog.PIMAbstractorDialog;
import eu.artist.migration.mut.pimabstractor.helper.EclipseWorkbenchHelper;
import eu.artist.migration.mut.pimabstractor.helper.M2MTHelper;

public class AbstractModelHandler extends AbstractHandler {
	private Shell shell;	
	static private Map<String, String> metamodels = new HashMap<>();
	private String dialogTitle = "Model Understanding Toolbox: Model Abstractor";
	private String dialogMsg = "Generated abstract models placed in project: ";
	private String dialogErrMsg = "Abstract model could not be generated. Check error log in console";
	
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

		showPIMAbstractorDialog(selectedClassModel, event, targetProject);
		
		return null;
	}
	
	/**
	 * This method shows a dialog prompting the user information required to generate abstract models
	 * for given input class model.
	 * @param selectedClassModel The input class model
	 * @param event Event triggered by the action managed by this handler.
	 * @param targetProject Project owing the selected input class model.
	 */
	private void showPIMAbstractorDialog(IFile selectedClassModel, ExecutionEvent event, IProject targetProject) {
		PIMAbstractorDialog dialog = new PIMAbstractorDialog(shell);
		dialog.setInputModel (selectedClassModel);
	    
	    // get the new values from the dialog
	    if (dialog.open() == Window.OK) {
	    	generateAbstractModels(selectedClassModel, event, targetProject, dialog.getSelectedAbstractors(), dialog.getPluginModel());
	    }
	}
	
	/**
	 * This method performs the chain of required M2M transformations to obtain the abstract models
	 * selected by the user
	 * TODO Re-structure the code to support performing a number of M2M transformations for a arbitrary 
	 * number of selected component models. 
	 * @param model Input class model
	 * @param event Event associated to the action triggered by the user.
	 * @param targetProject Project where the input class model is located.
	 * @param cmAbstractors Collection of selected PIM abstractors
	 * @param pluginModel Input plug-in model required by RCP generator
	 */
	public void generateAbstractModels(final IFile model, final ExecutionEvent event, 
			final IProject targetProject, final EnumSet<Abstractors> cmAbstractors, 
			final String pluginModel) {
			Job job = new Job("Abstracting UML models in progress") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				URI modelUri = model.getLocationURI();
				List<URI> outFiles = new ArrayList<>();
				for (Abstractors abstractor: cmAbstractors){
					outFiles.add(
						URI.create(modelUri.toString().substring(0, modelUri.toString().lastIndexOf(".") + 1)
									+ abstractor.getLabel() + ".uml")
					);
				}
				
				monitor.beginTask("Generating abstract models", cmAbstractors.size());
				System.out.println ("Number of tasks " + cmAbstractors.size());

				if (monitor.isCanceled()) {
					return Status.CANCEL_STATUS;
				}

				try {
					int i=0;
					for (Abstractors abstractor: cmAbstractors){
						switch (abstractor){
						case GUI:
						case RCP:
							generateAbstractModel(modelUri, pluginModel, outFiles.get(i++), 
								org.eclipse.emf.common.util.URI.createURI(abstractor.getProfile()), 
								abstractor.getModule(), monitor);
							monitor.worked(1);
							System.out.println ("Completed abstraction " + abstractor.getLabel());
							break;
						default:
							//Ignored
							System.out.println ("Ignored abstractor: " + abstractor.getLabel());
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
				System.out.println ("Generated Files opened");
				return Status.OK_STATUS;
			}

			/**
			 * Specialized generator method to obtain an abstract model
			 * @param modelUri The input class model
			 * @param pluginModel The input plug-in model
			 * @param rcpOutUri The output model
			 * @param monitor An Eclipse Job execution monitor
			 * @throws Exception
			 */
			private void generateAbstractModel(URI modelUri, final String pluginModel, URI outUri,
					org.eclipse.emf.common.util.URI profile, String m2mtModule,
					final IProgressMonitor monitor)
					throws Exception {
				Map<String, org.eclipse.emf.common.util.URI> inModels = new HashMap<>();
				
				//Abstracting RCP
				inModels.clear();
				inModels.put("IN", org.eclipse.emf.common.util.URI.createURI(modelUri.toString()));
				inModels.put("Plugin", org.eclipse.emf.common.util.URI.createURI("file://" + pluginModel));
				inModels.put("Profile", profile);
				
				M2MTHelper.performM2MTransformation (inModels, org.eclipse.emf.common.util.URI.createURI(outUri.toString()),
					Arrays.asList(new String[]{"platform:/plugin/eu.artist.migration.mut.pimabstractor/transformations/",
						"platform:/plugin/eu.artist.repository.artefacts/"}), 
						m2mtModule, metamodels, monitor);
			}
			
		};
		job.setPriority(Job.LONG);
		job.setUser(true);
		job.schedule();
	}
}
