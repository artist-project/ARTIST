/*******************************************************************************
 * Copyright (c) 2014 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *    
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/
package eu.artist.reusevol.repo.common.util;

import java.util.Iterator;

import com.google.common.base.Splitter;

/**
 * Represents the ID of an artefact that is composed of the PackageName,
 * ArtefactName and the Version.
 * 
 * @author strauss
 * 
 */
public class ArtefactId {
	private PackageName packagePart;
	private ArtefactName artefactPart;
	private Version versionPart;

	/**
	 * Identifies an artefact. Format is:
	 * 
	 * [packageId]![artefactId]![versionId]
	 * 
	 * Example:
	 * 
	 * eu.artist.uc.dews!gwt-profile!1.0.0
	 * 
	 * @param packageId
	 * @param artefactId
	 * @param versionId
	 */
	private ArtefactId(PackageName packageId, ArtefactName artefactId,
			Version versionId) {
		this.packagePart = packageId;
		this.artefactPart = artefactId;
		this.versionPart = versionId;
	}

	public static ArtefactId of(String fullId) {
		PackageName pack;
		ArtefactName prj;
		Version v;
		Iterator<String> segments = Splitter.on("!").split(fullId).iterator();
		if (segments.hasNext()) {
			pack = PackageName.of(segments.next());
		} else {
			throw new IllegalArgumentException(
					"Invalid or missing package id in '" + fullId + "'.");
		}
		if (segments.hasNext()) {
			prj = ArtefactName.of(segments.next());
		} else {
			throw new IllegalArgumentException(
					"Invalid or missing artefactPart id in '" + fullId + "'.");
		}
		if (segments.hasNext()) {
			v = Version.of(segments.next());
		} else {
			return ArtefactId.of(pack, prj);
		}
		return ArtefactId.of(pack, prj, v);
	}

	public static ArtefactId of(PackageName packageId, ArtefactName artefactId,
			Version versionId) {
		return new ArtefactId(packageId, artefactId, versionId);
	}

	public static ArtefactId of(PackageName packageId, ArtefactName artefactId) {
		return new ArtefactId(packageId, artefactId, Version.HEAD);
	}

	public static ArtefactId of(String packageId, String artefactId,
			String versionId) {
		return new ArtefactId(PackageName.of(packageId),
				ArtefactName.of(artefactId), Version.of(versionId));
	}

	public static ArtefactId of(String packageId, String artefactId) {
		return new ArtefactId(PackageName.of(packageId),
				ArtefactName.of(artefactId), Version.HEAD);
	}

	/**
	 * @return the packagePart
	 */
	public PackageName getPackagePart() {
		return packagePart;
	}

	/**
	 * @return the artefactPart
	 */
	public ArtefactName getArtefactPart() {
		return artefactPart;
	}

	/**
	 * @return the versionPart
	 */
	public Version getVersionPart() {
		return versionPart;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(packagePart.getName()).append("!")
				.append(artefactPart.toString());
		if (versionPart.equals(Version.HEAD)) {
			builder.append("!HEAD");
		} else {
			builder.append("!").append(versionPart.toString());
		}
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((artefactPart == null) ? 0 : artefactPart.hashCode());
		result = prime * result
				+ ((packagePart == null) ? 0 : packagePart.hashCode());
		result = prime * result
				+ ((versionPart == null) ? 0 : versionPart.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ArtefactId))
			return false;
		ArtefactId other = (ArtefactId) obj;
		if (artefactPart == null) {
			if (other.artefactPart != null)
				return false;
		} else if (!artefactPart.equals(other.artefactPart))
			return false;
		if (packagePart == null) {
			if (other.packagePart != null)
				return false;
		} else if (!packagePart.equals(other.packagePart))
			return false;
		if (versionPart == null) {
			if (other.versionPart != null)
				return false;
		} else if (!versionPart.equals(other.versionPart))
			return false;
		return true;
	}
}
