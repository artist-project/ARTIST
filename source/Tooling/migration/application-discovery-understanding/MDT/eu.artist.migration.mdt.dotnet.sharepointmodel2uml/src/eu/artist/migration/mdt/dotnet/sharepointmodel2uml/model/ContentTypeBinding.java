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

public class ContentTypeBinding {
	
	protected String contentTypeId;
    protected String listUrl;
    
    public String getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(String value) {
        this.contentTypeId = value;
    }

    public String getListUrl() {
        return listUrl;
    }

    public void setListUrl(String value) {
        this.listUrl = value;
    }
}
