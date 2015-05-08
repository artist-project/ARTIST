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
package eu.artist.reusevol.repo.server.util;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.common.util.ArtefactId;
import eu.artist.reusevol.repo.common.util.CategoryName;
import eu.artist.reusevol.repo.common.util.NameProvider;
import eu.artist.reusevol.repo.common.util.PackageName;
import eu.artist.reusevol.repo.common.util.ProjectName;

public class JcrPathUtil {
	public static final String PROJECT_BASE_PATH = "/projects/";
	public static final String CATEGORY_BASE_PATH = "/categories";

	public static final String CATEGORY_COLLECTION_NODE_NAME = "/children/";
	public static final String PACKAGE_COLLECTION_NODE_NAME = "/packages/";
	public static final String ARTEFACT_COLLECTION_NODE_NAME = "/artefacts";

	public static String getProjectPath(NameProvider<RepoProject> name) {
		Preconditions.checkNotNull(name);

		return PROJECT_BASE_PATH + name.getName();
	}

	public static String getCategoryPath(CategoryName name) {
		Preconditions.checkNotNull(name);

		StringBuilder path = new StringBuilder(CATEGORY_BASE_PATH);
		path.append("/");
		Joiner joiner = Joiner.on(CATEGORY_COLLECTION_NODE_NAME);
		path.append(joiner.join(Lists.asList("root", name.getSegments()
				.toArray())));
		return path.toString();
	}

	public static String getCategoryPath(RepoCategory category) {
		Preconditions.checkNotNull(category);

		return getCategoryPath(category.getCategoryName());
	}

	public static String getPackagePath(ProjectName projectName,
			PackageName packageName) {
		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(packageName);

		StringBuilder path = new StringBuilder(getProjectPath(projectName));
		path.append(PACKAGE_COLLECTION_NODE_NAME);
		path.append(packageName.getName());
		return path.toString();
	}

	public static String getPackagePath(RepoProject project,
			ArtefactId artefactId) {
		Preconditions.checkNotNull(project);
		Preconditions.checkNotNull(artefactId);

		return getPackagePath(project.getProjectName(),
				artefactId.getPackagePart());
	}

	public static String getPackagePath(ProjectName projectName,
			ArtefactId artefactId) {
		Preconditions.checkNotNull(artefactId);

		return getPackagePath(projectName, artefactId.getPackagePart());
	}

	public static String getPackagePath(RepoProject project,
			PackageName packageName) {
		Preconditions.checkNotNull(project);

		return getPackagePath(project.getProjectName(), packageName);
	}

	public static String getArtefactPath(ProjectName projectName,
			ArtefactId artefactId) {
		Preconditions.checkNotNull(projectName);
		Preconditions.checkNotNull(artefactId);

		StringBuilder path = new StringBuilder(getPackagePath(projectName,
				artefactId));
		path.append(ARTEFACT_COLLECTION_NODE_NAME);
		path.append("/");
		path.append(artefactId.getArtefactPart().getName());
		return path.toString();
	}

	public static String getArtefactPath(RepoProject project,
			ArtefactId artefactId) {
		Preconditions.checkNotNull(project);

		return getArtefactPath(project.getProjectName(), artefactId);
	}
}
