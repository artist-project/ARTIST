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

import java.util.List;

/**
 * Represents classes that have ids that are composed of several segments (like
 * e.g. Artefacts).
 * 
 * @author strauss
 * 
 * @param <T>
 */
public interface CompositeNameProvider<T> extends NameProvider<T> {
	public List<String> getNameSegments();
}
