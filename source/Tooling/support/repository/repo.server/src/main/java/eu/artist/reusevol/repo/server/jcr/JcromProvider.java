/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.server.jcr;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import org.apache.log4j.Logger;
import org.jcrom.Jcrom;

@ApplicationScoped
public class JcromProvider {

	private static final Logger LOGGER = Logger.getLogger(JcromProvider.class);

	@RequestScoped
	@Produces
	public Jcrom createJcrom() {
		Jcrom jcrom = new Jcrom(false, true);
		jcrom.mapPackage("eu.artist.reusevol.repo.common.model", true);
		LOGGER.debug("JCROM created.");
		return jcrom;
	}

}
