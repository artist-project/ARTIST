/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.eclipse.client.properties;


import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView;

/* Unimplemented functionality               */
public class CategoryPropertySource implements IPropertySource {

	private final RepoCategory category;

	public CategoryPropertySource(RepoCategory category) {
		this.category = category;
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
				
				new PropertyDescriptor("id", "ID"),
				new PropertyDescriptor("name", "Name"),
				new TextPropertyDescriptor("label", "Label"),
				new TextPropertyDescriptor("description", "Description") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		
		if (id.equals("id")) {
			return category.getId();
		} else if (id.equals("name")) {
			return category.getName();
	   	}else if (id.equals("label")) {
			return category.getLabel();
		 }else if (id.equals("description")) {
			return category.getDescription();
		}
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	
	@Override
	public void setPropertyValue(Object id, Object value) {
		// String newValue = (String) value;
		String newValue = (String) value;
		boolean changed = false;
		
		if (id.equals("name") || id.equals("id")) {
			return;
		} else if (id.equals("label")) {
			changed = changed || !category.getLabel().equals(newValue);
			category.setLabel(newValue);
		} else if (id.equals("description")) {
			changed = changed || !category.getDescription().equals(newValue);
			category.setDescription(newValue);
		}
		
		if (changed) {
			try {
				RepositoryClientApi.getInstance().updateCategory(category);
				getRepoProjectView().getViewer().refresh();
			} catch (RepoClientException e) {
				System.out.println("Error updating category " + category + ": "
						+ e.getMessage());
			}
		}
		
	}
	
	private RepoProjectView getRepoProjectView() {
		RepoProjectView view = null;
		try {
			view = (RepoProjectView) PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.showView(RepoProjectView.ID);
		} catch (PartInitException e) {
			System.out.println("Error getting view: " + e.getMessage());
			e.printStackTrace();
		}
		return view;
	}
}
