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
package eu.artist.postmigration.nfrvt.lang.common.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import eu.artist.postmigration.nfrvt.extensionpoint.RegisteredModelResources;

/**
 * Scope provider that gives access to both the imported URIs and the elements
 * on the classpath. URIs that should be imported without the need of explicit
 * imports may be added to this class.
 * <p/>
 * The automatic import of URIs has been deactivated for now!!!
 * @author Martin Fleck
 *
 */
public abstract class ARTISTImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider implements IScopeProvider {

	@Inject
	private ParentalDefaultScopeProvider projectImportGlobalScopeProvider;
	
	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> importedUris = super.getImportedUris(resource);
		importedUris.addAll(RegisteredModelResources.getInstance().getURIs()); 
		return importedUris;
	}
	
	@Override
	public IScope getScope(Resource resource, EReference reference,
			Predicate<IEObjectDescription> filter) {
		IScope parent = super.getScope(resource, reference, filter);
		projectImportGlobalScopeProvider.setParentScope(parent);
		IScope all = projectImportGlobalScopeProvider.getScope(resource, reference, filter);
		return all;
	}

	@Override
	public IScope getScope(EObject context, EReference reference) {
		return getScope(context.eResource(), reference, null);
	}
}
