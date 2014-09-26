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

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Configuration {
 
	List<String> resources;
	List<String> types;
	List<String> instances;
	String output;
	
	public List<String> getResources() {
	    return resources;
	}

	@XmlElement(name="resource")
	public void setResources(List<String> newResources) {
	    this.resources = newResources;
	}
	
	public List<String> getTypes() {
	    return types;
	}

	@XmlElement(name="type")
	public void setTypes(List<String> newTypes) {
	    this.types = newTypes;
	}
	
	public List<String> getInstances() {
	    return instances;
	}

	@XmlElement(name="instance")
	public void setInstances(List<String> newInstances) {
	    this.instances = newInstances;
	}
	
	public String getOutput() {
		return output;
	}
 
	@XmlElement
	public void setOutput(String newOutput) {
		this.output = newOutput;
	}
 }