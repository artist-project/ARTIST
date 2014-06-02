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
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.jcrom.annotations.JcrChildNode;
import org.jcrom.annotations.JcrIdentifier;
import org.jcrom.annotations.JcrName;
import org.jcrom.annotations.JcrNode;
import org.jcrom.annotations.JcrPath;
import org.jcrom.annotations.JcrProperty;

import com.google.common.base.Preconditions;

import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;

/**
 * The model class that represents an artefact in the repository. It uses the
 * Builder pattern to construct new instances. See the tests for examples.
 * 
 * @author strauss
 * 
 */
@XmlRootElement(name = "artefact")
@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({ FileContent.class, WebContent.class })
@JcrNode(classNameProperty = "classname", mixinTypes = { "mix:referenceable" })
public class RepoArtefact implements Identifiable {

	@JcrPath
	private String jcrPath;
	@JcrName
	private String name;

	@JcrProperty
	private String id;
	@JcrIdentifier
	private String uuid;

	@JcrProperty
	private String label;
	@JcrProperty
	private String description;
	@JcrProperty
	private String namespaceURI;
	@JcrProperty
	private List<String> tags;
	@JcrProperty
	private List<String> categories;
	@JcrChildNode
	private RepoContent content;

	private ArtefactId artefactId;

	public RepoArtefact() {
		this.name = null;
		this.id = null;
		this.label = null;
		this.description = null;
		this.namespaceURI = null;
		this.tags = new ArrayList<String>();
		this.categories = new ArrayList<String>();
		this.content = null;
		this.artefactId = null;
	}

	private RepoArtefact(Builder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.label = builder.label;
		this.description = builder.description;
		this.namespaceURI = builder.namespaceURI;
		this.tags = builder.tags;
		this.categories = builder.categories;
		this.content = builder.content;
		this.artefactId = ArtefactId.of(id);
	}

	/**
	 * The UUID assigned by the database.
	 * 
	 * @return the uuid
	 */
	@XmlElement
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * The human readable description of the artefact.
	 * 
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
		this.description = description;
	}

	/**
	 * The namespace of the artefact if applicable. This is useful especially
	 * for model files but also for XML files in general.
	 * 
	 * @return the namespaceURI
	 */
	@XmlAttribute
	public String getNamespaceURI() {
		return namespaceURI;
	}

	/**
	 * @param namespaceURI
	 *            the namespaceURI to set
	 */
	public void setNamespaceURI(String namespaceURI) {
		this.namespaceURI = namespaceURI;
	}

	/**
	 * The actual artefact stored in the database or referenced from an external
	 * source.
	 * 
	 * @return the content
	 */
	@XmlElement
	public RepoContent getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(RepoContent content) {
		this.content = content;
	}

	/**
	 * The internal database path to the entity.
	 * 
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
	 * The string id that identifies this artefact. It contains PackageName,
	 * ArtefactName and Version joined by "!".
	 * 
	 * @return the id
	 */
	@XmlAttribute
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id
	 */
	public void setId(String id) {
		this.artefactId = ArtefactId.of(id);
		this.id = id;
	}

	/**
	 * The id object that identifies this artefact. It contains PackageName,
	 * ArtefactName.
	 * 
	 * @return ArtefactId object representing this artefact
	 */
	public ArtefactId getArtefactId() {
		Preconditions.checkState(id != null);
		if (artefactId == null) {
			artefactId = ArtefactId.of(id);
		}
		return artefactId;
	}

	/**
	 * The internal name of this entity in the database.
	 * 
	 * @return the name
	 */
	@XmlAttribute
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The human readable name of this artefact.
	 * 
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
	 * The set of Tags that describe this artefact.
	 * 
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * The set of categories this artefact is associated with.
	 * 
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	/**
	 * The set of Tags that describe this artefact.
	 * 
	 * @return the tags
	 */
	@XmlElementWrapper(name = "tags")
	@XmlElement(name = "tag")
	public List<String> getTags() {
		return tags;
	}

	/**
	 * The set of categories this artefact is associated with.
	 * 
	 * @return the categories
	 */
	@XmlElementWrapper(name = "categories")
	@XmlElement(name = "category")
	public List<String> getCategories() {
		return categories;
	}

	/**
	 * The Builder that helps to construct new artefact instances with a fluid
	 * API.
	 * 
	 * @author strauss
	 * 
	 */
	public static class Builder {
		private String name;
		private String id;
		private String label;
		private String description;
		private String namespaceURI;
		private List<String> tags;
		private List<String> categories;
		private RepoContent content;

		/**
		 * Create a new Builder with the id as default argument.
		 * 
		 * @param id
		 */
		public Builder(ArtefactId id) {
			this.name = id.getArtefactPart().getName();
			this.id = id.toString();
			this.label = id.getArtefactPart().getName();
			this.description = null;
			this.namespaceURI = null;
			this.tags = new ArrayList<String>();
			this.categories = new ArrayList<String>();
			this.content = null;
		}

		/**
		 * Sets the human readable label.
		 * 
		 * @param label
		 * @return the Builder
		 */
		public Builder label(String label) {
			this.label = label;
			return this;
		}

		/**
		 * Sets the human readable description.
		 * 
		 * @param description
		 * @return the Builder
		 */
		public Builder description(String description) {
			this.description = description;
			return this;
		}

		/**
		 * Sets the namespace URI of models and XML artefacts.
		 * 
		 * @param uri
		 * @return the Builder
		 */
		public Builder namespaceURI(String uri) {
			this.namespaceURI = uri;
			return this;
		}

		/**
		 * Sets the tags.
		 * 
		 * @param tags
		 * @return the Builder
		 */
		public Builder tags(String... tags) {
			this.tags = Arrays.asList(tags);
			return this;
		}

		/**
		 * Sets the category names.
		 * 
		 * @param categories
		 * @return the Builder
		 */
		public Builder categories(String... categories) {
			for (String category : categories) {
				// Check format
				CategoryName.of(category);
			}
			this.categories = Arrays.asList(categories);
			return this;
		}

		/**
		 * Sets the actual content.
		 * 
		 * @param content
		 * @return the Builder
		 */
		public Builder content(RepoContent content) {
			this.content = content;
			return this;
		}

		/**
		 * Constructs the artefact instance.
		 * 
		 * @return
		 */
		public RepoArtefact build() {
			return new RepoArtefact(this);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RepoArtefact [jcrPath=").append(jcrPath)
				.append(", name=").append(name).append(", uuid=").append(uuid)
				.append(", label=").append(label).append(", namespaceURI=")
				.append(namespaceURI).append(", tags=").append(tags)
				.append(", categories=").append(categories).append("]");
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
				+ ((categories == null) ? 0 : categories.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((jcrPath == null) ? 0 : jcrPath.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result
				+ ((namespaceURI == null) ? 0 : namespaceURI.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
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
		if (!(obj instanceof RepoArtefact))
			return false;
		RepoArtefact other = (RepoArtefact) obj;
		if (categories == null) {
			if (other.categories != null)
				return false;
		} else if (!categories.equals(other.categories))
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
		if (namespaceURI == null) {
			if (other.namespaceURI != null)
				return false;
		} else if (!namespaceURI.equals(other.namespaceURI))
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}
