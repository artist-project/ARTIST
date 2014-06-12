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

import org.eclipse.emf.mwe.utils.Mapping;


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
	private boolean marteLibrary;
	
	private boolean vsl;
	private boolean xBase;
	
	private boolean nsl;
	private boolean tsl;
	private boolean esl;
	private boolean gml;
	private boolean gel;
	
	private boolean jvmTypes;
	
	public boolean isArtistCommon() {
		return artistCommon;
	}

	public void setArtistCommon(boolean artistCommon) {
		this.artistCommon = artistCommon;
	}
	
	public boolean isEcore() {
		return ecore;
	}

	public void setEcore(boolean ecore) {
		this.ecore = ecore;
	}

	public boolean isEcoreTypes() {
		return ecoreTypes;
	}

	public void setEcoreTypes(boolean ecoreTypes) {
		this.ecoreTypes = ecoreTypes;
	}

	public boolean isUml() {
		return uml;
	}

	public void setUml(boolean uml) {
		this.uml = uml;
	}

	public boolean isUmlTypes() {
		return umlTypes;
	}

	public void setUmlTypes(boolean umlTypes) {
		this.umlTypes = umlTypes;
	}

	public boolean isMarte() {
		return marte;
	}

	public void setMarte(boolean marte) {
		this.marte = marte;
	}

	public boolean isMarteLibrary() {
		return marteLibrary;
	}

	public void setMarteLibrary(boolean marteLibrary) {
		this.marteLibrary = marteLibrary;
	}

	public boolean isVsl() {
		return vsl;
	}

	public void setVsl(boolean vsl) {
		this.vsl = vsl;
	}

	public boolean isXBase() {
		return xBase;
	}

	public void setXBase(boolean xBase) {
		this.xBase = xBase;
	}

	public boolean isNsl() {
		return nsl;
	}

	public void setNsl(boolean nsl) {
		this.nsl = nsl;
	}
	
	public boolean isTsl() {
		return tsl;
	}

	public void setTsl(boolean tsl) {
		this.tsl = tsl;
	}
	
	public boolean isEsl() {
		return esl;
	}

	public void setEsl(boolean esl) {
		this.esl = esl;
	}
	
	public boolean isGml() {
		return gml;
	}

	public void setGml(boolean gml) {
		this.gml = gml;
	}
	
	public boolean isGel() {
		return gel;
	}

	public void setGel(boolean gel) {
		this.gel = gel;
	}
	
	public boolean isJvmTypes() {
		return jvmTypes;
	}

	public void setJvmTypes(boolean jvmTypes) {
		this.jvmTypes = jvmTypes;
	}

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
		if(isMarteLibrary())
			mappings.addAll(XtextLanguageUnit.MARTE_LIBRARY_UNIT.getUriMappings());
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
		if(isMarteLibrary())
			mappings.addAll(XtextLanguageUnit.MARTE_LIBRARY_UNIT.getGeneratedEPackages());
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
		if(isMarteLibrary())
			mappings.addAll(XtextLanguageUnit.MARTE_LIBRARY_UNIT.getGenModelFiles());
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
