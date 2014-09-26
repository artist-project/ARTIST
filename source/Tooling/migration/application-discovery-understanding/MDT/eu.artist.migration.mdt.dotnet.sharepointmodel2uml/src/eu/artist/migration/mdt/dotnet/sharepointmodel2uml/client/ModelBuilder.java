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

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ContentType;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ContentTypeBinding;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.Field;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.FieldRef;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.ListInstance;
import eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model.RemoveFieldRef;

public class ModelBuilder {
	
	private UMLBuilder builder = new UMLBuilder();
	
	private Boolean applyProfile;
	private Profile spProfile;
	
    private HashMap<String, org.eclipse.uml2.uml.Type> primitiveTypes = new HashMap<String, org.eclipse.uml2.uml.Type>();
    //private HashMap<String, org.eclipse.uml2.uml.Classifier> classMap = new HashMap<String, org.eclipse.uml2.uml.Classifier>();
	
	public ModelBuilder() {
		UMLResourcesUtil.init(builder.RESOURCE_SET);
		
		builder.registerResourceFactories();
		String current = System.getProperty("user.dir");
		builder.registerPathmaps(URI.createURI("jar:file:" + current + "\\lib\\org.eclipse.uml2.uml.resources_4.1.0.v20140202-2055.jar!/"));
		
		URI profileUri = URI.createFileURI("model.profile.uml");
		spProfile = builder.importProfile(profileUri);
		
	}
	
	public void build(HashMap<String, Object> elements, String umlFileName) {
		build(elements, umlFileName, true);
	}
	
	public void build(HashMap<String, Object> elements, String umlFileName, Boolean withProfile) {
		primitiveTypes.clear();
		//classMap.clear();
		
		Model uml2Root = builder.createModel("SP_Model");
		builder.importPrimitiveType(uml2Root, "String");
		builder.importPrimitiveType(uml2Root, "Boolean");
		
		applyProfile = withProfile;
		if(applyProfile) {
			builder.applyProfile(uml2Root, spProfile);
		}
		
		generateTables(uml2Root, elements);
		
		
		builder.save(uml2Root, URI.createFileURI(umlFileName));
	}
	
	private void generateTables(Model model, HashMap<String, Object> elements) {
		for(Object o : elements.values()) {
			if(o instanceof ListInstance) {
				ListInstance li = (ListInstance)o;
				processListInstance(model, li, elements);
			}
		}
	}
	
	private void processListInstance(Model model, ListInstance li, HashMap<String, Object> elements) {
		StringBuffer sb = new StringBuffer();
		sb.append("Building ListInstance '");
		sb.append(li.getFeatureId());
		sb.append("' [");
		sb.append(li.getTitle());
		sb.append("].");
		System.out.println(sb.toString());
		
		
		org.eclipse.uml2.uml.Class tableClass = builder.createClass(model, Util.getQualifiedName(li.getTitle()), false);
		if(applyProfile) {
			Stereotype tableStereotype = spProfile.getOwnedStereotype("SPTable");	
			builder.applyStereotype(tableClass, tableStereotype);
			
			builder.setStereotypePropertyValue(tableClass, tableStereotype, tableStereotype.getOwnedAttribute("Title", model.getOwnedType("String")), li.getTitle());
		}
		//classMap.put(Util.getQualifiedName(li.getTitle()), tableClass);
		
		ContentTypeBinding binding = (ContentTypeBinding)elements.get(li.getUrl());
		ContentType contentType = (ContentType)elements.get(binding.getContentTypeId());
		
		List<String> fields = new ArrayList<String>();
		indexFields(elements, contentType, fields);
		
		for(String s : fields) {
			Field f = (Field)elements.get(s);
			
			String fieldType = f.getType();
			org.eclipse.uml2.uml.Property property;
			if(fieldType.compareTo("Choice")==0) {
				String enumType = processEnumeration(model, f);
				property = builder.createAttribute(tableClass, f.getName(), model.getOwnedType(enumType), 1, 1);
			}
			else {
				property = builder.createAttribute(tableClass, f.getName(), this.getPrimitiveType(model, f.getType()), 1, 1);
			}
			
			if(applyProfile) {
				Stereotype columnStereotype = spProfile.getOwnedStereotype("SPField");	
				builder.applyStereotype(property, columnStereotype);
				
				builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("DisplayName", model.getOwnedType("String")), f.getDisplayName());
				builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("Required", model.getOwnedType("Boolean")), f.getRequired());
			}
		}
	}
	
	private String processEnumeration(Model model, Field field) {
		String enumerationName = Util.getQualifiedName(field.getName()) + "Enum";
		
		org.eclipse.uml2.uml.Enumeration entityEnumeration = builder.createEnumeration(model, enumerationName);
		List<String> literals = field.getChoices();
		for(int count=0; count < literals.size(); count++) {
			builder.createEnumerationLiteral(entityEnumeration, literals.get(count));
		}
		
		return enumerationName;
	}
	
	private void indexFields(HashMap<String, Object> elements, ContentType contentType, List<String> fields) {
		String parentId = Util.findParentType(contentType.getId());
		
		if(parentId.length() > 0) {
			ContentType parent = (ContentType)elements.get(parentId);
			indexFields(elements, parent, fields);
		}
		
		List<Object> fieldRefs = contentType.getFieldRef();
		for(Object o : fieldRefs) {
			if(o instanceof RemoveFieldRef) {
				RemoveFieldRef fr = (RemoveFieldRef)o;
				fields.remove(fr.getId());
			}
			else if (o instanceof FieldRef) {
				FieldRef fr = (FieldRef)o;
				fields.add(fr.getId());
			}
			else {
				
			}
		}
	}
	
	private org.eclipse.uml2.uml.Type getPrimitiveType(Model model, String name) 
    {
		org.eclipse.uml2.uml.Type type;
        
        if(primitiveTypes.containsKey(name) == false)
        {
            type = model.createOwnedPrimitiveType(name);
            primitiveTypes.put(name, type);
        }
        else
        {
            type = model.getOwnedType(name);
        }
        
        return type;
    }
}
