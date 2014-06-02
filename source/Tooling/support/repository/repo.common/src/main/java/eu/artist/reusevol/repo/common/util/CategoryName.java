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
import java.util.List;

/**
 * This class represents a logical name expression composed of segments that can
 * contain alpha-numeric characters, underscores and dashes that are separated
 * by dots. Example: a2.b-1.C_2 a
 * 
 * @author strauss
 * 
 */
public class CategoryName extends CompositeRepoName {

	private CategoryName(String name) {
		super(name, ".");
	}

	private CategoryName(List<String> segments) {
		super(segments, ".");
	}

	public static CategoryName of(String name) {
		return new CategoryName(name);
	}

	public static CategoryName ofUri(String fragment) {
		return new CategoryName(decomposeName(fragment, "/"));
	}

	public static CategoryName ofList(List<String> segments) {
		return new CategoryName(segments);
	}

	public String asUri() {
		return getName("/");
	}

	public static CategoryName emptyName() {
		return CategoryName.ofList(new ArrayList<String>());
	}

	public CategoryName getParent() {
		if (getSegments().size() <= 1) {
			return CategoryName.emptyName();
		}
		List<String> parentSegments = getSegments().subList(0,
				getSegments().size() - 1);
		return new CategoryName(parentSegments);
	}
}
