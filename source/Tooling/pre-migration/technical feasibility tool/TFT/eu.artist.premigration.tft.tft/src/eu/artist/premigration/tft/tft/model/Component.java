/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - main development
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.premigration.tft.tft.model;

import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.List;

import eu.artist.premigration.tft.tft.model.migrationstrategy.Category;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

/**
 * Java model for TFT Components
 * @author Burak Karaboga
 *
 */
public class Component {
	
	private String id;
	private boolean selection;
	private String name;
	private String type;
	private List<String> ownedClasses;
	private List<Component> clientOf;
	private List<Component> supplierFor;
	private List<String> stereotypes;
	
	private Component parent;
	private List<Component> children;

	private List<MigrationStrategy> migrationStrategies;
	
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	public Component() {
	}
	
	public Component (String id, boolean selection, String name, String type, List<String> ownedClasses, List<MigrationStrategy> migrationStrategies, List<String> stereotypes) {
		this.id = id;
		this.selection = selection;
		this.name = name;
		this.type = type;
		this.ownedClasses = ownedClasses;
		this.stereotypes = stereotypes;
		this.migrationStrategies = migrationStrategies;
	}
	
	public Component (String id, boolean selection, String name, String type, List<String> ownedClasses, 
			List<MigrationStrategy> migrationStrategies, List<Component> clientOf, List<Component> supplierFor, List<String> stereotypes) {
		this.id = id;
		this.selection = selection;
		this.name = name;
		this.type = type;
		this.ownedClasses = ownedClasses;
		this.clientOf = clientOf;
		this.supplierFor = supplierFor;
		this.stereotypes = stereotypes;
		this.migrationStrategies = migrationStrategies;
	}
	
	public String getId() {
		return id;
	}

	public boolean isSelected() {
		return selection;
	}

	public void setSelection(boolean selection) {
		propertyChangeSupport.firePropertyChange("selection", this.selection, this.selection = selection);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		propertyChangeSupport.firePropertyChange("name", this.name, this.name = name);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		propertyChangeSupport.firePropertyChange("type", this.type, this.type = type);
	}

	public List<String> getOwnedClasses() {
		return ownedClasses;
	}

	public void setOwnedClasses(List<String> ownedClasses) {
		propertyChangeSupport.firePropertyChange("ownedClasses", this.ownedClasses, this.ownedClasses = ownedClasses);
	}
	
	public List<MigrationStrategy> getMigrationStrategies() {
		return migrationStrategies;
	}

	public void setMigrationStrategies(List<MigrationStrategy> migrationStrategies) {
		propertyChangeSupport.firePropertyChange("migrationStrategies", this.migrationStrategies, this.migrationStrategies = migrationStrategies);
	}
	
	public List<Component> getClientOf() {
		return clientOf;
	}

	public void setClientOf(List<Component> clientOf) {
		this.clientOf = clientOf;
	}

	public List<Component> getSupplierFor() {
		return supplierFor;
	}

	public void setSupplierFor(List<Component> supplierFor) {
		this.supplierFor = supplierFor;
	}
	
	public List<String> getStereotypes() {
		return stereotypes;
	}

	public void setStereotypes(List<String> stereotypes) {
		this.stereotypes = stereotypes;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public boolean hasStereotype (List<String> stereotypeList){
		
		return !Collections.disjoint(stereotypes, stereotypeList);
	}
	
	public boolean hasStereotype (String stereotype){
		
		return stereotypes.contains(stereotype);
	}
	
	public boolean hasMigrationStrategyOfCategory(Category category){
		for (MigrationStrategy strategy : this.migrationStrategies){
			if (strategy.getCategory().equals(category)){
				return true;
			}
		}
		return false;
	}
	
	public MigrationStrategy getMigrationStrategyOfCategory(Category category){
		for (MigrationStrategy strategy : this.migrationStrategies){
			if (strategy.getCategory().equals(category)){
				return strategy;
			}
		}
		return null;
	}
	
	public void addMigrationStrategy(MigrationStrategy strategy) {
		this.migrationStrategies.add(strategy);
	}
	
	public void removeMigrationStrategy(MigrationStrategy strategy) {
		this.migrationStrategies.remove(strategy);
	}	
	

	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}

	public List<Component> getChildren() {
		return children;
	}

	public void setChildren(List<Component> children) {
		this.children = children;
	}
}