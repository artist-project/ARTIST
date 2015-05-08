/*
* Copyright (c) 2014 Tecnalia.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*
*Zurik Corera (Tecnalia)-SCC component implementation
*
*
*
*
*Initially developed in the context of ARTIST EU project www.artist-project.eu
*/ 

package eu.artist.premigration.tft.scc.structures;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SearchResult")
public class SearchResult {
	
    private String fileName = "";
    private ArrayList<Integer> lines = new ArrayList<Integer>();

    @XmlElement(name="fileName")
    public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@XmlElement(name="lines")
	public ArrayList<Integer> getLines() {
		return lines;
	}
	public void setLines(ArrayList<Integer> lines) {
		this.lines = lines;
	}
	
    public void addLinea(Integer l) {
        this.lines.add(l);
    }
	
	

}
