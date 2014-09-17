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

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.utils.Mapping;

/**
 * This class is a single point of configuration for the standalone setup of
 * the ARTIST migration languages used in modeling workflow files (mwe).
 * <p/>
 * Often used packages and libraries as well as the ARTIST language packages
 * can be simply included by specifying the respective boolean flag.
 * 
 * @author Martin Fleck
 * @see ARTISTStandaloneSetup
 */
public class ARTISTStandaloneUsageDependencies {
	
	public ARTISTStandaloneUsageDependencies() {
//		artistCommon = true;
		ecore = true;
	}
	
	private boolean artistCommon;
	
	private boolean ecore;
	private boolean ecoreTypes;
	
	private boolean uml;
	private boolean umlTypes;
	
	private boolean marte;
	
	private boolean vsl;
	private boolean xBase;
	
	private boolean nsl;
	private boolean tsl;
	private boolean esl;
	private boolean gml;
	private boolean gel;
	
	private boolean jvmTypes;
	
	/**
	 * Return true if the {@link XtextLanguageUnit#ARTIST_COMMON_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#ARTIST_COMMON_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isArtistCommon() {
		return artistCommon;
	}
	
	/**
	 * Adds/Removes the {@link XtextLanguageUnit#ARTIST_COMMON_UNIT} unit 
	 * to/from this setup.
	 * @param artistCommon if true, the necessary dependencies will be added.
	 */
	public void setArtistCommon(boolean artistCommon) {
		this.artistCommon = artistCommon;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#ECORE_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#ECORE_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isEcore() {
		return ecore;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#ECORE_UNIT} unit 
	 * to/from this setup.
	 * @param ecore if true, the necessary dependencies will be added.
	 */
	public void setEcore(boolean ecore) {
		this.ecore = ecore;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#ECORE_TYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#ECORE_TYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isEcoreTypes() {
		return ecoreTypes;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#ECORE_TYPES_UNIT} unit 
	 * to/from this setup.
	 * @param ecoreTypes if true, the necessary dependencies will be added.
	 */
	public void setEcoreTypes(boolean ecoreTypes) {
		this.ecoreTypes = ecoreTypes;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#UML_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#UML_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isUml() {
		return uml;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#UML_UNIT} unit 
	 * to/from this setup.
	 * @param uml if true, the necessary dependencies will be added.
	 */
	public void setUml(boolean uml) {
		this.uml = uml;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#UML_TYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#UML_TYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isUmlTypes() {
		return umlTypes;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#UML_TYPES_UNIT} unit 
	 * to/from this setup.
	 * @param umlTypes if true, the necessary dependencies will be added.
	 */
	public void setUmlTypes(boolean umlTypes) {
		this.umlTypes = umlTypes;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#MARTE_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#MARTE_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isMarte() {
		return marte;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#MARTE_UNIT} unit 
	 * to/from this setup.
	 * @param marte if true, the necessary dependencies will be added.
	 */
	public void setMarte(boolean marte) {
		this.marte = marte;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#VSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#VSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isVsl() {
		return vsl;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#VSL_UNIT} unit 
	 * to/from this setup.
	 * @param vsl if true, the necessary dependencies will be added.
	 */
	public void setVsl(boolean vsl) {
		this.vsl = vsl;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#XBASE_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#XBASE_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isXBase() {
		return xBase;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#XBASE_UNIT} unit 
	 * to/from this setup.
	 * @param xBase if true, the necessary dependencies will be added.
	 */
	public void setXBase(boolean xBase) {
		this.xBase = xBase;
	}

	/**
	 * Return true if the {@link XtextLanguageUnit#NSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#NSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isNsl() {
		return nsl;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#NSL_UNIT} unit 
	 * to/from this setup.
	 * @param nsl if true, the necessary dependencies will be added.
	 */
	public void setNsl(boolean nsl) {
		this.nsl = nsl;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#TSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#TSL_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isTsl() {
		return tsl;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#TSL_UNIT} unit 
	 * to/from this setup.
	 * @param tsl if true, the necessary dependencies will be added.
	 */
	public void setTsl(boolean tsl) {
		this.tsl = tsl;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#ESL_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#ESL_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isEsl() {
		return esl;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#ESL_UNIT} unit 
	 * to/from this setup.
	 * @param esl if true, the necessary dependencies will be added.
	 */
	public void setEsl(boolean esl) {
		this.esl = esl;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#GML_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#GML_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isGml() {
		return gml;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#GML_UNIT} unit 
	 * to/from this setup.
	 * @param gml if true, the necessary dependencies will be added.
	 */
	public void setGml(boolean gml) {
		this.gml = gml;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#GEL_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#GEL_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isGel() {
		return gel;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#GEL_UNIT} unit 
	 * to/from this setup.
	 * @param gel if true, the necessary dependencies will be added.
	 */
	public void setGel(boolean gel) {
		this.gel = gel;
	}
	
	/**
	 * Return true if the {@link XtextLanguageUnit#JVMTYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 * @return true if the {@link XtextLanguageUnit#JVMTYPES_UNIT} unit
	 * is added in this setup, false otherwise.
	 */
	public boolean isJvmTypes() {
		return jvmTypes;
	}

	/**
	 * Adds/Removes the {@link XtextLanguageUnit#JVMTYPES_UNIT} unit 
	 * to/from this setup.
	 * @param jvmTypes if true, the necessary dependencies will be added.
	 */
	public void setJvmTypes(boolean jvmTypes) {
		this.jvmTypes = jvmTypes;
	}

	/**
	 * Returns all {@link Mapping}s from the added {@link XtextLanguageUnit}s.
	 * @return all mappings from the added language units.
	 */
	public Collection<Mapping> getMappings() {
		List<Mapping> mappings = new ArrayList<Mapping>();
		if(isArtistCommon())
			mappings.addAll(XtextLanguageUnit.ARTIST_COMMON_UNIT.getUriMappings());
		if(isEcore())
			mappings.addAll(XtextLanguageUnit.ECORE_UNIT.getUriMappings());
		if(isEcoreTypes())
			mappings.addAll(XtextLanguageUnit.ECORE_TYPES_UNIT.getUriMappings());
		if(isUml())
			mappings.addAll(XtextLanguageUnit.UML_UNIT.getUriMappings());
		if(isUmlTypes())
			mappings.addAll(XtextLanguageUnit.UML_TYPES_UNIT.getUriMappings());
		if(isMarte())
			mappings.addAll(XtextLanguageUnit.MARTE_UNIT.getUriMappings());
		if(isVsl())
			mappings.addAll(XtextLanguageUnit.VSL_UNIT.getUriMappings());
		if(isXBase())
			mappings.addAll(XtextLanguageUnit.XBASE_UNIT.getUriMappings());
		if(isNsl())
			mappings.addAll(XtextLanguageUnit.NSL_UNIT.getUriMappings());
		if(isTsl())
			mappings.addAll(XtextLanguageUnit.TSL_UNIT.getUriMappings());
		if(isEsl())
			mappings.addAll(XtextLanguageUnit.ESL_UNIT.getUriMappings());
		if(isGml())
			mappings.addAll(XtextLanguageUnit.GML_UNIT.getUriMappings());
		if(isGel())
			mappings.addAll(XtextLanguageUnit.GEL_UNIT.getUriMappings());
		if(isJvmTypes())
			mappings.addAll(XtextLanguageUnit.JVMTYPES_UNIT.getUriMappings());
		
		return mappings;	
	}
	
	/**
	 * Returns all generated {@link EPackage}s from the added 
	 * {@link XtextLanguageUnit}s.
	 * @return all generated {@link EPackage}s from the added 
	 * {@link XtextLanguageUnit}s.
	 */
	public Collection<String> getGeneratedEPackages() {
		List<String> mappings = new ArrayList<String>();
		if(isArtistCommon())
			mappings.addAll(XtextLanguageUnit.ARTIST_COMMON_UNIT.getGeneratedEPackages());
		if(isEcore())
			mappings.addAll(XtextLanguageUnit.ECORE_UNIT.getGeneratedEPackages());
		if(isEcoreTypes())
			mappings.addAll(XtextLanguageUnit.ECORE_TYPES_UNIT.getGeneratedEPackages());
		if(isUml())
			mappings.addAll(XtextLanguageUnit.UML_UNIT.getGeneratedEPackages());
		if(isUmlTypes())
			mappings.addAll(XtextLanguageUnit.UML_TYPES_UNIT.getGeneratedEPackages());
		if(isMarte())
			mappings.addAll(XtextLanguageUnit.MARTE_UNIT.getGeneratedEPackages());
		if(isVsl())
			mappings.addAll(XtextLanguageUnit.VSL_UNIT.getGeneratedEPackages());
		if(isXBase())
			mappings.addAll(XtextLanguageUnit.XBASE_UNIT.getGeneratedEPackages());
		if(isNsl())
			mappings.addAll(XtextLanguageUnit.NSL_UNIT.getGeneratedEPackages());
		if(isTsl())
			mappings.addAll(XtextLanguageUnit.TSL_UNIT.getGeneratedEPackages());
		if(isEsl())
			mappings.addAll(XtextLanguageUnit.ESL_UNIT.getGeneratedEPackages());
		if(isGml())
			mappings.addAll(XtextLanguageUnit.GML_UNIT.getGeneratedEPackages());
		if(isGel())
			mappings.addAll(XtextLanguageUnit.GEL_UNIT.getGeneratedEPackages());
		if(isJvmTypes())
			mappings.addAll(XtextLanguageUnit.JVMTYPES_UNIT.getGeneratedEPackages());
		
		return mappings;	
	}
	
	/**
	 * Returns all GenModelFile locations from the added 
	 * {@link XtextLanguageUnit}s.
	 * @return all GenModelFile locations from the added 
	 * {@link XtextLanguageUnit}s.
	 */
	public Collection<String> getGenModelFiles() {
		List<String> mappings = new ArrayList<String>();
		if(isArtistCommon())
			mappings.addAll(XtextLanguageUnit.ARTIST_COMMON_UNIT.getGenModelFiles());
		if(isEcore())
			mappings.addAll(XtextLanguageUnit.ECORE_UNIT.getGenModelFiles());
		if(isEcoreTypes())
			mappings.addAll(XtextLanguageUnit.ECORE_TYPES_UNIT.getGenModelFiles());
		if(isUml())
			mappings.addAll(XtextLanguageUnit.UML_UNIT.getGenModelFiles());
		if(isUmlTypes())
			mappings.addAll(XtextLanguageUnit.UML_TYPES_UNIT.getGenModelFiles());
		if(isMarte())
			mappings.addAll(XtextLanguageUnit.MARTE_UNIT.getGenModelFiles());
		if(isVsl())
			mappings.addAll(XtextLanguageUnit.VSL_UNIT.getGenModelFiles());
		if(isXBase())
			mappings.addAll(XtextLanguageUnit.XBASE_UNIT.getGenModelFiles());
		if(isNsl())
			mappings.addAll(XtextLanguageUnit.NSL_UNIT.getGenModelFiles());
		if(isTsl())
			mappings.addAll(XtextLanguageUnit.TSL_UNIT.getGenModelFiles());
		if(isEsl())
			mappings.addAll(XtextLanguageUnit.ESL_UNIT.getGenModelFiles());
		if(isGml())
			mappings.addAll(XtextLanguageUnit.GML_UNIT.getGenModelFiles());
		if(isGel())
			mappings.addAll(XtextLanguageUnit.GEL_UNIT.getGenModelFiles());
		if(isJvmTypes())
			mappings.addAll(XtextLanguageUnit.JVMTYPES_UNIT.getGenModelFiles());
		
		return mappings;	
	}
}
