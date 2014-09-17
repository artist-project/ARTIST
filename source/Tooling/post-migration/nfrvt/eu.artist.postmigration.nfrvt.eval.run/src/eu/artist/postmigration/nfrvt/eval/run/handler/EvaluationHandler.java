/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.eval.run.handler;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import eu.artist.postmigration.nfrvt.eval.run.EvaluationProcessor;
import eu.artist.postmigration.nfrvt.eval.run.logger.ConsoleLogger;
import eu.artist.postmigration.nfrvt.eval.run.ui.launch.WorkbenchContentProvider;
import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceUtil;

/**
 * Handler for right-click on an input model for the 
 * {@link EvaluationProcessor}.
 * 
 * @author Martin Fleck
 */
public class EvaluationHandler extends AbstractHandler {

	private ConsoleLogger consoleLogger = new ConsoleLogger();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Object firstElement = null;
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            firstElement = structuredSelection.getFirstElement();
        }
        if(firstElement == null) {
        	IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        	firstElement = activeEditor.getEditorInput().getAdapter(IFile.class);
        }
        if(firstElement != null) {
		    if (firstElement instanceof IFile) {
	            IFile file = (IFile) firstElement;
	            createOutput(shell, file);
		    } else {
		      MessageDialog.openInformation(shell, "Info",
		          "Please select a Java source file");
		    }
        }
	    return null;
	}
	
	/**
	 * Starts a new {@link EvaluationProcessor} if the selected input file can
	 * be used for the evaluation and an output file is specified successfully.
	 * 
	 * @param shell shell used for dialogs
	 * @param file input file
	 */
	private void createOutput(Shell shell, IFile file) {
	    String filePath = file.getFullPath().toString();

	    String fileString = file.toString();
	    String outputFileString = fileString.substring(0, fileString.lastIndexOf('.')) + 
				".evaluated." + MigrationResourceUtil.getEvaluationFileExtension();
	    IPath outputPath = new Path(outputFileString);
	    
	    File outputPathFile = new File(outputPath.toOSString());
	    boolean outputExists = outputPathFile.exists();
	    boolean override = true;
	    if(outputExists) {
    		override = MessageDialog.openQuestion(shell, "Question",
	  	         "Override existing file?");
	    }
	    if(!override) {
	    	ViewerFilter extensionFilter = new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					return !(element instanceof IFile)
							|| MigrationResourceUtil.getEvaluationFileExtension().equals(((IFile) element).getFileExtension());
				}
			};
			// new WorkbenchContentProvider();
			WorkspaceResourceDialog dialog = new WorkspaceResourceDialog(shell, new WorkbenchLabelProvider(), new WorkbenchContentProvider());
			dialog.setAllowMultiple(false);
			dialog.setShowFileControl(true);
			dialog.setShowNewFolderControl(true);
			dialog.addFilter(extensionFilter);
			dialog.loadContents();
			dialog.setTitle("Resource Browser");
			dialog.setMessage("Choose a file for the evaluation result.");

			IFile outputFile = dialog.open() == Window.OK ? dialog.getFile() : null;
			if (outputFile != null) {
				outputFileString = outputFile.getFullPath().toString();
				if(!MigrationResourceUtil.getEvaluationFileExtension().equals(outputFile.getFileExtension()))
					outputFileString += "." + MigrationResourceUtil.getEvaluationFileExtension();
			} else {
				return;
			}
	    }
	    
	    new EvaluationProcessor(consoleLogger).evaluate(filePath, outputFileString);
	  }
}
