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

/**
 * This class represents the name of an artefact in the repository and checks
 * its format. Artefact names can consist of alphanumeric characters, ".", "-"
 * and "_".
 * 
 * @author strauss
 * 
 */
public class ArtefactName extends RepoName {

	private ArtefactName(String name) {
		super(name, true);
	}

	/**
	 * Creates a ArtefactName instance with the given name.
	 * 
	 * @param name
	 *            Artefact names can consist of alphanumeric characters, ".",
	 *            "-" and "_".
	 * @return new AretactName instance
	 * @throws IllegalArgumentException
	 *             when given an invalid name
	 */
	public static ArtefactName of(String id) {
		return new ArtefactName(id);
	}

	@Override
	protected String getRejectionPattern() {
		return "[^a-z0-9_\\-\\.]";
	}

	@Override
	protected String getFormatDescription() {
		return "Artefact names can consist only of alphanumeric characters, '.', '-' and '_'.";
	}
}
