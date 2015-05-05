/********************************************************************************
* Copyright (c) 2013 INRIA. 
* All rights reserved. This program and the accompanying materials 
* are made available under the terms of the Eclipse Public License v1.0 
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors: 
*	INRIA - Initial implementation
*	authors: Guillaume Doux (guillaume.doux at inria.fr)
* Initially developed in the context of ARTIST EU project www.artist-project.eu
*********************************************************************************/ 
package eu.artist.migration.mdt.generic.xml.xmlaggregated;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public class AggregatedXMLDiscoverer extends AbstractModelDiscoverer<IFolder> {


	public static String ID="eu.artist.migration.mdt.generic.xml.xmlaggregated";

	private AbstractModelDiscoverer<IFile> xmlDiscoverer;

	private Resource globalxmlModel;

	public AggregatedXMLDiscoverer() {
		super();
	}

	@Override
	public boolean isApplicableTo(IFolder folder) {

		return folder.isAccessible();

	}

	private static String xmlId = "org.eclipse.modisco.xml.discoverer";


	@Override
	protected void basicDiscoverElement(IFolder folder,
			IProgressMonitor monitor) throws DiscoveryException {

		/**
		 * Initialization of the discoverer, here we get the instance of the xml discoverer from the discovery manager
		 */
		this.xmlDiscoverer = (AbstractModelDiscoverer<IFile>) IDiscoveryManager.INSTANCE.createDiscovererImpl(AggregatedXMLDiscoverer.xmlId);
		/**
		 * End initialization
		 */
		
		this.globalxmlModel = new XMIResourceImpl();
		if (this.getTargetURI()==null){
			this.setTargetURI(URI.createURI(folder.getLocationURI().toString()+".xml.xmi"));
		}
		this.globalxmlModel.setURI(this.getTargetURI());
		this.setTargetModel(this.globalxmlModel);

		try {
			searchInFolder(folder, monitor);

		} catch (CoreException e) {
			MoDiscoLogger.logError(e,
					"Could not get members of project", Activator.getDefault()); //$NON-NLS-1$

		} catch (DiscoveryException e) {
			MoDiscoLogger.logError(e,
					"Discoverer fails on folder" + folder.getName(), Activator.getDefault()); //$NON-NLS-1$
		}}

	private void searchInFolder(IFolder folder, IProgressMonitor monitor) throws CoreException,
	DiscoveryException {
		for (IResource res : folder.members()) {
			if (res instanceof IFile) {
				if (res.getFileExtension()!=null){
					if (res.getFileExtension().equals("xml")){
						/**
						 * Launch of the discovery
						 */
						IProgressMonitor subProgressMonitor = new SubProgressMonitor(monitor, 1);
						//here we can select if we want to serialize the output model or not
						this.xmlDiscoverer.setSerializeTarget(false);
						//it is possible to set an URI for the output model now
						//this.xmlDiscoverer.setTargetURI(hereIsYourURI);
						//actual launch
						this.xmlDiscoverer.discoverElement((IFile) res, subProgressMonitor);
						/**
						 * End of the launch
						 */
						/**
						 * Here ishow to get the output model
						 */
						//Resource outputModel = this.xmlDiscoverer.getTargetModel();
						
						
						this.globalxmlModel.getContents().add(this.xmlDiscoverer.getTargetModel().getAllContents().next());
					}
				}
			} else {
				if (res instanceof IFolder) {
					searchInFolder((IFolder) res, monitor);
				}

			}
			try {
				folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
