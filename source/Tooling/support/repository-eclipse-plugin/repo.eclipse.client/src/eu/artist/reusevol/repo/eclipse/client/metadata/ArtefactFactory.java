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
package eu.artist.reusevol.repo.eclipse.client.metadata;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ArtefactFactory {

	// private final String id;
	private String artefactName;
	private String artefactLocation;

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
			this);

	public ArtefactFactory(String artefactName, String location) {
		// this.id = id;
		this.artefactLocation = location;
		this.artefactName = artefactName;
	}

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public String getId() {
		return this.artefactName;
	}

	public String getLocation() {
		return artefactLocation;
	}

	public String getArtefactName() {
		return artefactName;
	}

	public void setLocation(String description) {
		propertyChangeSupport.firePropertyChange("Location",
				this.artefactLocation, this.artefactLocation = description);
	}

	public void setArtefactName(String artefactName) {
		propertyChangeSupport.firePropertyChange("ArtefactName",
				this.artefactName, this.artefactName = artefactName);
	}

	public boolean isEditable() {

		return true;
	}

}
