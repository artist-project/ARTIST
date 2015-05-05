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
public class PackageName extends CompositeRepoName {

	protected PackageName(String name) {
		super(name, ".");
	}

	protected PackageName(List<String> segments) {
		super(segments, ".");
	}

	public static PackageName of(String name) {
		return new PackageName(name);
	}

	public static PackageName ofUri(String fragment) {
		return new PackageName(decomposeName(fragment, "/"));
	}

	public static PackageName ofList(List<String> segments) {
		return new PackageName(segments);
	}

	public static PackageName emptyName() {
		return PackageName.ofList(new ArrayList<String>());
	}

	public PackageName getParent() {
		if (getSegments().size() <= 1) {
			return PackageName.emptyName();
		}
		List<String> parentSegments = getSegments().subList(0,
				getSegments().size() - 1);
		return new PackageName(parentSegments);
	}
}
