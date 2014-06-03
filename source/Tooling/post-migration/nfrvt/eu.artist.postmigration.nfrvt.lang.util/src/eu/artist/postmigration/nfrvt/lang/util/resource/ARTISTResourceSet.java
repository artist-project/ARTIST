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
package eu.artist.postmigration.nfrvt.lang.util.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ARTISTResourceSet extends XtextResourceSet {
	public ARTISTResourceSet() {
		super();
		getURIConverter().getURIMap().put(
				URI.createURI("platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.library.uml"),
				URI.createURI("platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.library.uml"));
	}
	
	@Override
	public Resource createResource(URI uri) {
		// TODO Auto-generated method stub
		return super.createResource(uri);
	}
	
	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		// TODO Auto-generated method stub
		return super.getResource(uri, loadOnDemand);
	}

}
