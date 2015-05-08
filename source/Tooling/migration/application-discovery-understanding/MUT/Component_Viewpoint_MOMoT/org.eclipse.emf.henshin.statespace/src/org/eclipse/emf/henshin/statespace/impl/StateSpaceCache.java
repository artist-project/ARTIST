/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.statespace.impl;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.henshin.statespace.StateSpaceManager;

/**
 * A universal cache for state spaces.
 * @author Christian Krause
 *
 * @param <K> Keys
 * @param <V> Values
 */
class StateSpaceCache<K,V> extends LinkedHashMap<K,V> {

	// Default cache size, estimated with maximum number of MB of free memory:
	public static final int DEFAULT_CACHE_SIZE;
	
	static {
		if (StateSpaceManager.DEBUG_ENFORCE_DETERMINISM) {
			DEFAULT_CACHE_SIZE = 1024; 
		} else {
			DEFAULT_CACHE_SIZE = (int) (Runtime.getRuntime().maxMemory() / 1024 / 1024);
		}
	}
	
	// Serial id:
	private static final long serialVersionUID = 1L;

	// Cache size:
	private final int cacheSize;
	
	/**
	 * Constructor.
	 * @param cacheSize Cache size.
	 */
	public StateSpaceCache(int cacheSize) {
		this.cacheSize = cacheSize;
	}
	
	/**
	 * Constructor. Uses {@link #DEFAULT_CACHE_SIZE}.
	 */
	public StateSpaceCache() {
		this(DEFAULT_CACHE_SIZE);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
	 */
	@Override
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
		return size() > cacheSize;
	}
	
}