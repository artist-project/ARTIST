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
 
package eu.artist.reusevol.mp;

import io.dropwizard.ConfiguredBundle;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jersey.sessions.HttpSessionProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import org.eclipse.jetty.server.session.SessionHandler;

public class MarketplaceBundle<RepositoryConfiguration> implements ConfiguredBundle<RepositoryConfiguration> {
	
	public static final String WEB_BASE = "";

	@Override
	public void initialize(Bootstrap<?> bootstrap) {
		bootstrap.addBundle(new AssetsBundle("/assets/bootstrap/", WEB_BASE + "/bootstrap/", null, "bootstrap"));
		bootstrap.addBundle(new AssetsBundle("/assets/dist/", WEB_BASE + "/dist/", null, "dist"));
		bootstrap.addBundle(new AssetsBundle("/assets/plugins/", WEB_BASE + "/plugins/", null, "plugins"));
		// bootstrap.addBundle(new AssetsBundle("/assets/static/", WEB_BASE + "/static/", null, "static"));
		bootstrap.addBundle(new ViewBundle());
	}

	@Override
	public void run(RepositoryConfiguration configuration,
			Environment environment) throws Exception {
		
		environment.jersey().register(HttpSessionProvider.class);
		environment.servlets().setSessionHandler(new SessionHandler());
	}

}
