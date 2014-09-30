/*******************************************************************************
 * Copyright (c) 2013 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Java model for the components loaded from TFT reports 
 *
 */
public class Component {

	private String name;
	private List<String> migrationStrategies;
	private String complexity;
	private int migrationEffort;
	
	public Component() {
		migrationStrategies = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String componentName) {
		this.name = componentName;
	}
	public List<String> getMigrationStrategies() {
		return migrationStrategies;
	}
	public void setMigrationStrategies(List<String> migrationStrategies) {
		this.migrationStrategies = migrationStrategies;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public int getMigrationEffort() {
		return migrationEffort;
	}
	public void setMigrationEffort(int migrationEffort) {
		this.migrationEffort = migrationEffort;
	}
}
