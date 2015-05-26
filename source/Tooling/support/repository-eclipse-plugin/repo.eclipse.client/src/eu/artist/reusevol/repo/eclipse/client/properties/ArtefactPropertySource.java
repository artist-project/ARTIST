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

import java.util.Arrays;
import java.util.List;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.eclipse.client.api.RepositoryClientApi;
import eu.artist.reusevol.repo.eclipse.client.exceptions.RepoClientException;
import eu.artist.reusevol.repo.eclipse.client.views.RepoProjectView;

/* Unimplemented functionality               */
public class ArtefactPropertySource implements IPropertySource {

	private final RepoArtefact artefact;

	public ArtefactPropertySource(RepoArtefact artefact) {
		this.artefact = artefact;
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
				new TextPropertyDescriptor("label", "Label"),
				new TextPropertyDescriptor("description", "Description"),
		        new TextPropertyDescriptor("tags", "Tags")
		        };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("id")) {
			return artefact.getId();
		} else if (id.equals("name")) {
			return artefact.getName();
		} else if (id.equals("label")) {
			return artefact.getLabel();
		} else if (id.equals("description")) {
			return artefact.getDescription();
		}
		else if (id.equals("tags")) {		
			// string manipulation 
			List<String> tags = artefact.getTags();
			StringBuilder builder = new StringBuilder();
			  if (tags != null)
		        {
		            for (String str : tags)
		            {
		                if (builder.length() > 0)
		                {
		                	builder.append(",");
		                }
		                builder.append(str);
		            }
		        }           
		        return builder.toString();		
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

		if (id.equals("name") || id.equals("id")) {
			return;
		} else if (id.equals("label")) {
			changed = changed || !artefact.getLabel().equals(newValue);
			artefact.setLabel(newValue);
		} else if (id.equals("description")) {
			changed = changed || !artefact.getDescription().equals(newValue);
			artefact.setDescription(newValue);
		}
		else if (id.equals("tags")) {
			String[] temp;
			/* delimiter */
			String delimiter = ",";
			/* given string will be split by the argument delimiter provided. */
			temp = newValue.split(delimiter);	
			changed = changed || !artefact.getTags().equals(newValue);
			artefact.setTags(Arrays.asList(temp));
		}
		
		if (changed) {
			try {
				RepositoryClientApi.getInstance().updateArtefact(artefact);
				getRepoProjectView().getViewer().refresh();
			} catch (RepoClientException e) {
				System.out.println("Error updating artefact " + artefact + ": "
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
