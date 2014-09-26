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
