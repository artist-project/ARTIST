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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Argument" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}TableFunctionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Return" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}TableFunctionReturn" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FunctionId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="AccessModifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AccessModifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableFunction", propOrder = {
    "argument",
    "_return"
})
public class TableFunction {

    @XmlElement(name = "Argument")
    protected List<TableFunctionParameter> argument;
    @XmlElement(name = "Return")
    protected TableFunctionReturn _return;
    @XmlAttribute(name = "FunctionId", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object functionId;
    @XmlAttribute(name = "AccessModifier")
    protected AccessModifier accessModifier;

    /**
     * Gets the value of the argument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the argument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArgument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableFunctionParameter }
     * 
     * 
     */
    public List<TableFunctionParameter> getArgument() {
        if (argument == null) {
            argument = new ArrayList<TableFunctionParameter>();
        }
        return this.argument;
    }

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TableFunctionReturn }
     *     
     */
    public TableFunctionReturn getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableFunctionReturn }
     *     
     */
    public void setReturn(TableFunctionReturn value) {
        this._return = value;
    }

    /**
     * Gets the value of the functionId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFunctionId() {
        return functionId;
    }

    /**
     * Sets the value of the functionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFunctionId(Object value) {
        this.functionId = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
    }

}
