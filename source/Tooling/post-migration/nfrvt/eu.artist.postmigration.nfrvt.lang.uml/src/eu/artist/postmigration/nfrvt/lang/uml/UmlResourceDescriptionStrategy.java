/*******************************************************************************
 * Copyright (c) 2010, 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * - Original implementation by Christian Dietrich, retrieved from his blog at 
 *   http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.uml;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

/**
 * Implementation retrieved from Christian Dietrichs blog post.
 * 
 * @see <a href="http://christiandietrich.wordpress.com/2011/07/17/xtext-2-0-and-uml/">
 * Original blog post by Christian Dietrich</a>
 */
public class UmlResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		boolean desc = super.createEObjectDescriptions(eObject, acceptor);
		return desc;
	}
	
	@Override
	protected IReferenceDescription createReferenceDescription(EObject owner,
			URI exportedContainerURI, EReference eReference, int indexInList,
			EObject target) {
		return super.createReferenceDescription(owner, exportedContainerURI,
				eReference, indexInList, target);
	}
	
}