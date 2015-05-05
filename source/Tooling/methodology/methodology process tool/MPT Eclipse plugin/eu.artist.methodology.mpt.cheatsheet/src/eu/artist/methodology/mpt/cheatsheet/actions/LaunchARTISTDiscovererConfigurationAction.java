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
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.cheatsheets.ICheatSheetAction;
import org.eclipse.ui.cheatsheets.ICheatSheetManager;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;

public class LaunchARTISTDiscovererConfigurationAction extends Action implements ICheatSheetAction {
	ILaunchConfiguration config = null;
	ILaunchConfigurationWorkingCopy wc = null;
	
	@Override
	public void run(String[] params, ICheatSheetManager arg1) {
		
		String config_id = params[0];
	
		IWorkbench workbench = PlatformUI.getWorkbench();
		Shell shell = workbench.getActiveWorkbenchWindow().getShell();
    	String mode = "run";

		try {

			ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
			
			//ILaunchConfigurationType lct = mgr.getLaunchConfigurationType("org.eclipse.modisco.workflow.launchType");
			
			//ILaunchConfigurationType lct_ = mgr.getLaunchConfigurationType("org.eclipse.modisco.infra.discovery.launchConfigurationType");
					
			ILaunchConfigurationType lct = mgr.getLaunchConfigurationType(config_id);

			ILaunchConfiguration[] lcs = mgr.getLaunchConfigurations(lct);
			
			wc = lct.newInstance(null, getLaunchManager().generateLaunchConfigurationName("ARTIST"));
			config = wc.doSave();
			
			/*
			IStructuredSelection selection;
			
			if (config != null) {
				selection = new StructuredSelection();
			} else {
				selection = new StructuredSelection(config);
			}
			*/
			
			IStructuredSelection selection = new StructuredSelection(new ArrayList<ILaunchConfigurationType>(Arrays.asList(lct)));
			
		    DebugUITools.openLaunchConfigurationDialogOnGroup(
	                shell,
	                selection,
	                DebugUITools.getLaunchGroup(config, mode).getIdentifier());
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
	private ILaunchManager getLaunchManager() {
		    return DebugPlugin.getDefault().getLaunchManager();
    }
	
	private void setConfigurationAttributes() {
		
		//wc.setAttribute("LAUNCH_CONFIGURATION__DISCOVERER","");
				
		List<String> list;
		try {
			
			list = wc.getAttribute(IDebugUIConstants.LAUNCH_GROUP, (List<String>) null);
			
			if (list == null) {
				list = new ArrayList<String>();
			}
			
			list.add(IDebugUIConstants.ID_DEBUG_LAUNCH_GROUP);
			list.add(IDebugUIConstants.ID_RUN_LAUNCH_GROUP);
					
			//wc.setAttribute(IDebugUIConstants.LAUNCH_GROUP, list);
			
			wc.setAttribute("LAUNCH_CONFIGURATION__DISCOVERER", list);
			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
