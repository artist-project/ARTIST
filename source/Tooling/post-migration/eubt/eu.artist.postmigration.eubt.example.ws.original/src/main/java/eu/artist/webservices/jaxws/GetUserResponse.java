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

@XmlRootElement(name = "getUserResponse", namespace = "http://webservices.artist.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", namespace = "http://webservices.artist.eu/")
public class GetUserResponse {

    @XmlElement(name = "return", namespace = "")
    private eu.artist.webservices.UserPojo _return;

    /**
     * 
     * @return
     *     returns UserPojo
     */
    public eu.artist.webservices.UserPojo getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(eu.artist.webservices.UserPojo _return) {
        this._return = _return;
    }

}
