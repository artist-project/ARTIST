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
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model;

import java.util.ArrayList;
import java.util.List;

public class Field {

	protected String id;
    protected String name;
    protected String type;
    protected String displayName;
    protected Boolean required;
    protected List<String> choices;
    protected List<String> mappings;
    
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }
    
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String value) {
        this.displayName = value;
    }
    
    public Boolean getRequired() {
    	return required;
    }
    
    public void setRequired(Boolean value) {
    	this.required = value;
    }
    
    public List<String> getChoices() {
        if (choices == null) {
            choices = new ArrayList<String>();
        }
        return this.choices;
    }
    
    public List<String> getMappings() {
        if (mappings == null) {
            mappings = new ArrayList<String>();
        }
        return this.mappings;
    }
}
