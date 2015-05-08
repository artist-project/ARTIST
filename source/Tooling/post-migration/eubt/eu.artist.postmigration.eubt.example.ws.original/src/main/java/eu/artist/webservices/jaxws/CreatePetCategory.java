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

@XmlRootElement(name = "createPetCategory", namespace = "http://webservices.artist.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPetCategory", namespace = "http://webservices.artist.eu/", propOrder = {
    "categoryid",
    "categoryname",
    "categorydescription"
})
public class CreatePetCategory {

    @XmlElement(name = "categoryid", namespace = "")
    private String categoryid;
    @XmlElement(name = "categoryname", namespace = "")
    private String categoryname;
    @XmlElement(name = "categorydescription", namespace = "")
    private String categorydescription;    

    /**
     * 
     * @return
     *     returns String
     */
    public String getCategoryId() {
        return this.categoryid;
    }

    /**
     * 
     * @param categoryid
     *     the value for the categoryid property
     */
    public void setCategoryId(String categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCategoryName() {
        return this.categoryname;
    }

    /**
     * 
     * @param categoryname
     *     the value for the categoryname property
     */
    public void setCategoryName(String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getCategoryDescription() {
        return this.categorydescription;
    }

    /**
     * 
     * @param categorydescription
     *     the value for the categorydescription property
     */
    public void setCategoryDescription(String categorydescription) {
        this.categorydescription = categorydescription;
    }
    
}
