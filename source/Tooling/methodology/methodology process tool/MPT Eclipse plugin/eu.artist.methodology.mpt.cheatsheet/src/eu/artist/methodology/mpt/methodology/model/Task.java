/*******************************************************************************
 * Copyright (c) 2014 Atos.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Burak Karaboga (Atos) - initial API and implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.methodology.mpt.methodology.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task {
	
	private TaskID id;
	private String name;
	private String description;
	private Task predecessor;
	private Task successor;
	private Set<Activity> activities = new LinkedHashSet<Activity>();
	
	public Task (TaskID id){
		this.id = id;
	}
	
	public TaskID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public Task setName(String name) {
		this.name = name;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Task setDescription(String description) {
		this.description = description;
		return this;
	}
	public Task getPredecessor() {
		return predecessor;
	}
	public Task setPredecessor(Task predecessor) {
		this.predecessor = predecessor;
		return this;
	}
	public Task getSuccessor() {
		return successor;
	}
	public Task setSuccessor(Task successor) {
		this.successor = successor;
		return this;
	}
	public Set<Activity> getActivities() {
		return activities;
	}
	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	
	@Override
	public boolean equals (Object o){
		return this.id == ((Task) o).id;
	}
	
}
