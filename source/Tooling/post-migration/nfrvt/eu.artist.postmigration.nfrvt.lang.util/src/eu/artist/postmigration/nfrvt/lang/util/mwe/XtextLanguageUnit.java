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
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * A XtextLanguageUnit encapsulates all necessary information to use one 
 * language in another language. This may include the Namespace URI, the
 * URI mappings, the generated EPackage and the GenModelFile.
 * <p/>
 * This class provides some static instances for the more often used
 * languages.
 * 
 * @author Martin Fleck
 *
 */
public class XtextLanguageUnit {
	/**
	 * Base for all ARTIST languages containing the Namespace URI, the URI 
	 * mappings, the generated EPackages and the GenModelFiles.
	 */
	protected static XtextLanguageUnit ARTIST_COMMON_UNIT = new XtextLanguageUnit();
	static {
		ARTIST_COMMON_UNIT = new XtextLanguageUnit();
		ARTIST_COMMON_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/common/ARTISTCommon");
		
		ARTIST_COMMON_UNIT.addUriMapping(
				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.common/model/generated/ARTISTCommon.ecore", 
				"platform:/resource/eu.artist.postmigration.nfrvt.lang.common/model/generated/ARTISTCommon.ecore");
		ARTIST_COMMON_UNIT.addUriMapping(
				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.common/model/generated/ARTISTCommon.genmodel",
				"platform:/resource/eu.artist.postmigration.nfrvt.lang.common/model/generated/ARTISTCommon.genmodel");
		
		
		ARTIST_COMMON_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage");

		ARTIST_COMMON_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.common/model/generated/ARTISTCommon.genmodel");
	}
	
	/**
	 * Ecore Unit containing the Namespace URI, the URI mappings, the generated
	 * EPackages and the GenModelFiles.
	 */
	protected static XtextLanguageUnit ECORE_UNIT = new XtextLanguageUnit();
	static {
		ECORE_UNIT = new XtextLanguageUnit();
		ECORE_UNIT.addNsUri("http://www.eclipse.org/emf/2002/Ecore");
		
		ECORE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore", 
				"platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore");
		ECORE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/Ecore.uml",
				"platform:/resource/org.eclipse.uml2.uml/model/Ecore.uml");
		ECORE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel",
				"platform:/resource/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel");
		ECORE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel",
				"platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel");
		
		ECORE_UNIT.addGeneratedEPackage("org.eclipse.emf.ecore.EcorePackage");
		ECORE_UNIT.addGeneratedEPackage("org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage");

		ECORE_UNIT.addGenModelFile("platform:/resource/org.eclipse.emf.ecore/model/Ecore.genmodel");
		ECORE_UNIT.addGenModelFile("platform:/resource/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel");
//		
//		ECORE_UNIT.addUri(UMLResource.ECORE_METAMODEL_URI);
//		ECORE_UNIT.addUri(UMLResource.ECORE_PROFILE_URI);
	}
	
	/**
	 * Ecore Primitive Types Library unit containing the library URI.
	 */
	protected static XtextLanguageUnit ECORE_TYPES_UNIT = new XtextLanguageUnit();
	static {
		ECORE_TYPES_UNIT = new XtextLanguageUnit();
		ECORE_TYPES_UNIT.addUri(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI);
	}
	
	/**
	 * UML Unit containing the Namespace URI, the URI mappings, the generated
	 * EPackages and the GenModelFiles.
	 */
	protected static XtextLanguageUnit UML_UNIT = new XtextLanguageUnit();
	static {
		UML_UNIT = new XtextLanguageUnit();
		UML_UNIT.addNsUri("http://www.eclipse.org/uml2/4.0.0/UML");
		
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore",
				"platform:/resource/org.eclipse.uml2.uml/model/UML.ecore");
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML30.ecore",
				"platform:/resource/org.eclipse.uml2.uml/model/UML.ecore");
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML.uml",
				"platform:/resource/org.eclipse.uml2.uml/model/UML.uml");
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.uml/model/UML.genmodel",
				"platform:/resource/org.eclipse.uml2.uml/model/UML.genmodel");
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel",
				"platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel");
		UML_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.codegen.ecore/model/GenModel.ecore",
				"platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.ecore");
		
		UML_UNIT.addGeneratedEPackage("org.eclipse.uml2.uml.UMLPackage");
		UML_UNIT.addGeneratedEPackage("org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage");

		UML_UNIT.addGenModelFile("platform:/resource/org.eclipse.uml2.uml/model/UML.genmodel");
		UML_UNIT.addGenModelFile("platform:/resource/org.eclipse.uml2.codegen.ecore/model/GenModel.genmodel");
		
