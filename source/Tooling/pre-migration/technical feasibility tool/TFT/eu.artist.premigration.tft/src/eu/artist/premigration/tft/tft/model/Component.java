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
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import eu.artist.premigration.tft.tft.model.migrationstrategy.Category;
import eu.artist.premigration.tft.tft.model.migrationstrategy.Complexity;
import eu.artist.premigration.tft.tft.model.migrationstrategy.MigrationStrategy;

/**
 * Java model for TFT Components
 * @author Burak Karaboga
 *
 */
public class Component {
	
	private String id;
	private boolean selection;
	private boolean applicationLevelComponent;
	private String name;
	private List<String> ownedClasses;
	private List<String> ownedClassesWithFQN;
	private List<Component> clientOf;
	private List<Component> supplierFor;
	private List<String> stereotypes;
	private BigDecimal absoluteEffort = new BigDecimal("0");
	
	private Component parent;
	private List<Component> children;

	private List<MigrationStrategy> migrationStrategies;
	
	private float complexity;
	
	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	
	public Component() {
	}
	
	public Component (String id, boolean selection, boolean applicationLevelComponent, String name, List<String> ownedClasses, List<String> ownedClassesWithFQN, List<MigrationStrategy> migrationStrategies, List<String> stereotypes) {
		this.id = id;
		this.selection = selection;
		this.applicationLevelComponent = applicationLevelComponent;
		this.name = name;
		this.ownedClasses = ownedClasses;
		this.ownedClassesWithFQN = ownedClassesWithFQN;
		this.stereotypes = stereotypes;
		this.migrationStrategies = migrationStrategies;
		this.absoluteEffort = new BigDecimal("0");
	}
	
	public String getId() {
		return id;
	}
	
	public boolean isApplicationLevelComponent() {
		return applicationLevelComponent;
	}

	public void setApplicationLevelComponent(boolean applicationLevelComponent) {
		this.applicationLevelComponent = applicationLevelComponent;
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

	public List<String> getOwnedClasses() {
		return ownedClasses;
	}

	public void setOwnedClasses(List<String> ownedClasses) {
		propertyChangeSupport.firePropertyChange("ownedClasses", this.ownedClasses, this.ownedClasses = ownedClasses);
	}
	
	public List<String> getOwnedClassesWithFQN() {
		return ownedClassesWithFQN;
	}

	public void setOwnedClassesWithFQN(List<String> ownedClassesWithFQN) {
		propertyChangeSupport.firePropertyChange("ownedClassesWithFQN", this.ownedClassesWithFQN, this.ownedClasses = ownedClassesWithFQN);
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

	public float getComplexity() {
		return complexity;
	}

	public void setComplexity(float complexity) {
		this.complexity = complexity;
	}
	
	public Complexity getAverageMigrationStrategyComplexity(){
		int totalDegree = 0;
		int averageDegree = 0;
		for (MigrationStrategy strategy : migrationStrategies){

			totalDegree += strategy.getComplexity().getDegree();
		}

		if (migrationStrategies.size() == 0) {
			averageDegree = 0;
		}
		else {
			averageDegree = totalDegree/migrationStrategies.size();
		}
		return Complexity.getComplexityByDegree(averageDegree);
	}

	public BigDecimal getAbsoluteEffort() {
		return absoluteEffort;
	}

	public void setAbsoluteEffort(BigDecimal absoluteEffort) {
		this.absoluteEffort = absoluteEffort;
	}
}
