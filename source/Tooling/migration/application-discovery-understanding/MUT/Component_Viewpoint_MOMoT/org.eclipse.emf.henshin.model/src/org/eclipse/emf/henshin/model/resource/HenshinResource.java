/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.model.resource;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 * Resource implementation for Henshin resources.
 * @author Christian Krause
 */
public class HenshinResource extends XMIResourceImpl {
	
	/**
	 * File extension for Henshin files.
	 */
	public static final String FILE_EXTENSION = "henshin";

	/**
	 * Default constructor.
	 */
	public HenshinResource() {
		super();
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object,Object>());
		getDefaultSaveOptions().put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}
	
	/**
	 * Constructor.
	 * @param uri URI of a Henshin resource.
	 */
	public HenshinResource(URI uri) {
		super(uri);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	@Override
	protected boolean useUUIDs() {
		return true;
	}
	
}
