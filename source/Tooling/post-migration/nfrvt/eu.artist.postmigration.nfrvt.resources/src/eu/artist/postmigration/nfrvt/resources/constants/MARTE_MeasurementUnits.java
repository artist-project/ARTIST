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
 * A convenience class that provides access to all MARTE Measurement Units
 * and their enumeration values through constants. The package containing 
 * those types is located {@link MARTE_MeasurementUnits#PACKAGE_URI}.
 *  
 * @author Martin Fleck
 *
 */
public class MARTE_MeasurementUnits  extends AbstractUMLPackageConstant {
	public static final String PACKAGE_URI_STRING = MARTEResourcesUtil.MARTE_LIBRARY_URI_STRING + "#_3DJKAA4uEdysTsAUPnp57Q";
	public static final URI PACKAGE_URI = URI.createURI(PACKAGE_URI_STRING);
	
	private static MARTE_MeasurementUnits instance;
	
	public static MARTE_MeasurementUnits getInstance() {
		if(instance == null)
			instance = new MARTE_MeasurementUnits();
		return instance;
	}
	
	public interface Element {
		final Package PACKAGE = MARTE_MeasurementUnits.getInstance().PACKAGE.getElement();
		
		final Enumeration TIME_UNIT_KIND = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND.getElement();
		public interface TIME_UNIT_KIND_LITERALS {
		final EnumerationLiteral S = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_S.getElement();
		final EnumerationLiteral TICK = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_TICK.getElement();
		final EnumerationLiteral MS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MS.getElement();
		final EnumerationLiteral US = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_US.getElement();
		final EnumerationLiteral MIN = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MIN.getElement();
		final EnumerationLiteral HRS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_HRS.getElement();
		final EnumerationLiteral DAY = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_DAY.getElement();
		}
		final Enumeration FREQUENCY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND.getElement();
		public interface FREQUENCY_UNIT_KIND_LITERALS {
		final EnumerationLiteral HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_HZ.getElement();
		final EnumerationLiteral K_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_K_HZ.getElement();
		final EnumerationLiteral M_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_M_HZ.getElement();
		final EnumerationLiteral G_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_G_HZ.getElement();
		final EnumerationLiteral RPM = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_RPM.getElement();
		}
		final Enumeration LENGTH_UNIT_KIND = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND.getElement();
		public interface LENGTH_UNIT_KIND_LITERALS {
		final EnumerationLiteral M = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_M.getElement();
		final EnumerationLiteral CM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_CM.getElement();
		final EnumerationLiteral MM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_MM.getElement();
		}
		final Enumeration POWER_UNIT_KIND = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND.getElement();
		public interface POWER_UNIT_KIND_LITERALS {
		final EnumerationLiteral W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_W.getElement();
		final EnumerationLiteral M_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_M_W.getElement();
		final EnumerationLiteral K_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_K_W.getElement();
		}
		final Enumeration DATA_TX_RATE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND.getElement();
		public interface DATA_TX_RATE_UNIT_KIND_LITERALS {
		final EnumerationLiteral B_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_B_PER_S.getElement();
		final EnumerationLiteral KB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_KB_PER_S.getElement();
		final EnumerationLiteral MB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_MB_PER_S.getElement();
		}
		final Enumeration DATA_SIZE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND.getElement();
		public interface DATA_SIZE_UNIT_KIND_LITERALS {
		final EnumerationLiteral BIT = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BIT.getElement();
		final EnumerationLiteral BYTE = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BYTE.getElement();
		final EnumerationLiteral K_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_K_B.getElement();
		final EnumerationLiteral M_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_M_B.getElement();
		final EnumerationLiteral G_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_G_B.getElement();
		}
		final Enumeration WEIGHT_UNIT_KIND = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND.getElement();
		public interface WEIGHT_UNIT_KIND_LITERALS {
		final EnumerationLiteral G = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_G.getElement();
		final EnumerationLiteral MG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_MG.getElement();
		final EnumerationLiteral KG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_KG.getElement();
		}
		final Enumeration ENERGY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND.getElement();
		public interface ENERGY_UNIT_KIND_LITERALS {
		final EnumerationLiteral J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_J.getElement();
		final EnumerationLiteral K_J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_J.getElement();
		final EnumerationLiteral WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_WH.getElement();
		final EnumerationLiteral K_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_WH.getElement();
		final EnumerationLiteral M_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_M_WH.getElement();
		}
		final Enumeration AREA_UNIT_KIND = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND.getElement();
		public interface AREA_UNIT_KIND_LITERALS {
		final EnumerationLiteral MM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_MM2.getElement();
		final EnumerationLiteral UM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_UM2.getElement();
		}
	}

	public interface FQN {
		final String PACKAGE = MARTE_MeasurementUnits.getInstance().PACKAGE.getFullyQualifiedName();
		
		final String TIME_UNIT_KIND = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND.getFullyQualifiedName();
		public interface TIME_UNIT_KIND_LITERALS {
		final String S = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_S.getFullyQualifiedName();
		final String TICK = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_TICK.getFullyQualifiedName();
		final String MS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MS.getFullyQualifiedName();
		final String US = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_US.getFullyQualifiedName();
		final String MIN = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MIN.getFullyQualifiedName();
		final String HRS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_HRS.getFullyQualifiedName();
		final String DAY = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_DAY.getFullyQualifiedName();
		}
		final String FREQUENCY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND.getFullyQualifiedName();
		public interface FREQUENCY_UNIT_KIND_LITERALS {
		final String HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_HZ.getFullyQualifiedName();
		final String K_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_K_HZ.getFullyQualifiedName();
		final String M_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_M_HZ.getFullyQualifiedName();
		final String G_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_G_HZ.getFullyQualifiedName();
		final String RPM = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_RPM.getFullyQualifiedName();
		}
		final String LENGTH_UNIT_KIND = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND.getFullyQualifiedName();
		public interface LENGTH_UNIT_KIND_LITERALS {
		final String M = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_M.getFullyQualifiedName();
		final String CM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_CM.getFullyQualifiedName();
		final String MM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_MM.getFullyQualifiedName();
		}
		final String POWER_UNIT_KIND = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND.getFullyQualifiedName();
		public interface POWER_UNIT_KIND_LITERALS {
		final String W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_W.getFullyQualifiedName();
		final String M_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_M_W.getFullyQualifiedName();
		final String K_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_K_W.getFullyQualifiedName();
		}
		final String DATA_TX_RATE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND.getFullyQualifiedName();
		public interface DATA_TX_RATE_UNIT_KIND_LITERALS {
		final String B_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_B_PER_S.getFullyQualifiedName();
		final String KB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_KB_PER_S.getFullyQualifiedName();
		final String MB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_MB_PER_S.getFullyQualifiedName();
		}
		final String DATA_SIZE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND.getFullyQualifiedName();
		public interface DATA_SIZE_UNIT_KIND_LITERALS {
		final String BIT = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BIT.getFullyQualifiedName();
		final String BYTE = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BYTE.getFullyQualifiedName();
		final String K_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_K_B.getFullyQualifiedName();
		final String M_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_M_B.getFullyQualifiedName();
		final String G_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_G_B.getFullyQualifiedName();
		}
		final String WEIGHT_UNIT_KIND = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND.getFullyQualifiedName();
		public interface WEIGHT_UNIT_KIND_LITERALS {
		final String G = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_G.getFullyQualifiedName();
		final String MG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_MG.getFullyQualifiedName();
		final String KG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_KG.getFullyQualifiedName();
		}
		final String ENERGY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND.getFullyQualifiedName();
		public interface ENERGY_UNIT_KIND_LITERALS {
		final String J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_J.getFullyQualifiedName();
		final String K_J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_J.getFullyQualifiedName();
		final String WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_WH.getFullyQualifiedName();
		final String K_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_WH.getFullyQualifiedName();
		final String M_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_M_WH.getFullyQualifiedName();
		}
		final String AREA_UNIT_KIND = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND.getFullyQualifiedName();
		public interface AREA_UNIT_KIND_LITERALS {
		final String MM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_MM2.getFullyQualifiedName();
		final String UM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_UM2.getFullyQualifiedName();
		}
	}

	public interface Uri {
		final String PACKAGE = MARTE_MeasurementUnits.getInstance().PACKAGE.getUri();
		
		final String TIME_UNIT_KIND = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND.getUri();
		public interface TIME_UNIT_KIND_LITERALS {
		final String S = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_S.getUri();
		final String TICK = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_TICK.getUri();
		final String MS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MS.getUri();
		final String US = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_US.getUri();
		final String MIN = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_MIN.getUri();
		final String HRS = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_HRS.getUri();
		final String DAY = MARTE_MeasurementUnits.getInstance().TIME_UNIT_KIND_DAY.getUri();
		}
		final String FREQUENCY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND.getUri();
		public interface FREQUENCY_UNIT_KIND_LITERALS {
		final String HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_HZ.getUri();
		final String K_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_K_HZ.getUri();
		final String M_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_M_HZ.getUri();
		final String G_HZ = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_G_HZ.getUri();
		final String RPM = MARTE_MeasurementUnits.getInstance().FREQUENCY_UNIT_KIND_RPM.getUri();
		}
		final String LENGTH_UNIT_KIND = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND.getUri();
		public interface LENGTH_UNIT_KIND_LITERALS {
		final String M = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_M.getUri();
		final String CM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_CM.getUri();
		final String MM = MARTE_MeasurementUnits.getInstance().LENGTH_UNIT_KIND_MM.getUri();
		}
		final String POWER_UNIT_KIND = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND.getUri();
		public interface POWER_UNIT_KIND_LITERALS {
		final String W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_W.getUri();
		final String M_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_M_W.getUri();
		final String K_W = MARTE_MeasurementUnits.getInstance().POWER_UNIT_KIND_K_W.getUri();
		}
		final String DATA_TX_RATE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND.getUri();
		public interface DATA_TX_RATE_UNIT_KIND_LITERALS {
		final String B_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_B_PER_S.getUri();
		final String KB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_KB_PER_S.getUri();
		final String MB_PER_S = MARTE_MeasurementUnits.getInstance().DATA_TX_RATE_UNIT_KIND_MB_PER_S.getUri();
		}
		final String DATA_SIZE_UNIT_KIND = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND.getUri();
		public interface DATA_SIZE_UNIT_KIND_LITERALS {
		final String BIT = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BIT.getUri();
		final String BYTE = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_BYTE.getUri();
		final String K_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_K_B.getUri();
		final String M_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_M_B.getUri();
		final String G_B = MARTE_MeasurementUnits.getInstance().DATA_SIZE_UNIT_KIND_G_B.getUri();
		}
		final String WEIGHT_UNIT_KIND = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND.getUri();
		public interface WEIGHT_UNIT_KIND_LITERALS {
		final String G = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_G.getUri();
		final String MG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_MG.getUri();
		final String KG = MARTE_MeasurementUnits.getInstance().WEIGHT_UNIT_KIND_KG.getUri();
		}
		final String ENERGY_UNIT_KIND = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND.getUri();
		public interface ENERGY_UNIT_KIND_LITERALS {
		final String J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_J.getUri();
		final String K_J = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_J.getUri();
		final String WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_WH.getUri();
		final String K_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_K_WH.getUri();
		final String M_WH = MARTE_MeasurementUnits.getInstance().ENERGY_UNIT_KIND_M_WH.getUri();
		}
		final String AREA_UNIT_KIND = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND.getUri();
		public interface AREA_UNIT_KIND_LITERALS {
		final String MM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_MM2.getUri();
		final String UM2 = MARTE_MeasurementUnits.getInstance().AREA_UNIT_KIND_UM2.getUri();
		}
	}

	public final MigrationModelElement<Enumeration> TIME_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_S;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_TICK;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_MS;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_US;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_MIN;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_HRS;
	public final MigrationModelElement<EnumerationLiteral> TIME_UNIT_KIND_DAY;
	public final MigrationModelElement<Enumeration> FREQUENCY_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> FREQUENCY_UNIT_KIND_HZ;
	public final MigrationModelElement<EnumerationLiteral> FREQUENCY_UNIT_KIND_K_HZ;
	public final MigrationModelElement<EnumerationLiteral> FREQUENCY_UNIT_KIND_M_HZ;
	public final MigrationModelElement<EnumerationLiteral> FREQUENCY_UNIT_KIND_G_HZ;
	public final MigrationModelElement<EnumerationLiteral> FREQUENCY_UNIT_KIND_RPM;
	public final MigrationModelElement<Enumeration> LENGTH_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> LENGTH_UNIT_KIND_M;
	public final MigrationModelElement<EnumerationLiteral> LENGTH_UNIT_KIND_CM;
	public final MigrationModelElement<EnumerationLiteral> LENGTH_UNIT_KIND_MM;
	public final MigrationModelElement<Enumeration> POWER_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> POWER_UNIT_KIND_W;
	public final MigrationModelElement<EnumerationLiteral> POWER_UNIT_KIND_M_W;
	public final MigrationModelElement<EnumerationLiteral> POWER_UNIT_KIND_K_W;
	public final MigrationModelElement<Enumeration> DATA_TX_RATE_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> DATA_TX_RATE_UNIT_KIND_B_PER_S;
	public final MigrationModelElement<EnumerationLiteral> DATA_TX_RATE_UNIT_KIND_KB_PER_S;
	public final MigrationModelElement<EnumerationLiteral> DATA_TX_RATE_UNIT_KIND_MB_PER_S;
	public final MigrationModelElement<Enumeration> DATA_SIZE_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> DATA_SIZE_UNIT_KIND_BIT;
	public final MigrationModelElement<EnumerationLiteral> DATA_SIZE_UNIT_KIND_BYTE;
	public final MigrationModelElement<EnumerationLiteral> DATA_SIZE_UNIT_KIND_K_B;
	public final MigrationModelElement<EnumerationLiteral> DATA_SIZE_UNIT_KIND_M_B;
	public final MigrationModelElement<EnumerationLiteral> DATA_SIZE_UNIT_KIND_G_B;
	public final MigrationModelElement<Enumeration> WEIGHT_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> WEIGHT_UNIT_KIND_G;
	public final MigrationModelElement<EnumerationLiteral> WEIGHT_UNIT_KIND_MG;
	public final MigrationModelElement<EnumerationLiteral> WEIGHT_UNIT_KIND_KG;
	public final MigrationModelElement<Enumeration> ENERGY_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> ENERGY_UNIT_KIND_J;
	public final MigrationModelElement<EnumerationLiteral> ENERGY_UNIT_KIND_K_J;
	public final MigrationModelElement<EnumerationLiteral> ENERGY_UNIT_KIND_WH;
	public final MigrationModelElement<EnumerationLiteral> ENERGY_UNIT_KIND_K_WH;
	public final MigrationModelElement<EnumerationLiteral> ENERGY_UNIT_KIND_M_WH;
	public final MigrationModelElement<Enumeration> AREA_UNIT_KIND;
	public final MigrationModelElement<EnumerationLiteral> AREA_UNIT_KIND_MM2;
	public final MigrationModelElement<EnumerationLiteral> AREA_UNIT_KIND_UM2;
	
	protected MARTE_MeasurementUnits() {
		super(PACKAGE_URI);
		
		TIME_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("TimeUnitKind"));
		FREQUENCY_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("FrequencyUnitKind"));
		LENGTH_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("LengthUnitKind"));
		POWER_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("PowerUnitKind"));
		DATA_TX_RATE_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("DataTxRateUnitKind"));
		DATA_SIZE_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("DataSizeUnitKind"));
		WEIGHT_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("WeightUnitKind"));
		ENERGY_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("EnergyUnitKind"));
		AREA_UNIT_KIND = new MigrationModelElement<Enumeration>(getEnumerationByName("AreaUnitKind"));
		
		TIME_UNIT_KIND_S = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "s"));
		TIME_UNIT_KIND_TICK = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "tick"));
		TIME_UNIT_KIND_MS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "ms"));
		TIME_UNIT_KIND_US = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "us"));
		TIME_UNIT_KIND_MIN = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "min"));
		TIME_UNIT_KIND_HRS = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "hrs"));
		TIME_UNIT_KIND_DAY = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("TimeUnitKind", "day"));
		FREQUENCY_UNIT_KIND_HZ = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("FrequencyUnitKind", "Hz"));
		FREQUENCY_UNIT_KIND_K_HZ = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("FrequencyUnitKind", "KHz"));
		FREQUENCY_UNIT_KIND_M_HZ = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("FrequencyUnitKind", "MHz"));
		FREQUENCY_UNIT_KIND_G_HZ = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("FrequencyUnitKind", "GHz"));
		FREQUENCY_UNIT_KIND_RPM = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("FrequencyUnitKind", "rpm"));
		LENGTH_UNIT_KIND_M = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("LengthUnitKind", "m"));
		LENGTH_UNIT_KIND_CM = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("LengthUnitKind", "cm"));
		LENGTH_UNIT_KIND_MM = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("LengthUnitKind", "mm"));
		POWER_UNIT_KIND_W = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PowerUnitKind", "W"));
		POWER_UNIT_KIND_M_W = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PowerUnitKind", "mW"));
		POWER_UNIT_KIND_K_W = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("PowerUnitKind", "KW"));
		DATA_TX_RATE_UNIT_KIND_B_PER_S = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataTxRateUnitKind", "b_per_s"));
		DATA_TX_RATE_UNIT_KIND_KB_PER_S = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataTxRateUnitKind", "Kb_per_s"));
		DATA_TX_RATE_UNIT_KIND_MB_PER_S = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataTxRateUnitKind", "Mb_per_s"));
		DATA_SIZE_UNIT_KIND_BIT = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataSizeUnitKind", "bit"));
		DATA_SIZE_UNIT_KIND_BYTE = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataSizeUnitKind", "Byte"));
		DATA_SIZE_UNIT_KIND_K_B = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataSizeUnitKind", "KB"));
		DATA_SIZE_UNIT_KIND_M_B = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataSizeUnitKind", "MB"));
		DATA_SIZE_UNIT_KIND_G_B = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("DataSizeUnitKind", "GB"));
		WEIGHT_UNIT_KIND_G = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("WeightUnitKind", "g"));
		WEIGHT_UNIT_KIND_MG = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("WeightUnitKind", "mg"));
		WEIGHT_UNIT_KIND_KG = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("WeightUnitKind", "kg"));
		ENERGY_UNIT_KIND_J = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EnergyUnitKind", "J"));
		ENERGY_UNIT_KIND_K_J = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EnergyUnitKind", "KJ"));
		ENERGY_UNIT_KIND_WH = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EnergyUnitKind", "Wh"));
		ENERGY_UNIT_KIND_K_WH = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EnergyUnitKind", "KWh"));
		ENERGY_UNIT_KIND_M_WH = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("EnergyUnitKind", "mWh"));
		AREA_UNIT_KIND_MM2 = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("AreaUnitKind", "mm2"));
		AREA_UNIT_KIND_UM2 = new MigrationModelElement<EnumerationLiteral>(getEnumerationLiteralByName("AreaUnitKind", "um2"));
	}
	
	public static void main(String[] args) {
		new MARTE_MeasurementUnits();
	}
}