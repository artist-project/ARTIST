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
package eu.artist.postmigration.nfrvt.lang.util;

import java.net.URL;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.RSM.RSMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.VSLPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.DataTypes.DataTypesPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Operators.OperatorsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Annexes.VSL.Variables.VariablesPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.GCM.GCMPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HLAM.HLAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwLogicalPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStoragePackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager.HwStorageManagerPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPhysicalPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Brokering.SW_BrokeringPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import org.eclipse.papyrus.MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SW_ResourceCorePackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.AllocPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.NFPs.NFPsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;
import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;
import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;
import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;
import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;
import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;
import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;
import org.eclipse.uml2.uml.UMLPlugin;

/**
 * A utility class to support the usage of the MARTE library.
 * 
 * @author Martin Fleck
 *
 */
public class MARTEResourcesUtil {
	protected static String MARTE_PLUGIN_ID = "org.eclipse.papyrus.marte.static.profile";
	protected static String LIBRARY_BASE_PATHMAP = "pathmap://Papyrus_LIBRARIES/";
	protected static String PROFILE_BASE_PATHMAP = "pathmap://Papyrus_PROFILES/";
	
	public static String MARTE_LIBRARY_URI_STRING = "pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml";
	public static URI MARTE_LIBRARY_URI = URI.createURI("pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml");
	
	public static String MARTE_PROFILE_URI_STRING = "pathmap://Papyrus_PROFILES/MARTE.profile.uml";
	public static URI MARTE_PROFILE_URI = URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml");
	
	/**
	 * Initializes the given resource set to use the MARTE library.
	 * 
	 * @param resourceSet resource set to be initialized
	 * @return initialized resource set
	 */
	public static MigrationResourceSet init(MigrationResourceSet resourceSet) {
		init(resourceSet.getResourceSet());
		return resourceSet;
	}
	
	/**
	 * Initializes the given resource set to use the MARTE library.
	 * 
	 * @param resourceSet resource set to be initialized
	 * @return initialized resource set
	 */
	public static ResourceSet init(ResourceSet resourceSet) {
		if(!Platform.isRunning()) { 
			Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
			URI baseURI = getBaseMARTEResourceURI();
			mapResourceURIs(uriMap, 
					LIBRARY_BASE_PATHMAP,
					baseURI.appendSegment("resources")); //$NON-NLS-1$
			mapResourceURIs(uriMap, 
					PROFILE_BASE_PATHMAP,
					baseURI.appendSegment("resources")); //$NON-NLS-1$

			initEPackageRegistry(EPackage.Registry.INSTANCE);
			initEPackageNsURIToProfileLocationMap(baseURI);
		}		
		return resourceSet;
	}
	
