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

package eu.artist.migration.mmc.structures;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="UmlElement")
public class UmlElement {
	private String name;
	private String type;
    private ArrayList<UmlElement> childs = new ArrayList<UmlElement>();
	
	
	   @XmlElement(name="name")
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	   @XmlElement(name="type")
	    public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		@XmlElement(name="childs")
		public ArrayList<UmlElement> getChilds() {
			return childs;
		}
		public void setChilds(ArrayList<UmlElement> childs) {
			this.childs = childs;
		}
		
	    public void addChilds(UmlElement l) {
	        this.childs.add(l);
	    }


}
