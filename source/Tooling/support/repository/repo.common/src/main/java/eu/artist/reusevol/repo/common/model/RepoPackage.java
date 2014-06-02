/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.jcrom.annotations.JcrChildNode;
import org.jcrom.annotations.JcrName;
import org.jcrom.annotations.JcrNode;
import org.jcrom.annotations.JcrPath;
import org.jcrom.annotations.JcrProperty;

import com.google.common.base.Objects;

import eu.artist.reusevol.repo.common.util.PackageName;

@XmlRootElement(name = "package")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname")
public class RepoPackage implements Identifiable {
	/**
	 * The jcrPath identifies the package in the database.
	 */
	@JcrPath
	private String jcrPath;

	/**
	 * The name is the logical name of the package. Segments are made up of
	 * alpha-numeric characters, underscores or dashes and are separated by
	 * dots.
	 */
	@JcrName
	private String name;

	/**
	 * The human readable label of the package used for display purposes.
	 */
	@JcrProperty
	private String label;

	/**
	 * The description of the package.
	 */
	@JcrProperty
	private String description;

	/**
	 * The list of artefacts in this package.
	 */
	@JcrChildNode
	private List<RepoArtefact> artefacts;

	public RepoPackage() {
		this(null, null, null);
	}

	public RepoPackage(PackageName name) {
		this(name, name.getName(), null);
	}

	public RepoPackage(PackageName name, String label) {
		this(name, label, null);
	}

	public RepoPackage(PackageName name, String label, String description) {
		if (name != null) {
			this.name = name.getName();
		} else {
			this.name = null;
		}
		this.setLabel(label);
		this.setDescription(description);
		artefacts = new ArrayList<RepoArtefact>();
	}

	/**
	 * 
	 * @return the PackageName object
	 */
	public PackageName getPackageName() {
		return PackageName.of(name);
	}

	/**
	 * @return the name
	 */
	@XmlAttribute
	@Override
	public String getId() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setId(String id) {
		this.name = PackageName.of(id).getName();
	}

	/**
	 * @return the label
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setName(String name) {
		this.setId(name);
	}

	/**
	 * @return the label
	 */
	@XmlAttribute
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the description
	 */
	@XmlElement
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = Objects.firstNonNull(description, "").trim();
	}

	/**
	 * @return the jcrPath
	 */
	public String getJcrPath() {
		return jcrPath;
	}

	/**
	 * @param jcrPath
	 *            the jcrPath to set
	 */
	public void setJcrPath(String jcrPath) {
		this.jcrPath = jcrPath;
	}

	/**
	 * @return the artefacts
	 */
	@XmlElementWrapper(name = "artefacts")
	@XmlElement(name = "artefact")
	public List<RepoArtefact> getArtefacts() {
		return artefacts;
	}

	public RepoArtefact getArtefact(String name) {
		for (RepoArtefact artefact : artefacts) {
			if (artefact.getName().equals(name))
				return artefact;
		}
		return null;
	}

	public RepoArtefact addArtefact(RepoArtefact artefact) {
		artefacts.add(artefact);
		return artefact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RepoPackage [jcrPath=").append(jcrPath)
				.append(", name=").append(name).append(", label=")
				.append(label).append(", description=").append(description)
				.append(", artefacts=").append(artefacts).append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((artefacts == null) ? 0 : artefacts.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((jcrPath == null) ? 0 : jcrPath.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RepoPackage))
			return false;
		RepoPackage other = (RepoPackage) obj;
		if (artefacts == null) {
			if (other.artefacts != null)
				return false;
		} else if (!artefacts.equals(other.artefacts))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (jcrPath == null) {
			if (other.jcrPath != null)
				return false;
		} else if (!jcrPath.equals(other.jcrPath))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		return true;
	}
}
