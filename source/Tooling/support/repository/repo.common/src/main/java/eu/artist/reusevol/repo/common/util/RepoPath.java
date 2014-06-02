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
package eu.artist.reusevol.repo.common.util;

import org.jcrom.util.PathUtils;

import com.google.common.base.Objects;

/**
 * The ArtefactPath represents the path to projects, packages and artefacts in the underlying storage
 * structure. The paths are cleaned (non-alphanumeric characters are replaced).
 */
public class RepoPath {
	public static final String BASE_PATH = "/projects/";
	
	private final String projectName;
	private final String packageName;
	private final String artefactName;
	private final String version;
	
	public RepoPath(String project, String pkg, String artefact, String version) {
		this.projectName = (project != null) ? PathUtils.createValidName(project) : null;
		this.packageName = (pkg != null) ? PathUtils.createValidName(pkg) : null;
		this.artefactName = (artefact != null) ? PathUtils.createValidName(artefact) : null;
		this.version = (version != null) ? PathUtils.createValidName(version) : null;
	}
	
	public RepoPath(String project, String pkg, String artefact) {
		this(project, pkg, artefact, null);
	}

	public RepoPath(String project, String pkg) {
		this(project, pkg, null, null);
	}

	public RepoPath(String project) {
		this(project, null, null, null);
	}

	public String getProjectName() {
		return projectName;
	}

	public String getPackageName() {
		return packageName;
	}

	public String getArtefactName() {
		return artefactName;
	}
	
	public String getProjectPath() {
		if (projectName == null) 
			throw new IllegalArgumentException("Trying to get projectPath with projectName not set");
		return BASE_PATH + projectName;
	}
	
	public String getPackagePath() {
		if ((projectName == null) || (packageName == null)) 
			throw new IllegalArgumentException("Trying to get packagePath with projectName or packageName not set");
		return new StringBuilder(BASE_PATH).append(projectName).append("/packages/").append(packageName).toString();
	}
	
	public String getArtefactPath() {
		if ((projectName == null) || (artefactName == null) || (artefactName == null)) 
			throw new IllegalArgumentException("Trying to get artefactPath with projectName, packageName of artefactName not set");
		return new StringBuilder(BASE_PATH).append(projectName).append("/packages/").append(packageName).append("/artefacts/").append(artefactName).toString();
	}

	public String getVersion() {
		return version;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("project", projectName)
				.add("package", packageName).add("artefact", artefactName)
				.add("version", version).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(projectName, packageName, artefactName, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final RepoPath other = (RepoPath) obj;
		return Objects.equal(this.getProjectName(), other.getProjectName()) 
				&& Objects.equal(this.getPackageName(), other.getPackageName())
				&& Objects.equal(this.getArtefactName(), other.getArtefactName())
				&& Objects.equal(this.getVersion(), other.getVersion());
	}	
}
