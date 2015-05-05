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
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;

import eu.artist.postmigration.nfrvt.lang.util.MARTEResourcesUtil;
import eu.artist.postmigration.nfrvt.resources.MigrationModelElement;

/**
 * A convenience class that provides access to all MARTE Times Type Library 
 * Types and their enumeration values through constants. The package containing 
 * those types is located {@link MARTE_TimeTypesLibrary#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_TimeTypesLibrary  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_x9l9sA74EdyML4mHwjNDrw";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	public interface Element {
		final Package PACKAGE = MARTE_TimeTypesLibrary.getInstance().PACKAGE.getElement();
		
		final Enumeration TIME_INTERPRETATION_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND.getElement();
		public interface TIME_INTERPRETATION_KIND_LITERALS {
			final EnumerationLiteral DURATION = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_DURATION.getElement();
			final EnumerationLiteral INSTANT = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_INSTANT.getElement();
		}
		final Enumeration EVENT_KIND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND.getElement();
		public interface EVENT_KIND_LITERALS {
			final EnumerationLiteral START = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_START.getElement();
			final EnumerationLiteral FINISH = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_FINISH.getElement();
			final EnumerationLiteral SEND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_SEND.getElement();
			final EnumerationLiteral RECEIVE = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_RECEIVE.getElement();
			final EnumerationLiteral CONSUME = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_CONSUME.getElement();
		}
		final Enumeration TIME_STANDARD_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND.getElement();
		public interface TIME_STANDARD_KIND_LITERALS {
			final EnumerationLiteral T_A_I = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TAI.getElement();
			final EnumerationLiteral U_T0 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT0.getElement();
			final EnumerationLiteral U_T1 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT1.getElement();
			final EnumerationLiteral U_T_C = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UTC.getElement();
			final EnumerationLiteral LOCAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_LOCAL.getElement();
			final EnumerationLiteral T_T = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TT.getElement();
			final EnumerationLiteral T_B_D = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TBD.getElement();
			final EnumerationLiteral T_C_G = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCG.getElement();
			final EnumerationLiteral T_C_B = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCB.getElement();
			final EnumerationLiteral SIDEREAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_SIDEREAL.getElement();
			final EnumerationLiteral G_P_S = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_GPS.getElement();
		}
		final Enumeration TIME_NATURE_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND.getElement();
		public interface TIME_NATURE_KIND_LITERALS {
			final EnumerationLiteral DISCRETE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DISCRETE.getElement();
			final EnumerationLiteral DENSE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DENSE.getElement();
		}
	}

	public interface FQN {
		final String PACKAGE = MARTE_TimeTypesLibrary.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String TIME_INTERPRETATION_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND.getFullyQualifiedName();
		public interface TIME_INTERPRETATION_KIND_LITERALS {
			final String DURATION = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_DURATION.getFullyQualifiedName();
			final String INSTANT = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_INSTANT.getFullyQualifiedName();
		}
		final String EVENT_KIND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND.getFullyQualifiedName();
		public interface EVENT_KIND_LITERALS {
			final String START = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_START.getFullyQualifiedName();
			final String FINISH = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_FINISH.getFullyQualifiedName();
			final String SEND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_SEND.getFullyQualifiedName();
			final String RECEIVE = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_RECEIVE.getFullyQualifiedName();
			final String CONSUME = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_CONSUME.getFullyQualifiedName();
		}
		final String TIME_STANDARD_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND.getFullyQualifiedName();
		public interface TIME_STANDARD_KIND_LITERALS {
			final String T_A_I = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TAI.getFullyQualifiedName();
			final String U_T0 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT0.getFullyQualifiedName();
			final String U_T1 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT1.getFullyQualifiedName();
			final String U_T_C = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UTC.getFullyQualifiedName();
			final String LOCAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_LOCAL.getFullyQualifiedName();
			final String T_T = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TT.getFullyQualifiedName();
			final String T_B_D = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TBD.getFullyQualifiedName();
			final String T_C_G = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCG.getFullyQualifiedName();
			final String T_C_B = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCB.getFullyQualifiedName();
			final String SIDEREAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_SIDEREAL.getFullyQualifiedName();
			final String G_P_S = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_GPS.getFullyQualifiedName();
		}
		final String TIME_NATURE_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND.getFullyQualifiedName();
		public interface TIME_NATURE_KIND_LITERALS {
			final String DISCRETE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DISCRETE.getFullyQualifiedName();
			final String DENSE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DENSE.getFullyQualifiedName();
		}
	}

	public interface Uri {
		final String PACKAGE = MARTE_TimeTypesLibrary.getInstance().PACKAGE.getUri();
		
		final String TIME_INTERPRETATION_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND.getUri();
		public interface TIME_INTERPRETATION_KIND_LITERALS {
			final String DURATION = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_DURATION.getUri();
			final String INSTANT = MARTE_TimeTypesLibrary.getInstance().TIME_INTERPRETATION_KIND_INSTANT.getUri();
		}
		final String EVENT_KIND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND.getUri();
		public interface EVENT_KIND_LITERALS {
			final String START = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_START.getUri();
			final String FINISH = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_FINISH.getUri();
			final String SEND = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_SEND.getUri();
			final String RECEIVE = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_RECEIVE.getUri();
			final String CONSUME = MARTE_TimeTypesLibrary.getInstance().EVENT_KIND_CONSUME.getUri();
		}
		final String TIME_STANDARD_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND.getUri();
		public interface TIME_STANDARD_KIND_LITERALS {
			final String T_A_I = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TAI.getUri();
			final String U_T0 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT0.getUri();
			final String U_T1 = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UT1.getUri();
			final String U_T_C = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_UTC.getUri();
			final String LOCAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_LOCAL.getUri();
			final String T_T = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TT.getUri();
			final String T_B_D = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TBD.getUri();
			final String T_C_G = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCG.getUri();
			final String T_C_B = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_TCB.getUri();
			final String SIDEREAL = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_SIDEREAL.getUri();
			final String G_P_S = MARTE_TimeTypesLibrary.getInstance().TIME_STANDARD_KIND_GPS.getUri();
		}
		final String TIME_NATURE_KIND = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND.getUri();
		public interface TIME_NATURE_KIND_LITERALS {
			final String DISCRETE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DISCRETE.getUri();
			final String DENSE = MARTE_TimeTypesLibrary.getInstance().TIME_NATURE_KIND_DENSE.getUri();
		}
	}
	
	public final MigrationModelElement<Enumeration> TIME_INTERPRETATION_KIND;
	public final MigrationModelElement<EnumerationLiteral> TIME_INTERPRETATION_KIND_DURATION;
	public final MigrationModelElement<EnumerationLiteral> TIME_INTERPRETATION_KIND_INSTANT;
	public final MigrationModelElement<Enumeration> EVENT_KIND;
	public final MigrationModelElement<EnumerationLiteral> EVENT_KIND_START;
	public final MigrationModelElement<EnumerationLiteral> EVENT_KIND_FINISH;
	public final MigrationModelElement<EnumerationLiteral> EVENT_KIND_SEND;
	public final MigrationModelElement<EnumerationLiteral> EVENT_KIND_RECEIVE;
	public final MigrationModelElement<EnumerationLiteral> EVENT_KIND_CONSUME;
	public final MigrationModelElement<Enumeration> TIME_STANDARD_KIND;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_TAI;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_UT0;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_UT1;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_UTC;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_LOCAL;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_TT;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_TBD;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_TCG;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_TCB;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_SIDEREAL;
	public final MigrationModelElement<EnumerationLiteral> TIME_STANDARD_KIND_GPS;
	public final MigrationModelElement<Enumeration> TIME_NATURE_KIND;
	public final MigrationModelElement<EnumerationLiteral> TIME_NATURE_KIND_DISCRETE;
	public final MigrationModelElement<EnumerationLiteral> TIME_NATURE_KIND_DENSE;
	
	private static MARTE_TimeTypesLibrary instance;
	
	public static MARTE_TimeTypesLibrary getInstance() {
		if(instance == null)
			instance = new MARTE_TimeTypesLibrary();
		return instance;
	}
	
	protected MARTE_TimeTypesLibrary() {
		super(PACKAGE_URI); 
		
		TIME_INTERPRETATION_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TimeInterpretationKind"));
		TIME_INTERPRETATION_KIND_DURATION = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeInterpretationKind", "duration"));
		TIME_INTERPRETATION_KIND_INSTANT = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeInterpretationKind", "instant"));
		EVENT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("EventKind"));
		EVENT_KIND_START = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EventKind", "start"));
		EVENT_KIND_FINISH = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EventKind", "finish"));
		EVENT_KIND_SEND = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EventKind", "send"));
		EVENT_KIND_RECEIVE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EventKind", "receive"));
		EVENT_KIND_CONSUME = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EventKind", "consume"));
		TIME_STANDARD_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TimeStandardKind"));
		TIME_STANDARD_KIND_TAI = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "TAI"));
		TIME_STANDARD_KIND_UT0 = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "UT0"));
		TIME_STANDARD_KIND_UT1 = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "UT1"));
		TIME_STANDARD_KIND_UTC = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "UTC"));
		TIME_STANDARD_KIND_LOCAL = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "Local"));
		TIME_STANDARD_KIND_TT = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "TT"));
		TIME_STANDARD_KIND_TBD = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "TBD"));
		TIME_STANDARD_KIND_TCG = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "TCG"));
		TIME_STANDARD_KIND_TCB = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "TCB"));
		TIME_STANDARD_KIND_SIDEREAL = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "Sidereal"));
		TIME_STANDARD_KIND_GPS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeStandardKind", "GPS"));
		TIME_NATURE_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TimeNatureKind"));
		TIME_NATURE_KIND_DISCRETE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeNatureKind", "discrete"));
		TIME_NATURE_KIND_DENSE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeNatureKind", "dense"));
	}
}
