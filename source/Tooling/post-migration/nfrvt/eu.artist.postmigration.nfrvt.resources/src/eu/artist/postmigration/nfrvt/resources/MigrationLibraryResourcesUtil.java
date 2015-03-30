/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.resources;

import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceUtil;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_NFPCatalogue;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_PatternCatalogue;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_SimpleTypes;
import eu.artist.postmigration.nfrvt.resources.constants.ARTIST_StaticPropertyCatalogue;
import eu.artist.postmigration.nfrvt.resources.constants.Ecore_PrimitiveTypes;
import eu.artist.postmigration.nfrvt.resources.constants.Java_PrimitiveTypes;
import eu.artist.postmigration.nfrvt.resources.constants.MARTE_LibraryConstants;
import eu.artist.postmigration.nfrvt.resources.constants.UML_PrimitiveTypes;
import eu.artist.postmigration.nfrvt.resources.constants.XML_PrimitiveTypes;

/**
 * This utility class creates and adapts resource sets for the use with a 
 * pre-defined set of modeling artifacts:<br/>
 * - The UML libraries <br/>
 * - The MARTE libraries <br/>
 * - The ARTIST libraries (NFP catalogue, etc.)
 * 
 * @author Martin Fleck
 *
 */
public class MigrationLibraryResourcesUtil {
	/**
	 * Base pathmap to the directory of the ARTIST libraries
	 */
	public static String BASE_PATHMAP = "pathmap://ARTIST_MIGRATION_LIBRARIES/";
	
	/**
	 * Creates a new, initialized migration resource set without loading any models.
	 * @return new, initialized migration resource set
	 */
	public static MigrationResourceSet createMigrationResourceSet() {
		return createMigrationResourceSet(false);
	}
	
	/**
	 * Creates a new, initialized migration resource set and loads all known libraries
	 * (UML, MARTE, ARTIST) if loadKnownResources is set to true.
	 * @param loadKnownResources if true, all known libraries will be pre-loaded
	 * @return new, initialized migration resource set
	 */
	public static MigrationResourceSet createMigrationResourceSet(boolean loadKnownResources) {
		MigrationResourceSet set = new MigrationResourceSet();
		init(set, loadKnownResources);
		return set;
	}
	
	/**
	 * Initializes the given resource set for the use with the known libraries. Specifically,
	 * it prepares the uri map for the use of the pathmaps-uris.
	 * @param resourceSet resource set to be initialized
	 * @return initialized resource set
	 */
	public static MigrationResourceSet init(MigrationResourceSet resourceSet) {
		return init(resourceSet, false);
	}
	
	/**
	 * Initializes the given resource set for the use with the known libraries. Specifically,
	 * it prepares the uri map for the use of the pathmaps-uris. All known libraries (UML, MARTE,
	 * ARTIST) will be pre-loaded if loadKnownResources is set to true.
	 * @param resourceSet resource set to be initialized
	 * @param loadKnownResources if true, all known libraries will be pre-loaded
	 * @return initialized resource set
	 */
	public static MigrationResourceSet init(MigrationResourceSet resourceSet, boolean loadKnownResources) {
		init(resourceSet.getResourceSet(), loadKnownResources);
		return resourceSet;
	}
	
	/**
	 * Initializes the given resource set for the use with the known libraries. Specifically,
	 * it prepares the uri map for the use of the pathmaps-uris.
	 * @param resourceSet resource set to be initialized
	 * @return initialized resource set
	 */
	public static ResourceSet init(ResourceSet resourceSet) {
		return init(resourceSet, false);
	}
	
	/**
	 * Initializes the given resource set for the use with the known libraries. Specifically,
	 * it prepares the uri map for the use of the pathmaps-uris. All known libraries (UML, MARTE,
	 * ARTIST) will be pre-loaded if loadKnownResources is set to true.
	 * @param resourceSet resource set to be initialized
	 * @param loadKnownResources if true, all known libraries will be pre-loaded
	 * @return initialized resource set
	 */
	public static ResourceSet init(ResourceSet resourceSet, boolean loadKnownResources) {
		if(!Platform.isRunning()) { 
			Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
			URI baseURI = getBaseARTISTResourceURI();
			mapResourceURIs(uriMap, 
					BASE_PATHMAP,
					baseURI.appendSegment("resources")); //$NON-NLS-1$
		}
		
		MigrationResourceUtil.init(resourceSet);
		MARTEResourcesUtil.init(resourceSet);
		ExtendedUMLResourcesUtil.init(resourceSet);
		
		if(loadKnownResources) {
			resourceSet.getResource(ARTIST_NFPCatalogue.CATALOGUE_URI, true);
			resourceSet.getResource(ARTIST_PatternCatalogue.CATALOGUE_URI, true);
			resourceSet.getResource(ARTIST_StaticPropertyCatalogue.CATALOGUE_URI, true);
			resourceSet.getResource(ARTIST_SimpleTypes.PACKAGE_URI, true);
		
			resourceSet.getResource(Ecore_PrimitiveTypes.PACKAGE_URI, true);
			resourceSet.getResource(Java_PrimitiveTypes.PACKAGE_URI, true);
			resourceSet.getResource(UML_PrimitiveTypes.PACKAGE_URI, true);
			resourceSet.getResource(XML_PrimitiveTypes.PACKAGE_URI, true);
		
			resourceSet.getResource(MARTE_LibraryConstants.LIBRARY_URI, true);
		}
		return resourceSet;
	}
	
	private static URI getBaseARTISTResourceURI() {
		String catalogueUri = "pathmap://ARTIST_MIGRATION_LIBRARIES/ARTIST_NFPCatalogue.prop"; //ARTIST_NFPCatalogue.CATALOGUE_URI_STRING;
		URI nfpCatalogue = URI.createURI(catalogueUri);
		URL resultURL = MigrationLibraryResourcesUtil.class.getClassLoader().getResource(
			String.format("resources/%s", nfpCatalogue.lastSegment())); //$NON-NLS-1$

		URI result;

		if (resultURL != null) {
			// remove the /resources/ARTIST_NFPCatalogue.prop segments of the resource
			// we found
			result = URI.createURI(resultURL.toExternalForm(), true)
				.trimSegments(2);
		} else {
			// probably, we're not running with JARs, so assume the source
			// project folder layout
			resultURL = MigrationLibraryResourcesUtil.class.getResource("MigrationLibraryResourcesUtil.class"); //$NON-NLS-1$

			String baseURL = resultURL.toExternalForm();
			baseURL = baseURL.substring(0, baseURL.lastIndexOf("/bin/")); //$NON-NLS-1$
			result = URI.createURI(baseURL, true);
		}

		return result;
	}

	private static void mapResourceURIs(Map<URI, URI> uriMap,
			String uri, URI location) {
		URI prefix = URI.createURI(uri);
		
		// ensure trailing separator (make it a "URI prefix")
		if (!prefix.hasTrailingPathSeparator()) {
			prefix = prefix.appendSegment(""); //$NON-NLS-1$
		}

		// same with the location
		if (!location.hasTrailingPathSeparator()) {
			location = location.appendSegment(""); //$NON-NLS-1$
		}

		uriMap.put(prefix, location);

		// and platform URIs, too
		String folder = location.segment(location.segmentCount() - 2);
		String platformURI = String.format("%s/%s/", //$NON-NLS-1$
			ResourcesPlugin.PLUGIN_ID, folder);
		uriMap.put(URI.createPlatformPluginURI(platformURI, true), location);
		uriMap.put(URI.createPlatformResourceURI(platformURI, true), location);
	}
}
