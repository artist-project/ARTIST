/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
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

import eu.artist.reusevol.repo.common.model.RepoPackage;

/* Unimplemented functionality               */
public class RepoPackagePropertySource implements IPropertySource {

	private final RepoPackage pkg;

	public RepoPackagePropertySource(RepoPackage pkg) {
		this.pkg = pkg;
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
		return new IPropertyDescriptor[] {
				new PropertyDescriptor("label", "Label"),
				new PropertyDescriptor("description", "Description") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("label")) {
			return pkg.getName();
		} else if (id.equals("description")) {
			return pkg.getDescription();
		}
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	// Currently updates of package information is not possible
	@Override
	public void setPropertyValue(Object id, Object value) {
		// String newValue = (String) value;

		if (id.equals("label")) {
			// pkg.setId(newValue);
		} else if (id.equals("description")) {
			// pkg.setDescription(newValue);
		}
	}
}
