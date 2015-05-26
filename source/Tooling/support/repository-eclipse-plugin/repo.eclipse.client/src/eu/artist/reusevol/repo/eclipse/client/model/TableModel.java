/*******************************************************************************
 * Copyright (c) 2014, 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß and Huzahid Hussain (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoProject;

public class TableModel {
	private RepoProject project;
	private RepoArtefact artefact;

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
			this);

	public TableModel() {
		super();
	}

	public TableModel(RepoProject project, RepoArtefact artefact) {
		super();
		this.project = project;
		this.artefact = artefact;
	}

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public String getArtefactId() {
		return artefact.getId();
	}

	public String getArtefactName() {
		return artefact.getName();
	}

	public String getProjectName() {
		return project.getName();
	}

	public RepoProject getProject() {
		return project;
	}

	public RepoArtefact getArtefact() {
		return artefact;
	}

	public String getPackageName() {
		return artefact.getPackageId();
	}
}