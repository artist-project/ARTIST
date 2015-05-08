/*******************************************************************************
 *  Copyright (c) 2015 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import eu.artist.methodology.mpt.cheatsheet.util.MPTLogger;

public class FileSelectionAction extends Action implements ICheatSheetAction{
   static MPTLogger logger = new MPTLogger();
	
   @Override
   public void run(String[] params, ICheatSheetManager arg1) {
	 try {
		   
		   logger.log("FileSelectionAction for CloudSelection plugin activated.");
		  
		   final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		   
		   ICommandService cmdService = (ICommandService)window.getService(ICommandService.class);
		   Command cmd = cmdService.getCommand("eu.artist.migration.cloudselection.command2");

		   ParameterizedCommand pc = new ParameterizedCommand(cmd, null);			 
		   IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
		   handlerService.executeCommand(pc, null);
			
	   } catch(Exception ex)  {
		   logger.log("An exception occurred", ex);
		   ex.printStackTrace();
	   }
	 
   }	 
}

