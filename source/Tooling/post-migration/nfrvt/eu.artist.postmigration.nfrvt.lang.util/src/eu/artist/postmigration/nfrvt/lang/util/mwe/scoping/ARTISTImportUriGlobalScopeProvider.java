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
package eu.artist.postmigration.nfrvt.lang.util.mwe.scoping;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

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

	public static URI ECORE_PRIMITIVE_TYPES = URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI UML_PRIMITIVE_TYPES = URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI JAVA_PRIMITIVE_TYPES = URI.createURI(UMLResource.JAVA_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI XML_PRIMITIVE_TYPES = URI.createURI(UMLResource.XML_PRIMITIVE_TYPES_LIBRARY_URI);
	public static URI MARTE_LIBRARY = URI.createURI("pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml");
		
	@Inject
	private ParentalDefaultScopeProvider projectImportGlobalScopeProvider;
	private List<URI> additionalUris = new ArrayList<URI>();
	
	
	public void addAdditionalUri(String uri) {
		additionalUris.add(URI.createURI(uri));
	}
	
	public void addAdditionalUri(URI uri) {
		additionalUris.add(uri);
	}
	
	public List<URI> getAdditionalUris() {
		return this.additionalUris;
	}
	
	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> importedUris = super.getImportedUris(resource);
		// for now: deactivate automatically imported URIs
		// importedUris.addAll(getAdditionalUris()); - 
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
