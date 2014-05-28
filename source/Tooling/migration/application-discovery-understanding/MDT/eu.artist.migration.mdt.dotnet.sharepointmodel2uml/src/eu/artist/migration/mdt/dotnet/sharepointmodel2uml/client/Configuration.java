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