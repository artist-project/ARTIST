/*******************************************************************************
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Alexander Bergmayr (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.umlprofilestore;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Alexander Bergmayr
 *
 */
public interface UMLProfileStoreManager {
	
	/**
	 * The singleton instance of the UML-Profile-Store manager.
	 */
	UMLProfileStoreManager INSTANCE = eu.artist.migration.umlprofilestore.impl.UMLProfileStoreManagerImpl.init();

	/**
	 * Reads the UML Profiles in the store and returns the collection.
	 * 
	 * @return The collection of stored UML Profiles.
	 */
	public Collection<Resource> getUMLProfiles();
	
	/**
	 * Adds a profile to the store
	 * 
	 * @param profile
	 */
	public void addProfile(Resource profile);
}
