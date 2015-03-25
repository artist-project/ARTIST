/**
 * <copyright>
 * Copyright (c) 2010-2014 Henshin developers. All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipse.emf.henshin.provider.util;

import org.eclipse.emf.henshin.model.Graph;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Unit;

/**
 * Utility class that provides static helper methods for:
 * <ul>
 * <li>generate names for nodes</li>
 * <li>generate names for rules</li>
 * </ul>
 * 
 * @author Gregor Bonifer
 * @author Stefan Jurack (sjurack)
 */
public abstract class HenshinNameUtil {
	
	protected static final int INITIAL_INDEX = 1;
	
	private static final String PREFIX_NODE = "node";
	private static final String PREFIX_RULE = "rule";
	
	protected HenshinNameUtil() {
	}
	
	/**
	 * Looks up the max Integer-parsable name and returns the next higher
	 * Integer value as the new name
	 */
	public static String generateNewNodeName(Graph graph) {
		int max = INITIAL_INDEX;
		for (Node node : graph.getNodes()) {
			String name = node.getName();
			name = name != null ? name : "";
			if (name.startsWith(PREFIX_NODE)) {
				try {
					int tmp = Integer.parseInt(name.substring(PREFIX_NODE.length()));
					if (tmp > max) {
						max = tmp;
					}
				} catch (Exception e) {
					continue;
				}
			}
		}
		return PREFIX_NODE + (++max);
	}
	
	/**
	 * Looks up the max Integer-parsable name and returns the next higher
	 * Integer value as the new name
	 */
	public static String generateNewUnitName(Module module) {
		int max = INITIAL_INDEX;
		for (Unit unit : module.getUnits()) {
			String name = unit.getName();
			name = name != null ? name : "";
			if (name.startsWith(PREFIX_RULE)) {
				try {
					int tmp = Integer.parseInt(name.substring(PREFIX_RULE.length()));
					if (tmp > max) {
						max = tmp;
					}
				} catch (Exception e) {
					continue;
				}
			}
		}
		return PREFIX_RULE + (++max);
	}
	
}
