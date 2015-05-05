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
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE Basic NFP Types
 * through constants. The package containing those types is located 
 * {@link MARTE_BasicNFPTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_BasicNFPTypes  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_l6ms8A74EdyML4mHwjNDrw";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);

	public interface Element {
		final Package PACKAGE = MARTE_BasicNFPTypes.getInstance().PACKAGE.getElement();
		
		final DataType NFP_DATE_TIME = MARTE_BasicNFPTypes.getInstance().NFP_DATE_TIME.getElement();
		final DataType NFP_PERCENTAGE = MARTE_BasicNFPTypes.getInstance().NFP_PERCENTAGE.getElement();
		final DataType NFP_DATA_TX_RATE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_TX_RATE.getElement();
		final DataType NFP_POWER = MARTE_BasicNFPTypes.getInstance().NFP_POWER.getElement();
		final DataType PERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().PERIODIC_PATTERN.getElement();
		final Enumeration SOURCE_KIND = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND.getElement();
		public interface SOURCE_KIND_LITERALS {
			final EnumerationLiteral EST = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_EST.getElement();
			final EnumerationLiteral MEAS = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_MEAS.getElement();
			final EnumerationLiteral CALC = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_CALC.getElement();
			final EnumerationLiteral REQ = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_REQ.getElement();
		}
		final DataType NFP_AREA = MARTE_BasicNFPTypes.getInstance().NFP_AREA.getElement();
		final DataType NFP_ENERGY = MARTE_BasicNFPTypes.getInstance().NFP_ENERGY.getElement();
		final DataType NFP_STRING = MARTE_BasicNFPTypes.getInstance().NFP_STRING.getElement();
		final DataType NFP_COMMON_TYPE = MARTE_BasicNFPTypes.getInstance().NFP_COMMON_TYPE.getElement();
		final DataType NFP_NATURAL = MARTE_BasicNFPTypes.getInstance().NFP_NATURAL.getElement();
		final DataType OPEN_PATTERN = MARTE_BasicNFPTypes.getInstance().OPEN_PATTERN.getElement();
		final DataType IRREGULAR_PATTERN = MARTE_BasicNFPTypes.getInstance().IRREGULAR_PATTERN.getElement();
		final DataType NFP_PRICE = MARTE_BasicNFPTypes.getInstance().NFP_PRICE.getElement();
		final DataType NFP_INTEGER = MARTE_BasicNFPTypes.getInstance().NFP_INTEGER.getElement();
		final DataType NFP_DATA_SIZE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_SIZE.getElement();
		final DataType SPORADIC_PATTERN = MARTE_BasicNFPTypes.getInstance().SPORADIC_PATTERN.getElement();
		final DataType NFP_LENGTH = MARTE_BasicNFPTypes.getInstance().NFP_LENGTH.getElement();
		final DataType NFP_WEIGHT = MARTE_BasicNFPTypes.getInstance().NFP_WEIGHT.getElement();
		final DataType CLOSED_PATTERN = MARTE_BasicNFPTypes.getInstance().CLOSED_PATTERN.getElement();
		final Enumeration DIRECTION_KIND = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND.getElement();
		public interface DIRECTION_KIND_LITERALS {
			final EnumerationLiteral INCR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_INCR.getElement();
			final EnumerationLiteral DECR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_DECR.getElement();
		}
		final DataType NFP_FREQUENCY = MARTE_BasicNFPTypes.getInstance().NFP_FREQUENCY.getElement();
		final DataType NFP_DURATION = MARTE_BasicNFPTypes.getInstance().NFP_DURATION.getElement();
		final DataType NFP_REAL = MARTE_BasicNFPTypes.getInstance().NFP_REAL.getElement();
		final DataType APERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().APERIODIC_PATTERN.getElement();
		final DataType BURST_PATTERN = MARTE_BasicNFPTypes.getInstance().BURST_PATTERN.getElement();
		final DataType NFP_BOOLEAN = MARTE_BasicNFPTypes.getInstance().NFP_BOOLEAN.getElement();
		final Enumeration STATISTICAL_QUALIFIER_KIND = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND.getElement();
		public interface STATISTICAL_QUALIFIER_KIND_LITERALS {
			final EnumerationLiteral MAX = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MAX.getElement();
			final EnumerationLiteral MIN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MIN.getElement();
			final EnumerationLiteral MEAN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MEAN.getElement();
			final EnumerationLiteral RANGE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_RANGE.getElement();
			final EnumerationLiteral PERCENT = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_PERCENT.getElement();
			final EnumerationLiteral DISTRIB = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DISTRIB.getElement();
			final EnumerationLiteral DETERM = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DETERM.getElement();
			final EnumerationLiteral OTHER = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_OTHER.getElement();
			final EnumerationLiteral VARIANCE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_VARIANCE.getElement();
		}
		final DataType ARRIVAL_PATTERN = MARTE_BasicNFPTypes.getInstance().ARRIVAL_PATTERN.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_BasicNFPTypes.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String NFP_DATE_TIME = MARTE_BasicNFPTypes.getInstance().NFP_DATE_TIME.getFullyQualifiedName();
		final String NFP_PERCENTAGE = MARTE_BasicNFPTypes.getInstance().NFP_PERCENTAGE.getFullyQualifiedName();
		final String NFP_DATA_TX_RATE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_TX_RATE.getFullyQualifiedName();
		final String NFP_POWER = MARTE_BasicNFPTypes.getInstance().NFP_POWER.getFullyQualifiedName();
		final String PERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().PERIODIC_PATTERN.getFullyQualifiedName();
		final String SOURCE_KIND = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND.getFullyQualifiedName();
		public interface SOURCE_KIND_LITERALS {
			final String EST = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_EST.getFullyQualifiedName();
			final String MEAS = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_MEAS.getFullyQualifiedName();
			final String CALC = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_CALC.getFullyQualifiedName();
			final String REQ = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_REQ.getFullyQualifiedName();
		}
		final String NFP_AREA = MARTE_BasicNFPTypes.getInstance().NFP_AREA.getFullyQualifiedName();
		final String NFP_ENERGY = MARTE_BasicNFPTypes.getInstance().NFP_ENERGY.getFullyQualifiedName();
		final String NFP_STRING = MARTE_BasicNFPTypes.getInstance().NFP_STRING.getFullyQualifiedName();
		final String NFP_COMMON_TYPE = MARTE_BasicNFPTypes.getInstance().NFP_COMMON_TYPE.getFullyQualifiedName();
		final String NFP_NATURAL = MARTE_BasicNFPTypes.getInstance().NFP_NATURAL.getFullyQualifiedName();
		final String OPEN_PATTERN = MARTE_BasicNFPTypes.getInstance().OPEN_PATTERN.getFullyQualifiedName();
		final String IRREGULAR_PATTERN = MARTE_BasicNFPTypes.getInstance().IRREGULAR_PATTERN.getFullyQualifiedName();
		final String NFP_PRICE = MARTE_BasicNFPTypes.getInstance().NFP_PRICE.getFullyQualifiedName();
		final String NFP_INTEGER = MARTE_BasicNFPTypes.getInstance().NFP_INTEGER.getFullyQualifiedName();
		final String NFP_DATA_SIZE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_SIZE.getFullyQualifiedName();
		final String SPORADIC_PATTERN = MARTE_BasicNFPTypes.getInstance().SPORADIC_PATTERN.getFullyQualifiedName();
		final String NFP_LENGTH = MARTE_BasicNFPTypes.getInstance().NFP_LENGTH.getFullyQualifiedName();
		final String NFP_WEIGHT = MARTE_BasicNFPTypes.getInstance().NFP_WEIGHT.getFullyQualifiedName();
		final String CLOSED_PATTERN = MARTE_BasicNFPTypes.getInstance().CLOSED_PATTERN.getFullyQualifiedName();
		final String DIRECTION_KIND = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND.getFullyQualifiedName();
		public interface DIRECTION_KIND_LITERALS {
			final String INCR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_INCR.getFullyQualifiedName();
			final String DECR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_DECR.getFullyQualifiedName();
		}
		final String NFP_FREQUENCY = MARTE_BasicNFPTypes.getInstance().NFP_FREQUENCY.getFullyQualifiedName();
		final String NFP_DURATION = MARTE_BasicNFPTypes.getInstance().NFP_DURATION.getFullyQualifiedName();
		final String NFP_REAL = MARTE_BasicNFPTypes.getInstance().NFP_REAL.getFullyQualifiedName();
		final String APERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().APERIODIC_PATTERN.getFullyQualifiedName();
		final String BURST_PATTERN = MARTE_BasicNFPTypes.getInstance().BURST_PATTERN.getFullyQualifiedName();
		final String NFP_BOOLEAN = MARTE_BasicNFPTypes.getInstance().NFP_BOOLEAN.getFullyQualifiedName();
		final String STATISTICAL_QUALIFIER_KIND = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND.getFullyQualifiedName();
		public interface STATISTICAL_QUALIFIER_KIND_LITERALS {
			final String MAX = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MAX.getFullyQualifiedName();
			final String MIN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MIN.getFullyQualifiedName();
			final String MEAN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MEAN.getFullyQualifiedName();
			final String RANGE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_RANGE.getFullyQualifiedName();
			final String PERCENT = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_PERCENT.getFullyQualifiedName();
			final String DISTRIB = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DISTRIB.getFullyQualifiedName();
			final String DETERM = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DETERM.getFullyQualifiedName();
			final String OTHER = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_OTHER.getFullyQualifiedName();
			final String VARIANCE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_VARIANCE.getFullyQualifiedName();
		}
		final String ARRIVAL_PATTERN = MARTE_BasicNFPTypes.getInstance().ARRIVAL_PATTERN.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_BasicNFPTypes.getInstance().PACKAGE.getUri();
		
		final String NFP_DATE_TIME = MARTE_BasicNFPTypes.getInstance().NFP_DATE_TIME.getUri();
		final String NFP_PERCENTAGE = MARTE_BasicNFPTypes.getInstance().NFP_PERCENTAGE.getUri();
		final String NFP_DATA_TX_RATE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_TX_RATE.getUri();
		final String NFP_POWER = MARTE_BasicNFPTypes.getInstance().NFP_POWER.getUri();
		final String PERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().PERIODIC_PATTERN.getUri();
		final String SOURCE_KIND = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND.getUri();
		public interface SOURCE_KIND_LITERALS {
			final String EST = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_EST.getUri();
			final String MEAS = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_MEAS.getUri();
			final String CALC = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_CALC.getUri();
			final String REQ = MARTE_BasicNFPTypes.getInstance().SOURCE_KIND_REQ.getUri();
		}
		final String NFP_AREA = MARTE_BasicNFPTypes.getInstance().NFP_AREA.getUri();
		final String NFP_ENERGY = MARTE_BasicNFPTypes.getInstance().NFP_ENERGY.getUri();
		final String NFP_STRING = MARTE_BasicNFPTypes.getInstance().NFP_STRING.getUri();
		final String NFP_COMMON_TYPE = MARTE_BasicNFPTypes.getInstance().NFP_COMMON_TYPE.getUri();
		final String NFP_NATURAL = MARTE_BasicNFPTypes.getInstance().NFP_NATURAL.getUri();
		final String OPEN_PATTERN = MARTE_BasicNFPTypes.getInstance().OPEN_PATTERN.getUri();
		final String IRREGULAR_PATTERN = MARTE_BasicNFPTypes.getInstance().IRREGULAR_PATTERN.getUri();
		final String NFP_PRICE = MARTE_BasicNFPTypes.getInstance().NFP_PRICE.getUri();
		final String NFP_INTEGER = MARTE_BasicNFPTypes.getInstance().NFP_INTEGER.getUri();
		final String NFP_DATA_SIZE = MARTE_BasicNFPTypes.getInstance().NFP_DATA_SIZE.getUri();
		final String SPORADIC_PATTERN = MARTE_BasicNFPTypes.getInstance().SPORADIC_PATTERN.getUri();
		final String NFP_LENGTH = MARTE_BasicNFPTypes.getInstance().NFP_LENGTH.getUri();
		final String NFP_WEIGHT = MARTE_BasicNFPTypes.getInstance().NFP_WEIGHT.getUri();
		final String CLOSED_PATTERN = MARTE_BasicNFPTypes.getInstance().CLOSED_PATTERN.getUri();
		final String DIRECTION_KIND = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND.getUri();
		public interface DIRECTION_KIND_LITERALS {
			final String INCR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_INCR.getUri();
			final String DECR = MARTE_BasicNFPTypes.getInstance().DIRECTION_KIND_DECR.getUri();
		}
		final String NFP_FREQUENCY = MARTE_BasicNFPTypes.getInstance().NFP_FREQUENCY.getUri();
		final String NFP_DURATION = MARTE_BasicNFPTypes.getInstance().NFP_DURATION.getUri();
		final String NFP_REAL = MARTE_BasicNFPTypes.getInstance().NFP_REAL.getUri();
		final String APERIODIC_PATTERN = MARTE_BasicNFPTypes.getInstance().APERIODIC_PATTERN.getUri();
		final String BURST_PATTERN = MARTE_BasicNFPTypes.getInstance().BURST_PATTERN.getUri();
		final String NFP_BOOLEAN = MARTE_BasicNFPTypes.getInstance().NFP_BOOLEAN.getUri();
		final String STATISTICAL_QUALIFIER_KIND = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND.getUri();
		public interface STATISTICAL_QUALIFIER_KIND_LITERALS {
			final String MAX = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MAX.getUri();
			final String MIN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MIN.getUri();
			final String MEAN = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_MEAN.getUri();
			final String RANGE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_RANGE.getUri();
			final String PERCENT = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_PERCENT.getUri();
			final String DISTRIB = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DISTRIB.getUri();
			final String DETERM = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_DETERM.getUri();
			final String OTHER = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_OTHER.getUri();
			final String VARIANCE = MARTE_BasicNFPTypes.getInstance().STATISTICAL_QUALIFIER_KIND_VARIANCE.getUri();
		}
		final String ARRIVAL_PATTERN = MARTE_BasicNFPTypes.getInstance().ARRIVAL_PATTERN.getUri();
	}

	public final MigrationModelElement<DataType> NFP_DATE_TIME;
	public final MigrationModelElement<DataType> NFP_PERCENTAGE;
	public final MigrationModelElement<DataType> NFP_DATA_TX_RATE;
	public final MigrationModelElement<DataType> NFP_POWER;
	public final MigrationModelElement<DataType> PERIODIC_PATTERN;
	public final MigrationModelElement<Enumeration> SOURCE_KIND;
	public final MigrationModelElement<EnumerationLiteral> SOURCE_KIND_EST;
	public final MigrationModelElement<EnumerationLiteral> SOURCE_KIND_MEAS;
	public final MigrationModelElement<EnumerationLiteral> SOURCE_KIND_CALC;
	public final MigrationModelElement<EnumerationLiteral> SOURCE_KIND_REQ;
	public final MigrationModelElement<DataType> NFP_AREA;
	public final MigrationModelElement<DataType> NFP_ENERGY;
	public final MigrationModelElement<DataType> NFP_STRING;
	public final MigrationModelElement<DataType> NFP_COMMON_TYPE;
	public final MigrationModelElement<DataType> NFP_NATURAL;
	public final MigrationModelElement<DataType> OPEN_PATTERN;
	public final MigrationModelElement<DataType> IRREGULAR_PATTERN;
	public final MigrationModelElement<DataType> NFP_PRICE;
	public final MigrationModelElement<DataType> NFP_INTEGER;
	public final MigrationModelElement<DataType> NFP_DATA_SIZE;
	public final MigrationModelElement<DataType> SPORADIC_PATTERN;
	public final MigrationModelElement<DataType> NFP_LENGTH;
	public final MigrationModelElement<DataType> NFP_WEIGHT;
	public final MigrationModelElement<DataType> CLOSED_PATTERN;
	public final MigrationModelElement<Enumeration> DIRECTION_KIND;
	public final MigrationModelElement<EnumerationLiteral> DIRECTION_KIND_INCR;
	public final MigrationModelElement<EnumerationLiteral> DIRECTION_KIND_DECR;
	public final MigrationModelElement<DataType> NFP_FREQUENCY;
	public final MigrationModelElement<DataType> NFP_DURATION;
	public final MigrationModelElement<DataType> NFP_REAL;
	public final MigrationModelElement<DataType> APERIODIC_PATTERN;
	public final MigrationModelElement<DataType> BURST_PATTERN;
	public final MigrationModelElement<DataType> NFP_BOOLEAN;
	public final MigrationModelElement<Enumeration> STATISTICAL_QUALIFIER_KIND;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_MAX;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_MIN;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_MEAN;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_RANGE;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_PERCENT;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_DISTRIB;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_DETERM;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_OTHER;
	public final MigrationModelElement<EnumerationLiteral> STATISTICAL_QUALIFIER_KIND_VARIANCE;
	public final MigrationModelElement<DataType> ARRIVAL_PATTERN;
	
	private static MARTE_BasicNFPTypes instance;
	
	public static MARTE_BasicNFPTypes getInstance() {
		if(instance == null)
			instance = new MARTE_BasicNFPTypes();
		return instance;
	}
	
	protected MARTE_BasicNFPTypes() {
		super(PACKAGE_URI);
		
		NFP_DATE_TIME = new MigrationModelElement<DataType>(getDataTypeByName("NFP_DateTime"));
		NFP_PERCENTAGE = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Percentage"));
		NFP_DATA_TX_RATE = new MigrationModelElement<DataType>(getDataTypeByName("NFP_DataTxRate"));
		NFP_POWER = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Power"));
		PERIODIC_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("PeriodicPattern"));
		SOURCE_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("SourceKind"));
		SOURCE_KIND_EST = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SourceKind", "est"));
		SOURCE_KIND_MEAS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SourceKind", "meas"));
		SOURCE_KIND_CALC = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SourceKind", "calc"));
		SOURCE_KIND_REQ = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("SourceKind", "req"));
		NFP_AREA = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Area"));
		NFP_ENERGY = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Energy"));
		NFP_STRING = new MigrationModelElement<DataType>(getDataTypeByName("NFP_String"));
		NFP_COMMON_TYPE = new MigrationModelElement<DataType>(getDataTypeByName("NFP_CommonType"));
		NFP_NATURAL = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Natural"));
		OPEN_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("OpenPattern"));
		IRREGULAR_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("IrregularPattern"));
		NFP_PRICE = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Price"));
		NFP_INTEGER = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Integer"));
		NFP_DATA_SIZE = new MigrationModelElement<DataType>(getDataTypeByName("NFP_DataSize"));
		SPORADIC_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("SporadicPattern"));
		NFP_LENGTH = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Length"));
		NFP_WEIGHT = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Weight"));
		CLOSED_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("ClosedPattern"));
		DIRECTION_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("DirectionKind"));
		DIRECTION_KIND_INCR = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DirectionKind", "incr"));
		DIRECTION_KIND_DECR = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DirectionKind", "decr"));
		NFP_FREQUENCY = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Frequency"));
		NFP_DURATION = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Duration"));
		NFP_REAL = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Real"));
		APERIODIC_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("AperiodicPattern"));
		BURST_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("BurstPattern"));
		NFP_BOOLEAN = new MigrationModelElement<DataType>(getDataTypeByName("NFP_Boolean"));
		STATISTICAL_QUALIFIER_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("StatisticalQualifierKind"));
		STATISTICAL_QUALIFIER_KIND_MAX = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "max"));
		STATISTICAL_QUALIFIER_KIND_MIN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "min"));
		STATISTICAL_QUALIFIER_KIND_MEAN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "mean"));
		STATISTICAL_QUALIFIER_KIND_RANGE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "range"));
		STATISTICAL_QUALIFIER_KIND_PERCENT = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "percent"));
		STATISTICAL_QUALIFIER_KIND_DISTRIB = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "distrib"));
		STATISTICAL_QUALIFIER_KIND_DETERM = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "determ"));
		STATISTICAL_QUALIFIER_KIND_OTHER = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "other"));
		STATISTICAL_QUALIFIER_KIND_VARIANCE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("StatisticalQualifierKind", "variance"));
		ARRIVAL_PATTERN = new MigrationModelElement<DataType>(getDataTypeByName("ArrivalPattern"));
	}
	
}
