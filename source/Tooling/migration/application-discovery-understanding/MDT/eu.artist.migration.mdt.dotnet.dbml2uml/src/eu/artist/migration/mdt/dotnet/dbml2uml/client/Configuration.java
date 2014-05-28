package eu.artist.migration.mdt.dotnet.dbml2uml.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Configuration {
 
	String input;
	String output;
	
	public String getInput() {
		return input;
	}
 
	@XmlElement
	public void setInput(String newInput) {
		this.input = newInput;
	}
	
	public String getOutput() {
		return output;
	}
 
	@XmlElement
	public void setOutput(String newOutput) {
		this.output = newOutput;
	}
 }
