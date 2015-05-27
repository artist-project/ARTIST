/*******************************************************************************
 * Copyright (c) 2015 ICCS/NTUA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Aliki Kopaneli
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu    
 *     
 *******************************************************************************/ 

package eu.artist.migration.cloudselection.viewdatamodel;

import java.util.ArrayList;
import java.util.List;

public class HelperElement extends ModelElement{

	protected List<ModelElement> children;
	
	public HelperElement(){
		this.name = "";
		this.children = new ArrayList<ModelElement>();
	}
	
	public HelperElement(String name){
		this.name = name;
		this.children = new ArrayList<ModelElement>();
	}

	public void addChild (ModelElement child){
		child.setParent(this);
		children.add(child);
	}
	
	public void removeChild (ModelElement child){
		int found = children.indexOf(child);
		if (found>-1){
			children.remove(found);
		}
	}
	
	public List<ModelElement> getChildren (){
		return children;
	}
}
