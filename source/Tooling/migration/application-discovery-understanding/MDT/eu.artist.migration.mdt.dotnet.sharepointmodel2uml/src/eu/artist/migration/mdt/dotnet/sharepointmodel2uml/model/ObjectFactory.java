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

public class ObjectFactory {

    public ObjectFactory() {
    }

    public ContentType createContentType() {
        return new ContentType();
    }

    public ContentTypeBinding createContentTypeBinding() {
        return new ContentTypeBinding();
    }
  
    public Field createField() {
        return new Field();
    }

    public FieldRef createFieldRef() {
        return new FieldRef();
    }

    public ListInstance createListInstance() {
        return new ListInstance();
    }
}
