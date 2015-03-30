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

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.resource.XtextResource;

import com.google.common.collect.Lists;

import eu.artist.postmigration.nfrvt.extensionpoint.FileExtensions;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.common.artistCommon.NumberLiteral;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.parser.antlr.NSLParser;
import eu.artist.postmigration.nfrvt.lang.util.MigrationFactory;
import eu.artist.postmigration.nfrvt.lang.util.MigrationResourceSet;
import eu.artist.postmigration.nfrvt.lang.util.ObjectUtil;
import eu.artist.postmigration.nfrvt.lang.util.selector.MigrationModelSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.PropertyCatalogueSelector;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.FQNQuery;

/**
 * This builder class helps to create or adapt one property catalogue instance.
 * 
 * @author Martin Fleck
 * @see PropertyCatalogueSelector
 * @see PropertyCatalogue
 */
public class PropertyCatalogueBuilder extends MigrationModelBuilder<PropertyCatalogue> {	
	private PropertyCatalogue propertyCatalogue;

	/**
	 * Creates an instance of {@link PropertyCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty property catalogue,
	 * which is only stored in-memory.
	 */
	public PropertyCatalogueBuilder() {
		this(new MigrationResourceSet());
	}
	
	/**
	 * Creates an instance of {@link PropertyCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty property catalogue,
	 * which is only stored in-memory.
	 * 
	 * @param catalogueName name of the catalogue
	 */
	public PropertyCatalogueBuilder(String catalogueName) {
		this(new MigrationResourceSet(), MigrationFactory.createPropertyCatalogue(catalogueName));
	}
	
	/**
	 * Creates an instance of {@link PropertyCatalogueBuilder} with an empty
	 * {@link MigrationResourceSet} and creates an empty property catalogue,
	 * which is only stored in-memory.
	 * @param resourceSet resource set to be used
	 */
	public PropertyCatalogueBuilder(MigrationResourceSet resourceSet) {
		this(resourceSet, MigrationFactory.createPropertyCatalogue(""));
	}
	
	/**
	 * Creates an instance of {@link PropertyCatalogueBuilder} with the given
	 * {@link MigrationResourceSet} and the given property catalogue. It is not
	 * checked whether the given model is actually contained in the resource
	 * set or whether it is stored only in-memory.
	 * @param resourceSet resource set to be used
	 * @param propertyCatalogue property catalogue to be used
	 */
	public PropertyCatalogueBuilder(MigrationResourceSet resourceSet, PropertyCatalogue propertyCatalogue) {
		super(resourceSet, propertyCatalogue);
		this.propertyCatalogue = propertyCatalogue;
	}
	
	/**
	 * Creates a new property catalogue builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * property catalogue that is previously stored at the given uri will 
	 * be replaced. Make sure that the given property catalogue fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param propertyCatalogueUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see PropertyCatalogue
	 */
	public PropertyCatalogueBuilder(MigrationResourceSet resourceSet, String propertyCatalogueUri, boolean override) {
		this(resourceSet, URI.createURI(adaptUri(propertyCatalogueUri)), override);
	}
	
	/**
	 * Creates a new property catalogue builder with the given migration 
	 * resource set for the given uri. If override is set to true, the 
	 * property catalogue that is previously stored at the given uri will 
	 * be replaced. Make sure that the given property catalogue fulfills 
	 * all constraints before saving it.
	 * 
	 * @param resourceSet resource set to be used for the goal model
	 * @param propertyCatalogueUri model uri
	 * @param override if true, model at uri will be overriden
	 * 
	 * @see MigrationResourceSet
	 * @see PropertyCatalogue
	 */
	public PropertyCatalogueBuilder(MigrationResourceSet resourceSet, URI propertyCatalogueUri, boolean override) {
		super(resourceSet, null);
		if(override) 
			this.propertyCatalogue = getResourceSet().createPropertyCatalogue(propertyCatalogueUri, override);
		else
			this.propertyCatalogue = getResourceSet().loadPropertyCatalogue(propertyCatalogueUri, true);
		if(this.propertyCatalogue == null)
			throw new IllegalArgumentException("No property catalogue could be obtained for uri '" + propertyCatalogueUri + "'.");
		this.model = propertyCatalogue;
	}
	
	@Override
	protected NSLParser getParser() {
		return (NSLParser) super.getParser();
	}

