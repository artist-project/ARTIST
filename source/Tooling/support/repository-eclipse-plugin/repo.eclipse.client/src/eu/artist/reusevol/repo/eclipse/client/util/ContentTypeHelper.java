/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.util;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;

public class ContentTypeHelper {
	// See https://eclipse.googlesource.com/uml2/org.eclipse.uml2/+/R3_2_maintenance/plugins/org.eclipse.uml2.uml/plugin.xml
	public static IContentType TEXT = Platform.getContentTypeManager().getContentType("org.eclipse.core.runtime.text");
	public static IContentType XML = Platform.getContentTypeManager().getContentType("org.eclipse.core.runtime.xml");
	public static IContentType XMI = Platform.getContentTypeManager().getContentType("org.eclipse.emf.ecore.xmi");
	public static IContentType UML2 = Platform.getContentTypeManager().getContentType("org.eclipse.uml2.uml");
	public static IContentType UML_OMG = Platform.getContentTypeManager().getContentType("org.omg.uml");
	public static IContentType MOF_CMOF = Platform.getContentTypeManager().getContentType("org.omg.mof.cmof");
	
	// See https://github.com/eclipse/atl/blob/master/plugins/org.eclipse.m2m.atl.emftvm.compiler/plugin.xml
	public static IContentType ATL = Platform.getContentTypeManager().getContentType("org.eclipse.m2m.atl");
	
	public static String mimeTypeFromContentType(IContentType contentType) {
		if (contentType.isKindOf(UML2)) {
			return "application/uml2+xml";
		} else if (contentType.isKindOf(UML_OMG)) {
			return "application/uml+xml";
		} else if (contentType.isKindOf(MOF_CMOF)) {
			return "application/mof+xml";
		} else if (contentType.isKindOf(XMI)) {
			return "application/xmi+xml";
		} else if (contentType.isKindOf(XML)) {
			return "application/xml";
		} else if (contentType.isKindOf(TEXT)) {
			return "text/plain";
		} else {
			return "text/plain"; 
		}
	}
}
