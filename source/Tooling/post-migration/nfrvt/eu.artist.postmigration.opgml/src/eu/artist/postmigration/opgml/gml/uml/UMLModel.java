/*******************************************************************************
 * Copyright (c) 2015 Vienna University of Technology.
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
package eu.artist.postmigration.opgml.gml.uml;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class UMLModel {
	
	public static final UMLClass COMPLETE_APPLICATION = new UMLClass("*");
	public static final UMLClass NONE = new UMLClass("___");
	
	private Set<UMLClass> entityClasses = new TreeSet<>();
	private Set<UMLClass> serviceClasses = new TreeSet<>();
	private Set<UMLClass> elements = new TreeSet<>();
	
	public UMLModel() { }
	
	public UMLModel(UMLClass[] entityClasses, UMLClass[] serviceClasses) {
		this(Arrays.asList(entityClasses), Arrays.asList(serviceClasses));
	}
	
	public UMLModel(Collection<UMLClass> entityClasses, Collection<UMLClass> serviceClasses) {
		this.entityClasses.addAll(entityClasses);
		this.serviceClasses.addAll(serviceClasses);
		this.elements.addAll(entityClasses);
		this.elements.addAll(serviceClasses);
		this.elements.add(getModel());
	}
	
	public UMLClass getModel() {
		return COMPLETE_APPLICATION;
	}

	public Set<UMLClass> getEntityClasses() {
		return entityClasses;
	}
	
	public UMLClass[] getEntityClassesArray() {
		return entityClasses.toArray(new UMLClass[entityClasses.size()]);
	}
	
	public UMLModel addEntityClass(String entityClass) {
		return addEntityClass(new UMLClass(entityClass));
	}
	
	public UMLModel addEntityClass(UMLClass entityClass) {
		return addClass(entityClass, false, true);
	}

	public Set<UMLClass> getServiceClasses() {
		return serviceClasses;
	}
	
	public UMLClass[] getServiceClassesArray() {
		return serviceClasses.toArray(new UMLClass[serviceClasses.size()]);
	}
	
	public UMLModel addServiceClass(String serviceClass) {
		return addServiceClass(new UMLClass(serviceClass));
	}
	
	public UMLModel addServiceClass(UMLClass serviceClass) {
		return addClass(serviceClass, true, false);
	}
	
	public boolean isServiceClass(UMLElement element) {
		return getServiceClasses().contains(element);
	}
	
	public boolean isServiceClass(String name) {
		return getServiceClasses().contains(new UMLClass(name));
	}
	
	public UMLClass getServiceClass(String name) {
		UMLClass element = new UMLClass(name);
		if(getServiceClasses().contains(element))
			return element;
		return null;
	}
	
	public boolean isEntityClass(UMLClass element) {
		return getEntityClasses().contains(element);
	}
	
	public boolean isEntityClass(String name) {
		return getEntityClasses().contains(new UMLClass(name));
	}
	
	public UMLClass getEntityClass(String name) {
		UMLClass element = new UMLClass(name);
		if(getEntityClasses().contains(element))
			return element;
		return null;
	}
	
	public UMLModel addElement(String element) {
		return addElement(new UMLClass(element));
	}
	
	public UMLModel addElement(UMLClass element) {
		return addClass(element, false, false);
	}
	
	public Set<UMLClass> getElements() {
		return elements;
	}
	
	public UMLClass[] getElementsArray() {
		return elements.toArray(new UMLClass[elements.size()]);
	}
	
	public UMLClass getElement(String name) {
		UMLClass element = new UMLClass(name);
		if(elements.contains(element))
			return element;
		return null;
	}
	
	public UMLModel addClass(String element, boolean isServiceClass, boolean isEntityClass) {
		return addClass(new UMLClass(element), isServiceClass, isEntityClass);
	}
	
	public UMLModel addClass(UMLClass element, boolean isServiceClass, boolean isEntityClass) {
		if(isServiceClass)
			this.serviceClasses.add(element);
		if(isEntityClass)
			this.entityClasses.add(element);
		this.elements.add(element);
		return this;
	}
}
