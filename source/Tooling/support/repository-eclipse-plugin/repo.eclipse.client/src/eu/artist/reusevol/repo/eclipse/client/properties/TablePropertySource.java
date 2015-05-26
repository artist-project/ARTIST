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
package eu.artist.reusevol.repo.eclipse.client.properties;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;

import eu.artist.reusevol.repo.eclipse.client.model.TableModel;

public class TablePropertySource implements IPropertySource {

	private final TableModel tableElement;

	public TablePropertySource(TableModel adaptableObject) {
		this.tableElement = adaptableObject;
	}

	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

	@Override
	public Object getEditableValue() {
		return this;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		return new IPropertyDescriptor[] { new PropertyDescriptor("id", "ID"),
				new PropertyDescriptor("name", "Name"),
				new PropertyDescriptor("label", "Label"),
				new PropertyDescriptor("description", "Description") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("id")) {
			return tableElement.getArtefactId();
		} else if (id.equals("name")) {
			return tableElement.getArtefactName();
		} else if (id.equals("label")) {
			return tableElement.getArtefact().getLabel();
		} else if (id.equals("description")) {
			return tableElement.getArtefact().getDescription();
		}
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// String s = (String) value;
	}

}