	private static void initEPackageRegistry(EPackage.Registry packageRegistry) {
		packageRegistry.put(MARTEPackage.eNS_URI, MARTEPackage.eINSTANCE);
		
		packageRegistry.put(NFPsPackage.eNS_URI, NFPsPackage.eINSTANCE);
		packageRegistry.put(TimePackage.eNS_URI, TimePackage.eINSTANCE);
		packageRegistry.put(GRMPackage.eNS_URI, GRMPackage.eINSTANCE);
		packageRegistry.put(AllocPackage.eNS_URI, AllocPackage.eINSTANCE);
		packageRegistry.put(CoreElementsPackage.eNS_URI, CoreElementsPackage.eINSTANCE);
		packageRegistry.put(HLAMPackage.eNS_URI, HLAMPackage.eINSTANCE);
		packageRegistry.put(HRMPackage.eNS_URI, HRMPackage.eINSTANCE);
		
		packageRegistry.put(HwLogicalPackage.eNS_URI, HwLogicalPackage.eINSTANCE);
		packageRegistry.put(HwComputingPackage.eNS_URI, HwComputingPackage.eINSTANCE);
		packageRegistry.put(HwCommunicationPackage.eNS_URI, HwCommunicationPackage.eINSTANCE);
		packageRegistry.put(HwTimingPackage.eNS_URI, HwTimingPackage.eINSTANCE);
		packageRegistry.put(HwDevicePackage.eNS_URI, HwDevicePackage.eINSTANCE);
		packageRegistry.put(HwStoragePackage.eNS_URI, HwStoragePackage.eINSTANCE);
		packageRegistry.put(HwMemoryPackage.eNS_URI, HwMemoryPackage.eINSTANCE);
		packageRegistry.put(HwStorageManagerPackage.eNS_URI, HwStorageManagerPackage.eINSTANCE);
		packageRegistry.put(HwPhysicalPackage.eNS_URI, HwPhysicalPackage.eINSTANCE);
		packageRegistry.put(HwLayoutPackage.eNS_URI, HwLayoutPackage.eINSTANCE);
		packageRegistry.put(HwPowerPackage.eNS_URI, HwPowerPackage.eINSTANCE);
		packageRegistry.put(HwGeneralPackage.eNS_URI, HwGeneralPackage.eINSTANCE);
		
		packageRegistry.put(SRMPackage.eNS_URI, SRMPackage.eINSTANCE);
		
		packageRegistry.put(SW_ResourceCorePackage.eNS_URI, SW_ResourceCorePackage.eINSTANCE);
		packageRegistry.put(SW_ConcurrencyPackage.eNS_URI, SW_ConcurrencyPackage.eINSTANCE);
		packageRegistry.put(SW_BrokeringPackage.eNS_URI, SW_BrokeringPackage.eINSTANCE);
		packageRegistry.put(SW_InteractionPackage.eNS_URI, SW_InteractionPackage.eINSTANCE);
		
		packageRegistry.put(GCMPackage.eNS_URI, GCMPackage.eINSTANCE);
		packageRegistry.put(GQAMPackage.eNS_URI, GQAMPackage.eINSTANCE);
		packageRegistry.put(SAMPackage.eNS_URI, SAMPackage.eINSTANCE);
		packageRegistry.put(PAMPackage.eNS_URI, PAMPackage.eINSTANCE);
		packageRegistry.put(RSMPackage.eNS_URI, RSMPackage.eINSTANCE);
		packageRegistry.put(VSLPackage.eNS_URI, VSLPackage.eINSTANCE);
		packageRegistry.put(DataTypesPackage.eNS_URI, DataTypesPackage.eINSTANCE);
		packageRegistry.put(VariablesPackage.eNS_URI, VariablesPackage.eINSTANCE);
		packageRegistry.put(OperatorsPackage.eNS_URI, OperatorsPackage.eINSTANCE);
		
		packageRegistry.put(MARTE_PrimitivesTypesPackage.eNS_URI, MARTE_PrimitivesTypesPackage.eINSTANCE);
		packageRegistry.put(RS_LibraryPackage.eNS_URI, RS_LibraryPackage.eINSTANCE);
		packageRegistry.put(BasicNFP_TypesPackage.eNS_URI, BasicNFP_TypesPackage.eINSTANCE);
		packageRegistry.put(GRM_BasicTypesPackage.eNS_URI, GRM_BasicTypesPackage.eINSTANCE);
		packageRegistry.put(MARTE_DataTypesPackage.eNS_URI, MARTE_DataTypesPackage.eINSTANCE);
		packageRegistry.put(MeasurementUnitsPackage.eNS_URI, MeasurementUnitsPackage.eINSTANCE);
		packageRegistry.put(TimeTypesLibraryPackage.eNS_URI, TimeTypesLibraryPackage.eINSTANCE);
		packageRegistry.put(TimeLibraryPackage.eNS_URI, TimeLibraryPackage.eINSTANCE);
	}

