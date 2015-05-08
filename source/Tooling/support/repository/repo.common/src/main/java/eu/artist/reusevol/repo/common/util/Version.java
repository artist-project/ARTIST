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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Strings;

/**
 * Represents a version label in the repository.
 * 
 * @author strauss
 * 
 */
public class Version {
	public static final Version HEAD = Version.of(Integer.MAX_VALUE,
			Integer.MAX_VALUE, Integer.MAX_VALUE, "HEAD");

	private final int patch;
	private final int minor;
	private final int major;
	private final String variant;

	/**
	 * Represents a version number. The string representation has the following
	 * format:
	 * 
	 * [major].[minor].[patch]-[variant]
	 * 
	 * where major, minor and patch are integer values and variant is a string
	 * that is built of alpha-numeric characters and "_".
	 * 
	 * @param major
	 * @param minor
	 * @param patch
	 * @param variant
	 */
	private Version(int major, int minor, int patch, String variant) {
		if ((variant != null) && !isValid(variant)) {
			throw new IllegalArgumentException(
					"Invalid version variant. "
							+ "Variants can consist only of alphanumeric characters and '_'.");
		}

		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.variant = variant;
	}

	public static boolean isValid(String variant) {
		Pattern allowedPattern = Pattern.compile("[^a-z0-9_]",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = allowedPattern.matcher(variant);
		boolean illegalCharFound = matcher.find();
		return !illegalCharFound;
	}

	public static Version of(int major, int minor, int patch, String variant) {
		return new Version(major, minor, patch, variant);
	}

	public static Version of(int major, int minor, int patch) {
		return new Version(major, minor, patch, null);
	}

	public static Version of(String version) {
		return parseString(version);
	}

	private static Version parseString(String version) {
		if (version.equalsIgnoreCase("HEAD"))
			return HEAD;

		Pattern allowedPattern = Pattern.compile(
				"(\\d+)\\.(\\d+)\\.(\\d+)(-[^a-z0-9_]+)?",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = allowedPattern.matcher(version);
		int n1 = Integer.parseInt(matcher.group(1));
		int n2 = Integer.parseInt(matcher.group(2));
		int n3 = Integer.parseInt(matcher.group(3));
		String v = matcher.group(4);
		return new Version(n1, n2, n3, v);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(major).append(".").append(minor).append(".")
				.append(patch);
		if (!Strings.isNullOrEmpty(variant)) {
			builder.append("-").append(variant);
		}
		return builder.toString();
	}

	/**
	 * @return the patch
	 */
	public int getPatch() {
		return patch;
	}

	/**
	 * @return the minor
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * @return the major
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * @return the variant
	 */
	public String getVariant() {
		return variant;
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
		result = prime * result + major;
		result = prime * result + minor;
		result = prime * result + patch;
		result = prime * result + ((variant == null) ? 0 : variant.hashCode());
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
		if (!(obj instanceof Version))
			return false;
		Version other = (Version) obj;
		if (major != other.major)
			return false;
		if (minor != other.minor)
			return false;
		if (patch != other.patch)
			return false;
		if (variant == null) {
			if (other.variant != null)
				return false;
		} else if (!variant.equals(other.variant))
			return false;
		return true;
	}
}
