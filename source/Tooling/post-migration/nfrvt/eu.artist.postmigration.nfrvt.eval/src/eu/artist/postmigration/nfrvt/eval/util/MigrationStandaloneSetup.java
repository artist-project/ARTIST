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
package eu.artist.postmigration.nfrvt.eval.util;

import eu.artist.postmigration.nfrvt.lang.esl.ESLStandaloneSetup;
import eu.artist.postmigration.nfrvt.lang.gel.GELStandaloneSetup;
import eu.artist.postmigration.nfrvt.lang.gml.GMLStandaloneSetup;
import eu.artist.postmigration.nfrvt.lang.nsl.NSLStandaloneSetup;
import eu.artist.postmigration.nfrvt.lang.tsl.TSLStandaloneSetup;
import eu.artist.postmigration.nfrvt.lang.uml.uml.UmlSupport;

/**
 * This class provides a way to initialize support for running the ARTIST 
 * migration Xtext languages without the equinox extension registry.
 * 
 * @author Martin Fleck
 */
public class MigrationStandaloneSetup {
	private static boolean initialized = false;
	
	/**
	 * This method initializes support for running the ARTIST migration Xtext
	 * languages without the equinox extension registry. Calling this method
	 * creates the necessary injectors, registers the EMF packages of the 
	 * languages and provides the necessary resource factory and service 
	 * provider for handling the language extensions.
	 * <p/>
	 * Calling this method multiple times has no negative effect.
	 */
	public static void doSetup() {
		if(!initialized) {
			UmlSupport.doSetup();
			NSLStandaloneSetup.doSetup();
			TSLStandaloneSetup.doSetup();
			ESLStandaloneSetup.doSetup();
			GMLStandaloneSetup.doSetup();
			GELStandaloneSetup.doSetup();
			initialized = true;
		}
	}
}
