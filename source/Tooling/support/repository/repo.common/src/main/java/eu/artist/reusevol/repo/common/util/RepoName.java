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
 * This class represents the name of some repository element and checks its
 * format. With the default settings names can consist of alphanumeric
 * characters, ".", "-" and "_".
 * 
 * @author strauss
 * 
 */
public abstract class RepoName {
	private static final String REJECTION_PATTERN = "[^a-z0-9_\\-\\.]";

	private final String name;

	protected RepoName(String name, boolean doCheck) {
		this.name = name;
		if (doCheck && !isValid(name)) {
			throw new IllegalArgumentException("Invalid name '" + name + "'. "
					+ getFormatDescription());
		}
	}

	protected String getRejectionPattern() {
		return REJECTION_PATTERN;
	}

	protected String getFormatDescription() {
		return "RepoNames can consist only of alphanumeric characters, '-' and '_'.";
	}

	protected boolean isValid(String name) {
		if (Strings.isNullOrEmpty(name))
			return false;

		Pattern allowedPattern = Pattern.compile(getRejectionPattern(),
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = allowedPattern.matcher(name);
		boolean illegalCharFound = matcher.find();
		return !illegalCharFound;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof RepoName))
			return false;
		RepoName other = (RepoName) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
