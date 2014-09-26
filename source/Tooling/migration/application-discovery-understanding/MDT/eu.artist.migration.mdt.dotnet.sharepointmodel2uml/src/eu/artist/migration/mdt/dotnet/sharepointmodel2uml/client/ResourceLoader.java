/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.client;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.common.io.Files;

public class ResourceLoader {
	
	private HashMap<String,String> resources = new HashMap<String,String>();
	
	public ResourceLoader() {
	}
	
	public void load(String fileName) {
		String prefix = Files.getNameWithoutExtension(fileName);
		File file = new File(fileName);
		
		try {
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();

			Document doc = dBuilder.parse(file);
			
			if (doc.hasChildNodes()) {
				NodeList dataElements = doc.getDocumentElement().getElementsByTagName("data");
				
				for (int count = 0; count < dataElements.getLength(); count++) {

					Node tempNode = dataElements.item(count);
					
					if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element dataElement = (Element) tempNode;
						
						String name = dataElement.getAttribute("name");
						String value = dataElement.getElementsByTagName("value").item(0).getTextContent();
						resources.put(prefix + "," + name, value);
						
						StringBuffer sb = new StringBuffer();
						sb.append("Resource '");
						sb.append(prefix + "," + name);
						sb.append("'");
						sb.append(" [");
						sb.append(value);
						sb.append("]");
						sb.append(" added.");
						System.out.println(sb.toString());
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public void load(ArrayList<String> fileNames) {
		for (String fileName : fileNames) {
			load(fileName);
		}
	}
	
	public String getResource(String name) {
		if(name.startsWith("$Resources")) {
			if(name.endsWith(";")) {
				String id = name.substring(11, name.length()-1);
				return resources.get(id);
			}
			else {
				String id = "core," + name.substring(11, name.length());
				return resources.get(id);
			}
		}
		return resources.get(name);
	}
}
