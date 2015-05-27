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
 
package eu.artist.reusevol.server.core.dao

import eu.artist.reusevol.repo.common.model.Rating
import eu.artist.reusevol.server.core.GenericDaoTemplate
import javax.jcr.Session
import org.jcrom.Jcrom

class RatingDao extends GenericDaoTemplate<Rating> {

	new(Session session, Jcrom jcrom) {
		super(session, jcrom, Rating, "ar:rating", ProjectDao.BASE)
	}
	
}