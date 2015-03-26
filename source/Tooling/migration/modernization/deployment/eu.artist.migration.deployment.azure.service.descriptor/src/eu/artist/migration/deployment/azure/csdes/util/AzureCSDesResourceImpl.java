/**
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Alexander Bergmayr - initial API and implementation
 */
package eu.artist.migration.deployment.azure.csdes.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import eu.artist.migration.deployment.azure.csdes.Project;
import eu.artist.migration.deployment.azure.csdes.PropertyGroup;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated not
 */
public class AzureCSDesResourceImpl extends XMLResourceImpl {

	/**
	 * @param uri
	 */
	public AzureCSDesResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// set the encoding
		this.setEncoding("utf-8");
		
		// we want to serialize the Attributes of PropertyGroup as Elements
		Project project = (Project) this.getContents().get(0);
		PropertyGroup propertyGroup = project.getPropertyGroup();
		XMLMapImpl map = new XMLMapImpl();
		
		for(EAttribute attribute : propertyGroup.eClass().getEAllAttributes()) {
			XMLInfoImpl info = new XMLInfoImpl();
			info.setXMLRepresentation(XMLInfoImpl.ELEMENT);
			map.add(attribute, info);
		}
				
		// work around to remove the prefix in the serialized XML		
		String prefix = project.eClass().getEPackage().getNsPrefix();
		project.eClass().getEPackage().setNsPrefix("");
		
		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_XML_MAP, map);
		
		super.save(saveOptions);
		project.eClass().getEPackage().setNsPrefix(prefix);	
	}

}
