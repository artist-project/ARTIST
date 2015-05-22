/*******************************************************************************
 * Copyright (c) 2015 ICCS/NTUA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Aliki Kopaneli
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/ 

package eu.artist.migration.cloudselection.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public class Utils {
	
	public static String pathToModelFile;
	
	public static Image createImage (String path){
		Bundle bundle = Platform.getBundle("eu.artist.migration.cloudselection");
		

		URL fileURL = bundle.getEntry("icons/" + path);
		File file = null;
		try {
		URL resolvedFileURL = FileLocator.toFileURL(fileURL);

			// We need to use the 3-arg constructor of URI in order to properly escape file system chars
			URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);
			file = new File(resolvedURI);
		
		//File file = new File("/home/aliki/eclipse_workspaces/workspace_kepler_2/eu.artist.migration.cloudselection/icons/" + path);
		    return new Image(null, new FileInputStream(file));
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		    return null;
		} catch (IOException e1) {
		    e1.printStackTrace();
		    return null;
		}
	}
	
	public static List<String> findSupportedProviders(){
		List<String> list = new ArrayList<String>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.papyrus.uml.extensionpoints.UMLProfile");
		for (int i=0; i<point.getExtensions().length; i++){
			IConfigurationElement ce = point.getExtensions()[i].getConfigurationElements()[0];
			if (ce.getAttribute("description").endsWith("cloud environment") 
					&& ce.getAttribute("provider").equals("ARTIST Project")){
					list.add(ce.getAttribute("name"));		
			}
		}
		return list;
	}

}
