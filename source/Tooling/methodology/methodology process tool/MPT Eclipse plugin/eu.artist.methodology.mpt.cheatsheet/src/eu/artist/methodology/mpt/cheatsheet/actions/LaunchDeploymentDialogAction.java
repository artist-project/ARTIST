/*******************************************************************************
 *  Copyright (c) 2014 -2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
 *  
 *  Licensed under the MIT license:
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 *
 * Contributors: Kleopatra Konstanteli
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.cheatsheet.actions;

import java.io.File;

import javax.swing.JOptionPane;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import eu.artist.methodology.mpt.cheatsheet.util.MPTLogger;
import eu.artist.migration.deployment.handler.DeploymentHelper;

public class LaunchDeploymentDialogAction extends Action implements ICheatSheetAction {
	static MPTLogger logger = new MPTLogger();
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		Shell shell = workbench.getActiveWorkbenchWindow().getShell();

		try {
			
			 if (params!=null && params.length > 0) {
				   logger.log("The selected Deployment model is '" + params[0] + "'");
			   
				   File file = new File(params[0]);
				   IWorkspace workspace= ResourcesPlugin.getWorkspace();    
				   IPath location= new Path(file.getAbsolutePath());
			 
				   IFile ifile= workspace.getRoot().getFileForLocation(location);
				   
				   if (ifile == null) {
					   
					   logger.log("The file is not located in the workspace. ");					   
					   JOptionPane.showMessageDialog( null, "The selected file is not located in the workspace. Please redo the step and choose a file in the workspace.","Warning",JOptionPane.OK_CANCEL_OPTION);
					   
				   } else {
						
					   DeploymentHelper dh = new DeploymentHelper(shell);
					   dh.showDeploymentDialog(ifile, ifile.getProject());
				   }
			 }
			
		} catch (Exception e) {
			logger.log("An exception has occurred", e);
			e.printStackTrace();
		}
	
	}
	
}
