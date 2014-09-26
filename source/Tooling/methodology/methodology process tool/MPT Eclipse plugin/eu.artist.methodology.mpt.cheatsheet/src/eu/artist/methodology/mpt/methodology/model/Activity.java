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

public class Activity {
	
	private String id;
	private TaskID taskId;
	private String name;
	private String description;
	private Set<Activity> predecessors = new LinkedHashSet<Activity>();
	private Set<Activity> successors = new LinkedHashSet<Activity>();
	private String taxonomy; //TODO Replace by ARTIST taxonomy once available
	private Set<Object> inputs = new LinkedHashSet<Object>();
	private Set<Object> outputs = new LinkedHashSet<Object>();
	private Set<Tool> tools = new LinkedHashSet<Tool>();
	
	public Activity (String id, TaskID taskId){
		this.id = id;
		this.taskId = taskId;
	}
	
	public String getId() {
		return id;
	}
	
	public TaskID getTaskId() {
		return taskId;
	}
	
	public String getName() {
		return name;
	}
	public Activity setName(String name) {
		this.name = name;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Activity setDescription(String description) {
		this.description = description;
		return this;
	}
	public Set<Activity> getPredecessors() {
		return predecessors;
	}
	
	public Set<Activity> getSuccessors() {
		return successors;
	}
	
	public String getTaxonomy() {
		return taxonomy;
	}
	public Activity setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
		return this;
	}
	public Set<Object> getInputs() {
		return inputs;
	}
	
	public Set<Object> getOutputs() {
		return outputs;
	}
	
	public Set<Tool> getTools() {
		return tools;
	}
	
	public Activity addInput (Object input){
		this.getInputs().add (input);
		return this;
	}
	
	public Activity addOutput (Object output){
		this.getOutputs().add (output);
		return this;
	}
	
	public Activity addTool (Tool tool){
		this.getTools().add (tool);
		return this;
	}
	
	public Activity addPredecessor (Activity predecessor){
		this.getPredecessors().add (predecessor);
		return this;
	}
	
	public Activity addSuccessor (Activity successor){
		this.getSuccessors().add (successor);
		return this;
	}
	
	@Override
	public boolean equals (Object o){
		return (this.id == ((Activity) o).id) &&
			   (this.taskId == ((Activity) o).taskId);
	}
}
