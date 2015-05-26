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
 
package eu.artist.reusevol.server

import com.hubspot.dropwizard.guice.GuiceBundle
import eu.artist.reusevol.mp.MarketplaceBundle
import eu.artist.reusevol.repo.client.wso2.Wso2Client
import eu.artist.reusevol.server.core.modeshape.JcrModule
import eu.artist.reusevol.server.core.modeshape.ModeshapeManager
import eu.artist.reusevol.server.core.security.SecurityModule
import eu.artist.reusevol.server.core.security.Wso2OAuthAuthenticator
import eu.artist.reusevol.server.core.security.Wso2SecurityProvider
import eu.artist.reusevol.server.core.service.ArtefactService
import eu.artist.reusevol.server.core.service.CategoryService
import eu.artist.reusevol.server.core.service.PackageService
import eu.artist.reusevol.server.core.service.ProjectService
import eu.artist.reusevol.server.core.service.UserService
import eu.artist.reusevol.server.health.ModeshapeHealthCheck
import eu.artist.reusevol.server.mappers.JcrMappingExceptionMapper
import eu.artist.reusevol.server.resources.ProjectResource
import eu.artist.reusevol.server.util.guice.PostConstructModule
import io.dropwizard.Application
import io.dropwizard.auth.CachingAuthenticator
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import java.util.EnumSet
import javax.servlet.DispatcherType
import org.eclipse.jetty.servlets.CrossOriginFilter
import org.slf4j.LoggerFactory
import eu.artist.reusevol.server.filters.ClearThreadLocalFilter

class RepositoryService extends Application<RepositoryConfiguration> {
	
	public static val API_BASE = "/api" 

	var GuiceBundle<RepositoryConfiguration> guiceBundle

	public static def main(String[] args) throws Exception {
		new RepositoryService().run(args)
	}

	override getName() {
		"repository"
	}

	override initialize(Bootstrap<RepositoryConfiguration> bootstrap) {
		bootstrap.addBundle(new MarketplaceBundle)
		
		// Configure Guice support 		
		guiceBundle = GuiceBundle.<RepositoryConfiguration>newBuilder
			.addModule(new RepositoryModule)
			.addModule(new JcrModule)
			.addModule(new SecurityModule)
			.addModule(PostConstructModule.INSTANCE)
			.enableAutoConfig(
				ModeshapeManager.package.name, 
				ModeshapeHealthCheck.package.name, 
				ProjectResource.package.name,
				JcrMappingExceptionMapper.package.name,
				MarketplaceBundle.package.name
			)
			.setConfigClass(RepositoryConfiguration)
			.build
		bootstrap.addBundle(guiceBundle);
	}

	override run(RepositoryConfiguration configuration, Environment environment) {
		// Setup OAuth authentication
		val userService = guiceBundle.injector.getInstance(UserService)
		val wso2Client = guiceBundle.injector.getInstance(Wso2Client)
		val authenticator = new Wso2OAuthAuthenticator(wso2Client, userService)
		val authenticatonProvider = new CachingAuthenticator(
			environment.metrics, 
			authenticator, 
			configuration.authenticationCachePolicy)
		environment.jersey.register(new Wso2SecurityProvider(authenticatonProvider, configuration.wso2.useAnonymousUserForTesting))
		
		// Enable CORS for API calls from the marketplace
		environment.servlets.addFilter("CORS", CrossOriginFilter) => [
			addMappingForUrlPatterns(EnumSet.allOf(DispatcherType), true, "/*")
	    	setInitParameter("allowedOrigins", "*"); // allowed origins comma separated
	    	setInitParameter("allowedHeaders", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
	    	setInitParameter("allowedMethods", "GET,PUT,POST,DELETE,OPTIONS,HEAD");
	    	setInitParameter("preflightMaxAge", "5184000"); // 2 months
	    	setInitParameter("allowCredentials", "true");
		]

		environment.servlets.addFilter("ClearTL", ClearThreadLocalFilter) => [
			addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*")
		]

		
		// Register health checks
		environment.healthChecks.register("jcr-session", guiceBundle.injector.getInstance(ModeshapeHealthCheck))

		// Configure REST message logging
		if (configuration.logMessages) {
			environment.jersey.property("com.sun.jersey.spi.container.ContainerRequestFilters",
				"com.sun.jersey.api.container.filter.LoggingFilter")
			environment.jersey.property("com.sun.jersey.spi.container.ContainerResponseFilters",
				"com.sun.jersey.api.container.filter.LoggingFilter");
		}
	}
	
	def getProjectService() {
		guiceBundle.injector.getInstance(ProjectService)
	}

	def getPackageService() {
		guiceBundle.injector.getInstance(PackageService)
	}

	def getCategoryService() {
		guiceBundle.injector.getInstance(CategoryService)
	}

	def getArtefactService() {
		guiceBundle.injector.getInstance(ArtefactService)
	}
	
	def getLogger(String target) {
		LoggerFactory.getLogger(target)
	}
}
