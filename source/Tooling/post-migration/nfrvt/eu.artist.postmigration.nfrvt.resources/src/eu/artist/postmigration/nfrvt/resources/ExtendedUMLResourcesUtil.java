/*
 * Copyright (c) 2012, 2014 CEA, Obeo, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Kenn Hussey (CEA) - initial API and implementation
 *   Kenn Hussey (CEA) - 389542, 399544, 425846, 418466, 429352
 *   Mikael Barbero (Obeo) - 414572
 *   Christian W. Damus (CEA) - 414572, 401682
 */
package eu.artist.postmigration.nfrvt.resources;

import java.net.URL;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Taken from the newer version of UML Resource Util.
 * 
 * @since 4.0
 */
public class ExtendedUMLResourcesUtil
		extends UMLUtil {
	/**
	 * Adds registrations to EMF's and UML2's global registries that enable
	 * working with UML models. To apply the same registrations only locally on
	 * a resource set (e.g., for isolation from other EMF-based code in the same
	 * class loader), use the {@link #initLocalRegistries(ResourceSet)} method,
	 * instead.
	 * 
	 * @see #initLocalRegistries(ResourceSet)
	 * 
	 * @since 5.0
	 */
	public static void initGlobalRegistries() {
		initEPackageNsURIToProfileLocationMap(UMLPlugin
			.getEPackageNsURIToProfileLocationMap());
		initURIConverterURIMap(URIConverter.URI_MAP);
		initResourceFactoryRegistry(Resource.Factory.Registry.INSTANCE);
	}
	

	/**
	 * Adds resource factories required for working with UML models to the
	 * specified registry.
	 * 
	 * @param resourceFactoryRegistry
	 *            a resource-factory registry, perhaps local to a resource set
	 *            or perhaps the global registry
	 * 
	 * @return the same {@code resourceFactoryRegistry}
	 * 
	 * @since 5.0
	 */
	public static Resource.Factory.Registry initResourceFactoryRegistry(
			Resource.Factory.Registry resourceFactoryRegistry) {
		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry
			.getExtensionToFactoryMap();
		extensionToFactoryMap.put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE);

		Map<String, Object> contentTypeToFactoryMap = resourceFactoryRegistry
			.getContentTypeToFactoryMap();
		contentTypeToFactoryMap.put(UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
			UMLResource.Factory.INSTANCE);

		return resourceFactoryRegistry;
	}
	/**
	 * Adds resource URI mappings required for working with UML models to the
	 * specified map. These include at least mappings for the UML2-provided
	 * umlPackage libraries, metamodels, and profiles.
	 * 
	 * @param uriMap
	 *            a URI map, perhaps local to a resource set or perhaps the
	 *            global URI map
	 * 
	 * @return the same {@code uriMap}
	 * 
	 * @since 5.0
	 */
	public static Map<URI, URI> initURIConverterURIMap(Map<URI, URI> uriMap) {
		URI baseURI = getBaseUMLResourceURI();
		mapUMLResourceURIs(uriMap, UMLResource.METAMODELS_PATHMAP,
			baseURI.appendSegment("metamodels")); //$NON-NLS-1$
		mapUMLResourceURIs(uriMap, UMLResource.PROFILES_PATHMAP,
			baseURI.appendSegment("profiles")); //$NON-NLS-1$
		mapUMLResourceURIs(uriMap, UMLResource.LIBRARIES_PATHMAP,
			baseURI.appendSegment("libraries")); //$NON-NLS-1$

		return uriMap;
	}

	/**
	 * Adds profile namespace URI mappings required for working with UML models
	 * to the specified map. These include at least mappings for the
	 * UML2-provided profiles.
	 * 
	 * @param ePackageNsURIToProfileLocationMap
	 *            a profile location map, perhaps local to a resource set or
	 *            perhaps the global location map
	 * 
	 * @return the same {@code ePackageNsURIToProfileLocationMap}
	 * 
	 * @since 5.0
	 */
	public static Map<String, URI> initEPackageNsURIToProfileLocationMap(
			Map<String, URI> ePackageNsURIToProfileLocationMap) {
		ePackageNsURIToProfileLocationMap.put(UMLResource.ECORE_PROFILE_NS_URI,
			URI.createURI("pathmap://UML_PROFILES/Ecore.profile.uml#_0")); //$NON-NLS-1$

		ePackageNsURIToProfileLocationMap.put(UMLResource.UML2_PROFILE_NS_URI,
			URI.createURI("pathmap://UML_PROFILES/UML2.profile.uml#_0")); //$NON-NLS-1$

		return ePackageNsURIToProfileLocationMap;
	}

	private static URI getBaseUMLResourceURI() {
		URI umlMetamodel = URI.createURI(UMLResource.UML_METAMODEL_URI);
		URL resultURL = ExtendedUMLResourcesUtil.class.getClassLoader().getResource(
			String.format("metamodels/%s", umlMetamodel.lastSegment())); //$NON-NLS-1$

		URI result;

		if (resultURL != null) {
			// remove the /metamodel/UML.metamodel.uml segments of the resource
			// we found
			result = URI.createURI(resultURL.toExternalForm(), true)
				.trimSegments(2);
		} else {
			// probably, we're not running with JARs, so assume the source
			// project folder layout
			resultURL = ExtendedUMLResourcesUtil.class
				.getResource("ExtendedUMLResourcesUtil.class"); //$NON-NLS-1$

			String baseURL = resultURL.toExternalForm();
			int binIndex = baseURL.lastIndexOf("/bin/");
			if(binIndex >= 0)
				baseURL = baseURL.substring(0, binIndex); //$NON-NLS-1$
			result = URI.createURI(baseURL, true);
		}

		return result;
	}

	private static void mapUMLResourceURIs(Map<URI, URI> uriMap, String uri,
			URI location) {

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
	
	public static ResourceSet init(ResourceSet resourceSet) {
		initGlobalRegistries();
		return UMLUtil.init(resourceSet);
	}
}

