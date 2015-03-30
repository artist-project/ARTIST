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
package eu.artist.postmigration.nfrvt.lang.util.builder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.Grammar;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.parser.antlr.TSLParser;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.PatternCatalogueSelector;

/**
 * This builder class helps to create or adapt one pattern catalogue instance.
 * 
 * @author Martin Fleck
 * @see PatternCatalogueSelector
 * @see PatternCatalogue
 */
public class PatternCatalogueBuilder extends MigrationModelBuilder<PatternCatalogue> {	
	private PatternCatalogue patternCatalogue;

	/**
	 * Creates an instance of {@link PatternCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty pattern catalogue,
	 * which is only stored in-memory.
	 */
	public PatternCatalogueBuilder() {
		this(new MigrationResourceSet());
	}

	/**
	 * Creates an instance of {@link PatternCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty pattern catalogue,
	 * which is only stored in-memory.
	 * 
	 * @param catalogueName name of the catalogue
	 */
	public PatternCatalogueBuilder(String catalogueName) {
		this(new MigrationResourceSet(), MigrationFactory.createPatternCatalogue(catalogueName));
	}
	
	/**
	 * Creates an instance of {@link PatternCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty pattern catalogue,
	 * which is only stored in-memory.
	 * @param resourceSet resource set to be used
	 */
	public PatternCatalogueBuilder(MigrationResourceSet resourceSet) {
		this(resourceSet, MigrationFactory.createPatternCatalogue(""));
	}
	
	/**
	 * Creates an instance of {@link PatternCatalogueBuilder} with the given
	 * {@link MigrationResourceSet} and the given pattern catalouge. It is not
	 * checked whether the given model is actually contained in the resource
	 * set or whether it is stored only in-memory.
	 * @param resourceSet resource set to be used
	 * @param patternCatalogue pattern catalogue to be used
	 */
	public PatternCatalogueBuilder(MigrationResourceSet resourceSet, PatternCatalogue patternCatalogue) {
		super(resourceSet, patternCatalogue);
		this.patternCatalogue = patternCatalogue;
	}
	
	/**
	 * Creates a new pattern catalogue builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * pattern catalogue that is previously stored at the given uri will 
	 * be replaced. Make sure that the given pattern catalogue fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param patternCatalogueUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see PatternCatalogue
	 */
	public PatternCatalogueBuilder(MigrationResourceSet resourceSet, String patternCatalogueUri, boolean override) {
		this(resourceSet, URI.createURI(adaptUri(patternCatalogueUri)), override);
	}
	
	/**
	 * Creates a new pattern catalogue builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * pattern catalogue that is previously stored at the given uri will 
	 * be replaced. Make sure that the given pattern catalogue fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param patternCatalogueUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see PatternCatalogue
	 */
	public PatternCatalogueBuilder(MigrationResourceSet resourceSet, URI patternCatalogueUri, boolean override) {
		super(resourceSet, null);
		if(override) 
			this.patternCatalogue = getResourceSet().createPatternCatalogue(patternCatalogueUri, override);
		else
			this.patternCatalogue = getResourceSet().loadPatternCatalogue(patternCatalogueUri, true);
		if(this.patternCatalogue == null)
			throw new IllegalArgumentException("No pattern catalogue could be obtained for uri '" + patternCatalogueUri + "'.");
		this.model = patternCatalogue;
	}
	
	@Override
	protected TSLParser getParser() {
		return (TSLParser) super.getParser();
	}

	@Override
	protected Grammar getGrammar() {
		return getParser().getGrammarAccess().getGrammar();
	}
	
	@Override
	protected PatternCatalogueSelector createSelector() {
		return new PatternCatalogueSelector(getPatternCatalogue());
	}
	
	@Override
	public PatternCatalogueSelector getSelector() {
		return ObjectUtil.asClass(super.getSelector(), PatternCatalogueSelector.class);
	}
	
	/**
	 * Returns the pattern catalogue managed by this builder.
	 * 
	 * @return pattern catalogue
	 */
	public PatternCatalogue getPatternCatalogue() {
		return patternCatalogue;
	}
	
