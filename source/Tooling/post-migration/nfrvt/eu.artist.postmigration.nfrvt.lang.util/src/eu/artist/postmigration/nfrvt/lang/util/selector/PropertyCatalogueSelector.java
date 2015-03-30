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

import java.util.List;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.util.selector.query.ClassQuery;

public class PropertyCatalogueSelector extends MigrationModelSelector<PropertyCatalogue> {
	/**
	 * Creates a new property catalogue selector providing queries to handle
	 * a property catalogue.
	 * 
	 * @param catalogue catalogue on which queries can be placed
	 * @see PropertyCatalogue
	 */
	public PropertyCatalogueSelector(PropertyCatalogue catalogue) {
		super(catalogue);
	}
	
	/**
	 * Property catalogue handled by this selector.
	 * @return property catalogue
	 */
	public PropertyCatalogue getPropertyCatalogue() {
		return (PropertyCatalogue) super.getModel();
	}
	
	/**
	 * Selects all quantitative properties from the property catalogue.
	 * 
	 * @return all found quantitative properties
	 */
	public List<QuantitativeProperty> selectQuantitativeProperties() {
		return selectFrom(getPropertyCatalogue().getProperties(), new ClassQuery<>(QuantitativeProperty.class));
	}
	
	/**
	 * Selects all base quantitative properties from the property catalogue.
	 * 
	 * @return all found base quantitative properties
	 */
	public List<BaseQuantitativeProperty> selectBaseQuantitativeProperties() {
		return selectFrom(getPropertyCatalogue().getProperties(), new ClassQuery<>(BaseQuantitativeProperty.class));
	}
	
	/**
	 * Selects all derived properties from the property catalogue.
	 * 
	 * @return all found derived properties
	 */
	public List<DerivedQuantitativeProperty> selectDerivedQuantitativeProperties() {
		return selectFrom(getPropertyCatalogue().getProperties(), new ClassQuery<>(DerivedQuantitativeProperty.class));
	}
	
	/**
	 * Selects all qualitative properties from the property catalogue.
	 * 
	 * @return all found qualitative properties
	 */
	public List<QualitativeProperty> selectQualitativeProperties() {
		return selectFrom(getPropertyCatalogue().getProperties(), new ClassQuery<>(QualitativeProperty.class));
	}
	
	/**
	 * Select the quantitative property with the given name or null if no such
	 * property can be found.
	 * 
	 * @param name property name
	 * @return property or null if no such property can be found
	 */
	public QuantitativeProperty selectQuantitativeProperty(String name) {
		return selectFirstFrom(getPropertyCatalogue().getProperties(), toFQN(name), QuantitativeProperty.class);
	}
	
	/**
	 * Select the base quantitative property with the given name or null if no 
	 * such property can be found.
	 * 
	 * @param name property name
	 * @return property or null if no such property can be found
	 */
	public BaseQuantitativeProperty selectBaseQuantitativeProperty(String name) {
		return selectFirstFrom(getPropertyCatalogue().getProperties(), toFQN(name), BaseQuantitativeProperty.class);
	}
	
	/**
	 * Select the derived property with the given name or null if no such
	 * property can be found.
	 * 
	 * @param name property name
	 * @return property or null if no such property can be found
	 */
	public DerivedQuantitativeProperty selectDerivedQuantitativeProperty(String name) {
		return selectFirstFrom(getPropertyCatalogue().getProperties(), toFQN(name), DerivedQuantitativeProperty.class);
	}
	
	/**
	 * Select the qualitative property with the given name or null if no such
	 * property can be found.
	 * 
	 * @param name property name
	 * @return property or null if no such property can be found
	 */
	public QualitativeProperty selectQualitativeProperty(String name) {
		return selectFirstFrom(getPropertyCatalogue().getProperties(), toFQN(name), QualitativeProperty.class);
	}
	
	/**
	 * Select the property with the given name or null if no such
	 * property can be found.
	 * 
	 * @param name property name
	 * @return property or null if no such property can be found
	 */
	public Property selectProperty(String name) {
		return selectFirstFrom(getPropertyCatalogue().getProperties(), toFQN(name), Property.class);
	}
}
