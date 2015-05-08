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
package eu.artist.postmigration.nfrvt.resources.constants;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import com.google.common.base.CaseFormat;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

public abstract class AbstractPropertyCatalogue extends AbstractResourceConstant {
	
	public static URI CATALOGUE_URI;
	
	public final MigrationModelElement<PropertyCatalogue> CATALOGUE;
	
	protected PropertyCatalogue catalogue;
	protected Map<String, Property> nameToProperty = new HashMap<>();
	
	public AbstractPropertyCatalogue(String uriString) {
		CATALOGUE_URI = URI.createURI(uriString);
		this.catalogue = resourceSet.loadPropertyCatalogue(CATALOGUE_URI);
		CATALOGUE = new MigrationModelElement<PropertyCatalogue>(catalogue);
		collectProperties();
	}
	
	protected void generateConstantCode() {		
		// element constants
		System.out.println("public interface Element {");
		for(Property property : getCatalogue().getProperties()) {
			System.out.println("final "+property.eClass().getName()+" "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+" = "+ this.getClass().getSimpleName() +".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+".getElement();");
		}
		System.out.println("}");
		System.out.println();
		
		// fqn constants
		System.out.println("public interface FQN {");
		for(Property property : getCatalogue().getProperties()) {
			System.out.println("final String "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+" = "+this.getClass().getSimpleName()+".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+".getFullyQualifiedName();");
		}
		System.out.println("}");
		System.out.println();
		
		// uri constants
		System.out.println("public interface Uri {");
		for(Property property : getCatalogue().getProperties()) {
			System.out.println("final String "+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+" = "+this.getClass().getSimpleName()+".getInstance()."+CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName())+".getUri();");
		}
		System.out.println("}");
		System.out.println();
		
		// singleton code
		System.out.println("private static "+this.getClass().getSimpleName()+" instance;");
		System.out.println("public static "+this.getClass().getSimpleName()+" getInstance() {");
		System.out.println("if(instance == null)");
		System.out.println("instance = new "+this.getClass().getSimpleName()+"();");
		System.out.println("return instance;");
		System.out.println("}");
		
		// migration model element fields 
		for(Property property : getCatalogue().getProperties()) {
			System.out.println("public final MigrationModelElement<"+property.eClass().getName()+"> " + CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName()) + ";");
		}
		System.out.println();
		
		// constructor initialization
		for(Property property : getCatalogue().getProperties()) {
			System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, property.getName()) + " = new MigrationModelElement<"+property.eClass().getName()+">"
					+ "(get" + property.eClass().getName() + "ByName(\"" + property.getName() + "\"));");
		}
	}
	
	protected void setProperty(String name, Property property) {
		nameToProperty.put(name, property);
	}
	
	protected PropertyCatalogue getCatalogue() {
		return catalogue;
	}
	
	public Property getPropertyByName(String name) {
		return nameToProperty.get(name);
	}
	
	public QualitativeProperty getQualitativePropertyByName(String name) {
		return ObjectUtil.asClass(nameToProperty.get(name), QualitativeProperty.class);
	}

	public QuantitativeProperty getQuantitativePropertyByName(String name) {
		return ObjectUtil.asClass(nameToProperty.get(name), QuantitativeProperty.class);
	}

	public BaseQuantitativeProperty getBaseQuantitativePropertyByName(String name) {
		return ObjectUtil.asClass(nameToProperty.get(name), BaseQuantitativeProperty.class);
	}
	
	public DerivedQuantitativeProperty getDerivedQuantitativePropertyByName(String name) {
		return ObjectUtil.asClass(nameToProperty.get(name), DerivedQuantitativeProperty.class);
	}
	
	protected void collectProperties() {
		for(Property property : getCatalogue().getProperties()) 
			setProperty(property.getName(), property);
	}
}
