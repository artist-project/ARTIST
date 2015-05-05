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


import java.util.ArrayList;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;

//import eu.artist.methodology.mpt.cheatsheet.Activator;
import eu.artist.suite.ARTISTSuite;


public class OpenBrowserFromPreferenceStoreAction extends Action implements ICheatSheetAction {
    
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
	
	   try {
		   
		    System.out.println("GetPreferenceValue action activated.");
		    
		    String parameter = params[0];
		    
		    System.out.println("Parameter id: " + parameter);
		    
		    String preference = ARTISTSuite.getDefault().getPreferenceStore().getString(parameter);
		    System.out.println("Parameter value: " + preference);
		    	   		   
		    ArrayList<Parameterization> parameters = new ArrayList<Parameterization>();
		    IParameter iparam;
		   
			final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			ICommandService cmdService = (ICommandService)window.getService(ICommandService.class);
			Command cmd = cmdService.getCommand("org.eclipse.ui.browser.openBrowser");
			 
			iparam = cmd.getParameter("url");
			Parameterization param = new Parameterization(iparam, preference);
			parameters.add(param);

			final ParameterizedCommand pc = new ParameterizedCommand(cmd, parameters.toArray(new Parameterization[parameters.size()]));
			//ParameterizedCommand pc = new ParameterizedCommand(cmd, null);

			IHandlerService handlerService = (IHandlerService)window.getService(IHandlerService.class);
			handlerService.executeCommand(pc, null);
		   
	   } catch(Exception ex)  {
		   ex.printStackTrace();
	   }	
    }
}