	private static void initEPackageNsURIToProfileLocationMap(URI baseURI) {
		Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin
				.getEPackageNsURIToProfileLocationMap();
		URI marteProfile = baseURI.appendSegment("resources").appendSegment("MARTE.profile.uml");
		marteProfile.appendFragment("test");
		
		ePackageNsURIToProfileLocationMap.put(MARTEPackage.eNS_URI,
				marteProfile.appendFragment("_zaC5cAPHEdyeNfbOYuD9pg"));
		ePackageNsURIToProfileLocationMap.put(NFPsPackage.eNS_URI, 
				marteProfile.appendFragment("_U_GAoAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(TimePackage.eNS_URI, 
				marteProfile.appendFragment("_WStkoAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(GRMPackage.eNS_URI, 
				marteProfile.appendFragment("_XVWGUAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(AllocPackage.eNS_URI, 
				marteProfile.appendFragment("_ar8OsAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(CoreElementsPackage.eNS_URI, 
				marteProfile.appendFragment("_-wEewECLEd6UTJZnztgOLw"));
		ePackageNsURIToProfileLocationMap.put(HLAMPackage.eNS_URI, 
				marteProfile.appendFragment("_yNSZIAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(HRMPackage.eNS_URI, 
				marteProfile.appendFragment("_2dtsgAPMEdyuUt-4qHuVvQ"));
		
		ePackageNsURIToProfileLocationMap.put(HwLogicalPackage.eNS_URI, 
				marteProfile.appendFragment("_P80EcBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwComputingPackage.eNS_URI, 
				marteProfile.appendFragment("_aMhZsBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwCommunicationPackage.eNS_URI, 
				marteProfile.appendFragment("_bmL7UBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwTimingPackage.eNS_URI, 
				marteProfile.appendFragment("_dG2c0BJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwDevicePackage.eNS_URI, 
				marteProfile.appendFragment("_ja8REBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwStoragePackage.eNS_URI, 
				marteProfile.appendFragment("_ZJjPoEIbEd6dmI2dd6jVFQ"));
		ePackageNsURIToProfileLocationMap.put(HwMemoryPackage.eNS_URI, 
				marteProfile.appendFragment("_gHI-ABJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwStorageManagerPackage.eNS_URI, 
				marteProfile.appendFragment("_hst0sBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwPhysicalPackage.eNS_URI, 
				marteProfile.appendFragment("_R7sL8BJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwLayoutPackage.eNS_URI, 
				marteProfile.appendFragment("_uAf6gBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwPowerPackage.eNS_URI, 
				marteProfile.appendFragment("_vrbyUBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwGeneralPackage.eNS_URI, 
				marteProfile.appendFragment("_WGZ44BJwEdygQ5HMNSpiZw"));
		
		ePackageNsURIToProfileLocationMap.put(SRMPackage.eNS_URI, 
				marteProfile.appendFragment("_3VS0wAPMEdyuUt-4qHuVvQ"));
		
		ePackageNsURIToProfileLocationMap.put(SW_ResourceCorePackage.eNS_URI, 
				marteProfile.appendFragment("_-1fcUBJdEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_ConcurrencyPackage.eNS_URI, 
				marteProfile.appendFragment("_A_vtYBJeEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_BrokeringPackage.eNS_URI, 
				marteProfile.appendFragment("_Cf874BJeEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_InteractionPackage.eNS_URI, 
				marteProfile.appendFragment("_EIfnABJeEdy3Td9UhuLFPg"));
		
		ePackageNsURIToProfileLocationMap.put(GCMPackage.eNS_URI, 
				marteProfile.appendFragment("_YgAioAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(GQAMPackage.eNS_URI, 
				marteProfile.appendFragment("_4bV20APMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(SAMPackage.eNS_URI, 
				marteProfile.appendFragment("_5ZCOIAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(PAMPackage.eNS_URI, 
				marteProfile.appendFragment("_6c2bkAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(RSMPackage.eNS_URI, 
				marteProfile.appendFragment("_DIIJoAPNEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(VSLPackage.eNS_URI, 
				marteProfile.appendFragment("_CHiIYA-LEdyNj8xzjk-DoA"));
		ePackageNsURIToProfileLocationMap.put(DataTypesPackage.eNS_URI, 
				marteProfile.appendFragment("_9FdqwA-MEdyLh7muGbCqMw"));
		ePackageNsURIToProfileLocationMap.put(VariablesPackage.eNS_URI, 
				marteProfile.appendFragment("_9UgzYA-MEdyLh7muGbCqMw"));
		ePackageNsURIToProfileLocationMap.put(OperatorsPackage.eNS_URI, 
				marteProfile.appendFragment("_jg_Z8PfhEd-f4r3MXmUB9g"));
	}
	
	protected static void initEPackageNsURIToProfileLocationMap() {
		Map<String, URI> ePackageNsURIToProfileLocationMap = UMLPlugin
				.getEPackageNsURIToProfileLocationMap();
		
		ePackageNsURIToProfileLocationMap.put(MARTEPackage.eNS_URI,
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#__zaC5cAPHEdyeNfbOYuD9pg"));
		ePackageNsURIToProfileLocationMap.put(NFPsPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_U_GAoAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(TimePackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_WStkoAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(GRMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_XVWGUAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(AllocPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_ar8OsAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(CoreElementsPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_-wEewECLEd6UTJZnztgOLw"));
		ePackageNsURIToProfileLocationMap.put(HLAMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_yNSZIAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(HRMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_2dtsgAPMEdyuUt-4qHuVvQ"));
		
		ePackageNsURIToProfileLocationMap.put(HwLogicalPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_P80EcBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwComputingPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_aMhZsBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwCommunicationPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_bmL7UBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwTimingPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_dG2c0BJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwDevicePackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_ja8REBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwStoragePackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_ZJjPoEIbEd6dmI2dd6jVFQ"));
		ePackageNsURIToProfileLocationMap.put(HwMemoryPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_gHI-ABJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwStorageManagerPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_hst0sBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwPhysicalPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_R7sL8BJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwLayoutPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_uAf6gBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwPowerPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_vrbyUBJwEdygQ5HMNSpiZw"));
		ePackageNsURIToProfileLocationMap.put(HwGeneralPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_WGZ44BJwEdygQ5HMNSpiZw"));
		
		ePackageNsURIToProfileLocationMap.put(SRMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_3VS0wAPMEdyuUt-4qHuVvQ"));
		
		ePackageNsURIToProfileLocationMap.put(SW_ResourceCorePackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_-1fcUBJdEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_ConcurrencyPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_A_vtYBJeEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_BrokeringPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_Cf874BJeEdy3Td9UhuLFPg"));
		ePackageNsURIToProfileLocationMap.put(SW_InteractionPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_EIfnABJeEdy3Td9UhuLFPg"));
		
		ePackageNsURIToProfileLocationMap.put(GCMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_YgAioAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(GQAMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_4bV20APMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(SAMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_5ZCOIAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(PAMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_6c2bkAPMEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(RSMPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_DIIJoAPNEdyuUt-4qHuVvQ"));
		ePackageNsURIToProfileLocationMap.put(VSLPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_CHiIYA-LEdyNj8xzjk-DoA"));
		ePackageNsURIToProfileLocationMap.put(DataTypesPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"));
		ePackageNsURIToProfileLocationMap.put(VariablesPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_9UgzYA-MEdyLh7muGbCqMw"));
		ePackageNsURIToProfileLocationMap.put(OperatorsPackage.eNS_URI, 
				URI.createURI("pathmap://Papyrus_PROFILES/MARTE.profile.uml#_jg_Z8PfhEd-f4r3MXmUB9g"));
	}

	private static URI getBaseMARTEResourceURI() {
		URI nfpCatalogue = URI.createURI(MARTE_LIBRARY_URI_STRING);
		URL resultURL = MARTEPackage.class.getClassLoader().getResource(
			String.format("resources/%s", nfpCatalogue.lastSegment())); //$NON-NLS-1$

		URI result;

		if (resultURL != null) {
			// remove the /resources/MARTE_Library.library.uml segments of the resource
			// we found
			result = URI.createURI(resultURL.toExternalForm(), true)
				.trimSegments(2);
		} else {
			// probably, we're not running with JARs, so assume the source
			// project folder layout
			resultURL = MARTEPackage.class.getResource("MARTEPackage.class"); //$NON-NLS-1$

			String baseURL = resultURL.toExternalForm();
			baseURL = baseURL.substring(0, baseURL.lastIndexOf("/bin/")); //$NON-NLS-1$
			result = URI.createURI(baseURL, true);
		}

		return result;
	}

	private static void mapResourceURIs(Map<URI, URI> uriMap,
			String uri, URI location) {
		URI prefix = URI.createURI(uri);

		// ensure trailing separator (make it a "URI prefix")
		if (!prefix.hasTrailingPathSeparator()) {
			prefix = prefix.appendSegment(""); //$NON-NLS-1$
		}

		// same with the location
		if (!location.hasTrailingPathSeparator()) {
			location = location.appendSegment(""); //$NON-NLS-1$
		}

		uriMap.put(prefix, location);

		// and platform URIs, too
		String folder = location.segment(location.segmentCount() - 2);
		String platformURI = String.format("%s/%s/", //$NON-NLS-1$
				MARTE_PLUGIN_ID, folder);
		uriMap.put(URI.createPlatformPluginURI(platformURI, true), location);
		uriMap.put(URI.createPlatformResourceURI(platformURI, true), location);
	}
}
