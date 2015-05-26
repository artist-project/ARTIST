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

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView;

/* Unimplemented functionality               */
public class RepoProjectPropertySource implements IPropertySource {

	private final RepoProject project;

	public RepoProjectPropertySource(RepoProject todo) {
		this.project = todo;
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
				new TextPropertyDescriptor("label", "Label"),
				new TextPropertyDescriptor("description", "Description") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("label")) {
			return project.getLabel();
		} else if (id.equals("description")) {
			return project.getDescription();
		}
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		String newValue = (String) value;
		boolean changed = false;

		if (id.equals("label")) {
			changed = changed || !project.getLabel().equals(newValue);
			project.setLabel(newValue);
		} else if (id.equals("description")) {
			changed = changed || !project.getDescription().equals(newValue);
			project.setDescription(newValue);
		}

		if (changed) {
			try {
				RepositoryClientApi.getInstance().updateProject(project);
				getRepoProjectView().getViewer().refresh();
			} catch (RepoClientException e) {
				System.out.println("Error updating project " + project + ": "
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
