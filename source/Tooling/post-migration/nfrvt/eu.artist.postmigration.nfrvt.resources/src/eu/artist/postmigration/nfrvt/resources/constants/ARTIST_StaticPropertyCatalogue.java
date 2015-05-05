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
package eu.artist.postmigration.nfrvt.resources.constants;

import org.eclipse.emf.common.util.URI;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.resources.MigrationLibraryResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * The ARTIST Static Property Catalogue contains a set of static properties
 * collected during the ARTIST project. This convenience class provides access 
 * to all elements of that catalogue through constants. The library itself is 
 * located at {@link ARTIST_StaticPropertyCatalogue#CATALOGUE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class ARTIST_StaticPropertyCatalogue extends AbstractPropertyCatalogue {
	public static final String CATALOGUE_URI_STRING = MigrationLibraryResourcesUtil.BASE_PATHMAP + "ARTIST_StaticPropertyCatalogue.prop";
	public static final URI CATALOGUE_URI = URI.createURI(CATALOGUE_URI_STRING);

	public interface Element {
		final PropertyCatalogue CATALOGUE = ARTIST_StaticPropertyCatalogue.getInstance().CATALOGUE.getElement();
		
		final BaseQuantitativeProperty CLOUD_PROVIDER = ARTIST_StaticPropertyCatalogue.getInstance().CLOUD_PROVIDER.getElement();
		final BaseQuantitativeProperty PROGRAMMING_LANGUAGE = ARTIST_StaticPropertyCatalogue.getInstance().PROGRAMMING_LANGUAGE.getElement();
		final BaseQuantitativeProperty DATABASE_TYPE = ARTIST_StaticPropertyCatalogue.getInstance().DATABASE_TYPE.getElement();
		final BaseQuantitativeProperty LINES_OF_CODE = ARTIST_StaticPropertyCatalogue.getInstance().LINES_OF_CODE.getElement();
	}
	public interface FQN {
		final String CATALOGUE = ARTIST_StaticPropertyCatalogue.getInstance().CATALOGUE.getFullyQualifiedName();
		
		final String CLOUD_PROVIDER = ARTIST_StaticPropertyCatalogue.getInstance().CLOUD_PROVIDER.getFullyQualifiedName();
		final String PROGRAMMING_LANGUAGE = ARTIST_StaticPropertyCatalogue.getInstance().PROGRAMMING_LANGUAGE.getFullyQualifiedName();
		final String DATABASE_TYPE = ARTIST_StaticPropertyCatalogue.getInstance().DATABASE_TYPE.getFullyQualifiedName();
		final String LINES_OF_CODE = ARTIST_StaticPropertyCatalogue.getInstance().LINES_OF_CODE.getFullyQualifiedName();
	}
	public interface Uri {
		final String CATALOGUE = ARTIST_StaticPropertyCatalogue.getInstance().CATALOGUE.getUri();
		
		final String CLOUD_PROVIDER = ARTIST_StaticPropertyCatalogue.getInstance().CLOUD_PROVIDER.getUri();
		final String PROGRAMMING_LANGUAGE = ARTIST_StaticPropertyCatalogue.getInstance().PROGRAMMING_LANGUAGE.getUri();
		final String DATABASE_TYPE = ARTIST_StaticPropertyCatalogue.getInstance().DATABASE_TYPE.getUri();
		final String LINES_OF_CODE = ARTIST_StaticPropertyCatalogue.getInstance().LINES_OF_CODE.getUri();
	}
	
	public final MigrationModelElement<BaseQuantitativeProperty> CLOUD_PROVIDER;
	public final MigrationModelElement<BaseQuantitativeProperty> PROGRAMMING_LANGUAGE;
	public final MigrationModelElement<BaseQuantitativeProperty> DATABASE_TYPE;
	public final MigrationModelElement<BaseQuantitativeProperty> LINES_OF_CODE;
	
	private static ARTIST_StaticPropertyCatalogue instance;
	
	public static ARTIST_StaticPropertyCatalogue getInstance() {
		if(instance == null)
			instance = new ARTIST_StaticPropertyCatalogue();
		return instance;
	}
	
	protected ARTIST_StaticPropertyCatalogue() {
		super(CATALOGUE_URI_STRING);
		
		CLOUD_PROVIDER = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("CloudProvider"));
		PROGRAMMING_LANGUAGE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("ProgrammingLanguage"));
		DATABASE_TYPE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("DatabaseType"));
		LINES_OF_CODE = new MigrationModelElement<BaseQuantitativeProperty>(getBaseQuantitativePropertyByName("LinesOfCode"));
	}

}
