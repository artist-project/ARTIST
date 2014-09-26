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

public class ListInstance {
	
	protected String id;
	protected String featureId;
    protected String title;
    protected String url;
    
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }
    
    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String value) {
        this.featureId = value;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }
}
