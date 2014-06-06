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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


/**
 *
 * @author 106363
 */
@XmlRootElement(name="Project")
public class Project {

    private String name = "";
    private String presentationPath = "";
    private String businessPath = "";
    private ArrayList<SourceFile> sourcefiles = new ArrayList<SourceFile>();
    
@XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="presentationPath")
    public String getPresentationPath() {
        return presentationPath;
    }

    public void setPresentationPath(String presentationPath) {
        this.presentationPath = presentationPath;
    }

    @XmlElement(name="businessPath")
    public String getBusinessPath() {
        return businessPath;
    }

    public void setBusinessPath(String businessPath) {
        this.businessPath = businessPath;
    }

@XmlElement(name="sourcefile")
    public ArrayList<SourceFile> getSourceFile() {
        return sourcefiles;
    }

    public void setSourceFile(ArrayList<SourceFile> methods) {
        this.sourcefiles = methods;
    }
    
    public void addSourceFile(SourceFile l) {
        this.sourcefiles.add(l);
    }
    
    
    
}
