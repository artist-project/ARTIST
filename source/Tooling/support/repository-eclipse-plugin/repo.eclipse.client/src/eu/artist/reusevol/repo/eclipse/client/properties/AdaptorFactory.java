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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;

import eu.artist.reusevol.repo.common.model.RepoArtefact;
import eu.artist.reusevol.repo.common.model.RepoCategory;
import eu.artist.reusevol.repo.common.model.RepoPackage;
import eu.artist.reusevol.repo.common.model.RepoProject;
import eu.artist.reusevol.repo.eclipse.client.model.TableModel;

/** Unimplemented functionality * */
public class AdaptorFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IPropertySource.class) {
			if (adaptableObject instanceof RepoProject) {
				return new RepoProjectPropertySource(
						(RepoProject) adaptableObject);
			} else if (adaptableObject instanceof RepoPackage) {
				return new RepoPackagePropertySource(
						(RepoPackage) adaptableObject);
			} else if (adaptableObject instanceof RepoArtefact) {
				return new ArtefactPropertySource(
						(RepoArtefact) adaptableObject);
			} else if (adaptableObject instanceof TableModel) {
				return new TablePropertySource((TableModel) adaptableObject);
			} else if (adaptableObject instanceof RepoCategory) {
					return new CategoryPropertySource((RepoCategory) adaptableObject);
				}
		}

		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}
}