	/**
	 * Sets the name of the pattern catalogue.
	 * 
	 * @param name new name of the pattern catalogue
	 * @return this builder instance
	 */
	public PatternCatalogueBuilder setName(String name) {
		getPatternCatalogue().setName(toQualifiedName(name));
		return this;
	}
	
	/**
	 * Returns the name of the pattern catalogue.
	 * 
	 * @return pattern catalogue name
	 */
	public String getName() {
		return getPatternCatalogue().getName();
	}
	
	/**
	 * Adds the given pattern to the pattern catalogue managed by this builder.
	 * If the pattern was previously stored in another pattern catalogue,
	 * it will be removed from that pattern catalogue.
	 *
	 * @param pattern pattern to be added
	 * @return added pattern
	 */
	public Pattern addPattern(Pattern pattern) {
		getPatternCatalogue().getPatterns().add(pattern);
		return pattern;
	}
	
	/**
	 * Adds the pattern specified by the given data to the pattern catalogue
	 * managed by this builder.
	 * 
	 * @param name pattern name, should be unique
	 * @param context context in which this pattern can be applied
	 * @param problem problem this pattern tries to solve
	 * @param solution the way the pattern solves the problem
	 * @return newly created and added pattern
	 */
	public Pattern addPattern(String name, String context, String problem, String solution) {
		return addPattern(MigrationFactory.createPattern(
				name, context, problem, solution, null, null, null));
	}

	/**
	 * Adds the pattern specified by the given data to the pattern catalogue
	 * managed by this builder.
	 * 
	 * @param name pattern name, should be unique
	 * @param context context in which this pattern can be applied
	 * @param problem problem this pattern tries to solve
	 * @param solution the way the pattern solves the problem
	 * @param relatedPatterns related patterns
	 * @return newly created and added pattern
	 */
	public Pattern addPattern(String name, String context, String problem, String solution, Pattern... relatedPatterns) {
		return addPattern(MigrationFactory.createPattern(
				name, context, problem, solution, null, null, Lists.newArrayList(relatedPatterns)));
	}
	
	/**
	 * Adds impact the given source pattern has on the target property with 
	 * the specified impact.
	 * @param source pattern source
	 * @param target property target
	 * @param impact pattern impact
	 * @return newly created and added property impact
	 */
	public PropertyImpact addPropertyImpact(Pattern source, Property target, double impact) {
		PropertyImpact propertyImpact = MigrationFactory.createPropertyImpact(target, impact);
		source.getPropertyImpacts().add(propertyImpact);
		return propertyImpact;
	}
	
	/**
	 * Adds impact the given source pattern has on the target pattern with 
	 * the specified impact.
	 * @param source pattern source
	 * @param target pattern target
	 * @param impact pattern impact
	 * @return newly created and added pattern impact
	 */
	public PatternImpact addPatternImpact(Pattern source, Pattern target, double impact) {
		PatternImpact patternImpact = MigrationFactory.createPatternImpact(target, impact);
		source.getPatternImpacts().add(patternImpact);
		return patternImpact;
	}

	/**
	 * Specifies that the given pattern is related to the source pattern.
	 * 
	 * @param source source pattern
	 * @param relatedPattern related pattern
	 * @return source pattern
	 */
	public Pattern addRelatedPattern(Pattern source, Pattern relatedPattern) {
		source.getRelatedPatterns().add(relatedPattern);
		return source;
	}
	
	/**
	 * Specifies that the given patterns is related to the source pattern.
	 * 
	 * @param source source pattern
	 * @param relatedPatterns related patterns
	 * @return source pattern
	 */
	public Pattern addRelatedPattern(Pattern source, Pattern... relatedPatterns) {
		source.getRelatedPatterns().addAll(Lists.newArrayList(relatedPatterns));
		return source;
	}
	
	/**
	 * Makes sure that the given uriString corresponds to a pattern catalogue 
	 * uri.
	 * 
	 * @param uriString uri string
	 * @return uri string conforming to pattern catalogues
	 */
	protected static String adaptUri(String uriString) {
		if(!FileExtensions.isPatternCatalogue(uriString))
			return uriString + "." + FileExtensions.getPatternCatalogueExtension();
		return uriString;
	}
}