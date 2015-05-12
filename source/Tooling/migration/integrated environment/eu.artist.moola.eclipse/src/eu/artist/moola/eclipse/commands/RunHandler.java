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
package eu.artist.moola.eclipse.commands;

import java.io.OutputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.artist.moola.TransformationRegistry;
import eu.artist.moola.eclipse.MoolaRunner;
import eu.artist.moola.emf.acceleo.AcceleoTransformation;
import eu.artist.moola.emf.atl.AtlTransformation;
import eu.artist.moola.emf.atl.emftvm.AtlEmftvmTransformation;
import eu.artist.moola.emf.modisco.MoDiscoTransformation;

public class RunHandler extends AbstractHandler {

	private final static String MOOLA_CONSOLE = "Moola";
	private final static String TARGET_VIEW_ID = "org.eclipse.jdt.ui.PackageExplorer";
	
	private MessageConsole console;

	public RunHandler() {
		try {
			this.console = this.findConsole(RunHandler.MOOLA_CONSOLE);
			this.registerTrafos();	
		} catch(Exception ex){
			throw ex;
		}
	}
	
	@Override
	public Object execute(ExecutionEvent event) {
		try {
			
			this.showConsole(event);
			this.clearConsole();
			
			IFile file = this.getSelectedFile(event);
			String moolaPath = file.getLocation().toPortableString();
			String projectName = file.getProject().getName();
			String projectPath = file.getProject().getLocation().toPortableString();
			OutputStream outStream = console.newMessageStream();
			
			Runnable runnable = new MoolaRunner(moolaPath, projectPath, projectName, outStream);
			Thread thread = new Thread(runnable);
			thread.start();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	
	private void registerTrafos() {
		TransformationRegistry.register("MoDisco", MoDiscoTransformation.class);
		TransformationRegistry.register("Acceleo", AcceleoTransformation.class);
		TransformationRegistry.register("ATL", AtlTransformation.class);
		TransformationRegistry.register("ATL/EMFTVM", AtlEmftvmTransformation.class);
	}

	private IFile getSelectedFile(ExecutionEvent event) throws ExecutionException {
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// set selection service
		ISelectionService service = window.getSelectionService();
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection(RunHandler.TARGET_VIEW_ID);

		// check if it is an IFile
		if (structured.getFirstElement() instanceof IFile) {
			IFile file = (IFile) structured.getFirstElement();
			return file;
		}
		throw new RuntimeException("No file selected");
	}
	
	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		
		// search existing consoles
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())){
				return (MessageConsole) existing[i];
			}
		}
		
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		conMan.showConsoleView(myConsole);
		return myConsole;
	}
	
	private void clearConsole() {
		this.console.clearConsole();
	}
	
	private void showConsole(ExecutionEvent event) throws PartInitException, ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IWorkbenchPage page = window.getActivePage();
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view = (IConsoleView) page.showView(id);
		view.display(this.console);
	}
	
}
