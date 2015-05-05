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
import org.eclipse.uml2.uml.PrimitiveType;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE Data Types
 * through constants. The package containing those types is located 
 * {@link MARTE_BasicNFPTypes#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_DataTypes  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_g2qR8A74EdyML4mHwjNDrw";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = MARTE_DataTypes.getInstance().PACKAGE.getElement();
		
		final DataType REALNTERVAL = MARTE_DataTypes.getInstance().REALNTERVAL.getElement();
		final DataType UTILITY_TYPE = MARTE_DataTypes.getInstance().UTILITY_TYPE.getElement();
		final DataType REAL_MATRIX = MARTE_DataTypes.getInstance().REAL_MATRIX.getElement();
		final DataType NFP_NATURAL_INTERVAL = MARTE_DataTypes.getInstance().NFP_NATURAL_INTERVAL.getElement();
		final DataType INTERVAL = MARTE_DataTypes.getInstance().INTERVAL.getElement();
		final Enumeration TRANSM_MODE_KIND = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND.getElement();
		public interface TRANSM_MODE_KIND_LITERALS {
			final EnumerationLiteral SIMPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_SIMPLEX.getElement();
			final EnumerationLiteral HALF_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_HALF_DUPLEX.getElement();
			final EnumerationLiteral FULL_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_FULL_DUPLEX.getElement();
		}
		final DataType INTEGER_MATRIX = MARTE_DataTypes.getInstance().INTEGER_MATRIX.getElement();
		final PrimitiveType VSL_EXPRESSION = MARTE_DataTypes.getInstance().VSL_EXPRESSION.getElement();
		final DataType REAL_VECTOR = MARTE_DataTypes.getInstance().REAL_VECTOR.getElement();
		final DataType INTEGER_VECTOR = MARTE_DataTypes.getInstance().INTEGER_VECTOR.getElement();
		final DataType NFP_FREQUENCY_INTERVAL = MARTE_DataTypes.getInstance().NFP_FREQUENCY_INTERVAL.getElement();
		final DataType ARRAY = MARTE_DataTypes.getInstance().ARRAY.getElement();
		final DataType INTEGER_INTERVAL = MARTE_DataTypes.getInstance().INTEGER_INTERVAL.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_DataTypes.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String REALNTERVAL = MARTE_DataTypes.getInstance().REALNTERVAL.getFullyQualifiedName();
		final String UTILITY_TYPE = MARTE_DataTypes.getInstance().UTILITY_TYPE.getFullyQualifiedName();
		final String REAL_MATRIX = MARTE_DataTypes.getInstance().REAL_MATRIX.getFullyQualifiedName();
		final String NFP_NATURAL_INTERVAL = MARTE_DataTypes.getInstance().NFP_NATURAL_INTERVAL.getFullyQualifiedName();
		final String INTERVAL = MARTE_DataTypes.getInstance().INTERVAL.getFullyQualifiedName();
		final String TRANSM_MODE_KIND = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND.getFullyQualifiedName();
		public interface TRANSM_MODE_KIND_LITERALS {
			final String SIMPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_SIMPLEX.getFullyQualifiedName();
			final String HALF_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_HALF_DUPLEX.getFullyQualifiedName();
			final String FULL_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_FULL_DUPLEX.getFullyQualifiedName();
		}
		final String INTEGER_MATRIX = MARTE_DataTypes.getInstance().INTEGER_MATRIX.getFullyQualifiedName();
		final String VSL_EXPRESSION = MARTE_DataTypes.getInstance().VSL_EXPRESSION.getFullyQualifiedName();
		final String REAL_VECTOR = MARTE_DataTypes.getInstance().REAL_VECTOR.getFullyQualifiedName();
		final String INTEGER_VECTOR = MARTE_DataTypes.getInstance().INTEGER_VECTOR.getFullyQualifiedName();
		final String NFP_FREQUENCY_INTERVAL = MARTE_DataTypes.getInstance().NFP_FREQUENCY_INTERVAL.getFullyQualifiedName();
		final String ARRAY = MARTE_DataTypes.getInstance().ARRAY.getFullyQualifiedName();
		final String INTEGER_INTERVAL = MARTE_DataTypes.getInstance().INTEGER_INTERVAL.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_DataTypes.getInstance().PACKAGE.getUri();
		
		final String REALNTERVAL = MARTE_DataTypes.getInstance().REALNTERVAL.getUri();
		final String UTILITY_TYPE = MARTE_DataTypes.getInstance().UTILITY_TYPE.getUri();
		final String REAL_MATRIX = MARTE_DataTypes.getInstance().REAL_MATRIX.getUri();
		final String NFP_NATURAL_INTERVAL = MARTE_DataTypes.getInstance().NFP_NATURAL_INTERVAL.getUri();
		final String INTERVAL = MARTE_DataTypes.getInstance().INTERVAL.getUri();
		final String TRANSM_MODE_KIND = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND.getUri();
		public interface TRANSM_MODE_KIND_LITERALS {
			final String SIMPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_SIMPLEX.getUri();
			final String HALF_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_HALF_DUPLEX.getUri();
			final String FULL_DUPLEX = MARTE_DataTypes.getInstance().TRANSM_MODE_KIND_FULL_DUPLEX.getUri();
		}
		final String INTEGER_MATRIX = MARTE_DataTypes.getInstance().INTEGER_MATRIX.getUri();
		final String VSL_EXPRESSION = MARTE_DataTypes.getInstance().VSL_EXPRESSION.getUri();
		final String REAL_VECTOR = MARTE_DataTypes.getInstance().REAL_VECTOR.getUri();
		final String INTEGER_VECTOR = MARTE_DataTypes.getInstance().INTEGER_VECTOR.getUri();
		final String NFP_FREQUENCY_INTERVAL = MARTE_DataTypes.getInstance().NFP_FREQUENCY_INTERVAL.getUri();
		final String ARRAY = MARTE_DataTypes.getInstance().ARRAY.getUri();
		final String INTEGER_INTERVAL = MARTE_DataTypes.getInstance().INTEGER_INTERVAL.getUri();
	}

	public final MigrationModelElement<DataType> REALNTERVAL;
	public final MigrationModelElement<DataType> UTILITY_TYPE;
	public final MigrationModelElement<DataType> REAL_MATRIX;
	public final MigrationModelElement<DataType> NFP_NATURAL_INTERVAL;
	public final MigrationModelElement<DataType> INTERVAL;
	public final MigrationModelElement<Enumeration> TRANSM_MODE_KIND;
	public final MigrationModelElement<EnumerationLiteral> TRANSM_MODE_KIND_SIMPLEX;
	public final MigrationModelElement<EnumerationLiteral> TRANSM_MODE_KIND_HALF_DUPLEX;
	public final MigrationModelElement<EnumerationLiteral> TRANSM_MODE_KIND_FULL_DUPLEX;
	public final MigrationModelElement<DataType> INTEGER_MATRIX;
	public final MigrationModelElement<PrimitiveType> VSL_EXPRESSION;
	public final MigrationModelElement<DataType> REAL_VECTOR;
	public final MigrationModelElement<DataType> INTEGER_VECTOR;
	public final MigrationModelElement<DataType> NFP_FREQUENCY_INTERVAL;
	public final MigrationModelElement<DataType> ARRAY;
	public final MigrationModelElement<DataType> INTEGER_INTERVAL;
	
	private static MARTE_DataTypes instance;
	
	public static MARTE_DataTypes getInstance() {
		if(instance == null)
			instance = new MARTE_DataTypes();
		return instance;
	}
	
	protected MARTE_DataTypes() {
		super(PACKAGE_URI);

		REALNTERVAL = new MigrationModelElement<DataType>(getDataTypeByName("Realnterval"));
		UTILITY_TYPE = new MigrationModelElement<DataType>(getDataTypeByName("UtilityType"));
		REAL_MATRIX = new MigrationModelElement<DataType>(getDataTypeByName("RealMatrix"));
		NFP_NATURAL_INTERVAL = new MigrationModelElement<DataType>(getDataTypeByName("NFP_NaturalInterval"));
		INTERVAL = new MigrationModelElement<DataType>(getDataTypeByName("Interval"));
		TRANSM_MODE_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TransmModeKind"));
		TRANSM_MODE_KIND_SIMPLEX = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TransmModeKind", "simplex"));
		TRANSM_MODE_KIND_HALF_DUPLEX = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TransmModeKind", "halfDuplex"));
		TRANSM_MODE_KIND_FULL_DUPLEX = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TransmModeKind", "fullDuplex"));
		INTEGER_MATRIX = new MigrationModelElement<DataType>(getDataTypeByName("IntegerMatrix"));
		VSL_EXPRESSION = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("VSL_Expression"));
		REAL_VECTOR = new MigrationModelElement<DataType>(getDataTypeByName("RealVector"));
		INTEGER_VECTOR = new MigrationModelElement<DataType>(getDataTypeByName("IntegerVector"));
		NFP_FREQUENCY_INTERVAL = new MigrationModelElement<DataType>(getDataTypeByName("NFP_FrequencyInterval"));
		ARRAY = new MigrationModelElement<DataType>(getDataTypeByName("Array"));
		INTEGER_INTERVAL = new MigrationModelElement<DataType>(getDataTypeByName("IntegerInterval"));
	}
}
