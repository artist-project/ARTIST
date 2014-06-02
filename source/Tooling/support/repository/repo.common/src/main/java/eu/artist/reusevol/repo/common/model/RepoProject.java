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
import java.util.Iterator;
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

import eu.artist.reusevol.repo.common.util.NameProvider;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;

@XmlRootElement(name = "project")
@XmlAccessorType(XmlAccessType.NONE)
@JcrNode(classNameProperty = "classname")
public class RepoProject implements Identifiable, NameProvider<RepoProject> {
	/**
	 * The jcrPath identifies the project in the database.
	 */
	@JcrPath
	private String jcrPath;

	/**
	 * The name is the logical name of the project. It is made up of
	 * alpha-numeric characters, underscores or dashes. The name is used in URIs
	 * and in the JCR path. For projects this is identical to the name.
	 */
	@JcrName
	private String name;

	/**
	 * The human readable name of the project used for display purposes.
	 */
	@JcrProperty
	private String label;

	/**
	 * The description of the project.
	 */
	@JcrProperty
	private String description;

	/**
	 * The list of packages managed by this project.
	 */
	@JcrChildNode
	private List<RepoPackage> packages;

	public RepoProject() {
		this(null, null, null);
	}

	public RepoProject(ProjectName projectName) {
		this(projectName, projectName.getName(), null);
	}

	public RepoProject(ProjectName projectName, String label) {
		this(projectName, label, null);
	}

	public RepoProject(ProjectName projectName, String label, String description) {
		if (projectName != null) {
			this.name = projectName.getName();
		} else {
			this.name = null;
		}
		this.setLabel(label);
		this.setDescription(description);
		this.packages = new ArrayList<RepoPackage>();
	}

	@Override
	@XmlAttribute
	public String getId() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setId(String id) {
		this.name = ProjectName.of(id).getName();
	}

	/**
	 * @return the name
	 */
	@XmlAttribute
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Get the ProjectName.
	 * 
	 * @return the project name
	 */
	public ProjectName getProjectName() {
		return ProjectName.of(name);
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

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = Objects.firstNonNull(description, "").trim();
	}

	@XmlElementWrapper(name = "packages")
	@XmlElement(name = "package")
	public List<RepoPackage> getPackages() {
		return packages;
	}

	public RepoPackage addPackage(RepoPackage pkg) {
		packages.add(pkg);
		return pkg;
	}

	public RepoPackage addPackage(PackageName id, String name,
			String description) {
		RepoPackage pkg = new RepoPackage(id, name, description);
		packages.add(pkg);
		return pkg;
	}

	public RepoPackage addPackage(PackageName id, String name) {
		return addPackage(id, name, null);
	}

	public RepoPackage getPackage(String name) {
		for (RepoPackage pkg : packages) {
			if (pkg.getName().equals(name))
				return pkg;
		}
		return null;
	}

	public void removePackage(String name) {
		Iterator<RepoPackage> iter = packages.iterator();
		while (iter.hasNext()) {
			if (iter.next().getName().equals(name))
				iter.remove();

		}
	}

	public void removePackages() {
		this.packages.clear();
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("name", getId())
				.add("name", getLabel()).add("description", getDescription())
				.add("packages", getPackages()).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId(), getLabel(), getDescription(),
				getPackages());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RepoProject other = (RepoProject) obj;
		return Objects.equal(this.getId(), other.getId())
				&& Objects.equal(this.getLabel(), other.getLabel())
				&& Objects.equal(this.getDescription(), other.getDescription())
				&& Objects.equal(this.getPackages(), other.getPackages());
	}
}