//		UML_UNIT.addUri(UMLResource.UML_METAMODEL_URI);
//		UML_UNIT.addUri(UMLResource.UML2_PROFILE_URI);
	}
	
	/**
	 * Xtext Unit containing the Namespace URI, the URI mappings, the generated
	 * EPackages and the GenModelFiles.
	 */
	protected static XtextLanguageUnit UML_TYPES_UNIT = new XtextLanguageUnit();
	static {
		UML_TYPES_UNIT = new XtextLanguageUnit();
//		UML_TYPES_UNIT.addNsUri("http://www.eclipse.org/emf/2002/Ecore");
//		
		UML_TYPES_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.types/model/Types.ecore",
				"platform:/resource/org.eclipse.uml2.types/model/Types.ecore");
		UML_TYPES_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.types/model/Types.uml",
				"platform:/resource/org.eclipse.uml2.types/model/Types.uml");
		UML_TYPES_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.uml2.types/model/Types.genmodel",
				"platform:/resource/org.eclipse.uml2.types/model/Types.genmodel");
		
		UML_TYPES_UNIT.addGeneratedEPackage("org.eclipse.uml2.types.TypesPackage");
		UML_TYPES_UNIT.addGenModelFile("platform:/resource/org.eclipse.uml2.types/model/Types.genmodel");
