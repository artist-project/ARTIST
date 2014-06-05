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
package eu.artist.postmigration.nfrvt.lang.util.mwe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.uml2.uml.resource.UMLResource;

public class LanguageUtil {
	
	public static XtextLanguageUnit ecoreUnit = new XtextLanguageUnit();
	public static XtextLanguageUnit umlUnit = new XtextLanguageUnit();
	
	static {
		ecoreUnit.addUriMapping(
				"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore", 
				"platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore");
		
		ecoreUnit.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/Ecore.uml",
				"platform:/resource/org.eclipse.uml2.uml/model/Ecore.uml");
		
		ecoreUnit.addUriMapping(
				"platform:/plugin/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel",
				"platform:/resource/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel");
		
		ecoreUnit.addUriMapping(
				"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel",
				"platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel");
		
		// not finished
	}
	
	public static class UriMapping {
		
		public static final String ECORE_ECORE = "ECORE_ECORE";
		public static final String ECORE_UML = "ECORE_UML";
		public static final String ECORE_GENMODEL_GENMODEL = "ECORE_GENMODEL_GENMODEL";
		public static final String ECORE_GENMODEL = "ECORE_GENMODEL";
		public static final String UML_ECORE = "UML_ECORE";
		public static final String UML_30_ECORE = "UML_30_ECORE";
		public static final String UML_UML = "UML_UML";
		public static final String UML_GENMODEL = "UML_GENMODEL";
		public static final String UML_GENMODEL_GENMODEL = "UML_GENMODEL_GENMODEL";
		public static final String UML_GENMODEL_ECORE = "UML_GENMODEL_ECORE";
		public static final String UML_TYPES_ECORE = "UML_TYPES_ECORE";
		public static final String UML_TYPES_UML = "UML_TYPES_UML";
		public static final String UML_TYPES_GENMODEL = "UML_TYPES_GENMODEL";
		public static final String MARTE_ECORE = "MARTE_ECORE";
		public static final String MARTE_UML = "MARTE_UML";
		public static final String MARTE_LIBRARY_UML = "MARTE_LIBRARY_UML";
		public static final String MARTE_LIBRARY_ECORE = "MARTE_LIBRARY_ECORE";
				
		public static final String NML_ECORE = "NML_ECORE";
		public static final String NML_GENMODEL = "NML_GENMODEL";
		public static final String NML_LIBRARY = "NML_LIBRARY";
		
		public static final String TSL_ECORE = "TSL_ECORE";
		public static final String TSL_GENMODEL = "TSL_GENMODEL";
		public static final String TSL_LIBRARY = "TSL_LIBRARY";
		
		public static final String ESL_ECORE = "ESL_ECORE";
		public static final String ESL_GENMODEL = "ESL_GENMODEL";
		
		public static final String GML_ECORE = "GML_ECORE";
		public static final String GML_GENMODEL = "GML_GENMODEL";
		
		public static final String GEL_ECORE = "GEL_ECORE";
		public static final String GEL_GENMODEL = "GEL_GENMODEL";
		
		private static Map<String, Mapping> mappings = new TreeMap<String, Mapping>();
		
		static {			
			/*
			 * Ecore URIs
			 */
			
			mappings.put(ECORE_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore", 
					"platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore"));
			
			mappings.put(ECORE_UML,	new Mapping(
					"platform:/plugin/org.eclipse.uml2.uml/model/Ecore.uml",
					"platform:/resource/org.eclipse.uml2.uml/model/Ecore.uml"));
		
		
			mappings.put(ECORE_GENMODEL_GENMODEL, new Mapping(
					"platform:/plugin/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel",
					"platform:/resource/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel"));
			
			mappings.put(ECORE_GENMODEL, new Mapping(
					"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel",
					"platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel"));
			
			/*
			 * UML URIs
			 */
			
			mappings.put(UML_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore",
					"platform:/resource/org.eclipse.uml2.uml/model/UML.ecore"));
			
			mappings.put(UML_30_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.uml2.uml/model/UML30.ecore",
					"platform:/resource/org.eclipse.uml2.uml/model/UML.ecore"));
			
			mappings.put(UML_UML, new Mapping(
					"platform:/plugin/org.eclipse.uml2.uml/model/UML.uml",
					"platform:/resource/org.eclipse.uml2.uml/model/UML.uml"));
			
			mappings.put(UML_GENMODEL, new Mapping(
					"platform:/plugin/org.eclipse.uml2.uml/model/UML.genmodel",
					"platform:/resource/org.eclipse.uml2.uml/model/UML.genmodel"));
			
			mappings.put(UML_GENMODEL_GENMODEL, new Mapping(
					"platform:/plugin/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel",
					"platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel"));
			
			mappings.put(UML_GENMODEL_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.uml2.codegen.ecore/model/GenModel.ecore",
					"platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.ecore"));
			
			/*
			 * UML Type URIs
			 */
			
			mappings.put(UML_TYPES_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.uml2.types/model/Types.ecore",
					"platform:/resource/org.eclipse.uml2.types/model/Types.ecore"));
			
			mappings.put(UML_TYPES_UML, new Mapping(
					"platform:/plugin/org.eclipse.uml2.types/model/Types.uml",
					"platform:/resource/org.eclipse.uml2.types/model/Types.uml"));
			
			mappings.put(UML_TYPES_GENMODEL, new Mapping(
					"platform:/plugin/org.eclipse.uml2.types/model/Types.genmodel",
					"platform:/resource/org.eclipse.uml2.types/model/Types.genmodel"));
			
			/*
			 * MARTE URIs
			 */
			
			mappings.put(MARTE_UML, new Mapping(
					"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml",
					"platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml"));
			
			mappings.put(MARTE_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.ecore",
					"platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE.ecore"));
			
			mappings.put(MARTE_LIBRARY_UML, new Mapping(
					"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.library.uml",
					"platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.library.uml"));
			
			mappings.put(MARTE_LIBRARY_ECORE, new Mapping(
					"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.ecore",
					"platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE_Library.ecore"));
			
			
			/*
			 * NML URIs
			 */
			
			mappings.put(NML_ECORE, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.nml/model/generated/NML.ecore",
					"platform:/resource/eu.artist.postmigration.lang.nml/model/generated/NML.ecore"));
			
			mappings.put(NML_GENMODEL, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.nml/model/generated/NML.genmodel",
					"platform:/resource/eu.artist.postmigration.lang.nml/model/generated/NML.genmodel"));
			
			/*
			 * NML Library URIs
			 */
			
			mappings.put(NML_LIBRARY, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.lib/resources/NFPcatalogue.nml",
					"platform:/resource/eu.artist.postmigration.lang.lib/resources/NFPcatalogue.nml"));
			
			/*
			 * TSL URIs
			 */
			
			mappings.put(TSL_ECORE, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.tsl/model/generated/TSL.ecore",
					"platform:/resource/eu.artist.postmigration.lang.tsl/model/generated/TSL.ecore"));
			
			mappings.put(TSL_GENMODEL, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.tsl/model/generated/TSL.genmodel",
					"platform:/resource/eu.artist.postmigration.lang.tsl/model/generated/TSL.genmodel"));
			
			/*
			 * TSL Library URIs
			 */
			
			mappings.put(TSL_LIBRARY, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.lib/resources/PatternCatalogue.nml",
					"platform:/resource/eu.artist.postmigration.lang.lib/resources/PatternCatalogue.nml"));
			
			/*
			 * ESL URIs
			 */
			
			mappings.put(ESL_ECORE, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.esl/model/generated/ESL.ecore",
					"platform:/resource/eu.artist.postmigration.lang.esl/model/generated/ESL.ecore"));
			
			mappings.put(ESL_GENMODEL, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.esl/model/generated/ESL.genmodel",
					"platform:/resource/eu.artist.postmigration.lang.esl/model/generated/ESL.genmodel"));
			
			/*
			 * GML URIs
			 */
			
			mappings.put(GML_ECORE, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.gml/model/generated/GML.ecore",
					"platform:/resource/eu.artist.postmigration.lang.gml/model/generated/GML.ecore"));
			
			mappings.put(GML_GENMODEL, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.gml/model/generated/GML.genmodel",
					"platform:/resource/eu.artist.postmigration.lang.gml/model/generated/GML.genmodel"));
			
			/*
			 * GEL URIs
			 */
			
			mappings.put(GEL_ECORE, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.gel/model/generated/GEL.ecore",
					"platform:/resource/eu.artist.postmigration.lang.gel/model/generated/GEL.ecore"));
			
			mappings.put(GEL_GENMODEL, new Mapping(
					"platform:/plugin/eu.artist.postmigration.lang.gel/model/generated/GEL.genmodel",
					"platform:/resource/eu.artist.postmigration.lang.gel/model/generated/GEL.genmodel"));
		}
		
		public static Mapping getMapping(String key) {
			return mappings.get(key);
		}
		
		public static Collection<Mapping> getAllMappings() {
			return mappings.values();
		}
		
		public static Collection<Mapping> getEcoreMappings() {
			List<Mapping> ecoreMappings = new ArrayList<Mapping>();
			ecoreMappings.add(mappings.get(ECORE_ECORE));
			ecoreMappings.add(mappings.get(ECORE_GENMODEL));
			ecoreMappings.add(mappings.get(ECORE_GENMODEL_GENMODEL));
			ecoreMappings.add(mappings.get(ECORE_UML));
			return ecoreMappings;
		}
		
		public static Collection<Mapping> getUMLMappings() {
			List<Mapping> umlMappings = new ArrayList<Mapping>();
//			umlMappings.add(mappings.get(UML_ECORE));
//			umlMappings.add(mappings.get(UML_30_ECORE));
			umlMappings.add(mappings.get(UML_GENMODEL));
			umlMappings.add(mappings.get(UML_GENMODEL_ECORE));
			umlMappings.add(mappings.get(UML_GENMODEL_GENMODEL));
			umlMappings.add(mappings.get(UML_UML));
			return umlMappings;
		}
		
		public static Collection<Mapping> getUMLTypeMappings() {
			List<Mapping> umlMappings = new ArrayList<Mapping>();
			umlMappings.add(mappings.get(UML_TYPES_ECORE));
			umlMappings.add(mappings.get(UML_TYPES_UML));
			umlMappings.add(mappings.get(UML_TYPES_GENMODEL));
			return umlMappings;
		}
		
		public static Collection<Mapping> getMARTEMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(MARTE_ECORE));
			returnMappings.add(mappings.get(MARTE_UML));
			returnMappings.add(mappings.get(MARTE_LIBRARY_ECORE));
			returnMappings.add(mappings.get(MARTE_LIBRARY_UML));
			return returnMappings;
		}
		
		public static Collection<Mapping> getVSLMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			return returnMappings;
		}
		
		public static Collection<Mapping> getXBaseMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			return returnMappings;
		}
		
		public static Collection<Mapping> getNMLMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(NML_ECORE));
			returnMappings.add(mappings.get(NML_GENMODEL));
			return returnMappings;
		}
		
		public static Collection<Mapping> getNMLLibraryMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(NML_LIBRARY));
			return returnMappings;
		}
		
		public static Collection<Mapping> getTSLMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(TSL_ECORE));
			returnMappings.add(mappings.get(TSL_GENMODEL));
			return returnMappings;
		}
		
		public static Collection<Mapping> getTSLLibraryMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(TSL_LIBRARY));
			return returnMappings;
		}
		
		public static Collection<Mapping> getESLMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(ESL_ECORE));
			returnMappings.add(mappings.get(ESL_GENMODEL));
			return returnMappings;
		}
		
		public static Collection<Mapping> getGMLMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(GML_ECORE));
			returnMappings.add(mappings.get(GML_GENMODEL));
			return returnMappings;
		}
		
		public static Collection<Mapping> getGELMappings() {
			List<Mapping> returnMappings = new ArrayList<Mapping>();
			returnMappings.add(mappings.get(GEL_ECORE));
			returnMappings.add(mappings.get(GEL_GENMODEL));
			return returnMappings;
		}
	}
	
	public static class GeneratedEPackage {
		public static String XBASE = "org.eclipse.xtext.xbase.XbasePackage";
		public static String ECORE = "org.eclipse.emf.ecore.EcorePackage";
		public static String ECORE_GENMODEL = "org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage";
		public static String UML = "org.eclipse.uml2.uml.UMLPackage";
		public static String UML_GENMODEL = "org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage";
		public static String UML_TYPES = "org.eclipse.uml2.types.TypesPackage";
		public static String MARTE = "org.eclipse.papyrus.MARTE.MARTEPackage";
		public static String VSL = "org.eclipse.papyrus.marte.vsl.vSL.VSLPackage";
		
		public static String NML = "eu.artist.postmigration.lang.nml.nml.NmlPackage";
		public static String TSL = "eu.artist.postmigration.lang.tsl.tsl.TslPackage";
		public static String ESL = "eu.artist.postmigration.lang.esl.esl.EslPackage";
		public static String GML = "eu.artist.postmigration.lang.gml.gml.GmlPackage";
		public static String GEL = "eu.artist.postmigration.lang.gel.gel.GelPackage";
	}
	
	public static class GenModelFile {
		public static String XBASE = "platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel";
		public static String ECORE = "platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel";
		public static String ECORE_GENMODEL = "platform:/resource/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel";
		public static String UML = "platform:/resource/org.eclipse.uml2.uml/model/UML.genmodel";
		public static String UML_GENMODEL = "platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel";
		public static String UML_TYPES = "platform:/resource/org.eclipse.uml2.types/model/Types.genmodel";
		public static String MARTE = "platform:/resource/org.eclipse.papyrus.marte.static.profile/resources/MARTE.genmodel";
		public static String VSL = "platform:/resource/org.eclipse.papyrus.marte.vsl/src/org/eclipse/papyrus/marte/vsl/VSL.genmodel";
		
		public static String NML = "platform:/resource/eu.artist.postmigration.lang.nml/model/generated/NML.genmodel";
		public static String TSL = "platform:/resource/eu.artist.postmigration.lang.tsl/model/generated/TSL.genmodel";
		public static String ESL = "platform:/resource/eu.artist.postmigration.lang.esl/model/generated/ESL.genmodel";
		public static String GML = "platform:/resource/eu.artist.postmigration.lang.gml/model/generated/GML.genmodel";
		public static String GEL = "platform:/resource/eu.artist.postmigration.lang.gel/model/generated/GEL.genmodel";
	}
	
	public static class NsUri {
		public static String UML = "http://www.eclipse.org/uml2/4.0.0/UML";
		public static String ECORE = "http://www.eclipse.org/emf/2002/Ecore";
		public static String MARTE = "http://www.eclipse.org/papyrus/MARTE/1";
		
		public static String NML = "http://www.artist.eu/postmigration/lang/nml/NML";
		public static String TSL = "http://www.artist.eu/postmigration/lang/tsl/TSL";
		public static String ESL = "http://www.artist.eu/postmigration/lang/esl/ESL";
		public static String GML = "http://www.artist.eu/postmigration/lang/gml/GML";
		public static String GEL = "http://www.artist.eu/postmigration/lang/gel/GEL";
	}
	
	public static class Uri {
		public static URI UML_PRIMITIVE_TYPES_LIBRARY_URI = 
				URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI);
		
		public static URI UML2_PROFILE_URI = 
				URI.createURI(UMLResource.UML2_PROFILE_URI);
		
		public static URI UML_METAMODEL_URI = 
				URI.createURI(UMLResource.UML_METAMODEL_URI);
		
		public static URI ECORE_METAMODEL_URI = 
				URI.createURI(UMLResource.ECORE_METAMODEL_URI);
		
		public static URI ECORE_PRIMITIVE_TYPES_LIBRARY_URI = 
				URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
		
		public static URI ECORE_PROFILE_URI = 
				URI.createURI(UMLResource.ECORE_PROFILE_URI);
		
		public static URI MARTE_LIBRARY_URI = 
				URI.createURI("pathmap://Papyrus_LIBRARIES/MARTE_Library.library.uml");
		
		public static URI NML_LIBRARY_URI =
				URI.createURI("pathmap://ARTIST_LIBRARIES/NFPcatalogue.nml");
		
		public static URI TSL_LIBRARY_URI =
				URI.createURI("pathmap://ARTIST_LIBRARIES/PatternCatalogue.tsl");
	}
	
//	public static final Set<URI> getGMLEditorLibraryURIs() {
//		LinkedHashSet<URI> uris = new LinkedHashSet<URI>();
//		uris.add(Uri.UML_PRIMITIVE_TYPES_LIBRARY_URI);
//		uris.add(Uri.UML2_PROFILE_URI);
//		uris.add(Uri.UML_METAMODEL_URI);
//		uris.add(Uri.ECORE_METAMODEL_URI);
//		uris.add(Uri.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
//		uris.add(Uri.ECORE_PROFILE_URI);
//		uris.add(Uri.MARTE_LIBRARY_URI);
//		return uris;
//	}
//		
//	public static final ResourceSet initGMLEditorLibraryResources(ResourceSet set) {
//		UMLResourcesUtil.init(set);
//		set.getResource(Uri.UML_PRIMITIVE_TYPES_LIBRARY_URI, true);
//		set.getResource(Uri.MARTE_LIBRARY_URI, true);
//		return set;
//	}
//	
//	public static final ResourceSet initGMLEditorLibraryResources() {
//		return initGMLEditorLibraryResources(new ResourceSetImpl());
//	}
}
