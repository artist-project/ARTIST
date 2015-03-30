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
package eu.artist.postmigration.nfrvt.resources;

import org.eclipse.emf.ecore.EObject;

import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;

/**
 * A {@link MigrationModelElement} is a convenience class, storing an ecore
 * element (EObject) as well as the uri of that element and the fully qualified
 * names as used by Xtext.
 * 
 * @author Martin Fleck
 *
 */
public class MigrationModelElement<T extends EObject> {
	
	private T element;
	private String uri;
	private String qualifiedName;

	/**
	 * Creates a new migration model element with the given element. The
	 * fully qualified name (FQN) and the element uri will be evaluated
	 * if needed.
	 * 
	 * @param element
	 */
	public MigrationModelElement(T element) {
		this.element = element;
	}
	
	/**
	 * Stored ecore element.
	 * @return ecore element
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * Fully qualified name (FQN) of the stored ecore element
	 * @return fqn
	 */
	public String getFullyQualifiedName() {
		if(qualifiedName == null) 
			qualifiedName = MigrationResourceUtil.getFullyQualifiedName(getElement());
		return qualifiedName;
	}
	
	/**
	 * Uri of the stored ecore element
	 * @return uri
	 */
	public String getUri() {
		if(uri == null && element != null && element.eResource() != null)
			uri = element.eResource().getURI() + element.eResource().getURIFragment(element);
		return uri;
	}
	
	@Override
	public String toString() {
		String result = "FQN: " + getFullyQualifiedName() + "\n";
		result += "URI: " + getUri() + "\n";
		result += "Element: " + getElement() + "\n";
		return result;
	}
}
