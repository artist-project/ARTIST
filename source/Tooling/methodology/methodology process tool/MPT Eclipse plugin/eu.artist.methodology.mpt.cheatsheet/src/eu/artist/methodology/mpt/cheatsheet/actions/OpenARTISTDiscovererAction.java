/*******************************************************************************
 *  Copyright (c) 2014 Institute of Communication and Computer Systems (ICCS) - National Technical University of Athens (NTUA)
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

import org.eclipse.jface.action.Action;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.ui.internal.actions.MoDiscoMenuSelectionListener;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.DiscovererLaunchConfigurationDelegate;
import eu.artist.migration.mdt.generic.xml.xmlaggregated.AggregatedXMLDiscoverer;

public class OpenARTISTDiscovererAction extends Action {
	@Override
	public void run() {
	
		IWorkbench workbench = PlatformUI.getWorkbench();
		Shell shell = workbench.getActiveWorkbenchWindow().getShell();
		
		/*
		JarPackageWizard wizard= new JarPackageWizard();
		wizard.init(workbench,new StructuredSelection());
		WizardDialog dialog= new WizardDialog(shell, wizard);
		dialog.create();
		dialog.open();
		//did the wizard succeed ?
		notifyResult(dialog.getReturnCode()==Dialog.OK);
		*/
		
		DiscovererDescription dd = IDiscoveryManager.INSTANCE.getDiscovererDescription("eu.artist.migration.mdt.generic.xml.xmlaggregated");
		
		AggregatedXMLDiscoverer axd = new AggregatedXMLDiscoverer();
		
		//MoDiscoMenuSelectionListener dl = new MoDiscoMenuSelectionListener(dd, null, shell);		
		//DiscovererLaunchConfigurationDelegate s = new DiscovererLaunchConfigurationDelegate();
		//s.launch(configuration, mode, launch, monitor);	
		//XMLModelDiscoverer discoverer = new XMLModelDiscoverer(); 
		// you can set some parameters 
		//discoverer.setIgnoreWhitespace(true); discoverer.setLightweightModel(false); 
		// launch the discovery 
		//discoverer.discoverElement(xmlFile, monitor); 
		// get the resulting resource containing the XML model 
		//Resource xmlResource = discoverer.getTargetModel(); 
	}
	
}
