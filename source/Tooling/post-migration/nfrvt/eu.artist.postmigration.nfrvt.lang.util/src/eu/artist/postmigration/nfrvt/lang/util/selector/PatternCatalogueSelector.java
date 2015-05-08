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
package eu.artist.postmigration.nfrvt.lang.util.selector;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;

public class PatternCatalogueSelector extends MigrationModelSelector<PatternCatalogue> {
	
	/**
	 * Creates a new pattern catalogue selector providing queries to handle
	 * a pattern catalogue.
	 * 
	 * @param catalogue catalogue on which queries can be placed
	 * @see PatternCatalogue
	 */
	public PatternCatalogueSelector(PatternCatalogue catalogue) {
		super(catalogue);
	}
	
	/**
	 * Pattern catalogue handled by this selector.
	 * @return pattern catalogue
	 */
	public PatternCatalogue getPatternCatalogue() {
		return (PatternCatalogue) super.getModel();
	}
	
	/**
	 * Selects the pattern with the given name or null if no such pattern
	 * can be found.
	 * 
	 * @param name pattern name
	 * @return found pattern or null
	 */
	public Pattern selectPattern(String name) {
		return selectFirstFrom(getPatternCatalogue().getPatterns(), toFQN(name), Pattern.class);
	}
}
