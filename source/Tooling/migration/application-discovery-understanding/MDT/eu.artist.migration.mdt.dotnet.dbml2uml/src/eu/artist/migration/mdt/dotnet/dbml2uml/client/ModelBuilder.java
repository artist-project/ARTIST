/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
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
	
	private Boolean applyProfile;
	private Profile dbmlProfile;
	
    private HashMap<String, org.eclipse.uml2.uml.Type> primitiveTypes = new HashMap<String, org.eclipse.uml2.uml.Type>();
    private HashMap<String, org.eclipse.uml2.uml.Classifier> classMap = new HashMap<String, org.eclipse.uml2.uml.Classifier>();
	
	public ModelBuilder() {
		UMLResourcesUtil.init(builder.RESOURCE_SET);
		
		builder.registerResourceFactories();
		String current = System.getProperty("user.dir");
		builder.registerPathmaps(URI.createURI("jar:file:" + current + "\\lib\\org.eclipse.uml2.uml.resources_4.1.0.v20140202-2055.jar!/"));
		
		URI profileUri = URI.createFileURI(current + "\\res\\model.profile.uml");
		dbmlProfile = builder.importProfile(profileUri);
		
	}
	
	public void build(String dbmlFileName, String umlFileName) {
		build(dbmlFileName, umlFileName, true);
	}
	
	public void build(String dbmlFileName, String umlFileName, Boolean withProfile) {
		primitiveTypes.clear();
		classMap.clear();
		
		Database db = parser.parse(dbmlFileName);
		
		Model uml2Root = builder.createModel("DBML_Model");
		builder.importPrimitiveType(uml2Root, "String");
		builder.importPrimitiveType(uml2Root, "Boolean");
		
		applyProfile = withProfile;
		if(applyProfile) {
			builder.applyProfile(uml2Root, dbmlProfile);
		}
		
		generateTables(uml2Root, db);
		resolveAssociations(uml2Root, db);
		
		builder.save(uml2Root, URI.createFileURI(umlFileName));
	}
	
	private void generateTables(Model model, Database db) {
		System.out.println("Generating tables...");
		
		List<Table> tables = db.getTable();
		
		for(Table table : tables) {
			Type type = table.getType();
			
			org.eclipse.uml2.uml.Class tableClass = builder.createClass(model, type.getName(), false);
			if(applyProfile) {
				Stereotype tableStereotype = dbmlProfile.getOwnedStereotype("DBTable");	
				builder.applyStereotype(tableClass, tableStereotype);
			}
			classMap.put(type.getName(), tableClass);
			
			List<Object> columnsOrAssociations = type.getColumnOrAssociation();
			
			for(Object o : columnsOrAssociations) {
				if(o instanceof Column) {
					Column c = (Column)o;
					
					int lowerBound = 1;
					int upperBound = 1;
					
					if(c.isCanBeNull() != null && c.isCanBeNull()) {
						lowerBound = 0;
					}
					
					Boolean isPrimaryKey = (c.isIsPrimaryKey() == null) ? false : c.isIsPrimaryKey();
					
					org.eclipse.uml2.uml.Property property = builder.createAttribute(tableClass, c.getName(), this.getPrimitiveType(model, c.getType()), lowerBound, upperBound);
					
					if(isPrimaryKey) {
						property.setIsID(isPrimaryKey);
					}
					
					if(applyProfile) {
						Stereotype columnStereotype = dbmlProfile.getOwnedStereotype("DBColumn");	
						builder.applyStereotype(property, columnStereotype);
						
						builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("DbType", model.getOwnedType("String")), c.getDbType());
						builder.setStereotypePropertyValue(property, columnStereotype, columnStereotype.getOwnedAttribute("IsPrimaryKey", model.getOwnedType("Boolean")), isPrimaryKey);
					}
				}
			}
		}
	}
	
	private void resolveAssociations(Model model, Database db) {
		System.out.println("Resolving associations...");
		
		List<Table> tables = db.getTable();
		
		for(Table table : tables) {
			Type type = table.getType();
			
			List<Object> columnsOrAssociations = type.getColumnOrAssociation();
			
			for(Object o : columnsOrAssociations) {
				if(o instanceof Association) {
					Association a = (Association)o;
					
					Boolean isToBeProcessed = (a.isIsForeignKey() == null) ? true : !a.isIsForeignKey(); 
					if(isToBeProcessed) {
						Classifier s = classMap.get(type.getName());
						Classifier t = classMap.get(a.getType());
						
						int cardinality = LiteralUnlimitedNatural.UNLIMITED;
						if(a.getCardinality() != null) {
							if(a.getCardinality().compareTo(Cardinality.ONE) == 0) cardinality = 1;
						}
						
						org.eclipse.uml2.uml.Association association = builder.createAssociation(s, true, AggregationKind.NONE_LITERAL, a.getThisKey(), 0, cardinality, t, false, AggregationKind.NONE_LITERAL, a.getOtherKey(), 1, 1);
						association.setName(a.getName());
					}
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
