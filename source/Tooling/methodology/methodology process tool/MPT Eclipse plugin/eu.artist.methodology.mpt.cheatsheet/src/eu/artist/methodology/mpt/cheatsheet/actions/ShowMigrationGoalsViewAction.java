/*******************************************************************************
 *  Copyright (c) 2014 - 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import eu.artist.premigration.tft.tft.views.MigrationGoalsView;

public class ShowMigrationGoalsViewAction extends Action implements ICheatSheetAction{
	
   @Override
   public void run(String[] params, ICheatSheetManager arg1) {
	 try {
		   
		   System.out.println("ShowMigrationGoalsViewAction activated.");
		   
		   if (params!=null && params.length > 0) {
			   System.out.println("The selected MIG file is " + params[0]);
		   
			   File file = new File(params[0]);
			   IWorkspace workspace= ResourcesPlugin.getWorkspace();    
			   //IPath location= Path.fromOSString(file.getAbsolutePath());
			   IPath location= new Path(file.getAbsolutePath());
		 
			   IFile ifile= workspace.getRoot().getFileForLocation(location);
			   
			   if (ifile == null) {
				   
				   System.out.println("The file is not located in the workspace. ");
				   
				   JOptionPane.showMessageDialog( null, "The selected file is not located in the workspace. Please redo the step and choose a file in the workspace.","Warning",JOptionPane.OK_CANCEL_OPTION);
				   
			   } else {
		   
				   MigrationGoalsView.gmlFile = ifile;
		   
				   System.out.println("The selected file has been set in migration's goals view.");

				   final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				   
				   
				   if (window.getActivePage().findView(MigrationGoalsView.ID) != null) {
						
					   window.getActivePage().hideView(window.getActivePage().findView(MigrationGoalsView.ID));
				   
				   } 
				   
				   ArrayList<Parameterization> parameters = new ArrayList<Parameterization>();
				   IParameter iparam;
				   ICommandService cmdService = (ICommandService)window.getService(ICommandService.class);
				   Command cmd = cmdService.getCommand("org.eclipse.ui.views.showView");

				   iparam = cmd.getParameter("org.eclipse.ui.views.showView.viewId");
				   Parameterization param = new Parameterization(iparam, "eu.artist.premigration.tft.tft.views.MigrationGoalsView");
				   parameters.add(param);

				   final ParameterizedCommand pc = new ParameterizedCommand(cmd, parameters.toArray(new Parameterization[parameters.size()]));
				   //ParameterizedCommand pc = new ParameterizedCommand(cmd, null);
			 
				   IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
				   handlerService.executeCommand(pc, null);
				   				   

			  }
		 }
		   
			
	   } catch(Exception ex)  {
		   ex.printStackTrace();
	   }
	 
   }	 
}