//		UML_TYPES_UNIT.addUri(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI);
	}
	
	/**
	 * MARTE Profile Unit containing the Namespace URI, the URI mappings, the 
	 * generated EPackages and the GenModelFiles.
	 */
	protected static XtextLanguageUnit MARTE_UNIT = new XtextLanguageUnit();
	static {
		MARTE_UNIT = new XtextLanguageUnit();
		MARTE_UNIT.addNsUri("http://www.eclipse.org/papyrus/MARTE/1");
		
		MARTE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml",
				"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.profile.uml");
		MARTE_UNIT.addUriMapping(
				"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.ecore",
				"platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.ecore");
		
		MARTE_UNIT.addGeneratedEPackage("org.eclipse.papyrus.MARTE.MARTEPackage");

		MARTE_UNIT.addGenModelFile("platform:/plugin/org.eclipse.papyrus.marte.static.profile/resources/MARTE.genmodel");
		
		MARTE_UNIT.addUri(UMLResource.UML_METAMODEL_URI);
		MARTE_UNIT.addUri(UMLResource.UML2_PROFILE_URI);
	}
	
	/**
	 * MARTE Value Specification Language Unit containing the generated 
	 * EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit VSL_UNIT = new XtextLanguageUnit();
	static {		
		VSL_UNIT = new XtextLanguageUnit();
		VSL_UNIT.addGeneratedEPackage("org.eclipse.papyrus.marte.vsl.vSL.VSLPackage");
		VSL_UNIT.addGenModelFile("platform:/resource/org.eclipse.papyrus.marte.vsl/src/org/eclipse/papyrus/marte/vsl/VSL.genmodel");
	}
	
	/**
	 * Xbase Language Unit containing the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit XBASE_UNIT = new XtextLanguageUnit();
	static {	
		XBASE_UNIT = new XtextLanguageUnit();
		XBASE_UNIT.addGeneratedEPackage("org.eclipse.xtext.xbase.XbasePackage");
		XBASE_UNIT.addGenModelFile("platform:/resource/org.eclipse.xtext.xbase/model/Xbase.genmodel");
	}
	
	/**
	 * Property Specification Language Unit containing the the Namespace URI, 
	 * the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit NSL_UNIT = new XtextLanguageUnit();
	static {
		NSL_UNIT = new XtextLanguageUnit();
		NSL_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/nsl/NSL");
		
//		NSL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.nsl/model/generated/NSL.ecore",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.nsl/model/generated/NSL.ecore");
//		NSL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.nsl/model/generated/NSL.genmodel",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.nsl/model/generated/NSL.genmodel");
		
		NSL_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage");

		NSL_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.nsl/model/generated/NSL.genmodel");
	}
	
	/**
	 * Pattern Specification Language Unit containing the the Namespace URI, 
	 * the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit TSL_UNIT = new XtextLanguageUnit();
	static {
		TSL_UNIT = new XtextLanguageUnit();
		TSL_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/tsl/TSL");
		
//		TSL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.tsl/model/generated/TSL.ecore",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.tsl/model/generated/TSL.ecore");
//		TSL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.tsl/model/generated/TSL.genmodel",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.tsl/model/generated/TSL.genmodel");
		
		TSL_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage");

		TSL_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.tsl/model/generated/TSL.genmodel");
	}
	
	/**
	 * Evaluation Strategy Specification Language Unit containing the the 
	 * Namespace URI, the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit ESL_UNIT = new XtextLanguageUnit();
	static {
		ESL_UNIT = new XtextLanguageUnit();
		ESL_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/esl/ESL");
		
//		ESL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.esl/model/generated/ESL.ecore",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.esl/model/generated/ESL.ecore");
//		ESL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.esl/model/generated/ESL.genmodel",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.esl/model/generated/ESL.genmodel");
		
		ESL_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage");

		ESL_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.esl/model/generated/ESL.genmodel");
	}
	
	/**
	 * Goal Modeling Language Unit containing the the Namespace URI, 
	 * the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit GML_UNIT = new XtextLanguageUnit();
	static {
		GML_UNIT = new XtextLanguageUnit();
		GML_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/gml/GML");
		
//		GML_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.gml/model/generated/GML.ecore",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.gml/model/generated/GML.ecore");
//		GML_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.gml/model/generated/GML.genmodel",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.gml/model/generated/GML.genmodel");
		
		GML_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.gml.gml.GmlPackage");

		GML_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.gml/model/generated/GML.genmodel");
	}
	
	/**
	 * Goal Evaluation Language Unit containing the the Namespace URI, 
	 * the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit GEL_UNIT = new XtextLanguageUnit();
	static {
		GEL_UNIT = new XtextLanguageUnit();
		GEL_UNIT.addNsUri("http://www.artist.eu/postmigration/nfrvt/lang/gel/GEL");
		
//		GEL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.gel/model/generated/GEL.ecore",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.gel/model/generated/GEL.ecore");
//		GEL_UNIT.addUriMapping(
//				"platform:/plugin/eu.artist.postmigration.nfrvt.lang.gel/model/generated/GEL.genmodel",
//				"platform:/resource/eu.artist.postmigration.nfrvt.lang.gel/model/generated/GEL.genmodel");
		
		GEL_UNIT.addGeneratedEPackage("eu.artist.postmigration.nfrvt.lang.gel.gel.GelPackage");

		GEL_UNIT.addGenModelFile("platform:/resource/eu.artist.postmigration.nfrvt.lang.gel/model/generated/GEL.genmodel");
	}
	
	/**
	 * Xtext JavaVMTypes Language Unit containing the the Namespace URI, 
	 * the generated EPackage and the GenModelFile.
	 */
	protected static XtextLanguageUnit JVMTYPES_UNIT = new XtextLanguageUnit();
	static {
		JVMTYPES_UNIT = new XtextLanguageUnit();
		JVMTYPES_UNIT.addNsUri("http://www.eclipse.org/xtext/common/JavaVMTypes");
		
//		JVMTYPES_UNIT.addUriMapping(
//				"platform:/plugin/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore",
//				"platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.ecore");
//		JVMTYPES_UNIT.addUriMapping(
//				"platform:/plugin/org.eclipse.xtext.common.types/model/JavaVMTypes.genmodel",
//				"platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.genmodel");
//		
		JVMTYPES_UNIT.addGeneratedEPackage("org.eclipse.xtext.common.types.TypesPackage");

		JVMTYPES_UNIT.addGenModelFile("platform:/resource/org.eclipse.xtext.common.types/model/JavaVMTypes.genmodel");
	}
	
	private List<String> nsUris = new ArrayList<String>();
	private List<URI> uris = new ArrayList<URI>();
	private List<Mapping> uriMappings = new ArrayList<Mapping>();
	private List<String> generatedEPackages = new ArrayList<String>();
	private List<String> genModelFiles = new ArrayList<String>();
	
	public XtextLanguageUnit() {
	}
	
	public XtextLanguageUnit(XtextLanguageUnit unit) {
		this.nsUris.addAll(unit.getNsUris());
		this.uris.addAll(unit.getUris());
		this.uriMappings.addAll(unit.getUriMappings());
		this.generatedEPackages.addAll(unit.getGeneratedEPackages());
		this.genModelFiles.addAll(unit.getGenModelFiles());
	}
	
	public List<String> getNsUris() {
		return nsUris;
	}
	
	public List<URI> getUris() {
		return uris;
	}
	
	public List<Mapping> getUriMappings() {
		return uriMappings;
	}
	
	public List<String> getGeneratedEPackages() {
		return generatedEPackages;
	}
	
	public List<String> getGenModelFiles() {
		return genModelFiles;
	}
	
	public void addNsUri(String nsUri) {
		nsUris.add(nsUri);
	}
	
	public void addUri(String uri) {
		addUri(URI.createURI(uri));
	}
	
	public void addUri(URI uri) {
		uris.add(uri);
	}
	
	public void addUriMapping(String from, String to) {
		uriMappings.add(new Mapping(from, to));
	}
	
	public void addUriMapping(Mapping mapping) {
		uriMappings.add(mapping);
	}
	
	public void addGeneratedEPackage(String generatedEPackage) {
		generatedEPackages.add(generatedEPackage);
	}
	
	public void addGenModelFile(String genModelFile) {
		genModelFiles.add(genModelFile);
	}
}
