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
import javax.xml.bind.annotation.XmlTransient;

import org.jcrom.annotations.JcrChildNode;
import org.jcrom.annotations.JcrIdentifier;
import org.jcrom.annotations.JcrName;
import org.jcrom.annotations.JcrNode;
import org.jcrom.annotations.JcrParentNode;
import org.jcrom.annotations.JcrPath;
import org.jcrom.annotations.JcrProperty;

import com.google.common.collect.Iterables;

import eu.artist.reusevol.repo.common.util.CategoryName;

/**
 * This class represents a category. Categories form a hierarchy and can be
 * assigned to artefacts. A category is uniquely addressed by a category path of
 * the form catA.subCatB.subCatC. The segments of this path are the ids of the
 * categories.
 * 
 * @author strauss
 * 
 */
@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname", mixinTypes = { "mix:referenceable" })
public class RepoCategory implements Identifiable {
	/**
	 * The jcrPath identifies the category in the database via its path in the
	 * content tree.
	 */
	@JcrPath
	private String jcrPath;

	/**
	 * The name is the logical name of the category. It is made up of
	 * alpha-numeric characters, underscores or dashes. The name is used in the
	 * logical category path and in the JCR path. Example: 'dews' is the name of
	 * category eu.artist.dews.
	 */
	@JcrName
	private String name;

	/**
	 * The id is the logical path of the category. It is made up of
	 * alpha-numeric characters, underscores or dashes. The name is used in the
	 * logical category path and in the JCR path. Example: 'eu.artist.dews' is
	 * the id of category eu.artist.dews.
	 */
	@JcrProperty
	private String id;

	/**
	 * Unique identifier used to reference a category independently from the JCR
	 * path.
	 */
	@JcrIdentifier
	private String uuid;

	/**
	 * The parent category of this category or null for the top level
	 * categories.
	 */
	@JcrParentNode
	private RepoCategory parent;

	/**
	 * The human readable label of the category used for display purposes.
	 */
	@JcrProperty
	private String label;

	/**
	 * The description of the category.
	 */
	@JcrProperty
	private String description;

	/**
	 * The list of sub-categories.
	 */
	@JcrChildNode(name = "children")
	private List<RepoCategory> categories;

	public RepoCategory() {
		this(null, null, null);
	}

	public RepoCategory(CategoryName name) {
		this(name, name.getName(), null);
	}

	public RepoCategory(CategoryName name, String label) {
		this(name, label, null);
	}

	public RepoCategory(CategoryName name, String label, String description) {
		if (name != null) {
			this.id = name.getName();
		} else {
			this.id = null;
		}
		this.name = getNameFromCategoryName(name);
		this.label = label;
		this.description = description;
		this.uuid = null;
		this.parent = null;
		this.jcrPath = null;
		this.categories = new ArrayList<RepoCategory>();
	}

	private String getNameFromCategoryName(CategoryName name) {
		if (name == null)
			return null;
		if (name.getSegments().size() > 0) {
			return Iterables.getLast(name.getSegments());
		} else {
			return "root";
		}
	}

	@XmlAttribute
	public String getName() {
		return this.name;
	}

	@XmlAttribute
	@Override
	public String getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		CategoryName cn = CategoryName.of(id);
		this.id = cn.getName();
		this.name = getNameFromCategoryName(cn);
	}

	public CategoryName getCategoryName() {
		return CategoryName.of(id);
	}

	public String getJcrPath() {
		return this.jcrPath;
	}

	public void setJcrPath(String jcrPath) {
		this.jcrPath = jcrPath;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@XmlElement
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlAttribute
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@XmlTransient
	public RepoCategory getParent() {
		return parent;
	}

	public void setParent(RepoCategory parent) {
		this.parent = parent;
	}

	public void addCategory(RepoCategory cat) {
		categories.add(cat);
	}

	public void removeCategory(RepoCategory cat) {
		categories.remove(cat);
	}

	/**
	 * @return the categories
	 */
	@XmlElementWrapper(name = "sub-categories")
	@XmlElement(name = "category")
	public List<RepoCategory> getCategories() {
		return categories;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		if (!(obj instanceof RepoCategory))
			return false;
		RepoCategory other = (RepoCategory) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RepoCategory [jcrPath=").append(jcrPath)
				.append(", name=").append(name).append(", uuid=").append(uuid)
				.append(", label=").append(label).append(", description=")
				.append(description).append(", id=").append(id)
				.append(", categories=").append(categories).append("]");
		return builder.toString();
	}
}
