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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

/**
 * This class represents the name of some repository element and checks its
 * format. With the default settings names can consist of alphanumeric
 * characters, ".", "-" and "_".
 * 
 * @author strauss
 * 
 */
public class CompositeRepoName extends RepoName {

	private final String separator;
	private final List<String> segments;

	public static List<String> decomposeName(String inputPath, String splitChar) {
		return Splitter.on(splitChar).omitEmptyStrings().splitToList(inputPath);
	}

	public static String composeName(List<String> segments, String splitChar) {
		List<String> copy = new ArrayList<String>(segments);
		copy.remove("");
		return Joiner.on(splitChar).skipNulls().join(copy);
	}

	protected CompositeRepoName(String compositeName, String separator) {
		super(trimSeparator(compositeName, separator), false);
		this.segments = decomposeName(compositeName, separator);
		this.separator = separator;
		if (!isValidComposite())
			throw new IllegalArgumentException(
					String.format(
							"One of the name segments %s contains illegal characters. Only alpha-numeric characters, '_' and '-' are allowed.",
							segments.toString()));
	}

	private static String trimSeparator(final String name,
			final String separator) {
		String result = new String(name);
		while (result.startsWith(separator)) {
			result = result.substring(1);
		}
		while (result.endsWith(separator)) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}

	protected CompositeRepoName(List<String> segments, String separator) {
		this(composeName(segments, separator), separator);
	}

	@Override
	protected String getRejectionPattern() {
		return "[^a-z0-9_\\-]";
	}

	public String getSeparator() {
		return separator;
	}

	public List<String> getSegments() {
		return Collections.unmodifiableList(segments);
	}

	public String getName(String splitChar) {
		return composeName(segments, splitChar);
	}

	// @Override
	private boolean isValidComposite() {
		boolean valid = true;
		for (String segment : segments) {
			valid = valid && super.isValid(segment);
		}
		return valid;
	}
}
