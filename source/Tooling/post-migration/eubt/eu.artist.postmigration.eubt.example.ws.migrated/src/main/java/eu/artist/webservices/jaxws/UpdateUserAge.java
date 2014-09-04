/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Patrick Neubauer (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/

package eu.artist.webservices.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateUserAge", namespace = "http://webservices.artist.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateUserAge", namespace = "http://webservices.artist.eu/", propOrder = {
    "uid",
    "age"
})
public class UpdateUserAge {

    @XmlElement(name = "uid", namespace = "")
    private String uid;
    @XmlElement(name = "age", namespace = "")
    private String age;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * 
     * @param uid
     *     the value for the uid property
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getAge() {
        return this.age;
    }

    /**
     * 
     * @param username
     *     the value for the username property
     */
    public void setAge(String age) {
        this.age = age;
    }

}
