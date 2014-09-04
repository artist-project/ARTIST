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

@XmlRootElement(name = "createUser", namespace = "http://webservices.artist.eu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", namespace = "http://webservices.artist.eu/", propOrder = {
    "userid",
    "username",
    "password",
    "email",
    "age"
})
public class CreateUser {

    @XmlElement(name = "userid", namespace = "")
    private String userid;
    @XmlElement(name = "username", namespace = "")
    private String username;
    @XmlElement(name = "password", namespace = "")
    private String password;
    @XmlElement(name = "email", namespace = "")
    private String email;
    @XmlElement(name = "age", namespace = "")
    private String age;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUserid() {
        return this.userid;
    }

    /**
     * 
     * @param userid
     *     the value for the userid property
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * 
     * @param username
     *     the value for the username property
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 
     * @param password
     *     the value for the password property
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 
     * @param email
     *     the value for the email property
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @param age
     *     the value for the age property
     */
    public void setAge(String age) {
        this.age = age;
    }

}
