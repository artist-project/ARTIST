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
package eu.artist.postmigration.nfrvt.lang.esl;

import eu.artist.postmigration.nfrvt.lang.util.mwe.scoping.ARTISTImportUriGlobalScopeProvider;

public class ESLImportUriGlobalScopeProvider extends ARTISTImportUriGlobalScopeProvider {

	public ESLImportUriGlobalScopeProvider() {
		addAdditionalUri(ECORE_PRIMITIVE_TYPES);
		addAdditionalUri(UML_PRIMITIVE_TYPES);
		addAdditionalUri(XML_PRIMITIVE_TYPES);
		addAdditionalUri(JAVA_PRIMITIVE_TYPES);
		addAdditionalUri(MARTE_LIBRARY);
	}
}
