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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ContentType;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ContentTypeBinding;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.Field;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.FieldRef;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ListInstance;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.RemoveFieldRef;

public class FeatureParser {

	private HashMap<String, Object> elementMap = new HashMap<String, Object>();
	
	private ResourceLoader resxLoader = new ResourceLoader();
	
	public FeatureParser() {
		
	}
	
	public HashMap<String, Object> getElements() {
		return elementMap;
	}
	
	public void clear() {
		elementMap.clear();
	}
	
	public void parse(List<String> fileNames) {
		for(String s : fileNames) {
			this.parse(s);
		}
	}
	
	public void parse(String fileName) {
		System.out.println("Loading [" + fileName + "] ...");
		
		try {
			DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document document = dBuilder.parse(fileName);
			loadDocument(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void loadDocument(Document document) {
		NodeList children = document.getDocumentElement().getChildNodes();
		
		for (int count = 0; count < children.getLength(); count++) {

			Node tempNode = children.item(count);
			
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element child = (Element) tempNode;
				String elementType = child.getNodeName();
				
				if(elementType.compareTo("ContentType")==0) {
					parseContentType(child);
				}
				else if (elementType.compareTo("Field")==0) {
					parseField(child);
				}
				else if (elementType.compareTo("ContentTypeBinding")==0) {
					parseContentTypeBinding(child);
				}
				else if (elementType.compareTo("ListInstance")==0) {
					parseListInstance(child);
				}
                else {
                	StringBuffer sb = new StringBuffer();
            		sb.append("Element of type '");
            		sb.append(elementType);
            		sb.append("' are not considered (yet).");
            		System.out.println(sb.toString());
                }
			}
		}
	}
	
	private ContentTypeBinding parseContentTypeBinding(Element element) {
		String contentTypeId = element.getAttribute("ContentTypeId");
		String listUrl = element.getAttribute("ListUrl");
		
		ContentTypeBinding ctb = new ContentTypeBinding();
		ctb.setContentTypeId(contentTypeId);
		ctb.setListUrl(listUrl);
	
		elementMap.put(listUrl, ctb);
		
		StringBuffer sb = new StringBuffer();
		sb.append("ContentTypeBinding '");
		sb.append(listUrl);
		sb.append("' [");
		sb.append(contentTypeId);
		sb.append("] added.");
		System.out.println(sb.toString());
		
		return ctb;
	}
	
	private ListInstance parseListInstance(Element element) {
		String featureId = element.getAttribute("FeatureId");
		String title = element.getAttribute("Title");
		String url = element.getAttribute("Url");
		
		ListInstance li = new ListInstance();
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		li.setId(id);
		li.setFeatureId(featureId);
		li.setTitle(title);
		li.setUrl(url);
	
		elementMap.put(id, li);
		
		StringBuffer sb = new StringBuffer();
		sb.append("ListInstance '");
		sb.append(id);
		sb.append("' [");
		sb.append(title);
		sb.append("] added.");
		System.out.println(sb.toString());
		
		return li;
	}
	
	private ContentType parseContentType(Element element) {
		String id = element.getAttribute("ID");
		String name = getActualName(element.getAttribute("Name"));
		
		ContentType ct = new ContentType();
		ct.setId(id);
		ct.setName(name);
		
		// Retrieve the references to the fields (add them as edges).
		Element fieldRefsElement = (Element) element.getElementsByTagName("FieldRefs").item(0);
		NodeList fieldRefs = fieldRefsElement.getElementsByTagName("*");

		for(int count = 0; count < fieldRefs.getLength(); count++) {
			Element fieldRef = (Element) fieldRefs.item(count);
			ct.getFieldRef().add(parseFieldRef(fieldRef));
		}
		
		elementMap.put(id, ct);
		
		StringBuffer sb = new StringBuffer();
		sb.append("ContentType '");
		sb.append(id);
		sb.append("' [");
		sb.append(name);
		sb.append("] added.");
		System.out.println(sb.toString());
		
		return ct;
	}
	
	private Object parseFieldRef(Element element) {
		String id = element.getAttribute("ID").toLowerCase();
		String kind = element.getNodeName();
		
		if(kind.compareTo("FieldRef")==0) {
			FieldRef fr = new FieldRef();
			fr.setId(id);
			
			StringBuffer sb = new StringBuffer();
			sb.append("\tFieldRef '");
			sb.append(id);
			sb.append("' added.");
			System.out.println(sb.toString());
			return fr;
		}
		else if(kind.compareTo("RemoveFieldRef")==0) {
			RemoveFieldRef fr = new RemoveFieldRef();
			fr.setId(id);
			
			StringBuffer sb = new StringBuffer();
			sb.append("\tRemoveFieldRef '");
			sb.append(id);
			sb.append("' added.");
			System.out.println(sb.toString());
			return fr;
		}
		else {
			return null;
		}
	}
	
	public Field parseField(Element element) {
		String id = element.getAttribute("ID").toLowerCase();
		String name = getActualName(element.getAttribute("Name"));
		String displayName = getActualName(element.getAttribute("DisplayName"));
		Boolean required = Boolean.parseBoolean(element.getAttribute("Required").toLowerCase());
		
		Field f = new Field();
		f.setId(id);
		f.setName(name);
		f.setDisplayName(displayName);
		f.setRequired(required);
		
		String type = element.getAttribute("Type");
		f.setType(type);
		
		if(type.compareTo("Choice")==0) {
			List<String> choices = parseChoices(element);
			f.getChoices().addAll(choices);
		}
		
		elementMap.put(id, f);
		
		StringBuffer sb = new StringBuffer();
		sb.append("Field '");
		sb.append(id);
		sb.append("' [");
		sb.append(name);
		sb.append("] added.");
		System.out.println(sb.toString());
		
		return f;
	}
	
	private List<String> parseChoices(Element element) {
		List<String> c = new ArrayList<String>();
		
		Element choices = (Element)element.getElementsByTagName("CHOICES").item(0);
		if(choices != null) {
			NodeList choiceList = choices.getChildNodes();
			for(int count = 0; count < choiceList.getLength(); count++) {
				Node literalNode = choiceList.item(count);
				String value = literalNode.getTextContent();
				c.add(value);
			}
		}
		
		return c;
	}
	
	public void loadResources(List<String> fileNames) {
		for(String s : fileNames) {
			this.loadResource(s);
		}
	}
	
	public void loadResource(String fileName) {
		System.out.println("Loading resource [" + fileName + "] ...");
		
		resxLoader.load(fileName);
	}
	
	private String getActualName(String id) {
		if(id.startsWith("$Resources")) {
			return resxLoader.getResource(id);
		}
		else {
			return id;
		}
	}
}
