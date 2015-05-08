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

import eu.artist.reusevol.repo.common.model.RepoProject;

/**
 * This class represents the name of a project in the repository and checks its
 * format. Project ids can consist of alphanumeric characters, ".", "-" and "_".
 * 
 * @author strauss
 * 
 */
public class ProjectName extends RepoName implements NameProvider<RepoProject> {
	public static final ProjectName PUBLIC = new ProjectName("public");

	private ProjectName(String name) {
		super(name, true);
	}

	/**
	 * Creates a ProjectId instance with the given id.
	 * 
	 * @param id
	 *            Project ids can consist of alphanumeric characters, ".", "-"
	 *            and "_".
	 * @return new ProjectId instance
	 * @throws IllegalArgumentException
	 *             when given an invalid id
	 */
	public static ProjectName of(String id) {
		return new ProjectName(id);
	}

	@Override
	protected String getRejectionPattern() {
		return "[^a-z0-9_\\-\\.]";
	}

	@Override
	protected String getFormatDescription() {
		return "Project names can consist only of alphanumeric characters, '.', '-' and '_'.";
	}
}
