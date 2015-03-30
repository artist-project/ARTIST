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
 * A convenience class that provides access to all MARTE Time Library Types
 * and their enumeration values through constants. The package containing 
 * those types is located {@link MARTE_TimeLibrary#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_TimeLibrary  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_2GPOEA74EdyML4mHwjNDrw";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = MARTE_TimeLibrary.getInstance().PACKAGE.getElement();
		
		final Enumeration LOGICAL_TIME_UNIT = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT.getElement();
		public interface LOGICAL_TIME_UNIT_LITERALS {
			final EnumerationLiteral TICK = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT_TICK.getElement();
		}
		final Enumeration TIME_UNIT_KIND = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND.getElement();
		public interface TIME_UNIT_KIND_LITERALS {
			final EnumerationLiteral S = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_S.getElement();
			final EnumerationLiteral MS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MS.getElement();
			final EnumerationLiteral US = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_US.getElement();
			final EnumerationLiteral NS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_NS.getElement();
			final EnumerationLiteral MIN = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MIN.getElement();
			final EnumerationLiteral HRS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_HRS.getElement();
			final EnumerationLiteral DAY = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_DAY.getElement();
		}
		final DataType TIMED_VALUE_TYPE = MARTE_TimeLibrary.getInstance().TIMED_VALUE_TYPE.getElement();
		final PrimitiveType CLOCKED_VALUE_SPECIFICATION = MARTE_TimeLibrary.getInstance().CLOCKED_VALUE_SPECIFICATION.getElement();
	}

	public interface FQN {
		final String PACKAGE = MARTE_TimeLibrary.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String LOGICAL_TIME_UNIT = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT.getFullyQualifiedName();
		public interface LOGICAL_TIME_UNIT_LITERALS {
			final String TICK = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT_TICK.getFullyQualifiedName();
		}
		final String TIME_UNIT_KIND = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND.getFullyQualifiedName();
		public interface TIME_UNIT_KIND_LITERALS {
			final String S = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_S.getFullyQualifiedName();
			final String MS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MS.getFullyQualifiedName();
			final String US = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_US.getFullyQualifiedName();
			final String NS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_NS.getFullyQualifiedName();
			final String MIN = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MIN.getFullyQualifiedName();
			final String HRS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_HRS.getFullyQualifiedName();
			final String DAY = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_DAY.getFullyQualifiedName();
		}
		final String TIMED_VALUE_TYPE = MARTE_TimeLibrary.getInstance().TIMED_VALUE_TYPE.getFullyQualifiedName();
		final String CLOCKED_VALUE_SPECIFICATION = MARTE_TimeLibrary.getInstance().CLOCKED_VALUE_SPECIFICATION.getFullyQualifiedName();
	}

	public interface Uri {
		final String PACKAGE = MARTE_TimeLibrary.getInstance().PACKAGE.getUri();
		
		final String LOGICAL_TIME_UNIT = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT.getUri();
		public interface LOGICAL_TIME_UNIT_LITERALS {
			final String TICK = MARTE_TimeLibrary.getInstance().LOGICAL_TIME_UNIT_TICK.getUri();
		}
		final String TIME_UNIT_KIND = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND.getUri();
		public interface TIME_UNIT_KIND_LITERALS {
			final String S = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_S.getUri();
			final String MS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MS.getUri();
			final String US = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_US.getUri();
			final String NS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_NS.getUri();
			final String MIN = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_MIN.getUri();
			final String HRS = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_HRS.getUri();
			final String DAY = MARTE_TimeLibrary.getInstance().TIME_UNIT_KIND_DAY.getUri();
		}
		final String TIMED_VALUE_TYPE = MARTE_TimeLibrary.getInstance().TIMED_VALUE_TYPE.getUri();
		final String CLOCKED_VALUE_SPECIFICATION = MARTE_TimeLibrary.getInstance().CLOCKED_VALUE_SPECIFICATION.getUri();
	}
	
	public final MigrationModelElement<Enumeration> LOGICAL_TIME_UNIT;
	public final MigrationModelElement<EnumerationLiteral> LOGICAL_TIME_UNIT_TICK;
	public final MigrationModelElement<Enumeration> TIME_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_S;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_MS;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_US;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_NS;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_MIN;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_HRS;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_DAY;
	public final MigrationModelElement<DataType> TIMED_VALUE_TYPE;
	public final MigrationModelElement<PrimitiveType> CLOCKED_VALUE_SPECIFICATION;
	
	private static MARTE_TimeLibrary instance;
	
	public static MARTE_TimeLibrary getInstance() {
		if(instance == null)
			instance = new MARTE_TimeLibrary();
		return instance;
	}
	
	protected MARTE_TimeLibrary() {
		super(PACKAGE_URI);
	
		LOGICAL_TIME_UNIT = new MigrationModelElement<Enumeration>(getEnumerationByName("LogicalTimeUnit"));
		LOGICAL_TIME_UNIT_TICK = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("LogicalTimeUnit", "tick"));
		TIME_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TimeUnitKind"));
		TIME_UNIT_KIND_S = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "s"));
		TIME_UNIT_KIND_MS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "ms"));
		TIME_UNIT_KIND_US = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "us"));
		TIME_UNIT_KIND_NS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "ns"));
		TIME_UNIT_KIND_MIN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "min"));
		TIME_UNIT_KIND_HRS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "hrs"));
		TIME_UNIT_KIND_DAY = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "day"));
		TIMED_VALUE_TYPE = new MigrationModelElement<DataType>(getDataTypeByName("TimedValueType"));
		CLOCKED_VALUE_SPECIFICATION = new MigrationModelElement<PrimitiveType>(getPrimitiveTypeByName("ClockedValueSpecification"));
	}
}
