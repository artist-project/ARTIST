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
package eu.artist.premigration.tft.nfrvt.resources;

import org.eclipse.emf.common.util.URI;

import eu.artist.postmigration.nfrvt.eval.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.eval.util.MigrationStandaloneSetup;

/**
 * A convenience class for the examples. It provides the necessary resource
 * URIs as well as a method to create a {@link MigrationResourceSet} already
 * loaded with all the resources.
 * 
 * @author Martin Fleck
 *
 */
public class ARTISTResources {
	/**
	 * Property catalogue with non-functional properties:<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTISTnfp.nsl
	 */
	public static URI NFP_PROPERTIES_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTIST_NFPCatalogue.nsl");
	/**
	 * Property catalogue with static properties:<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTISTstatic.nsl
	 */
	public static URI STATIC_PROPERTIES_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTIST_StaticPropertyCatalogue.nsl");
	/**
	 * Pattern catalogue with optimization patterns:<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTISTpattern.tsl
	 */
	public static URI PATTERN_CATALOGUE_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTIST_PatternCatalogue.tsl");
	/**
	 * Strategy catalogue with evaluation strategies:<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTISTstrategies.esl
	 */
	public static URI STRATEGY_CATALOGUE_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTIST_StrategyCatalogue.esl");
	
	/**
	 * Already existing MARTE library:<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/MARTE/MARTE_Library.library.uml
	 */
	public static URI MARTE_LIBRARY_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/MARTE/MARTE_Library.library.uml");

	/**
	 * Simple ARTIST library (to be extended):<br/>
	 * platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTISTPrimitiveTypes.uml
	 */
	public static URI ARTIST_LIBRARY_URI = URI.createURI("platform:/plugin/eu.artist.premigration.tft/resources/ARTIST/ARTIST_Types.library.uml");
	
	/**
	 * Creates a {@link MigrationResourceSet} with all the basic resources for
	 * our examples, i.e., the property catalogues, the pattern catalogue, the
	 * evaluation strategy catalogue and the MARTE and ARTIST library.
	 * 
	 * @return migration resource set with loaded resources
	 */
	public static MigrationResourceSet createResourceSet() {
		MigrationStandaloneSetup.doSetup();
		MigrationResourceSet set = new MigrationResourceSet();
		set.loadPropertyCatalogue(NFP_PROPERTIES_URI);
		set.loadPropertyCatalogue(STATIC_PROPERTIES_URI);
		set.loadPatternCatalogue(PATTERN_CATALOGUE_URI);
		set.loadUMLModel(ARTIST_LIBRARY_URI);
		set.loadEvaluationStrategyCatalogue(STRATEGY_CATALOGUE_URI);
		set.loadUMLPackage(MARTE_LIBRARY_URI);
		return set;
	}
}
