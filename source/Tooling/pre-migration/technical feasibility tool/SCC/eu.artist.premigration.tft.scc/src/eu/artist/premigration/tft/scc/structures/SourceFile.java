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


/**
 *
 * @author 106363
 */
@XmlRootElement(name="Class")
public class SourceFile {

    private String name = "";
    private String packageName = "";
    private String path = "";
    private String totalyReusable = "";// This sourcefile is totatly reusable: no keywords found in source file.
    private String keyWordNotInMethod = "";// This sourcefile is not totatly reusable : keywords found in sourcefile, but not in methods
    private ArrayList<Method> methods = new ArrayList<Method>();

    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @XmlElement(name="totalyReusable")
    public String getTotalyReusable() {
        return totalyReusable;
    }

    public void setTotalyReusable(String totalyReusable) {
        this.totalyReusable = totalyReusable;
    }

    @XmlElement(name="keyWordNotInMethod")
    public String getKeyWordNotInMethod() {
        return keyWordNotInMethod;
    }

    public void setKeyWordNotInMethod(String keyWordNotInMethod) {
        this.keyWordNotInMethod = keyWordNotInMethod;
    }

@XmlElement(name="packageName")
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


@XmlElement(name="method")
    public ArrayList<Method> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<Method> methods) {
        this.methods = methods;
    }
    
    public void addLinea(Method l) {
        this.methods.add(l);
    }
    
    
    
}
