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
package eu.artist.migration.mdt.dotnet.dbml2uml.client;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import eu.artist.migration.mdt.dotnet.dbml2uml.model.Association;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.Cardinality;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.Column;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.Database;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.Table;
import eu.artist.migration.mdt.dotnet.dbml2uml.model.Type;


public class ModelBuilder {
	
	private UMLBuilder builder = new UMLBuilder();
	private DbmlParser parser = new DbmlParser();
	
	private Profile dbmlProfile;
	
    private HashMap<String, org.eclipse.uml2.uml.Type> primitiveTypes = new HashMap<String, org.eclipse.uml2.uml.Type>();
    private HashMap<String, org.eclipse.uml2.uml.Classifier> classMap = new HashMap<String, org.eclipse.uml2.uml.Classifier>();
	
	public ModelBuilder() {
		UMLResourcesUtil.init(builder.RESOURCE_SET);
		
		builder.registerResourceFactories();
		String current = System.getProperty("user.dir");
		builder.registerPathmaps(URI.createURI("jar:file:" + current + "\\lib\\org.eclipse.uml2.uml.resources_4.1.0.v20140202-2055.jar!/"));
		
		URI profileUri = URI.createFileURI("model.profile.uml");
		dbmlProfile = builder.importProfile(profileUri);
	}
	
	public void build(String dbmlFileName, String umlFileName) {
		primitiveTypes.clear();
		classMap.clear();
		
		Database db = parser.parse(dbmlFileName);
		
		Model uml2Root = builder.createModel("DBML_Model");
		builder.importPrimitiveType(uml2Root, "String");
		builder.importPrimitiveType(uml2Root, "Boolean");
		
		builder.applyProfile(uml2Root, dbmlProfile);
		
		generateTables(uml2Root, db);
		
		builder.save(uml2Root, URI.createFileURI(umlFileName));
	}
	
	private void generateTables(Model model, Database db) {
		System.out.println("Generating tables...");
		
		for(Table table : db.getTable()) {
			Type type = table.getType();
			
			org.eclipse.uml2.uml.Class tableClass = null;
			
			if(classMap.containsKey(type.getName())) {
				tableClass = (org.eclipse.uml2.uml.Class) classMap.get(type.getName());
			}
			else {
				tableClass = builder.createClass(model, type.getName(), false);
				classMap.put(type.getName(), tableClass);
			}
			
			Stereotype tableStereotype = dbmlProfile.getOwnedStereotype("DBTable");	
			builder.applyStereotype(tableClass, tableStereotype);
			
			builder.setStereotypePropertyValue(tableClass, tableStereotype, tableStereotype.getOwnedAttribute("FullName", model.getOwnedType("String")), table.getName());
			builder.setStereotypePropertyValue(tableClass, tableStereotype, tableStereotype.getOwnedAttribute("Member", model.getOwnedType("String")), table.getMember());
			
			List<Object> columnsOrAssociations = type.getColumnOrAssociation();
			
			for(Object o : columnsOrAssociations) {
				if(o instanceof Column) {
					Column c = (Column)o;
					
					int lowerBound = 1;
					int upperBound = 1;
					
					Boolean isCanBeNull = (c.isCanBeNull() == null) ? false : c.isCanBeNull();
					if(isCanBeNull) {
						lowerBound = 0;
					}
					
					org.eclipse.uml2.uml.Property property = builder.createAttribute(tableClass, c.getName(), this.getPrimitiveType(model, c.getType()), lowerBound, upperBound);
					
					Boolean isPrimaryKey = (c.isIsPrimaryKey() == null) ? false : c.isIsPrimaryKey();
					if(isPrimaryKey) {
						property.setIsID(isPrimaryKey);
					}
					
					Stereotype columnStereotype = dbmlProfile.getOwnedStereotype("DBColumn");	
					builder.applyStereotype(property, columnStereotype);
					
					builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("DbType", model.getOwnedType("String")), c.getDbType());
					builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("CanBeNull", model.getOwnedType("Boolean")), isCanBeNull);
					builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("IsPrimaryKey", model.getOwnedType("Boolean")), isPrimaryKey);
				}
				else if(o instanceof Association) {
					Association a = (Association)o;
					
					org.eclipse.uml2.uml.Class typeClass = null;
					if(classMap.containsKey(a.getType())) {
						typeClass = (org.eclipse.uml2.uml.Class) classMap.get(a.getType());
					}
					else {
						typeClass = builder.createClass(model, a.getType(), false);
						classMap.put(a.getType(), typeClass);
					}
					
					org.eclipse.uml2.uml.Property property = builder.createAttribute(tableClass, a.getName(), typeClass, 1, 1);
					
					Stereotype associationStereotype = dbmlProfile.getOwnedStereotype("DBAssociation");	
					builder.applyStereotype(property, associationStereotype);
					
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("Member", model.getOwnedType("String")), a.getMember());
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("ThisKey", model.getOwnedType("String")), a.getThisKey());
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("OtherKey", model.getOwnedType("String")), a.getOtherKey());
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("IsForeignKey", model.getOwnedType("Boolean")), a.isIsForeignKey());
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("Cardinality", model.getOwnedType("String")), a.getCardinality());
					builder.setStereotypePropertyValue(property, associationStereotype, associationStereotype.getOwnedAttribute("MemberType", model.getOwnedType("String")), typeClass.getName());
				}
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