	@Override
	protected Grammar getGrammar() {
		return getParser().getGrammarAccess().getGrammar();
	}

	@Override
	protected PropertyCatalogueSelector createSelector() {
		return new PropertyCatalogueSelector(getPropertyCatalogue());
	}
	
	@Override
	public PropertyCatalogueSelector getSelector() {
		return ObjectUtil.asClass(super.getSelector(), PropertyCatalogueSelector.class);
	}
	
	/**
	 * Returns the property catalogue managed by this builder.
	 * 
	 * @return property catalogue
	 */	
	public PropertyCatalogue getPropertyCatalogue() {
		return propertyCatalogue;
	}
	
	/**
	 * Sets the name of the property catalogue.
	 * 
	 * @param name new name of the property catalogue
	 * @return this builder instance
	 */
	public PropertyCatalogueBuilder setName(String name) {
		getPropertyCatalogue().setName(toQualifiedName(name));
		return this;
	}
	
	/**
	 * Returns the name of the property catalogue.
	 * 
	 * @return property catalogue name
	 */
	public String getName() {
		return getPropertyCatalogue().getName();
	}
	
	/**
	 * Adds the given property to the property catalogue managed by this 
	 * builder.
	 * @param property property to be added
	 * @return added property
	 */
	public QualitativeProperty addQualitativeProperty(QualitativeProperty property) {
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param directionKind direction of the property, i.e., in which the 
	 * desired values can be found
	 * @return newly created and added property
	 */
	public QualitativeProperty addQualitativeProperty(String name, String description, DirectionKind directionKind) {
		return addQualitativeProperty(MigrationFactory.createQualitativeProperty(name, description, directionKind));
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param directionKind direction of the property, i.e., in which the 
	 * desired values can be found
	 * @param subProperties sub-properties of the new property
	 * @return newly created and added property
	 */
	public QualitativeProperty addQualitativeProperty(String name, String description, DirectionKind directionKind, Property... subProperties) {
		QualitativeProperty property = MigrationFactory.createQualitativeProperty(name, description, directionKind, Lists.newArrayList(subProperties), null);
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param subProperties sub-properties of the new property
	 * @return newly created and added property
	 */	
	public QualitativeProperty addQualitativeProperty(String name, String description, Property... subProperties) {
		QualitativeProperty property = MigrationFactory.createQualitativeProperty(name, description, null, Lists.newArrayList(subProperties), null);
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the given property to the property catalogue managed by this 
	 * builder.
	 * 
	 * @param property property to be added
	 * @return added property
	 */
	public BaseQuantitativeProperty addQuantitativeProperty(BaseQuantitativeProperty property) {
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param type data type for this propertys values
	 * @return newly created and added property
	 */
	public BaseQuantitativeProperty addQuantitativeProperty(String name, String description, DataType type) {
		return addQuantitativeProperty(MigrationFactory.createBaseQuantitativeProperty(name, description, type));
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param type data type for this propertys values
	 * @param directionKind direction of the property, i.e., in which the 
	 * desired values can be found
	 * @return newly created and added property
	 */
	public BaseQuantitativeProperty addQuantitativeProperty(String name, String description, DataType type, DirectionKind directionKind) {
		BaseQuantitativeProperty property = MigrationFactory.createBaseQuantitativeProperty(name, description, type, directionKind);
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the given property to the property catalogue managed by this 
	 * builder.
	 * 
	 * @param property property to be added
	 * @return added property
	 */
	public DerivedQuantitativeProperty addDerivedProperty(DerivedQuantitativeProperty property) {
		getPropertyCatalogue().getProperties().add(property);
		return property;
	}
	
	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param type data type for this propertys values
	 * @param directionKind direction of the property, i.e., in which the 
	 * desired values can be found
	 * @param expression formula how the derived property is calculated
	 * @return newly created and added property
	 */
	public DerivedQuantitativeProperty addDerivedProperty(String name, String description, DataType type, DirectionKind directionKind, ArithmeticExpression expression) {
		return addDerivedProperty(MigrationFactory.createDerivedQuantitativeProperty(name, description, type, directionKind, expression));
	}

	/**
	 * Adds the property defined by the given data to the property catalogue 
	 * managed by this builder.
	 * The given expression will be parsed into the respective objects.
	 * Therefore the expression must conform to the textual notation as
	 * it is shown in the xtext editors.
	 * If the expression can not be parsed and the property can not be 
	 * created, null will be returned.
	 * 
	 * @param name name of the property, should be unique
	 * @param description description of the property
	 * @param type data type for this propertys values
	 * @param directionKind direction of the property, i.e., in which the 
	 * desired values can be found
	 * @param arithmeticExpressionString formula how the derived property is calculated
	 * @return newly created and added property or null
	 */
	public DerivedQuantitativeProperty addDerivedProperty(String name, String description, DataType type, DirectionKind directionKind, String arithmeticExpressionString) {
		// to handle the serialized form of a model element, we need to transform the whole document
		// to its serialized form (which creates the node model) and then pick out the respective 
		// eobject (semantic element) and integrate it into the goal model
		
		Long time = System.currentTimeMillis();
		String temporaryID = "ID" + Long.toString(time);
						
		// use a temporary expression as a placeholder until we get the correct condition
		NumberLiteral tempExpression = MigrationFactory.createNumberLiteral(time);
		DerivedQuantitativeProperty derivedProperty = addDerivedProperty(
				temporaryID, 
				description, 
				type, 
				directionKind,
				tempExpression);
						
		XtextResource tempResource = null;
		DerivedQuantitativeProperty tempProperty = null;
		try {
			// serialize complete temporary document string and replace temporary id with given conditionString
			String tempDocumentString = toDocumentString();
			int tempConditionIndex = tempDocumentString.lastIndexOf(tempExpression.getValue().toString());
			if(tempConditionIndex == -1)
				throw new IllegalArgumentException("Something went wrong.");
			String beforeTempExpression = tempDocumentString.substring(0, tempConditionIndex);
			String afterTempExpression = tempDocumentString.substring(tempConditionIndex + tempExpression.getValue().toString().length());
			tempDocumentString = beforeTempExpression + escape(arithmeticExpressionString) + afterTempExpression;
			
			// parse temporary document back into the semantic domain (eobjects)
			tempResource = createSyntheticResource(
					temporaryID, 
					FileExtensions.getPropertyCatalogueExtension(),
					tempDocumentString);
			
			tempProperty = MigrationModelSelector.selectFirst(
					tempResource, new FQNQuery<>(DerivedQuantitativeProperty.class, toFQN(temporaryID)));
			
			// replace the temporary expression with the correct condition and correct references to document 
			// elements if necessary
			derivedProperty.setExpression(EcoreUtil2.copy(tempProperty.getExpression()));
			for(Iterator<EObject> it = derivedProperty.getExpression().eAllContents(); it.hasNext();) {
				EObject object = it.next();
				if(object instanceof QuantitativePropertyExpression) {
					QuantitativePropertyExpression e = (QuantitativePropertyExpression) object;
					if(e.getValue().getName() == null)
						throw new IllegalArgumentException("Could not find QuantitativeProperty with the specified name.");
					QuantitativeProperty property = getSelector().selectQuantitativeProperty(e.getValue().getName());
					e.setValue(property);
				}
			}
			derivedProperty.setName(name);
		} catch (Exception e) {
			System.err.println("Derived Property '" + name + "' not created: " + e.getMessage());
			// clean up temporary content
			if(tempResource != null) {
				removeResource(tempResource);
				tempResource.getContents().clear();
			}			
					
			// remove already created property with wrong expression
			getPropertyCatalogue().getProperties().remove(derivedProperty);
			derivedProperty = null;
		}
		return derivedProperty;
	}
	
	/**
	 * Adds the property impact created from the given data.
	 * 
	 * @param source source property
	 * @param target target property
	 * @param impact impact that the source has on the target
	 * @return newly created and added property impact
	 */
	public PropertyImpact addPropertyImpact(Property source, Property target, double impact) {
		PropertyImpact propertyImpact = MigrationFactory.createPropertyImpact(target, impact);
		source.getImpacts().add(propertyImpact);
		return propertyImpact;
	}
	
	/**
	 * Makes sure that the given uriString corresponds to a pattern property
	 * uri.
	 * 
	 * @param uriString uri string
	 * @return uri string conforming to property catalogues
	 */
	protected static String adaptUri(String uriString) {
		if(!FileExtensions.isPropertyCatalogue(uriString))
			return uriString + "." + FileExtensions.getPropertyCatalogueExtension();
		return uriString;
	}
}
